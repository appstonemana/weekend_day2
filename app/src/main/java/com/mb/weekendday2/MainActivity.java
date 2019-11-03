package com.mb.weekendday2;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {


    private EditText mEtFno, mEtSno;
    private Button mBtnSum;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mEtFno = findViewById(R.id.et_fno);
        mEtSno = findViewById(R.id.et_sno);

        mBtnSum = findViewById(R.id.btn_sum);
        mBtnSum.setOnClickListener(this);

//        mBtnSum.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//
//                double fno = Double.parseDouble(mEtFno.getText().toString().trim());
//                double sno = Double.parseDouble(mEtSno.getText().toString().trim());
//
//                double sum = fno + sno;
//
//                Intent intent = new Intent(MainActivity.this,ResultActivity.class);
//                intent.putExtra("SUM",sum);
//                startActivity(intent);
//
//            }
//        });

    }

    @Override
    public void onClick(View view) {
        double fno = Double.parseDouble(mEtFno.getText().toString().trim());
        double sno = Double.parseDouble(mEtSno.getText().toString().trim());

        double sum = fno + sno;

        Intent intent = new Intent(MainActivity.this, ResultActivity.class);
        intent.putExtra("SUM", sum);
        startActivity(intent);
    }
}
