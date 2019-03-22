package com.example.myquotes

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView

class MainActivity : AppCompatActivity() {

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

    private lateinit var quoteText: TextView
    private lateinit var quoteAuthor: TextView
    private lateinit var quoteYear: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        quoteText = findViewById(R.id.quote_text)
        quoteAuthor = findViewById(R.id.quote_author)
        quoteYear = findViewById(R.id.quote_year)

        showQuote()
    }

    private fun showQuote() {
        quoteText.text = quotes[index].text
        quoteAuthor.text = quotes[index].author
        quoteYear.text = quotes[index].year
    }

    fun nextQuote(view: View) {
        if(index < quotes.size - 1) index++
        showQuote()
    }

    fun previousQuote(view: View) {
        if(index > 0) index--
        showQuote()
    }
}
