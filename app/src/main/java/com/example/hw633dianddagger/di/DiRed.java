package com.example.hw633dianddagger.di;

import android.util.Log;

public class DiRed {

    private static final String TAG = "DiRed";

    private DiGreen diGreen;

    public DiRed(DiGreen diGreen) {
        this.diGreen = diGreen;
        Log.d(TAG, "DiRed: " + this.diGreen.show());   //
        Log.i(TAG, "DiRed: " + this.diGreen);          //вывод в лог обьекта
    }
}
