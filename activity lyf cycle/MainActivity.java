package com.example.activitylifecycle;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d("life cycle","onCreate Invoked");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d("life cycle","onStart Invoked");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d("life cycle","onResume Invoked");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d("life cycle","onPause Invoked");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d("life cycle","onStop Invoked");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d("life cycle","onRestart Invoked");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("life cycle","onDestroy Invoked");
    }
}