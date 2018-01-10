package com.codiansoft.teachlery.Activities;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.AppCompatEditText;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.codiansoft.teachlery.R;

public class SignInActivity extends AppCompatActivity {

    AppCompatEditText email , password;
    Button btnSignin;
    Activity activity;
    TextView register;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_in);

        activity=this;

        getSupportActionBar().hide();

        email=findViewById(R.id.email);
        password=findViewById(R.id.password);

        btnSignin=findViewById(R.id.btn_sign_in);
        register=findViewById(R.id.register);

        btnSignin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(activity , MainActivity.class);
                startActivity(i);
            }
        });

        register.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(activity , SignUpActivity.class);
                startActivity(i);
            }
        });

    }
}
