package p287q;

import android.content.Context;
import android.hardware.biometrics.BiometricManager;
import android.hardware.biometrics.BiometricPrompt;
import android.os.Build;
import android.util.Log;
import androidx.annotation.NonNull;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes.dex */
public class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final d f51048a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final BiometricManager f51049b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final p056d1.a f51050c;

    private static class a {
        static int a(@NonNull BiometricManager biometricManager) {
            return biometricManager.canAuthenticate();
        }

        static BiometricManager b(@NonNull Context context) {
            return (BiometricManager) context.getSystemService(BiometricManager.class);
        }

        static Method c() {
            try {
                return BiometricManager.class.getMethod("canAuthenticate", BiometricPrompt.CryptoObject.class);
            } catch (NoSuchMethodException unused) {
                return null;
            }
        }
    }

    private static class b {
        static int a(@NonNull BiometricManager biometricManager, int i10) {
            return biometricManager.canAuthenticate(i10);
        }
    }

    private static class c implements d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Context f51051a;

        c(Context context) {
            this.f51051a = context.getApplicationContext();
        }

        @Override // q.e.d
        public boolean a() {
            return m.a(this.f51051a) != null;
        }

        @Override // q.e.d
        public boolean b() {
            return m.b(this.f51051a);
        }

        @Override // q.e.d
        public boolean c() {
            return j.a(this.f51051a, Build.MODEL);
        }

        @Override // q.e.d
        public p056d1.a d() {
            return p056d1.a.c(this.f51051a);
        }

        @Override // q.e.d
        public BiometricManager e() {
            return a.b(this.f51051a);
        }

        @Override // q.e.d
        public boolean f() {
            return n.a(this.f51051a);
        }
    }

    interface d {
        boolean a();

        boolean b();

        boolean c();

        p056d1.a d();

        BiometricManager e();

        boolean f();
    }

    e(d dVar) {
        this.f51048a = dVar;
        int i10 = Build.VERSION.SDK_INT;
        this.f51049b = i10 >= 29 ? dVar.e() : null;
        this.f51050c = i10 <= 29 ? dVar.d() : null;
    }

    private int b(int i10) {
        if (!p287q.b.e(i10)) {
            return -2;
        }
        if (i10 == 0 || !this.f51048a.a()) {
            return 12;
        }
        if (p287q.b.c(i10)) {
            return this.f51048a.b() ? 0 : 11;
        }
        int i11 = Build.VERSION.SDK_INT;
        if (i11 == 29) {
            return p287q.b.f(i10) ? f() : e();
        }
        if (i11 != 28) {
            return c();
        }
        if (this.f51048a.f()) {
            return d();
        }
        return 12;
    }

    private int c() {
        p056d1.a aVar = this.f51050c;
        if (aVar == null) {
            Log.e("BiometricManager", "Failure in canAuthenticate(). FingerprintManager was null.");
            return 1;
        }
        if (aVar.f()) {
            return !this.f51050c.e() ? 11 : 0;
        }
        return 12;
    }

    private int d() {
        if (this.f51048a.b()) {
            return c() == 0 ? 0 : -1;
        }
        return c();
    }

    private int e() {
        BiometricPrompt.CryptoObject cryptoObjectD;
        Method methodC = a.c();
        if (methodC != null && (cryptoObjectD = i.d(i.a())) != null) {
            try {
                Object objInvoke = methodC.invoke(this.f51049b, cryptoObjectD);
                if (objInvoke instanceof Integer) {
                    return ((Integer) objInvoke).intValue();
                }
                Log.w("BiometricManager", "Invalid return type for canAuthenticate(CryptoObject).");
            } catch (IllegalAccessException e10) {
                e = e10;
                Log.w("BiometricManager", "Failed to invoke canAuthenticate(CryptoObject).", e);
            } catch (IllegalArgumentException e11) {
                e = e11;
                Log.w("BiometricManager", "Failed to invoke canAuthenticate(CryptoObject).", e);
            } catch (InvocationTargetException e12) {
                e = e12;
                Log.w("BiometricManager", "Failed to invoke canAuthenticate(CryptoObject).", e);
            }
        }
        int iF = f();
        return (this.f51048a.c() || iF != 0) ? iF : d();
    }

    private int f() {
        BiometricManager biometricManager = this.f51049b;
        if (biometricManager != null) {
            return a.a(biometricManager);
        }
        Log.e("BiometricManager", "Failure in canAuthenticate(). BiometricManager was null.");
        return 1;
    }

    public static e g(Context context) {
        return new e(new c(context));
    }

    public int a(int i10) {
        if (Build.VERSION.SDK_INT < 30) {
            return b(i10);
        }
        BiometricManager biometricManager = this.f51049b;
        if (biometricManager != null) {
            return b.a(biometricManager, i10);
        }
        Log.e("BiometricManager", "Failure in canAuthenticate(). BiometricManager was null.");
        return 1;
    }
}
