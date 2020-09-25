package com.example.topmovies.root;


import com.example.topmovies.topmovies.TopMoviesActivity;

import javax.inject.Singleton;

import dagger.Component;


@Singleton
@Component(modules = ApplicationModule.class)
public interface ApplicationComponent {

    void inject(TopMoviesActivity target);
}
