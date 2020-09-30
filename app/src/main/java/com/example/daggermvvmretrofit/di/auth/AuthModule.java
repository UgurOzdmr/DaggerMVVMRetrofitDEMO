package com.example.daggermvvmretrofit.di.auth;

import com.example.daggermvvmretrofit.network.auth.AuthApi;

import dagger.Module;
import dagger.Provides;
import retrofit2.Retrofit;

//All the dependencies for the authsubcomponent
@Module
public class AuthModule {

    //We can use Retrofit object because its created at SINGLETON scope
    @Provides
    static AuthApi provideAuthApi(Retrofit retrofit) {
        return retrofit.create(AuthApi.class);
    }
}
