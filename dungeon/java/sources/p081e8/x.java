package p081e8;

import android.content.Context;
import android.os.Binder;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.auth.api.signin.a;
import com.google.android.gms.auth.api.signin.b;
import com.google.android.gms.common.util.r;

/* JADX INFO: loaded from: classes2.dex */
public final class x extends s {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Context f40686e;

    public x(Context context) {
        this.f40686e = context;
    }

    private final void h() {
        if (r.a(this.f40686e, Binder.getCallingUid())) {
            return;
        }
        int callingUid = Binder.getCallingUid();
        StringBuilder sb2 = new StringBuilder(String.valueOf(callingUid).length() + 41);
        sb2.append("Calling UID ");
        sb2.append(callingUid);
        sb2.append(" is not Google Play services.");
        throw new SecurityException(sb2.toString());
    }

    @Override // p081e8.t
    public final void p() {
        h();
        Context context = this.f40686e;
        c cVarB = c.b(context);
        GoogleSignInAccount googleSignInAccountC = cVarB.c();
        GoogleSignInOptions googleSignInOptionsD = GoogleSignInOptions.f31614l;
        if (googleSignInAccountC != null) {
            googleSignInOptionsD = cVarB.d();
        }
        b bVarA = a.a(context, googleSignInOptionsD);
        if (googleSignInAccountC != null) {
            bVarA.x();
        } else {
            bVarA.y();
        }
    }

    @Override // p081e8.t
    public final void v() {
        h();
        r.a(this.f40686e).b();
    }
}
