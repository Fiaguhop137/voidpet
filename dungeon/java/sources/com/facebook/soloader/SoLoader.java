package com.facebook.soloader;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.os.Bundle;
import android.os.StrictMode;
import android.text.TextUtils;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/* JADX INFO: loaded from: classes2.dex */
public class SoLoader {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    static x f31334b;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static int f31345m;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final ReentrantReadWriteLock f31335c = new ReentrantReadWriteLock();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    static Context f31336d = null;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static volatile E[] f31337e = null;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final AtomicInteger f31338f = new AtomicInteger(0);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static p277p7.i f31339g = null;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final Set f31340h = Collections.newSetFromMap(new ConcurrentHashMap());

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final Map f31341i = new HashMap();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final Set f31342j = Collections.newSetFromMap(new ConcurrentHashMap());

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static final Map f31343k = new HashMap();

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static boolean f31344l = true;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static int f31346n = 0;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private static l f31347o = null;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    static final boolean f31333a = true;

    public static final class a extends UnsatisfiedLinkError {
        a(Throwable th, String str) {
            super("APK was built for a different platform. Supported ABIs: " + Arrays.toString(SysUtil.j()) + " error: " + str);
            initCause(th);
        }
    }

    private static int A() {
        f31335c.writeLock().lock();
        try {
            int i10 = f31345m;
            int i11 = (i10 & 2) != 0 ? 1 : 0;
            if ((i10 & 256) != 0) {
                i11 |= 4;
            }
            if ((i10 & 128) == 0) {
                i11 |= 8;
            }
            return i11;
        } finally {
            f31335c.writeLock().unlock();
        }
    }

    private static int B(int i10) {
        return (i10 & 2048) != 0 ? 1 : 0;
    }

    private static p277p7.h C(String str, UnsatisfiedLinkError unsatisfiedLinkError, p277p7.h hVar) {
        p.g("SoLoader", "Running a recovery step for " + str + " due to " + unsatisfiedLinkError.toString());
        ReentrantReadWriteLock reentrantReadWriteLock = f31335c;
        reentrantReadWriteLock.writeLock().lock();
        try {
            if (hVar == null) {
                try {
                    hVar = j();
                    if (hVar == null) {
                        p.g("SoLoader", "No recovery strategy");
                        throw unsatisfiedLinkError;
                    }
                } catch (v e10) {
                    p.c("SoLoader", "Base APK not found during recovery", e10);
                    throw e10;
                } catch (Exception e11) {
                    p.c("SoLoader", "Got an exception during recovery, will throw the initial error instead", e11);
                    throw unsatisfiedLinkError;
                }
            }
            if (D(unsatisfiedLinkError, hVar)) {
                f31338f.getAndIncrement();
                reentrantReadWriteLock.writeLock().unlock();
                return hVar;
            }
            reentrantReadWriteLock.writeLock().unlock();
            p.g("SoLoader", "Failed to recover");
            throw unsatisfiedLinkError;
        } catch (Throwable th) {
            f31335c.writeLock().unlock();
            throw th;
        }
    }

