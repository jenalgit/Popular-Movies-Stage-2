package com.gyasistory.popularmoviesstage2.activity;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;

import com.gyasistory.popularmoviesstage2.ApplicationStrings;
import com.gyasistory.popularmoviesstage2.data.Movie;
import com.gyasistory.popularmoviesstage2.R;
import com.gyasistory.popularmoviesstage2.fragments.MovieDetailFragment;

public class MovieDetailActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_movie_detail);

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);


    }

    @Override
    protected void onResume() {
        super.onResume();

        Intent calledIntent = getIntent();
        Movie movie = (Movie) calledIntent.getSerializableExtra(ApplicationStrings.MOVIE_EXTRA);
        MovieDetailFragment detailFragment = MovieDetailFragment.newInstance(movie);

        getFragmentManager().beginTransaction().replace(R.id.detail_activity_container, detailFragment)
                .commit();
    }
}
