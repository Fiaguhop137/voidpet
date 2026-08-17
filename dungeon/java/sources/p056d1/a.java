package p056d1;

import android.content.Context;
import android.hardware.fingerprint.FingerprintManager;
import android.os.CancellationSignal;
import android.os.Handler;
import java.security.Signature;
import javax.crypto.Cipher;
import javax.crypto.Mac;

/* JADX INFO: loaded from: classes.dex */
public class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f39625a;

    /* JADX INFO: renamed from: d1.a$a, reason: collision with other inner class name */
    class C0437a extends FingerprintManager.AuthenticationCallback {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ c f39626a;

        C0437a(c cVar) {
            this.f39626a = cVar;
        }

        @Override // android.hardware.fingerprint.FingerprintManager.AuthenticationCallback
        public void onAuthenticationError(int i10, CharSequence charSequence) {
            this.f39626a.a(i10, charSequence);
        }

        @Override // android.hardware.fingerprint.FingerprintManager.AuthenticationCallback
        public void onAuthenticationFailed() {
            this.f39626a.b();
        }

        @Override // android.hardware.fingerprint.FingerprintManager.AuthenticationCallback
        public void onAuthenticationHelp(int i10, CharSequence charSequence) {
            this.f39626a.c(i10, charSequence);
        }

        @Override // android.hardware.fingerprint.FingerprintManager.AuthenticationCallback
        public void onAuthenticationSucceeded(FingerprintManager.AuthenticationResult authenticationResult) {
            this.f39626a.d(new d(a.g(b.b(authenticationResult))));
        }
    }

    static class b {
        static void a(Object obj, Object obj2, CancellationSignal cancellationSignal, int i10, Object obj3, Handler handler) {
            ((FingerprintManager) obj).authenticate((FingerprintManager.CryptoObject) obj2, cancellationSignal, i10, (FingerprintManager.AuthenticationCallback) obj3, handler);
        }

        static FingerprintManager.CryptoObject b(Object obj) {
            return ((FingerprintManager.AuthenticationResult) obj).getCryptoObject();
        }

        public static FingerprintManager c(Context context) {
            if (context.getPackageManager().hasSystemFeature("android.hardware.fingerprint")) {
                return (FingerprintManager) context.getSystemService(FingerprintManager.class);
            }
            return null;
        }

        static boolean d(Object obj) {
            return ((FingerprintManager) obj).hasEnrolledFingerprints();
        }

        static boolean e(Object obj) {
            return ((FingerprintManager) obj).isHardwareDetected();
        }

        public static e f(Object obj) {
            FingerprintManager.CryptoObject cryptoObject = (FingerprintManager.CryptoObject) obj;
            if (cryptoObject == null) {
                return null;
            }
            if (cryptoObject.getCipher() != null) {
                return new e(cryptoObject.getCipher());
            }
            if (cryptoObject.getSignature() != null) {
                return new e(cryptoObject.getSignature());
            }
            if (cryptoObject.getMac() != null) {
                return new e(cryptoObject.getMac());
            }
            return null;
        }

        public static FingerprintManager.CryptoObject g(e eVar) {
            if (eVar == null) {
                return null;
            }
            if (eVar.a() != null) {
                return new FingerprintManager.CryptoObject(eVar.a());
            }
            if (eVar.c() != null) {
                return new FingerprintManager.CryptoObject(eVar.c());
            }
            if (eVar.b() != null) {
                return new FingerprintManager.CryptoObject(eVar.b());
            }
            return null;
        }
    }

    public static abstract class c {
        public abstract void a(int i10, CharSequence charSequence);

        public abstract void b();

        public abstract void c(int i10, CharSequence charSequence);

        public abstract void d(d dVar);
    }

    public static final class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final e f39627a;

        public d(e eVar) {
            this.f39627a = eVar;
        }

        public e a() {
            return this.f39627a;
        }
    }

    public static class e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Signature f39628a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final Cipher f39629b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final Mac f39630c;

        public e(Signature signature) {
            this.f39628a = signature;
            this.f39629b = null;
            this.f39630c = null;
        }

        public e(Cipher cipher) {
            this.f39629b = cipher;
            this.f39628a = null;
            this.f39630c = null;
        }

        public e(Mac mac) {
            this.f39630c = mac;
            this.f39629b = null;
            this.f39628a = null;
        }

        public Cipher a() {
            return this.f39629b;
        }

        public Mac b() {
            return this.f39630c;
        }

        public Signature c() {
            return this.f39628a;
        }
    }

    private a(Context context) {
        this.f39625a = context;
    }

    public static a c(Context context) {
        return new a(context);
    }

    private static FingerprintManager d(Context context) {
        return b.c(context);
    }

    static e g(FingerprintManager.CryptoObject cryptoObject) {
        return b.f(cryptoObject);
    }

    private static FingerprintManager.AuthenticationCallback h(c cVar) {
        return new C0437a(cVar);
    }

    private static FingerprintManager.CryptoObject i(e eVar) {
        return b.g(eVar);
    }

    public void a(e eVar, int i10, CancellationSignal cancellationSignal, c cVar, Handler handler) {
        FingerprintManager fingerprintManagerD = d(this.f39625a);
        if (fingerprintManagerD != null) {
            b.a(fingerprintManagerD, i(eVar), cancellationSignal, i10, h(cVar), handler);
        }
    }

    public void b(e eVar, int i10, p128h1.d dVar, c cVar, Handler handler) {
        a(eVar, i10, dVar != null ? (CancellationSignal) dVar.b() : null, cVar, handler);
    }

    public boolean e() {
        FingerprintManager fingerprintManagerD = d(this.f39625a);
        return fingerprintManagerD != null && b.d(fingerprintManagerD);
    }

    public boolean f() {
        FingerprintManager fingerprintManagerD = d(this.f39625a);
        return fingerprintManagerD != null && b.e(fingerprintManagerD);
    }
}
