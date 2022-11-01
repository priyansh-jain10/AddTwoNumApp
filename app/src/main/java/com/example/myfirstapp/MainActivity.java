package com.example.myfirstapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private Button submitButton;
    private EditText num1;
    private EditText num2;
    private TextView resultText;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        submitButton=findViewById(R.id.button);
        num1=findViewById(R.id.editText);
        num2=findViewById(R.id.editText2);
        resultText=findViewById(R.id.result);

        submitButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String a=num1.getText().toString();
                int number1=Integer.parseInt(a);
                String b=num2.getText().toString();
                int number2=Integer.parseInt(b);
                int result=number2+number1;
                resultText.setText(String.valueOf(result));
            }
        });



    }
}