package com.geeks.youtubeapi.data.model


import com.google.gson.annotations.SerializedName
import java.io.Serializable

data class ContentDetailsSerializable(
    @SerializedName("itemCount")
    val itemCount: Int
)