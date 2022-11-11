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


    }

    public void convertUni (View v){

    int op1 = sp1.getSelectedItemPosition();
    int op2 = sp2.getSelectedItemPosition();
    double value =  Double.parseDouble(entry.getText().toString());


        switch (op1) {
            case 0:
                switch (op2) {
                    case 0:
                        result.setText(value + " Kg Força");
                        break;
                    case 1:
                        result.setText(value * 9.81 + " Joules/m");
                        break;
                    case 2:
                        result.setText(value * 980665 + " Dyne");
                        break;
                    case 3:
                        result.setText(value * 9.81 + " Newtons");
                        break;
                }
                break;

            case 1:
                switch (op2) {
                    case 0:
                        result.setText(value * 0.102 + " Kg Força");
                        break;
                    case 1:
                        result.setText(value + " Joules/m");
                        break;
                    case 2:
                        result.setText(value * 10000000 + " Dyne/cm3");
                        break;
                    case 3:
                        result.setText(value * 1 + " Newtons/m");
                        break;
                }
                break;

            case 2:
                switch (op2) {
                    case 0:
                        result.setText(value * 0.000001 + " Kg Força");
                        break;
                    case 1:
                        result.setText(value * 0.00001 + " Joules/m");
                        break;
                    case 2:
                        result.setText(value + " Dyne/cm3");
                        break;
                    case 3:
                        result.setText(value * 0.00001 + " Newtons/m");
                        break;
                }
                break;

            case 3:
                switch (op2) {
                    case 0:
                        result.setText(value * 0.102 + " Kg Força");
                        break;
                    case 1:
                        result.setText(value * 1 + " Joules/m");
                        break;
                    case 2:
                        result.setText(value * 100000 + " Dyne/cm3");
                        break;
                    case 3:
                        result.setText(value + " Newtons/m");
                        break;
                }
                break;

        }
    }

    public void voltaAoMenu (View v) {
        Intent it = new Intent(Conversor.this, Menu.class);
        startActivity(it);
        finish();
    }



}