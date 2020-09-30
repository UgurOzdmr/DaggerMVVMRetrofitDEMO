package com.example.daggermvvmretrofit.di.auth;

import androidx.lifecycle.ViewModel;

import com.example.daggermvvmretrofit.di.ViewModelKey;
import com.example.daggermvvmretrofit.ui.auth.AuthViewModel;

import dagger.Binds;
import dagger.Module;
import dagger.multibindings.IntoMap;

//DEPENDENCY FOR AUTHVIEWMODEL
@Module
public abstract class AuthViewModelsModule {

    @Binds
    @IntoMap
    @ViewModelKey(AuthViewModel.class)
    public abstract ViewModel bindAuthViewModel(AuthViewModel viewModel);

    /*
    @Binds
    @IntoMap
    @ViewModelKey(MainViewModel.class)
    public abstract ViewModel bindMainViewModel(MainViewModel viewModel);

     */
}
