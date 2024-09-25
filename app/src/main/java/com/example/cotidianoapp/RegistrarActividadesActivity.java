package com.example.cotidianoapp;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;

public class RegistrarActividadesActivity extends AppCompatActivity {

    private EditText actividadInput;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registrar_actividades);

        actividadInput = findViewById(R.id.actividadInput);
        Button guardarButton = findViewById(R.id.guardarButton);

        guardarButton.setOnClickListener(v -> {
            String actividad = actividadInput.getText().toString();
            Toast.makeText(RegistrarActividadesActivity.this, "Actividad: " + actividad, Toast.LENGTH_SHORT).show();
        });
    }
}
