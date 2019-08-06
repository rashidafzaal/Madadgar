package com.example.madadgarapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;

public class SelectionActivity extends AppCompatActivity implements View.OnClickListener {

    private LinearLayout bookNow;
    private LinearLayout fixSchedule;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_selection);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);

        initUi();
        initListener();
    }

    private void initUi() {
        bookNow = (LinearLayout) findViewById(R.id.bookNow);
        fixSchedule = (LinearLayout) findViewById(R.id.fixSchedule);
    }

    private void initListener() {
        bookNow.setOnClickListener(this);
        fixSchedule.setOnClickListener(this);
    }

    @Override
    public boolean onSupportNavigateUp() {
        onBackPressed();
        return true;
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.bookNow:
                break;
            case R.id.fixSchedule:
                break;
            default:
                break;
        }
    }
}
