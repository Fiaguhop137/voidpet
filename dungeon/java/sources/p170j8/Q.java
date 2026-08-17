package p170j8;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import p188k8.a;
import p188k8.c;

/* JADX INFO: loaded from: classes2.dex */
public final class Q extends a {
    public static final Parcelable.Creator<Q> CREATOR = new S();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final int f46885a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Account f46886b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f46887c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final GoogleSignInAccount f46888d;

    Q(int i10, Account account, int i11, GoogleSignInAccount googleSignInAccount) {
        this.f46885a = i10;
        this.f46886b = account;
        this.f46887c = i11;
        this.f46888d = googleSignInAccount;
    }

    public Q(Account account, int i10, GoogleSignInAccount googleSignInAccount) {
        this(2, account, i10, googleSignInAccount);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int i11 = this.f46885a;
        int iA = c.a(parcel);
        c.n(parcel, 1, i11);
        c.t(parcel, 2, this.f46886b, i10, false);
        c.n(parcel, 3, this.f46887c);
        c.t(parcel, 4, this.f46888d, i10, false);
        c.b(parcel, iA);
    }
}
