package com.google.android.gms.games;

import android.net.Uri;
import android.os.Parcel;
import com.google.android.gms.common.internal.DowngradeableSafeParcel;
import com.google.android.gms.games.internal.GamesDowngradeableSafeParcel;

/* JADX INFO: loaded from: classes2.dex */
final class c extends d {
    c() {
    }

    @Override // com.google.android.gms.games.d
    public final PlayerEntity a(Parcel parcel) {
        if (GamesDowngradeableSafeParcel.d4(DowngradeableSafeParcel.b4()) || DowngradeableSafeParcel.a4(PlayerEntity.class.getCanonicalName())) {
            return super.a(parcel);
        }
        String string = parcel.readString();
        String string2 = parcel.readString();
        String string3 = parcel.readString();
        String string4 = parcel.readString();
        return new PlayerEntity(string, string2, string3 == null ? null : Uri.parse(string3), string4 != null ? Uri.parse(string4) : null, parcel.readLong(), -1, -1L, null, null, null, null, null, true, false, parcel.readString(), parcel.readString(), null, null, null, null, -1L, null, null, false, null);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        return a(parcel);
    }
}
