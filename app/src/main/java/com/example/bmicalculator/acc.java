package com.example.bmicalculator;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;



public class acc extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.ac);

        Intent intent=getIntent();
        String num=intent.getStringExtra("text");
        String num2=intent.getStringExtra("num");
       // String num2=intent.getStringExtra("Weight");

        TextView tv=(TextView) findViewById(R.id.textView_getBMI);
        tv.setText(num);
       // TextView tv2=(TextView) findViewById(R.id.textView2);
        //tv.setText(num2);
    }
}