package com.example.motivate2;

import androidx.appcompat.app.AppCompatActivity;


import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity{
    private TextView email;
    private TextView password;
    private Button Login;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        email = (TextView) findViewById(R.id.email);
        password = (TextView) findViewById(R.id.password);
        Login = (Button) findViewById(R.id.Login);


        Login = (Button) findViewById(R.id.Login);
        Login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openloginActivity();
            }
        });

    }
    public void openloginActivity() {
        Intent intent = new Intent(this, loginActivity.class);
        startActivity(intent);
    }



}