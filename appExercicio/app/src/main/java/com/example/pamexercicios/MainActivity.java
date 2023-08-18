package com.example.pamexercicios;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    btn2 = findViewById(R.id.btn2);

                  btn2.OnClickListenr(New View.OnClickListener(){
        @Override
        public void onClick(View v){
            Intent abrir_exe6 = New Intent(ActivityMain.this, exe6.class);
            startActivity(abrir_exe6);
        }
    });
                  grupor.setOnCheckedChangeListener((grupor, checkedId) -> {
        RadioButton get_cod = findViewById(checkedId);
        cod = (String) get_cod.getText();
    });


        btncalcular.setOnClickListener ( v ->

    {
        qtd = Integer.parseInt(txt.getText().toString());

        if (cod == C) {
            Result1 = 2 * qtd;
            Toast Result1 = Toast.makeText(this, "O valor total do pedido é:".concat(String.valueOf(result)), Toast.LENGTH_LONG);
            result1.show();

        else if (cod == R) {
                Result2 = 2.5 * qtd;
                Toast Result2 = Toast.makeText(this, "O valor total do pedido é:".concat(String.valueOf(result)), Toast.LENGTH_LONG);
                result2.show();

        else (cod == S) {
                    Result3 = 1.5 * qtd;
                    Toast Result3 = Toast.makeText(this, "O valor total do pedido é:".concat(String.valueOf(result)), Toast.LENGTH_LONG);
                    result3.show();
        }

        // instancia de objetos

        btn1 = findViewById(R.id.btn1);
        btn2 = findViewById(R.id.btn2);
        btncalcular = findViewById(R.id.btncalcular);
        txt = findViewById(R.id.txt1);
        txt2 = findViewById(R.id.txt2);
        codC = findViewById(R.id.codC);
        codR = findViewById(R.id.codR);
        codS = findViewById(R.id.codS);
        grupor = findViewById(R.id.grupor);

