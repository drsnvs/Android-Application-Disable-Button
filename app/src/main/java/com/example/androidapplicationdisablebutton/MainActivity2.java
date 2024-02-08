package com.example.androidapplicationdisablebutton;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        TextView txt = (TextView) findViewById(R.id.textView);
        Intent intent = getIntent();
        String s = intent.getStringExtra("keyword");
        txt.setText("Welcome "+s);
    }
}