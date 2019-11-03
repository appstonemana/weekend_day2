package com.mb.weekendday2;

import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class ResultActivity extends AppCompatActivity {

    private TextView mTvSum;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);

        mTvSum = findViewById(R.id.tv_sum);

        double result = getIntent().getDoubleExtra("SUM", 0.0);

        mTvSum.setText(getResources().getString(R.string.sum).concat(String.valueOf(result)));


    }
}
