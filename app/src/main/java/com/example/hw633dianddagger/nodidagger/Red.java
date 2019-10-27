package com.example.hw633dianddagger.nodidagger;

import android.util.Log;

public class Red {

    private static final String TAG = "Red";

    public Red() {
        Green green = new Green();
        Log.d(TAG, "Red: " + green.show());   //
        Log.i(TAG, "Red: " + green);          //вывод в лог обьекта
    }
}
