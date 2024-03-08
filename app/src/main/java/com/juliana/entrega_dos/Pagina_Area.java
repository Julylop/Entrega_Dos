package com.juliana.entrega_dos;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Pagina_Area extends AppCompatActivity {

    EditText lado1, lado2_area;
    Button calcularArea;
    TextView resultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pagina_area);
        EditText lado1 = findViewById(R.id.txtlado1_area);
        EditText lado2 = findViewById(R.id.txtlado2_area);
        Button calcularArea = findViewById(R.id.btncalcular_area);
        TextView resultado = findViewById(R.id.lbladvertencia_area);


        calcularArea.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                String side1String = lado1.getText().toString();
                String side2String = lado2.getText().toString();
                if (!side1String.isEmpty() && !side2String.isEmpty()) {
                    double side1 = Double.parseDouble(side1String);
                    double side2 = Double.parseDouble(side2String);
                    double perimetro = side1 * side2;
                    Intent intent = new Intent(Pagina_Area.this, Pagina_resultados.class);
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