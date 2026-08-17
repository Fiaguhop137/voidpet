package p081e8;

import H8.a;
import H8.e;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;

/* JADX INFO: loaded from: classes2.dex */
public final class w extends a implements IInterface {
    w(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.auth.api.signin.internal.ISignInService");
    }

    public final void c1(v vVar, GoogleSignInOptions googleSignInOptions) {
        Parcel parcelG = g();
        e.c(parcelG, vVar);
        e.b(parcelG, googleSignInOptions);
        h(102, parcelG);
    }

    public final void d1(v vVar, GoogleSignInOptions googleSignInOptions) {
        Parcel parcelG = g();
        e.c(parcelG, vVar);
        e.b(parcelG, googleSignInOptions);
        h(103, parcelG);
    }

    public final void k(v vVar, GoogleSignInOptions googleSignInOptions) {
        Parcel parcelG = g();
        e.c(parcelG, vVar);
        e.b(parcelG, googleSignInOptions);
        h(101, parcelG);
    }
}
