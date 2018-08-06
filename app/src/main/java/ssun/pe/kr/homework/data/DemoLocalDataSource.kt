package ssun.pe.kr.homework.data

import kotlinx.coroutines.experimental.Deferred
import ssun.pe.kr.homework.data.model.Images

class DemoLocalDataSource : DemoDataSource {
    override fun getImages(): Deferred<Images> = TODO()
}