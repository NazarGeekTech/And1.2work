package com.example.myhomework2;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView ruchka ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

         ruchka = findViewById(R.id.knopka);
        EditText topor = findViewById(R.id.text1);
        EditText platok = findViewById(R.id.text2);
        EditText parta =  findViewById(R.id.text3);
        Button doska = findViewById(R.id.baton);
        doska.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double bir= Double.parseDouble(topor.getText().toString());
                double vtoroi= Double.parseDouble(platok.getText().toString());
                double tretiy= Double.parseDouble(parta.getText().toString());
                double suma = bir+vtoroi+tretiy;
                String bumaga = String.valueOf(suma);

                ruchka.setText(bumaga);

            }
        });
    }

    @Override
    protected void onRestoreInstanceState(@NonNull Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);
        String bolo = savedInstanceState.getString("klych");
        ruchka.setText(bolo);
    }

    @Override
    protected void onSaveInstanceState(@NonNull Bundle outState) {
        super.onSaveInstanceState(outState);
        outState.putString("klych" , ruchka.getText().toString());
    }
}