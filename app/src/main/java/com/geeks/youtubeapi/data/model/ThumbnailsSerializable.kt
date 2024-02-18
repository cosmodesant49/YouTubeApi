package com.geeks.youtubeapi.data.model


import com.google.gson.annotations.SerializedName
import java.io.Serializable

data class ThumbnailsSerializable(
    @SerializedName("default")
    val default: DefaultSerializable,
    @SerializedName("high")
    val high: HighSerializable,
    @SerializedName("maxres")
    val maxres: MaxresSerializable,
    @SerializedName("medium")
    val medium: MediumSerializable,
    @SerializedName("standard")
    val standard: StandardSerializable
)