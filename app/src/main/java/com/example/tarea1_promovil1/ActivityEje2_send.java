package com.example.tarea1_promovil1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class ActivityEje2_send extends AppCompatActivity {

    private TextView nom,ape,edad,correo;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_eje2_send);

        nom= findViewById(R.id.datoNom);
        ape= findViewById(R.id.datoApe);
        edad= findViewById(R.id.datoEdad);
        correo= findViewById(R.id.datoCorreo);

        String nombre = getIntent().getStringExtra("llaveNom");
        String apellido = getIntent().getStringExtra("llaveApe");
        String Edad = getIntent().getStringExtra("llaveEd");
        String Correo = getIntent().getStringExtra("llaveEmail");

        nom.setText(nombre);
        ape.setText(apellido);
        edad.setText(Edad);
        correo.setText(Correo);





    }
}