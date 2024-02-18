package com.geeks.youtubeapi.data.model


import com.google.gson.annotations.SerializedName
import java.io.Serializable

data class SnippetSerializable(
    @SerializedName("channelId")
    val channelId: String,
    @SerializedName("channelTitle")
    val channelTitle: String,
    @SerializedName("description")
    val description: String,
    @SerializedName("localized")
    val localized: LocalizedSerializable,
    @SerializedName("publishedAt")
    val publishedAt: String,
    @SerializedName("thumbnails")
    val thumbnails: ThumbnailsSerializable,
    @SerializedName("title")
    val title: String
)