package com.example.hw633dianddagger.dagger.app;

import android.app.Application;

public class App extends Application {

    private static AppComponent appComponent;

    @Override
    public void onCreate() {
        super.onCreate();
        appComponent = generateAppComponent();
    }

    public static AppComponent getAppComponent() {
        return appComponent;
    }

    public AppComponent generateAppComponent() {
        //ЧТобы подтянуть DaggerAppComponent, необходимо сбилдить проект
        return DaggerAppComponent
                .builder()
                .appModule(new AppModule(this))
                .build();
    }
}
