package com.langdict.api

import retrofit2.http.GET
import retrofit2.http.Query

interface MyMemoryApiService {
    @GET("get")
    suspend fun translate(
        @Query("q") query: String,
        @Query("langpair") langPair: String
    ): MyMemoryResponse
}
