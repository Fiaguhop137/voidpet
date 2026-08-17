package com.google.android.gms.games;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import com.google.android.apps.common.proguard.UsedByReflection;
import com.google.android.gms.games.internal.GamesDowngradeableSafeParcel;
import p170j8.AbstractC3851p;

/* JADX INFO: loaded from: classes2.dex */
@UsedByReflection("GamesGmsClientImpl.java")
public final class GameEntity extends GamesDowngradeableSafeParcel implements p350t8.d {

    @NonNull
    public static final Parcelable.Creator<GameEntity> CREATOR = new a();

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    private final boolean f31987A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    private final boolean f31988B;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f31989c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final String f31990d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final String f31991e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final String f31992f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final String f31993g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final String f31994h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final Uri f31995i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final Uri f31996j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final Uri f31997k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final boolean f31998l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final boolean f31999m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final String f32000n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final int f32001o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private final int f32002p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private final int f32003q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private final boolean f32004r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private final boolean f32005s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final String f32006t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private final String f32007u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private final String f32008v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private final boolean f32009w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private final boolean f32010x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private final boolean f32011y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private final String f32012z;

    GameEntity(String str, String str2, String str3, String str4, String str5, String str6, Uri uri, Uri uri2, Uri uri3, boolean z10, boolean z11, String str7, int i10, int i11, int i12, boolean z12, boolean z13, String str8, String str9, String str10, boolean z14, boolean z15, boolean z16, String str11, boolean z17, boolean z18) {
        this.f31989c = str;
        this.f31990d = str2;
        this.f31991e = str3;
        this.f31992f = str4;
        this.f31993g = str5;
        this.f31994h = str6;
        this.f31995i = uri;
        this.f32006t = str8;
        this.f31996j = uri2;
        this.f32007u = str9;
        this.f31997k = uri3;
        this.f32008v = str10;
        this.f31998l = z10;
        this.f31999m = z11;
        this.f32000n = str7;
        this.f32001o = i10;
        this.f32002p = i11;
        this.f32003q = i12;
        this.f32004r = z12;
        this.f32005s = z13;
        this.f32009w = z14;
        this.f32010x = z15;
        this.f32011y = z16;
        this.f32012z = str11;
        this.f31987A = z17;
        this.f31988B = z18;
    }

    public GameEntity(p350t8.d dVar) {
        this.f31989c = dVar.s2();
        this.f31991e = dVar.t0();
        this.f31992f = dVar.s1();
        this.f31993g = dVar.g();
        this.f31994h = dVar.G0();
        this.f31990d = dVar.s();
        this.f31995i = dVar.p();
        this.f32006t = dVar.getIconImageUrl();
        this.f31996j = dVar.U();
        this.f32007u = dVar.getHiResImageUrl();
        this.f31997k = dVar.d2();
        this.f32008v = dVar.getFeaturedImageUrl();
        this.f31998l = dVar.zza();
        this.f31999m = dVar.b();
        this.f32000n = dVar.c();
        this.f32001o = 1;
        this.f32002p = dVar.r1();
        this.f32003q = dVar.G2();
        this.f32004r = dVar.d();
        this.f32005s = dVar.e();
        this.f32009w = dVar.zzb();
        this.f32010x = dVar.zzc();
        this.f32011y = dVar.d1();
        this.f32012z = dVar.a1();
        this.f31987A = dVar.S1();
        this.f31988B = dVar.a();
    }

    static int e4(p350t8.d dVar) {
        return AbstractC3851p.b(dVar.s2(), dVar.s(), dVar.t0(), dVar.s1(), dVar.g(), dVar.G0(), dVar.p(), dVar.U(), dVar.d2(), Boolean.valueOf(dVar.zza()), Boolean.valueOf(dVar.b()), dVar.c(), Integer.valueOf(dVar.r1()), Integer.valueOf(dVar.G2()), Boolean.valueOf(dVar.d()), Boolean.valueOf(dVar.e()), Boolean.valueOf(dVar.zzb()), Boolean.valueOf(dVar.zzc()), Boolean.valueOf(dVar.d1()), dVar.a1(), Boolean.valueOf(dVar.S1()), Boolean.valueOf(dVar.a()));
    }

