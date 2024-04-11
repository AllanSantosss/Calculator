package com.example.calculadora;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity  {

    private Button numeroZero, numeroUm, numeroDois, numeroTres, numeroQuatro, numeroCinco, numeroSeis,
            numeroSete, numeroOito, numeroNove, ponto, soma, subtracao, multiplicacao, divisao, igual, limpar;

    private TextView txtExpressao, txtResultado;

    private ImageView bckspace;

    private float numero1, numero2, sinal;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        IniciarComponentes();
    }

    private void IniciarComponentes() {

        numeroZero = findViewById(R.id.numero_zero);
        numeroZero.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txtResultado.append("0");
            }
        });

        numeroUm = findViewById(R.id.numero_um);
        numeroUm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txtResultado.append("1");
            }
        });
        numeroDois = findViewById(R.id.numero_dois);
        numeroDois.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txtResultado.append("2");
            }
        });
        numeroTres = findViewById(R.id.numero_tres);
        numeroTres.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txtResultado.append("3");
            }
        });
        numeroQuatro = findViewById(R.id.numero_quatro);
        numeroQuatro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txtResultado.append("4");
            }
        });

        numeroCinco = findViewById(R.id.numero_cinco);
        numeroCinco.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txtResultado.append("5");
            }
        });

        numeroSeis = findViewById(R.id.numero_seis);
        numeroSeis.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txtResultado.append("6");
            }
        });

        numeroSete = findViewById(R.id.numero_sete);
        numeroSete.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txtResultado.append("7");
            }
        });

        numeroOito = findViewById(R.id.numero_oito);
        numeroOito.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txtResultado.append("8");
            }
        });

        numeroNove = findViewById(R.id.numero_nove);
        numeroNove.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txtResultado.append("9");
            }
        });

        ponto = findViewById(R.id.ponto);
        ponto.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txtResultado.append(".");
            }
        });



        soma = findViewById(R.id.adicao);
        soma.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sinal = 1;
                if (numero1==0){
                    numero1 = Float.parseFloat(txtResultado.getText().toString());
                    txtExpressao.setText(formatarNumero(numero1)+"+");
                    txtResultado.setText("");
                }else {
                    numero2 = Float.parseFloat(txtResultado.getText().toString());
                    txtExpressao.append(formatarNumero(numero2)+"");
                    txtResultado.setText("");
                }
            }
        });

        subtracao = findViewById(R.id.subtracao);
        subtracao.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //txtResultado.append("-");

                sinal = 2;
                if (numero1==0){
                    numero1 = Float.parseFloat(txtResultado.getText().toString());
                    txtExpressao.setText(formatarNumero(numero1)+"-");
                    txtResultado.setText("");
                }else {
                    numero2 = Float.parseFloat(txtResultado.getText().toString());
                    txtExpressao.append(formatarNumero(numero2)+"");
                    txtResultado.setText("");

                }
            }
        });

        multiplicacao = findViewById(R.id.multiplicacao);
        multiplicacao.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                //txtResultado.append("*");
                sinal = 3;
                if (numero1==0){
                    numero1 = Float.parseFloat(txtResultado.getText().toString());
                    txtExpressao.setText(formatarNumero(numero1)+"*");
                    txtResultado.setText("");
                }else {
                    numero2 = Float.parseFloat(txtResultado.getText().toString());
                    txtExpressao.append(formatarNumero(numero2)+"");
                    txtResultado.setText("");
                }

            }
        });

        divisao = findViewById(R.id.divisao);
        divisao.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //txtResultado.append("/");
                sinal = 4;
                if (numero1==0){
                    numero1 = Float.parseFloat(txtResultado.getText().toString());
                    txtExpressao.setText(formatarNumero(numero1)+"/");
                    txtResultado.setText("");
                }else {
                    numero2 = Float.parseFloat(txtResultado.getText().toString());
                    txtExpressao.append(formatarNumero(numero2)+"");
                    txtResultado.setText("");

                }

            }
        });

        igual = findViewById(R.id.igual);
        igual.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                numero2 = Float.parseFloat(txtResultado.getText().toString());
                txtExpressao.append(formatarNumero(numero2));
                txtResultado.setText("");

                if (sinal == 1){
                    float resultado = numero1+numero2;
                    txtExpressao.append("=" + formatarNumero(resultado));
                    txtResultado.setText("");
                }
                if (sinal == 2){
                    float resultado = numero1-numero2;
                    txtExpressao.append("=" + formatarNumero(resultado));
                    txtResultado.setText("");
                }
                if (sinal == 3){
                    float resultado = numero1*numero2;
                    txtExpressao.append("=" + formatarNumero(resultado));
                    txtResultado.setText("");
                }

                if (sinal == 4){
                    float resultado = numero1/numero2;
                    txtExpressao.append("=" + formatarNumero(resultado));
                    txtResultado.setText("");
                }

                numero1 = 0;
                numero2 = 0;
            }
        });

        limpar = findViewById(R.id.limpar);
        limpar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txtResultado.setText("");
                txtExpressao.setText("");
                numero1 = 0;
                numero2 = 0;
            }
        });

        txtExpressao = findViewById(R.id.txt_expressao);

        txtResultado = findViewById(R.id.txt_resultado);

        bckspace = findViewById(R.id.backspace);
        bckspace.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String txtex = txtResultado.getText().toString();
                txtex = txtex.substring(0, txtex.length()-1);
                txtResultado.setText(txtex);
            }
        });
    }

    private String formatarNumero(float numero) {
        if (numero == (int) numero)
            return String.format("%d", (int) numero);
        else
            return String.format("%s", numero);
    }


}