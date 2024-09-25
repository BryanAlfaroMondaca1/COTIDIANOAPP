package com.example.cotidianoapp;

import android.os.Bundle;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import java.util.Random;

public class RecomendacionesActivity extends AppCompatActivity {

    private String[] recomendaciones = {
            "Planifica tu día la noche anterior.",
            "Usa una lista de tareas para organizarte.",
            "Establece prioridades claras.",
            "Evita distracciones mientras trabajas."
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recomendaciones);

        TextView recomendacionesText = findViewById(R.id.recomendacionesText);
        Random random = new Random();
        String recomendacion = recomendaciones[random.nextInt(recomendaciones.length)];
        recomendacionesText.setText(recomendacion);
    }
}
