package com.example.marvelstudios;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;


public class DiagramaBarrasActivity extends AppCompatActivity {

    /*String  nombre_heroe = "";
    public BarChart graficoBarras;*/


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_diagrama_barras);
        /*Intent heroelista = getIntent();
        this.nombre_heroe= (String)heroelista.getExtras().get("nombre_heroe");
        this.iniciarGrafico();*/
    }


    /*public void iniciarGrafico() {
        graficoBarras = findViewById(R.id.barChart);
        graficoBarras.getDescription().setEnabled(false);
        graficoBarras.setMaxVisibleValueCount(60);
        graficoBarras.setPinchZoom(false);
        graficoBarras.setDrawBarShadow(false);
        graficoBarras.setDrawGridBackground(false);
        XAxis xAxis = graficoBarras.getXAxis();
        xAxis.setPosition(XAxis.XAxisPosition.BOTTOM);
        xAxis.setDrawGridLines(false);
        graficoBarras.getAxisLeft().setDrawGridLines(false);
        graficoBarras.animateY(1500);
        graficoBarras.getLegend().setEnabled(false);
    }*/
}
