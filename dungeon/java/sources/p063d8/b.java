package p063d8;

import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.api.Status;
import p135h8.k;

/* JADX INFO: loaded from: classes2.dex */
public class b implements k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Status f39874a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final GoogleSignInAccount f39875b;

    public b(GoogleSignInAccount googleSignInAccount, Status status) {
        this.f39875b = googleSignInAccount;
        this.f39874a = status;
    }

    public GoogleSignInAccount f() {
        return this.f39875b;
    }

    @Override // p135h8.k
    public Status t() {
        return this.f39874a;
    }
}
