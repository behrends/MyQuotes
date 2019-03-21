package com.example.myquotes

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView
import android.widget.Toast

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

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        findViewById<TextView>(R.id.quote_text).text = quotes[index].text
        findViewById<TextView>(R.id.quote_author).text = quotes[index].author
        findViewById<TextView>(R.id.quote_year).text = quotes[index].year
    }

    fun nextQuote(view: View) {
        if(index < quotes.size - 1) index++
        findViewById<TextView>(R.id.quote_text).text = quotes[index].text
        findViewById<TextView>(R.id.quote_author).text = quotes[index].author
        findViewById<TextView>(R.id.quote_year).text = quotes[index].year
    }

    fun previousQuote(view: View) {
        Toast.makeText(this, "Voriges Zitat", Toast.LENGTH_SHORT).show()
    }
}
