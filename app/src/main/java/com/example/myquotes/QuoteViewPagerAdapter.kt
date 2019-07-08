package com.example.myquotes

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.quote.view.*

class QuoteViewPagerAdapter : RecyclerView.Adapter<QuoteViewPagerAdapter.QuoteViewHolder>() {
    private var quotes = emptyList<Quote>()

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): QuoteViewHolder {
        val quoteView = LayoutInflater.from(parent.context).inflate(R.layout.quote, parent, false)
        return QuoteViewHolder(quoteView)
    }

    override fun getItemCount() = quotes.size

    override fun onBindViewHolder(holder: QuoteViewHolder, position: Int) {
        with(quotes[position]) {
            holder.content.text = text
            holder.author.text = author
            holder.year.text = year
        }
    }

    fun setQuotes(quotes: List<Quote>) {
        this.quotes = quotes
        notifyDataSetChanged()
    }

    inner class QuoteViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val content = itemView.quote_text
        val author = itemView.quote_author
        val year = itemView.quote_year
    }
}