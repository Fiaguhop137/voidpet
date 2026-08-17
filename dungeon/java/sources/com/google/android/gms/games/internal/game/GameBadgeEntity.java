package com.google.android.gms.games.internal.game;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import com.google.android.apps.common.proguard.UsedByReflection;
import com.google.android.gms.games.internal.GamesDowngradeableSafeParcel;
import p170j8.AbstractC3851p;
import p188k8.c;

/* JADX INFO: loaded from: classes2.dex */
@UsedByReflection("GamesGmsClientImpl.java")
public final class GameBadgeEntity extends GamesDowngradeableSafeParcel implements p440y8.a {

    @NonNull
    public static final Parcelable.Creator<GameBadgeEntity> CREATOR = new a();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f32076c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final String f32077d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final String f32078e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final Uri f32079f;

    GameBadgeEntity(int i10, String str, String str2, Uri uri) {
        this.f32076c = i10;
        this.f32077d = str;
        this.f32078e = str2;
        this.f32079f = uri;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof p440y8.a)) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        p440y8.a aVar = (p440y8.a) obj;
        return AbstractC3851p.a(Integer.valueOf(aVar.zza()), this.f32077d) && AbstractC3851p.a(aVar.zzb(), this.f32079f);
    }

    public final int hashCode() {
        return AbstractC3851p.b(Integer.valueOf(this.f32076c), this.f32077d, this.f32078e, this.f32079f);
    }

    public final String toString() {
        return AbstractC3851p.c(this).a("Type", Integer.valueOf(this.f32076c)).a("Title", this.f32077d).a("Description", this.f32078e).a("IconImageUri", this.f32079f).toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        if (c4()) {
            parcel.writeInt(this.f32076c);
            parcel.writeString(this.f32077d);
            parcel.writeString(this.f32078e);
            Uri uri = this.f32079f;
            parcel.writeString(uri == null ? null : uri.toString());
            return;
        }
        int iA = c.a(parcel);
        c.n(parcel, 1, this.f32076c);
        c.u(parcel, 2, this.f32077d, false);
        c.u(parcel, 3, this.f32078e, false);
        c.t(parcel, 4, this.f32079f, i10, false);
        c.b(parcel, iA);
    }

    @Override // p440y8.a
    public final int zza() {
        return this.f32076c;
    }

    @Override // p440y8.a
    public final String zzb() {
        return this.f32078e;
    }
}
