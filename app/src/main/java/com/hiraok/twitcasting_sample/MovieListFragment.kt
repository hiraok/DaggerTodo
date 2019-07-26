package com.hiraok.twitcasting_sample

import android.content.Context
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import com.hiraok.twitcasting_sample.databinding.FragmentMovieListBinding
import dagger.android.support.AndroidSupportInjection


class MovieListFragment : Fragment() {

    override fun onAttach(context: Context?) {
        super.onAttach(context)
        AndroidSupportInjection.inject(this)
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        val binding = DataBindingUtil.inflate<FragmentMovieListBinding>(
            inflater, R.layout.fragment_movie_list, null, false
        )
        return binding.root
    }

}