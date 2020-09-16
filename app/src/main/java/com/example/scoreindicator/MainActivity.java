package com.example.scoreindicator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView scorecount;
    Button btn1,btn2,btn3,btn4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        scorecount =findViewById(R.id.scorecount);
        btn1 = (Button)findViewById(R.id.button);
        btn2 = (Button)findViewById(R.id.button2);
        btn3 = (Button)findViewById(R.id.button3);
        btn4 = (Button)findViewById(R.id.button4);
    }

    public void btn1(View view) {
        String sc = scorecount.getText().toString();
        int score = Integer.parseInt(sc)+3;
        scorecount.setText(String.valueOf(score));
    }

    public void btn2(View view) {
        String sc = scorecount.getText().toString();
        int score = Integer.parseInt(sc)+2;
        scorecount.setText(String.valueOf(score));
    }

    public void btn3(View view) {
        String sc = scorecount.getText().toString();
        int score = Integer.parseInt(sc)+1;
        scorecount.setText(String.valueOf(score));
    }

    public void btn4(View view) {
        String sc = scorecount.getText().toString();
        int score = Integer.parseInt(sc);
        scorecount.setText("0");
    }
}