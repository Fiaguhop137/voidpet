package p081e8;

import H8.c;
import H8.e;
import android.os.Parcel;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.api.Status;

/* JADX INFO: loaded from: classes2.dex */
public abstract class u extends c implements v {
    public u() {
        super("com.google.android.gms.auth.api.signin.internal.ISignInCallbacks");
    }

    @Override // H8.c
    protected final boolean g(int i10, Parcel parcel, Parcel parcel2, int i11) {
        switch (i10) {
            case 101:
                GoogleSignInAccount googleSignInAccount = (GoogleSignInAccount) e.a(parcel, GoogleSignInAccount.CREATOR);
                Status status = (Status) e.a(parcel, Status.CREATOR);
                e.d(parcel);
                w(googleSignInAccount, status);
                break;
            case 102:
                Status status2 = (Status) e.a(parcel, Status.CREATOR);
                e.d(parcel);
                D0(status2);
                break;
            case 103:
                Status status3 = (Status) e.a(parcel, Status.CREATOR);
                e.d(parcel);
                I0(status3);
                break;
            default:
                return false;
        }
        parcel2.writeNoException();
        return true;
    }
}
