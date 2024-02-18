package com.geeks.youtubeapi.di

import org.koin.dsl.module

val youtubeModule = listOf(viewModelModule, repoModule, networkModule)