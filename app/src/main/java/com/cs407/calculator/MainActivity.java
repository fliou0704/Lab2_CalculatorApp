package com.cs407.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    public void add(View view) {
        EditText number1 = (EditText) findViewById(R.id.editTextNumber);
        EditText number2 = (EditText) findViewById(R.id.editTextNumber2);

        try {
            float result = (float) Integer.parseInt(number1.getText().toString()) + Integer.parseInt(number2.getText().toString());
            goToActivity(String.valueOf(result));
        } catch (NumberFormatException nFE) {
            Toast.makeText(MainActivity.this, "You need two numbers to perform an operation!", Toast.LENGTH_LONG).show();
        }
    }
    public void subtract(View view) {
        EditText number1 = (EditText) findViewById(R.id.editTextNumber);
        EditText number2 = (EditText) findViewById(R.id.editTextNumber2);

        try {
            float result = (float) Integer.parseInt(number1.getText().toString()) - Integer.parseInt(number2.getText().toString());
            goToActivity(String.valueOf(result));
        } catch (NumberFormatException nFE) {
            Toast.makeText(MainActivity.this, "You need two numbers to perform an operation!", Toast.LENGTH_LONG).show();
        }
    }
    public void multiply(View view) {
        EditText number1 = (EditText) findViewById(R.id.editTextNumber);
        EditText number2 = (EditText) findViewById(R.id.editTextNumber2);

        try {
            float result = (float) Integer.parseInt(number1.getText().toString()) * Integer.parseInt(number2.getText().toString());
            goToActivity(String.valueOf(result));
        } catch (NumberFormatException nFE) {
            Toast.makeText(MainActivity.this, "You need two numbers to perform an operation!", Toast.LENGTH_LONG).show();
        }
    }
    public void divide(View view) {
        EditText number1 = (EditText) findViewById(R.id.editTextNumber);
        EditText number2 = (EditText) findViewById(R.id.editTextNumber2);

        try {
            float result = (float) Integer.parseInt(number1.getText().toString()) / Integer.parseInt(number2.getText().toString());
            goToActivity(String.valueOf(result));
        } catch (ArithmeticException aE) {
            Toast.makeText(MainActivity.this, "You cannot divide by zero!", Toast.LENGTH_LONG).show();
        } catch (NumberFormatException nFE) {
            Toast.makeText(MainActivity.this, "You need two numbers to perform an operation!", Toast.LENGTH_LONG).show();
        }
    }
    public void goToActivity(String s) {
        Intent intent = new Intent(this, Results.class);
        intent.putExtra("message",s);
        startActivity(intent);
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}