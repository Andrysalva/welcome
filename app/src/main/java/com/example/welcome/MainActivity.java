package com.example.welcome;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button reset;
    Button test;
    TextView output;
    EditText nome;
    Context context;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        reset = (Button) findViewById(R.id.reset_button);
        nome = (EditText) findViewById(R.id.name);
        test = (Button) findViewById(R.id.test_button);
        context = getApplicationContext();
    }

    public void cancella(View view){
        nome.setText("");
    }

    public void mostra_testo(View view){
        int duration = Toast.LENGTH_LONG;
        Toast toast = Toast.makeText(context,nome.getText(), duration);
        toast.show();
        nome.setText("");
    }
    public void cambia_schermata(View view){
        Intent intent = new Intent(context,MainActivity2.class);
        intent.putExtra("mes",nome.getEditableText().toString());
        startActivity(intent);
    }

}