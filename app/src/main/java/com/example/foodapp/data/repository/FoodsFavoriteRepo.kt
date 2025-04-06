package com.example.foodapp.data.repository

import com.example.foodapp.data.database.FoodEntity
import com.example.foodapp.data.database.FoodDao
import kotlinx.coroutines.flow.Flow
import javax.inject.Inject

class FoodsFavoriteRepo @Inject constructor(private val dao: FoodDao) {
    fun getAllFoods(): Flow<MutableList<FoodEntity>> = dao.getAllFoods()
}