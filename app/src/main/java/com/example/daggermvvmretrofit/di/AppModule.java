package com.example.daggermvvmretrofit.di;

import android.app.Application;
import android.graphics.drawable.Drawable;

import androidx.core.content.ContextCompat;

import com.bumptech.glide.Glide;
import com.bumptech.glide.RequestManager;
import com.bumptech.glide.request.RequestOptions;
import com.example.daggermvvmretrofit.R;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;


//Application level dependencies, Retrofit, glide , objects exc.
//Provides -> declare a dependency, create this dependency when client wants it.

@Module
public class AppModule {

    @Singleton //Same scope as Component annotated with Singleton.
    @Provides
    static RequestOptions provideRequestOptions() {
        return RequestOptions
                .placeholderOf(R.drawable.white_background)
                .error(R.drawable.white_background);
    }

    //Requestoptions provided above
    @Singleton
    @Provides
    static RequestManager provideGlideInstance(Application application, RequestOptions requestOptions) {
        return Glide.with(application)
                .setDefaultRequestOptions(requestOptions);
    }

    @Provides
    @Singleton
    static Drawable provideAppDrawable(Application application) {
        return ContextCompat.getDrawable(application, R.drawable.logo);
    }

}


