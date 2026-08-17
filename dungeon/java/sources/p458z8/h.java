package p458z8;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.games.internal.player.StockProfileImageEntity;
import p188k8.b;

/* JADX INFO: loaded from: classes2.dex */
public final class h implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iC = b.C(parcel);
        String strH = "";
        String strH2 = null;
        Uri uri = null;
        while (parcel.dataPosition() < iC) {
            int iU = b.u(parcel);
            int iN = b.n(iU);
            if (iN == 1) {
                strH2 = b.h(parcel, iU);
            } else if (iN == 2) {
                uri = (Uri) b.g(parcel, iU, Uri.CREATOR);
            } else if (iN != 3) {
                b.B(parcel, iU);
            } else {
                strH = b.h(parcel, iU);
            }
        }
        b.m(parcel, iC);
        return new StockProfileImageEntity(strH2, uri, strH);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new StockProfileImageEntity[i10];
    }
}
