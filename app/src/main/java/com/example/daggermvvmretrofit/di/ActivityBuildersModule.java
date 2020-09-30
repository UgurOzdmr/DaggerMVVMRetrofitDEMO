package com.example.daggermvvmretrofit.di;

import com.example.daggermvvmretrofit.di.auth.AuthModule;
import com.example.daggermvvmretrofit.di.auth.AuthViewModelsModule;
import com.example.daggermvvmretrofit.ui.auth.AuthActivity;
import com.example.daggermvvmretrofit.ui.main.MainActivity;

import dagger.Module;
import dagger.android.ContributesAndroidInjector;

@Module
public abstract class ActivityBuildersModule {

    //Only the authactivity subcomponent can use AuthViewModelsModule
    @ContributesAndroidInjector (
            modules = {AuthViewModelsModule.class, AuthModule.class}
    )
    abstract AuthActivity contributeAuthActivity();

    @ContributesAndroidInjector()
    abstract MainActivity contributeMainActivity();
}
