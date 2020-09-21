package com.example.scoreindicator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView ta,tb;
    Button btn1,btn2,btn3,btn4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ta = findViewById(R.id.textView);
        tb = findViewById(R.id.textView4);
//        btn1 = (Button)findViewById(R.id.button);
//        btn2 = (Button)findViewById(R.id.button2);
//        btn3 = (Button)findViewById(R.id.button3);
//        btn4 = (Button)findViewById(R.id.button4);
    }

    public void btn1(View view) {
        String sc = ta.getText().toString();
        int score = Integer.parseInt(sc)+3;
        ta.setText(String.valueOf(score));
    }

    public void btn2(View view) {
        String sc = ta.getText().toString();
        int score = Integer.parseInt(sc)+2;
        ta.setText(String.valueOf(score));
    }

    public void btn3(View view) {
        String sc = ta.getText().toString();
        int score = Integer.parseInt(sc)+1;
        ta.setText(String.valueOf(score));
    }

    public void btn4(View view) {
        ta.setText("0");
        tb.setText("0");
    }

    public void btn5(View view) {
        String sc = tb.getText().toString();
        int score = Integer.parseInt(sc)+3;
        tb.setText(String.valueOf(score));
    }

    public void btn6(View view) {
        String sc = tb.getText().toString();
        int score = Integer.parseInt(sc)+2;
        tb.setText(String.valueOf(score));
    }

    public void btn7(View view) {
        String sc = tb.getText().toString();
        int score = Integer.parseInt(sc)+1;
        tb.setText(String.valueOf(score));
    }
}