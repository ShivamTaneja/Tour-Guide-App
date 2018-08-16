package com.example.shivam.tourguide;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v7.widget.DividerItemDecoration;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;


public class tab1 extends Fragment {

    public tab1() {
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        final View view = inflater.inflate(R.layout.fragment_tab1, container, false);
        final FragmentActivity fragmentActivity = getActivity();
        RecyclerView mRecyclerView = view.findViewById(R.id.my_recycler_view_tab1);
        RecyclerView.LayoutManager mLayoutManager = new LinearLayoutManager(fragmentActivity);
        mRecyclerView.setLayoutManager(mLayoutManager);
        mRecyclerView.setHasFixedSize(true);

        Bundle bundle = this.getArguments();
        int value = bundle != null ? bundle.getInt("view_pager", -1) : -1;

        switch (value)
        {
            case 0:
                RecyclerView.Adapter mAdapter;
            {
                ArrayList<Data> data0 = new ArrayList<>();
                value = -1;
                data0.add(new Data(4 ,getString(R.string.sukhna_lake_desc), R.drawable.sukhna_lake,"7878784545"));
                data0.add(new Data((int) 3.5,getString(R.string.rock_garden_desc), R.drawable.rock_garden,"9696583215"));
                mAdapter = new MyAdapter_data(data0);
                mRecyclerView.setAdapter(mAdapter);
                mRecyclerView.addItemDecoration(new DividerItemDecoration( getActivity(),LinearLayoutManager.VERTICAL));
                break;
            }
            case 1:
            {
                ArrayList<Data> data1 = new ArrayList<>();
                value = -1;
                data1.add(new Data(5 ,getString(R.string.Jw_Marriot), R.drawable.jw_marriot,"6878784545"));
                mAdapter = new MyAdapter_data(data1);
                mRecyclerView.setAdapter(mAdapter);
                mRecyclerView.addItemDecoration(new DividerItemDecoration( getActivity(),LinearLayoutManager.VERTICAL));
                break;
            }
            case 2:
            {
                ArrayList<Data> data2 = new ArrayList<>();
                value = -1;
                data2.add(new Data(5 ,getString(R.string.elante_mall), R.drawable.elante_mall,"8578454535"));
                data2.add(new Data((int) 4.5,getString(R.string.sector17), R.drawable.sector17,"9396583215"));
                mAdapter = new MyAdapter_data(data2);
                mRecyclerView.setAdapter(mAdapter);
                mRecyclerView.addItemDecoration(new DividerItemDecoration( getActivity(),LinearLayoutManager.VERTICAL));
                break;
            }
            case 3:
            {
                ArrayList<Data> data3 = new ArrayList<>();
                value = -1;
                data3.add(new Data(3 ,getString(R.string.Garden_of_fragrance), R.drawable.garden_of_fragrance,"7878784545"));
                data3.add(new Data((int) 3.5,getString(R.string.Terraced_garden), R.drawable.terraced_garden,"9696583215"));
                mAdapter = new MyAdapter_data(data3);
                mRecyclerView.setAdapter(mAdapter);
                mRecyclerView.addItemDecoration(new DividerItemDecoration( getActivity(),LinearLayoutManager.VERTICAL));
                break;
            }
            case 4:
            {
                ArrayList<Data> data4 = new ArrayList<>();
                value = -1;
                data4.add(new Data(4 ,getString(R.string.Dance_competition), R.drawable.dance_competition,"6978784545"));
                mAdapter = new MyAdapter_data(data4);
                mRecyclerView.setAdapter(mAdapter);
                mRecyclerView.addItemDecoration(new DividerItemDecoration( getActivity(),LinearLayoutManager.VERTICAL));
                break;
            }
        }
        return view;
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
    }
}
