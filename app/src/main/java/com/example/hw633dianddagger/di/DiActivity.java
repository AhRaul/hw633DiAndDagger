package com.example.hw633dianddagger.di;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.hw633dianddagger.R;

public class DiActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_di);

        DiGreen green = new DiGreen();
        DiWhite white = new DiWhite(green);
        DiRed red = new DiRed(green);
    }
}
