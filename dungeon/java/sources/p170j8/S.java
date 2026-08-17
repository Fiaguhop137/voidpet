package p170j8;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import p188k8.b;

/* JADX INFO: loaded from: classes2.dex */
public final class S implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iC = b.C(parcel);
        Account account = null;
        int iW = 0;
        int iW2 = 0;
        GoogleSignInAccount googleSignInAccount = null;
        while (parcel.dataPosition() < iC) {
            int iU = b.u(parcel);
            int iN = b.n(iU);
            if (iN == 1) {
                iW = b.w(parcel, iU);
            } else if (iN == 2) {
                account = (Account) b.g(parcel, iU, Account.CREATOR);
            } else if (iN == 3) {
                iW2 = b.w(parcel, iU);
            } else if (iN != 4) {
                b.B(parcel, iU);
            } else {
                googleSignInAccount = (GoogleSignInAccount) b.g(parcel, iU, GoogleSignInAccount.CREATOR);
            }
        }
        b.m(parcel, iC);
        return new Q(iW, account, iW2, googleSignInAccount);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new Q[i10];
    }
}
