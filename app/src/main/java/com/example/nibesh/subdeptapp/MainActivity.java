package com.example.nibesh.subdeptapp;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    private EditText eName,eId,eDept,eSub1,eSub2,eSub3;
    private Button bt;


    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        init();


        bt.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View view) {
                Intent in=new Intent(MainActivity.this,Main2Activity.class);

                String nam=eName.getText().toString();
                in.putExtra("eName",nam);

                String id=eId.getText().toString();
                in.putExtra("eId",id);

                String dept=eDept.getText().toString();
                in.putExtra("eDept",dept);

                String sub1=eSub1.getText().toString();
                Double subject1=Double.parseDouble(sub1);
                in.putExtra("eSub1",sub1);

                String sub2=eSub2.getText().toString();
                Double subject2=Double.parseDouble(sub2);
                in.putExtra("eSub2",sub2);

                String sub3=eSub3.getText().toString();
                double subject3=Double.parseDouble(sub3);
                in.putExtra("eSub3",sub3);

                double averageofmark=((subject1+subject2+subject3)/3);
                String result=Double.toString(averageofmark);
                in.putExtra("averagemark",result);

                startActivity(in);

            }
        });


    }
     public void init() {
         eName = (EditText) findViewById(R.id.etName);
         eId = (EditText) findViewById(R.id.etID);
         eDept = (EditText) findViewById(R.id.etDept);
         eSub1 = (EditText) findViewById(R.id.etSub1);
         eSub2 = (EditText) findViewById(R.id.etSub2);
         eSub3 = (EditText) findViewById(R.id.etSub3);

          bt = (Button) findViewById(R.id.button);
     }



}
