package ssun.pe.kr.homework.data.model

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

data class Photo(
        @Expose @SerializedName("date_taken") val dateTaken: String,
        @Expose @SerializedName("title") val title: String,
        @Expose @SerializedName("url") val url: String)