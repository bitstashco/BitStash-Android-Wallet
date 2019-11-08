package io.horizontalsystems.bitstashwallet.ui.view

import android.view.View
import androidx.recyclerview.widget.RecyclerView
import io.horizontalsystems.bitstashwallet.R


class ViewHolderProgressbar(itemView: View) : RecyclerView.ViewHolder(itemView) {

    fun bind(visible: Boolean) {
        itemView.findViewById<View>(R.id.progressBar).visibility = if (visible) View.VISIBLE else View.GONE
    }

    companion object {
        val layoutResourceId: Int
            get() = R.layout.view_holder_progressbar_item
    }
}
