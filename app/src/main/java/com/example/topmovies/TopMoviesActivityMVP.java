package com.example.topmovies;


import com.example.topmovies.topmovies.ViewModel;

import io.reactivex.rxjava3.core.Observable;


public interface TopMoviesActivityMVP {

    interface View{
        void updateData(ViewModel viewModel);
        void showSnackBar(String s);
    }


    interface Presenter{
        void setView(TopMoviesActivityMVP.View view);
        void loadData();
        void rxUnSubscribe();
    }


    interface Model{

        Observable<ViewModel> result();
    }
}
