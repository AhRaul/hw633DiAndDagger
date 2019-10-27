package com.example.hw633dianddagger.dagger.app;

import com.example.hw633dianddagger.dagger.DaggerActivity;
import com.example.hw633dianddagger.dagger.DaggerRed;
import com.example.hw633dianddagger.dagger.DaggerWhite;

import javax.inject.Singleton;

import dagger.Component;

@Singleton
@Component(modules = {AppModule.class})
public interface AppComponent {
    void inject(DaggerActivity daggerActivity);

    void inject(DaggerWhite white);

    void inject(DaggerRed red);
}
