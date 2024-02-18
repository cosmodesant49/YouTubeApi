package com.geeks.youtubeapi.data.model


import com.google.gson.annotations.SerializedName
import java.io.Serializable

data class ItemSerializable(
    @SerializedName("contentDetails")
    val contentDetails: ContentDetailsSerializable,
    @SerializedName("etag")
    val etag: String,
    @SerializedName("id")
    val id: String,
    @SerializedName("kind")
    val kind: String,
    @SerializedName("snippet")
    val snippet: SnippetSerializable
)