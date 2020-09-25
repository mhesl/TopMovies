package com.example.topmovies.topmovies;

import com.example.topmovies.TopMoviesActivityMVP;

import io.reactivex.rxjava3.core.Observable;

public class TopMoviesModel implements TopMoviesActivityMVP.Model {
    @Override
    public Observable<ViewModel> result() {
        return null;
    }
}
