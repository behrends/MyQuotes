package com.example.myquotes

import androidx.databinding.ObservableField
import androidx.lifecycle.ViewModel

class QuoteViewModel : ViewModel() {
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

    var index = 0
    var quote = ObservableField(quotes[index])

    fun nextQuote() {
        if(index < quotes.size - 1) {
            index++
            quote.set(quotes[index])
        }
    }

    fun previousQuote() {
        if(index > 0) {
            index--
            quote.set(quotes[index])
        }
    }
}