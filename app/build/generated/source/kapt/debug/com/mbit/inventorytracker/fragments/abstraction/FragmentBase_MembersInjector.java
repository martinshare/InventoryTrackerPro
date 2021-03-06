// Generated by dagger.internal.codegen.ComponentProcessor (https://google.github.io/dagger).
package com.mbit.inventorytracker.fragments.abstraction;

import com.mbit.inventorytracker.database.DBContext;
import dagger.MembersInjector;
import javax.inject.Provider;

public final class FragmentBase_MembersInjector implements MembersInjector<FragmentBase> {
  private final Provider<DBContext> dbContextProvider;

  public FragmentBase_MembersInjector(Provider<DBContext> dbContextProvider) {
    assert dbContextProvider != null;
    this.dbContextProvider = dbContextProvider;
  }

  public static MembersInjector<FragmentBase> create(Provider<DBContext> dbContextProvider) {
    return new FragmentBase_MembersInjector(dbContextProvider);
  }

  @Override
  public void injectMembers(FragmentBase instance) {
    if (instance == null) {
      throw new NullPointerException("Cannot inject members into a null reference");
    }
    instance.dbContext = dbContextProvider.get();
  }
}
