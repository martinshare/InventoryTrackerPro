// Generated by paperparcel.PaperParcelProcessor (https://github.com/grandstaish/paperparcel).
package com.mbit.inventorytracker.fragments.login;

import android.os.Parcel;
import android.os.Parcelable;
import android.support.annotation.NonNull;
import com.mbit.inventorytracker.backstack.BaseRoute;
import paperparcel.TypeAdapter;
import paperparcel.internal.ParcelableAdapter;
import paperparcel.internal.StaticAdapters;

final class PaperParcelLoginRoute {
  static final TypeAdapter<BaseRoute> BASE_ROUTE_PARCELABLE_ADAPTER =
      new ParcelableAdapter<BaseRoute>(null);

  @NonNull
  static final Parcelable.Creator<LoginRoute> CREATOR =
      new Parcelable.Creator<LoginRoute>() {
        @Override
        public LoginRoute createFromParcel(Parcel in) {
          String tag = StaticAdapters.STRING_ADAPTER.readFromParcel(in);
          BaseRoute returnRoute =
              PaperParcelLoginRoute.BASE_ROUTE_PARCELABLE_ADAPTER.readFromParcel(in);
          boolean isReturning = in.readInt() == 1;
          LoginRoute data = new LoginRoute(tag);
          data.setReturnRoute(returnRoute);
          data.setReturning(isReturning);
          return data;
        }

        @Override
        public LoginRoute[] newArray(int size) {
          return new LoginRoute[size];
        }
      };

  private PaperParcelLoginRoute() {}

  static void writeToParcel(@NonNull LoginRoute data, @NonNull Parcel dest, int flags) {
    StaticAdapters.STRING_ADAPTER.writeToParcel(data.getTag(), dest, flags);
    PaperParcelLoginRoute.BASE_ROUTE_PARCELABLE_ADAPTER.writeToParcel(
        data.getReturnRoute(), dest, flags);
    dest.writeInt(data.isReturning() ? 1 : 0);
  }
}
