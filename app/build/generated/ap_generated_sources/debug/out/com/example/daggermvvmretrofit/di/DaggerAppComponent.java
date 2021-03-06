// Generated by Dagger (https://google.github.io/dagger).
package com.example.daggermvvmretrofit.di;

import android.app.Activity;
import android.app.Application;
import android.app.Fragment;
import android.app.Service;
import android.content.BroadcastReceiver;
import android.content.ContentProvider;
import android.graphics.drawable.Drawable;
import androidx.lifecycle.ViewModel;
import com.bumptech.glide.RequestManager;
import com.bumptech.glide.request.RequestOptions;
import com.example.daggermvvmretrofit.BaseActivity_MembersInjector;
import com.example.daggermvvmretrofit.BaseApplication;
import com.example.daggermvvmretrofit.SessionManager;
import com.example.daggermvvmretrofit.SessionManager_Factory;
import com.example.daggermvvmretrofit.di.auth.AuthModule_ProvideAuthApiFactory;
import com.example.daggermvvmretrofit.di.main.MainFragmentBuildersModule_ContributePostFragment;
import com.example.daggermvvmretrofit.di.main.MainFragmentBuildersModule_ContributeProfileFragment;
import com.example.daggermvvmretrofit.di.main.MainModule_ProvideAdapterFactory;
import com.example.daggermvvmretrofit.di.main.MainModule_ProvideMainApiFactory;
import com.example.daggermvvmretrofit.network.auth.AuthApi;
import com.example.daggermvvmretrofit.network.main.MainApi;
import com.example.daggermvvmretrofit.ui.auth.AuthActivity;
import com.example.daggermvvmretrofit.ui.auth.AuthActivity_MembersInjector;
import com.example.daggermvvmretrofit.ui.auth.AuthViewModel;
import com.example.daggermvvmretrofit.ui.auth.AuthViewModel_Factory;
import com.example.daggermvvmretrofit.ui.main.MainActivity;
import com.example.daggermvvmretrofit.ui.main.posts.PostsFragment;
import com.example.daggermvvmretrofit.ui.main.posts.PostsFragment_MembersInjector;
import com.example.daggermvvmretrofit.ui.main.posts.PostsRecyclerAdapter;
import com.example.daggermvvmretrofit.ui.main.posts.PostsViewModel;
import com.example.daggermvvmretrofit.ui.main.posts.PostsViewModel_Factory;
import com.example.daggermvvmretrofit.ui.main.profile.ProfileFragment;
import com.example.daggermvvmretrofit.ui.main.profile.ProfileFragment_MembersInjector;
import com.example.daggermvvmretrofit.ui.main.profile.ProfileViewModel;
import com.example.daggermvvmretrofit.ui.main.profile.ProfileViewModel_Factory;
import com.example.daggermvvmretrofit.viewmodels.ViewModelProviderFactory;
import dagger.android.AndroidInjector;
import dagger.android.DaggerApplication_MembersInjector;
import dagger.android.DispatchingAndroidInjector;
import dagger.android.DispatchingAndroidInjector_Factory;
import dagger.android.support.DaggerAppCompatActivity_MembersInjector;
import dagger.android.support.DaggerFragment_MembersInjector;
import dagger.internal.DoubleCheck;
import dagger.internal.InstanceFactory;
import dagger.internal.MapBuilder;
import dagger.internal.Preconditions;
import java.util.Collections;
import java.util.Map;
import javax.inject.Provider;
import retrofit2.Retrofit;

public final class DaggerAppComponent implements AppComponent {
  private Provider<ActivityBuildersModule_ContributeAuthActivity.AuthActivitySubcomponent.Factory>
      authActivitySubcomponentFactoryProvider;

  private Provider<ActivityBuildersModule_ContributeMainActivity.MainActivitySubcomponent.Factory>
      mainActivitySubcomponentFactoryProvider;

  private Provider<SessionManager> sessionManagerProvider;

  private Provider<Retrofit> provideRetrofitInstanceProvider;

  private Provider<Application> applicationProvider;

  private Provider<Drawable> provideAppDrawableProvider;

  private Provider<RequestOptions> provideRequestOptionsProvider;

  private Provider<RequestManager> provideGlideInstanceProvider;

  private DaggerAppComponent(Application applicationParam) {

    initialize(applicationParam);
  }

  public static AppComponent.Builder builder() {
    return new Builder();
  }

