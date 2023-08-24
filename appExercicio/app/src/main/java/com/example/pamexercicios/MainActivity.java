package com.example.pamexercicios;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    //declarando variaveis
    Button btn4, btn6;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // instancia de objetos

        btn4 = findViewById(R.id.btn4);

        btn6 = findViewById(R.id.btn4);
    }

    public void abrirTela4(View f){
        Intent intent = new Intent(this,exe4.class );
        startActivity(intent);
    }


    public void abrirTela6(View f){
        Intent intent = new Intent(this, exe6.class);
        startActivity(intent);
    }


}