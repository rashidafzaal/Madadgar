package com.example.madadgarapp;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;

import com.example.attractivecustomdialogs.AttractiveCustomDialogs;

public class SplashActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        AttractiveCustomDialogs.setStatusBarColor(this, getResources().getColor(R.color.black));
        setContentView(R.layout.activity_splash);

        Thread thd = new Thread() {
            public void run() {
                try {
                    sleep(1000);
                } catch (Exception ex) {
                    ex.printStackTrace();
                } finally {
                    Intent intent = new Intent(SplashActivity.this, RegistrationActivity.class);
                    startActivity(intent);
                    finish();
                }
            }
        };
        thd.start();
    }
}
