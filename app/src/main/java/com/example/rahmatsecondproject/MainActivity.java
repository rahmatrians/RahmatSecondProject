package com.example.rahmatsecondproject;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.content.Intent;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EditText e1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        e1 = (EditText)findViewById(R.id.edit1);
    }

    public void doSomething(View view) {
        Intent i1 = new Intent(this,SecondActivity.class);
        i1.putExtra("user",e1.getText().toString());
        startActivity(i1);
    }
}