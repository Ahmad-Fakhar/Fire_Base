package com.example.firebase;

import android.content.Intent;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Handler;
import android.view.WindowManager;

import com.example.firebase.RegistrationActivity;

public class MainActivity2 extends AppCompatActivity {
    private static final int SPLASH_SCREEN_TIME_OUT = 4000; // After completion of 4000 ms, the next activity will get started.

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // This method is used so that your splash activity can cover the entire screen.
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);

        setContentView(R.layout.activity_main2); // this will bind your MainActivity.class file with activity_main.

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                // Intent is used to switch from one activity to another.
                Intent i = new Intent(MainActivity2.this, RegistrationActivity.class);
                startActivity(i); // invoke the SecondActivity.
                finish(); // the current activity will get finished.
            }
        }, SPLASH_SCREEN_TIME_OUT);
    }
}