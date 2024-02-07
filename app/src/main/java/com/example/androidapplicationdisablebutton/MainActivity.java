package com.example.androidapplicationdisablebutton;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    EditText u1,p1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        u1 = (EditText) findViewById(R.id.username);
        String uname = u1.getText().toString();
        p1 = (EditText) findViewById(R.id.password);
        String pass = p1.getText().toString();
        Button b = (Button) findViewById(R.id.submit);
        if(u1.equals("")||p1.equals("")){
            b.setEnabled(false);
        }else{
            b.setEnabled(true);
        }
    }

}