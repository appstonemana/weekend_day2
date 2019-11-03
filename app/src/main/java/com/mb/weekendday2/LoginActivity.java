package com.mb.weekendday2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class LoginActivity extends AppCompatActivity {


    private EditText mEtId,mEtPwd;
    private Button mBtnLogin;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        mEtId = findViewById(R.id.et_login_id);
        mEtPwd = findViewById(R.id.et_login_pwd);

        mBtnLogin = findViewById(R.id.btn_login);

        mBtnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String userId = mEtId.getText().toString().trim();
                String pwd = mEtPwd.getText().toString().trim();

                if (userId.equals("admin") && pwd.equals("admin")){

                    Intent loginIntent   = new Intent(LoginActivity.this,HomeActivity.class);
                    loginIntent.putExtra("NAME",userId);
                    startActivity(loginIntent);


                }else {
                    Toast.makeText(LoginActivity.this, "Invalid Credential", Toast.LENGTH_SHORT).show();
                }

            }
        });

    }
}
