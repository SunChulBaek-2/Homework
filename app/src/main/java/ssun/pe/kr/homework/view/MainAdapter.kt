package ssun.pe.kr.homework.view

import android.support.v7.widget.RecyclerView
import android.view.ViewGroup
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions
import ssun.pe.kr.homework.R
import ssun.pe.kr.homework.data.model.Photo

class MainAdapter : RecyclerView.Adapter<MainHolder>() {
    var photos: MutableList<Photo>? = mutableListOf()

    override fun onCreateViewHolder(parent: ViewGroup, position: Int): MainHolder = MainHolder(parent)

    override fun getItemCount(): Int = photos?.size ?: 0

    override fun onBindViewHolder(holder: MainHolder, position: Int) {
        photos?.get(holder.adapterPosition)?.let { photo ->
            val options: RequestOptions = RequestOptions()
                    .centerCrop()
                    .placeholder(R.drawable.ic_launcher_background)

            Glide.with(holder.ivImage)
                    .load(photo.url)
                    .apply(options)
                    .into(holder.ivImage)

            holder.tvTitle.text = photo.title
        }
    }
}