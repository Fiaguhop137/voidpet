package p287q;

import android.hardware.biometrics.BiometricPrompt;
import android.hardware.biometrics.BiometricPrompt$AuthenticationCallback;
import android.os.Build;
import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes.dex */
class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private BiometricPrompt$AuthenticationCallback f51019a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private d1.a.c f51020b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final d f51021c;

    /* JADX INFO: renamed from: q.a$a, reason: collision with other inner class name */
    class C0607a extends d1.a.c {
        C0607a() {
        }

        @Override // d1.a.c
        public void a(int i10, CharSequence charSequence) {
            a.this.f51021c.a(i10, charSequence);
        }

        @Override // d1.a.c
        public void b() {
            a.this.f51021c.b();
        }

        @Override // d1.a.c
        public void c(int i10, CharSequence charSequence) {
            a.this.f51021c.c(charSequence);
        }

        @Override // d1.a.c
        public void d(d1.a.d dVar) {
            a.this.f51021c.d(new f.b(dVar != null ? i.c(dVar.a()) : null, 2));
        }
    }

    private static class b {

        /* JADX INFO: renamed from: q.a$b$a, reason: collision with other inner class name */
        class C0608a extends BiometricPrompt$AuthenticationCallback {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ d f51023a;

            C0608a(d dVar) {
                this.f51023a = dVar;
            }

            public void onAuthenticationError(int i10, CharSequence charSequence) {
                this.f51023a.a(i10, charSequence);
            }

            public void onAuthenticationFailed() {
                this.f51023a.b();
            }

            public void onAuthenticationHelp(int i10, CharSequence charSequence) {
            }

            public void onAuthenticationSucceeded(BiometricPrompt.AuthenticationResult authenticationResult) {
                f.c cVarB = authenticationResult != null ? i.b(authenticationResult.getCryptoObject()) : null;
                int i10 = Build.VERSION.SDK_INT;
                int iA = -1;
                if (i10 >= 30) {
                    if (authenticationResult != null) {
                        iA = c.a(authenticationResult);
                    }
                } else if (i10 != 29) {
                    iA = 2;
                }
                this.f51023a.d(new f.b(cVarB, iA));
            }
        }

        @NonNull
        static BiometricPrompt$AuthenticationCallback a(@NonNull d dVar) {
            return new C0608a(dVar);
        }
    }

    private static class c {
        static int a(@NonNull BiometricPrompt.AuthenticationResult authenticationResult) {
            return authenticationResult.getAuthenticationType();
        }
    }

    static class d {
        d() {
        }

        abstract void a(int i10, CharSequence charSequence);

        abstract void b();

        abstract void c(CharSequence charSequence);

        abstract void d(f.b bVar);
    }

    a(d dVar) {
        this.f51021c = dVar;
    }

    BiometricPrompt$AuthenticationCallback a() {
        if (this.f51019a == null) {
            this.f51019a = b.a(this.f51021c);
        }
        return this.f51019a;
    }

    d1.a.c b() {
        if (this.f51020b == null) {
            this.f51020b = new C0607a();
        }
        return this.f51020b;
    }
}
