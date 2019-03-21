package com.example.myquotes

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val quote = Quote(
            "Probleme kann man niemals mit derselben Denkweise lösen, durch die sie entstanden sind.",
            "Albert Einstein",
            "1948"
        )

        findViewById<TextView>(R.id.quote_text).text = quote.text
        findViewById<TextView>(R.id.quote_author).text = quote.author
        findViewById<TextView>(R.id.quote_year).text = quote.year
    }

    fun nextQuote(view: View) {
        Toast.makeText(this, "Nächstes Zitat", Toast.LENGTH_SHORT).show()
    }

    fun previousQuote(view: View) {
        Toast.makeText(this, "Voriges Zitat", Toast.LENGTH_SHORT).show()
    }
}
