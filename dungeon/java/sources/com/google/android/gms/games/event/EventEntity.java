package com.google.android.gms.games.event;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import com.google.android.apps.common.proguard.UsedByReflection;
import com.google.android.gms.games.PlayerEntity;
import p170j8.AbstractC3851p;
import p188k8.c;
import p350t8.j;
import p404w8.p;

/* JADX INFO: loaded from: classes2.dex */
@UsedByReflection("GamesGmsClientImpl.java")
public final class EventEntity extends p implements p386v8.a {

    @NonNull
    public static final Parcelable.Creator<EventEntity> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f32056a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f32057b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f32058c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Uri f32059d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final String f32060e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final PlayerEntity f32061f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final long f32062g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final String f32063h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final boolean f32064i;

    EventEntity(String str, String str2, String str3, Uri uri, String str4, j jVar, long j10, String str5, boolean z10) {
        this.f32056a = str;
        this.f32057b = str2;
        this.f32058c = str3;
        this.f32059d = uri;
        this.f32060e = str4;
        this.f32061f = new PlayerEntity(jVar);
        this.f32062g = j10;
        this.f32063h = str5;
        this.f32064i = z10;
    }

    static int a4(p386v8.a aVar) {
        return AbstractC3851p.b(aVar.F(), aVar.getName(), aVar.g(), aVar.p(), aVar.getIconImageUrl(), aVar.p2(), Long.valueOf(aVar.getValue()), aVar.R3(), Boolean.valueOf(aVar.isVisible()));
    }

    static boolean b4(p386v8.a aVar, Object obj) {
        if (!(obj instanceof p386v8.a)) {
            return false;
        }
        if (aVar == obj) {
            return true;
        }
        p386v8.a aVar2 = (p386v8.a) obj;
        return AbstractC3851p.a(aVar2.F(), aVar.F()) && AbstractC3851p.a(aVar2.getName(), aVar.getName()) && AbstractC3851p.a(aVar2.g(), aVar.g()) && AbstractC3851p.a(aVar2.p(), aVar.p()) && AbstractC3851p.a(aVar2.getIconImageUrl(), aVar.getIconImageUrl()) && AbstractC3851p.a(aVar2.p2(), aVar.p2()) && AbstractC3851p.a(Long.valueOf(aVar2.getValue()), Long.valueOf(aVar.getValue())) && AbstractC3851p.a(aVar2.R3(), aVar.R3()) && AbstractC3851p.a(Boolean.valueOf(aVar2.isVisible()), Boolean.valueOf(aVar.isVisible()));
    }

    static String c4(p386v8.a aVar) {
        return AbstractC3851p.c(aVar).a("Id", aVar.F()).a("Name", aVar.getName()).a("Description", aVar.g()).a("IconImageUri", aVar.p()).a("IconImageUrl", aVar.getIconImageUrl()).a("Player", aVar.p2()).a("Value", Long.valueOf(aVar.getValue())).a("FormattedValue", aVar.R3()).a("isVisible", Boolean.valueOf(aVar.isVisible())).toString();
    }

    @Override // p386v8.a
    public String F() {
        return this.f32056a;
    }

    @Override // p386v8.a
    public String R3() {
        return this.f32063h;
    }

    public boolean equals(Object obj) {
        return b4(this, obj);
    }

    @Override // p386v8.a
    public String g() {
        return this.f32058c;
    }

    @Override // p386v8.a
    public String getIconImageUrl() {
        return this.f32060e;
    }

    @Override // p386v8.a
    public String getName() {
        return this.f32057b;
    }

    @Override // p386v8.a
    public long getValue() {
        return this.f32062g;
    }

    public int hashCode() {
        return a4(this);
    }

    @Override // p386v8.a
    public boolean isVisible() {
        return this.f32064i;
    }

    @Override // p386v8.a
    public Uri p() {
        return this.f32059d;
    }

    @Override // p386v8.a
    public j p2() {
        return this.f32061f;
    }

    public String toString() {
        return c4(this);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        int iA = c.a(parcel);
        c.u(parcel, 1, F(), false);
        c.u(parcel, 2, getName(), false);
        c.u(parcel, 3, g(), false);
        c.t(parcel, 4, p(), i10, false);
        c.u(parcel, 5, getIconImageUrl(), false);
        c.t(parcel, 6, p2(), i10, false);
        c.r(parcel, 7, getValue());
        c.u(parcel, 8, R3(), false);
        c.c(parcel, 9, isVisible());
        c.b(parcel, iA);
    }
}
