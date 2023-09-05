package com.example.android_tutorial4;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button = findViewById(R.id.btn1);

        final Intent intent = new Intent(this,ActivityTwo.class);
        String name = "Koshika Dulanjana";
        int age = 24;

        intent.putExtra("USER_NAME",name);
        intent.putExtra("USER_AGE",age);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                startActivity(intent);
            }
        });
    }

}