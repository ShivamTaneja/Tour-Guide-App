package com.example.shivam.tourguide;

import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v7.app.AppCompatActivity;
import android.support.v4.view.ViewPager;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;

public class View_Pager extends AppCompatActivity {

    private int tourist_attraction, restaurants, shopping_places, public_places, events;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view_pager);

        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        ViewPager viewPager = findViewById(R.id.viewpager);
        setupViewPager(viewPager);

        TabLayout tabLayout = findViewById(R.id.tabs);
        tabLayout.setupWithViewPager(viewPager);

        tourist_attraction = getIntent().getIntExtra(getString(R.string.TOURISTATTRACTIONS), -1);
        restaurants = getIntent().getIntExtra(getString(R.string.RESTAURANTS), -1);
        shopping_places = getIntent().getIntExtra(getString(R.string.SHOPPINGPLACES), -1);
        public_places = getIntent().getIntExtra(getString(R.string.PUBLICPLACES), -1);
        events = getIntent().getIntExtra(getString(R.string.EVENTS), -1);

        setupViewPager(viewPager);
    }

    private void setupViewPager(ViewPager viewPager) {
        ViewPagerAdapter adapter = new ViewPagerAdapter(getSupportFragmentManager());

        Bundle bundle = new Bundle();
        tab1 tab_1 = new tab1();
        tab2 tab_2 = new tab2();

        if(tourist_attraction == 0)
        {
            tourist_attraction = -1;

            adapter.addFragment(tab_1, getString(R.string.top_rated_places));
            adapter.addFragment(tab_2, getString(R.string.historical_places));

            bundle.putInt(getString(R.string.view_pager), 0);
            tab_1.setArguments(bundle);

            bundle.putInt(getString(R.string.view_pager), 0);
            tab_2.setArguments(bundle);

        }
        else if(restaurants == 1)
        {
            restaurants = -1;
            adapter.addFragment(tab_1, getString(R.string.five_star_rest));
            adapter.addFragment(tab_2, getString(R.string.three_start_rest));

            bundle.putInt(getString(R.string.view_pager), 1);
            tab_1.setArguments(bundle);

            bundle.putInt(getString(R.string.view_pager), 1);
            tab_2.setArguments(bundle);

        }
        else if(shopping_places == 2)
        {
            shopping_places = -1;
            adapter.addFragment(tab_1, getString(R.string.shopping_places));

            bundle.putInt(getString(R.string.view_pager), 2);
            tab_1.setArguments(bundle);

        }
        else if(public_places == 3)
        {
            public_places = -1;
            adapter.addFragment(tab_1, getString(R.string.public_places));

            bundle.putInt(getString(R.string.view_pager), 3);
            tab_1.setArguments(bundle);
        }
        else if(events == 4)
        {
            events = -1;
            adapter.addFragment(tab_1, getString(R.string.cultural_events));
            adapter.addFragment(tab_2, getString(R.string.fun_events));

            bundle.putInt(getString(R.string.view_pager), 4);
            tab_1.setArguments(bundle);

            bundle.putInt(getString(R.string.view_pager), 4);
            tab_2.setArguments(bundle);
        }
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

        @Override
        public void destroyItem(ViewGroup container, int position, Object object) {
            super.destroyItem(container, position, object);
        }
    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
        finish();
    }
}

