package com.example.pamexercicios;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    //declarando variaveis
    Button btn1, btn2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // instancia de objetos

        btn1 = findViewById(R.id.btn1);

        btn2 = findViewById(R.id.btn2);

        btn1.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent abrir_exe4 = new Intent(MainActivity.this, exe4.class);
                startActivity(abrir_exe4);
            }
        });

        btn2.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent abrir_exe6 = new Intent(MainActivity.this, exe6.class);
                startActivity(abrir_exe6);
            }
        });



    }


}