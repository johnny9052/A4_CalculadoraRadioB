package com.example.johnny.a4_calculadoraradiob;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText txtNum1;
    EditText txtNum2;
    RadioButton rdbSuma, rdbResta;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txtNum1 = (EditText) findViewById(R.id.txtNum1);
        txtNum2 = (EditText) findViewById(R.id.txtNum2);
        rdbSuma = (RadioButton) findViewById(R.id.rbtnSuma);
        rdbResta = (RadioButton) findViewById(R.id.rbtnResta);
    }


    public void operar(View view) {
        int num1 = Integer.parseInt(txtNum1.getText().toString());
        int num2 = Integer.parseInt(txtNum2.getText().toString());
        int res = 0;

        if (rdbSuma.isChecked()) {
            res = num1 + num2;
        } else {
            res = num1 - num2;
        }

        Toast.makeText(getApplicationContext(), "El resultado es " + res,
                Toast.LENGTH_SHORT).show();
    }

}
