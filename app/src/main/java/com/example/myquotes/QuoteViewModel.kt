package com.example.myquotes

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.Transformations
import androidx.lifecycle.ViewModel

class QuoteViewModel : ViewModel() {
    private val _quotes = MutableLiveData<MutableList<Quote>>().apply {
        value = mutableListOf()
    }

    val quotes: LiveData<MutableList<Quote>>
        get() = _quotes

    val hasNoQuotes = Transformations.map(quotes) { quotes.value.isNullOrEmpty() }

    var newQuoteAdded = false

    fun createQuote(text: String, author: String, year: String) {
        newQuoteAdded = true
        val quote = Quote(text, author, year)
        val list = _quotes.value ?: mutableListOf()
        list.add(quote)
        _quotes.value = list
    }
}