package com.example.topmovies.topmovies;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.ViewGroup;

import com.example.topmovies.R;

import javax.inject.Inject;

import butterknife.BindView;
import butterknife.ButterKnife;

public class TopMoviesActivity extends AppCompatActivity implements TopMoviesActivityMVP.View{

    private final String TAG = TopMoviesActivity.class.getName();

    @BindView(R.id.recyclerView)
    RecyclerView recyclerView;

    @BindView(R.id.activity_rootView)
    ViewGroup rootView;

    @Inject
    TopMoviesActivityMVP.Presenter presenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_top_movies);

        ButterKnife.bind(this);
    }

    @Override
    public void updateData(ViewModel viewModel) {

    }

    @Override
    public void showSnackBar(String s) {

    }
}