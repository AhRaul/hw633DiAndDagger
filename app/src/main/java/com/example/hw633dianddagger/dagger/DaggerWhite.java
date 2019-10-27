package com.example.hw633dianddagger.dagger;

import android.util.Log;

import com.example.hw633dianddagger.dagger.app.App;

import javax.inject.Inject;

public class DaggerWhite {

    public static final String TAG = "White";

    @Inject
    DaggerGreen green;

    public DaggerWhite() {
        App.getAppComponent().inject(this);
        Log.d(TAG, "White: " + green.show());
        Log.i(TAG, "White: " + green);
    }
}
