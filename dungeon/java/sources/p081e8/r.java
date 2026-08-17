package p081e8;

import android.content.Context;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;

/* JADX INFO: loaded from: classes2.dex */
public final class r {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static r f40682d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final c f40683a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    GoogleSignInAccount f40684b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    GoogleSignInOptions f40685c;

    private r(Context context) {
        c cVarB = c.b(context);
        this.f40683a = cVarB;
        this.f40684b = cVarB.c();
        this.f40685c = cVarB.d();
    }

    public static synchronized r a(Context context) {
        return f(context.getApplicationContext());
    }

    private static synchronized r f(Context context) {
        r rVar = f40682d;
        if (rVar != null) {
            return rVar;
        }
        r rVar2 = new r(context);
        f40682d = rVar2;
        return rVar2;
    }

    public final synchronized void b() {
        this.f40683a.a();
        this.f40684b = null;
        this.f40685c = null;
    }

    public final synchronized void c(GoogleSignInOptions googleSignInOptions, GoogleSignInAccount googleSignInAccount) {
        this.f40683a.f(googleSignInAccount, googleSignInOptions);
        this.f40684b = googleSignInAccount;
        this.f40685c = googleSignInOptions;
    }

    public final synchronized GoogleSignInAccount d() {
        return this.f40684b;
    }

    public final synchronized GoogleSignInOptions e() {
        return this.f40685c;
    }
}
