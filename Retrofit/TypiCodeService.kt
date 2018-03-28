package com.example.android.soonami.Retrofit

import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Path


/**
 * Created by hp on 28.03.2018.
 */
interface TypiCodeService {
    @GET("event/1/query?format=geojson&starttime=2012-01-01&endtime=2012-12-01&minmagnitude=6")
    fun GetPost(): Call<UserPost>
}