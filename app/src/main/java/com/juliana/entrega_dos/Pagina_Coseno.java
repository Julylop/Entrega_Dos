package com.juliana.entrega_dos;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;

public class Pagina_Coseno extends AppCompatActivity {

    EditText angulo_coseno;
    Button calcular_coseno;
    TextView resultado;
    RadioButton radio_grados;
    RadioButton radio_radianes;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pagina_coseno);
        angulo_coseno = findViewById(R.id.txtangulo_coseno);
        calcular_coseno = findViewById(R.id.btncalcular_coseno);
        resultado = findViewById(R.id.lbladvertencia_coseno);
        radio_grados = findViewById(R.id.optiongrados_coseno);
        radio_radianes = findViewById(R.id.optionradianes_coseno);

        calcular_coseno.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                String anguloString = angulo_coseno.getText().toString();
                if (!anguloString.isEmpty()) {
                    double angulo = Double.parseDouble(anguloString);
                    double radianes = radio_grados.isChecked() ? Math.toRadians(angulo) : angulo;
                    double coseno = Math.cos(radianes);
                    Intent intent = new Intent(Pagina_Coseno.this, Pagina_resultados.class);
                    intent.putExtra("resultado", coseno);
                    startActivity(intent);
                }
                else {
                    resultado.setText("Ingresa un ángulo para poder continuar.");
                }
            }
        });
    }
}