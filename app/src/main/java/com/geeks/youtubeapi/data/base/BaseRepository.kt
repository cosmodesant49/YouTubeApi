package com.geeks.youtubeapi.data.base

import androidx.lifecycle.LiveData
import androidx.lifecycle.liveData
import com.geeks.youtubeapi.utils.Resource
import kotlinx.coroutines.Dispatchers
import okhttp3.Dispatcher
import java.io.IOException

abstract class BaseRepository {
    protected fun <T> doRequest(
        request:suspend () ->T
    ): LiveData<Resource<T>> = liveData(Dispatchers.IO){
            emit(Resource.Loading())
            try {
                val response = request()
                //if (response.isSuccessful && response.body() != null && response.code() in 200..300){
                    emit(Resource.Success(response))
                //}
            }catch (io: IOException){
                emit(Resource.Error(io.message?:"Unknown Error!"))
            }
        }
    }