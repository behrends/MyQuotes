package com.example.myquotes

import androidx.databinding.ObservableBoolean
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

    private var index = 0
    var quote = ObservableField(quotes[index])
    var isFirst = ObservableBoolean(true)
    var isLast = ObservableBoolean(false)

    fun nextQuote() {
        if(index < quotes.size - 1) {
            index++
            quote.set(quotes[index])
            isFirst.set(index == 0)
            isLast.set(index == quotes.size - 1)
        }
    }

    fun previousQuote() {
        if(index > 0) {
            index--
            quote.set(quotes[index])
            isFirst.set(index == 0)
            isLast.set(index == quotes.size - 1)
        }
    }
}