// Generated by dagger.internal.codegen.ComponentProcessor (https://google.github.io/dagger).
package com.mbit.inventorytracker.injection;

import android.app.Activity;
import android.app.Fragment;
import android.app.Service;
import android.content.BroadcastReceiver;
import android.content.ContentProvider;
import com.mbit.inventorytracker.InitApp;
import com.mbit.inventorytracker.InitApp_MembersInjector;
import com.mbit.inventorytracker.activities.MainActivity;
import com.mbit.inventorytracker.activities.MainActivity_MembersInjector;
import com.mbit.inventorytracker.database.DBContext;
import com.mbit.inventorytracker.fragments.abstraction.FragmentBase;
import com.mbit.inventorytracker.fragments.abstraction.FragmentBase_MembersInjector;
import com.mbit.inventorytracker.fragments.choose_location.ChooseLocationFragment;
import com.mbit.inventorytracker.fragments.choose_location.ChooseLocationFragment_MembersInjector;
import com.mbit.inventorytracker.fragments.login.LoginFragment;
import com.mbit.inventorytracker.fragments.login.LoginFragment_MembersInjector;
import com.mbit.inventorytracker.fragments.new_position.NewItemFragment;
import com.mbit.inventorytracker.fragments.new_position.NewItemFragment_MembersInjector;
import com.mbit.inventorytracker.fragments.positions_list.empty_list.EmptyListFragment;
import com.mbit.inventorytracker.fragments.positions_list.empty_list.EmptyListFragment_MembersInjector;
import com.mbit.inventorytracker.fragments.positions_list.scanned_list.ScannedListFragment;
import com.mbit.inventorytracker.fragments.positions_list.scanned_list.ScannedListFragment_MembersInjector;
import com.mbit.inventorytracker.fragments.report.ReportFragment;
import com.mbit.inventorytracker.fragments.report.ReportFragment_MembersInjector;
import com.mbit.inventorytracker.fragments.scan_positions.ScanPositionsFragment;
import com.mbit.inventorytracker.fragments.scan_positions.ScanPositionsFragment_MembersInjector;
import dagger.MembersInjector;
import dagger.android.AndroidInjector;
import dagger.android.DispatchingAndroidInjector;
import dagger.android.DispatchingAndroidInjector_Factory;
import dagger.internal.DoubleCheck;
import dagger.internal.MapProviderFactory;
import dagger.internal.Preconditions;
import java.util.Map;
import javax.inject.Provider;

public final class DaggerAppComponent implements AppComponent {
  private Provider<
          ActivityInjectorsModule_ProvideMainActivityInjector.MainActivitySubcomponent.Builder>
      mainActivitySubcomponentBuilderProvider;

  private Provider<AndroidInjector.Factory<? extends Activity>> bindAndroidInjectorFactoryProvider;

  private Provider<
          Map<Class<? extends Activity>, Provider<AndroidInjector.Factory<? extends Activity>>>>
      mapOfClassOfAndProviderOfFactoryOfProvider;

  private Provider<DispatchingAndroidInjector<Activity>> dispatchingAndroidInjectorProvider;

  private Provider<DispatchingAndroidInjector<BroadcastReceiver>>
      dispatchingAndroidInjectorProvider2;

  private Provider<
          FragmentInjectorsModule_ContributeFragmentGeneralBase$app_debug.FragmentBaseSubcomponent
              .Builder>
      fragmentBaseSubcomponentBuilderProvider;

  private Provider<AndroidInjector.Factory<? extends Fragment>> bindAndroidInjectorFactoryProvider2;

  private Provider<
          FragmentInjectorsModule_ContributeLoginFragment$app_debug.LoginFragmentSubcomponent
              .Builder>
      loginFragmentSubcomponentBuilderProvider;

  private Provider<AndroidInjector.Factory<? extends Fragment>> bindAndroidInjectorFactoryProvider3;

  private Provider<
          FragmentInjectorsModule_ContributeEmptyListFragment$app_debug
              .EmptyListFragmentSubcomponent.Builder>
      emptyListFragmentSubcomponentBuilderProvider;

  private Provider<AndroidInjector.Factory<? extends Fragment>> bindAndroidInjectorFactoryProvider4;

  private Provider<
          FragmentInjectorsModule_ContributeScannedListFragment$app_debug
              .ScannedListFragmentSubcomponent.Builder>
      scannedListFragmentSubcomponentBuilderProvider;

