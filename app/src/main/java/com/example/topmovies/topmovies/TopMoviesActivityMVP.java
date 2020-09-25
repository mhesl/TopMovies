package com.example.topmovies.topmovies;


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
