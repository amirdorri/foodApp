package com.example.foodapp.di

import android.content.Context
import androidx.room.Room
import com.example.foodapp.data.database.FoodDao
import com.example.foodapp.data.database.FoodDatabase
import com.example.foodapp.data.database.FoodEntity
import com.example.foodapp.utils.Constants.FOOD_DB_DATABASE
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object DatabaseModule {
    @Provides
    @Singleton
    fun provideDatabase(@ApplicationContext context: Context) = Room.databaseBuilder(
        context, FoodDatabase::class.java, FOOD_DB_DATABASE
    ).allowMainThreadQueries()
        .fallbackToDestructiveMigration()
        .build()

    @Provides
    @Singleton
    fun provideDao(db: FoodDatabase): FoodDao = db.foodDao()

    @Provides
    @Singleton
    fun provideEntity(): FoodEntity = FoodEntity()
}