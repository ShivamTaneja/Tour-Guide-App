package com.example.shivam.tourguide;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class ViewPager extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view_pager);

        int tourist_attraction = getIntent().getIntExtra(getString(R.string.TOURISTATTRACTIONS),-1);
        int restaurants = getIntent().getIntExtra(getString(R.string.RESTAURANTS),-1);
        int shopping_places = getIntent().getIntExtra(getString(R.string.SHOPPINGPLACES),-1);
        int popular_places = getIntent().getIntExtra(getString(R.string.POPULARPLACES),-1);
        int bars = getIntent().getIntExtra(getString(R.string.BARS),-1);

        if(tourist_attraction == 0)
        {
            tourist_attraction = -1;
            Log.e("shivam0","shivam0");
        }
        else if(restaurants == 1)
        {
            restaurants = -1;
            Log.e("shivam1","shivam1");
        }
        else if(shopping_places == 2)
        {
            shopping_places = -1;
            Log.e("shivam2","shivam2");
        }
        else if(popular_places == 3)
        {
            popular_places = -1;
            Log.e("shivam3","shivam3");
        }
        else if(bars == 4)
        {
            bars = -1;
            Log.e("shivam4","shivam4");
        }
    }
}
