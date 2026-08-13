package com.example.toggle;

import android.net.Ikev2VpnProfile;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {
    ImageView I1, I2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        I1 = findViewById(R.id.imag1);
        I2 = findViewById(R.id.image2);
        I1.setOnClickListener(this::onClick);
        I2.setOnClickListener(this::onClick);
    }

    private void onClick(View view) {
        if (view.getId() == R.id.imag1) {
            I1.setVisibility(View.GONE);
            I2.setVisibility(View.VISIBLE);
        } else {
            I2.setVisibility(View.GONE);
            I1.setVisibility(View.VISIBLE);
        }
    }
}



