package com.example.pamexercicios;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.NumberPicker;
import android.widget.TextView;
import android.widget.Toast;

public class exe4 extends AppCompatActivity {

    //Declarando variaveis
    Button btncalcular2;
    NumberPicker numberpicker;
    TextView txt4;

    Integer cod1;

    Integer result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_exe4);
        //instanciando objetos
        numberpicker = findViewById(R.id.numberpicker);
        btncalcular2 = findViewById(R.id.btncalcular2);
        txt4 = findViewById(R.id.txt4);

        numberpicker.setMinValue(0);
        numberpicker.setMaxValue(24);

        btncalcular2.setOnClickListener ( v -> {
        });
            cod1 = numberpicker.getValue();
            txt4.setText(cod1);
            result = cod1 + 6;
        Toast result1= Toast.makeText(this, "horário de saida:".concat(String.valueOf(result)), Toast.LENGTH_LONG);
        result1.show();



    }
}