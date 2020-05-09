package com.calculos.calculadora;

import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity{
   double num1, num2, resultado;
   String ope;
   EditText conca, Caja;
   Boolean decimal = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
//        pant = (TextView) findViewById(R.id.caja);
//        pant.setText("0");

        Button uno = (Button)findViewById(R.id.uno);
        Button dos = (Button)findViewById(R.id.dos);
        Button tres = (Button)findViewById(R.id.tres);
        Button cuatro = (Button)findViewById(R.id.cuatro);
        Button cinco = (Button)findViewById(R.id.cinco);
        Button seis = (Button)findViewById(R.id.seis);
        Button siete = (Button)findViewById(R.id.siete);
        Button ocho = (Button)findViewById(R.id.ocho);
        Button nueve = (Button)findViewById(R.id.nueve);
        Button cero = (Button)findViewById(R.id.cero);
        Button suma = (Button)findViewById(R.id.suma);
        Button resta = (Button)findViewById(R.id.resta);
        Button multiplicacion = (Button)findViewById(R.id.multiplicacion);
        Button Division = (Button)findViewById(R.id.division);
        Button Punto = (Button)findViewById(R.id.punto);
        Button Borraru = (Button)findViewById(R.id.borrauno);
        Button Borrart = (Button)findViewById(R.id.borratodo);
        Caja = (EditText)findViewById(R.id.caja);
        Button Igual = (Button)findViewById(R.id.igual);


        cero.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                conca = (EditText)findViewById(R.id.caja);
                Caja.setText(conca.getText().toString() + "0");
            }
        });
        uno.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                conca = (EditText)findViewById(R.id.caja);
                Caja.setText(conca.getText().toString() + "1");

            }
        });
        dos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                conca = (EditText)findViewById(R.id.caja);
                Caja.setText(conca.getText().toString() + "2");
            }
        });
        tres.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                conca = (EditText)findViewById(R.id.caja);
                Caja.setText(conca.getText().toString() + "3");
            }
        });
        cuatro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                conca = (EditText)findViewById(R.id.caja);
                Caja.setText(conca.getText().toString() + "4");
            }
        });
        cinco.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                conca = (EditText)findViewById(R.id.caja);
                Caja.setText(conca.getText().toString() + "5");
            }
        });
        seis.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                conca = (EditText)findViewById(R.id.caja);
                Caja.setText(conca.getText().toString() + "6");
            }
        });
        siete.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                conca = (EditText)findViewById(R.id.caja);
                Caja.setText(conca.getText().toString() + "7");
            }
        });
        ocho.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                conca = (EditText)findViewById(R.id.caja);
                Caja.setText(conca.getText().toString() + "8");
            }
        });
        nueve.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                conca = (EditText)findViewById(R.id.caja);
                Caja.setText(conca.getText().toString() + "9");
            }
        });
        Punto.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (decimal==false){
                    conca = (EditText)findViewById(R.id.caja);
                    Caja.setText(conca.getText().toString() + ".");
                    decimal = true;

                }else{return;}

            }
        });
        Igual.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                conca = (EditText)findViewById(R.id.caja);
                num2 = Double.parseDouble(conca.getText().toString());
                if(ope.equals("+")){
                    Caja.setText("");
                    resultado = num1 + num2;
                }
                if(ope.equals("-")){
                    Caja.setText("");
                    resultado = num1 - num2;
                }
                if(ope.equals("*")){
                    Caja.setText("");
                    resultado = num1 * num2;
                }
                if(ope.equals("/")){
                    Caja.setText("");
                    if(num2 != 0){
                        resultado = num1 / num2;
                    }else {
                        Caja.setText("Infinito");
                    }
                }
                Caja.setText(String.valueOf(resultado));
            }
        });
        suma.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ope = "+";
                conca = (EditText)findViewById(R.id.caja);
                num1 = Double.parseDouble(conca.getText().toString());
                Caja.setText("");
            }
        });
        resta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ope = "-";
                conca = (EditText)findViewById(R.id.caja);
                num1 = Double.parseDouble(conca.getText().toString());
                Caja.setText("");
            }
        });
        multiplicacion.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ope = "*";
                conca = (EditText)findViewById(R.id.caja);
                num1 = Double.parseDouble(conca.getText().toString());
                Caja.setText("");
            }
        });
        Division.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ope = "/";
                conca = (EditText)findViewById(R.id.caja);
                num1 = Double.parseDouble(conca.getText().toString());
                Caja.setText("");
            }
        });
        Borrart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                num1 = 0;
                num2 = 0;
                Caja.setText("");
            }
        });
        Borraru.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Caja.setText(Caja.getText().subSequence(0,Caja.getText().length()-1)+"");
            }
        });




    }

}
