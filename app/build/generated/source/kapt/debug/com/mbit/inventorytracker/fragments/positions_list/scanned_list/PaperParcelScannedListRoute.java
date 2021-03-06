// Generated by paperparcel.PaperParcelProcessor (https://github.com/grandstaish/paperparcel).
package com.mbit.inventorytracker.fragments.positions_list.scanned_list;

import android.os.Parcel;
import android.os.Parcelable;
import android.support.annotation.NonNull;
import com.mbit.inventorytracker.backstack.BaseRoute;
import paperparcel.TypeAdapter;
import paperparcel.internal.ParcelableAdapter;
import paperparcel.internal.StaticAdapters;

final class PaperParcelScannedListRoute {
  static final TypeAdapter<BaseRoute> BASE_ROUTE_PARCELABLE_ADAPTER =
      new ParcelableAdapter<BaseRoute>(null);

  @NonNull
  static final Parcelable.Creator<ScannedListRoute> CREATOR =
      new Parcelable.Creator<ScannedListRoute>() {
        @Override
        public ScannedListRoute createFromParcel(Parcel in) {
          String locationName = StaticAdapters.STRING_ADAPTER.readFromParcel(in);
          String tag = StaticAdapters.STRING_ADAPTER.readFromParcel(in);
          BaseRoute returnRoute =
              PaperParcelScannedListRoute.BASE_ROUTE_PARCELABLE_ADAPTER.readFromParcel(in);
          boolean isReturning = in.readInt() == 1;
          ScannedListRoute data = new ScannedListRoute(locationName, tag);
          data.setReturnRoute(returnRoute);
          data.setReturning(isReturning);
          return data;
        }

        @Override
        public ScannedListRoute[] newArray(int size) {
          return new ScannedListRoute[size];
        }
      };

  private PaperParcelScannedListRoute() {}

  static void writeToParcel(@NonNull ScannedListRoute data, @NonNull Parcel dest, int flags) {
    StaticAdapters.STRING_ADAPTER.writeToParcel(data.getLocationName(), dest, flags);
    StaticAdapters.STRING_ADAPTER.writeToParcel(data.getTag(), dest, flags);
    PaperParcelScannedListRoute.BASE_ROUTE_PARCELABLE_ADAPTER.writeToParcel(
        data.getReturnRoute(), dest, flags);
    dest.writeInt(data.isReturning() ? 1 : 0);
  }
}
