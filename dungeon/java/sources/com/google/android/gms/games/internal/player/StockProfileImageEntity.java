package com.google.android.gms.games.internal.player;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import com.google.android.apps.common.proguard.UsedByReflection;
import p170j8.AbstractC3851p;
import p188k8.c;
import p404w8.p;
import p458z8.h;

/* JADX INFO: loaded from: classes2.dex */
@UsedByReflection("GamesGmsClientImpl.java")
public final class StockProfileImageEntity extends p implements p458z8.a {

    @NonNull
    public static final Parcelable.Creator<StockProfileImageEntity> CREATOR = new h();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f32105a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Uri f32106b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f32107c;

    public StockProfileImageEntity(String str, Uri uri, String str2) {
        this.f32105a = str;
        this.f32106b = uri;
        this.f32107c = str2;
    }

    @Override // p458z8.a
    public String c1() {
        return this.f32105a;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof p458z8.a)) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        p458z8.a aVar = (p458z8.a) obj;
        return AbstractC3851p.a(this.f32105a, aVar.c1()) && AbstractC3851p.a(this.f32106b, aVar.zza()) && AbstractC3851p.a(this.f32107c, aVar.zzb());
    }

    public final int hashCode() {
        return AbstractC3851p.b(this.f32105a, this.f32106b);
    }

    public final String toString() {
        return AbstractC3851p.c(this).a("ImageId", this.f32105a).a("ImageUri", this.f32106b).a("A11yLabel", this.f32107c).toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iA = c.a(parcel);
        c.u(parcel, 1, c1(), false);
        c.t(parcel, 2, this.f32106b, i10, false);
        c.u(parcel, 3, this.f32107c, false);
        c.b(parcel, iA);
    }

    @Override // p458z8.a
    public final Uri zza() {
        return this.f32106b;
    }

    @Override // p458z8.a
    public final String zzb() {
        return this.f32107c;
    }
}
