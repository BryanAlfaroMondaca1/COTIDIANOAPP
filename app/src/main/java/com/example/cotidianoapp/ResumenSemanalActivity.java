package com.example.cotidianoapp;

import android.os.Bundle;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import java.util.Random;

public class ResumenSemanalActivity extends AppCompatActivity {

    private String[] datosSemanal = {
            "Completaste 5 actividades esta semana.",
            "Tiempo de productividad: 15 horas.",
            "Tareas completadas: 8.",
            "Objetivos cumplidos: 4."
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_resumen_semanal);

        TextView resumenText = findViewById(R.id.resumenText);
        Random random = new Random();
        String resumen = datosSemanal[random.nextInt(datosSemanal.length)];
        resumenText.setText(resumen);
    }
}
