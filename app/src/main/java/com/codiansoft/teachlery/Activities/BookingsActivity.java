package com.codiansoft.teachlery.Activities;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.codiansoft.teachlery.R;

public class BookingsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bookings);


      //  getActionBar().hide();
        getSupportActionBar().hide();
    }
}