  private Provider<AndroidInjector.Factory<? extends Fragment>> bindAndroidInjectorFactoryProvider5;

  private Provider<
          FragmentInjectorsModule_ContributeReportFragment$app_debug.ReportFragmentSubcomponent
              .Builder>
      reportFragmentSubcomponentBuilderProvider;

  private Provider<AndroidInjector.Factory<? extends Fragment>> bindAndroidInjectorFactoryProvider6;

  private Provider<
          FragmentInjectorsModule_ContributeScanPositionsFragment$app_debug
              .ScanPositionsFragmentSubcomponent.Builder>
      scanPositionsFragmentSubcomponentBuilderProvider;

  private Provider<AndroidInjector.Factory<? extends Fragment>> bindAndroidInjectorFactoryProvider7;

  private Provider<
          FragmentInjectorsModule_ContributeNewItemFragment$app_debug.NewItemFragmentSubcomponent
              .Builder>
      newItemFragmentSubcomponentBuilderProvider;

  private Provider<AndroidInjector.Factory<? extends Fragment>> bindAndroidInjectorFactoryProvider8;

  private Provider<
          FragmentInjectorsModule_ContributeChooseLocationFragment$app_debug
              .ChooseLocationFragmentSubcomponent.Builder>
      chooseLocationFragmentSubcomponentBuilderProvider;

  private Provider<AndroidInjector.Factory<? extends Fragment>> bindAndroidInjectorFactoryProvider9;

  private Provider<
          Map<Class<? extends Fragment>, Provider<AndroidInjector.Factory<? extends Fragment>>>>
      mapOfClassOfAndProviderOfFactoryOfProvider2;

  private Provider<DispatchingAndroidInjector<Fragment>> dispatchingAndroidInjectorProvider3;

  private Provider<DispatchingAndroidInjector<Service>> dispatchingAndroidInjectorProvider4;

  private Provider<DispatchingAndroidInjector<ContentProvider>> dispatchingAndroidInjectorProvider5;

  private MembersInjector<InitApp> initAppMembersInjector;

  private Provider<DBContext> providesDBContextProvider;

  private DaggerAppComponent(Builder builder) {
    assert builder != null;
    initialize(builder);
  }

  public static AppComponent.Builder builder() {
    return new Builder();
  }

