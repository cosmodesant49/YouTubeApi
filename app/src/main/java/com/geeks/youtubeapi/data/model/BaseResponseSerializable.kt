package com.geeks.youtubeapi.data.model


import com.google.gson.annotations.SerializedName
import java.io.Serializable

data class BaseResponseSerializable(
    @SerializedName("etag")
    val etag: String,
    @SerializedName("items")
    val items: List<ItemSerializable>,
    @SerializedName("kind")
    val kind: String,
    @SerializedName("nextPageToken")
    val nextPageToken: String,
    @SerializedName("pageInfo")
    val pageInfo: PageInfoSerializable
):Serializable