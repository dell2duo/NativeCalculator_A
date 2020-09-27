package com.example.calculator_a;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void calc(View view) {
        final EditText first = findViewById(R.id.editTextNumber);
        String left = first.getText().toString();

        final EditText second = findViewById(R.id.editTextNumber2);
        String right = second.getText().toString();

        Log.d("VALORES", left);
        Log.d("VALORES", right);

        Double d = new Double("6.35");
        Double leftSide = d.parseDouble(left);
        Double rightSide = d.parseDouble(right);

        String operation = view.getTag().toString();

        final TextView resultView = findViewById(R.id.textView);
        String resultString = "O Resultado é: ";

        if(operation.matches("soma")) {
            Double result = leftSide + rightSide;
            resultString = resultString + result;
            resultView.setText(resultString);
        } else if(operation.matches("sub")) {
            Double result = leftSide - rightSide;
            resultString = resultString + result;
            resultView.setText(resultString);
        } else if(operation.matches("mult")) {
            Double result = leftSide * rightSide;
            resultString = resultString + result;
            resultView.setText(resultString);
        } else {
            Double result = leftSide / rightSide;
            resultString = resultString + result;
            resultView.setText(resultString);
        }
    }
}