package com.example.zahid.multirecyclerview.adapters;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;

import com.example.zahid.multirecyclerview.R;

/**
 * Created by Zahid on 23/08/2019.
 */

public class Vertical_List_Adapter extends RecyclerView.Adapter<Vertical_List_Adapter.MyViewHolder> {

    Context context;

    public class MyViewHolder extends RecyclerView.ViewHolder {

        RecyclerView recycle_list_horizontal;
        RecyclerView.LayoutManager mLayoutManager;
        Horizontal_List_Adapter horizontal_list_adapter;

        public MyViewHolder(View view) {
            super(view);

            context = view.getContext();

            recycle_list_horizontal = (RecyclerView) view.findViewById(R.id.recycle_list_horizontal);
            mLayoutManager = new LinearLayoutManager(context,LinearLayoutManager.HORIZONTAL,false);
            recycle_list_horizontal.setLayoutManager(mLayoutManager);
            recycle_list_horizontal.setItemAnimator(new DefaultItemAnimator());
            String [] countries = {"Pakistan","India","USA","China","England","Russia"};
            horizontal_list_adapter = new Horizontal_List_Adapter(countries);

        }
    }





    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext()).inflate(R.layout.vertical_recyeler_list, parent, false);

        MyViewHolder holder = new MyViewHolder(itemView);

        return holder;
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {

       holder.recycle_list_horizontal.setAdapter(holder.horizontal_list_adapter);


    }

    @Override
    public int getItemCount() {
        return 20;
    }


}
