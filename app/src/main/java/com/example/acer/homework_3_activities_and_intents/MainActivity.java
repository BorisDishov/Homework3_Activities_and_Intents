package com.example.acer.homework_3_activities_and_intents;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EditText edtName;
    Button btnEnter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edtName = (EditText) findViewById(R.id.edt_name);
        btnEnter = (Button) findViewById(R.id.btn_enter);

        if(edtName.getText().toString().equals("")){
            edtName.setError("Invalid name");
        }

        btnEnter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this, SecondActivity.class);
                i.putExtra("name", edtName.getText().toString());
                startActivity(i);
            }
        });

    }
}
