package com.example.part3_chapter6.di

import com.example.part3_chapter6.remote.MainService
import com.example.part3_chapter6.remote.repository.MainRepository
import com.example.part3_chapter6.remote.repository.MainRepositoryImpl
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ViewModelComponent
import dagger.hilt.android.scopes.ViewModelScoped

@Module
@InstallIn(ViewModelComponent::class)
object MainRepositoryModule {

    @ViewModelScoped
    @Provides
    fun providesMainRepository(
        mainService: MainService
    ) : MainRepository = MainRepositoryImpl(mainService)
}