package com.example.newapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
     Button btn;
     EditText ed1, ed2;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ed1 = (EditText) findViewById(R.id.username);
        ed2 = (EditText) findViewById(R.id.password);
        btn = (Button) findViewById(R.id.button);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(ed1.getText().toString().equals("avinash") && ed2.getText().toString().equals("sawade")){
                    Toast.makeText(MainActivity.this, "Username and Password are Correct", Toast.LENGTH_LONG).show();
                    
                }
                else {
                    Toast.makeText(MainActivity.this, "Username and Password are invalid", Toast.LENGTH_LONG).show();
                }
            }
        });
    }
}