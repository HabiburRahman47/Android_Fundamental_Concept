package com.hrgroup.recyclerview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.Arrays;

public class MainActivity extends AppCompatActivity {

    ArrayList<String> cityNames = new ArrayList<>(Arrays.asList("Notun Howli","Damurhuda","Chuadanga","Khulna","Bangladesh","Kushtia","Meherpur","Jhenaidhah","Karpashdanga","Dugdugi","Joyrampur","Bastopur","Shubulpur","Dhaka","Rajshahi","Chittagong","Coxbazar","Darshana"));

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RecyclerView recyclerView = findViewById(R.id.recycleView);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        MyAdapter myAdapter = new MyAdapter(this,cityNames);
        recyclerView.setAdapter(myAdapter);
    }
}