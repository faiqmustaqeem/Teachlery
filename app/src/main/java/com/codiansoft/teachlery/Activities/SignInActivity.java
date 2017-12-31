package com.codiansoft.teachlery.Activities;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.AppCompatEditText;
import android.view.View;
import android.widget.Button;

import com.codiansoft.teachlery.R;

public class SignInActivity extends AppCompatActivity {

    AppCompatEditText email , password;
    Button btnSignin;
    Activity activity;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_in);

        activity=this;

        getSupportActionBar().hide();

        email=findViewById(R.id.email);
        password=findViewById(R.id.password);

        btnSignin=findViewById(R.id.btn_sign_in);

        btnSignin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(activity , MainActivity.class);
                startActivity(i);
            }
        });



    }
}
