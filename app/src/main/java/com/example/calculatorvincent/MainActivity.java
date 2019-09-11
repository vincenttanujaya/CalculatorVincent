package com.example.calculatorvincent;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {

    private boolean isOpPressed = false;
    private double firstNumber = 0;
    private double secondNumber = 0;
    private double hasil = 0;
    private boolean secondNumberFlag = false;
    private boolean flagFakeNumber = false;
    private char currentOp;
    private String screenContent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final TextView history = findViewById(R.id.history);
        final TextView viewHasil = findViewById(R.id.hasilUser);
        final Button n0 = findViewById(R.id.btn_0);
        final Button n1 = findViewById(R.id.btn_1);
        final Button n2 = findViewById(R.id.btn_2);
        final Button n3 = findViewById(R.id.btn_3);
        final Button n4 = findViewById(R.id.btn_4);
        final Button n5 = findViewById(R.id.btn_5);
        final Button n6 = findViewById(R.id.btn_6);
        final Button n7 = findViewById(R.id.btn_7);
        final Button n8 = findViewById(R.id.btn_8);
        final Button n9 = findViewById(R.id.btn_9);
        final Button btnAdd = findViewById(R.id.btn_Plus);
        final Button btnClear = findViewById(R.id.btn_Clear);
        final Button btnPercent = findViewById(R.id.btn_Percent);
        final Button btnMulti = findViewById(R.id.btn_Multiple);
        final Button btnSub = findViewById(R.id.btn_minus);
        final Button btnDiv = findViewById(R.id.btn_Divide);
        final Button btnComma = findViewById(R.id.btn_comma);
        final Button btnEquals = findViewById(R.id.btn_equal);

        final View.OnClickListener CalculatorListener = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final int id = v.getId();
                switch (id) {
                    case R.id.btn_0:
                      if(viewHasil.getText().toString().equals("0")){
                            viewHasil.setText("");
                        }
                        if(flagFakeNumber){
                            viewHasil.setText("");
                            flagFakeNumber = false;
                        }
                        viewHasil.append("0");
                        break;
                    case R.id.btn_1:
                        if(viewHasil.getText().toString().equals("0")){
                            viewHasil.setText("");
                        }
                        if(flagFakeNumber){
                            viewHasil.setText("");
                            flagFakeNumber = false;
                        }
                        viewHasil.append("1");
                        break;
                    case R.id.btn_2:
                        if(viewHasil.getText().toString().equals("0")){
                            viewHasil.setText("");
                        }
                        if(flagFakeNumber){
                            viewHasil.setText("");
                            flagFakeNumber = false;
                        }
                        viewHasil.append("2");
                        break;
                    case R.id.btn_3:
                        if(viewHasil.getText().toString().equals("0")){
                            viewHasil.setText("");
                        }
                        if(flagFakeNumber){
                            viewHasil.setText("");
                            flagFakeNumber = false;
                        }
                        viewHasil.append("3");
                        break;
                    case R.id.btn_4:
                        if(viewHasil.getText().toString().equals("0")){
                            viewHasil.setText("4");
                        }
                        if(flagFakeNumber){
                            viewHasil.setText("");
                            flagFakeNumber = false;
                        }
                        viewHasil.append("4");
                        break;
                    case R.id.btn_5:
                        if(viewHasil.getText().toString().equals("0")){
                            viewHasil.setText("");
                        }
                        if(flagFakeNumber){
                            viewHasil.setText("");
                            flagFakeNumber = false;
                        }
                        viewHasil.append("5");
                        break;
                    case R.id.btn_6:
                        if(viewHasil.getText().toString().equals("0")){
                            viewHasil.setText("");
                        }
                        if(flagFakeNumber){
                            viewHasil.setText("");
                            flagFakeNumber = false;
                        }
                        viewHasil.append("6");
                        break;
                    case R.id.btn_7:
                        if(viewHasil.getText().toString().equals("0")){
                            viewHasil.setText("");
                        }
                        if(flagFakeNumber){
                            viewHasil.setText("");
                            flagFakeNumber = false;
                        }
                        viewHasil.append("7");
                        break;
                    case R.id.btn_8:
                        if(viewHasil.getText().toString().equals("0")){
                            viewHasil.setText("");
                        }
                        if(flagFakeNumber){
                            viewHasil.setText("");
                            flagFakeNumber = false;
                        }
                        viewHasil.append("8");
                        break;
                    case R.id.btn_9:
                        if(viewHasil.getText().toString().equals("0")){
                            viewHasil.setText("");
                        }
                        if(flagFakeNumber){
                            viewHasil.setText("");
                            flagFakeNumber = false;
                        }
                        viewHasil.append("9");
                        break;
                    case R.id.btn_comma:
                        if(!viewHasil.getText().toString().contains(".")){
                            viewHasil.append(".");
                        }
                        break;

                    case R.id.btn_Plus:
                        screenContent = viewHasil.getText().toString();
                        if (secondNumberFlag){
                            secondNumber = Double.parseDouble(viewHasil.getText().toString());
                            hasil = hitung(currentOp,firstNumber,secondNumber);
                            secondNumber = 0;
                            firstNumber = hasil;
                            viewHasil.setText(Double.toString(hasil));
                        }else {
                            firstNumber = Double.parseDouble(screenContent);
                        }
                        history.setText(Double.toString(firstNumber) + " +");
                        flagFakeNumber = true;
                        secondNumberFlag = true;
                        currentOp = '+';
                        break;
                    case R.id.btn_Divide:
                        screenContent = viewHasil.getText().toString();
                        if (secondNumberFlag){
                            secondNumber = Double.parseDouble(viewHasil.getText().toString());
                            hasil = hitung(currentOp,firstNumber,secondNumber);
                            secondNumber = 0;
                            firstNumber = hasil;
                            viewHasil.setText(Double.toString(hasil));
                        }else {
                            firstNumber = Double.parseDouble(screenContent);
                        }
                        history.setText(Double.toString(firstNumber) + " /");
                        flagFakeNumber = true;
                        secondNumberFlag = true;
                        currentOp = '/';
                        break;
                    case R.id.btn_minus:
                        screenContent = viewHasil.getText().toString();
                        if (secondNumberFlag){
                            secondNumber = Double.parseDouble(viewHasil.getText().toString());
                            hasil = hitung(currentOp,firstNumber,secondNumber);
                            secondNumber = 0;
                            firstNumber = hasil;
                            viewHasil.setText(Double.toString(hasil));
                        }else {
                            firstNumber = Double.parseDouble(screenContent);
                        }
                        history.setText(Double.toString(firstNumber) + " -");
                        flagFakeNumber = true;
                        secondNumberFlag = true;
                        currentOp = '-';
                        break;
                    case R.id.btn_Percent:
                        Toast.makeText(getApplicationContext(), "Ini adalah contoh Toast di Android",Toast.LENGTH_LONG).show();
                        screenContent = viewHasil.getText().toString();
                        if (secondNumberFlag){
                            secondNumber = Double.parseDouble(viewHasil.getText().toString());
                            hasil = hitung(currentOp,firstNumber,secondNumber);
                            secondNumber = 0;
                            firstNumber = hasil;
                            viewHasil.setText(Double.toString(hasil));
                        }else {
                            firstNumber = Double.parseDouble(screenContent);
                        }
                        history.setText(Double.toString(firstNumber) + " %");
                        flagFakeNumber = true;
                        secondNumberFlag = true;
                        currentOp = '%';
                        break;
                    case R.id.btn_Multiple:
                        screenContent = viewHasil.getText().toString();
                        if (secondNumberFlag){
                            secondNumber = Double.parseDouble(viewHasil.getText().toString());
                            hasil = hitung(currentOp,firstNumber,secondNumber);
                            secondNumber = 0;
                            firstNumber = hasil;
                            viewHasil.setText(Double.toString(hasil));
                        }else {
                            firstNumber = Double.parseDouble(screenContent);
                        }
                        history.setText(Double.toString(firstNumber) + " x");
                        flagFakeNumber = true;
                        secondNumberFlag = true;
                        currentOp = '*';
                        break;
                    case R.id.btn_equal:
                        if (secondNumberFlag){
                            secondNumber = Double.parseDouble(viewHasil.getText().toString());
                            hasil = hitung(currentOp,firstNumber,secondNumber);
                            secondNumber = 0;
                            firstNumber = hasil;
                            history.setText("");
                            viewHasil.setText(Double.toString(hasil));
                            secondNumberFlag = false;
                            flagFakeNumber = true;
                        }
                        break;
                    case R.id.btn_Clear:
                        viewHasil.setText("0");
                        history.setText("");
                        isOpPressed = false;
                        firstNumber = 0;
                        secondNumber = 0;
                        hasil = 0;
                        secondNumberFlag = false;
                        flagFakeNumber = false;
                        break;
                }
            }
        };
        n0.setOnClickListener(CalculatorListener);
        n1.setOnClickListener(CalculatorListener);
        n2.setOnClickListener(CalculatorListener);
        n3.setOnClickListener(CalculatorListener);
        n4.setOnClickListener(CalculatorListener);
        n5.setOnClickListener(CalculatorListener);
        n6.setOnClickListener(CalculatorListener);
        n7.setOnClickListener(CalculatorListener);
        n8.setOnClickListener(CalculatorListener);
        n9.setOnClickListener(CalculatorListener);
        btnComma.setOnClickListener(CalculatorListener);
        btnAdd.setOnClickListener(CalculatorListener);
        btnSub.setOnClickListener(CalculatorListener);
        btnMulti.setOnClickListener(CalculatorListener);
        btnDiv.setOnClickListener(CalculatorListener);
        btnEquals.setOnClickListener(CalculatorListener);
        btnPercent.setOnClickListener(CalculatorListener);
        btnClear.setOnClickListener(CalculatorListener);
    }

    private double hitung(char operasi, double pertama, double kedua){
        double outputHitung=(double)0;
        if(operasi=='+'){
            outputHitung = pertama + kedua;
        }else if (operasi=='-'){
            outputHitung = pertama - kedua;
        }else if (operasi=='*'){
            outputHitung = pertama * kedua;
        }else if (operasi=='/'){
            outputHitung = pertama / kedua;
        }else if (operasi=='%'){
            outputHitung = pertama * kedua / (double) 100;
        }
        return outputHitung;
    }
}