package com.example.android_tutorial1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button button;
    TextView text;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button = findViewById(R.id.btnok);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                text = findViewById(R.id.txthello);
                text.setText("Hai Koshika Dulanjana");
            }
        });
    }
}