package com.hiraok.twitcasting_sample

import android.content.Context
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView

class MovieListAdapter(
    private val context: Context,
    private val list: List<Movie>
) : RecyclerView.Adapter<RecyclerView.ViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        return ViewHolder(View.inflate(context, R.layout.movielist_item, null))
    }

    override fun getItemCount(): Int {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {

    }

    data class ViewHolder(val view: View) : RecyclerView.ViewHolder(view)
}
