package com.example.part3_chapter6

import androidx.recyclerview.widget.DiffUtil
import com.example.part3_chapter6.model.ListItem

class DiffCallback<T : ListItem> : DiffUtil.ItemCallback<T>() {

    override fun areItemsTheSame(oldItem: T, newItem: T): Boolean {
        return oldItem.viewType == newItem.viewType && oldItem.hashCode() == newItem.hashCode()
    }

    override fun areContentsTheSame(oldItem: T, newItem: T): Boolean {
        return oldItem == newItem
    }

}