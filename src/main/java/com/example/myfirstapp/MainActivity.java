package com.example.myfirstapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import java.time.LocalDate;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void nextActivity(View view) {
        Intent intent = new Intent(this, EditDateActivity.class);

        EditText dia = (EditText) findViewById(R.id.dia);
        EditText mes = (EditText) findViewById(R.id.mes);
        EditText ano = (EditText) findViewById(R.id.ano);

        intent.putExtra("dia", Integer.parseInt(dia.getText().toString()));
        intent.putExtra("mes", Integer.parseInt(mes.getText().toString()));
        intent.putExtra("ano", Integer.parseInt(ano.getText().toString()));

        startActivity(intent);
    }

}