package com.example.topmovies.topmovies;

import io.reactivex.rxjava3.core.Observable;

public class TopMoviesModel implements TopMoviesActivityMVP.Model {

    private Repository repository;

    public TopMoviesModel(Repository repository) {
        this.repository = repository;
    }

    @Override
    public Observable<ViewModel> result() {
        return Observable.zip(

        );
    }
}
