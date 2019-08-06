package com.example.madadgarapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.method.PasswordTransformationMethod;
import android.view.View;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.Toast;

import com.example.attractivecustomdialogs.AttractiveCustomDialogs;
import com.example.attractivecustomdialogs.PrivacyTermsInterface;

public class AccountDetailsActivity extends AppCompatActivity{

    private EditText password;
    private EditText confirmPassword;
    private CheckBox showPasswordCheckBox;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_account_details);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        initUi();
        initListener();
    }
    @Override
    public boolean onSupportNavigateUp() {
        onBackPressed();
        return true;
    }
    private void initUi() {
        password = (EditText) findViewById(R.id.password);
        confirmPassword = (EditText) findViewById(R.id.confirmPassword);
        showPasswordCheckBox = (CheckBox) findViewById(R.id.showPasswordCheckBox);
    }

    private void initListener() {
        showPasswordCheckBox.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    password.setTransformationMethod(null);
                    confirmPassword.setTransformationMethod(null);
                } else {
                    password.setTransformationMethod(new PasswordTransformationMethod());
                    confirmPassword.setTransformationMethod(new PasswordTransformationMethod());
                }
            }
        });
    }

    public void onClickRegisterBtn(View view) {

        AttractiveCustomDialogs.privacyTermsDialog(this,
                getResources().getString(R.string.terms),
                "Terms and Conditions",
                new PrivacyTermsInterface() {
            @Override
            public void onButtonClick() {
                startActivity(new Intent(AccountDetailsActivity.this, SelectionActivity.class));
            }
        });
    }
}