  @SuppressWarnings("unchecked")
  private void initialize(final Builder builder) {

    this.mainActivitySubcomponentBuilderProvider =
        new dagger.internal.Factory<
            ActivityInjectorsModule_ProvideMainActivityInjector.MainActivitySubcomponent
                .Builder>() {
          @Override
          public ActivityInjectorsModule_ProvideMainActivityInjector.MainActivitySubcomponent
                  .Builder
              get() {
            return new MainActivitySubcomponentBuilder();
          }
        };

    this.bindAndroidInjectorFactoryProvider = (Provider) mainActivitySubcomponentBuilderProvider;

    this.mapOfClassOfAndProviderOfFactoryOfProvider =
        MapProviderFactory
            .<Class<? extends Activity>, AndroidInjector.Factory<? extends Activity>>builder(1)
            .put(MainActivity.class, bindAndroidInjectorFactoryProvider)
            .build();

    this.dispatchingAndroidInjectorProvider =
        DispatchingAndroidInjector_Factory.create(mapOfClassOfAndProviderOfFactoryOfProvider);

    this.dispatchingAndroidInjectorProvider2 =
        DispatchingAndroidInjector_Factory.create(
            MapProviderFactory
                .<Class<? extends BroadcastReceiver>,
                    AndroidInjector.Factory<? extends BroadcastReceiver>>
                    empty());

    this.fragmentBaseSubcomponentBuilderProvider =
        new dagger.internal.Factory<
            FragmentInjectorsModule_ContributeFragmentGeneralBase$app_debug.FragmentBaseSubcomponent
                .Builder>() {
          @Override
          public FragmentInjectorsModule_ContributeFragmentGeneralBase$app_debug
                  .FragmentBaseSubcomponent.Builder
              get() {
            return new FragmentBaseSubcomponentBuilder();
          }
        };

    this.bindAndroidInjectorFactoryProvider2 = (Provider) fragmentBaseSubcomponentBuilderProvider;

    this.loginFragmentSubcomponentBuilderProvider =
        new dagger.internal.Factory<
            FragmentInjectorsModule_ContributeLoginFragment$app_debug.LoginFragmentSubcomponent
                .Builder>() {
          @Override
          public FragmentInjectorsModule_ContributeLoginFragment$app_debug.LoginFragmentSubcomponent
                  .Builder
              get() {
            return new LoginFragmentSubcomponentBuilder();
          }
        };

    this.bindAndroidInjectorFactoryProvider3 = (Provider) loginFragmentSubcomponentBuilderProvider;

    this.emptyListFragmentSubcomponentBuilderProvider =
        new dagger.internal.Factory<
            FragmentInjectorsModule_ContributeEmptyListFragment$app_debug
                .EmptyListFragmentSubcomponent.Builder>() {
          @Override
          public FragmentInjectorsModule_ContributeEmptyListFragment$app_debug
                  .EmptyListFragmentSubcomponent.Builder
              get() {
            return new EmptyListFragmentSubcomponentBuilder();
          }
        };

    this.bindAndroidInjectorFactoryProvider4 =
        (Provider) emptyListFragmentSubcomponentBuilderProvider;

    this.scannedListFragmentSubcomponentBuilderProvider =
        new dagger.internal.Factory<
            FragmentInjectorsModule_ContributeScannedListFragment$app_debug
                .ScannedListFragmentSubcomponent.Builder>() {
          @Override
          public FragmentInjectorsModule_ContributeScannedListFragment$app_debug
                  .ScannedListFragmentSubcomponent.Builder
              get() {
            return new ScannedListFragmentSubcomponentBuilder();
          }
        };

    this.bindAndroidInjectorFactoryProvider5 =
        (Provider) scannedListFragmentSubcomponentBuilderProvider;

    this.reportFragmentSubcomponentBuilderProvider =
        new dagger.internal.Factory<
            FragmentInjectorsModule_ContributeReportFragment$app_debug.ReportFragmentSubcomponent
                .Builder>() {
          @Override
          public FragmentInjectorsModule_ContributeReportFragment$app_debug
                  .ReportFragmentSubcomponent.Builder
              get() {
            return new ReportFragmentSubcomponentBuilder();
          }
        };

    this.bindAndroidInjectorFactoryProvider6 = (Provider) reportFragmentSubcomponentBuilderProvider;

    this.scanPositionsFragmentSubcomponentBuilderProvider =
        new dagger.internal.Factory<
            FragmentInjectorsModule_ContributeScanPositionsFragment$app_debug
                .ScanPositionsFragmentSubcomponent.Builder>() {
          @Override
          public FragmentInjectorsModule_ContributeScanPositionsFragment$app_debug
                  .ScanPositionsFragmentSubcomponent.Builder
              get() {
            return new ScanPositionsFragmentSubcomponentBuilder();
          }
        };

    this.bindAndroidInjectorFactoryProvider7 =
        (Provider) scanPositionsFragmentSubcomponentBuilderProvider;

    this.newItemFragmentSubcomponentBuilderProvider =
        new dagger.internal.Factory<
            FragmentInjectorsModule_ContributeNewItemFragment$app_debug.NewItemFragmentSubcomponent
                .Builder>() {
          @Override
          public FragmentInjectorsModule_ContributeNewItemFragment$app_debug
                  .NewItemFragmentSubcomponent.Builder
              get() {
            return new NewItemFragmentSubcomponentBuilder();
          }
        };

    this.bindAndroidInjectorFactoryProvider8 =
        (Provider) newItemFragmentSubcomponentBuilderProvider;

    this.chooseLocationFragmentSubcomponentBuilderProvider =
        new dagger.internal.Factory<
            FragmentInjectorsModule_ContributeChooseLocationFragment$app_debug
                .ChooseLocationFragmentSubcomponent.Builder>() {
          @Override
          public FragmentInjectorsModule_ContributeChooseLocationFragment$app_debug
                  .ChooseLocationFragmentSubcomponent.Builder
              get() {
            return new ChooseLocationFragmentSubcomponentBuilder();
          }
        };

    this.bindAndroidInjectorFactoryProvider9 =
        (Provider) chooseLocationFragmentSubcomponentBuilderProvider;

    this.mapOfClassOfAndProviderOfFactoryOfProvider2 =
        MapProviderFactory
            .<Class<? extends Fragment>, AndroidInjector.Factory<? extends Fragment>>builder(8)
            .put(FragmentBase.class, bindAndroidInjectorFactoryProvider2)
            .put(LoginFragment.class, bindAndroidInjectorFactoryProvider3)
            .put(EmptyListFragment.class, bindAndroidInjectorFactoryProvider4)
            .put(ScannedListFragment.class, bindAndroidInjectorFactoryProvider5)
            .put(ReportFragment.class, bindAndroidInjectorFactoryProvider6)
            .put(ScanPositionsFragment.class, bindAndroidInjectorFactoryProvider7)
            .put(NewItemFragment.class, bindAndroidInjectorFactoryProvider8)
            .put(ChooseLocationFragment.class, bindAndroidInjectorFactoryProvider9)
            .build();

    this.dispatchingAndroidInjectorProvider3 =
        DispatchingAndroidInjector_Factory.create(mapOfClassOfAndProviderOfFactoryOfProvider2);

    this.dispatchingAndroidInjectorProvider4 =
        DispatchingAndroidInjector_Factory.create(
            MapProviderFactory
                .<Class<? extends Service>, AndroidInjector.Factory<? extends Service>>empty());

    this.dispatchingAndroidInjectorProvider5 =
        DispatchingAndroidInjector_Factory.create(
            MapProviderFactory
                .<Class<? extends ContentProvider>,
                    AndroidInjector.Factory<? extends ContentProvider>>
                    empty());

    this.initAppMembersInjector =
        InitApp_MembersInjector.create(
            dispatchingAndroidInjectorProvider,
            dispatchingAndroidInjectorProvider2,
            dispatchingAndroidInjectorProvider3,
            dispatchingAndroidInjectorProvider4,
            dispatchingAndroidInjectorProvider5);

    this.providesDBContextProvider =
        DoubleCheck.provider(
            ApplicationModule_ProvidesDBContextFactory.create(builder.applicationModule));
  }

