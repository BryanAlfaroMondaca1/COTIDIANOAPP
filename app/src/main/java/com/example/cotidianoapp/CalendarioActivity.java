package com.example.cotidianoapp;

import android.os.Bundle;
import android.widget.CalendarView;
import android.widget.Toast; 
import androidx.appcompat.app.AppCompatActivity;

public class CalendarioActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calendario);

        CalendarView calendarView = findViewById(R.id.calendarView);
        calendarView.setOnDateChangeListener((view, year, month, dayOfMonth) -> {
            String fechaSeleccionada = dayOfMonth + "/" + (month + 1) + "/" + year;
            Toast.makeText(CalendarioActivity.this, "Fecha seleccionada: " + fechaSeleccionada, Toast.LENGTH_SHORT).show();
        });
    }
}
