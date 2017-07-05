package com.example.samminton.testapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    protected void calculate(View v){
        EditText input = (EditText) findViewById(R.id.etNum);
        TextView output = (TextView) findViewById(R.id.tvOutput);
    }
}
