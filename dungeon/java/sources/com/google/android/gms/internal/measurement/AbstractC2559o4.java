package com.google.android.gms.internal.measurement;

import android.content.Context;
import android.net.Uri;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.o4, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC2559o4 {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final Object f33058g = new Object();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static volatile AbstractC2514j4 f33059h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final AtomicInteger f33060i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final /* synthetic */ int f33061j = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final C2505i4 f33062a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final String f33063b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Object f33064c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private volatile int f33065d = -1;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private volatile Object f33066e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private volatile boolean f33067f;

    static {
        new AtomicReference();
        B9.n.k(C2541m4.f33006a, "BuildInfo must be non-null");
        f33060i = new AtomicInteger();
    }

    /* synthetic */ AbstractC2559o4(C2505i4 c2505i4, String str, Object obj, boolean z10, byte[] bArr) {
        if (c2505i4.f32942a == null) {
            throw new IllegalArgumentException("Must pass a valid SharedPreferences file name or ContentProvider URI");
        }
        this.f33062a = c2505i4;
        this.f33063b = str;
        this.f33064c = obj;
        this.f33067f = false;
    }

    public static void b(Context context) {
        if (f33059h != null || context == null) {
            return;
        }
        Object obj = f33058g;
        synchronized (obj) {
            try {
                if (f33059h == null) {
                    synchronized (obj) {
                        try {
                            AbstractC2514j4 abstractC2514j4 = f33059h;
                            Context applicationContext = context.getApplicationContext();
                            if (applicationContext != null) {
                                context = applicationContext;
                            }
                            if (abstractC2514j4 == null || abstractC2514j4.a() != context) {
                                if (abstractC2514j4 != null) {
                                    T3.f();
                                    C2577q4.d();
                                    Z3.e();
                                }
                                f33059h = new P3(context, B9.u.a(new C2550n4(context)));
                                f33060i.incrementAndGet();
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public static void c() {
        f33060i.incrementAndGet();
    }

    abstract Object a(Object obj);

    /* JADX WARN: Code duplicated, block: B:16:0x004a A[PHI: r2
      0x004a: PHI (r2v1 B9.k) = (r2v0 B9.k), (r2v0 B9.k), (r2v7 B9.k) binds: [B:8:0x0016, B:10:0x001c, B:12:0x0032] A[DONT_GENERATE, DONT_INLINE]] */
    public final Object d() {
        String strA;
        W3 w3C;
        String strB;
        Object objB;
        int i10 = f33060i.get();
        if (this.f33065d < i10) {
            synchronized (this) {
                try {
                    if (this.f33065d < i10) {
                        AbstractC2514j4 abstractC2514j4 = f33059h;
                        B9.k kVarA = B9.k.a();
                        Object objA = null;
                        if (abstractC2514j4 == null || abstractC2514j4.b() == null) {
                            strA = null;
                        } else {
                            kVarA = (B9.k) ((B9.t) B9.n.j(abstractC2514j4.b())).get();
                            if (kVarA.c()) {
                                U3 u10 = (U3) kVarA.b();
                                C2505i4 c2505i4 = this.f33062a;
                                strA = u10.a(c2505i4.f32942a, null, c2505i4.f32944c, this.f33063b);
                            } else {
                                strA = null;
                            }
                        }
                        B9.n.p(abstractC2514j4 != null, "Must call PhenotypeFlagInitializer.maybeInit() first");
                        C2505i4 c2505i5 = this.f33062a;
                        Uri uri = c2505i5.f32942a;
                        if (uri != null) {
                            w3C = AbstractC2451c4.a(abstractC2514j4.a(), uri) ? T3.c(abstractC2514j4.a().getContentResolver(), uri, RunnableC2532l4.f32972a) : null;
                        } else {
                            w3C = C2577q4.c(abstractC2514j4.a(), (String) B9.n.j(null), RunnableC2523k4.f32964a);
                        }
                        Object objA2 = (w3C == null || (objB = w3C.b(this.f33063b)) == null) ? null : a(objB);
                        if (objA2 == null) {
                            if (!c2505i5.f32945d && (strB = Z3.c(abstractC2514j4.a()).b(this.f33063b)) != null) {
                                objA = a(strB);
                            }
                            objA2 = objA == null ? this.f33064c : objA;
                        }
                        if (kVarA.c()) {
                            objA2 = strA == null ? this.f33064c : a(strA);
                        }
                        this.f33066e = objA2;
                        this.f33065d = i10;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return this.f33066e;
    }
}
