package com.example.myapplicationnicolasvillagran;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Random;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    private EditText pregunta;

    private ImageButton Ball;
    private TextView respuesta;
    private MediaPlayer mediaPlayer;
    private String [] respuestaArray={"Lo Dudo...","Es un poco tarde","Lo veo plausible",
            "Definitivamente","Hmmm... No estes tan seguro de eso", "Puede ser!!!","Tal vez, tal vez no"};



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

        mediaPlayer = MediaPlayer.create(MainActivity.this,R.raw.mysong);
        mediaPlayer.setLooping(true);
        mediaPlayer.start();
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