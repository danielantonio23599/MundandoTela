package com.example.daniel.mundandotela;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;
public class Calculadora2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculadora2);
        tv = (EditText)findViewById(R.id.etVisor);
    }
        private EditText tv;
        private float resultado;
        private float v1 ;
        private float v2 ;
        private int aux = 0;
        private String opc;
    public void onClicBotao(View v){
        String mensagem = "testando intent";

        //cria intent com a mensagem a ser passada para a nova tela
        Intent i = new Intent(this, CalculadoraActivity.class);
        i.putExtra("mensagem", mensagem);

        //inicia a nova intent(chamando outra tela cadastrada na Intent)
        startActivity(i);
    }
    public void excluirUltimaLetra(View v) {
        int length = tv.getText().toString().length();
        tv.setText(tv.getText().toString().substring(1,length));
    }
        public void res(){
            if(aux == 0){
                Toast.makeText(getBaseContext(),"Faça uma operação",Toast.LENGTH_LONG).show();
            }else {
                v2 = Float.parseFloat(tv.getText().toString());
                if (opc.equals("*")) {
                    resultado = ((v1 * v2));
                } else if (opc.equals("+")) {
                    resultado = ((v1 + v2));
                } else if (opc.equals("-")) {
                    resultado = ((v1 - v2));
                } else if (opc.equals("/")) {
                    if(v2!=0){
                        resultado = ((v1 / v2));
                    }else{
                        tv.setText("imposivel");
                        Toast.makeText(getBaseContext(),"imposivel",Toast.LENGTH_LONG).show();
                    }
                }
                tv.setText(resultado + "");
                Toast.makeText(getBaseContext(), resultado + "", Toast.LENGTH_LONG).show();
                v1 = 0;
                v2 = 0;
                opc = "";
                aux =0;
            }
        }

        public void operacao(String op){
            if(!tv.getText().toString().equals("")){
                opc = op;
                if(aux== 0) {
                    v1 = Float.parseFloat(tv.getText().toString());
                    tv.setText("");
                    aux++;
                }else{
                    this.res();
                }
            }else{
                Toast.makeText(getBaseContext(), "Faça uma operação" + "", Toast.LENGTH_LONG).show();
            }
        }
        public void somar(View v){operacao("+");}

        public void subtrair(View v){operacao("-");}

        public void dividir(View v){operacao("/");}

        public void multiplicar(View v){operacao("*");}

        public void igual(View v){res();}

        public void num1(View v){
            tv.setText(tv.getText()+"1");
        }

        public void num2(View v){
            tv.setText(tv.getText()+"2");
        }

        public void num3(View v){
            tv.setText(tv.getText()+"3");
        }

        public void num4(View v){
            tv.setText(tv.getText()+"4");
        }

        public void num5(View v){
            tv.setText(tv.getText()+"5");
        }

        public void num6(View v){
            tv.setText(tv.getText()+"6");
        }

        public void num7(View v){
            tv.setText(tv.getText()+"7");
        }

        public void num8(View v){
            tv.setText(tv.getText()+"8");
        }

        public void num9(View v){
            tv.setText(tv.getText()+"9");
        }

        public void num0(View v){
            tv.setText(tv.getText()+"0");
        }

        public void num(View v){
            tv.setText(tv.getText()+".");
        }

        public void operadorCE(View v){
            tv.setText("");
        }

    }