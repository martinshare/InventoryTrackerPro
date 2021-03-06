// Generated by dagger.internal.codegen.ComponentProcessor (https://google.github.io/dagger).
package com.mbit.inventorytracker.fragments.choose_location;

import com.mbit.inventorytracker.database.DBContext;
import com.mbit.inventorytracker.fragments.abstraction.FragmentBase;
import dagger.MembersInjector;
import javax.inject.Provider;

public final class ChooseLocationFragment_MembersInjector
    implements MembersInjector<ChooseLocationFragment> {
  private final Provider<DBContext> databaseContextAndDbContextProvider;

  public ChooseLocationFragment_MembersInjector(
      Provider<DBContext> databaseContextAndDbContextProvider) {
    assert databaseContextAndDbContextProvider != null;
    this.databaseContextAndDbContextProvider = databaseContextAndDbContextProvider;
  }

  public static MembersInjector<ChooseLocationFragment> create(
      Provider<DBContext> databaseContextAndDbContextProvider) {
    return new ChooseLocationFragment_MembersInjector(databaseContextAndDbContextProvider);
  }

  @Override
  public void injectMembers(ChooseLocationFragment instance) {
    if (instance == null) {
      throw new NullPointerException("Cannot inject members into a null reference");
    }
    ((FragmentBase) instance).dbContext = databaseContextAndDbContextProvider.get();
    instance.databaseContext = databaseContextAndDbContextProvider.get();
  }
}
