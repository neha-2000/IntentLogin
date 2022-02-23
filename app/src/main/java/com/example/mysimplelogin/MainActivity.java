package com.example.mysimplelogin;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button b1;
    EditText email,pass;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        email=(EditText)  findViewById(R.id.emailId);
        pass=(EditText) findViewById(R.id.passwordId);
        b1=(Button) findViewById(R.id.loginbtn);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String emailname=email.getText().toString();
                String password=pass.getText().toString();
                Intent intent=new Intent(MainActivity.this,LoginSucessFullActivity.class);
                intent.putExtra("Email",emailname);
                intent.putExtra("Password",password);

                if(email.getText().toString().equals("admin") && pass.getText().toString().equals("admin")){
                    Toast.makeText(getApplicationContext(),"thankls for login",Toast.LENGTH_SHORT).show();
                }
                else{
                    Toast.makeText(getApplicationContext(),"Incorrect",Toast.LENGTH_SHORT).show();
                }
                startActivity(intent);

            }
        });
    }
}