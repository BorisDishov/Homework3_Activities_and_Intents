package com.example.acer.homework_3_activities_and_intents;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Button;
import android.widget.TextView;

public class ThirdActivity extends AppCompatActivity {

    TextView txtAllInformation;
    Button btnShowOnMap;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_third);

        txtAllInformation = (TextView) findViewById(R.id.txt_final_information);
        btnShowOnMap = (Button) findViewById(R.id.btn_show_on_map);

        Intent i = getIntent();
        txtAllInformation.setText(i.getStringExtra("name") + ", " + i.getStringExtra("age") + ", "
        + i.getStringExtra("address") + ", " + i.getStringExtra("city") + ", " + i.getStringExtra("birth"));
    }
}
