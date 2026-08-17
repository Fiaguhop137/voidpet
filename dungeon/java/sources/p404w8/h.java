package p404w8;

import L8.AbstractC1138a;
import L8.L;
import android.content.Intent;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* JADX INFO: loaded from: classes2.dex */
public final class h extends AbstractC1138a implements IInterface {
    h(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.games.internal.IGamesService");
    }

    public final void c1(g gVar, long j10) {
        Parcel parcelG = g();
        L.d(parcelG, gVar);
        parcelG.writeLong(j10);
        k(15501, parcelG);
    }

    public final void d1(long j10) {
        Parcel parcelG = g();
        parcelG.writeLong(j10);
        k(5001, parcelG);
    }

    public final void e1(e eVar) {
        Parcel parcelG = g();
        L.d(parcelG, eVar);
        k(5002, parcelG);
    }

    public final void f1(IBinder iBinder, Bundle bundle) {
        Parcel parcelG = g();
        parcelG.writeStrongBinder(iBinder);
        L.c(parcelG, bundle);
        k(5005, parcelG);
    }

    public final void g1() {
        k(5006, g());
    }

    public final void h1(e eVar, String str, IBinder iBinder, Bundle bundle) {
        Parcel parcelG = g();
        L.d(parcelG, eVar);
        parcelG.writeString(str);
        parcelG.writeStrongBinder(iBinder);
        L.c(parcelG, bundle);
        k(5023, parcelG);
    }

    public final void i1(e eVar, String str, IBinder iBinder, Bundle bundle) {
        Parcel parcelG = g();
        L.d(parcelG, eVar);
        parcelG.writeString(str);
        parcelG.writeStrongBinder(iBinder);
        L.c(parcelG, bundle);
        k(5024, parcelG);
    }

    public final void j1(e eVar, String str, int i10, IBinder iBinder, Bundle bundle) {
        Parcel parcelG = g();
        L.d(parcelG, eVar);
        parcelG.writeString(str);
        parcelG.writeInt(i10);
        parcelG.writeStrongBinder(iBinder);
        L.c(parcelG, bundle);
        k(5025, parcelG);
    }

    public final Intent k1() {
        Parcel parcelH = h(9005, g());
        Intent intent = (Intent) L.b(parcelH, Intent.CREATOR);
        parcelH.recycle();
        return intent;
    }
}
