package com.example.part3_chapter6.remote

import android.util.Log
import androidx.paging.PagingSource
import androidx.paging.PagingState
import com.example.part3_chapter6.model.ListItem

class MainPageSource(
    private val mainService: MainService
) : PagingSource<Int, ListItem>() {

    override fun getRefreshKey(state: PagingState<Int, ListItem>): Int? {
        return 0
    }

    override suspend fun load(params: LoadParams<Int>): LoadResult<Int, ListItem> {
        return try {
            val page = params.key ?: 1
            val size = params.loadSize
            val result = mainService.getList(page, size).data

            Log.wtf("askask", "result $result")

            LoadResult.Page(
                data = result.list,
                prevKey = null,
                nextKey = result.page.nextPage
            )
        } catch (e: Exception) {
            Log.wtf("askask", "error")
            LoadResult.Error(e)
        }
    }
}