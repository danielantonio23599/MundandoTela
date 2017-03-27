package com.example.daniel.mundandotela;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import java.util.Random;

public class Calculadora3Activity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculadora3);
        etNome = (EditText) findViewById(R.id.editText);
        //r.id.editText e .textView apresentam erro!
        tvResultado = (TextView) findViewById(R.id.textView2);
    }
    private EditText etNome;
    private TextView tvResultado;


    public void onClickCalcular(View v) {
        if (!etNome.getText().toString().isEmpty()) {
            if (!etNome.getText().toString().equalsIgnoreCase("Galo") && (!etNome.getText().toString().equalsIgnoreCase("Atletico")) && (!etNome.getText().toString().equalsIgnoreCase("Atlético"))) {
                Random rand = new Random();
                int i = rand.nextInt(100);
                tvResultado.setText("As chances desse time ser campeão são de " + i + "%");
            } else {
                tvResultado.setText("Impossível!");
            }
        }
    }
    public void onClicBotao1(View v){
        String mensagem = "testando intent";

        //cria intent com a mensagem a ser passada para a nova tela
        Intent i = new Intent(this, CalculadoraActivity.class);
        i.putExtra("mensagem", mensagem);

        //inicia a nova intent(chamando outra tela cadastrada na Intent)
        startActivity(i);
    }


}
