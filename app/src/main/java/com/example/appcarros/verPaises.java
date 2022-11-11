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

public class verPaises extends AppCompatActivity {

    // declarar arrays com marcas de carros e outro com as img.
    private String [] nomePaises = new String [] {"Portugal", "Japão", "Egipto", "Morioh"};
    private String [] areaPaises = new String [] {"92,212 km2 ", "377,975 km2", "1,010,408  km2", "786.307 km2"};
    private String [] popPaises = new String [] {"10,352,042 hab.", "124,214,766 hab.", "107,770,524 hab.", "58,713 hab."};
    private int [] imagens = {R.drawable.portugal, R.drawable.japao, R.drawable.egipto, R.drawable.morioh};

    // Criar variaveis do tipo dos elementos existentes no xml.
    private ImageView imgPaises;
    private TextView areaP;
    private TextView popP;
    private Spinner sp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ver_paises);

        // associar variaveis JaVa com os respetivos elementos xml
        imgPaises = findViewById(R.id.ctxImg2);
        areaP = findViewById(R.id.txtName);
        popP = findViewById(R.id.txtPop);
        sp = findViewById(R.id.ctxSpinnerA);

        // construir array adapter e carregar no spinner
        ArrayAdapter<String> valores =
                new ArrayAdapter<String>(this,android.R.layout.simple_spinner_dropdown_item,nomePaises);

        //associar o array ao spinner
        sp.setAdapter(valores);

        //aplicar codigo de erro aos eventos
        sp.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                imgPaises.setImageResource(imagens[i]);
                areaP.setText("Área: "+areaPaises[i]);
                popP.setText("População: "+popPaises[i]);
                Toast.makeText(verPaises.this, sp.getSelectedItem()+"",Toast.LENGTH_LONG).show();
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });

    }
    public void voltaAoMenu (View v) {
        Intent it = new Intent(verPaises.this, Menu.class);
        startActivity(it);
        finish();
    }
}