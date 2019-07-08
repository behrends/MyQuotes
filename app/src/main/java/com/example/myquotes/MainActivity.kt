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
        val viewModel = ViewModelProviders.of(this).get(QuoteViewModel::class.java)
        binding.viewmodel = viewModel
        binding.lifecycleOwner = this

        val viewPager = binding.quoteViewPager
        val adapter = QuoteViewPagerAdapter()
        adapter.setQuotes(viewModel.quotes)
        viewPager.adapter = adapter
    }
}
