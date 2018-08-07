package ssun.pe.kr.homework.view

import android.arch.lifecycle.Observer
import android.arch.lifecycle.ViewModelProviders
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.DividerItemDecoration
import android.support.v7.widget.LinearLayoutManager
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*
import ssun.pe.kr.homework.R
import ssun.pe.kr.homework.data.model.Photo

class MainActivity : AppCompatActivity() {
    private val mViewModel: MainViewModel by lazy {
        ViewModelProviders.of(this).get(MainViewModel::class.java)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        initViews()
        updateViews()

        mViewModel.getImages()
    }

    private fun initViews() {
        rvPhotos.adapter = MainAdapter()
        rvPhotos.layoutManager = LinearLayoutManager(this)
        rvPhotos.addItemDecoration(DividerItemDecoration(this, DividerItemDecoration.VERTICAL))
    }

    private fun updateViews() {
        mViewModel.inProgress.observe(this, Observer { inProgress ->
            clProgress.visibility = if (inProgress!!) View.VISIBLE else View.GONE
        })

        mViewModel.images.observe(this, Observer { images ->
            (rvPhotos.adapter as MainAdapter).photos = images?.photos as MutableList<Photo>
            (rvPhotos.adapter as MainAdapter).notifyDataSetChanged()
        })
    }
}
