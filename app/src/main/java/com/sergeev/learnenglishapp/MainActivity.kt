package com.sergeev.learnenglishapp

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.core.content.ContextCompat
import androidx.core.view.isVisible
import com.sergeev.learnenglishapp.databinding.ActivityLearnWordBinding

class MainActivity : AppCompatActivity() {






    private var binding: ActivityLearnWordBinding? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityLearnWordBinding.inflate(layoutInflater)
        setContentView(binding?.root)

        binding?.layoutAnswer3?.setOnClickListener {
            markAnswerCorrect()
        }
    }

    private fun markAnswerCorrect() {
        binding?.layoutAnswer3?.background = ContextCompat.getDrawable(
            this@MainActivity,
            R.drawable.shape_rounded_containers_correct
        )

        binding?.tvVariantNumber3?.background = ContextCompat.getDrawable(
            this@MainActivity,
            R.drawable.shape_rounded_variants_correct
        )

        binding?.tvVariantNumber3?.setTextColor(
            ContextCompat.getColor(
                this@MainActivity,
                R.color.white
            )
        )

        binding?.tvVariantValue3?.setTextColor(
            ContextCompat.getColor(
                this@MainActivity,
                R.color.correctAnswerColor
            )
        )

        binding?.btnSkip?.isVisible = false


        binding?.layoutResult?.setBackgroundColor(
            ContextCompat.getColor(
                this@MainActivity,
                R.color.correctAnswerColor
            )
        )

        binding?.ivResultIcon?.setImageDrawable(
            ContextCompat.getDrawable(
                this@MainActivity,
                R.drawable.ic_correct
            )
        )


        binding?.tvResultMessage?.text = resources.getString(R.string.title_correct)

        binding?.btnContinue?.setTextColor(
            ContextCompat.getColor(
                this@MainActivity,
                R.color.correctAnswerColor
            )
        )

        binding?.layoutResult?.isVisible = true

    }
}