package com.example.appcarros;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

public class MostraCarros extends AppCompatActivity {

    // declarar arrays com marcas de carros e outro com as img.
    private String [] marcaCarros = new String [] {"BMW", "Ferrari", "Mercedes Benz", "Porche"};
    private int [] imagens = {R.drawable.bmw, R.drawable.ferrari, R.drawable.mercedes, R.drawable.porche};

    // Criar variaveis do tipo dos elementos existentes no xml.
    private ImageView imgCarros;
    private TextView marca;
    private Spinner sp;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mostra_carros);

        // associar variaveis JaVa com os respetivos elementos xml
        imgCarros = findViewById(R.id.ctxImg);
        marca = findViewById(R.id.txtCarro);
        sp = findViewById(R.id.spinner);

        // construir array adapter e carregar no spinner
        ArrayAdapter <String> valores =
                new ArrayAdapter<String>(this,android.R.layout.simple_spinner_dropdown_item,marcaCarros);

        //associar o array ao spinner
        sp.setAdapter(valores);
        //aplicar codigo de erro aos eventos
        sp.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                imgCarros.setImageResource(imagens[i]);
                marca.setText(sp.getSelectedItem()+"");
                Toast.makeText(MostraCarros.this, sp.getSelectedItem()+"",Toast.LENGTH_LONG).show();
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });

    }
    public void voltaAoMenu (View v){
        Intent it = new Intent(MostraCarros.this,Menu.class);
        startActivity(it);
        finish();
    }
}