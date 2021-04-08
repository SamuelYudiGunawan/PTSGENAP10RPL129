package com.example.ptsgenap10rpl129;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class UH10RPL extends AppCompatActivity {

    RecyclerView mRecyclerView;
    MyAdapter myAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_u_h10_r_p_l);


        mRecyclerView = findViewById(R.id.recyclerView);
        mRecyclerView.setLayoutManager(new LinearLayoutManager(this));

        myAdapter = new MyAdapter(this, getMyList());
        mRecyclerView.setAdapter(myAdapter);
    }


    private ArrayList<Model> getMyList() {

        ArrayList<Model> models = new ArrayList<>();

        Model m = new Model();
        m.setTitle("newsfeed");
        m.setDescription("This is newsfeed description..");
        m.setImg(R.drawable.icon);
        models.add(m);

        m = new Model();
        m.setTitle("feedback");
        m.setDescription("This is business description..");
        m.setImg(R.drawable.feeedback);
        models.add(m);

        m = new Model();
        m.setTitle("notes");
        m.setDescription("This is notes description..");
        m.setImg(R.drawable.notes);
        models.add(m);

        m = new Model();
        m.setTitle("people");
        m.setDescription("This is people description..");
        m.setImg(R.drawable.people);
        models.add(m);

        m = new Model();
        m.setTitle("business");
        m.setDescription("This is business description..");
        m.setImg(R.drawable.business);
        models.add(m);

        return models;

    }
}