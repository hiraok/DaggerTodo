package com.hiraok.twitcasting_sample.ui

import android.content.Context
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProviders
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.hiraok.twitcasting_sample.R
import com.hiraok.twitcasting_sample.databinding.FragmentMovieListBinding
import com.hiraok.twitcasting_sample.di.ViewModelFactory
import dagger.android.support.AndroidSupportInjection
import javax.inject.Inject

class MovieListFragment : Fragment() {

    @Inject
    lateinit var viewModelFactory: ViewModelFactory

    private lateinit var viewModel: MovieListViewModel

    lateinit var binding: FragmentMovieListBinding

    override fun onAttach(context: Context?) {
        AndroidSupportInjection.inject(this)
        super.onAttach(context)
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        binding = DataBindingUtil.inflate(
            inflater,
            R.layout.fragment_movie_list, container, false
        )
        binding.lifecycleOwner = this
        return binding.root
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProviders.of(this, viewModelFactory).get(MovieListViewModel::class.java)
        binding.viewModel = viewModel
        binding.recyclerView.layoutManager = LinearLayoutManager(context)
        binding.adapter = MovieListAdapter()
        binding.recyclerView.addOnScrollListener(scrollPosition)
        viewModel.init()
    }

    val scrollPosition = object : RecyclerView.OnScrollListener() {
        override fun onScrolled(recyclerView: RecyclerView, dx: Int, dy: Int) {
            (binding.adapter as MovieListAdapter)
        }

        override fun onScrollStateChanged(recyclerView: RecyclerView, newState: Int) {
        }
    }

}
