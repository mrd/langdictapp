package com.langdict

import com.langdict.api.RetrofitClient
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class DictionaryRepositoryNew {

    private val apiService = RetrofitClient.apiService
    private val offlineRepository = DictionaryRepository() // Keep offline fallback

    suspend fun search(query: String): List<DictionaryEntry> = withContext(Dispatchers.IO) {
        if (query.isBlank()) {
            return@withContext emptyList()
        }

        try {
            // Try API first for both directions
            val results = mutableListOf<DictionaryEntry>()

            // Try English to Spanish
            try {
                val enToEsResponse = apiService.translate(query, "en|es")
                val enToEsEntry = parseApiResponse(query, Language.ENGLISH, enToEsResponse.responseData?.translatedText, enToEsResponse.matches)
                if (enToEsEntry != null) {
                    results.add(enToEsEntry)
                }
            } catch (e: Exception) {
                // Continue to try Spanish to English
            }

            // Try Spanish to English
            try {
                val esToEnResponse = apiService.translate(query, "es|en")
                val esToEnEntry = parseApiResponse(query, Language.SPANISH, esToEnResponse.responseData?.translatedText, esToEnResponse.matches)
                if (esToEnEntry != null) {
                    results.add(esToEnEntry)
                }
            } catch (e: Exception) {
                // Continue
            }

            // If API returned results, use them
            if (results.isNotEmpty()) {
                return@withContext results
            }

            // Fallback to offline dictionary
            offlineRepository.search(query)

        } catch (e: Exception) {
            // On any error, fallback to offline dictionary
            offlineRepository.search(query)
        }
    }

    private fun parseApiResponse(
        originalQuery: String,
        sourceLanguage: Language,
        mainTranslation: String?,
        matches: List<com.langdict.api.Match>?
    ): DictionaryEntry? {
        val translations = mutableListOf<Translation>()

        // Add main translation
        if (mainTranslation != null && mainTranslation.isNotBlank()) {
            translations.add(
                Translation(
                    translation = mainTranslation,
                    partOfSpeech = PartOfSpeech.UNKNOWN,
                    definition = "Translation from ${if (sourceLanguage == Language.ENGLISH) "English to Spanish" else "Spanish to English"}"
                )
            )
        }

        // Add alternative translations from matches
        matches?.take(5)?.forEach { match ->
            if (match.translation != null &&
                match.translation.isNotBlank() &&
                !translations.any { it.translation.equals(match.translation, ignoreCase = true) }) {

                val quality = match.quality ?: "0"
                val qualityScore = quality.toIntOrNull() ?: 0

                // Only include high-quality matches
                if (qualityScore >= 70 || match.match ?: 0.0 >= 0.7) {
                    translations.add(
                        Translation(
                            translation = match.translation,
                            partOfSpeech = PartOfSpeech.UNKNOWN,
                            definition = "Alternative translation (${match.source ?: "community"})"
                        )
                    )
                }
            }
        }

        return if (translations.isNotEmpty()) {
            DictionaryEntry(
                word = originalQuery.lowercase(),
                language = sourceLanguage,
                translations = translations
            )
        } else {
            null
        }
    }
}
