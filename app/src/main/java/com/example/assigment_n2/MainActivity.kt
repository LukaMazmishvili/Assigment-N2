package com.example.assigment_n2

import android.graphics.drawable.Drawable
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.denzcoskun.imageslider.ImageSlider
import com.denzcoskun.imageslider.constants.ScaleTypes
import com.denzcoskun.imageslider.models.SlideModel
import com.example.assigment_n2.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val imageSlider: ImageSlider = binding.isImageSlider
        val listOfImages = mutableListOf<SlideModel>()

        listOfImages.add(SlideModel(R.drawable.image_1, scaleType = ScaleTypes.FIT))
        listOfImages.add(SlideModel(R.drawable.image_2, scaleType = ScaleTypes.FIT))
        listOfImages.add(SlideModel(R.drawable.image_3, scaleType = ScaleTypes.FIT))

        imageSlider.setImageList(listOfImages)

    }
}