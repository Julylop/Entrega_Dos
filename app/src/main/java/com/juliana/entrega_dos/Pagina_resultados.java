package com.juliana.entrega_dos;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class Pagina_resultados extends AppCompatActivity {

    TextView resultados;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pagina_resultados);

        resultados = findViewById(R.id.txtresultado);

        double resultado =getIntent().getDoubleExtra("resultado", 0.0);

        resultados.setText("Resultado: " + resultado);
    }
}