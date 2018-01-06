package com.codiansoft.teachlery.Activities;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.codiansoft.teachlery.R;

public class ContactUsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contact_us);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

    }
    @Override
    public boolean onSupportNavigateUp(){
        finish();
        return true;
    }
}
