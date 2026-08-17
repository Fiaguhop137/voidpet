package com.google.android.gms.internal.play_billing;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* JADX INFO: renamed from: com.google.android.gms.internal.play_billing.g, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC2816g implements IInterface {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final IBinder f34724e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final String f34725f;

    protected AbstractC2816g(IBinder iBinder, String str) {
        this.f34724e = iBinder;
        this.f34725f = str;
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.f34724e;
    }

    protected final void c1(int i10, Parcel parcel) {
        try {
            this.f34724e.transact(i10, parcel, null, 1);
        } finally {
            parcel.recycle();
        }
    }

    protected final Parcel g() {
        Parcel parcelObtain = Parcel.obtain();
        parcelObtain.writeInterfaceToken(this.f34725f);
        return parcelObtain;
    }

    protected final Parcel h(int i10, Parcel parcel) {
        Parcel parcelObtain = Parcel.obtain();
        try {
            try {
                this.f34724e.transact(i10, parcel, parcelObtain, 0);
                parcelObtain.readException();
                parcel.recycle();
                return parcelObtain;
            } catch (RuntimeException e10) {
                parcelObtain.recycle();
                throw e10;
            }
        } catch (Throwable th) {
            parcel.recycle();
            throw th;
        }
    }

    protected final void k(int i10, Parcel parcel) {
        Parcel parcelObtain = Parcel.obtain();
        try {
            this.f34724e.transact(i10, parcel, parcelObtain, 0);
            parcelObtain.readException();
        } finally {
            parcel.recycle();
            parcelObtain.recycle();
        }
    }
}
