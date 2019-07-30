package com.hiraok.twitcasting_sample

import android.app.Application
import androidx.databinding.ObservableArrayList
import androidx.lifecycle.*
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.disposables.CompositeDisposable
import io.reactivex.rxkotlin.addTo
import io.reactivex.rxkotlin.subscribeBy
import io.reactivex.schedulers.Schedulers
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch
import timber.log.Timber
import javax.inject.Inject

class MovieListViewModel @Inject constructor(
    application: Application,
    private val movieUseCase: MovieUseCase,
    private val disposable: CompositeDisposable
) : AndroidViewModel(application) {

    val movieList = MutableLiveData<List<Movie>>()

    override fun onCleared() {
        disposable.dispose()
    }

    fun init() {
        movieUseCase.getMovies()
            .subscribeOn(Schedulers.io())
            .observeOn(AndroidSchedulers.mainThread())
            .subscribeBy(
                onError = {
                    Timber.e(it)
                },
                onSuccess = {
                    movieList.postValue(it)
                }
            ).addTo(disposable)
    }
}