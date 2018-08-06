package ssun.pe.kr.homework.data

import kotlinx.coroutines.experimental.Deferred
import ssun.pe.kr.homework.data.model.Images

interface DemoDataSource {
    fun getImages(): Deferred<Images>
}