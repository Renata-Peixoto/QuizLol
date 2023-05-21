package com.example.telas;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    private Button btnProximo, btnSair;
    private EditText edtNome;

    private int pontos;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

           btnProximo = findViewById(R.id.btnResponde);
           edtNome = findViewById(R.id.editName);
           btnSair = findViewById(R.id.btnSair);


        edtNome.setOnKeyListener((view, i, keyEvent) -> {
            if (edtNome.getText().length() > 1) {
                btnProximo.setEnabled(true);

                return true;
            } else if (edtNome.getText().length() == 0) {
                btnProximo.setEnabled(false);
            }

               return false;
        });

    }

    public void tela2(View view){
        //Intent it = new Intent(getApplicationContext(),Tela2.class);
        Intent it = new Intent(this,Tela2.class);

        it.putExtra("user",edtNome.getText().toString());
        it.putExtra("pontos",pontos);
        startActivity(it);

    }
    public void  sair(View view){
        Intent it2 = new Intent(getApplicationContext(),MainActivity.class);
        finish();
    }

}