package com.google.android.gms.games.multiplayer.realtime;

import android.os.Parcel;
import com.google.android.gms.common.internal.DowngradeableSafeParcel;
import com.google.android.gms.games.internal.GamesDowngradeableSafeParcel;

/* JADX INFO: loaded from: classes2.dex */
final class c extends d {
    c() {
    }

    @Override // com.google.android.gms.games.multiplayer.realtime.d
    public final RoomEntity a(Parcel parcel) {
        return (GamesDowngradeableSafeParcel.d4(DowngradeableSafeParcel.b4()) || DowngradeableSafeParcel.a4(RoomEntity.class.getCanonicalName())) ? super.a(parcel) : new RoomEntity();
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        return a(parcel);
    }
}
