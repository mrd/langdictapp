package com.langdict

data class DictionaryEntry(
    val word: String,
    val language: Language,
    val translations: List<Translation>
)

enum class Language {
    SPANISH,
    ENGLISH
}
