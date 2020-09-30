package com.example.daggermvvmretrofit.di.main;

import androidx.lifecycle.ViewModel;

import com.example.daggermvvmretrofit.di.ViewModelKey;
import com.example.daggermvvmretrofit.ui.main.posts.PostsViewModel;
import com.example.daggermvvmretrofit.ui.main.profile.ProfileViewModel;

import dagger.Binds;
import dagger.Module;
import dagger.multibindings.IntoMap;

@Module
public abstract class MainViewModelsModule {

    @Binds
    @IntoMap
    @ViewModelKey(ProfileViewModel.class)
    public abstract ViewModel bindProfileViewModel(ProfileViewModel viewModel);

    @Binds
    @IntoMap
    @ViewModelKey(PostsViewModel.class)
    public abstract ViewModel bindPostViewModel(PostsViewModel viewModel);
}
