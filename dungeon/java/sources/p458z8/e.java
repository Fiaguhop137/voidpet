package p458z8;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.games.internal.player.ProfileSettingsEntity;
import com.google.android.gms.games.internal.player.StockProfileImageEntity;
import p188k8.b;

/* JADX INFO: loaded from: classes2.dex */
public final class e implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iC = b.C(parcel);
        Status status = null;
        String strH = null;
        StockProfileImageEntity stockProfileImageEntity = null;
        f fVar = null;
        Boolean boolP = null;
        boolean zO = false;
        boolean zO2 = false;
        boolean zO3 = false;
        boolean zO4 = false;
        boolean zO5 = false;
        int iW = 0;
        boolean zO6 = false;
        boolean zO7 = false;
        int iW2 = 0;
        int iW3 = 0;
        boolean zO8 = false;
        while (parcel.dataPosition() < iC) {
            int iU = b.u(parcel);
            switch (b.n(iU)) {
                case 1:
                    status = (Status) b.g(parcel, iU, Status.CREATOR);
                    break;
                case 2:
                    strH = b.h(parcel, iU);
                    break;
                case 3:
                    zO = b.o(parcel, iU);
                    break;
                case 4:
                    zO2 = b.o(parcel, iU);
                    break;
                case 5:
                    zO3 = b.o(parcel, iU);
                    break;
                case 6:
                    stockProfileImageEntity = (StockProfileImageEntity) b.g(parcel, iU, StockProfileImageEntity.CREATOR);
                    break;
                case 7:
                    zO4 = b.o(parcel, iU);
                    break;
                case 8:
                    zO5 = b.o(parcel, iU);
                    break;
                case 9:
                    iW = b.w(parcel, iU);
                    break;
                case 10:
                    zO6 = b.o(parcel, iU);
                    break;
                case 11:
                    zO7 = b.o(parcel, iU);
                    break;
                case 12:
                    iW2 = b.w(parcel, iU);
                    break;
                case 13:
                    iW3 = b.w(parcel, iU);
                    break;
                case 14:
                    zO8 = b.o(parcel, iU);
                    break;
                case 15:
                    fVar = (f) b.g(parcel, iU, f.CREATOR);
                    break;
                case 16:
                    boolP = b.p(parcel, iU);
                    break;
                default:
                    b.B(parcel, iU);
                    break;
            }
        }
        b.m(parcel, iC);
        return new ProfileSettingsEntity(status, strH, zO, zO2, zO3, stockProfileImageEntity, zO4, zO5, iW, zO6, zO7, iW2, iW3, zO8, fVar, boolP);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new ProfileSettingsEntity[i10];
    }
}
