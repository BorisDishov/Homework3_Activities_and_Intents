package com.example.acer.homework_3_activities_and_intents;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class SecondActivity extends AppCompatActivity {

    EditText edtAge;
    EditText edtAddress;
    EditText edtCity;
    EditText edtBirth;
    Button btnContinue;

    String name;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        edtAge = (EditText) findViewById(R.id.edt_age);
        edtAddress = (EditText) findViewById(R.id.edt_address);
        edtCity = (EditText) findViewById(R.id.edt_city);
        edtBirth = (EditText) findViewById(R.id.edt_birth_date);
        btnContinue = (Button) findViewById(R.id.btn_continue);

        name = getIntent().getStringExtra("name");

        btnContinue.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(SecondActivity.this, ThirdActivity.class);
                i.putExtra("name", name);
                i.putExtra("age", edtAge.getText().toString());
                i.putExtra("address", edtAddress.getText().toString());
                i.putExtra("city", edtCity.getText().toString());
                i.putExtra("birth", edtBirth.getText().toString());
                startActivity(i);
            }
        });

    }
}
