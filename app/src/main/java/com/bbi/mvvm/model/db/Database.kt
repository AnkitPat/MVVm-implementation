package com.bbi.mvvm.model.db;

import android.arch.persistence.room.Database
import android.arch.persistence.room.RoomDatabase
import com.bbi.mvvm.model.data.User
import com.bbi.mvvm.model.data.UserDao




@Database(entities = arrayOf(User::class), version = 1)
abstract class AppDatabase : RoomDatabase() {
    abstract fun userDao(): UserDao
}