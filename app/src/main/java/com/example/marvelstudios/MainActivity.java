package com.example.marvelstudios;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void buscarHeroe(View view) {
        final TextView busqueda = (TextView) findViewById(R.id.txtBusqueda);
        Intent registros = new Intent(getBaseContext(), Registros.class);
        registros.putExtra("idheroe", busqueda.getText().toString());
        startActivity(registros);
    }
}









