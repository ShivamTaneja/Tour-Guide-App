package com.example.shivam.tourguide;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v7.widget.DividerItemDecoration;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

public class HomeFragment extends Fragment {

    private RecyclerView mRecyclerView;
    private RecyclerView.Adapter mAdapter;
    private RecyclerView.LayoutManager mLayoutManager;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {


        // Inflate the layout for this fragment
        final View view = inflater.inflate(R.layout.fragment_home, container, false);
        final FragmentActivity fragmentActivity = getActivity();
        mRecyclerView = view.findViewById(R.id.my_recycler_view);
        mLayoutManager = new LinearLayoutManager(fragmentActivity);
        mRecyclerView.setLayoutManager(mLayoutManager);
        mRecyclerView.setHasFixedSize(true);

        String[] myDataset = {getString(R.string.TOURISTATTRACTIONS), getString(R.string.RESTAURANTS), getString(R.string.SHOPPINGPLACES)
                , getString(R.string.PUBLICPLACES), getString(R.string.EVENTS)};
        mAdapter = new MyAdapter(myDataset);

        new Thread(new Runnable() {
            @Override
            public void run() {
                fragmentActivity.runOnUiThread(new Runnable() {
                    @Override
                    public void run() {
                        mRecyclerView.setAdapter(mAdapter);

                    }
                });
            }
        }).start();

        mRecyclerView.addItemDecoration(new DividerItemDecoration( getActivity(),LinearLayoutManager.VERTICAL));

        mRecyclerView.addOnItemTouchListener(new RecyclerTouchListener(fragmentActivity, mRecyclerView, new RecyclerTouchListener.ClickListener() {
            @Override
            public void onClick(View view, int position) {

                Intent intent;
                switch (position)
                {
                    case 0:
                        intent = new Intent(fragmentActivity,View_Pager.class);
                        intent.putExtra(getString(R.string.TOURISTATTRACTIONS),0);
                        startActivity(intent);
                        break;
                    case 1:
                        intent = new Intent(fragmentActivity,View_Pager.class);
                        intent.putExtra(getString(R.string.RESTAURANTS),1);
                        startActivity(intent);
                        break;
                    case 2:
                        intent = new Intent(fragmentActivity,View_Pager.class);
                        intent.putExtra(getString(R.string.SHOPPINGPLACES),2);
                        startActivity(intent);
                        break;
                    case 3:
                        intent = new Intent(fragmentActivity,View_Pager.class);
                        intent.putExtra(getString(R.string.POPULARPLACES),3);
                        startActivity(intent);
                        break;
                    case 4:
                        intent = new Intent(fragmentActivity,View_Pager.class);
                        intent.putExtra(getString(R.string.BARS),4);
                        startActivity(intent);
                        break;
                  }
            }

            @Override
            public void onLongClick(View view, int position) {

            }
        }));

        return view;
    }
}
