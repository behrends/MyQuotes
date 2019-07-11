package com.example.myquotes

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class QuoteViewModel : ViewModel() {
    private val _quotes = MutableLiveData<MutableList<Quote>>().apply {
        value = mutableListOf(
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
    }

    val quotes: LiveData<MutableList<Quote>>
        get() = _quotes

    var newQuoteAdded = false

    fun createQuote(text: String, author: String, year: String) {
        newQuoteAdded = true
        val quote = Quote(text, author, year)
        val list = _quotes.value ?: mutableListOf()
        list.add(quote)
        _quotes.value = list
    }
}