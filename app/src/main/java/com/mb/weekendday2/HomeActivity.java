package com.mb.weekendday2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class HomeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        TextView mTvName= findViewById(R.id.tv_userName);

        String userName = getIntent().getStringExtra("NAME");

        mTvName.setText("Welcome "+userName);
    }
}