    static boolean f4(p350t8.d dVar, Object obj) {
        if (!(obj instanceof p350t8.d)) {
            return false;
        }
        if (dVar == obj) {
            return true;
        }
        p350t8.d dVar2 = (p350t8.d) obj;
        return AbstractC3851p.a(dVar2.s2(), dVar.s2()) && AbstractC3851p.a(dVar2.s(), dVar.s()) && AbstractC3851p.a(dVar2.t0(), dVar.t0()) && AbstractC3851p.a(dVar2.s1(), dVar.s1()) && AbstractC3851p.a(dVar2.g(), dVar.g()) && AbstractC3851p.a(dVar2.G0(), dVar.G0()) && AbstractC3851p.a(dVar2.p(), dVar.p()) && AbstractC3851p.a(dVar2.U(), dVar.U()) && AbstractC3851p.a(dVar2.d2(), dVar.d2()) && AbstractC3851p.a(Boolean.valueOf(dVar2.zza()), Boolean.valueOf(dVar.zza())) && AbstractC3851p.a(Boolean.valueOf(dVar2.b()), Boolean.valueOf(dVar.b())) && AbstractC3851p.a(dVar2.c(), dVar.c()) && AbstractC3851p.a(Integer.valueOf(dVar2.r1()), Integer.valueOf(dVar.r1())) && AbstractC3851p.a(Integer.valueOf(dVar2.G2()), Integer.valueOf(dVar.G2())) && AbstractC3851p.a(Boolean.valueOf(dVar2.d()), Boolean.valueOf(dVar.d())) && AbstractC3851p.a(Boolean.valueOf(dVar2.e()), Boolean.valueOf(dVar.e())) && AbstractC3851p.a(Boolean.valueOf(dVar2.zzb()), Boolean.valueOf(dVar.zzb())) && AbstractC3851p.a(Boolean.valueOf(dVar2.zzc()), Boolean.valueOf(dVar.zzc())) && AbstractC3851p.a(Boolean.valueOf(dVar2.d1()), Boolean.valueOf(dVar.d1())) && AbstractC3851p.a(dVar2.a1(), dVar.a1()) && AbstractC3851p.a(Boolean.valueOf(dVar2.S1()), Boolean.valueOf(dVar.S1())) && AbstractC3851p.a(Boolean.valueOf(dVar2.a()), Boolean.valueOf(dVar.a()));
    }

    static String g4(p350t8.d dVar) {
        return AbstractC3851p.c(dVar).a("ApplicationId", dVar.s2()).a("DisplayName", dVar.s()).a("PrimaryCategory", dVar.t0()).a("SecondaryCategory", dVar.s1()).a("Description", dVar.g()).a("DeveloperName", dVar.G0()).a("IconImageUri", dVar.p()).a("IconImageUrl", dVar.getIconImageUrl()).a("HiResImageUri", dVar.U()).a("HiResImageUrl", dVar.getHiResImageUrl()).a("FeaturedImageUri", dVar.d2()).a("FeaturedImageUrl", dVar.getFeaturedImageUrl()).a("PlayEnabledGame", Boolean.valueOf(dVar.zza())).a("InstanceInstalled", Boolean.valueOf(dVar.b())).a("InstancePackageName", dVar.c()).a("AchievementTotalCount", Integer.valueOf(dVar.r1())).a("LeaderboardCount", Integer.valueOf(dVar.G2())).a("AreSnapshotsEnabled", Boolean.valueOf(dVar.d1())).a("ThemeColor", dVar.a1()).a("HasGamepadSupport", Boolean.valueOf(dVar.S1())).toString();
    }

    @Override // p350t8.d
    public String G0() {
        return this.f31994h;
    }

    @Override // p350t8.d
    public int G2() {
        return this.f32003q;
    }

    @Override // p350t8.d
    public boolean S1() {
        return this.f31987A;
    }

    @Override // p350t8.d
    public Uri U() {
        return this.f31996j;
    }

    @Override // p350t8.d
    public final boolean a() {
        return this.f31988B;
    }

    @Override // p350t8.d
    public String a1() {
        return this.f32012z;
    }

    @Override // p350t8.d
    public final boolean b() {
        return this.f31999m;
    }

    @Override // p350t8.d
    public final String c() {
        return this.f32000n;
    }

    @Override // p350t8.d
    public final boolean d() {
        return this.f32004r;
    }

