package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private TextView texto_mostrado;
    private EditText texto_introducido;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        texto_mostrado = (TextView) findViewById(R.id.textView2);
        texto_introducido = (EditText) findViewById(R.id.editTextTextPersonName);
        //texto_mostrado.setText("HOLA SOY JAVI");
    }

    public void boton_pulsado(View quien){
        String texto = String.valueOf(texto_introducido.getText());

       Log.d("prueba", texto);
    }
}