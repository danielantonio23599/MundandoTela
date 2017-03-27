package com.example.daniel.mundandotela;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class Calculadora1Activity extends AppCompatActivity {
    private EditText v1;
    private EditText v2;
    private TextView tv;
    private float resultado;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculadora1);
        v1 = (EditText) findViewById(R.id.editText);
        v2 = (EditText) findViewById(R.id.editText2);
        tv = (TextView) findViewById(R.id.textView3);
    }


    public void onClicBotao(View v){
        String mensagem = "testando intent";

        //cria intent com a mensagem a ser passada para a nova tela
        Intent i = new Intent(this, CalculadoraActivity.class);
        i.putExtra("mensagem", mensagem);

        //inicia a nova intent(chamando outra tela cadastrada na Intent)
        startActivity(i);
    }
    public void somar(View v){
        resultado = (Float.parseFloat(v1.getText().toString())+ Float.parseFloat(v2.getText().toString()));
        tv.setText(resultado+"");
        Toast.makeText(getBaseContext(),resultado+"",Toast.LENGTH_LONG).show();

    }
    public void subtrair(View v){
        resultado = (Float.parseFloat(v1.getText().toString())- Float.parseFloat(v2.getText().toString()));
        tv.setText(resultado+"");
        Toast.makeText(getBaseContext(),resultado+"",Toast.LENGTH_LONG).show();

    }
    public void dividir(View v){
        resultado = (Float.parseFloat(v1.getText().toString())/ Float.parseFloat(v2.getText().toString()));
        tv.setText(resultado+"");
        Toast.makeText(getBaseContext(),resultado+"",Toast.LENGTH_LONG).show();

    }
    public void multiplicar(View v){
        resultado = (Float.parseFloat(v1.getText().toString())* Float.parseFloat(v2.getText().toString()));
        tv.setText(resultado+"");
        Toast.makeText(getBaseContext(),resultado+"",Toast.LENGTH_LONG).show();
    }
}

