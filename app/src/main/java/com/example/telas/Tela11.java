package com.example.telas;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioGroup;
import android.widget.TextView;

public class Tela11 extends AppCompatActivity {
    private Button btnResponde;
    private RadioGroup rbgSenna;
    private TextView textTitle;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela11);
        btnResponde = findViewById(R.id.btnResponde);
        rbgSenna = findViewById(R.id.rbgSenna);
        textTitle = findViewById(R.id.textTitle);

    }
    public void OnRadioButtonClicked(View view) {
        btnResponde.setEnabled(true);
    }
    public void Confirm(View view) {
        int idChecked =rbgSenna.getCheckedRadioButtonId();

        int pontos = getIntent().getIntExtra("pontos", 0);
        String user = getIntent().getStringExtra("user");

        if (idChecked == R.id.rbSenna) {
            pontos++;
        }
        textTitle.setText(String.valueOf(pontos));


        Intent it = new Intent(this, Final.class);

        it.putExtra("user", user);
        it.putExtra("pontos", pontos);

        startActivity(it);
        finish();
    }
}