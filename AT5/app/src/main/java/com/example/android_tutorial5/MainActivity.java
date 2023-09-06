package com.example.android_tutorial5;

import android.content.Intent;
import android.net.Uri;
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

//        final Intent intent = new Intent(this,ActivityTwo.class);
//        String name = "Koshika Dulanjana";
//        int age = 24;
//
////        intent.putExtra("USER_NAME",name);
////        intent.putExtra("USER_AGE",age);
//        Bundle extras = new Bundle();
//        extras.putString("USER_NAME", name);
//        extras.putInt("USER_AGE", age);
//
//        intent.putExtras(extras);
        
        Intent intent = new Intent(Intent.ACTION_SEND);
        final Intent chooser;
        intent.setData(Uri.parse("mailto:"));
        intent.putExtra(Intent.EXTRA_EMAIL, new String[]{"test@gmail.com"});
        intent.putExtra(Intent.EXTRA_SUBJECT, "This is our test subject");
        intent.putExtra(Intent.EXTRA_TEXT, "This is our test email body");
        intent.setType("message/rfc822");
        intent.createChooser(intent, "Send email test app");
        

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(chooser);
            }
        });
    }

}