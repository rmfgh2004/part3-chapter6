package com.example.part3_chapter6.model

data class ViewPager(
    val items: List<ListItem>
) : ListItem {
    override val viewType: ViewType
        get() = ViewType.VIEW_PAGER
}