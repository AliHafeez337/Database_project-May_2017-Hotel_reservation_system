package com.example.admin.hostelreservation;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.*;
import android.view.*;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    private EditText txt1, txt2;
    private Button btn1, btn2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txt1 = (EditText)findViewById(R.id.txt1);
        txt2 = (EditText)findViewById(R.id.txt2);
        btn1 = (Button)findViewById(R.id.btn1);
        btn2 = (Button)findViewById(R.id.btn2);

        btn1.setOnClickListener(this);
        btn2.setOnClickListener(this);
    }
    public void onClick(View v){
        if(v.getId() == R.id.btn1){

            Intent in = new Intent("com.example.admin.hostelreservation.Logedin");
            startActivity(in);
        }
        if(v.getId()==R.id.btn2)
        {
            Intent in = new Intent("com.example.admin.hostelreservation.Create");
            startActivity(in);
        }
    }
}
