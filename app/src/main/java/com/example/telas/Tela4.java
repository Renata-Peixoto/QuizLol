package com.example.telas;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioGroup;
import android.widget.TextView;

public class Tela4 extends AppCompatActivity {
private Button btnResponde;
private RadioGroup rbgSyandra;
private TextView textTitle;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela4);
        btnResponde = findViewById(R.id.btnResponde);
        rbgSyandra = findViewById(R.id.rbgSyndra);
        textTitle = findViewById(R.id.textTitle);


    }
    public void OnRadioButtonClicked(View view) {
        btnResponde.setEnabled(true);
    }
    public void Confirm(View view){
        int idChecked = rbgSyandra.getCheckedRadioButtonId();

        int pontos = getIntent().getIntExtra("pontos", 0);
        String user = getIntent().getStringExtra("user");

        if (idChecked == R.id.rbSyandra) {
            pontos++;
        }
        textTitle.setText(String.valueOf(pontos));


        Intent it = new Intent(this, Tela5.class);

        it.putExtra("user", user);
        it.putExtra("pontos", pontos);

        startActivity(it);
        finish();
    }
}