package com.example.android_tutorial4;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class ActivityTwo extends AppCompatActivity {

    Button button;
    TextView textUserName, textUserAge;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_two);

        button = findViewById(R.id.btn2);
        textUserName = findViewById(R.id.textUserName);
        textUserAge = findViewById(R.id.txtUserAge);

        Intent intent = getIntent();
//        String name = intent.getStringExtra("USER_NAME");
//        int age = intent.getIntExtra("USER_AGE",0);
        Bundle extras = intent.getExtras();

        String name = extras.getString("USER_NAME");
        int age = extras.getInt("USER_AGE");

        textUserName.setText(name);
        textUserAge.setText(String.valueOf(age));

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(),MainActivity.class);
                startActivity(i);
            }
        });
    }
}