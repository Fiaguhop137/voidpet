package Bg;

import java.security.AccessController;
import java.security.PrivilegedAction;
import java.security.Provider;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public class a extends Provider {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static String f1049a = "BouncyCastle Post-Quantum Security Provider v1.78.1";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static String f1050b = "BCPQC";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final Map f1051c = new HashMap();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final String[] f1052d = {"SPHINCS", "LMS", "NH", "XMSS", "SPHINCSPlus", "CMCE", "Frodo", "SABER", "Picnic", "NTRU", "Falcon", "Kyber", "Dilithium", "NTRUPrime", "BIKE", "HQC", "Rainbow"};

    /* JADX INFO: renamed from: Bg.a$a, reason: collision with other inner class name */
    class C0024a implements PrivilegedAction {
        C0024a() {
        }

        @Override // java.security.PrivilegedAction
        public Object run() {
            a.this.e();
            return null;
        }
    }

    static class b implements PrivilegedAction {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f1054a;

        b(String str) {
            this.f1054a = str;
        }

        @Override // java.security.PrivilegedAction
        public Object run() {
            try {
                return Class.forName(this.f1054a);
            } catch (Exception unused) {
                return null;
            }
        }
    }

    public a() {
        super(f1050b, 1.7801d, f1049a);
        AccessController.doPrivileged(new C0024a());
    }

    private void c(String str, String[] strArr) {
        for (int i10 = 0; i10 != strArr.length; i10++) {
            Class clsD = d(a.class, str + strArr[i10] + "$Mappings");
            if (clsD != null) {
                try {
                    android.support.v4.media.session.b.a(clsD.newInstance());
                    throw null;
                } catch (Exception e10) {
                    throw new InternalError("cannot create instance of " + str + strArr[i10] + "$Mappings : " + e10);
                }
            }
        }
    }

    static Class d(Class cls, String str) {
        try {
            ClassLoader classLoader = cls.getClassLoader();
            return classLoader != null ? classLoader.loadClass(str) : (Class) AccessController.doPrivileged(new b(str));
        } catch (ClassNotFoundException unused) {
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e() {
        c("org.bouncycastle.pqc.jcajce.provider.", f1052d);
    }
}
