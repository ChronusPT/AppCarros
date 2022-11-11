package com.example.appcarros;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Menu extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);
    }
    public void saiDaki(View v){
        finish();
    }

    public void mostraCarros(View v){
        Intent it = new Intent(Menu.this,MostraCarros.class);
        startActivity(it);
        finish();

    }
    public void verPaises(View v){
        Intent it = new Intent(Menu.this,verPaises.class);
        startActivity(it);
        finish();

    }
}