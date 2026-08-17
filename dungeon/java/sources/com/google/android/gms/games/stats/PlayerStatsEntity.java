package com.google.android.gms.games.stats;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import com.google.android.apps.common.proguard.UsedByReflection;
import p170j8.AbstractC3851p;
import p404w8.p;

/* JADX INFO: loaded from: classes2.dex */
@UsedByReflection("GamesGmsClientImpl.java")
public class PlayerStatsEntity extends p implements D8.a {

    @NonNull
    public static final Parcelable.Creator<PlayerStatsEntity> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final float f32189a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final float f32190b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f32191c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f32192d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final int f32193e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final float f32194f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final float f32195g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final Bundle f32196h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final float f32197i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final float f32198j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final float f32199k;

    PlayerStatsEntity(float f10, float f11, int i10, int i11, int i12, float f12, float f13, Bundle bundle, float f14, float f15, float f16) {
        this.f32189a = f10;
        this.f32190b = f11;
        this.f32191c = i10;
        this.f32192d = i11;
        this.f32193e = i12;
        this.f32194f = f12;
        this.f32195g = f13;
        this.f32196h = bundle;
        this.f32197i = f14;
        this.f32198j = f15;
        this.f32199k = f16;
    }

    static int b4(D8.a aVar) {
        return AbstractC3851p.b(Float.valueOf(aVar.Y3()), Float.valueOf(aVar.Z()), Integer.valueOf(aVar.T1()), Integer.valueOf(aVar.q1()), Integer.valueOf(aVar.u2()), Float.valueOf(aVar.l1()), Float.valueOf(aVar.r0()), Float.valueOf(aVar.p1()), Float.valueOf(aVar.O3()), Float.valueOf(aVar.E2()));
    }

    static boolean c4(D8.a aVar, Object obj) {
        if (!(obj instanceof D8.a)) {
            return false;
        }
        if (aVar == obj) {
            return true;
        }
        D8.a aVar2 = (D8.a) obj;
        return AbstractC3851p.a(Float.valueOf(aVar2.Y3()), Float.valueOf(aVar.Y3())) && AbstractC3851p.a(Float.valueOf(aVar2.Z()), Float.valueOf(aVar.Z())) && AbstractC3851p.a(Integer.valueOf(aVar2.T1()), Integer.valueOf(aVar.T1())) && AbstractC3851p.a(Integer.valueOf(aVar2.q1()), Integer.valueOf(aVar.q1())) && AbstractC3851p.a(Integer.valueOf(aVar2.u2()), Integer.valueOf(aVar.u2())) && AbstractC3851p.a(Float.valueOf(aVar2.l1()), Float.valueOf(aVar.l1())) && AbstractC3851p.a(Float.valueOf(aVar2.r0()), Float.valueOf(aVar.r0())) && AbstractC3851p.a(Float.valueOf(aVar2.p1()), Float.valueOf(aVar.p1())) && AbstractC3851p.a(Float.valueOf(aVar2.O3()), Float.valueOf(aVar.O3())) && AbstractC3851p.a(Float.valueOf(aVar2.E2()), Float.valueOf(aVar.E2()));
    }

    static String d4(D8.a aVar) {
        return AbstractC3851p.c(aVar).a("AverageSessionLength", Float.valueOf(aVar.Y3())).a("ChurnProbability", Float.valueOf(aVar.Z())).a("DaysSinceLastPlayed", Integer.valueOf(aVar.T1())).a("NumberOfPurchases", Integer.valueOf(aVar.q1())).a("NumberOfSessions", Integer.valueOf(aVar.u2())).a("SessionPercentile", Float.valueOf(aVar.l1())).a("SpendPercentile", Float.valueOf(aVar.r0())).a("SpendProbability", Float.valueOf(aVar.p1())).a("HighSpenderProbability", Float.valueOf(aVar.O3())).a("TotalSpendNext28Days", Float.valueOf(aVar.E2())).toString();
    }

    @Override // D8.a
    public final float E2() {
        return this.f32199k;
    }

    @Override // D8.a
    public final float O3() {
        return this.f32198j;
    }

    @Override // D8.a
    public final int T1() {
        return this.f32191c;
    }

    @Override // D8.a
    public final float Y3() {
        return this.f32189a;
    }

    @Override // D8.a
    public final float Z() {
        return this.f32190b;
    }

    public final Bundle a4() {
        return this.f32196h;
    }

    public final boolean equals(Object obj) {
        return c4(this, obj);
    }

    public final int hashCode() {
        return b4(this);
    }

    @Override // D8.a
    public final float l1() {
        return this.f32194f;
    }

    @Override // D8.a
    public final float p1() {
        return this.f32197i;
    }

    @Override // D8.a
    public final int q1() {
        return this.f32192d;
    }

    @Override // D8.a
    public final float r0() {
        return this.f32195g;
    }

    public final String toString() {
        return d4(this);
    }

    @Override // D8.a
    public final int u2() {
        return this.f32193e;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        a.a(this, parcel, i10);
    }
}
