package com.universitaskuningan.tugas2_diaz;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private EditText editTextNumber1;
    private EditText editTextNumber2;
    private TextView textViewResult;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textViewResult = findViewById(R.id.textViewResult);
        editTextNumber1 = findViewById(R.id.editTextNumber1);
        editTextNumber2 = findViewById(R.id.editTextNumber2);
    }

    public void add(View view) {
        calculate('+');
    }

    public void subtract(View view) {
        calculate('-');
    }

    public void multiply(View view) {
        calculate('*');
    }

    public void divide(View view) {
        calculate('/');
    }

    private void calculate(char operator) {
        int number1 = Integer.parseInt(editTextNumber1.getText().toString());
        int number2 = Integer.parseInt(editTextNumber2.getText().toString());
        int result = 0;

        switch (operator) {
            case '+':
                result = number1 + number2;
                break;
            case '-':
                result = number1 - number2;
                break;
            case '*':
                result = number1 * number2;
                break;
            case '/':
                if (number2 != 0) {
                    result = number1 / number2;
                } else {
                    textViewResult.setText("Error: Division by zero");
                    return;
                }
                break;
        }

        textViewResult.setText("Hasil: " + result);
    }
}
