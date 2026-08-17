package com.google.android.gms.dynamite;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* JADX INFO: loaded from: classes2.dex */
public final class n extends K8.a implements IInterface {
    n(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.dynamite.IDynamiteLoader");
    }

    public final int c1(p314r8.a aVar, String str, boolean z10) {
        Parcel parcelH = h();
        K8.o.d(parcelH, aVar);
        parcelH.writeString(str);
        parcelH.writeInt(z10 ? 1 : 0);
        Parcel parcelG = g(3, parcelH);
        int i10 = parcelG.readInt();
        parcelG.recycle();
        return i10;
    }

    public final p314r8.a d1(p314r8.a aVar, String str, int i10) {
        Parcel parcelH = h();
        K8.o.d(parcelH, aVar);
        parcelH.writeString(str);
        parcelH.writeInt(i10);
        Parcel parcelG = g(4, parcelH);
        p314r8.a aVarH = p314r8.a.AbstractBinderC0632a.h(parcelG.readStrongBinder());
        parcelG.recycle();
        return aVarH;
    }

    public final int e1(p314r8.a aVar, String str, boolean z10) {
        Parcel parcelH = h();
        K8.o.d(parcelH, aVar);
        parcelH.writeString(str);
        parcelH.writeInt(z10 ? 1 : 0);
        Parcel parcelG = g(5, parcelH);
        int i10 = parcelG.readInt();
        parcelG.recycle();
        return i10;
    }

    public final int f1() {
        Parcel parcelG = g(6, h());
        int i10 = parcelG.readInt();
        parcelG.recycle();
        return i10;
    }

    public final p314r8.a g1(p314r8.a aVar, String str, boolean z10, long j10) {
        Parcel parcelH = h();
        K8.o.d(parcelH, aVar);
        parcelH.writeString(str);
        parcelH.writeInt(z10 ? 1 : 0);
        parcelH.writeLong(j10);
        Parcel parcelG = g(7, parcelH);
        p314r8.a aVarH = p314r8.a.AbstractBinderC0632a.h(parcelG.readStrongBinder());
        parcelG.recycle();
        return aVarH;
    }

    public final p314r8.a h1(p314r8.a aVar, String str, int i10, p314r8.a aVar2) {
        Parcel parcelH = h();
        K8.o.d(parcelH, aVar);
        parcelH.writeString(str);
        parcelH.writeInt(i10);
        K8.o.d(parcelH, aVar2);
        Parcel parcelG = g(8, parcelH);
        p314r8.a aVarH = p314r8.a.AbstractBinderC0632a.h(parcelG.readStrongBinder());
        parcelG.recycle();
        return aVarH;
    }

    public final p314r8.a k(p314r8.a aVar, String str, int i10) {
        Parcel parcelH = h();
        K8.o.d(parcelH, aVar);
        parcelH.writeString(str);
        parcelH.writeInt(i10);
        Parcel parcelG = g(2, parcelH);
        p314r8.a aVarH = p314r8.a.AbstractBinderC0632a.h(parcelG.readStrongBinder());
        parcelG.recycle();
        return aVarH;
    }
}
