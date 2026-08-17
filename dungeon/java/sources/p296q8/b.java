package p296q8;

import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable;
import com.google.android.gms.drive.DriveId;

/* JADX INFO: loaded from: classes2.dex */
public final class b implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iC = p188k8.b.C(parcel);
        ParcelFileDescriptor parcelFileDescriptor = null;
        DriveId driveId = null;
        String strH = null;
        int iW = 0;
        int iW2 = 0;
        boolean zO = false;
        while (parcel.dataPosition() < iC) {
            int iU = p188k8.b.u(parcel);
            int iN = p188k8.b.n(iU);
            if (iN == 2) {
                parcelFileDescriptor = (ParcelFileDescriptor) p188k8.b.g(parcel, iU, ParcelFileDescriptor.CREATOR);
            } else if (iN == 3) {
                iW = p188k8.b.w(parcel, iU);
            } else if (iN == 4) {
                iW2 = p188k8.b.w(parcel, iU);
            } else if (iN == 5) {
                driveId = (DriveId) p188k8.b.g(parcel, iU, DriveId.CREATOR);
            } else if (iN == 7) {
                zO = p188k8.b.o(parcel, iU);
            } else if (iN != 8) {
                p188k8.b.B(parcel, iU);
            } else {
                strH = p188k8.b.h(parcel, iU);
            }
        }
        p188k8.b.m(parcel, iC);
        return new a(parcelFileDescriptor, iW, iW2, driveId, zO, strH);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new a[i10];
    }
}
