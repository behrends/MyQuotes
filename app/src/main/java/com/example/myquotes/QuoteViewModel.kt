package com.example.myquotes

import androidx.lifecycle.ViewModel

class QuoteViewModel : ViewModel() {
    val quotes = mutableListOf(
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

    fun createQuote(text: String, author: String, year: String) {
        val quote = Quote(text, author, year)
        quotes.add(quote)
    }
}