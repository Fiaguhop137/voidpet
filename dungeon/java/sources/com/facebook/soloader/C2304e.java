package com.facebook.soloader;

import android.os.StrictMode;
import java.io.IOException;
import java.io.InputStream;
import java.util.HashSet;
import java.util.Set;

/* JADX INFO: renamed from: com.facebook.soloader.e, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public class C2304e extends E {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected final String f31356a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected q f31357b = null;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    protected Set f31358c = null;

    public C2304e(String str) {
        this.f31356a = str;
    }

    static String g(String str) {
        if ("base".equals(str)) {
            return SoLoader.f31336d.getApplicationInfo().sourceDir;
        }
        String[] strArr = SoLoader.f31336d.getApplicationInfo().splitSourceDirs;
        if (strArr == null) {
            throw new IllegalStateException("No splits avaiable");
        }
        String str2 = "split_" + str + ".apk";
        for (String str3 : strArr) {
            if (str3.endsWith(str2)) {
                return str3;
            }
        }
        throw new IllegalStateException("Could not find " + str + " split");
    }

    @Override // com.facebook.soloader.E
    public String c() {
        return "DirectSplitSoSource";
    }

    @Override // com.facebook.soloader.E
    public int d(String str, int i10, StrictMode.ThreadPolicy threadPolicy) {
        Set set = this.f31358c;
        if (set == null) {
            throw new IllegalStateException("prepare not called");
        }
        if (set.contains(str)) {
            return h(str, i10);
        }
        return 0;
    }

    @Override // com.facebook.soloader.E
    protected void e(int i10) throws IOException {
        InputStream inputStreamOpen = SoLoader.f31336d.getAssets().open(this.f31356a + ".soloader-manifest");
        try {
            this.f31357b = q.b(inputStreamOpen);
            if (inputStreamOpen != null) {
                inputStreamOpen.close();
            }
            this.f31358c = new HashSet(this.f31357b.f31386b);
        } catch (Throwable th) {
            if (inputStreamOpen != null) {
                try {
                    inputStreamOpen.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }

    public String f(String str) {
        Set set = this.f31358c;
        if (set == null || this.f31357b == null) {
            throw new IllegalStateException("prepare not called");
        }
        if (!set.contains(str)) {
            return null;
        }
        return g(this.f31356a) + "!/lib/" + this.f31357b.f31385a + "/" + str;
    }

    protected int h(String str, int i10) {
        String strF = f(str);
        strF.getClass();
        System.load(strF);
        return 1;
    }
}
