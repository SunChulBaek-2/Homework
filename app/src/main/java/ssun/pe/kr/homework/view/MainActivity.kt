package ssun.pe.kr.homework.view

import android.arch.lifecycle.Observer
import android.arch.lifecycle.ViewModelProviders
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import ssun.pe.kr.homework.R

class MainActivity : AppCompatActivity() {
    private val mViewModel: MainViewModel by lazy {
        ViewModelProviders.of(this).get(MainViewModel::class.java)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        mViewModel.images.observe(this, Observer { images ->
            images?.photos?.forEach { photo ->
                Log.d("Main", "[x1210x] title=${photo.title}")
            }
        })

        mViewModel.getImages()
    }
}