  private Map<Class<?>, Provider<AndroidInjector.Factory<?>>>
      getMapOfClassOfAndProviderOfAndroidInjectorFactoryOf() {
    return MapBuilder.<Class<?>, Provider<AndroidInjector.Factory<?>>>newMapBuilder(2)
        .put(AuthActivity.class, (Provider) authActivitySubcomponentFactoryProvider)
        .put(MainActivity.class, (Provider) mainActivitySubcomponentFactoryProvider)
        .build();
  }

  private DispatchingAndroidInjector<Activity> getDispatchingAndroidInjectorOfActivity() {
    return DispatchingAndroidInjector_Factory.newInstance(
        getMapOfClassOfAndProviderOfAndroidInjectorFactoryOf(),
        Collections.<String, Provider<AndroidInjector.Factory<?>>>emptyMap());
  }

  private DispatchingAndroidInjector<BroadcastReceiver>
      getDispatchingAndroidInjectorOfBroadcastReceiver() {
    return DispatchingAndroidInjector_Factory.newInstance(
        getMapOfClassOfAndProviderOfAndroidInjectorFactoryOf(),
        Collections.<String, Provider<AndroidInjector.Factory<?>>>emptyMap());
  }

  private DispatchingAndroidInjector<Fragment> getDispatchingAndroidInjectorOfFragment() {
    return DispatchingAndroidInjector_Factory.newInstance(
        getMapOfClassOfAndProviderOfAndroidInjectorFactoryOf(),
        Collections.<String, Provider<AndroidInjector.Factory<?>>>emptyMap());
  }

  private DispatchingAndroidInjector<Service> getDispatchingAndroidInjectorOfService() {
    return DispatchingAndroidInjector_Factory.newInstance(
        getMapOfClassOfAndProviderOfAndroidInjectorFactoryOf(),
        Collections.<String, Provider<AndroidInjector.Factory<?>>>emptyMap());
  }

  private DispatchingAndroidInjector<ContentProvider>
      getDispatchingAndroidInjectorOfContentProvider() {
    return DispatchingAndroidInjector_Factory.newInstance(
        getMapOfClassOfAndProviderOfAndroidInjectorFactoryOf(),
        Collections.<String, Provider<AndroidInjector.Factory<?>>>emptyMap());
  }

  private DispatchingAndroidInjector<androidx.fragment.app.Fragment>
      getDispatchingAndroidInjectorOfFragment2() {
    return DispatchingAndroidInjector_Factory.newInstance(
        getMapOfClassOfAndProviderOfAndroidInjectorFactoryOf(),
        Collections.<String, Provider<AndroidInjector.Factory<?>>>emptyMap());
  }

  @SuppressWarnings("unchecked")
  private void initialize(final Application applicationParam) {
    this.authActivitySubcomponentFactoryProvider =
        new Provider<
            ActivityBuildersModule_ContributeAuthActivity.AuthActivitySubcomponent.Factory>() {
          @Override
          public ActivityBuildersModule_ContributeAuthActivity.AuthActivitySubcomponent.Factory
              get() {
            return new AuthActivitySubcomponentFactory();
          }
        };
    this.mainActivitySubcomponentFactoryProvider =
        new Provider<
            ActivityBuildersModule_ContributeMainActivity.MainActivitySubcomponent.Factory>() {
          @Override
          public ActivityBuildersModule_ContributeMainActivity.MainActivitySubcomponent.Factory
              get() {
            return new MainActivitySubcomponentFactory();
          }
        };
    this.sessionManagerProvider = DoubleCheck.provider(SessionManager_Factory.create());
    this.provideRetrofitInstanceProvider =
        DoubleCheck.provider(AppModule_ProvideRetrofitInstanceFactory.create());
    this.applicationProvider = InstanceFactory.create(applicationParam);
    this.provideAppDrawableProvider =
        DoubleCheck.provider(AppModule_ProvideAppDrawableFactory.create(applicationProvider));
    this.provideRequestOptionsProvider =
        DoubleCheck.provider(AppModule_ProvideRequestOptionsFactory.create());
    this.provideGlideInstanceProvider =
        DoubleCheck.provider(
            AppModule_ProvideGlideInstanceFactory.create(
                applicationProvider, provideRequestOptionsProvider));
  }

  @Override
  public void inject(BaseApplication arg0) {
    injectBaseApplication(arg0);
  }

  @Override
  public SessionManager sessionManager() {
    return sessionManagerProvider.get();
  }

