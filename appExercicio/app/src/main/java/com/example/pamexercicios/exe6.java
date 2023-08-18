package com.example.pamexercicios;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

public class exe6 extends AppCompatActivity {
    // Declarando variáveis
    TextView txt1;
    RadioGroup grupor;
    RadioButton CodC;
    RadioButton CodR;
    RadioButton CodS;
    Button btncalcular;
    EditText txt2;
    String cod;
    Integer qtd;
    Double result;


    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_exe6);
        // instancia de objetos
        btncalcular = findViewById(R.id.btncalcular);
        txt1= findViewById(R.id.txt1);
        txt2 = findViewById(R.id.txt2);
        CodC = findViewById(R.id.codC);
        CodS = findViewById(R.id.codS);
        CodR = findViewById(R.id.codR);
        grupor = findViewById(R.id.grupor);

        grupor.setOnCheckedChangeListener((grupor, checkedId) -> {
            RadioButton get_cod = findViewById(checkedId);
            cod = (String) get_cod.getText();
        });


        btncalcular.setOnClickListener ( v -> {
    });
            qtd = Integer.parseInt(txt2.getText().toString());

            if (cod == "C") {
                result = 2.0 * qtd;
                Toast result1 = Toast.makeText(this, "O valor total do pedido é:".concat(String.valueOf(result)), Toast.LENGTH_LONG);
                result1.show();
            }

                else if (cod == "R") {
                    result = 2.5 * qtd;
                    Toast result2 = Toast.makeText(this, "O valor total do pedido é:".concat(String.valueOf(result)), Toast.LENGTH_LONG);
                    result2.show();
                }

                    else if (cod == "S") {
                        result = 1.5 * qtd;
                        Toast result3 = Toast.makeText(this, "O valor total do pedido é:".concat(String.valueOf(result)), Toast.LENGTH_LONG);
                        result3.show();
                    }


                }
}