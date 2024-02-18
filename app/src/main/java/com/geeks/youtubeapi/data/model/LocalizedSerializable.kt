package com.geeks.youtubeapi.data.model


import com.google.gson.annotations.SerializedName
import java.io.Serializable

data class LocalizedSerializable(
    @SerializedName("description")
    val description: String,
    @SerializedName("title")
    val title: String
)