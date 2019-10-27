package com.example.hw633dianddagger.dagger;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

import com.example.hw633dianddagger.R;
import com.example.hw633dianddagger.dagger.app.App;

import javax.inject.Inject;

public class DaggerActivity extends AppCompatActivity {

    private static final String TAG = "DaggerActivity";

    @Inject
    DaggerGreen green;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dagger);

        App.getAppComponent().inject(this);

        DaggerWhite white = new DaggerWhite();
        DaggerRed red = new DaggerRed();

        Log.d(TAG, "onCreate: " + green.show());
        Log.i(TAG, "onCreate: " + green);
    }
}
