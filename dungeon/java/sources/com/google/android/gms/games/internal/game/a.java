package com.google.android.gms.games.internal.game;

import android.net.Uri;
import android.os.Parcel;
import com.google.android.gms.common.internal.DowngradeableSafeParcel;
import com.google.android.gms.games.internal.GamesDowngradeableSafeParcel;

/* JADX INFO: loaded from: classes2.dex */
final class a extends b {
    a() {
    }

    @Override // com.google.android.gms.games.internal.game.b
    public final GameBadgeEntity a(Parcel parcel) {
        if (GamesDowngradeableSafeParcel.d4(DowngradeableSafeParcel.b4()) || DowngradeableSafeParcel.a4(GameBadgeEntity.class.getCanonicalName())) {
            return super.a(parcel);
        }
        int i10 = parcel.readInt();
        String string = parcel.readString();
        String string2 = parcel.readString();
        String string3 = parcel.readString();
        return new GameBadgeEntity(i10, string, string2, string3 == null ? null : Uri.parse(string3));
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        return a(parcel);
    }
}
