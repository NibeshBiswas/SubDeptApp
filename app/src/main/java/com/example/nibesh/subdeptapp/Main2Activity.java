package com.example.nibesh.subdeptapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity {
    private TextView name,idt,dept,average;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);


        initt();
        Intent in=getIntent();

        name.setText(in.getStringExtra("eName"));
        idt.setText(in.getStringExtra("eId"));
        dept.setText(in.getStringExtra("eDept"));
        average.setText(in.getStringExtra("averagemark"));



    }

    public void initt(){
        name=(TextView)findViewById(R.id.lbl_tvName);
        idt=(TextView)findViewById(R.id.lbl_tvID);
        dept=(TextView)findViewById(R.id.lbl_tvDept);
        average=(TextView)findViewById(R.id.lbl_Average);
    }



}