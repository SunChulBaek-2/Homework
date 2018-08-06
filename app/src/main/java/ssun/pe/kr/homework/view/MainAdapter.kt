package ssun.pe.kr.homework.view

import android.support.v7.widget.RecyclerView
import android.view.ViewGroup
import ssun.pe.kr.homework.data.model.Photo

class MainAdapter : RecyclerView.Adapter<MainHolder>() {
    val photos: MutableList<Photo> = mutableListOf()

    override fun onCreateViewHolder(p0: ViewGroup, p1: Int): MainHolder = MainHolder(p0)

    override fun getItemCount(): Int = photos.size

    override fun onBindViewHolder(p0: MainHolder, p1: Int) {
        // TODO
    }
}