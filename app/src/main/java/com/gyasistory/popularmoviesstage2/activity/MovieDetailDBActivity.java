package com.gyasistory.popularmoviesstage2.activity;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.ShareActionProvider;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;

import com.gyasistory.popularmoviesstage2.ApplicationStrings;
import com.gyasistory.popularmoviesstage2.R;
import com.gyasistory.popularmoviesstage2.fragments.MovieDetailDBFragment;

/**
 * Created by gyasistory on 8/8/15.
 */
public class MovieDetailDBActivity extends AppCompatActivity {

    private ShareActionProvider mShareActionProvider;

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
        int movie =  calledIntent.getIntExtra(ApplicationStrings.MOVIE_DB_EXTRA, 0);
        MovieDetailDBFragment detailFragment = MovieDetailDBFragment.newInstance(movie);

        getFragmentManager().beginTransaction().replace(R.id.detail_activity_container, detailFragment)
                .commit();
    }


}
