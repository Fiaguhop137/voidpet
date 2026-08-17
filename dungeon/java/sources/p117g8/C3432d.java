package p117g8;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import p188k8.b;

/* JADX INFO: renamed from: g8.d, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C3432d implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iC = b.C(parcel);
        Intent intent = null;
        while (parcel.dataPosition() < iC) {
            int iU = b.u(parcel);
            if (b.n(iU) != 1) {
                b.B(parcel, iU);
            } else {
                intent = (Intent) b.g(parcel, iU, Intent.CREATOR);
            }
        }
        b.m(parcel, iC);
        return new C3429a(intent);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new C3429a[i10];
    }
}
