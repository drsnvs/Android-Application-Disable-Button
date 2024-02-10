package com.example.androidapplicationdisablebutton;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

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
        b.setEnabled(false);
//        if(u1.equals("")||p1.equals("")){
//            b.setEnabled(false);
//        }else{
//            b.setEnabled(true);
//        }
        p1.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {
                //Toast.makeText(MainActivity.this, "Before", Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {

            }

            @Override
            public void afterTextChanged(Editable s) {
                if(p1.getText().toString().equals("Darshan")){
                    b.setEnabled(true);
                }else{
                    b.setEnabled(false);
                }

                //Toast.makeText(MainActivity.this, "After", Toast.LENGTH_SHORT).show();
            }
        });
        p1.setOnFocusChangeListener(new View.OnFocusChangeListener() {
            @Override
            public void onFocusChange(View v, boolean hasFocus) {
                if(!hasFocus) {
                    if(p1.getText().toString().equals("")){
                        p1.setBackgroundColor(Color.parseColor("#FF0000"));
                    }else{
                        if(p1.getText().toString().equals("Darshan")){
                            p1.setBackgroundColor(Color.parseColor("#00FF00"));
                        }else {
                            p1.setBackgroundColor(Color.parseColor("#FF0000"));
                        }
                    }
                }else{
                    p1.setBackgroundColor(Color.parseColor("#FFFFFF"));
                }
            }
        });
        u1.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {
                //Toast.makeText(MainActivity.this, "Before", Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {

            }

            @Override
            public void afterTextChanged(Editable s) {
                if(u1.getText().toString().equals("darshan@gmail.com")){
                    b.setEnabled(true);
                }else{
                    b.setEnabled(false);
                }

                //Toast.makeText(MainActivity.this, "After", Toast.LENGTH_SHORT).show();
            }
        });
        u1.setOnFocusChangeListener(new View.OnFocusChangeListener() {
            @Override
            public void onFocusChange(View v, boolean hasFocus) {
                if(!hasFocus){
                    if(u1.getText().toString().equals("")){
                        u1.setBackgroundColor(Color.parseColor("#FF0000"));
                    }else{
                        if(u1.getText().toString().equals("darshan@gmail.com")){
                            u1.setBackgroundColor(Color.parseColor("#00FF00"));
                        }else{
                            u1.setBackgroundColor(Color.parseColor("#FF0000"));
                        }
                    }
                }else{
                    u1.setBackgroundColor(Color.parseColor("#FFFFFF"));
                }
            }
        });
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(u1.getText().toString().equals("darshan@gmail.com") && p1.getText().toString().equals("Darshan")){
                    Toast.makeText(MainActivity.this, "Login Successfully", Toast.LENGTH_SHORT).show();
                    Intent intent = new Intent(MainActivity.this, MainActivity2.class);
                    intent.putExtra("keyword",u1.getText().toString());
                    startActivity(intent);

                }else{
                    Toast.makeText(MainActivity.this, "Login unsuccessfull", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }


}