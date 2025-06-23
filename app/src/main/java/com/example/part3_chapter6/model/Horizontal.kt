package com.example.part3_chapter6.model

data class Horizontal(
    val title: String,
    val items: List<ListItem>
) : ListItem {
    override val viewType: ViewType
        get() = ViewType.HORIZONTAL
}