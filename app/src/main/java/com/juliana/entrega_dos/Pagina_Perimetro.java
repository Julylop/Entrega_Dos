package com.juliana.entrega_dos;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Pagina_Perimetro extends AppCompatActivity {
    EditText lado1, lado2;
    Button calcularperimetro;
    TextView resultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pagina_perimetro);
        EditText lado1 = findViewById(R.id.txtlado1);
        EditText lado2 = findViewById(R.id.txtlado2);
        Button calcularperimetro = findViewById(R.id.btncalcularperimetro);
        TextView resultado = findViewById(R.id.lbladvertenciaperimetro);


        calcularperimetro.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                String side1String = lado1.getText().toString();
                String side2String = lado2.getText().toString();
                if (!side1String.isEmpty() && !side2String.isEmpty()) {
                    double side1 = Double.parseDouble(side1String);
                    double side2 = Double.parseDouble(side2String);
                    double perimetro = (2*side1) + (2*side2);
                    Intent intent = new Intent(Pagina_Perimetro.this, Pagina_resultados.class);
                    intent.putExtra("resultado", perimetro);
                    startActivity(intent);
                }
                else {
                    resultado.setText("Por favor, ingrese las longitudes de cada lado del rectángulo para hacer el cálculo.");
                }
            }
        });
    }
}