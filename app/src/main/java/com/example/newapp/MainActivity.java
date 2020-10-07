package com.example.newapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    public void clickFunction(View view){

        EditText name = (EditText) findViewById(R.id.editPersonName);
        EditText password = (EditText) findViewById(R.id.editTextTextPassword);
        Log.i("name", name.getText().toString());
        Log.i("password",password.getText().toString());
        Toast.makeText(this, "Hi " + name.getText().toString(), Toast.LENGTH_SHORT).show();
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}