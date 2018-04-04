package com.android.khosbayar.muml3a1converter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EditText mInput, mOutput;
    Button mConvert;
    public static final double MULTIPLIER_LB = 0.45359237;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mInput = findViewById(R.id.etInputLb);
        mOutput = findViewById(R.id.etOutputKg);

        mConvert = findViewById(R.id.bConvert);

        mConvert.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double val = Double.parseDouble(mInput.getText().toString());
                mOutput.setText(String.valueOf(val * MULTIPLIER_LB));
            }
        });
    }
}
