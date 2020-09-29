package com.example.daggermvvmretrofit.di;

import com.example.daggermvvmretrofit.AuthActivity;

import dagger.Module;
import dagger.Provides;
import dagger.android.ContributesAndroidInjector;

@Module
public abstract class ActivityBuildersModule {

    @ContributesAndroidInjector
    abstract AuthActivity contributeAuthActivity();

    @Provides
    static String someString() {
        return "this is a test string";
    }
}
