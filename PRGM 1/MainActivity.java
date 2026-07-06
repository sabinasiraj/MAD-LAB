package com.example.loginpage;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        EditText username = findViewById(R.id.edit1);
        EditText password = findViewById(R.id.edit2);
        Button submit = findViewById(R.id.buttonlogin);
        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(username .getText().toString().equals("admin") && password.getText().toString().equals("admin123"))
                {
                    Toast.makeText(MainActivity.this, "LOGIN SUCCESSFULL", Toast.LENGTH_SHORT).show();
                }
                else
                {
                    Toast.makeText(MainActivity.this, "INVALID USERNAME OR PASSWORD", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}