  @Override
  public void inject(InitApp arg0) {
    initAppMembersInjector.injectMembers(arg0);
  }

  private static final class Builder extends AppComponent.Builder {
    private ApplicationModule applicationModule;

    private InitApp seedInstance;

    @Override
    public AppComponent build() {
      if (applicationModule == null) {
        throw new IllegalStateException(
            ApplicationModule.class.getCanonicalName() + " must be set");
      }
      if (seedInstance == null) {
        throw new IllegalStateException(InitApp.class.getCanonicalName() + " must be set");
      }
      return new DaggerAppComponent(this);
    }

    @Override
    public void seedInstance(InitApp arg0) {
      this.seedInstance = Preconditions.checkNotNull(arg0);
    }

    @Override
    public void setApplicationModule(ApplicationModule module) {
      this.applicationModule = Preconditions.checkNotNull(module);
    }
  }

  private final class MainActivitySubcomponentBuilder
      extends ActivityInjectorsModule_ProvideMainActivityInjector.MainActivitySubcomponent.Builder {
    private MainActivity seedInstance;

    @Override
    public ActivityInjectorsModule_ProvideMainActivityInjector.MainActivitySubcomponent build() {
      if (seedInstance == null) {
        throw new IllegalStateException(MainActivity.class.getCanonicalName() + " must be set");
      }
      return new MainActivitySubcomponentImpl(this);
    }

    @Override
    public void seedInstance(MainActivity arg0) {
      this.seedInstance = Preconditions.checkNotNull(arg0);
    }
  }

  private final class MainActivitySubcomponentImpl
      implements ActivityInjectorsModule_ProvideMainActivityInjector.MainActivitySubcomponent {
    private MembersInjector<MainActivity> mainActivityMembersInjector;

    private MainActivitySubcomponentImpl(MainActivitySubcomponentBuilder builder) {
      assert builder != null;
      initialize(builder);
    }

    @SuppressWarnings("unchecked")
    private void initialize(final MainActivitySubcomponentBuilder builder) {

      this.mainActivityMembersInjector =
          MainActivity_MembersInjector.create(
              DaggerAppComponent.this.dispatchingAndroidInjectorProvider3);
    }

    @Override
    public void inject(MainActivity arg0) {
      mainActivityMembersInjector.injectMembers(arg0);
    }
  }

