package com.facebook.soloader;

import android.os.StrictMode;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/* JADX INFO: loaded from: classes2.dex */
public abstract class t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final int f31387a = 3;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final int f31388b = 3;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static volatile boolean f31390d = false;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static byte[] f31391e = null;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static List f31392f = null;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static Map f31393g = null;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static volatile boolean f31394h = false;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final int f31389c = 3 + 3;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final ReentrantReadWriteLock f31395i = new ReentrantReadWriteLock();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final HashSet f31396j = new a();

    class a extends HashSet {
        a() {
            add("libEGL.so");
            add("libGLESv2.so");
            add("libGLESv3.so");
            add("libOpenSLES.so");
            add("libandroid.so");
            add("libc.so");
            add("libdl.so");
            add("libjnigraphics.so");
            add("liblog.so");
            add("libm.so");
            add("libstdc++.so");
            add("libz.so");
        }
    }

    private static String[] a(String str) {
        if (f31390d) {
            return i(str);
        }
        if (!f31394h) {
            return null;
        }
        f31395i.readLock().lock();
        try {
            return i(str);
        } finally {
            f31395i.readLock().unlock();
        }
    }

    public static String[] b(String str, h hVar) {
        boolean z10 = SoLoader.f31333a;
        if (z10) {
            Api18TraceUtils.a("soloader.NativeDeps.getDependencies[", str, "]");
        }
        p259o7.b.b();
        try {
            try {
                try {
                    String[] strArrA = a(str);
                    if (strArrA != null) {
                        p259o7.b.a(null);
                        if (z10) {
                            Api18TraceUtils.b();
                        }
                        return strArrA;
                    }
                    String[] strArrA2 = s.a(hVar);
                    p259o7.b.a(null);
                    if (z10) {
                        Api18TraceUtils.b();
                    }
                    return strArrA2;
                } catch (Error | RuntimeException e10) {
                    throw e10;
                }
            } catch (s.a e11) {
                throw D.b(str, e11);
            }
        } catch (Throwable th) {
            p259o7.b.a(null);
            if (SoLoader.f31333a) {
                Api18TraceUtils.b();
            }
            throw th;
        }
    }

    private static String[] c(int i10, int i11) {
        byte b10;
        ArrayList arrayList = new ArrayList();
        int i12 = (i10 + i11) - f31389c;
        int i13 = 0;
        boolean z10 = false;
        while (true) {
            byte[] bArr = f31391e;
            if (i12 >= bArr.length || (b10 = bArr[i12]) == 10) {
                break;
            }
            if (b10 == 32) {
                if (z10) {
                    String strD = d(i13);
                    if (strD == null) {
                        return null;
                    }
                    arrayList.add(strD);
                    i13 = 0;
                    z10 = false;
                } else {
                    continue;
                }
            } else {
                if (b10 < 48 || b10 > 57) {
                    return null;
                }
                i13 = (i13 * 10) + (b10 - 48);
                z10 = true;
            }
            i12++;
        }
        if (z10) {
            String strD2 = d(i13);
            if (strD2 == null) {
                return null;
            }
            arrayList.add(strD2);
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        return (String[]) arrayList.toArray(new String[arrayList.size()]);
    }

    private static String d(int i10) {
        if (i10 >= f31392f.size()) {
            return null;
        }
        int iIntValue = ((Integer) f31392f.get(i10)).intValue();
        int i11 = iIntValue;
        while (true) {
            byte[] bArr = f31391e;
            if (i11 >= bArr.length || bArr[i11] <= 32) {
                break;
            }
            i11++;
        }
        int i12 = (i11 - iIntValue) + f31389c;
        char[] cArr = new char[i12];
        cArr[0] = 'l';
        cArr[1] = 'i';
        cArr[2] = 'b';
        for (int i13 = 0; i13 < i12 - f31389c; i13++) {
            cArr[f31387a + i13] = (char) f31391e[iIntValue + i13];
        }
        cArr[i12 - 3] = '.';
        cArr[i12 - 2] = 's';
        cArr[i12 - 1] = 'o';
        return new String(cArr);
    }

    private static int e(String str) {
        List list = (List) f31393g.get(Integer.valueOf(f(str)));
        if (list == null) {
            return -1;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            int iIntValue = ((Integer) it.next()).intValue();
            if (g(str, iIntValue)) {
                return iIntValue;
            }
        }
        return -1;
    }

    private static int f(String str) {
        int iCodePointAt = 5381;
        for (int i10 = f31387a; i10 < str.length() - f31388b; i10++) {
            iCodePointAt = str.codePointAt(i10) + (iCodePointAt << 5) + iCodePointAt;
        }
        return iCodePointAt;
    }

    private static boolean g(String str, int i10) {
        int i11;
        int i12 = f31387a;
        while (true) {
            int length = str.length();
            i11 = f31388b;
            if (i12 >= length - i11 || i10 >= f31391e.length || (str.codePointAt(i12) & 255) != f31391e[i10]) {
                break;
            }
            i12++;
            i10++;
        }
        return i12 == str.length() - i11;
    }

    public static void h(String str, h hVar, int i10, StrictMode.ThreadPolicy threadPolicy) {
        String[] strArrB = b(str, hVar);
        p.a("SoLoader", "Loading " + str + "'s dependencies: " + Arrays.toString(strArrB));
        for (String str2 : strArrB) {
            if (!str2.startsWith("/") && !f31396j.contains(str2)) {
                SoLoader.s(str2, i10, threadPolicy);
            }
        }
    }

    static String[] i(String str) {
        int iE;
        if (f31390d && str.length() > f31389c && (iE = e(str)) != -1) {
            return c(iE, str.length());
        }
        return null;
    }
}
