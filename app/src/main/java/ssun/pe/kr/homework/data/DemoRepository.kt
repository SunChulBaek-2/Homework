package ssun.pe.kr.homework.data

import kotlinx.coroutines.experimental.Deferred
import ssun.pe.kr.homework.data.model.Images

object DemoRepository : DemoDataSource {
    private val mRemote: DemoDataSource = DemoRemoteDataSource()
    private val mLocal: DemoDataSource = DemoLocalDataSource()

    override fun getImages(): Deferred<Images> = mRemote.getImages()
}