  private final class FragmentBaseSubcomponentBuilder
      extends FragmentInjectorsModule_ContributeFragmentGeneralBase$app_debug
          .FragmentBaseSubcomponent.Builder {
    private FragmentBase seedInstance;

    @Override
    public FragmentInjectorsModule_ContributeFragmentGeneralBase$app_debug.FragmentBaseSubcomponent
        build() {
      if (seedInstance == null) {
        throw new IllegalStateException(FragmentBase.class.getCanonicalName() + " must be set");
      }
      return new FragmentBaseSubcomponentImpl(this);
    }

    @Override
    public void seedInstance(FragmentBase arg0) {
      this.seedInstance = Preconditions.checkNotNull(arg0);
    }
  }

  private final class FragmentBaseSubcomponentImpl
      implements FragmentInjectorsModule_ContributeFragmentGeneralBase$app_debug
          .FragmentBaseSubcomponent {
    private MembersInjector<FragmentBase> fragmentBaseMembersInjector;

    private FragmentBaseSubcomponentImpl(FragmentBaseSubcomponentBuilder builder) {
      assert builder != null;
      initialize(builder);
    }

    @SuppressWarnings("unchecked")
    private void initialize(final FragmentBaseSubcomponentBuilder builder) {

      this.fragmentBaseMembersInjector =
          FragmentBase_MembersInjector.create(DaggerAppComponent.this.providesDBContextProvider);
    }

    @Override
    public void inject(FragmentBase arg0) {
      fragmentBaseMembersInjector.injectMembers(arg0);
    }
  }

  private final class LoginFragmentSubcomponentBuilder
      extends FragmentInjectorsModule_ContributeLoginFragment$app_debug.LoginFragmentSubcomponent
          .Builder {
    private LoginFragment seedInstance;

    @Override
    public FragmentInjectorsModule_ContributeLoginFragment$app_debug.LoginFragmentSubcomponent
        build() {
      if (seedInstance == null) {
        throw new IllegalStateException(LoginFragment.class.getCanonicalName() + " must be set");
      }
      return new LoginFragmentSubcomponentImpl(this);
    }

    @Override
    public void seedInstance(LoginFragment arg0) {
      this.seedInstance = Preconditions.checkNotNull(arg0);
    }
  }

  private final class LoginFragmentSubcomponentImpl
      implements FragmentInjectorsModule_ContributeLoginFragment$app_debug
          .LoginFragmentSubcomponent {
    private MembersInjector<LoginFragment> loginFragmentMembersInjector;

    private LoginFragmentSubcomponentImpl(LoginFragmentSubcomponentBuilder builder) {
      assert builder != null;
      initialize(builder);
    }

    @SuppressWarnings("unchecked")
    private void initialize(final LoginFragmentSubcomponentBuilder builder) {

      this.loginFragmentMembersInjector =
          LoginFragment_MembersInjector.create(DaggerAppComponent.this.providesDBContextProvider);
    }

    @Override
    public void inject(LoginFragment arg0) {
      loginFragmentMembersInjector.injectMembers(arg0);
    }
  }

  private final class EmptyListFragmentSubcomponentBuilder
      extends FragmentInjectorsModule_ContributeEmptyListFragment$app_debug
          .EmptyListFragmentSubcomponent.Builder {
    private EmptyListFragment seedInstance;

    @Override
    public FragmentInjectorsModule_ContributeEmptyListFragment$app_debug
            .EmptyListFragmentSubcomponent
        build() {
      if (seedInstance == null) {
        throw new IllegalStateException(
            EmptyListFragment.class.getCanonicalName() + " must be set");
      }
      return new EmptyListFragmentSubcomponentImpl(this);
    }

    @Override
    public void seedInstance(EmptyListFragment arg0) {
      this.seedInstance = Preconditions.checkNotNull(arg0);
    }
  }

  private final class EmptyListFragmentSubcomponentImpl
      implements FragmentInjectorsModule_ContributeEmptyListFragment$app_debug
          .EmptyListFragmentSubcomponent {
    private MembersInjector<EmptyListFragment> emptyListFragmentMembersInjector;

    private EmptyListFragmentSubcomponentImpl(EmptyListFragmentSubcomponentBuilder builder) {
      assert builder != null;
      initialize(builder);
    }

    @SuppressWarnings("unchecked")
    private void initialize(final EmptyListFragmentSubcomponentBuilder builder) {

      this.emptyListFragmentMembersInjector =
          EmptyListFragment_MembersInjector.create(
              DaggerAppComponent.this.providesDBContextProvider);
    }

    @Override
    public void inject(EmptyListFragment arg0) {
      emptyListFragmentMembersInjector.injectMembers(arg0);
    }
  }

