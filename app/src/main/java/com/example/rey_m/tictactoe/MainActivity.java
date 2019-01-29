package com.example.rey_m.tictactoe;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button btn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn=findViewById(R.id.comenzar);
    }

    public void transicion(View view) {
        Intent cz=new Intent(MainActivity.this,juego.class);
        startActivity(cz);
    }
}
