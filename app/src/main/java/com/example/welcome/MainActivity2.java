package com.example.welcome;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {
    TextView testo2;
    Intent i;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        testo2 = (TextView) findViewById(R.id.testo2);
        i = getIntent();

        testo2.setText(i.getStringExtra("mes"));
    }
}