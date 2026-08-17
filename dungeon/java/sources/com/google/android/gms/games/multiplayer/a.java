package com.google.android.gms.games.multiplayer;

import android.os.Parcel;
import com.google.android.gms.common.internal.DowngradeableSafeParcel;
import com.google.android.gms.games.internal.GamesDowngradeableSafeParcel;

/* JADX INFO: loaded from: classes2.dex */
final class a extends b {
    a() {
    }

    @Override // com.google.android.gms.games.multiplayer.b
    public final ParticipantEntity a(Parcel parcel) {
        return (GamesDowngradeableSafeParcel.d4(DowngradeableSafeParcel.b4()) || DowngradeableSafeParcel.a4(ParticipantEntity.class.getCanonicalName())) ? super.a(parcel) : new ParticipantEntity();
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        return a(parcel);
    }
}
