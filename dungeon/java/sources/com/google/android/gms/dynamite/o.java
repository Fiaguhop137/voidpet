package com.google.android.gms.dynamite;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* JADX INFO: loaded from: classes2.dex */
public final class o extends K8.a implements IInterface {
    o(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.dynamite.IDynamiteLoaderV2");
    }

    public final p314r8.a c1(p314r8.a aVar, String str, int i10, p314r8.a aVar2) {
        Parcel parcelH = h();
        K8.o.d(parcelH, aVar);
        parcelH.writeString(str);
        parcelH.writeInt(i10);
        K8.o.d(parcelH, aVar2);
        Parcel parcelG = g(3, parcelH);
        p314r8.a aVarH = p314r8.a.AbstractBinderC0632a.h(parcelG.readStrongBinder());
        parcelG.recycle();
        return aVarH;
    }

    public final p314r8.a k(p314r8.a aVar, String str, int i10, p314r8.a aVar2) {
        Parcel parcelH = h();
        K8.o.d(parcelH, aVar);
        parcelH.writeString(str);
        parcelH.writeInt(i10);
        K8.o.d(parcelH, aVar2);
        Parcel parcelG = g(2, parcelH);
        p314r8.a aVarH = p314r8.a.AbstractBinderC0632a.h(parcelG.readStrongBinder());
        parcelG.recycle();
        return aVarH;
    }
}
