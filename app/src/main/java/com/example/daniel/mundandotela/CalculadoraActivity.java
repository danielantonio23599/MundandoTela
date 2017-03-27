package com.example.daniel.mundandotela;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class CalculadoraActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculadora);
    }

    //método para realizar o envento do botão1, para ativar o botão, basta nas propriedades onClick no arquivo xml
    public void onClicBotao1(View v){
        String mensagem = "testando intent";

        //cria intent com a mensagem a ser passada para a nova tela
        Intent i = new Intent(this, Calculadora1Activity.class);
        i.putExtra("mensagem", mensagem);

        //inicia a nova intent(chamando outra tela cadastrada na Intent)
        startActivity(i);
    }
    public void onClicBotao2(View v){
        String mensagem = "testando intent";

        //cria intent com a mensagem a ser passada para a nova tela
        Intent i = new Intent(this, Calculadora3Activity.class);
        i.putExtra("mensagem", mensagem);

        //inicia a nova intent(chamando outra tela cadastrada na Intent)
        startActivity(i);
    }
    public void onClicBotao3(View v){
        String mensagem = "testando intent";

        //cria intent com a mensagem a ser passada para a nova tela
        Intent i = new Intent(this, Calculadora2Activity.class);
        i.putExtra("mensagem", mensagem);

        //inicia a nova intent(chamando outra tela cadastrada na Intent)
        startActivity(i);
    }
   /* public void onClicBotao2(View v){
        String mensagem = "testando intent";

        //cria intent com a mensagem a ser passada para a nova tela
        Intent i = new Intent(this, SegundaActivity.class);
        i.putExtra("mensagem", mensagem);

        //inicia a nova intent(chamando outra tela cadastrada na Intent)
        startActivity(i);
    }*/
}
