package com.example.appcarros;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

public class Conversor extends AppCompatActivity {

    // declarar arrays com marcas de carros e outro com as img.
    private String [] uniForca = new String [] {"0 - Kilograma Força", "1 - Joule", "2 - Dyne", "3 - Newton" };

    // Criar variaveis do tipo dos elementos existentes no xml.

    private TextView entry;
    private TextView result;
    private Spinner sp1;
    private Spinner sp2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_conversor);

        // associar variaveis JaVa com os respetivos elementos xml

        entry = findViewById(R.id.ctxInsrt);
        result = findViewById(R.id.txtSaida);
        sp1 = findViewById(R.id.spinnerA);
        sp2 = findViewById(R.id.spinnerB);

        // construir array adapter e carregar no spinner
        ArrayAdapter<String> valores =
                new ArrayAdapter<String>(this,android.R.layout.simple_spinner_dropdown_item,uniForca);

        //associar o array ao spinner
        sp1.setAdapter(valores);
        sp2.setAdapter(valores);

        //aplicar codigo de erro aos eventos
        sp1.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                switch (i) {
                    case 0:

                        break;

                }
            }
            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });



            }

}