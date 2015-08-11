package com.gyasistory.popularmoviesstage2.fragments;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.preference.Preference;
import android.preference.PreferenceFragment;

import com.gyasistory.popularmoviesstage2.R;
import com.gyasistory.popularmoviesstage2.data.MovieProvider;

/**
 * Created by gyasistory on 7/30/15.
 */
public class OrganizationPreferenceFragment extends PreferenceFragment {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        addPreferencesFromResource(R.xml.organization_preference);
    }

    @Override
    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);

        Preference preference = findPreference("DELETE_DATA");
        preference.setOnPreferenceClickListener(new Preference.OnPreferenceClickListener() {
            @Override
            public boolean onPreferenceClick(Preference preference) {
                AlertDialog.Builder dialog = new AlertDialog.Builder(getActivity());
                dialog.setTitle(R.string.delete_database);
                dialog.setMessage(R.string.delete_database_text);
                dialog.setPositiveButton(R.string.ok, new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        getActivity().getContentResolver().delete(MovieProvider.CONTENT_URI, null, null);
                    }
                });
                dialog.setNegativeButton(R.string.cancel, null);
                dialog.show();

                return true;
            }
        });

        Preference listPreferenc = findPreference("ORG_PREF_LIST");
        listPreferenc.setOnPreferenceChangeListener(new Preference.OnPreferenceChangeListener() {
            @Override
            public boolean onPreferenceChange(Preference preference, Object newValue) {
                getActivity().finish();
                return true;
            }
        });
    }
}
