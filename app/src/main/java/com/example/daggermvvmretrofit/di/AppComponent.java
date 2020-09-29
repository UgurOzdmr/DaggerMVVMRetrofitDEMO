package com.example.daggermvvmretrofit.di;

import android.app.Application;

import com.example.daggermvvmretrofit.BaseApplication;

import javax.inject.Singleton;

import dagger.BindsInstance;
import dagger.Component;
import dagger.android.AndroidInjector;
import dagger.android.support.AndroidSupportInjectionModule;
//Base application is client of AppComponent(service)
// client-service relationship

@Singleton //Application wide singleton. OWNS THE SINGLETON SCOPE
@Component (
        modules =  {
                AndroidSupportInjectionModule.class,
                ActivityBuildersModule.class,
                AppModule.class
        }
)
public interface AppComponent extends AndroidInjector<BaseApplication> {

    @Component.Builder
    interface Builder {

        //Something you can use if you want to bind a particular object or particular instance of an object to the component at the time of its construction
        @BindsInstance
        Builder application(Application application);

        //application will be avaliable for us to use in modules.
        AppComponent build();
    }
}