  private BaseApplication injectBaseApplication(BaseApplication instance) {
    DaggerApplication_MembersInjector.injectActivityInjector(
        instance, getDispatchingAndroidInjectorOfActivity());
    DaggerApplication_MembersInjector.injectBroadcastReceiverInjector(
        instance, getDispatchingAndroidInjectorOfBroadcastReceiver());
    DaggerApplication_MembersInjector.injectFragmentInjector(
        instance, getDispatchingAndroidInjectorOfFragment());
    DaggerApplication_MembersInjector.injectServiceInjector(
        instance, getDispatchingAndroidInjectorOfService());
    DaggerApplication_MembersInjector.injectContentProviderInjector(
        instance, getDispatchingAndroidInjectorOfContentProvider());
    DaggerApplication_MembersInjector.injectSetInjected(instance);
    dagger.android.support.DaggerApplication_MembersInjector.injectSupportFragmentInjector(
        instance, getDispatchingAndroidInjectorOfFragment2());
    return instance;
  }

  private static final class Builder implements AppComponent.Builder {
    private Application application;

    @Override
    public Builder application(Application application) {
      this.application = Preconditions.checkNotNull(application);
      return this;
    }

    @Override
    public AppComponent build() {
      Preconditions.checkBuilderRequirement(application, Application.class);
      return new DaggerAppComponent(application);
    }
  }

  private final class AuthActivitySubcomponentFactory
      implements ActivityBuildersModule_ContributeAuthActivity.AuthActivitySubcomponent.Factory {
    @Override
    public ActivityBuildersModule_ContributeAuthActivity.AuthActivitySubcomponent create(
        AuthActivity arg0) {
      Preconditions.checkNotNull(arg0);
      return new AuthActivitySubcomponentImpl(arg0);
    }
  }

  private final class AuthActivitySubcomponentImpl
      implements ActivityBuildersModule_ContributeAuthActivity.AuthActivitySubcomponent {
    private Provider<AuthApi> provideAuthApiProvider;

    private Provider<AuthViewModel> authViewModelProvider;

    private AuthActivitySubcomponentImpl(AuthActivity arg0) {

      initialize(arg0);
    }

    private Map<Class<? extends ViewModel>, Provider<ViewModel>>
        getMapOfClassOfAndProviderOfViewModel() {
      return Collections.<Class<? extends ViewModel>, Provider<ViewModel>>singletonMap(
          AuthViewModel.class, (Provider) authViewModelProvider);
    }

    private ViewModelProviderFactory getViewModelProviderFactory() {
      return new ViewModelProviderFactory(getMapOfClassOfAndProviderOfViewModel());
    }

    @SuppressWarnings("unchecked")
    private void initialize(final AuthActivity arg0) {
      this.provideAuthApiProvider =
          DoubleCheck.provider(
              AuthModule_ProvideAuthApiFactory.create(
                  DaggerAppComponent.this.provideRetrofitInstanceProvider));
      this.authViewModelProvider =
          AuthViewModel_Factory.create(
              provideAuthApiProvider, DaggerAppComponent.this.sessionManagerProvider);
    }

    @Override
    public void inject(AuthActivity arg0) {
      injectAuthActivity(arg0);
    }

    private AuthActivity injectAuthActivity(AuthActivity instance) {
      DaggerAppCompatActivity_MembersInjector.injectSupportFragmentInjector(
          instance, DaggerAppComponent.this.getDispatchingAndroidInjectorOfFragment2());
      DaggerAppCompatActivity_MembersInjector.injectFrameworkFragmentInjector(
          instance, DaggerAppComponent.this.getDispatchingAndroidInjectorOfFragment());
      AuthActivity_MembersInjector.injectProviderFactory(instance, getViewModelProviderFactory());
      AuthActivity_MembersInjector.injectLogo(
          instance, DaggerAppComponent.this.provideAppDrawableProvider.get());
      AuthActivity_MembersInjector.injectRequestManager(
          instance, DaggerAppComponent.this.provideGlideInstanceProvider.get());
      return instance;
    }
  }

  private final class MainActivitySubcomponentFactory
      implements ActivityBuildersModule_ContributeMainActivity.MainActivitySubcomponent.Factory {
    @Override
    public ActivityBuildersModule_ContributeMainActivity.MainActivitySubcomponent create(
        MainActivity arg0) {
      Preconditions.checkNotNull(arg0);
      return new MainActivitySubcomponentImpl(arg0);
    }
  }

