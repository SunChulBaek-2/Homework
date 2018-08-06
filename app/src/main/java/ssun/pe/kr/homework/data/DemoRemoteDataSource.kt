package ssun.pe.kr.homework.data

import kotlinx.coroutines.experimental.Deferred
import ssun.pe.kr.homework.data.model.Images
import ssun.pe.kr.homework.network.DemoService
import ssun.pe.kr.homework.network.RetrofitCreator

class DemoRemoteDataSource : DemoDataSource {
    private val mService: DemoService = RetrofitCreator.create().create(DemoService::class.java)

    override fun getImages(): Deferred<Images> = mService.getImages()
}