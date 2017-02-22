package com.example.tavomama.calculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.util.Locale;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private TextView txt;
    private String numbers = "";
    private double number1 = 0;
    private double number2 = 0;
    private double result  = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        txt = (TextView) findViewById(R.id.textView);
        buttonOnClick();
    }



    public void buttonOnClick() {
        Button btn = (Button) findViewById(R.id.button);
        Button btn2 = (Button) findViewById(R.id.button2);
        Button btn3 = (Button) findViewById(R.id.button3);
        Button btn4 = (Button) findViewById(R.id.button4);
        Button btn5 = (Button) findViewById(R.id.button5);
        Button btn6 = (Button) findViewById(R.id.button6);
        Button btn7 = (Button) findViewById(R.id.button7);
        Button btn8 = (Button) findViewById(R.id.button8);
        Button btn9 = (Button) findViewById(R.id.button9);
        Button btn10 = (Button) findViewById(R.id.button10);
        Button btn11 = (Button) findViewById(R.id.button11);
        Button btn12 = (Button) findViewById(R.id.button12);
        btn.setOnClickListener(this);
        btn2.setOnClickListener(this);
        btn3.setOnClickListener(this);
        btn4.setOnClickListener(this);
        btn5.setOnClickListener(this);
        btn6.setOnClickListener(this);
        btn7.setOnClickListener(this);
        btn8.setOnClickListener(this);
        btn9.setOnClickListener(this);
        btn10.setOnClickListener(this);
        btn11.setOnClickListener(this);
        btn12.setOnClickListener(this);

    }



    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.button:
                number2 = number2 * 10 + 1;
                txt.setText(Double.toString(number2));
                break;
            case R.id.button2:
                number2 = 2;
                txt.setText("2");
                break;
            case R.id.button3:
                txt.setText("3");
                break;
            case R.id.button4:
                txt.setText("4");
                break;
            case R.id.button5:
                txt.setText("5");
                break;
            case R.id.button6:
                txt.setText("6");
                break;
            case R.id.button7:
                txt.setText("7");
                break;
            case R.id.button8:
                txt.setText("8");
                break;
            case R.id.button9:
                txt.setText("9");
                break;
            case R.id.button10:
                number1 += number2;
                number2 = 0;
                txt.setText(Double.toString(number1));
                break;
            case R.id.button11:
                number2 = 0;
                txt.setText(Double.toString(number1));
                break;
            case R.id.button12:
                number1 = 0;
                number2 = 0;
                result = 0;
                txt.setText("");
                break;
        }

    }
}
