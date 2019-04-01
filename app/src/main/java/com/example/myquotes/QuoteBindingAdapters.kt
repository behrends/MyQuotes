package com.example.myquotes

import android.view.View
import androidx.databinding.BindingAdapter

@BindingAdapter("hideView")
fun hideView(view: View, hide: Boolean) {
    view.visibility = if (hide) View.INVISIBLE else View.VISIBLE
}