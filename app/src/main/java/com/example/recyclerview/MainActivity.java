package com.example.recyclerview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    RecyclerView rcv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rcv = (RecyclerView)findViewById(R.id.rclr);
        rcv.setLayoutManager(new LinearLayoutManager(this));
        String arr[] = {"Android" , "kotline" , "java", "firebase" , "Android" , "kotline" , "java", "firebase","Android" , "kotline" , "java", "firebase" };
        rcv.setAdapter(new myAdapter(arr));
    }


}