package T8;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: renamed from: T8.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C1448b implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iC = p188k8.b.C(parcel);
        Bundle bundleB = null;
        while (parcel.dataPosition() < iC) {
            int iU = p188k8.b.u(parcel);
            if (p188k8.b.n(iU) != 1) {
                p188k8.b.B(parcel, iU);
            } else {
                bundleB = p188k8.b.b(parcel, iU);
            }
        }
        p188k8.b.m(parcel, iC);
        return new C1447a(bundleB);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new C1447a[i10];
    }
}
