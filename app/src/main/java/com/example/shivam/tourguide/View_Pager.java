package com.example.shivam.tourguide;

import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v7.app.AppCompatActivity;
import android.support.v4.view.ViewPager;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.util.Log;

import java.util.ArrayList;
import java.util.List;

public class View_Pager extends AppCompatActivity {

    private Toolbar toolbar;
    private TabLayout tabLayout;
    private ViewPager viewPager;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view_pager);

        toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        viewPager = findViewById(R.id.viewpager);
        setupViewPager(viewPager);

        tabLayout = findViewById(R.id.tabs);
        tabLayout.setupWithViewPager(viewPager);

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

    private void setupViewPager(ViewPager viewPager) {
        ViewPagerAdapter adapter = new ViewPagerAdapter(getSupportFragmentManager());
        adapter.addFragment(new tab1(), "ONE");
        adapter.addFragment(new tab2(), "TWO");
        viewPager.setAdapter(adapter);
    }

    class ViewPagerAdapter extends FragmentPagerAdapter {

        private final List<Fragment> mFragmentList = new ArrayList<>();
        private final List<String> mFragmentTitleList = new ArrayList<>();

        public ViewPagerAdapter(FragmentManager manager) {
            super(manager);
        }

        @Override
        public Fragment getItem(int position) {
            return mFragmentList.get(position);
        }

        @Override
        public int getCount() {
            return mFragmentList.size();
        }

        public void addFragment(Fragment fragment, String title) {
            mFragmentList.add(fragment);
            mFragmentTitleList.add(title);
        }

        @Override
        public CharSequence getPageTitle(int position) {
            return mFragmentTitleList.get(position);
        }
    }
}

