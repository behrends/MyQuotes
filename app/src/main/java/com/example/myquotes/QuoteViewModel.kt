package com.example.myquotes

import android.app.Application
import androidx.lifecycle.*
import kotlinx.coroutines.launch

class QuoteViewModel(application: Application) : AndroidViewModel(application) {
    private var quoteDao = AppDatabase.getDatabase(application).quoteDao()

    val quotes = quoteDao.getQuotes()

    val hasNoQuotes = Transformations.map(quotes) { quotes.value.isNullOrEmpty() }

    var newQuoteAdded = false

    fun createQuote(text: String, author: String, year: String) = viewModelScope.launch {
        newQuoteAdded = true
        quoteDao.insert(Quote(text, author, year))
    }
}