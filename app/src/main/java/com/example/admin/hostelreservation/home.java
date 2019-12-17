package com.example.admin.hostelreservation;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class home extends AppCompatActivity  implements View.OnClickListener{
    private Button btn1, btn2,btn3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        btn1 = (Button)findViewById(R.id.btn1);
        btn2 = (Button)findViewById(R.id.btn2);
        btn3 = (Button)findViewById(R.id.btn3);
        btn1.setOnClickListener(this);
        btn2.setOnClickListener(this);
        btn3.setOnClickListener(this);
    }
        public void onClick(View v){
            if(v.getId() == R.id.btn1){

                Intent in = new Intent("com.example.admin.hostelreservation.MainActivity");
                startActivity(in);
            }
            if(v.getId()==R.id.btn2)
            {
                Intent in = new Intent("com.example.admin.hostelreservation.Logedin");
                startActivity(in);
            }
            if(v.getId()==R.id.btn3)
            {
                Intent in = new Intent("com.example.admin.hostelreservation.Create");
                startActivity(in);
            }
        }
    }

