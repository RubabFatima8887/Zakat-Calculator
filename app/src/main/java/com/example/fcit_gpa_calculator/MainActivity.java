package com.example.fcit_gpa_calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import java.util.Locale;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public double calculateZakat(double income, double expenses) {
        double zakat = 0.0;
        double netIncome = income - expenses;

        if (netIncome >= 0 && netIncome < 37640) {
            zakat = 0.0;
        } else if (netIncome >= 37640 && netIncome < 75280) {
            zakat = netIncome * 0.025;
        } else if (netIncome >= 75280 && netIncome < 112920) {
            zakat = netIncome * 0.05;
        } else if (netIncome >= 112920 && netIncome < 150560) {
            zakat = netIncome * 0.075;
        } else if (netIncome >= 150560) {
            zakat = netIncome * 0.1;
        }

        return zakat;
    }
    public void Calculate(View view)
    {
        EditText e = (EditText)findViewById(R.id.Text1);
        EditText e1 = (EditText)findViewById(R.id.Text2);
        TextView e2 = findViewById(R.id.Text3);

        double income = Double.parseDouble(e.getText().toString());
        double expenses = Double.parseDouble(e1.getText().toString());
         double zakat= calculateZakat(income,expenses);
        e2.setText(Double.toString(zakat));
    }

}