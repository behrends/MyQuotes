package com.example.myquotes

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.databinding.DataBindingUtil
import com.example.myquotes.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    private val quotes = listOf(
        Quote(
            "Probleme kann man niemals mit derselben Denkweise lösen, durch die sie entstanden sind.",
            "Albert Einstein",
            "1948"
        ),
        Quote(
            "Man braucht nichts im Leben zu fürchten, man muss nur alles verstehen.",
            "Marie Curie",
            "1928"
        ),
        Quote(
            "Nichts ist so beständig wie der Wandel.",
            "Heraklit",
            "480 v. Chr."
        )
    )

    private var index = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)

        showQuote()
        setVisibilityOfButtons()
    }

    private fun showQuote() {
        binding.apply {
            quoteText.text = quotes[index].text
            quoteAuthor.text = quotes[index].author
            quoteYear.text = quotes[index].year
        }
    }

    private fun setVisibilityOfButtons() = when (index) {
        0 -> binding.apply {
            quotePrevious.visibility = View.INVISIBLE
            quoteNext.visibility = if(quotes.size > 1) View.VISIBLE else View.INVISIBLE
        }
        quotes.size - 1 -> binding.apply {
            quoteNext.visibility = View.INVISIBLE
            quotePrevious.visibility = if(quotes.size > 1) View.VISIBLE else View.INVISIBLE
        }
        else -> binding.apply {
            quotePrevious.visibility = View.VISIBLE
            quoteNext.visibility = View.VISIBLE
        }
    }

    fun nextQuote(view: View) {
        if(index < quotes.size - 1) index++
        showQuote()
        setVisibilityOfButtons()
    }

    fun previousQuote(view: View) {
        if(index > 0) index--
        showQuote()
        setVisibilityOfButtons()
    }
}
