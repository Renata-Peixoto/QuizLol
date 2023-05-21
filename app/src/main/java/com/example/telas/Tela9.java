package com.example.telas;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioGroup;
import android.widget.TextView;

public class Tela9 extends AppCompatActivity {
private Button btnResponde;
private RadioGroup rbgJhin;
private TextView textTitle;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela9);
        btnResponde = findViewById(R.id.btnResponde);
        rbgJhin = findViewById(R.id.rbgJhin);
        textTitle = findViewById(R.id.textTitle);

    }
    public void OnRadioButtonClicked(View view) {
        btnResponde.setEnabled(true);
    }
    public void Confirm(View view) {
        int idChecked =rbgJhin.getCheckedRadioButtonId();

        int pontos = getIntent().getIntExtra("pontos", 0);
        String user = getIntent().getStringExtra("user");

        if (idChecked == R.id.rbJhin) {
            pontos++;
        }
        textTitle.setText(String.valueOf(pontos));


        Intent it = new Intent(this, Tela10.class);

        it.putExtra("user", user);
        it.putExtra("pontos", pontos);

        startActivity(it);
        finish();
    }
}