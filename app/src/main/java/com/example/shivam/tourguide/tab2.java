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

public class tab2 extends Fragment {

    public tab2() {
    }
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        final View view = inflater.inflate(R.layout.fragment_tab2, container, false);
        final FragmentActivity fragmentActivity = getActivity();
        RecyclerView mRecyclerView = view.findViewById(R.id.my_recycler_view_tab2);
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
                ArrayList<Data> data = new ArrayList<>();
                value = -1;
                data.add(new Data(4 ,getString(R.string.Government_Museum_and_Art_Galley), R.drawable.government_museum_and_art_gallery,"7878784545"));
                data.add(new Data((int) 3.7,getString(R.string.International_dolls_museum), R.drawable.international_dolls_museum,"9696583215"));
                mAdapter = new MyAdapter_data(data);
                mRecyclerView.setAdapter(mAdapter);
                mRecyclerView.addItemDecoration(new DividerItemDecoration( getActivity(),LinearLayoutManager.VERTICAL));
                break;
            }
            case 1:
            {
                ArrayList<Data> data = new ArrayList<>();
                value = -1;
                data.add(new Data((int)3.2 ,getString(R.string.Maya_Restaurant), R.drawable.maya_restaurant,"6878784545"));
                data.add(new Data((int) 3.7,getString(R.string.Sukhvir), R.drawable.sukhvir,"9696583215"));
                mAdapter = new MyAdapter_data(data);
                mRecyclerView.setAdapter(mAdapter);
                mRecyclerView.addItemDecoration(new DividerItemDecoration( getActivity(),LinearLayoutManager.VERTICAL));
                break;
            }
            case 2:
            {
                break;
            }
            case 3:
            {
                break;
            }
            case 4:
            {
                ArrayList<Data> data = new ArrayList<>();
                value = -1;
                data.add(new Data((int)4.7 ,getString(R.string.Pubg_Tournament), R.drawable.pubg,"6978784545"));
                mAdapter = new MyAdapter_data(data);
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
