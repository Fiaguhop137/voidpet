package com.google.android.gms.games.achievement;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import com.google.android.apps.common.proguard.UsedByReflection;
import com.google.android.gms.games.PlayerEntity;
import p170j8.AbstractC3838c;
import p170j8.AbstractC3851p;
import p188k8.c;
import p350t8.j;
import p404w8.p;

/* JADX INFO: loaded from: classes2.dex */
@UsedByReflection("GamesGmsClientImpl.java")
public final class AchievementEntity extends p implements p368u8.a {

    @NonNull
    public static final Parcelable.Creator<AchievementEntity> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f32038a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f32039b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f32040c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final String f32041d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Uri f32042e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final String f32043f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final Uri f32044g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final String f32045h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final int f32046i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final String f32047j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final PlayerEntity f32048k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final int f32049l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final int f32050m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final String f32051n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final long f32052o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private final long f32053p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private final float f32054q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private final String f32055r;

    AchievementEntity(String str, int i10, String str2, String str3, Uri uri, String str4, Uri uri2, String str5, int i11, String str6, PlayerEntity playerEntity, int i12, int i13, String str7, long j10, long j11, float f10, String str8) {
        this.f32038a = str;
        this.f32039b = i10;
        this.f32040c = str2;
        this.f32041d = str3;
        this.f32042e = uri;
        this.f32043f = str4;
        this.f32044g = uri2;
        this.f32045h = str5;
        this.f32046i = i11;
        this.f32047j = str6;
        this.f32048k = playerEntity;
        this.f32049l = i12;
        this.f32050m = i13;
        this.f32051n = str7;
        this.f32052o = j10;
        this.f32053p = j11;
        this.f32054q = f10;
        this.f32055r = str8;
    }

    static int e4(p368u8.a aVar) {
        int iL3;
        int iO1;
        if (aVar.getType() == 1) {
            iL3 = aVar.l3();
            iO1 = aVar.O1();
        } else {
            iL3 = 0;
            iO1 = 0;
        }
        return AbstractC3851p.b(aVar.g1(), aVar.zza(), aVar.getName(), Integer.valueOf(aVar.getType()), aVar.g(), Long.valueOf(aVar.O2()), Integer.valueOf(aVar.getState()), Long.valueOf(aVar.G1()), aVar.zzb(), Integer.valueOf(iL3), Integer.valueOf(iO1));
    }

    static boolean f4(p368u8.a aVar, Object obj) {
        if (!(obj instanceof p368u8.a)) {
            return false;
        }
        if (aVar == obj) {
            return true;
        }
        p368u8.a aVar2 = (p368u8.a) obj;
        if (aVar2.getType() != aVar.getType()) {
            return false;
        }
        return (aVar.getType() != 1 || (aVar2.l3() == aVar.l3() && aVar2.O1() == aVar.O1())) && aVar2.O2() == aVar.O2() && aVar2.getState() == aVar.getState() && aVar2.G1() == aVar.G1() && AbstractC3851p.a(aVar2.g1(), aVar.g1()) && AbstractC3851p.a(aVar2.zza(), aVar.zza()) && AbstractC3851p.a(aVar2.getName(), aVar.getName()) && AbstractC3851p.a(aVar2.g(), aVar.g()) && AbstractC3851p.a(aVar2.zzb(), aVar.zzb()) && aVar2.zzc() == aVar.zzc();
    }

    static String g4(p368u8.a aVar) {
        AbstractC3851p.a aVarA = AbstractC3851p.c(aVar).a("Id", aVar.g1()).a("Game Id", aVar.zza()).a("Type", Integer.valueOf(aVar.getType())).a("Name", aVar.getName()).a("Description", aVar.g()).a("Player", aVar.zzb()).a("State", Integer.valueOf(aVar.getState())).a("Rarity Percent", Float.valueOf(aVar.zzc()));
        if (aVar.getType() == 1) {
            aVarA.a("CurrentSteps", Integer.valueOf(aVar.l3()));
            aVarA.a("TotalSteps", Integer.valueOf(aVar.O1()));
        }
        return aVarA.toString();
    }

    @Override // p368u8.a
    public long G1() {
        return this.f32052o;
    }

    @Override // p368u8.a
    public int O1() {
        AbstractC3838c.b(getType() == 1);
        return this.f32046i;
    }

    @Override // p368u8.a
    public long O2() {
        return this.f32053p;
    }

    public Uri a4() {
        return this.f32044g;
    }

    public String b4() {
        return this.f32045h;
    }

    public Uri c4() {
        return this.f32042e;
    }

    public String d4() {
        return this.f32043f;
    }

    public boolean equals(Object obj) {
        return f4(this, obj);
    }

    @Override // p368u8.a
    public String g() {
        return this.f32041d;
    }

    @Override // p368u8.a
    public String g1() {
        return this.f32038a;
    }

    @Override // p368u8.a
    public String getName() {
        return this.f32040c;
    }

    @Override // p368u8.a
    public int getState() {
        return this.f32049l;
    }

    @Override // p368u8.a
    public int getType() {
        return this.f32039b;
    }

    public int hashCode() {
        return e4(this);
    }

    @Override // p368u8.a
    public int l3() {
        AbstractC3838c.b(getType() == 1);
        return this.f32050m;
    }

    public String toString() {
        return g4(this);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        int iA = c.a(parcel);
        c.u(parcel, 1, g1(), false);
        c.n(parcel, 2, getType());
        c.u(parcel, 3, getName(), false);
        c.u(parcel, 4, g(), false);
        c.t(parcel, 5, c4(), i10, false);
        c.u(parcel, 6, d4(), false);
        c.t(parcel, 7, a4(), i10, false);
        c.u(parcel, 8, b4(), false);
        c.n(parcel, 9, this.f32046i);
        c.u(parcel, 10, this.f32047j, false);
        c.t(parcel, 11, this.f32048k, i10, false);
        c.n(parcel, 12, getState());
        c.n(parcel, 13, this.f32050m);
        c.u(parcel, 14, this.f32051n, false);
        c.r(parcel, 15, G1());
        c.r(parcel, 16, O2());
        c.j(parcel, 17, this.f32054q);
        c.u(parcel, 18, this.f32055r, false);
        c.b(parcel, iA);
    }

    @Override // p368u8.a
    public final String zza() {
        return this.f32055r;
    }

    @Override // p368u8.a
    public final j zzb() {
        return this.f32048k;
    }

    @Override // p368u8.a
    public final float zzc() {
        return this.f32054q;
    }
}
