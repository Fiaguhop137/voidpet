package p287q;

import android.os.Build;
import android.security.identity.IdentityCredential;
import android.text.TextUtils;
import android.util.Log;
import androidx.fragment.app.j;
import androidx.fragment.app.q;
import androidx.lifecycle.S;
import java.security.Signature;
import java.util.concurrent.Executor;
import javax.crypto.Cipher;
import javax.crypto.Mac;

/* JADX INFO: loaded from: classes.dex */
public class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private q f51052a;

    public static abstract class a {
        public void a(int i10, CharSequence charSequence) {
        }

        public void b() {
        }

        public void c(b bVar) {
        }
    }

    public static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final c f51053a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final int f51054b;

        b(c cVar, int i10) {
            this.f51053a = cVar;
            this.f51054b = i10;
        }

        public int a() {
            return this.f51054b;
        }

        public c b() {
            return this.f51053a;
        }
    }

    public static class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Signature f51055a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final Cipher f51056b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final Mac f51057c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final IdentityCredential f51058d;

        public c(IdentityCredential identityCredential) {
            this.f51055a = null;
            this.f51056b = null;
            this.f51057c = null;
            this.f51058d = identityCredential;
        }

        public c(Signature signature) {
            this.f51055a = signature;
            this.f51056b = null;
            this.f51057c = null;
            this.f51058d = null;
        }

        public c(Cipher cipher) {
            this.f51055a = null;
            this.f51056b = cipher;
            this.f51057c = null;
            this.f51058d = null;
        }

        public c(Mac mac) {
            this.f51055a = null;
            this.f51056b = null;
            this.f51057c = mac;
            this.f51058d = null;
        }

        public Cipher a() {
            return this.f51056b;
        }

        public IdentityCredential b() {
            return this.f51058d;
        }

        public Mac c() {
            return this.f51057c;
        }

        public Signature d() {
            return this.f51055a;
        }
    }

    public static class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final CharSequence f51059a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final CharSequence f51060b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final CharSequence f51061c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final CharSequence f51062d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final boolean f51063e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private final boolean f51064f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private final int f51065g;

        public static class a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private CharSequence f51066a = null;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private CharSequence f51067b = null;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            private CharSequence f51068c = null;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            private CharSequence f51069d = null;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            private boolean f51070e = true;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            private boolean f51071f = false;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            private int f51072g = 0;

            public d a() {
                if (TextUtils.isEmpty(this.f51066a)) {
                    throw new IllegalArgumentException("Title must be set and non-empty.");
                }
                if (!p287q.b.e(this.f51072g)) {
                    throw new IllegalArgumentException("Authenticator combination is unsupported on API " + Build.VERSION.SDK_INT + ": " + p287q.b.a(this.f51072g));
                }
                int i10 = this.f51072g;
                boolean zC = i10 != 0 ? p287q.b.c(i10) : this.f51071f;
                if (TextUtils.isEmpty(this.f51069d) && !zC) {
                    throw new IllegalArgumentException("Negative text must be set and non-empty.");
                }
                if (TextUtils.isEmpty(this.f51069d) || !zC) {
                    return new d(this.f51066a, this.f51067b, this.f51068c, this.f51069d, this.f51070e, this.f51071f, this.f51072g);
                }
                throw new IllegalArgumentException("Negative text must not be set if device credential authentication is allowed.");
            }

            public a b(CharSequence charSequence) {
                this.f51069d = charSequence;
                return this;
            }

            public a c(CharSequence charSequence) {
                this.f51066a = charSequence;
                return this;
            }
        }

        d(CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, CharSequence charSequence4, boolean z10, boolean z11, int i10) {
            this.f51059a = charSequence;
            this.f51060b = charSequence2;
            this.f51061c = charSequence3;
            this.f51062d = charSequence4;
            this.f51063e = z10;
            this.f51064f = z11;
            this.f51065g = i10;
        }

        public int a() {
            return this.f51065g;
        }

        public CharSequence b() {
            return this.f51061c;
        }

        public CharSequence c() {
            CharSequence charSequence = this.f51062d;
            return charSequence != null ? charSequence : "";
        }

        public CharSequence d() {
            return this.f51060b;
        }

        public CharSequence e() {
            return this.f51059a;
        }

        public boolean f() {
            return this.f51063e;
        }

        public boolean g() {
            return this.f51064f;
        }
    }

    public f(j jVar, Executor executor, a aVar) {
        if (jVar == null) {
            throw new IllegalArgumentException("FragmentActivity must not be null.");
        }
        if (executor == null) {
            throw new IllegalArgumentException("Executor must not be null.");
        }
        if (aVar == null) {
            throw new IllegalArgumentException("AuthenticationCallback must not be null.");
        }
        f(jVar.h0(), e(jVar), executor, aVar);
    }

    private void b(d dVar, c cVar) {
        q qVar = this.f51052a;
        if (qVar == null) {
            Log.e("BiometricPromptCompat", "Unable to start authentication. Client fragment manager was null.");
        } else if (qVar.O0()) {
            Log.e("BiometricPromptCompat", "Unable to start authentication. Called after onSaveInstanceState().");
        } else {
            d(this.f51052a).V1(dVar, cVar);
        }
    }

    private static p287q.d c(q qVar) {
        return (p287q.d) qVar.h0("androidx.biometric.BiometricFragment");
    }

    private static p287q.d d(q qVar) {
        p287q.d dVarC = c(qVar);
        if (dVarC != null) {
            return dVarC;
        }
        p287q.d dVarL2 = p287q.d.l2();
        qVar.m().e(dVarL2, "androidx.biometric.BiometricFragment").h();
        qVar.c0();
        return dVarL2;
    }

    private static g e(j jVar) {
        if (jVar != null) {
            return (g) new S(jVar).a(g.class);
        }
        return null;
    }

    private void f(q qVar, g gVar, Executor executor, a aVar) {
        this.f51052a = qVar;
        if (gVar != null) {
            if (executor != null) {
                gVar.O(executor);
            }
            gVar.N(aVar);
        }
    }

    public void a(d dVar, c cVar) {
        if (dVar == null) {
            throw new IllegalArgumentException("PromptInfo cannot be null.");
        }
        if (cVar == null) {
            throw new IllegalArgumentException("CryptoObject cannot be null.");
        }
        int iB = p287q.b.b(dVar, cVar);
        if (p287q.b.f(iB)) {
            throw new IllegalArgumentException("Crypto-based authentication is not supported for Class 2 (Weak) biometrics.");
        }
        if (Build.VERSION.SDK_INT < 30 && p287q.b.c(iB)) {
            throw new IllegalArgumentException("Crypto-based authentication is not supported for device credential prior to API 30.");
        }
        b(dVar, cVar);
    }
}