    private static boolean D(UnsatisfiedLinkError unsatisfiedLinkError, p277p7.h hVar) {
        p259o7.b.h(hVar);
        try {
            boolean zA = hVar.a(unsatisfiedLinkError, f31337e);
            p259o7.b.g(null);
            return zA;
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                p259o7.b.g(th);
                throw th2;
            }
        }
    }

    private static void a(ArrayList arrayList, int i10) {
        C2300a c2300a = new C2300a(f31336d, i10);
        p.a("SoLoader", "Adding application source: " + c2300a.toString());
        arrayList.add(0, c2300a);
    }

    private static void b(Context context, ArrayList arrayList, boolean z10) {
        if ((f31345m & 8) != 0) {
            return;
        }
        arrayList.add(0, new C2302c(context, "lib-main", !z10));
    }

    private static void c(Context context, ArrayList arrayList) {
        C2303d c2303d = new C2303d(context);
        p.a("SoLoader", "validating/adding directApk source: " + c2303d.toString());
        if (c2303d.o()) {
            arrayList.add(0, c2303d);
        }
    }

    private static void d(ArrayList arrayList) {
        String str = SysUtil.k() ? "/system/lib64:/vendor/lib64" : "/system/lib:/vendor/lib";
        String str2 = System.getenv("LD_LIBRARY_PATH");
        if (str2 != null && !str2.equals("")) {
            str = str2 + ":" + str;
        }
        for (String str3 : new HashSet(Arrays.asList(str.split(":")))) {
            p.a("SoLoader", "adding system library source: " + str3);
            arrayList.add(new C2305f(new File(str3), 2));
        }
    }

    private static void e(Context context, ArrayList arrayList) {
        F f10 = new F();
        p.a("SoLoader", "adding systemLoadWrapper source: " + f10);
        arrayList.add(0, f10);
    }

    private static void f() {
        if (!r()) {
            throw new IllegalStateException("SoLoader.init() not yet called");
        }
    }

    private static void g(String str, String str2, int i10, StrictMode.ThreadPolicy threadPolicy) {
        boolean z10;
        ReentrantReadWriteLock reentrantReadWriteLock = f31335c;
        reentrantReadWriteLock.readLock().lock();
        try {
            if (f31337e == null) {
                p.b("SoLoader", "Could not load: " + str + " because SoLoader is not initialized");
                throw new UnsatisfiedLinkError("SoLoader not initialized, couldn't find DSO to load: " + str);
            }
            reentrantReadWriteLock.readLock().unlock();
            if (threadPolicy == null) {
                threadPolicy = StrictMode.allowThreadDiskReads();
                z10 = true;
            } else {
                z10 = false;
            }
            if (f31333a) {
                if (str2 != null) {
                    Api18TraceUtils.a("SoLoader.loadLibrary[", str2, "]");
                }
                Api18TraceUtils.a("SoLoader.loadLibrary[", str, "]");
            }
            try {
                reentrantReadWriteLock.readLock().lock();
                try {
                    try {
                        for (E e10 : f31337e) {
                            if (x(e10, str, i10, threadPolicy)) {
                                f31335c.readLock().unlock();
                                if (f31333a) {
                                    if (str2 != null) {
                                        Api18TraceUtils.b();
                                    }
                                    Api18TraceUtils.b();
                                }
                                if (z10) {
                                    StrictMode.setThreadPolicy(threadPolicy);
                                    return;
                                }
                                return;
                            }
                        }
                        throw B.b(str, f31336d, f31337e);
                    } catch (IOException e11) {
                        C c10 = new C(str, e11.toString());
                        c10.initCause(e11);
                        throw c10;
                    }
                } catch (Throwable th) {
                    f31335c.readLock().unlock();
                    throw th;
                }
            } catch (Throwable th2) {
                if (f31333a) {
                    if (str2 != null) {
                        Api18TraceUtils.b();
                    }
                    Api18TraceUtils.b();
                }
                if (z10) {
                    StrictMode.setThreadPolicy(threadPolicy);
                }
                throw th2;
            }
        } catch (Throwable th3) {
            f31335c.readLock().unlock();
            throw th3;
        }
    }

    private static int h(Context context) {
        int i10 = f31346n;
        if (i10 != 0) {
            return i10;
        }
        int i11 = 1;
        if (context == null) {
            p.a("SoLoader", "context is null, fallback to THIRD_PARTY_APP appType");
            return 1;
        }
        ApplicationInfo applicationInfo = context.getApplicationInfo();
        int i12 = applicationInfo.flags;
        if ((i12 & 1) != 0) {
            i11 = (i12 & 128) != 0 ? 3 : 2;
        }
        p.a("SoLoader", "ApplicationInfo.flags is: " + applicationInfo.flags + " appType is: " + i11);
        return i11;
    }

    private static int i() {
        int i10 = f31346n;
        if (i10 == 1) {
            return 0;
        }
        if (i10 == 2 || i10 == 3) {
            return 1;
        }
        throw new RuntimeException("Unsupported app type, we should not reach here");
    }

    public static void init(Context context, int i10) throws IOException {
        k(context, i10, null);
    }

    private static synchronized p277p7.h j() {
        p277p7.i iVar;
        iVar = f31339g;
        return iVar == null ? null : iVar.get();
    }

    public static void k(Context context, int i10, x xVar) {
        if (r()) {
            p.g("SoLoader", "SoLoader already initialized");
            return;
        }
        p.g("SoLoader", "Initializing SoLoader: " + i10);
        StrictMode.ThreadPolicy threadPolicyAllowThreadDiskWrites = StrictMode.allowThreadDiskWrites();
        try {
            boolean zO = o(context);
            f31344l = zO;
            if (zO) {
                int iH = h(context);
                f31346n = iH;
                if ((i10 & 128) == 0 && SysUtil.l(context, iH)) {
                    i10 |= 8;
                }
                p(context, xVar, i10);
                q(context, i10);
                p.f("SoLoader", "Init SoLoader delegate");
                p241n7.a.b(new u());
            } else {
                n();
                p.f("SoLoader", "Init System Loader delegate");
                p241n7.a.b(new p241n7.c());
            }
            p.g("SoLoader", "SoLoader initialized: " + i10);
        } finally {
            StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskWrites);
        }
    }

    public static void l(Context context, l lVar) throws IOException {
        synchronized (SoLoader.class) {
            f31347o = lVar;
        }
        init(context, 0);
    }

    public static void m(Context context, boolean z10) {
        try {
            k(context, z10 ? 1 : 0, null);
        } catch (IOException e10) {
            throw new RuntimeException(e10);
        }
    }

    private static void n() {
        if (f31337e != null) {
            return;
        }
        f31335c.writeLock().lock();
        try {
            if (f31337e == null) {
                f31337e = new E[0];
            }
        } finally {
            f31335c.writeLock().unlock();
        }
    }

    private static boolean o(Context context) {
        String packageName;
        if (f31347o != null) {
            return true;
        }
        Bundle bundle = null;
        try {
            packageName = context.getPackageName();
            try {
                bundle = context.getPackageManager().getApplicationInfo(packageName, 128).metaData;
            } catch (Exception e10) {
                e = e10;
                p.h("SoLoader", "Unexpected issue with package manager (" + packageName + ")", e);
            }
        } catch (Exception e11) {
            e = e11;
            packageName = null;
        }
        return bundle == null || bundle.getBoolean("com.facebook.soloader.enabled", true);
    }

    private static synchronized void p(Context context, x xVar, int i10) {
        if (context != null) {
            try {
                Context applicationContext = context.getApplicationContext();
                if (applicationContext == null) {
                    p.g("SoLoader", "context.getApplicationContext returned null, holding reference to original context.ApplicationSoSource fallbacks to: " + context.getApplicationInfo().nativeLibraryDir);
                } else {
                    context = applicationContext;
                }
                f31336d = context;
                f31339g = new p277p7.f(context, B(i10));
            } catch (Throwable th) {
                throw th;
            }
        }
        if (xVar != null || f31334b == null) {
            if (xVar != null) {
                f31334b = xVar;
            } else {
                f31334b = new o(new y());
            }
        }
    }

    private static void q(Context context, int i10) {
        ReentrantReadWriteLock.WriteLock writeLock;
        if (f31337e != null) {
            return;
        }
        ReentrantReadWriteLock reentrantReadWriteLock = f31335c;
        reentrantReadWriteLock.writeLock().lock();
        try {
            if (f31337e != null) {
                writeLock = reentrantReadWriteLock.writeLock();
            } else {
                f31345m = i10;
                ArrayList arrayList = new ArrayList();
                boolean z10 = true;
                boolean z11 = (i10 & 512) != 0;
                boolean z12 = (i10 & 1024) != 0;
                if (z11) {
                    e(context, arrayList);
                } else if (z12) {
                    d(arrayList);
                    arrayList.add(0, new C2304e("base"));
                } else {
                    d(arrayList);
                    if (context != null) {
                        if ((i10 & 1) != 0) {
                            a(arrayList, i());
                            p.a("SoLoader", "Adding exo package source: lib-main");
                            arrayList.add(0, new k(context, "lib-main"));
                        } else {
                            if (SysUtil.l(context, f31346n)) {
                                c(context, arrayList);
                            }
                            a(arrayList, i());
                            if ((i10 & 4096) == 0) {
                                z10 = false;
                            }
                            b(context, arrayList, z10);
                        }
                    }
                }
                E[] eArr = (E[]) arrayList.toArray(new E[arrayList.size()]);
                int iA = A();
                int length = eArr.length;
                while (true) {
                    int i11 = length - 1;
                    if (length <= 0) {
                        break;
                    }
                    p.d("SoLoader", "Preparing SO source: " + eArr[i11]);
                    boolean z13 = f31333a;
                    if (z13) {
                        Api18TraceUtils.a("SoLoader", "_", eArr[i11].getClass().getSimpleName());
                    }
                    eArr[i11].e(iA);
                    if (z13) {
                        Api18TraceUtils.b();
                    }
                    length = i11;
                }
                f31337e = eArr;
                f31338f.getAndIncrement();
                p.d("SoLoader", "init finish: " + f31337e.length + " SO sources prepared");
                writeLock = f31335c.writeLock();
            }
            writeLock.unlock();
        } catch (Throwable th) {
            f31335c.writeLock().unlock();
            throw th;
        }
    }

    public static boolean r() {
        if (f31337e != null) {
            return true;
        }
        f31335c.readLock().lock();
        try {
            return f31337e != null;
        } finally {
            f31335c.readLock().unlock();
        }
    }

    static void s(String str, int i10, StrictMode.ThreadPolicy threadPolicy) {
        p259o7.b.d(str, i10);
        try {
            p259o7.b.c(null, w(str, null, null, i10 | 1, threadPolicy));
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                p259o7.b.c(th, false);
                throw th2;
            }
        }
    }

    public static boolean t(String str) {
        return f31344l ? u(str, 0) : p241n7.a.d(str);
    }

    public static boolean u(String str, int i10) {
        Boolean boolZ = z(str);
        if (boolZ != null) {
            return boolZ.booleanValue();
        }
        if (!f31344l) {
            return p241n7.a.d(str);
        }
        if (f31346n != 2) {
        }
        return y(str, i10);
    }

    private static boolean v(String str, String str2, String str3, int i10, StrictMode.ThreadPolicy threadPolicy) {
        p277p7.h hVarC = null;
        while (true) {
            try {
                return w(str, str2, str3, i10, threadPolicy);
            } catch (UnsatisfiedLinkError e10) {
                hVarC = C(str, e10, hVarC);
            }
        }
    }

    private static boolean w(String str, String str2, String str3, int i10, StrictMode.ThreadPolicy threadPolicy) {
        boolean z10;
        Object obj;
        Object obj2;
        if (!TextUtils.isEmpty(str2) && f31342j.contains(str2)) {
            return false;
        }
        Set set = f31340h;
        if (set.contains(str) && str3 == null) {
            return false;
        }
        synchronized (SoLoader.class) {
            try {
                if (!set.contains(str)) {
                    z10 = false;
                } else {
                    if (str3 == null) {
                        return false;
                    }
                    z10 = true;
                }
                Map map = f31341i;
                if (map.containsKey(str)) {
                    obj = map.get(str);
                } else {
                    Object obj3 = new Object();
                    map.put(str, obj3);
                    obj = obj3;
                }
                Map map2 = f31343k;
                if (map2.containsKey(str2)) {
                    obj2 = map2.get(str2);
                } else {
                    Object obj4 = new Object();
                    map2.put(str2, obj4);
                    obj2 = obj4;
                }
                ReentrantReadWriteLock reentrantReadWriteLock = f31335c;
                reentrantReadWriteLock.readLock().lock();
                try {
                    synchronized (obj) {
                        if (!z10) {
                            if (set.contains(str)) {
                                if (str3 == null) {
                                    reentrantReadWriteLock.readLock().unlock();
                                    return false;
                                }
                                z10 = true;
                            }
                            if (!z10) {
                                try {
                                    p.a("SoLoader", "About to load: " + str);
                                    g(str, str2, i10, threadPolicy);
                                    p.a("SoLoader", "Loaded: " + str);
                                    set.add(str);
                                } catch (UnsatisfiedLinkError e10) {
                                    String message = e10.getMessage();
                                    if (message == null || !message.contains("unexpected e_machine:")) {
                                        throw e10;
                                    }
                                    throw new a(e10, message.substring(message.lastIndexOf("unexpected e_machine:")));
                                }
                            }
                        }
                        synchronized (obj2) {
                            if ((i10 & 16) == 0 && str3 != null) {
                                try {
                                    if (TextUtils.isEmpty(str2) || !f31342j.contains(str2)) {
                                        boolean z11 = f31333a;
                                        if (z11 && f31347o == null) {
                                            Api18TraceUtils.a("MergedSoMapping.invokeJniOnload[", str2, "]");
                                        }
                                        try {
                                            try {
                                                p.a("SoLoader", "About to invoke JNI_OnLoad for merged library " + str2 + ", which was merged into " + str);
                                                l lVar = f31347o;
                                                if (lVar != null) {
                                                    lVar.a(str2);
                                                } else {
                                                    r.a(str2);
                                                }
                                                f31342j.add(str2);
                                                if (z11 && f31347o == null) {
                                                    Api18TraceUtils.b();
                                                }
                                            } catch (UnsatisfiedLinkError e11) {
                                                throw new RuntimeException("Failed to call JNI_OnLoad from '" + str2 + "', which has been merged into '" + str + "'.  See comment for details.", e11);
                                            }
                                        } catch (Throwable th) {
                                            if (f31333a && f31347o == null) {
                                                Api18TraceUtils.b();
                                            }
                                            throw th;
                                        }
                                    }
                                } catch (Throwable th2) {
                                    throw th2;
                                }
                            }
                        }
                        reentrantReadWriteLock.readLock().unlock();
                        return !z10;
                    }
                } catch (Throwable th3) {
                    f31335c.readLock().unlock();
                    throw th3;
                }
            } catch (Throwable th4) {
                throw th4;
            }
        }
    }

    private static boolean x(E e10, String str, int i10, StrictMode.ThreadPolicy threadPolicy) {
        p259o7.b.l(e10);
        try {
            boolean z10 = e10.d(str, i10, threadPolicy) != 0;
            p259o7.b.k(null);
            return z10;
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                p259o7.b.k(th);
                throw th2;
            }
        }
    }

    private static boolean y(String str, int i10) {
        l lVar = f31347o;
        String strB = lVar != null ? lVar.b(str) : r.b(str);
        String str2 = strB != null ? strB : str;
        p259o7.b.f(str, strB, i10);
        try {
            boolean zV = v(System.mapLibraryName(str2), str, strB, i10, null);
            p259o7.b.e(null, zV);
            return zV;
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                p259o7.b.e(th, false);
                throw th2;
            }
        }
    }

    private static Boolean z(String str) {
        Boolean boolValueOf;
        if (f31337e != null) {
            return null;
        }
        ReentrantReadWriteLock reentrantReadWriteLock = f31335c;
        reentrantReadWriteLock.readLock().lock();
        try {
            if (f31337e == null) {
                if (!"http://www.android.com/".equals(System.getProperty("java.vendor.url"))) {
                    synchronized (SoLoader.class) {
                        try {
                            boolean zContains = f31340h.contains(str);
                            boolean z10 = !zContains;
                            if (!zContains) {
                                System.loadLibrary(str);
                            }
                            boolValueOf = Boolean.valueOf(z10);
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                    reentrantReadWriteLock.readLock().unlock();
                    return boolValueOf;
                }
                f();
            }
            reentrantReadWriteLock.readLock().unlock();
            return null;
        } catch (Throwable th2) {
            f31335c.readLock().unlock();
            throw th2;
        }
    }
}
