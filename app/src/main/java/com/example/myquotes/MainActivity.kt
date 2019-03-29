package com.example.myquotes

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.ViewModelProviders
import com.example.myquotes.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding: ActivityMainBinding = DataBindingUtil.setContentView(this, R.layout.activity_main)
        binding.viewmodel = ViewModelProviders.of(this).get(QuoteViewModel::class.java)

//        showQuote()
//        setVisibilityOfButtons()
    }

//    private fun showQuote() {
//        binding.quote = quotes[model.index]
//    }
//
//    private fun setVisibilityOfButtons() = when (model.index) {
//        0 -> binding.apply {
//            quotePrevious.visibility = View.INVISIBLE
//            quoteNext.visibility = if(quotes.size > 1) View.VISIBLE else View.INVISIBLE
//        }
//        quotes.size - 1 -> binding.apply {
//            quoteNext.visibility = View.INVISIBLE
//            quotePrevious.visibility = if(quotes.size > 1) View.VISIBLE else View.INVISIBLE
//        }
//        else -> binding.apply {
//            quotePrevious.visibility = View.VISIBLE
//            quoteNext.visibility = View.VISIBLE
//        }
//    }
}
