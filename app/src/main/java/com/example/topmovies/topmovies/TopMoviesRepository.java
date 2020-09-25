package com.example.topmovies.topmovies;

import io.reactivex.rxjava3.core.Observable;

public class TopMoviesRepository implements Repository {
    @Override
    public Observable<Result> getResultsFromMemory() {
        return null;
    }

    @Override
    public Observable<Result> getResultsFromNetwork() {
        return null;
    }

    @Override
    public Observable<String> getCountriesFromMemory() {
        return null;
    }

    @Override
    public Observable<String> getCountriesFromNetwork() {
        return null;
    }

    @Override
    public Observable<String> getCountryData() {
        return null;
    }

    @Override
    public Observable<Result> getResultData() {
        return null;
    }
}
