package com.geeks.youtubeapi.data.api

import retrofit2.http.GET
import retrofit2.http.Query

interface YouTubeApiService {
    @GET("playlists")
    fun getPlaylists(
        @Query("key") apiKey:String,
        @Query("channelId") channelId:String,
        @Query("part") part:String,
        @Query("maxResults") maxResults:Int,
    )
    @GET("playlistsItems")
    fun getPlaylistsItems(
        @Query("key") apiKey:String,
        @Query("playlistId") playlistId:String,
        @Query("part") part:String,
        @Query("maxResults") maxResults:Int,
    )
}