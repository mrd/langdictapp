package com.langdict.api

import com.google.gson.annotations.SerializedName

data class MyMemoryResponse(
    @SerializedName("responseData")
    val responseData: ResponseData?,
    @SerializedName("matches")
    val matches: List<Match>?
)

data class ResponseData(
    @SerializedName("translatedText")
    val translatedText: String?,
    @SerializedName("match")
    val match: Double?
)

data class Match(
    @SerializedName("segment")
    val segment: String?,
    @SerializedName("translation")
    val translation: String?,
    @SerializedName("quality")
    val quality: String?,
    @SerializedName("source")
    val source: String?,
    @SerializedName("match")
    val match: Double?
)
