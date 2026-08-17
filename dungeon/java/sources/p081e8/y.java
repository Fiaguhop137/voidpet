package p081e8;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.auth.api.signin.internal.SignInConfiguration;
import p188k8.b;

/* JADX INFO: loaded from: classes2.dex */
public final class y implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iC = b.C(parcel);
        String strH = null;
        GoogleSignInOptions googleSignInOptions = null;
        while (parcel.dataPosition() < iC) {
            int iU = b.u(parcel);
            int iN = b.n(iU);
            if (iN == 2) {
                strH = b.h(parcel, iU);
            } else if (iN != 5) {
                b.B(parcel, iU);
            } else {
                googleSignInOptions = (GoogleSignInOptions) b.g(parcel, iU, GoogleSignInOptions.CREATOR);
            }
        }
        b.m(parcel, iC);
        return new SignInConfiguration(strH, googleSignInOptions);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new SignInConfiguration[i10];
    }
}
