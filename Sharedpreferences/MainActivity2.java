package com.example.sharedpreference;

import android.content.Intent;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        TextView name=findViewById(R.id.name);
        TextView mobile1=findViewById(R.id.mobile);
        TextView email1=findViewById(R.id.email);
        TextView password1=findViewById(R.id.password);

        String username= getIntent().getStringExtra("username");
        String mobile= getIntent().getStringExtra("Mobile");
        String email= getIntent().getStringExtra("Email");
        String password= getIntent().getStringExtra("password");

        name.setText("username :" + username);
        mobile1.setText("mobile :" + mobile);
        email1.setText("email :" + email);
        password1.setText("password :" + password);

    }
}