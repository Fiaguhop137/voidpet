package com.google.android.gms.games;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import com.google.android.apps.common.proguard.UsedByReflection;
import com.google.android.gms.games.internal.GamesDowngradeableSafeParcel;
import com.google.android.gms.games.internal.player.MostRecentGameInfoEntity;
import p170j8.AbstractC3838c;
import p170j8.AbstractC3851p;
import p350t8.j;
import p350t8.l;
import p350t8.m;
import p350t8.n;
import p350t8.v;

/* JADX INFO: loaded from: classes2.dex */
@UsedByReflection("GamesGmsClientImpl.java")
public final class PlayerEntity extends GamesDowngradeableSafeParcel implements j {

    @NonNull
    public static final Parcelable.Creator<PlayerEntity> CREATOR = new c();

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    private final String f32013A;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f32014c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final String f32015d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Uri f32016e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final Uri f32017f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final long f32018g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final int f32019h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final long f32020i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final String f32021j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final String f32022k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final String f32023l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final MostRecentGameInfoEntity f32024m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final l f32025n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final boolean f32026o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private final boolean f32027p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private final String f32028q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private final String f32029r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private final Uri f32030s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final String f32031t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private final Uri f32032u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private final String f32033v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private final long f32034w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private final v f32035x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private final n f32036y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private final boolean f32037z;

    PlayerEntity(String str, String str2, Uri uri, Uri uri2, long j10, int i10, long j11, String str3, String str4, String str5, MostRecentGameInfoEntity mostRecentGameInfoEntity, l lVar, boolean z10, boolean z11, String str6, String str7, Uri uri3, String str8, Uri uri4, String str9, long j12, v vVar, n nVar, boolean z12, String str10) {
        this.f32014c = str;
        this.f32015d = str2;
        this.f32016e = uri;
        this.f32021j = str3;
        this.f32017f = uri2;
        this.f32022k = str4;
        this.f32018g = j10;
        this.f32019h = i10;
        this.f32020i = j11;
        this.f32023l = str5;
        this.f32026o = z10;
        this.f32024m = mostRecentGameInfoEntity;
        this.f32025n = lVar;
        this.f32027p = z11;
        this.f32028q = str6;
        this.f32029r = str7;
        this.f32030s = uri3;
        this.f32031t = str8;
        this.f32032u = uri4;
        this.f32033v = str9;
        this.f32034w = j12;
        this.f32035x = vVar;
        this.f32036y = nVar;
        this.f32037z = z12;
        this.f32013A = str10;
    }

    public PlayerEntity(j jVar) {
        String strS3 = jVar.S3();
        this.f32014c = strS3;
        String strS = jVar.s();
        this.f32015d = strS;
        this.f32016e = jVar.p();
        this.f32021j = jVar.getIconImageUrl();
        this.f32017f = jVar.U();
        this.f32022k = jVar.getHiResImageUrl();
        long jU0 = jVar.u0();
        this.f32018g = jU0;
        this.f32019h = jVar.b();
        this.f32020i = jVar.N0();
        this.f32023l = jVar.getTitle();
        this.f32026o = jVar.c();
        p458z8.b bVarE = jVar.e();
        this.f32024m = bVarE == null ? null : new MostRecentGameInfoEntity(bVarE);
        this.f32025n = jVar.V0();
        this.f32027p = jVar.a();
        this.f32028q = jVar.zzb();
        this.f32029r = jVar.zzc();
        this.f32030s = jVar.i2();
        this.f32031t = jVar.getBannerImageLandscapeUrl();
        this.f32032u = jVar.z0();
        this.f32033v = jVar.getBannerImagePortraitUrl();
        this.f32034w = jVar.h();
        m mVarC1 = jVar.C1();
        this.f32035x = mVarC1 == null ? null : new v((m) mVarC1.freeze());
        p350t8.c cVarF2 = jVar.F2();
        this.f32036y = cVarF2 != null ? (n) cVarF2.freeze() : null;
        this.f32037z = jVar.d();
        this.f32013A = jVar.zza();
        AbstractC3838c.a(strS3);
        AbstractC3838c.a(strS);
        AbstractC3838c.b(jU0 > 0);
    }

