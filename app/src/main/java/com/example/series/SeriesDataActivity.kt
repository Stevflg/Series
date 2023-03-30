package com.example.series

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.example.series.databinding.ActivitySeriesDataBinding
import com.squareup.picasso.Picasso

class SeriesDataActivity : AppCompatActivity() {
    private lateinit var binding: ActivitySeriesDataBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding=ActivitySeriesDataBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val title=intent.getStringExtra("TITLE")
        val description=intent.getStringExtra("DESCRIPCION")
        val year=intent.getStringExtra("YEAR")
        val image=intent.getStringExtra("PICTURE")

        binding.Title.text=title
        binding.description.text=description
        binding.Year.text=year
        Picasso.get().load(image).into(binding.imageSerie)
    }
    fun close_dialog(view: View){
        finish()
    }
}