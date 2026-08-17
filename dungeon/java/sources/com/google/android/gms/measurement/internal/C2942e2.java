package com.google.android.gms.measurement.internal;

import T8.C1447a;
import T8.InterfaceC1450d;
import T8.InterfaceC1453g;
import T8.InterfaceC1456j;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: com.google.android.gms.measurement.internal.e2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C2942e2 extends com.google.android.gms.internal.measurement.O implements InterfaceC1450d {
    C2942e2(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.measurement.internal.IMeasurementService");
    }

    @Override // T8.InterfaceC1450d
    public final List A(String str, String str2, String str3) {
        Parcel parcelH = h();
        parcelH.writeString(null);
        parcelH.writeString(str2);
        parcelH.writeString(str3);
        Parcel parcelG = g(17, parcelH);
        ArrayList arrayListCreateTypedArrayList = parcelG.createTypedArrayList(C2971i.CREATOR);
        parcelG.recycle();
        return arrayListCreateTypedArrayList;
    }

    @Override // T8.InterfaceC1450d
    public final void C(B6 b10) {
        Parcel parcelH = h();
        com.google.android.gms.internal.measurement.Q.c(parcelH, b10);
        k(25, parcelH);
    }

    @Override // T8.InterfaceC1450d
    public final void C0(B6 b10, C2955g c2955g) {
        Parcel parcelH = h();
        com.google.android.gms.internal.measurement.Q.c(parcelH, b10);
        com.google.android.gms.internal.measurement.Q.c(parcelH, c2955g);
        k(30, parcelH);
    }

    @Override // T8.InterfaceC1450d
    public final C1447a F0(B6 b10) {
        Parcel parcelH = h();
        com.google.android.gms.internal.measurement.Q.c(parcelH, b10);
        Parcel parcelG = g(21, parcelH);
        C1447a c1447a = (C1447a) com.google.android.gms.internal.measurement.Q.b(parcelG, C1447a.CREATOR);
        parcelG.recycle();
        return c1447a;
    }

    @Override // T8.InterfaceC1450d
    public final void G0(Bundle bundle, B6 b10) {
        Parcel parcelH = h();
        com.google.android.gms.internal.measurement.Q.c(parcelH, bundle);
        com.google.android.gms.internal.measurement.Q.c(parcelH, b10);
        k(19, parcelH);
    }

    @Override // T8.InterfaceC1450d
    public final void H(G g10, B6 b10) {
        Parcel parcelH = h();
        com.google.android.gms.internal.measurement.Q.c(parcelH, g10);
        com.google.android.gms.internal.measurement.Q.c(parcelH, b10);
        k(1, parcelH);
    }

    @Override // T8.InterfaceC1450d
    public final void I(B6 b10) {
        Parcel parcelH = h();
        com.google.android.gms.internal.measurement.Q.c(parcelH, b10);
        k(6, parcelH);
    }

    @Override // T8.InterfaceC1450d
    public final void K0(B6 b10) {
        Parcel parcelH = h();
        com.google.android.gms.internal.measurement.Q.c(parcelH, b10);
        k(4, parcelH);
    }

    @Override // T8.InterfaceC1450d
    public final void L(B6 b10) {
        Parcel parcelH = h();
        com.google.android.gms.internal.measurement.Q.c(parcelH, b10);
        k(26, parcelH);
    }

    @Override // T8.InterfaceC1450d
    public final void M0(B6 b10, T8.J j10, InterfaceC1456j interfaceC1456j) {
        Parcel parcelH = h();
        com.google.android.gms.internal.measurement.Q.c(parcelH, b10);
        com.google.android.gms.internal.measurement.Q.c(parcelH, j10);
        com.google.android.gms.internal.measurement.Q.d(parcelH, interfaceC1456j);
        k(29, parcelH);
    }

    @Override // T8.InterfaceC1450d
    public final byte[] N(G g10, String str) {
        Parcel parcelH = h();
        com.google.android.gms.internal.measurement.Q.c(parcelH, g10);
        parcelH.writeString(str);
        Parcel parcelG = g(9, parcelH);
        byte[] bArrCreateByteArray = parcelG.createByteArray();
        parcelG.recycle();
        return bArrCreateByteArray;
    }

    @Override // T8.InterfaceC1450d
    public final void P0(B6 b10) {
        Parcel parcelH = h();
        com.google.android.gms.internal.measurement.Q.c(parcelH, b10);
        k(27, parcelH);
    }

    @Override // T8.InterfaceC1450d
    public final void Q(v6 v6Var, B6 b10) {
        Parcel parcelH = h();
        com.google.android.gms.internal.measurement.Q.c(parcelH, v6Var);
        com.google.android.gms.internal.measurement.Q.c(parcelH, b10);
        k(2, parcelH);
    }

    @Override // T8.InterfaceC1450d
    public final List S0(String str, String str2, boolean z10, B6 b10) {
        Parcel parcelH = h();
        parcelH.writeString(str);
        parcelH.writeString(str2);
        int i10 = com.google.android.gms.internal.measurement.Q.f32699b;
        parcelH.writeInt(z10 ? 1 : 0);
        com.google.android.gms.internal.measurement.Q.c(parcelH, b10);
        Parcel parcelG = g(14, parcelH);
        ArrayList arrayListCreateTypedArrayList = parcelG.createTypedArrayList(v6.CREATOR);
        parcelG.recycle();
        return arrayListCreateTypedArrayList;
    }

    @Override // T8.InterfaceC1450d
    public final List V0(String str, String str2, B6 b10) {
        Parcel parcelH = h();
        parcelH.writeString(str);
        parcelH.writeString(str2);
        com.google.android.gms.internal.measurement.Q.c(parcelH, b10);
        Parcel parcelG = g(16, parcelH);
        ArrayList arrayListCreateTypedArrayList = parcelG.createTypedArrayList(C2971i.CREATOR);
        parcelG.recycle();
        return arrayListCreateTypedArrayList;
    }

    @Override // T8.InterfaceC1450d
    public final String Z(B6 b10) {
        Parcel parcelH = h();
        com.google.android.gms.internal.measurement.Q.c(parcelH, b10);
        Parcel parcelG = g(11, parcelH);
        String string = parcelG.readString();
        parcelG.recycle();
        return string;
    }

    @Override // T8.InterfaceC1450d
    public final void a1(B6 b10) {
        Parcel parcelH = h();
        com.google.android.gms.internal.measurement.Q.c(parcelH, b10);
        k(20, parcelH);
    }

    @Override // T8.InterfaceC1450d
    public final List m(String str, String str2, String str3, boolean z10) {
        Parcel parcelH = h();
        parcelH.writeString(null);
        parcelH.writeString(str2);
        parcelH.writeString(str3);
        int i10 = com.google.android.gms.internal.measurement.Q.f32699b;
        parcelH.writeInt(z10 ? 1 : 0);
        Parcel parcelG = g(15, parcelH);
        ArrayList arrayListCreateTypedArrayList = parcelG.createTypedArrayList(v6.CREATOR);
        parcelG.recycle();
        return arrayListCreateTypedArrayList;
    }

    @Override // T8.InterfaceC1450d
    public final void o(C2971i c2971i, B6 b10) {
        Parcel parcelH = h();
        com.google.android.gms.internal.measurement.Q.c(parcelH, c2971i);
        com.google.android.gms.internal.measurement.Q.c(parcelH, b10);
        k(12, parcelH);
    }

    @Override // T8.InterfaceC1450d
    public final void q0(long j10, String str, String str2, String str3) {
        Parcel parcelH = h();
        parcelH.writeLong(j10);
        parcelH.writeString(str);
        parcelH.writeString(str2);
        parcelH.writeString(str3);
        k(10, parcelH);
    }

    @Override // T8.InterfaceC1450d
    public final void s0(B6 b10) {
        Parcel parcelH = h();
        com.google.android.gms.internal.measurement.Q.c(parcelH, b10);
        k(18, parcelH);
    }

    @Override // T8.InterfaceC1450d
    public final void z0(B6 b10, Bundle bundle, InterfaceC1453g interfaceC1453g) {
        Parcel parcelH = h();
        com.google.android.gms.internal.measurement.Q.c(parcelH, b10);
        com.google.android.gms.internal.measurement.Q.c(parcelH, bundle);
        com.google.android.gms.internal.measurement.Q.d(parcelH, interfaceC1453g);
        k(31, parcelH);
    }
}
