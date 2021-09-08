package com.harivansh.dice

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.harivansh.dice.databinding.ActivityMainBinding
import kotlin.random.Random


class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

    }

    override fun onStart() {
        super.onStart()


        // Roll Button implementation
        binding.rollButton.setOnClickListener {

            val random_int = Random.nextInt(6) + 1

            val image_resource = when (random_int) {
                1 -> R.drawable.dice_1
                2 -> R.drawable.dice_2
                3 -> R.drawable.dice_3
                4 -> R.drawable.dice_4
                5 -> R.drawable.dice_5
                else -> R.drawable.dice_6


            }

            binding.diceImage.setImageResource(image_resource)
        }


    }
}