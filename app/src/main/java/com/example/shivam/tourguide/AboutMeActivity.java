package com.example.shivam.tourguide;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;

public class AboutMeActivity extends AppCompatActivity {

    private String[] activityTitles;
    Toolbar toolbar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about_me);

        toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);


        activityTitles = getResources().getStringArray(R.array.nav_item_activity_titles);

        setToolbarTitle();
    }

    private void setToolbarTitle() {
        getSupportActionBar().setTitle(activityTitles[2]);
    }
}