  private final class ScannedListFragmentSubcomponentBuilder
      extends FragmentInjectorsModule_ContributeScannedListFragment$app_debug
          .ScannedListFragmentSubcomponent.Builder {
    private ScannedListFragment seedInstance;

    @Override
    public FragmentInjectorsModule_ContributeScannedListFragment$app_debug
            .ScannedListFragmentSubcomponent
        build() {
      if (seedInstance == null) {
        throw new IllegalStateException(
            ScannedListFragment.class.getCanonicalName() + " must be set");
      }
      return new ScannedListFragmentSubcomponentImpl(this);
    }

    @Override
    public void seedInstance(ScannedListFragment arg0) {
      this.seedInstance = Preconditions.checkNotNull(arg0);
    }
  }

  private final class ScannedListFragmentSubcomponentImpl
      implements FragmentInjectorsModule_ContributeScannedListFragment$app_debug
          .ScannedListFragmentSubcomponent {
    private MembersInjector<ScannedListFragment> scannedListFragmentMembersInjector;

    private ScannedListFragmentSubcomponentImpl(ScannedListFragmentSubcomponentBuilder builder) {
      assert builder != null;
      initialize(builder);
    }

    @SuppressWarnings("unchecked")
    private void initialize(final ScannedListFragmentSubcomponentBuilder builder) {

      this.scannedListFragmentMembersInjector =
          ScannedListFragment_MembersInjector.create(
              DaggerAppComponent.this.providesDBContextProvider);
    }

    @Override
    public void inject(ScannedListFragment arg0) {
      scannedListFragmentMembersInjector.injectMembers(arg0);
    }
  }

  private final class ReportFragmentSubcomponentBuilder
      extends FragmentInjectorsModule_ContributeReportFragment$app_debug.ReportFragmentSubcomponent
          .Builder {
    private ReportFragment seedInstance;

    @Override
    public FragmentInjectorsModule_ContributeReportFragment$app_debug.ReportFragmentSubcomponent
        build() {
      if (seedInstance == null) {
        throw new IllegalStateException(ReportFragment.class.getCanonicalName() + " must be set");
      }
      return new ReportFragmentSubcomponentImpl(this);
    }

    @Override
    public void seedInstance(ReportFragment arg0) {
      this.seedInstance = Preconditions.checkNotNull(arg0);
    }
  }

  private final class ReportFragmentSubcomponentImpl
      implements FragmentInjectorsModule_ContributeReportFragment$app_debug
          .ReportFragmentSubcomponent {
    private MembersInjector<ReportFragment> reportFragmentMembersInjector;

    private ReportFragmentSubcomponentImpl(ReportFragmentSubcomponentBuilder builder) {
      assert builder != null;
      initialize(builder);
    }

    @SuppressWarnings("unchecked")
    private void initialize(final ReportFragmentSubcomponentBuilder builder) {

      this.reportFragmentMembersInjector =
          ReportFragment_MembersInjector.create(DaggerAppComponent.this.providesDBContextProvider);
    }

    @Override
    public void inject(ReportFragment arg0) {
      reportFragmentMembersInjector.injectMembers(arg0);
    }
  }

  private final class ScanPositionsFragmentSubcomponentBuilder
      extends FragmentInjectorsModule_ContributeScanPositionsFragment$app_debug
          .ScanPositionsFragmentSubcomponent.Builder {
    private ScanPositionsFragment seedInstance;

    @Override
    public FragmentInjectorsModule_ContributeScanPositionsFragment$app_debug
            .ScanPositionsFragmentSubcomponent
        build() {
      if (seedInstance == null) {
        throw new IllegalStateException(
            ScanPositionsFragment.class.getCanonicalName() + " must be set");
      }
      return new ScanPositionsFragmentSubcomponentImpl(this);
    }

    @Override
    public void seedInstance(ScanPositionsFragment arg0) {
      this.seedInstance = Preconditions.checkNotNull(arg0);
    }
  }

