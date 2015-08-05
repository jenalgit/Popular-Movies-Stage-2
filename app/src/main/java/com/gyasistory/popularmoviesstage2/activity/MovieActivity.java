package com.gyasistory.popularmoviesstage2.activity;


import android.content.Intent;
import android.os.Bundle;
import android.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.widget.Toast;

import com.gyasistory.popularmoviesstage2.Movie;
import com.gyasistory.popularmoviesstage2.R;
import com.gyasistory.popularmoviesstage2.fragments.MovieActivityFragment;

import java.util.ArrayList;

public class MovieActivity extends AppCompatActivity implements MovieActivityFragment.MovieGridListener {

    FragmentManager fragmentManager;
    MovieActivityFragment movieActivityFragment;
    ArrayList<Movie> mPopularList;
    ArrayList<Movie> mTopVotedList;
    final static String POP_LIST = "popList";
    final static String TOP_VOTE_LIST = "topVoteList";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_movie);

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        // Load Fragments
        movieActivityFragment = new MovieActivityFragment();


        // Load Framments
        fragmentManager = getFragmentManager();
        fragmentManager.beginTransaction().replace(R.id.fragmentGridListContainer, movieActivityFragment).commit();




    }



    @Override
    public void onMovieSelected(Movie movie) {

        Toast.makeText(this, "You selected " + movie.getTitle(), Toast.LENGTH_SHORT).show();

    }

    @Override
    public void onSettingMenuClicked() {
        Intent optionIntent = new Intent(this, OrganizationPreferenceActivity.class);
        startActivity(optionIntent);
    }


}
