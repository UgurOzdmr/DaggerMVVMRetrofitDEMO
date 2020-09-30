package com.example.daggermvvmretrofit.ui.main.profile;

import android.util.Log;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.ViewModel;

import com.example.daggermvvmretrofit.SessionManager;
import com.example.daggermvvmretrofit.models.User;
import com.example.daggermvvmretrofit.ui.auth.AuthResource;

import javax.inject.Inject;

public class ProfileViewModel extends ViewModel {
    private static final String TAG = "ProfileViewModel";

    private final SessionManager sessionManager;

    @Inject
    public ProfileViewModel(SessionManager sessionManager) {
        this.sessionManager = sessionManager;
        Log.d(TAG, "ProfileViewModel: view model is ready");
    }

    public LiveData<AuthResource<User>> getAuthenticatedUser() {
        return sessionManager.getAuthUser();
    }
}
