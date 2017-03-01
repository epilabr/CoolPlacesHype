package com.cool.places.hype;

import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class AppPreferenceActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {  //hosts the preference fragment
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_app_preference);

// this activity hosts the fragment which is used to display the user preference
        MyPreferenceFragment myPreferenceFragment = new MyPreferenceFragment();
        FragmentManager manager = getFragmentManager();
        FragmentTransaction transaction = manager.beginTransaction();
        transaction.add(R.id.activity_preference_container,myPreferenceFragment);
        transaction.commit();

    }
}
