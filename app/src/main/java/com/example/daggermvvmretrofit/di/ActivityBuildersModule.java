package com.example.daggermvvmretrofit.di;

import com.example.daggermvvmretrofit.di.auth.AuthModule;
import com.example.daggermvvmretrofit.di.auth.AuthViewModelsModule;
import com.example.daggermvvmretrofit.di.main.MainFragmentBuildersModule;
import com.example.daggermvvmretrofit.di.main.MainModule;
import com.example.daggermvvmretrofit.di.main.MainViewModelsModule;
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

    @ContributesAndroidInjector(
            modules = {MainFragmentBuildersModule.class ,
                       MainViewModelsModule.class,
                    MainModule.class}
    )
    abstract MainActivity contributeMainActivity();
}