    @Override // p350t8.d
    public boolean d1() {
        return this.f32011y;
    }

    @Override // p350t8.d
    public Uri d2() {
        return this.f31997k;
    }

    @Override // p350t8.d
    public final boolean e() {
        return this.f32005s;
    }

    public boolean equals(Object obj) {
        return f4(this, obj);
    }

    @Override // p350t8.d
    public String g() {
        return this.f31993g;
    }

    @Override // p350t8.d
    public String getFeaturedImageUrl() {
        return this.f32008v;
    }

    @Override // p350t8.d
    public String getHiResImageUrl() {
        return this.f32007u;
    }

    @Override // p350t8.d
    public String getIconImageUrl() {
        return this.f32006t;
    }

    public int hashCode() {
        return e4(this);
    }

    @Override // p350t8.d
    public Uri p() {
        return this.f31995i;
    }

    @Override // p350t8.d
    public int r1() {
        return this.f32002p;
    }

    @Override // p350t8.d
    public String s() {
        return this.f31990d;
    }

    @Override // p350t8.d
    public String s1() {
        return this.f31992f;
    }

    @Override // p350t8.d
    public String s2() {
        return this.f31989c;
    }

    @Override // p350t8.d
    public String t0() {
        return this.f31991e;
    }

    public String toString() {
        return g4(this);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        if (c4()) {
            parcel.writeString(this.f31989c);
            parcel.writeString(this.f31990d);
            parcel.writeString(this.f31991e);
            parcel.writeString(this.f31992f);
            parcel.writeString(this.f31993g);
            parcel.writeString(this.f31994h);
            Uri uri = this.f31995i;
            parcel.writeString(uri == null ? null : uri.toString());
            Uri uri2 = this.f31996j;
            parcel.writeString(uri2 == null ? null : uri2.toString());
            Uri uri3 = this.f31997k;
            parcel.writeString(uri3 != null ? uri3.toString() : null);
            parcel.writeInt(this.f31998l ? 1 : 0);
            parcel.writeInt(this.f31999m ? 1 : 0);
            parcel.writeString(this.f32000n);
            parcel.writeInt(this.f32001o);
            parcel.writeInt(this.f32002p);
            parcel.writeInt(this.f32003q);
            return;
        }
        int iA = p188k8.c.a(parcel);
        p188k8.c.u(parcel, 1, s2(), false);
        p188k8.c.u(parcel, 2, s(), false);
        p188k8.c.u(parcel, 3, t0(), false);
        p188k8.c.u(parcel, 4, s1(), false);
        p188k8.c.u(parcel, 5, g(), false);
        p188k8.c.u(parcel, 6, G0(), false);
        p188k8.c.t(parcel, 7, p(), i10, false);
        p188k8.c.t(parcel, 8, U(), i10, false);
        p188k8.c.t(parcel, 9, d2(), i10, false);
        p188k8.c.c(parcel, 10, this.f31998l);
        p188k8.c.c(parcel, 11, this.f31999m);
        p188k8.c.u(parcel, 12, this.f32000n, false);
        p188k8.c.n(parcel, 13, this.f32001o);
        p188k8.c.n(parcel, 14, r1());
        p188k8.c.n(parcel, 15, G2());
        p188k8.c.c(parcel, 16, this.f32004r);
        p188k8.c.c(parcel, 17, this.f32005s);
        p188k8.c.u(parcel, 18, getIconImageUrl(), false);
        p188k8.c.u(parcel, 19, getHiResImageUrl(), false);
        p188k8.c.u(parcel, 20, getFeaturedImageUrl(), false);
        p188k8.c.c(parcel, 21, this.f32009w);
        p188k8.c.c(parcel, 22, this.f32010x);
        p188k8.c.c(parcel, 23, d1());
        p188k8.c.u(parcel, 24, a1(), false);
        p188k8.c.c(parcel, 25, S1());
        p188k8.c.c(parcel, 28, this.f31988B);
        p188k8.c.b(parcel, iA);
    }

    @Override // p350t8.d
    public final boolean zza() {
        return this.f31998l;
    }

    @Override // p350t8.d
    public final boolean zzb() {
        return this.f32009w;
    }

    @Override // p350t8.d
    public final boolean zzc() {
        return this.f32010x;
    }
}
