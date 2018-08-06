package ssun.pe.kr.homework.network

import kotlinx.coroutines.experimental.Deferred
import retrofit2.http.GET
import ssun.pe.kr.homework.data.model.Images

interface DemoService {
    @GET("images")
    fun getImages(): Deferred<Images>
}