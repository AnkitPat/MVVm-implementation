package com.bbi.mvvm.model.api;

import com.bbi.mvvm.model.data.User
import io.reactivex.Observable


import retrofit2.http.GET

interface UserApi {

    @GET("6de6abfedb24f889e0b5f675edc50deb?fmt=raw&sole")
    fun getUsers(): Observable<List<User>>
}
