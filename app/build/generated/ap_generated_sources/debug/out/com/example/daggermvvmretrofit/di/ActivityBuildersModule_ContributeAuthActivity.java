package com.example.daggermvvmretrofit.di;

import com.example.daggermvvmretrofit.di.auth.AuthViewModelsModule;
import com.example.daggermvvmretrofit.ui.auth.AuthActivity;
import dagger.Binds;
import dagger.Module;
import dagger.Subcomponent;
import dagger.android.AndroidInjector;
import dagger.multibindings.ClassKey;
import dagger.multibindings.IntoMap;

@Module(
  subcomponents = ActivityBuildersModule_ContributeAuthActivity.AuthActivitySubcomponent.class
)
public abstract class ActivityBuildersModule_ContributeAuthActivity {
  private ActivityBuildersModule_ContributeAuthActivity() {}

  @Binds
  @IntoMap
  @ClassKey(AuthActivity.class)
  abstract AndroidInjector.Factory<?> bindAndroidInjectorFactory(
      AuthActivitySubcomponent.Factory builder);

  @Subcomponent(modules = AuthViewModelsModule.class)
  public interface AuthActivitySubcomponent extends AndroidInjector<AuthActivity> {
    @Subcomponent.Factory
    interface Factory extends AndroidInjector.Factory<AuthActivity> {}
  }
}
