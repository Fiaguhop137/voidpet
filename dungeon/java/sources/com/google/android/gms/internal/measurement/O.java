package com.google.android.gms.internal.measurement;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* JADX INFO: loaded from: classes2.dex */
public abstract class O implements IInterface {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final IBinder f32674e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final String f32675f;

    protected O(IBinder iBinder, String str) {
        this.f32674e = iBinder;
        this.f32675f = str;
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.f32674e;
    }

    protected final void c1(int i10, Parcel parcel) {
        try {
            this.f32674e.transact(2, parcel, null, 1);
        } finally {
            parcel.recycle();
        }
    }

    protected final Parcel g(int i10, Parcel parcel) {
        Parcel parcelObtain = Parcel.obtain();
        try {
            try {
                this.f32674e.transact(i10, parcel, parcelObtain, 0);
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

    protected final Parcel h() {
        Parcel parcelObtain = Parcel.obtain();
        parcelObtain.writeInterfaceToken(this.f32675f);
        return parcelObtain;
    }

    protected final void k(int i10, Parcel parcel) {
        Parcel parcelObtain = Parcel.obtain();
        try {
            this.f32674e.transact(i10, parcel, parcelObtain, 0);
            parcelObtain.readException();
        } finally {
            parcel.recycle();
            parcelObtain.recycle();
        }
    }
}
