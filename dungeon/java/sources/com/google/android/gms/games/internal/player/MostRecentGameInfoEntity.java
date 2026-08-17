package com.google.android.gms.games.internal.player;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import com.google.android.apps.common.proguard.UsedByReflection;
import p170j8.AbstractC3851p;
import p404w8.p;
import p458z8.b;

/* JADX INFO: loaded from: classes2.dex */
@UsedByReflection("GamesGmsClientImpl.java")
public final class MostRecentGameInfoEntity extends p implements b {

    @NonNull
    public static final Parcelable.Creator<MostRecentGameInfoEntity> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f32083a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f32084b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final long f32085c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Uri f32086d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Uri f32087e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final Uri f32088f;

    MostRecentGameInfoEntity(String str, String str2, long j10, Uri uri, Uri uri2, Uri uri3) {
        this.f32083a = str;
        this.f32084b = str2;
        this.f32085c = j10;
        this.f32086d = uri;
        this.f32087e = uri2;
        this.f32088f = uri3;
    }

    public MostRecentGameInfoEntity(b bVar) {
        this.f32083a = bVar.zza();
        this.f32084b = bVar.zzb();
        this.f32085c = bVar.zzc();
        this.f32086d = bVar.a();
        this.f32087e = bVar.b();
        this.f32088f = bVar.c();
    }

    static int a4(b bVar) {
        return AbstractC3851p.b(bVar.zza(), bVar.zzb(), Long.valueOf(bVar.zzc()), bVar.a(), bVar.b(), bVar.c());
    }

    static boolean b4(b bVar, Object obj) {
        if (!(obj instanceof b)) {
            return false;
        }
        if (bVar == obj) {
            return true;
        }
        b bVar2 = (b) obj;
        return AbstractC3851p.a(bVar2.zza(), bVar.zza()) && AbstractC3851p.a(bVar2.zzb(), bVar.zzb()) && AbstractC3851p.a(Long.valueOf(bVar2.zzc()), Long.valueOf(bVar.zzc())) && AbstractC3851p.a(bVar2.a(), bVar.a()) && AbstractC3851p.a(bVar2.b(), bVar.b()) && AbstractC3851p.a(bVar2.c(), bVar.c());
    }

    static String c4(b bVar) {
        return AbstractC3851p.c(bVar).a("GameId", bVar.zza()).a("GameName", bVar.zzb()).a("ActivityTimestampMillis", Long.valueOf(bVar.zzc())).a("GameIconUri", bVar.a()).a("GameHiResUri", bVar.b()).a("GameFeaturedUri", bVar.c()).toString();
    }

    @Override // p458z8.b
    public final Uri a() {
        return this.f32086d;
    }

    @Override // p458z8.b
    public final Uri b() {
        return this.f32087e;
    }

    @Override // p458z8.b
    public final Uri c() {
        return this.f32088f;
    }

    public final boolean equals(Object obj) {
        return b4(this, obj);
    }

    public final int hashCode() {
        return a4(this);
    }

    public final String toString() {
        return c4(this);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        a.a(this, parcel, i10);
    }

    @Override // p458z8.b
    public final String zza() {
        return this.f32083a;
    }

    @Override // p458z8.b
    public final String zzb() {
        return this.f32084b;
    }

    @Override // p458z8.b
    public final long zzc() {
        return this.f32085c;
    }
}