  private final class MainActivitySubcomponentImpl
      implements ActivityBuildersModule_ContributeMainActivity.MainActivitySubcomponent {
    private Provider<
            MainFragmentBuildersModule_ContributeProfileFragment.ProfileFragmentSubcomponent
                .Factory>
        profileFragmentSubcomponentFactoryProvider;

    private Provider<
            MainFragmentBuildersModule_ContributePostFragment.PostsFragmentSubcomponent.Factory>
        postsFragmentSubcomponentFactoryProvider;

    private Provider<MainApi> provideMainApiProvider;

    private Provider<PostsRecyclerAdapter> provideAdapterProvider;

    private MainActivitySubcomponentImpl(MainActivity arg0) {

      initialize(arg0);
    }

    private Map<Class<?>, Provider<AndroidInjector.Factory<?>>>
        getMapOfClassOfAndProviderOfAndroidInjectorFactoryOf() {
      return MapBuilder.<Class<?>, Provider<AndroidInjector.Factory<?>>>newMapBuilder(4)
          .put(
              AuthActivity.class,
              (Provider) DaggerAppComponent.this.authActivitySubcomponentFactoryProvider)
          .put(
              MainActivity.class,
              (Provider) DaggerAppComponent.this.mainActivitySubcomponentFactoryProvider)
          .put(ProfileFragment.class, (Provider) profileFragmentSubcomponentFactoryProvider)
          .put(PostsFragment.class, (Provider) postsFragmentSubcomponentFactoryProvider)
          .build();
    }

    private DispatchingAndroidInjector<androidx.fragment.app.Fragment>
        getDispatchingAndroidInjectorOfFragment() {
      return DispatchingAndroidInjector_Factory.newInstance(
          getMapOfClassOfAndProviderOfAndroidInjectorFactoryOf(),
          Collections.<String, Provider<AndroidInjector.Factory<?>>>emptyMap());
    }

    private DispatchingAndroidInjector<Fragment> getDispatchingAndroidInjectorOfFragment2() {
      return DispatchingAndroidInjector_Factory.newInstance(
          getMapOfClassOfAndProviderOfAndroidInjectorFactoryOf(),
          Collections.<String, Provider<AndroidInjector.Factory<?>>>emptyMap());
    }

    @SuppressWarnings("unchecked")
    private void initialize(final MainActivity arg0) {
      this.profileFragmentSubcomponentFactoryProvider =
          new Provider<
              MainFragmentBuildersModule_ContributeProfileFragment.ProfileFragmentSubcomponent
                  .Factory>() {
            @Override
            public MainFragmentBuildersModule_ContributeProfileFragment.ProfileFragmentSubcomponent
                    .Factory
                get() {
              return new ProfileFragmentSubcomponentFactory();
            }
          };
      this.postsFragmentSubcomponentFactoryProvider =
          new Provider<
              MainFragmentBuildersModule_ContributePostFragment.PostsFragmentSubcomponent
                  .Factory>() {
            @Override
            public MainFragmentBuildersModule_ContributePostFragment.PostsFragmentSubcomponent
                    .Factory
                get() {
              return new PostsFragmentSubcomponentFactory();
            }
          };
      this.provideMainApiProvider =
          DoubleCheck.provider(
              MainModule_ProvideMainApiFactory.create(
                  DaggerAppComponent.this.provideRetrofitInstanceProvider));
      this.provideAdapterProvider = DoubleCheck.provider(MainModule_ProvideAdapterFactory.create());
    }

    @Override
    public void inject(MainActivity arg0) {
      injectMainActivity(arg0);
    }

    private MainActivity injectMainActivity(MainActivity instance) {
      DaggerAppCompatActivity_MembersInjector.injectSupportFragmentInjector(
          instance, getDispatchingAndroidInjectorOfFragment());
      DaggerAppCompatActivity_MembersInjector.injectFrameworkFragmentInjector(
          instance, getDispatchingAndroidInjectorOfFragment2());
      BaseActivity_MembersInjector.injectSessionManager(
          instance, DaggerAppComponent.this.sessionManagerProvider.get());
      return instance;
    }

    private final class ProfileFragmentSubcomponentFactory
        implements MainFragmentBuildersModule_ContributeProfileFragment.ProfileFragmentSubcomponent
            .Factory {
      @Override
      public MainFragmentBuildersModule_ContributeProfileFragment.ProfileFragmentSubcomponent
          create(ProfileFragment arg0) {
        Preconditions.checkNotNull(arg0);
        return new ProfileFragmentSubcomponentImpl(arg0);
      }
    }

    private final class ProfileFragmentSubcomponentImpl
        implements MainFragmentBuildersModule_ContributeProfileFragment
            .ProfileFragmentSubcomponent {
      private Provider<ProfileViewModel> profileViewModelProvider;

      private Provider<PostsViewModel> postsViewModelProvider;

      private ProfileFragmentSubcomponentImpl(ProfileFragment arg0) {

        initialize(arg0);
      }

      private Map<Class<? extends ViewModel>, Provider<ViewModel>>
          getMapOfClassOfAndProviderOfViewModel() {
        return MapBuilder.<Class<? extends ViewModel>, Provider<ViewModel>>newMapBuilder(2)
            .put(ProfileViewModel.class, (Provider) profileViewModelProvider)
            .put(PostsViewModel.class, (Provider) postsViewModelProvider)
            .build();
      }

      private ViewModelProviderFactory getViewModelProviderFactory() {
        return new ViewModelProviderFactory(getMapOfClassOfAndProviderOfViewModel());
      }

      @SuppressWarnings("unchecked")
      private void initialize(final ProfileFragment arg0) {
        this.profileViewModelProvider =
            ProfileViewModel_Factory.create(DaggerAppComponent.this.sessionManagerProvider);
        this.postsViewModelProvider =
            PostsViewModel_Factory.create(
                DaggerAppComponent.this.sessionManagerProvider,
                MainActivitySubcomponentImpl.this.provideMainApiProvider);
      }

      @Override
      public void inject(ProfileFragment arg0) {
        injectProfileFragment(arg0);
      }

      private ProfileFragment injectProfileFragment(ProfileFragment instance) {
        DaggerFragment_MembersInjector.injectChildFragmentInjector(
            instance, MainActivitySubcomponentImpl.this.getDispatchingAndroidInjectorOfFragment());
        ProfileFragment_MembersInjector.injectProviderFactory(
            instance, getViewModelProviderFactory());
        return instance;
      }
    }

    private final class PostsFragmentSubcomponentFactory
        implements MainFragmentBuildersModule_ContributePostFragment.PostsFragmentSubcomponent
            .Factory {
      @Override
      public MainFragmentBuildersModule_ContributePostFragment.PostsFragmentSubcomponent create(
          PostsFragment arg0) {
        Preconditions.checkNotNull(arg0);
        return new PostsFragmentSubcomponentImpl(arg0);
      }
    }

    private final class PostsFragmentSubcomponentImpl
        implements MainFragmentBuildersModule_ContributePostFragment.PostsFragmentSubcomponent {
      private Provider<ProfileViewModel> profileViewModelProvider;

      private Provider<PostsViewModel> postsViewModelProvider;

      private PostsFragmentSubcomponentImpl(PostsFragment arg0) {

        initialize(arg0);
      }

      private Map<Class<? extends ViewModel>, Provider<ViewModel>>
          getMapOfClassOfAndProviderOfViewModel() {
        return MapBuilder.<Class<? extends ViewModel>, Provider<ViewModel>>newMapBuilder(2)
            .put(ProfileViewModel.class, (Provider) profileViewModelProvider)
            .put(PostsViewModel.class, (Provider) postsViewModelProvider)
            .build();
      }

      private ViewModelProviderFactory getViewModelProviderFactory() {
        return new ViewModelProviderFactory(getMapOfClassOfAndProviderOfViewModel());
      }

      @SuppressWarnings("unchecked")
      private void initialize(final PostsFragment arg0) {
        this.profileViewModelProvider =
            ProfileViewModel_Factory.create(DaggerAppComponent.this.sessionManagerProvider);
        this.postsViewModelProvider =
            PostsViewModel_Factory.create(
                DaggerAppComponent.this.sessionManagerProvider,
                MainActivitySubcomponentImpl.this.provideMainApiProvider);
      }

      @Override
      public void inject(PostsFragment arg0) {
        injectPostsFragment(arg0);
      }

      private PostsFragment injectPostsFragment(PostsFragment instance) {
        DaggerFragment_MembersInjector.injectChildFragmentInjector(
            instance, MainActivitySubcomponentImpl.this.getDispatchingAndroidInjectorOfFragment());
        PostsFragment_MembersInjector.injectAdapter(
            instance, MainActivitySubcomponentImpl.this.provideAdapterProvider.get());
        PostsFragment_MembersInjector.injectProviderFactory(
            instance, getViewModelProviderFactory());
        return instance;
      }
    }
  }
}
