package com.example.myapplicationnicolasvillagran;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Random;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    private ImageButton Ball;
    private TextView respuesta;
    private String [] respuestaArray={"Lo Dudo...","Es un poco tarde ¿No crees?","Lo veo plausible",
            "Definitivamente","Hmmm... No estes tan seguro de eso","No te hagas muchas expectativas respecto a ello..."};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //referencia de la imagen
        Ball = findViewById(R.id.btn);

        //referencia texto
        respuesta = findViewById(R.id.respuestavista);

        //Proceso
        Ball.setOnClickListener(this);
        Toast.makeText(MainActivity.this,"Haganme una Pregunta y Respondere...", Toast.LENGTH_SHORT).show();
    }
    @Override
    public void onClick(View v){

        //Switch

    switch(v.getId())
    {
        case R.id.btn:

        int rand = new Random().nextInt(respuestaArray.length);
        respuesta.setText(respuestaArray[rand]);

        break;
    }



    }
}