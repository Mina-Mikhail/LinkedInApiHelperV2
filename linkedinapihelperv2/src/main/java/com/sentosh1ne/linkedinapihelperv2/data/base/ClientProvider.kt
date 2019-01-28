package com.sentosh1ne.linkedinapihelperv2.data.base

import okhttp3.OkHttpClient
import java.util.concurrent.TimeUnit

object ClientProvider {
    fun getClient(): OkHttpClient {
        return OkHttpClient().newBuilder()
                .connectTimeout(10, TimeUnit.SECONDS)
                .readTimeout(30, TimeUnit.SECONDS)
                .build()

    }
}