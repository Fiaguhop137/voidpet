package com.google.android.gms.games.internal.v2.appshortcuts;

import L8.AbstractC1138a;
import L8.L;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class s extends AbstractC1138a implements IInterface {
    s(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.games.internal.v2.appshortcuts.IAppShortcutsService");
    }

    public final void c1(A8.t tVar, A8.p pVar, List list, List list2) {
        Parcel parcelG = g();
        L.d(parcelG, tVar);
        L.c(parcelG, pVar);
        parcelG.writeTypedList(list);
        parcelG.writeTypedList(list2);
        k(3, parcelG);
    }

    public final void d1(A8.t tVar, A8.p pVar, i iVar) {
        Parcel parcelG = g();
        L.d(parcelG, tVar);
        L.c(parcelG, pVar);
        L.c(parcelG, iVar);
        k(4, parcelG);
    }
}
