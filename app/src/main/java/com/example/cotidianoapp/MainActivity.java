package com.example.cotidianoapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btnRegistrar = findViewById(R.id.btnRegistrar);
        Button btnCalendario = findViewById(R.id.btnCalendario);
        Button btnResumen = findViewById(R.id.btnResumen);
        Button btnRecomendaciones = findViewById(R.id.btnRecomendaciones);
        Button btnAlertas = findViewById(R.id.btnAlertas); // Botón para la nueva interfaz de alertas
        Button btnDiaIdeal = findViewById(R.id.btnDiaIdeal); // Botón para la nueva interfaz de día ideal

        btnRegistrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, RegistrarActividadesActivity.class));
            }
        });

        btnCalendario.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, CalendarioActivity.class));
            }
        });

        btnResumen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, ResumenSemanalActivity.class));
            }
        });

        btnRecomendaciones.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, RecomendacionesActivity.class));
            }
        });

        btnAlertas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, AlertasActivity.class));
            }
        });

        btnDiaIdeal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, DiaIdealActivity.class));
            }
        });
    }
}
