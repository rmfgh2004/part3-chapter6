package com.example.part3_chapter6.remote.repository

import androidx.paging.Pager
import androidx.paging.PagingConfig
import androidx.paging.PagingData
import com.example.part3_chapter6.model.ListItem
import com.example.part3_chapter6.remote.MainPageSource
import com.example.part3_chapter6.remote.MainService
import kotlinx.coroutines.flow.Flow
import javax.inject.Inject

class MainRepositoryImpl @Inject constructor(
    private val mainService: MainService
) : MainRepository {

    override fun loadList() = Pager(
        config = PagingConfig(
            pageSize = 20,
            enablePlaceholders = false
        ),
        pagingSourceFactory = {
            MainPageSource(mainService)
        }
    ).flow
}