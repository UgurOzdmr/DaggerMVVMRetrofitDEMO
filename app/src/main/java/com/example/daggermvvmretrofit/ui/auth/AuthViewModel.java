package com.example.daggermvvmretrofit.ui.auth;

import android.util.Log;

import androidx.lifecycle.ViewModel;

import com.example.daggermvvmretrofit.network.auth.AuthApi;

import javax.inject.Inject;

public class AuthViewModel extends ViewModel {
    private static final String TAG = "AuthViewModel";

    private final AuthApi authApi;

    @Inject
    public AuthViewModel(AuthApi authApi) {
        this.authApi = authApi;
        
        if (this.authApi == null) {
            Log.d(TAG, "AuthViewModel: auth api is null");
        } else {
            Log.d(TAG, "AuthViewModel: is not null");
        }
    }
}
