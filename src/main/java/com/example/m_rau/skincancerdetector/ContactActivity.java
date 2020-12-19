package com.example.m_rau.skincancerdetector;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class ContactActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_contact);

    }

    public void submitContact ( View view) {

        EditText emailAddress = (EditText) findViewById(R.id.emailAddress);
        EditText name = (EditText) findViewById(R.id.name);
        EditText details = (EditText) findViewById(R.id.notes);

        Log.i("Info", emailAddress.getText().toString());
        Log.i("Info", name.getText().toString());


        Toast.makeText(this, "Thanks "+ name.getText().toString() + " we will contact you soon at " + emailAddress.getText().toString() , Toast.LENGTH_LONG).show();
    }
}
