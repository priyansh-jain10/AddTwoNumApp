package com.example.myfirstapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {
    private TextView resulttext;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        resulttext=findViewById(R.id.result_second);
        Bundle bundle=getIntent().getExtras();
        String result=bundle.getString("result");
        resulttext.setText(result);
    }
}