package com.exemple.exemplos;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class JavaActivity extends AppCompatActivity implements View.OnClickListener {
    private static final String TAG = "javaModule";
    private EditText editTextA, editTextB;
    private Button Sum, Sub, Mul, Div;
    private TextView Label, Result;
    private ConstraintLayout CL00;

    private Double numberA;
    private Double numberB;

    public Double getNumberA() {
        return numberA;
    }

    public void setNumberA(Double numberA) {
        this.numberA = numberA;
    }

    public Double getNumberB() {
        return numberB;
    }

    public void setNumberB(Double numberB) {
        this.numberB = numberB;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        CL00 = findViewById(R.id.cl00_lay);

        editTextA = findViewById(R.id.etNumber01);
        editTextB = findViewById(R.id.etNumber02);

        Label = findViewById(R.id.tvLabel);
        Result = findViewById(R.id.tvResult);

        Sum = findViewById(R.id.btSum);
        Sum.setOnClickListener(this);

        Sub = findViewById(R.id.btSub);
        Sub.setOnClickListener(this);

        Mul = findViewById(R.id.btMul);
        Mul.setOnClickListener(this);

        Div = findViewById(R.id.btDiv);
        Div.setOnClickListener(this);

    }

    @Override
    protected void onStart() {
        super.onStart();
        Label.setText("Em JAVA");
        CL00.setBackground(getResources().getDrawable(R.color.java));

    }

    @Override
    public void onClick(View view) {
        setNumberA(Double.valueOf(String.valueOf(editTextA.getText())));
        setNumberB(Double.valueOf(String.valueOf(editTextB.getText())));
        switch (view.getId()) {
            case (R.id.btSum):
                sum(getNumberA(), getNumberB());
                break;

            case (R.id.btSub):
                sub(getNumberA(), getNumberB());
                break;

            case (R.id.btMul):
                mult(getNumberA(), getNumberB());
                break;

            case (R.id.btDiv):
                div(getNumberA(), getNumberB());
                break;
        }
    }

    private double sum(double number1, double number2) {
        double result = number1 + number2;
        Result.setVisibility(View.VISIBLE);
        Result.setText(String.valueOf(result));
        return result;
    }

    private double sub(double number1, double number2) {
        double result = number1 - number2;
        Result.setVisibility(View.VISIBLE);
        Result.setText(String.valueOf(result));
        return result;
    }

    private double mult(double number1, double number2) {
        double result = number1 * number2;
        Result.setVisibility(View.VISIBLE);
        Result.setText(String.valueOf(result));
        return result;
    }

    private double div(double number1, double number2) {
        double result = number1 / number2;
        Result.setVisibility(View.VISIBLE);
        Result.setText(String.valueOf(result));
        return result;
    }
}
