package com.example.cotidianoapp;

import android.os.Bundle;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class AlertasActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_alertas);

        TextView alertasText = findViewById(R.id.alertasText);

        // Simulación de alertas
        String alertas = "Alerta 1: Tienes una actividad importante hoy.\n"
                + "Alerta 2: Recuerda tu cita a las 15:00 horas.\n"
                + "Alerta 3: Tarea pendiente en 2 días.";
        alertasText.setText(alertas);
    }
}
