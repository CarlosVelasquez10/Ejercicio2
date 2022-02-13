package com.example.tarea1_promovil1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Ejercicio2 extends AppCompatActivity {

    private EditText Nombre,Apellido,Edad,Correo;
    private Button btnSend;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ejercicio2);

        Nombre=findViewById(R.id.txtNombre);
        Apellido= findViewById(R.id.txtApellido);
        Edad=findViewById(R.id.txtEdad);
        Correo=findViewById(R.id.txtCorreo);

        btnSend=findViewById(R.id.btnEnviarInfo);

        btnSend.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String nombre = Nombre.getText().toString();
                String apellido = Apellido.getText().toString();
                String edad = Edad.getText().toString();
                String correo = Correo.getText().toString();

                Intent intent = new Intent(Ejercicio2.this,ActivityEje2_send.class);
                intent.putExtra("llaveNom", nombre);
                intent.putExtra("llaveApe", apellido);
                intent.putExtra("llaveEd", edad);
                intent.putExtra("llaveEmail", correo);
                startActivity(intent);



            }
        });
    }
}