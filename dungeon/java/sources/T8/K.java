package T8;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes2.dex */
public final class K implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iC = p188k8.b.C(parcel);
        ArrayList arrayListF = null;
        while (parcel.dataPosition() < iC) {
            int iU = p188k8.b.u(parcel);
            if (p188k8.b.n(iU) != 1) {
                p188k8.b.B(parcel, iU);
            } else {
                arrayListF = p188k8.b.f(parcel, iU);
            }
        }
        p188k8.b.m(parcel, iC);
        return new J(arrayListF);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new J[i10];
    }
}
