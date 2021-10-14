package com.example.welcome;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button reset;
    Button test;
    TextView output;
    EditText nome;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        reset = findViewById(R.id.reset_button);
        nome = findViewById(R.id.name);
        test = findViewById(R.id.test_button);
        output = findViewById(R.id.output);
    }

    public void cancella(View view){
        nome.setText("");
    }

    public void mostra_testo(View view){
        output.setText("");
        output.setText(nome.getText());
    }

}