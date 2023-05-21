package com.example.telas;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioGroup;

public class Tela2 extends AppCompatActivity {
    private Button btnResponde;
    private RadioGroup rbgAhri;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela2);

        btnResponde = findViewById(R.id.btnResponde);
        rbgAhri= findViewById(R.id.rbgAhri);
        //voltar = findViewById(R.id.btnVoltar);
    }
    public void OnRadioButtonClicked(View view) {
        btnResponde.setEnabled(true);
    }
    public void Confirm(View view){
        int idChecked = rbgAhri.getCheckedRadioButtonId();

        int pontos = getIntent().getIntExtra("pontos", 0);
        String user = getIntent().getStringExtra("user");

        if (idChecked == R.id.rbAhri) {
            pontos++;
        }

        Intent it = new Intent(this, Tela3.class);

        it.putExtra("user", user);
        it.putExtra("pontos", pontos);

        startActivity(it);
        finish();
    }

}