    static int e4(j jVar) {
        return AbstractC3851p.b(jVar.S3(), jVar.s(), Boolean.valueOf(jVar.a()), jVar.p(), jVar.U(), Long.valueOf(jVar.u0()), jVar.getTitle(), jVar.V0(), jVar.zzb(), jVar.zzc(), jVar.i2(), jVar.z0(), Long.valueOf(jVar.h()), jVar.C1(), jVar.F2(), Boolean.valueOf(jVar.d()), jVar.zza());
    }

    static boolean f4(j jVar, Object obj) {
        if (!(obj instanceof j)) {
            return false;
        }
        if (jVar == obj) {
            return true;
        }
        j jVar2 = (j) obj;
        return AbstractC3851p.a(jVar2.S3(), jVar.S3()) && AbstractC3851p.a(jVar2.s(), jVar.s()) && AbstractC3851p.a(Boolean.valueOf(jVar2.a()), Boolean.valueOf(jVar.a())) && AbstractC3851p.a(jVar2.p(), jVar.p()) && AbstractC3851p.a(jVar2.U(), jVar.U()) && AbstractC3851p.a(Long.valueOf(jVar2.u0()), Long.valueOf(jVar.u0())) && AbstractC3851p.a(jVar2.getTitle(), jVar.getTitle()) && AbstractC3851p.a(jVar2.V0(), jVar.V0()) && AbstractC3851p.a(jVar2.zzb(), jVar.zzb()) && AbstractC3851p.a(jVar2.zzc(), jVar.zzc()) && AbstractC3851p.a(jVar2.i2(), jVar.i2()) && AbstractC3851p.a(jVar2.z0(), jVar.z0()) && AbstractC3851p.a(Long.valueOf(jVar2.h()), Long.valueOf(jVar.h())) && AbstractC3851p.a(jVar2.F2(), jVar.F2()) && AbstractC3851p.a(jVar2.C1(), jVar.C1()) && AbstractC3851p.a(Boolean.valueOf(jVar2.d()), Boolean.valueOf(jVar.d())) && AbstractC3851p.a(jVar2.zza(), jVar.zza());
    }

    static String g4(j jVar) {
        AbstractC3851p.a aVarA = AbstractC3851p.c(jVar).a("PlayerId", jVar.S3()).a("DisplayName", jVar.s()).a("HasDebugAccess", Boolean.valueOf(jVar.a())).a("IconImageUri", jVar.p()).a("IconImageUrl", jVar.getIconImageUrl()).a("HiResImageUri", jVar.U()).a("HiResImageUrl", jVar.getHiResImageUrl()).a("RetrievedTimestamp", Long.valueOf(jVar.u0())).a("Title", jVar.getTitle()).a("LevelInfo", jVar.V0()).a("GamerTag", jVar.zzb()).a("Name", jVar.zzc()).a("BannerImageLandscapeUri", jVar.i2()).a("BannerImageLandscapeUrl", jVar.getBannerImageLandscapeUrl()).a("BannerImagePortraitUri", jVar.z0()).a("BannerImagePortraitUrl", jVar.getBannerImagePortraitUrl()).a("CurrentPlayerInfo", jVar.F2()).a("TotalUnlockedAchievement", Long.valueOf(jVar.h()));
        if (jVar.d()) {
            aVarA.a("AlwaysAutoSignIn", Boolean.valueOf(jVar.d()));
        }
        if (jVar.C1() != null) {
            aVarA.a("RelationshipInfo", jVar.C1());
        }
        if (jVar.zza() != null) {
            aVarA.a("GamePlayerId", jVar.zza());
        }
        return aVarA.toString();
    }

    @Override // p350t8.j
    public m C1() {
        return this.f32035x;
    }

    @Override // p350t8.j
    public p350t8.c F2() {
        return this.f32036y;
    }

    @Override // p350t8.j
    public long N0() {
        return this.f32020i;
    }

    @Override // p350t8.j
    public String S3() {
        return this.f32014c;
    }

    @Override // p350t8.j
    public Uri U() {
        return this.f32017f;
    }

