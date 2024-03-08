package com.juliana.entrega_dos;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

public class Pagina_animacion extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pagina_animacion);

        new Handler() .postDelayed(new Runnable() {
            @Override
            public void run() {
                startActivity(new Intent(Pagina_animacion.this, MainActivity.class));
                finish();
            }
        }, 9000);
    }
}