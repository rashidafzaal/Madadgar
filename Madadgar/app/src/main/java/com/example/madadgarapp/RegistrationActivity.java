package com.example.madadgarapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class RegistrationActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registration);
        initUi();
    }

    private void initUi() {
    }

    public void onClickNextBtn(View view) {

        startActivity(new Intent(RegistrationActivity.this, AccountDetailsActivity.class));
    }
}
