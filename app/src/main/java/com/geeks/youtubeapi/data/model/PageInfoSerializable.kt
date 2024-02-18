package com.geeks.youtubeapi.data.model


import com.google.gson.annotations.SerializedName
import java.io.Serializable

data class PageInfoSerializable(
    @SerializedName("resultsPerPage")
    val resultsPerPage: Int,
    @SerializedName("totalResults")
    val totalResults: Int
)