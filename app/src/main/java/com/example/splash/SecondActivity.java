package com.example.splash;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
    }

    public void abreSplash(View v) {
        Intent intent = new Intent (this, Splash.class);
        startActivity(intent);

    }

    public void abreMainActivity(View v) {
        Intent intent = new Intent (this, MainActivity.class);
        startActivity(intent);

    }

}