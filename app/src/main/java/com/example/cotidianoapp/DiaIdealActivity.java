package com.example.cotidianoapp;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;

public class DiaIdealActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dia_ideal);

        Button btnDia1 = findViewById(R.id.btnDia1);
        Button btnDia2 = findViewById(R.id.btnDia2);
        Button btnDia3 = findViewById(R.id.btnDia3);

        btnDia1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(DiaIdealActivity.this, "Has elegido el Día 1: Buen clima y poca carga de trabajo.", Toast.LENGTH_SHORT).show();
            }
        });

        btnDia2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(DiaIdealActivity.this, "Has elegido el Día 2: Ideal para terminar pendientes.", Toast.LENGTH_SHORT).show();
            }
        });

        btnDia3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(DiaIdealActivity.this, "Has elegido el Día 3: Día relajante para actividades personales.", Toast.LENGTH_SHORT).show();
            }
        });
    }
}
