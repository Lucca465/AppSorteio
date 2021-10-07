package com.example.appsorteio;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void botaoSortearClick(View view){
        TextView texto = findViewById(R.id.textoResultado);
        int resultado = new Random().nextInt(11);
        texto.setText("Número sorteado: " + resultado);
    }

}