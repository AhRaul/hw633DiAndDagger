package com.example.hw633dianddagger.di;

import android.util.Log;

public class DiWhite {

    private static final String TAG = "DiWhite";

    private DiGreen diGreen;

    public DiWhite(DiGreen diGreen) {
        this.diGreen = diGreen;
        Log.d(TAG, "DiRed: " + this.diGreen.show());   //
        Log.i(TAG, "DiRed: " + this.diGreen);          //вывод в лог обьекта
    }
}
