package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button btnClear, btnEqual, btnZero, btnOne, btnTwo,btnThree,btnFour,btnFive,btnSix,btnSeven,btnEight,btnNine;
    Button btnMul,btnMod,btnDiv,btnAdd,btnSub;
    TextView resultText;
    int val1 = 0, val2 = 0;
    boolean Add,Sub,Div,Mul,Mod;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}