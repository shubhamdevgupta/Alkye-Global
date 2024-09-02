package com.androiddev.alkyeglobal

import android.graphics.Rect
import android.view.View
import androidx.recyclerview.widget.RecyclerView

class HorizontalItemDecoration(private val itemOffset: Int) : RecyclerView.ItemDecoration() {

    override fun getItemOffsets(
        outRect: Rect,
        view: View,
        parent: RecyclerView,
        state: RecyclerView.State
    ) {
        val position = parent.getChildAdapterPosition(view)
        if (position == 0) {
            outRect.left = 0 // No offset for the first item
        } else {
            outRect.left = itemOffset // Offset for other items
        }
    }
}
