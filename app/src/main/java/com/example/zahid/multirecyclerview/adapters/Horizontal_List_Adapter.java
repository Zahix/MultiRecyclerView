package com.example.zahid.multirecyclerview.adapters;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.zahid.multirecyclerview.R;

/**
 * Created by Zahid on 23/08/2019.
 */

public class Horizontal_List_Adapter extends RecyclerView.Adapter<Horizontal_List_Adapter.MyViewHolder> {

    Context context;


    public class MyViewHolder extends RecyclerView.ViewHolder {

        TextView txt_country;

        public MyViewHolder(View view) {
            super(view);

            context = view.getContext();

            txt_country = (TextView) view.findViewById(R.id.txt_country);
        }
    }
    String []Countries;
    public Horizontal_List_Adapter(String[] countriesData){
        this.Countries = countriesData;

    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext()).inflate(R.layout.horizontal_recyeler_list, parent, false);

        MyViewHolder holder = new MyViewHolder(itemView);
        return holder;
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        String countryTitle = Countries[position];
        holder.txt_country.setText(countryTitle);

    }

    @Override
    public int getItemCount() {
        return Countries.length;
    }




}
