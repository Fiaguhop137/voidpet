package com.google.android.gms.games.snapshot;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import com.google.android.apps.common.proguard.UsedByReflection;
import com.google.android.gms.games.GameEntity;
import com.google.android.gms.games.PlayerEntity;
import p170j8.AbstractC3851p;
import p350t8.j;
import p404w8.p;

/* JADX INFO: loaded from: classes2.dex */
@UsedByReflection("GamesGmsClientImpl.java")
public final class SnapshotMetadataEntity extends p implements c {

    @NonNull
    public static final Parcelable.Creator<SnapshotMetadataEntity> CREATOR = new g();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final GameEntity f32175a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final PlayerEntity f32176b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f32177c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Uri f32178d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final String f32179e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final String f32180f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final String f32181g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final long f32182h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final long f32183i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final float f32184j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final String f32185k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final boolean f32186l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final long f32187m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final String f32188n;

    SnapshotMetadataEntity(GameEntity gameEntity, PlayerEntity playerEntity, String str, Uri uri, String str2, String str3, String str4, long j10, long j11, float f10, String str5, boolean z10, long j12, String str6) {
        this.f32175a = gameEntity;
        this.f32176b = playerEntity;
        this.f32177c = str;
        this.f32178d = uri;
        this.f32179e = str2;
        this.f32184j = f10;
        this.f32180f = str3;
        this.f32181g = str4;
        this.f32182h = j10;
        this.f32183i = j11;
        this.f32185k = str5;
        this.f32186l = z10;
        this.f32187m = j12;
        this.f32188n = str6;
    }

    public SnapshotMetadataEntity(c cVar) {
        PlayerEntity playerEntity = new PlayerEntity(cVar.y1());
        this.f32175a = new GameEntity(cVar.Z3());
        this.f32176b = playerEntity;
        this.f32177c = cVar.X3();
        this.f32178d = cVar.t1();
        this.f32179e = cVar.getCoverImageUrl();
        this.f32184j = cVar.Q3();
        this.f32180f = cVar.zza();
        this.f32181g = cVar.g();
        this.f32182h = cVar.B0();
        this.f32183i = cVar.w2();
        this.f32185k = cVar.c2();
        this.f32186l = cVar.w3();
        this.f32187m = cVar.W0();
        this.f32188n = cVar.e3();
    }

    static int a4(c cVar) {
        return AbstractC3851p.b(cVar.Z3(), cVar.y1(), cVar.X3(), cVar.t1(), Float.valueOf(cVar.Q3()), cVar.zza(), cVar.g(), Long.valueOf(cVar.B0()), Long.valueOf(cVar.w2()), cVar.c2(), Boolean.valueOf(cVar.w3()), Long.valueOf(cVar.W0()), cVar.e3());
    }

    static boolean b4(c cVar, Object obj) {
        if (!(obj instanceof c)) {
            return false;
        }
        if (cVar == obj) {
            return true;
        }
        c cVar2 = (c) obj;
        return AbstractC3851p.a(cVar2.Z3(), cVar.Z3()) && AbstractC3851p.a(cVar2.y1(), cVar.y1()) && AbstractC3851p.a(cVar2.X3(), cVar.X3()) && AbstractC3851p.a(cVar2.t1(), cVar.t1()) && AbstractC3851p.a(Float.valueOf(cVar2.Q3()), Float.valueOf(cVar.Q3())) && AbstractC3851p.a(cVar2.zza(), cVar.zza()) && AbstractC3851p.a(cVar2.g(), cVar.g()) && AbstractC3851p.a(Long.valueOf(cVar2.B0()), Long.valueOf(cVar.B0())) && AbstractC3851p.a(Long.valueOf(cVar2.w2()), Long.valueOf(cVar.w2())) && AbstractC3851p.a(cVar2.c2(), cVar.c2()) && AbstractC3851p.a(Boolean.valueOf(cVar2.w3()), Boolean.valueOf(cVar.w3())) && AbstractC3851p.a(Long.valueOf(cVar2.W0()), Long.valueOf(cVar.W0())) && AbstractC3851p.a(cVar2.e3(), cVar.e3());
    }

    static String c4(c cVar) {
        return AbstractC3851p.c(cVar).a("Game", cVar.Z3()).a("Owner", cVar.y1()).a("SnapshotId", cVar.X3()).a("CoverImageUri", cVar.t1()).a("CoverImageUrl", cVar.getCoverImageUrl()).a("CoverImageAspectRatio", Float.valueOf(cVar.Q3())).a("Description", cVar.g()).a("LastModifiedTimestamp", Long.valueOf(cVar.B0())).a("PlayedTime", Long.valueOf(cVar.w2())).a("UniqueName", cVar.c2()).a("ChangePending", Boolean.valueOf(cVar.w3())).a("ProgressValue", Long.valueOf(cVar.W0())).a("DeviceName", cVar.e3()).toString();
    }

    @Override // com.google.android.gms.games.snapshot.c
    public long B0() {
        return this.f32182h;
    }

    @Override // com.google.android.gms.games.snapshot.c
    public float Q3() {
        return this.f32184j;
    }

    @Override // com.google.android.gms.games.snapshot.c
    public long W0() {
        return this.f32187m;
    }

    @Override // com.google.android.gms.games.snapshot.c
    public String X3() {
        return this.f32177c;
    }

    @Override // com.google.android.gms.games.snapshot.c
    public p350t8.d Z3() {
        return this.f32175a;
    }

    @Override // com.google.android.gms.games.snapshot.c
    public String c2() {
        return this.f32185k;
    }

    @Override // com.google.android.gms.games.snapshot.c
    public String e3() {
        return this.f32188n;
    }

    public boolean equals(Object obj) {
        return b4(this, obj);
    }

    @Override // com.google.android.gms.games.snapshot.c
    public String g() {
        return this.f32181g;
    }

    @Override // com.google.android.gms.games.snapshot.c
    public String getCoverImageUrl() {
        return this.f32179e;
    }

    public int hashCode() {
        return a4(this);
    }

    @Override // com.google.android.gms.games.snapshot.c
    public Uri t1() {
        return this.f32178d;
    }

    public String toString() {
        return c4(this);
    }

    @Override // com.google.android.gms.games.snapshot.c
    public long w2() {
        return this.f32183i;
    }

    @Override // com.google.android.gms.games.snapshot.c
    public boolean w3() {
        return this.f32186l;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        int iA = p188k8.c.a(parcel);
        p188k8.c.t(parcel, 1, Z3(), i10, false);
        p188k8.c.t(parcel, 2, y1(), i10, false);
        p188k8.c.u(parcel, 3, X3(), false);
        p188k8.c.t(parcel, 5, t1(), i10, false);
        p188k8.c.u(parcel, 6, getCoverImageUrl(), false);
        p188k8.c.u(parcel, 7, this.f32180f, false);
        p188k8.c.u(parcel, 8, g(), false);
        p188k8.c.r(parcel, 9, B0());
        p188k8.c.r(parcel, 10, w2());
        p188k8.c.j(parcel, 11, Q3());
        p188k8.c.u(parcel, 12, c2(), false);
        p188k8.c.c(parcel, 13, w3());
        p188k8.c.r(parcel, 14, W0());
        p188k8.c.u(parcel, 15, e3(), false);
        p188k8.c.b(parcel, iA);
    }

    @Override // com.google.android.gms.games.snapshot.c
    public j y1() {
        return this.f32176b;
    }

    @Override // com.google.android.gms.games.snapshot.c
    public final String zza() {
        return this.f32180f;
    }
}
