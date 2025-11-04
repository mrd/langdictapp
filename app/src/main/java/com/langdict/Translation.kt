package com.langdict

data class Translation(
    val translation: String,
    val partOfSpeech: PartOfSpeech,
    val definition: String
)
