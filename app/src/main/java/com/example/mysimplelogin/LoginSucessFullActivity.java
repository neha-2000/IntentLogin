package com.example.mysimplelogin;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class LoginSucessFullActivity extends AppCompatActivity {
    TextView email,pass;
    @Override
    protected void onCreate(Bundle savededInstanceState){
        super.onCreate(savededInstanceState);
        setContentView(R.layout.activity_main2);
        Intent intent=getIntent();
        email=findViewById(R.id.email);
        pass=findViewById(R.id.pass);

        String str1=intent.getStringExtra("Email");
        String str2=intent.getStringExtra("Password");

        email.setText(str1);
        pass.setText(str2);
    }

}
