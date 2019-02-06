package com.example.rey_m.tictactoe;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class juego extends AppCompatActivity implements View.OnClickListener {

    Button btn1, btn2, btn3, btn4, btn5, btn6, btn7, btn8, btn9, reset;
    char xo;
    int cont = 0, t;
    TextView mensaje;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_juego);


        btn1 = findViewById(R.id.btn1);
        btn2 = findViewById(R.id.btn2);
        btn3 = findViewById(R.id.btn3);
        btn4 = findViewById(R.id.btn4);
        btn5 = findViewById(R.id.btn5);
        btn6 = findViewById(R.id.btn6);
        btn7 = findViewById(R.id.btn7);
        btn8 = findViewById(R.id.btn8);
        btn9 = findViewById(R.id.btn9);
        mensaje = findViewById(R.id.winner);
        reset=findViewById(R.id.reset);

        btn1.setOnClickListener(this);
        btn2.setOnClickListener(this);
        btn3.setOnClickListener(this);
        btn4.setOnClickListener(this);
        btn5.setOnClickListener(this);
        btn6.setOnClickListener(this);
        btn7.setOnClickListener(this);
        btn8.setOnClickListener(this);
        btn9.setOnClickListener(this);
        reset.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        cont++;
        t = cont % 2;

        if (view.getId()==R.id.reset){
            mensaje.setText("");

            btn1.setEnabled(true);
            btn1.setText("");

            btn2.setEnabled(true);
            btn2.setText("");
            btn3.setEnabled(true);
            btn3.setText("");
            btn4.setEnabled(true);
            btn4.setText("");
            btn5.setEnabled(true);
            btn5.setText("");
            btn6.setEnabled(true);
            btn6.setText("");
            btn7.setEnabled(true);
            btn7.setText("");
            btn8.setEnabled(true);
            btn8.setText("");
            btn9.setEnabled(true);
            btn9.setText("");

            cont=0;
        }

        if (t == 1) {
            imprimir('X', view);
        } else {
            imprimir('O', view);
        }

    }

    public void imprimir(char xo, View v) {
        switch (v.getId()) {
            case R.id.btn1:
                btn1.setText(xo + "");
                btn1.setEnabled(false);
                break;
            case R.id.btn2:
                btn2.setText(xo + "");
                btn2.setEnabled(false);
                break;
            case R.id.btn3:
                btn3.setText(xo + "");
                btn3.setEnabled(false);
                break;
            case R.id.btn4:
                btn4.setText(xo + "");
                btn4.setEnabled(false);
                break;
            case R.id.btn5:
                btn5.setText(xo + "");
                btn5.setEnabled(false);
                break;
            case R.id.btn6:
                btn6.setText(xo + "");
                btn6.setEnabled(false);
                break;
            case R.id.btn7:
                btn7.setText(xo + "");
                btn7.setEnabled(false);
                break;
            case R.id.btn8:
                btn8.setText(xo + "");
                btn8.setEnabled(false);
                break;
            case R.id.btn9:
                btn9.setText(xo + "");
                btn9.setEnabled(false);
                break;
        }
        ganador(xo);
    }

    private void ganador(char xo) {
        if (btn1.getText().toString().equals(xo + "") && btn4.getText().toString().equals(xo + "") && btn7.getText().toString().equals(xo + "")) {
            mensaje.setText("el ganador es " + xo);
            btn1.setEnabled(false);
            btn2.setEnabled(false);
            btn3.setEnabled(false);
            btn4.setEnabled(false);
            btn5.setEnabled(false);
            btn6.setEnabled(false);
            btn7.setEnabled(false);
            btn8.setEnabled(false);
            btn9.setEnabled(false);
        } else if (btn2.getText().toString().equals(xo + "") && btn5.getText().toString().equals(xo + "") && btn8.getText().toString().equals(xo + "")) {
            mensaje.setText("el ganador es " + xo);
            btn1.setEnabled(false);
            btn2.setEnabled(false);
            btn3.setEnabled(false);
            btn4.setEnabled(false);
            btn5.setEnabled(false);
            btn6.setEnabled(false);
            btn7.setEnabled(false);
            btn8.setEnabled(false);
            btn9.setEnabled(false);
        } else if (btn3.getText().toString().equals(xo + "") && btn6.getText().toString().equals(xo + "") && btn9.getText().toString().equals(xo + "")) {
            mensaje.setText("el ganador es " + xo);
            btn1.setEnabled(false);
            btn2.setEnabled(false);
            btn3.setEnabled(false);
            btn4.setEnabled(false);
            btn5.setEnabled(false);
            btn6.setEnabled(false);
            btn7.setEnabled(false);
            btn8.setEnabled(false);
            btn9.setEnabled(false);
        } else if (btn1.getText().toString().equals(xo + "") && btn5.getText().toString().equals(xo + "") && btn9.getText().toString().equals(xo + "")) {
            mensaje.setText("el ganador es " + xo);
            btn1.setEnabled(false);
            btn2.setEnabled(false);
            btn3.setEnabled(false);
            btn4.setEnabled(false);
            btn5.setEnabled(false);
            btn6.setEnabled(false);
            btn7.setEnabled(false);
            btn8.setEnabled(false);
            btn9.setEnabled(false);
        } else if (btn7.getText().toString().equals(xo + "") && btn5.getText().toString().equals(xo + "") && btn3.getText().toString().equals(xo + "")) {
            mensaje.setText("el ganador es " + xo);
            btn1.setEnabled(false);
            btn2.setEnabled(false);
            btn3.setEnabled(false);
            btn4.setEnabled(false);
            btn5.setEnabled(false);
            btn6.setEnabled(false);
            btn7.setEnabled(false);
            btn8.setEnabled(false);
            btn9.setEnabled(false);
        } else if (btn1.getText().toString().equals(xo + "") && btn2.getText().toString().equals(xo + "") && btn3.getText().toString().equals(xo + "")) {
            mensaje.setText("el ganador es " + xo);
            btn1.setEnabled(false);
            btn2.setEnabled(false);
            btn3.setEnabled(false);
            btn4.setEnabled(false);
            btn5.setEnabled(false);
            btn6.setEnabled(false);
            btn7.setEnabled(false);
            btn8.setEnabled(false);
            btn9.setEnabled(false);
        } else if (btn4.getText().toString().equals(xo + "") && btn5.getText().toString().equals(xo + "") && btn6.getText().toString().equals(xo + "")) {
            mensaje.setText("el ganador es " + xo);
            btn1.setEnabled(false);
            btn2.setEnabled(false);
            btn3.setEnabled(false);
            btn4.setEnabled(false);
            btn5.setEnabled(false);
            btn6.setEnabled(false);
            btn7.setEnabled(false);
            btn8.setEnabled(false);
            btn9.setEnabled(false);
        } else if (btn7.getText().toString().equals(xo + "") && btn8.getText().toString().equals(xo + "") && btn9.getText().toString().equals(xo + "")) {
            mensaje.setText("el ganador es " + xo);
            btn1.setEnabled(false);
            btn2.setEnabled(false);
            btn3.setEnabled(false);
            btn4.setEnabled(false);
            btn5.setEnabled(false);
            btn6.setEnabled(false);
            btn7.setEnabled(false);
            btn8.setEnabled(false);
            btn9.setEnabled(false);
        }
        else if (cont>8){
            mensaje.setText("Empate!!");
            btn1.setEnabled(false);
            btn2.setEnabled(false);
            btn3.setEnabled(false);
            btn4.setEnabled(false);
            btn5.setEnabled(false);
            btn6.setEnabled(false);
            btn7.setEnabled(false);
            btn8.setEnabled(false);
            btn9.setEnabled(false);
        }
            /*else {
            mensaje.setText("Empate!!");
            btn1.setEnabled(false);
            btn2.setEnabled(false);
            btn3.setEnabled(false);
            btn4.setEnabled(false);
            btn5.setEnabled(false);
            btn6.setEnabled(false);
            btn7.setEnabled(false);
            btn8.setEnabled(false);
            btn9.setEnabled(false);
        }*/
    }
}
