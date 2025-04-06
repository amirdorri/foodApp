package com.example.foodapp.viewmodel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.foodapp.data.database.FoodEntity
import com.example.foodapp.data.repository.FoodsFavoriteRepo
import com.example.foodapp.utils.DataStatus
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class FoodsFavoriteViewModel @Inject constructor(private val repository: FoodsFavoriteRepo) : ViewModel() {
    //Livedata
    val favoritesListData = MutableLiveData<DataStatus<MutableList<FoodEntity>>>()

    fun getAllFoods() = viewModelScope.launch(Dispatchers.IO) {
        repository.getAllFoods().collect {
            favoritesListData.postValue(DataStatus.success(it, it.isEmpty()))
        }
    }
}