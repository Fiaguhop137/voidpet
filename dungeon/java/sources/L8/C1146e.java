package L8;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: renamed from: L8.e, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C1146e implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iC = p188k8.b.C(parcel);
        Bundle bundleB = null;
        IBinder iBinderV = null;
        while (parcel.dataPosition() < iC) {
            int iU = p188k8.b.u(parcel);
            int iN = p188k8.b.n(iU);
            if (iN == 1) {
                bundleB = p188k8.b.b(parcel, iU);
            } else if (iN != 2) {
                p188k8.b.B(parcel, iU);
            } else {
                iBinderV = p188k8.b.v(parcel, iU);
            }
        }
        p188k8.b.m(parcel, iC);
        return new C1144d(bundleB, iBinderV);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new C1144d[i10];
    }
}
