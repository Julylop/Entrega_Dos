package com.juliana.entrega_dos;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;

public class MainActivity extends AppCompatActivity {

    Button boton_seno;
    Button boton_coseno;

    Button boton_perimetro;

    Button boton_area;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        boton_seno = findViewById(R.id.btnseno);
        boton_coseno = findViewById(R.id.btncoseno);
        boton_perimetro = findViewById(R.id.btnperimetro);
        boton_area = findViewById(R.id.btnarea);

        boton_seno.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, Pagina_Seno.class);
                startActivity(intent);
            }
        });
        boton_coseno.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, Pagina_Coseno.class);
                startActivity(intent);
            }
        });

        boton_perimetro.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, Pagina_Perimetro.class);
                startActivity(intent);
            }
        });

        boton_area.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, Pagina_Area.class);
                startActivity(intent);
            }
        });

    }
}