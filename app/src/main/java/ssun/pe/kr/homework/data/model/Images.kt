package ssun.pe.kr.homework.data.model

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

data class Images(
        @Expose @SerializedName("stat") val stat: String,
        @Expose @SerializedName("page") val page: Int,
        @Expose @SerializedName("total_page") val totalPage: Int,
        @Expose @SerializedName("photos") val photos: List<Photo>)