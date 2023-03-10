package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private TextView texto_mostrado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //texto_mostrado = (TextView) findViewById(R.id.solucion);
        //texto_mostrado.setText("HOLA SOY JAVI");
    }

    public void boton_pulsado(View quien){
       Log.d("prueba", "EL BOTON SE HA PULSADO");
    }
}