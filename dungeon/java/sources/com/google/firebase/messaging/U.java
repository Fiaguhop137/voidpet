package com.google.firebase.messaging;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes2.dex */
public class U implements Parcelable.Creator {
    static void c(T t10, Parcel parcel, int i10) {
        int iA = p188k8.c.a(parcel);
        p188k8.c.f(parcel, 2, t10.f37500a, false);
        p188k8.c.b(parcel, iA);
    }

    @Override // android.os.Parcelable.Creator
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public T createFromParcel(Parcel parcel) {
        int iC = p188k8.b.C(parcel);
        Bundle bundleB = null;
        while (parcel.dataPosition() < iC) {
            int iU = p188k8.b.u(parcel);
            if (p188k8.b.n(iU) != 2) {
                p188k8.b.B(parcel, iU);
            } else {
                bundleB = p188k8.b.b(parcel, iU);
            }
        }
        p188k8.b.m(parcel, iC);
        return new T(bundleB);
    }

    @Override // android.os.Parcelable.Creator
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public T[] newArray(int i10) {
        return new T[i10];
    }
}
