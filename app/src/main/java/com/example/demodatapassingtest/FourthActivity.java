package com.example.demodatapassingtest;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class FourthActivity extends AppCompatActivity {

    TextView doubletv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fourth);

        doubletv = findViewById(R.id.textView);
        Intent intentReceived = getIntent();
        Double value = intentReceived.getDoubleExtra("value", 0.0);
        doubletv.setText("Double value received is: " + value);

    }
}