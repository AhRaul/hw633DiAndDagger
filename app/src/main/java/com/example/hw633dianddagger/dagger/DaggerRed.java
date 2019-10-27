package com.example.hw633dianddagger.dagger;

import android.util.Log;

import com.example.hw633dianddagger.dagger.app.App;

import javax.inject.Inject;

public class DaggerRed {
    public static final String TAG = "Red";

    @Inject
    DaggerGreen green;

    public DaggerRed() {
        App.getAppComponent().inject(this);
        Log.d(TAG, "Red: " + green.show());
        Log.i(TAG, "Red: " + green);
    }
}
