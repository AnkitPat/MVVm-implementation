package com.bbi.mvvm.view_model.data

import com.bbi.mvvm.model.data.User


data class UsersList(val users: List<User>, val message: String, val error: Throwable? = null)
