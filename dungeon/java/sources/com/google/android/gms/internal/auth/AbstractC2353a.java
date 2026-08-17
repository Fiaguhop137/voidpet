package com.google.android.gms.internal.auth;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* JADX INFO: renamed from: com.google.android.gms.internal.auth.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC2353a implements IInterface {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final IBinder f32295e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final String f32296f;

    protected AbstractC2353a(IBinder iBinder, String str) {
        this.f32295e = iBinder;
        this.f32296f = str;
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.f32295e;
    }

    protected final Parcel g() {
        Parcel parcelObtain = Parcel.obtain();
        parcelObtain.writeInterfaceToken(this.f32296f);
        return parcelObtain;
    }

    protected final Parcel h(int i10, Parcel parcel) {
        Parcel parcelObtain = Parcel.obtain();
        try {
            try {
                this.f32295e.transact(i10, parcel, parcelObtain, 0);
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
            this.f32295e.transact(i10, parcel, parcelObtain, 0);
            parcelObtain.readException();
        } finally {
            parcel.recycle();
            parcelObtain.recycle();
        }
    }
}
