package com.example.shivam.tourguide;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class MyAdapter_data extends RecyclerView.Adapter<MyAdapter_data.ViewHolder>  {

    private ArrayList<Data> data;

    public MyAdapter_data(ArrayList<Data> data) {
        this.data = data;
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {

        public TextView ratings,description, phone_no;
        public ImageView imageResourceId;

        public ViewHolder(View view) {
            super(view);
            ratings = view.findViewById(R.id.data_ratings);
            description = view.findViewById(R.id.data_decription);
            imageResourceId = view.findViewById(R.id.data_image);
            phone_no = view.findViewById(R.id.data_phone_number);
        }
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.list_item_data, parent, false);
        return  new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        Data data1 = data.get(position);
        holder.ratings.setText(new StringBuilder().append("Ratings :- ").append(String.valueOf(data1.getRatings())).toString());
        holder.description.setText( data1.getDescription());
        holder.imageResourceId.setImageResource(data1.getImageResourceId());
        holder.phone_no.setText(new StringBuilder().append("Phone number :- ").append(data1.getPhone_no()).toString());
    }

    @Override
    public int getItemCount() {
        return data.size();
    }
}
