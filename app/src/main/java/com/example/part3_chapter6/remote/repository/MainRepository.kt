package com.example.part3_chapter6.remote.repository

import androidx.paging.PagingData
import com.example.part3_chapter6.model.ListItem
import kotlinx.coroutines.flow.Flow

interface MainRepository {

    fun loadList() : Flow<PagingData<ListItem>>

}