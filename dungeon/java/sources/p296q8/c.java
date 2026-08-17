package p296q8;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.drive.DriveId;
import p188k8.b;

/* JADX INFO: loaded from: classes2.dex */
public final class c implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iC = b.C(parcel);
        int iW = -1;
        long jY = 0;
        long jY2 = 0;
        String strH = null;
        while (parcel.dataPosition() < iC) {
            int iU = b.u(parcel);
            int iN = b.n(iU);
            if (iN == 2) {
                strH = b.h(parcel, iU);
            } else if (iN == 3) {
                jY = b.y(parcel, iU);
            } else if (iN == 4) {
                jY2 = b.y(parcel, iU);
            } else if (iN != 5) {
                b.B(parcel, iU);
            } else {
                iW = b.w(parcel, iU);
            }
        }
        b.m(parcel, iC);
        return new DriveId(strH, jY, jY2, iW);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new DriveId[i10];
    }
}
