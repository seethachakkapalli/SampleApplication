package com.example.sampleapplication.service

import android.util.Log
import okhttp3.Interceptor
import okhttp3.Request
import okhttp3.Response
import java.lang.Exception

class ApiInterceptor: Interceptor {
    override fun intercept(chain: Interceptor.Chain): Response {
        val original: Request = chain.request()
        //header customization
        //sending token
        //create a request builder to transform the request and add headers
        val response: Response = chain.proceed(request = original)

        try {
            if (response.code == 400) {
                Log.e("Response unsuccessfull", response.message);
            }
        } catch (e: Exception) {
            chain.proceed(original)
        }

        return response
    }
}