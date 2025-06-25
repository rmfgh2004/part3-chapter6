package com.example.part3_chapter6.viewholder

import android.util.Log
import com.example.part3_chapter6.ListAdapter
import com.example.part3_chapter6.databinding.ItemViewpagerBinding
import com.example.part3_chapter6.model.ListItem
import com.example.part3_chapter6.model.ViewPager

class ViewPagerViewHolder(
    binding: ItemViewpagerBinding
) : BindingViewHolder<ItemViewpagerBinding>(binding) {

    private val adapter = ListAdapter()

    init {
        binding.viewPager.adapter = adapter
    }

    override fun bind(item: ListItem) {
        super.bind(item)
        item as ViewPager
        adapter.submitList(item.items)
    }

}