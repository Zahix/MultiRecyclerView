package com.example.zahid.multirecyclerview;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.example.zahid.multirecyclerview.adapters.Vertical_List_Adapter;

public class MainActivity extends AppCompatActivity {

    Context context;

    private RecyclerView recyclerView;
    private RecyclerView.LayoutManager mLayoutManager;
    public Vertical_List_Adapter vertical_list_adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);




    }

    @Override
    protected void onResume() {
        super.onResume();

        context = this;

        recyclerView = (RecyclerView) findViewById(R.id.recycle_list_vertical);
        mLayoutManager = new LinearLayoutManager(getApplicationContext());

        recyclerView.setLayoutManager(mLayoutManager);
        recyclerView.setItemAnimator(new DefaultItemAnimator());

        vertical_list_adapter = new Vertical_List_Adapter();
        recyclerView.setAdapter(vertical_list_adapter);
    }
}
