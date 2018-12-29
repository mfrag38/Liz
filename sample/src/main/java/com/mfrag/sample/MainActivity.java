package com.mfrag.sample;

import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.mfrag.liz.ThemedActivity;

public class MainActivity extends ThemedActivity {

    private RecyclerView recyclerViewSample;
    private SampleAdapter sampleAdapter;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init();
    }

    private void init() {
        recyclerViewSample = findViewById(R.id.recyclerView_sample);
        recyclerViewSample.setHasFixedSize(true);
        recyclerViewSample.setLayoutManager(new LinearLayoutManager(this));
        sampleAdapter = new SampleAdapter(this);
        setupView();
    }

    private void setupView() {
        recyclerViewSample.setAdapter(sampleAdapter);
    }

}