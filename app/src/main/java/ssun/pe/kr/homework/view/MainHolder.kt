package ssun.pe.kr.homework.view

import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import ssun.pe.kr.homework.R

class MainHolder(parent: ViewGroup) : RecyclerView.ViewHolder(
        LayoutInflater.from(parent.context)
                .inflate(R.layout.photo_item, parent, false)) {

    val ivImage: ImageView = itemView.findViewById(R.id.ivIamge)
    val tvTitle: TextView = itemView.findViewById(R.id.tvTitle)
}