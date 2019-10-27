package com.example.hw633dianddagger.nodidagger;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.hw633dianddagger.R;

public class NoDiActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_no_di);

        Green green = new Green();
        White white = new White();
        Red red = new Red();
    }
}
