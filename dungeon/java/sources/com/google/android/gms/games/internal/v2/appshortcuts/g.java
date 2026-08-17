package com.google.android.gms.games.internal.v2.appshortcuts;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class g extends p188k8.a {
    public static final Parcelable.Creator<g> CREATOR = new h();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final List f32114a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final List f32115b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final List f32116c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final List f32117d;

    g(List list, List list2, List list3, List list4) {
        this.f32114a = list;
        this.f32115b = list2;
        this.f32116c = list3;
        this.f32117d = list4;
    }

    public final List a4() {
        return this.f32115b;
    }

    public final List b4() {
        return this.f32116c;
    }

    public final List c4() {
        return this.f32117d;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        List list = this.f32114a;
        int iA = p188k8.c.a(parcel);
        p188k8.c.w(parcel, 1, list, false);
        p188k8.c.y(parcel, 2, this.f32115b, false);
        p188k8.c.w(parcel, 3, this.f32116c, false);
        p188k8.c.w(parcel, 4, this.f32117d, false);
        p188k8.c.b(parcel, iA);
    }

    public final List zza() {
        return this.f32114a;
    }
}
