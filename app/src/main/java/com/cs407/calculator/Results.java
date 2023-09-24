package com.cs407.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class Results extends AppCompatActivity {

    TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_results);
        textView = (TextView) findViewById(R.id.textViewR);
        Intent intent = getIntent();
        String str = intent.getStringExtra("message");
        textView.setText(str);
    }
}