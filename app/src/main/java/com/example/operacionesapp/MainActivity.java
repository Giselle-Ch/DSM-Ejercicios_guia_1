package com.example.operacionesapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText txtNum1;
    private EditText txtNum2;
    private TextView txtvwResultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txtNum1=findViewById(R.id.txtNum1);
        txtNum2=findViewById(R.id.txtNum2);
        txtvwResultado=findViewById(R.id.txtvwResultado);
    }

    //------ Operaciones ------
    // Suma
    public void sumar(View view){
        String valor1 = txtNum1.getText().toString();
        String valor2 = txtNum2.getText().toString();

        int num1 = Integer.parseInt(valor1);
        int num2 = Integer.parseInt(valor2);

        int suma = num1 + num2;

        String resultado = String.valueOf(suma);
        txtvwResultado.setText(resultado);
    }

    // Resta
    public void restar(View view){
        String valor1 = txtNum1.getText().toString();
        String valor2 = txtNum2.getText().toString();

        int num1 = Integer.parseInt(valor1);
        int num2 = Integer.parseInt(valor2);

        int resta = num1 - num2;

        String resultado = String.valueOf(resta);
        txtvwResultado.setText(resultado);
    }

    // Multiplicar
    public void multiplicar(View view){
        String valor1 = txtNum1.getText().toString();
        String valor2 = txtNum2.getText().toString();

        int num1 = Integer.parseInt(valor1);
        int num2 = Integer.parseInt(valor2);

        int multiplicar = num1 * num2;

        String resultado = String.valueOf(multiplicar);
        txtvwResultado.setText(resultado);
    }

    // Dividir
    public void dividir (View view){
        String valor1 = txtNum1.getText().toString();
        String valor2 = txtNum2.getText().toString();

        int num1 = Integer.parseInt(valor1);
        int num2 = Integer.parseInt(valor2);

        if(num2 == 0){
            txtvwResultado.setText("No se puede dividir entre 0");
        }
        else {
            float dividir = num1 / num2;

            String resultado = String.valueOf(dividir);
            txtvwResultado.setText(resultado);
        }
    }
}