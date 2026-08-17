package com.google.android.gms.common;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import android.util.Log;
import p170j8.z0;

/* JADX INFO: loaded from: classes2.dex */
public final class O extends p188k8.a {
    public static final Parcelable.Creator<O> CREATOR = new P();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f31692a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final E f31693b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final boolean f31694c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final boolean f31695d;

    O(String str, IBinder iBinder, boolean z10, boolean z11) {
        this.f31692a = str;
        F f10 = null;
        if (iBinder != null) {
            try {
                p314r8.a aVarA = z0.h(iBinder).a();
                byte[] bArr = aVarA == null ? null : (byte[]) p314r8.b.k(aVarA);
                if (bArr != null) {
                    f10 = new F(bArr);
                } else {
                    Log.e("GoogleCertificatesQuery", "Could not unwrap certificate");
                }
            } catch (RemoteException e10) {
                Log.e("GoogleCertificatesQuery", "Could not unwrap certificate", e10);
            }
        }
        this.f31693b = f10;
        this.f31694c = z10;
        this.f31695d = z11;
    }

    O(String str, E e10, boolean z10, boolean z11) {
        this.f31692a = str;
        this.f31693b = e10;
        this.f31694c = z10;
        this.f31695d = z11;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        String str = this.f31692a;
        int iA = p188k8.c.a(parcel);
        p188k8.c.u(parcel, 1, str, false);
        E e10 = this.f31693b;
        if (e10 == null) {
            Log.w("GoogleCertificatesQuery", "certificate binder is null");
            e10 = null;
        }
        p188k8.c.m(parcel, 2, e10, false);
        p188k8.c.c(parcel, 3, this.f31694c);
        p188k8.c.c(parcel, 4, this.f31695d);
        p188k8.c.b(parcel, iA);
    }
}
