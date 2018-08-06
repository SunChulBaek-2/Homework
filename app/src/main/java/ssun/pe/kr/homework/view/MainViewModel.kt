package ssun.pe.kr.homework.view

import android.arch.lifecycle.MutableLiveData
import android.arch.lifecycle.ViewModel
import kotlinx.coroutines.experimental.android.UI
import kotlinx.coroutines.experimental.launch
import ssun.pe.kr.homework.data.DemoRepository
import ssun.pe.kr.homework.data.model.Images

class MainViewModel : ViewModel() {
    val images: MutableLiveData<Images> = MutableLiveData()

    fun getImages() = launch(UI) {
        try {
            images.value = DemoRepository.getImages().await()
        } catch (e: Exception) {
            e.printStackTrace()
        }
    }
}