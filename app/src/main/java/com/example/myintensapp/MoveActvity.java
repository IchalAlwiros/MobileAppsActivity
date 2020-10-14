package com.example.myintensapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class MoveActvity extends AppCompatActivity {

    private TextView textView;
    private String ical2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_move_actvity);

        textView = findViewById(R.id.textextra);
        Intent moveIntent = getIntent();

        ical2 = moveIntent.getStringExtra("kunci");
        textView.setText(ical2);

    }
}