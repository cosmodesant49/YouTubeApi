package com.geeks.youtubeapi.data.repository

import com.geeks.youtubeapi.BuildConfig
import com.geeks.youtubeapi.data.api.YouTubeApiService
import com.geeks.youtubeapi.utils.Constants

class YouTubeRepository (
    private val service:YouTubeApiService
){
    fun getPlaylists(){
        service.getPlaylists(
            apiKey = BuildConfig.API_KEY,
            part = Constants.PART,
            channelId = Constants.CHANNEL_ID,
            maxResults = 50
        )
    }
    fun getPlaylistItem(playlistId:String){
        service.getPlaylistsItems(
            apiKey = BuildConfig.API_KEY,
                part = Constants.PART,
            playlistId = playlistId ,
            maxResults = 50
        )
    }
}