    @Override // p350t8.j
    public l V0() {
        return this.f32025n;
    }

    @Override // p350t8.j
    public final boolean a() {
        return this.f32027p;
    }

    @Override // p350t8.j
    public final int b() {
        return this.f32019h;
    }

    @Override // p350t8.j
    public final boolean c() {
        return this.f32026o;
    }

    @Override // p350t8.j
    public final boolean d() {
        return this.f32037z;
    }

    @Override // p350t8.j
    public final p458z8.b e() {
        return this.f32024m;
    }

    public boolean equals(Object obj) {
        return f4(this, obj);
    }

    @Override // p350t8.j
    public String getBannerImageLandscapeUrl() {
        return this.f32031t;
    }

    @Override // p350t8.j
    public String getBannerImagePortraitUrl() {
        return this.f32033v;
    }

    @Override // p350t8.j
    public String getHiResImageUrl() {
        return this.f32022k;
    }

    @Override // p350t8.j
    public String getIconImageUrl() {
        return this.f32021j;
    }

    @Override // p350t8.j
    public String getTitle() {
        return this.f32023l;
    }

    @Override // p350t8.j
    public final long h() {
        return this.f32034w;
    }

    public int hashCode() {
        return e4(this);
    }

    @Override // p350t8.j
    public Uri i2() {
        return this.f32030s;
    }

    @Override // p350t8.j
    public Uri p() {
        return this.f32016e;
    }

    @Override // p350t8.j
    public String s() {
        return this.f32015d;
    }

    public String toString() {
        return g4(this);
    }

    @Override // p350t8.j
    public long u0() {
        return this.f32018g;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        if (c4()) {
            parcel.writeString(this.f32014c);
            parcel.writeString(this.f32015d);
            Uri uri = this.f32016e;
            parcel.writeString(uri == null ? null : uri.toString());
            Uri uri2 = this.f32017f;
            parcel.writeString(uri2 != null ? uri2.toString() : null);
            parcel.writeLong(this.f32018g);
            return;
        }
        int iA = p188k8.c.a(parcel);
        p188k8.c.u(parcel, 1, S3(), false);
        p188k8.c.u(parcel, 2, s(), false);
        p188k8.c.t(parcel, 3, p(), i10, false);
        p188k8.c.t(parcel, 4, U(), i10, false);
        p188k8.c.r(parcel, 5, u0());
        p188k8.c.n(parcel, 6, this.f32019h);
        p188k8.c.r(parcel, 7, N0());
        p188k8.c.u(parcel, 8, getIconImageUrl(), false);
        p188k8.c.u(parcel, 9, getHiResImageUrl(), false);
        p188k8.c.u(parcel, 14, getTitle(), false);
        p188k8.c.t(parcel, 15, this.f32024m, i10, false);
        p188k8.c.t(parcel, 16, V0(), i10, false);
        p188k8.c.c(parcel, 18, this.f32026o);
        p188k8.c.c(parcel, 19, this.f32027p);
        p188k8.c.u(parcel, 20, this.f32028q, false);
        p188k8.c.u(parcel, 21, this.f32029r, false);
        p188k8.c.t(parcel, 22, i2(), i10, false);
        p188k8.c.u(parcel, 23, getBannerImageLandscapeUrl(), false);
        p188k8.c.t(parcel, 24, z0(), i10, false);
        p188k8.c.u(parcel, 25, getBannerImagePortraitUrl(), false);
        p188k8.c.r(parcel, 29, this.f32034w);
        p188k8.c.t(parcel, 33, C1(), i10, false);
        p188k8.c.t(parcel, 35, F2(), i10, false);
        p188k8.c.c(parcel, 36, this.f32037z);
        p188k8.c.u(parcel, 37, this.f32013A, false);
        p188k8.c.b(parcel, iA);
    }

    @Override // p350t8.j
    public Uri z0() {
        return this.f32032u;
    }

    @Override // p350t8.j
    public final String zza() {
        return this.f32013A;
    }

    @Override // p350t8.j
    public final String zzb() {
        return this.f32028q;
    }

    @Override // p350t8.j
    public final String zzc() {
        return this.f32029r;
    }
}
