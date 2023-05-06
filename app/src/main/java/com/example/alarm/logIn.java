package com.example.alarm;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class logIn extends AppCompatActivity {


    EditText loginText, passwordText;
    Button btnLogin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_log_in);

        loginText = (EditText) findViewById(R.id.emailAddress);
        passwordText = (EditText) findViewById(R.id.password);
        btnLogin = (Button) findViewById(R.id.loginButton);

        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String username = loginText. getText().toString();
                String password = passwordText. getText(). toString();

                if(username.equals("beary") && password.equals("gud"))
                {
                    Toast.makeText(logIn.this, "Welcome to Alarm", Toast.LENGTH_SHORT).show();
                    Intent intent= new Intent(getApplicationContext(),homePage.class);
                    startActivity(intent);
                }else
                {
                    Toast.makeText(logIn.this, "Invalid Credentials.", Toast.LENGTH_SHORT).show();
                }


            }
        });

    }
}