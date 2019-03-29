package com.example.myquotes

import androidx.databinding.ObservableField
import androidx.databinding.ObservableInt
import androidx.lifecycle.ViewModel

class QuoteViewModel : ViewModel() {
     val quotes = listOf(
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

    var index = ObservableInt(0)
    var quote = ObservableField(quotes[index.get()])

    fun nextQuote() {
        if(index.get() < quotes.size - 1) {
            index.set(index.get() + 1)
            quote.set(quotes[index.get()])
        }
    }

    fun previousQuote() {
        if(index.get() > 0) {
            index.set(index.get() - 1)
            quote.set(quotes[index.get()])
        }
    }
}