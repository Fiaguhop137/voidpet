package com.google.android.gms.common;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.content.pm.SigningInfo;
import android.os.Build;
import android.os.RemoteException;
import android.os.StrictMode;
import android.util.Log;
import com.google.android.gms.dynamite.DynamiteModule;
import java.util.Arrays;

/* JADX INFO: renamed from: com.google.android.gms.common.p, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public class C2347p {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static C2347p f31920c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f31921a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private volatile String f31922b;

    public C2347p(Context context) {
        this.f31921a = context.getApplicationContext();
    }

    public static C2347p a(Context context) {
        p170j8.r.l(context);
        synchronized (C2347p.class) {
            try {
                if (f31920c == null) {
                    J.a(context);
                    f31920c = new C2347p(context);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return f31920c;
    }

    /* JADX WARN: Multi-variable type inference failed */
    static final boolean d(PackageInfo packageInfo, boolean z10) {
        K8.i iVarJ;
        if (packageInfo == null) {
            return false;
        }
        if (z10 && ("com.android.vending".equals(packageInfo.packageName) || "com.google.android.gms".equals(packageInfo.packageName))) {
            ApplicationInfo applicationInfo = packageInfo.applicationInfo;
            z10 = (applicationInfo == null || (applicationInfo.flags & 129) == 0) ? false : true;
        }
        try {
            K8.i iVar = z10 ? I.f31670c : I.f31669b;
            int i10 = com.google.android.gms.common.util.a.f31935b;
            int i11 = Build.VERSION.SDK_INT;
            if (i11 < 28) {
                Signature[] signatureArr = packageInfo.signatures;
                byte[] byteArray = null;
                if (signatureArr != null && signatureArr.length == 1) {
                    byteArray = signatureArr[0].toByteArray();
                }
                iVarJ = byteArray != null ? K8.i.k(byteArray) : K8.i.j();
            } else {
                K8.t.a(i11 >= 28);
                SigningInfo signingInfo = packageInfo.signingInfo;
                if (signingInfo == null || signingInfo.hasMultipleSigners() || signingInfo.getSigningCertificateHistory() == null) {
                    iVarJ = K8.i.j();
                } else {
                    int i12 = K8.i.f6051c;
                    K8.e eVar = new K8.e();
                    for (Signature signature : signingInfo.getSigningCertificateHistory()) {
                        eVar.b(signature.toByteArray());
                    }
                    iVarJ = eVar.c();
                }
            }
            if (iVarJ.isEmpty()) {
                throw new IllegalArgumentException("Unable to obtain package certificate history.");
            }
            K8.i iVarH = iVarJ.h();
            int size = iVarH.size();
            int i13 = 0;
            while (i13 < size) {
                byte[] bArr = (byte[]) iVarH.get(i13);
                K8.m mVarListIterator = iVar.listIterator(0);
                do {
                    int i14 = i13 + 1;
                    if (!mVarListIterator.hasNext()) {
                        i13 = i14;
                    }
                } while (!Arrays.equals(bArr, (byte[]) mVarListIterator.next()));
                return true;
            }
            return false;
        } catch (IllegalArgumentException unused) {
            Log.i("GoogleSignatureVerifier", "package info is not set correctly");
            return (z10 ? f(packageInfo, I.f31668a) : f(packageInfo, I.f31668a[0])) != null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v4, types: [android.os.StrictMode$ThreadPolicy] */
    /* JADX WARN: Type inference failed for: r8v6, types: [int] */
    private final U e(String str, boolean z10, boolean z11) {
        U uC;
        ApplicationInfo applicationInfo;
        if (str == null) {
            return U.c("null pkg");
        }
        if (str.equals(this.f31922b)) {
            return U.b();
        }
        H h10 = J.f31671a;
        StrictMode.ThreadPolicy threadPolicyAllowThreadDiskReads = StrictMode.allowThreadDiskReads();
        try {
            try {
                J.b();
                boolean zD = J.f31677g.d();
                StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskReads);
                if (zD) {
                    Q q10 = new Q(null);
                    q10.a(str);
                    q10.b(AbstractC2346o.f(this.f31921a));
                    q10.c(true);
                    uC = J.c(q10.d());
                } else {
                    threadPolicyAllowThreadDiskReads = Build.VERSION.SDK_INT;
                    try {
                        PackageInfo packageInfo = this.f31921a.getPackageManager().getPackageInfo(str, threadPolicyAllowThreadDiskReads >= 28 ? 134217792 : 64);
                        boolean zF = AbstractC2346o.f(this.f31921a);
                        if (packageInfo == null) {
                            uC = U.c("null pkg");
                        } else {
                            Signature[] signatureArr = packageInfo.signatures;
                            if (signatureArr == null || signatureArr.length != 1) {
                                uC = U.c("single cert required");
                            } else {
                                F f10 = new F(packageInfo.signatures[0].toByteArray());
                                String str2 = packageInfo.packageName;
                                U uD = J.d(str2, f10, zF, false);
                                uC = (!uD.f31704a || (applicationInfo = packageInfo.applicationInfo) == null || (applicationInfo.flags & 2) == 0 || !J.d(str2, f10, false, true).f31704a) ? uD : U.c("debuggable release cert app rejected");
                            }
                        }
                    } catch (PackageManager.NameNotFoundException e10) {
                        return U.d("no pkg ".concat(str), e10);
                    }
                }
            } catch (Throwable th) {
                StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskReads);
                throw th;
            }
        } catch (RemoteException | DynamiteModule.a e11) {
            Log.e("GoogleCertificates", "Failed to get Google certificates from remote", e11);
            StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskReads);
        }
        if (uC.f31704a) {
            this.f31922b = str;
        }
        return uC;
    }

    private static E f(PackageInfo packageInfo, E... eArr) {
        Signature[] signatureArr = packageInfo.signatures;
        if (signatureArr != null) {
            if (signatureArr.length != 1) {
                Log.w("GoogleSignatureVerifier", "Package has more than one signature.");
                return null;
            }
            F f10 = new F(packageInfo.signatures[0].toByteArray());
            for (int i10 = 0; i10 < eArr.length; i10++) {
                if (eArr[i10].equals(f10)) {
                    return eArr[i10];
                }
            }
        }
        return null;
    }

    public boolean b(PackageInfo packageInfo) {
        if (packageInfo == null) {
            return false;
        }
        if (d(packageInfo, false)) {
            return true;
        }
        if (d(packageInfo, true)) {
            if (AbstractC2346o.f(this.f31921a)) {
                return true;
            }
            Log.w("GoogleSignatureVerifier", "Test-keys aren't accepted on this build.");
        }
        return false;
    }

    public boolean c(int i10) {
        U uC;
        String[] packagesForUid = this.f31921a.getPackageManager().getPackagesForUid(i10);
        if (packagesForUid == null || (packagesForUid.length) == 0) {
            uC = U.c("no pkgs");
        } else {
            uC = null;
            for (String str : packagesForUid) {
                uC = e(str, false, false);
                if (!uC.f31704a) {
                }
            }
            p170j8.r.l(uC);
        }
        uC.e();
        return uC.f31704a;
    }
}