  private final class ScanPositionsFragmentSubcomponentImpl
      implements FragmentInjectorsModule_ContributeScanPositionsFragment$app_debug
          .ScanPositionsFragmentSubcomponent {
    private MembersInjector<ScanPositionsFragment> scanPositionsFragmentMembersInjector;

    private ScanPositionsFragmentSubcomponentImpl(
        ScanPositionsFragmentSubcomponentBuilder builder) {
      assert builder != null;
      initialize(builder);
    }

    @SuppressWarnings("unchecked")
    private void initialize(final ScanPositionsFragmentSubcomponentBuilder builder) {

      this.scanPositionsFragmentMembersInjector =
          ScanPositionsFragment_MembersInjector.create(
              DaggerAppComponent.this.providesDBContextProvider);
    }

    @Override
    public void inject(ScanPositionsFragment arg0) {
      scanPositionsFragmentMembersInjector.injectMembers(arg0);
    }
  }

  private final class NewItemFragmentSubcomponentBuilder
      extends FragmentInjectorsModule_ContributeNewItemFragment$app_debug
          .NewItemFragmentSubcomponent.Builder {
    private NewItemFragment seedInstance;

    @Override
    public FragmentInjectorsModule_ContributeNewItemFragment$app_debug.NewItemFragmentSubcomponent
        build() {
      if (seedInstance == null) {
        throw new IllegalStateException(NewItemFragment.class.getCanonicalName() + " must be set");
      }
      return new NewItemFragmentSubcomponentImpl(this);
    }

    @Override
    public void seedInstance(NewItemFragment arg0) {
      this.seedInstance = Preconditions.checkNotNull(arg0);
    }
  }

  private final class NewItemFragmentSubcomponentImpl
      implements FragmentInjectorsModule_ContributeNewItemFragment$app_debug
          .NewItemFragmentSubcomponent {
    private MembersInjector<NewItemFragment> newItemFragmentMembersInjector;

    private NewItemFragmentSubcomponentImpl(NewItemFragmentSubcomponentBuilder builder) {
      assert builder != null;
      initialize(builder);
    }

    @SuppressWarnings("unchecked")
    private void initialize(final NewItemFragmentSubcomponentBuilder builder) {

      this.newItemFragmentMembersInjector =
          NewItemFragment_MembersInjector.create(DaggerAppComponent.this.providesDBContextProvider);
    }

    @Override
    public void inject(NewItemFragment arg0) {
      newItemFragmentMembersInjector.injectMembers(arg0);
    }
  }

  private final class ChooseLocationFragmentSubcomponentBuilder
      extends FragmentInjectorsModule_ContributeChooseLocationFragment$app_debug
          .ChooseLocationFragmentSubcomponent.Builder {
    private ChooseLocationFragment seedInstance;

    @Override
    public FragmentInjectorsModule_ContributeChooseLocationFragment$app_debug
            .ChooseLocationFragmentSubcomponent
        build() {
      if (seedInstance == null) {
        throw new IllegalStateException(
            ChooseLocationFragment.class.getCanonicalName() + " must be set");
      }
      return new ChooseLocationFragmentSubcomponentImpl(this);
    }

    @Override
    public void seedInstance(ChooseLocationFragment arg0) {
      this.seedInstance = Preconditions.checkNotNull(arg0);
    }
  }

  private final class ChooseLocationFragmentSubcomponentImpl
      implements FragmentInjectorsModule_ContributeChooseLocationFragment$app_debug
          .ChooseLocationFragmentSubcomponent {
    private MembersInjector<ChooseLocationFragment> chooseLocationFragmentMembersInjector;

    private ChooseLocationFragmentSubcomponentImpl(
        ChooseLocationFragmentSubcomponentBuilder builder) {
      assert builder != null;
      initialize(builder);
    }

    @SuppressWarnings("unchecked")
    private void initialize(final ChooseLocationFragmentSubcomponentBuilder builder) {

      this.chooseLocationFragmentMembersInjector =
          ChooseLocationFragment_MembersInjector.create(
              DaggerAppComponent.this.providesDBContextProvider);
    }

    @Override
    public void inject(ChooseLocationFragment arg0) {
      chooseLocationFragmentMembersInjector.injectMembers(arg0);
    }
  }
}
