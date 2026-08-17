package com.google.android.gms.internal.auth;

import android.content.Context;
import android.net.Uri;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes2.dex */
public abstract class M {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static volatile K f32243g;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final /* synthetic */ int f32247k = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final I f32248a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final String f32249b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Object f32250c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private volatile int f32251d = -1;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private volatile Object f32252e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final Object f32242f = new Object();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final AtomicReference f32244h = new AtomicReference();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final O f32245i = new O(D.f32213a);

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final AtomicInteger f32246j = new AtomicInteger();

    /* synthetic */ M(I i10, String str, Object obj, boolean z10, L l10) {
        if (i10.f32224a == null) {
            throw new IllegalArgumentException("Must pass a valid SharedPreferences file name or ContentProvider URI");
        }
        this.f32248a = i10;
        this.f32249b = str;
        this.f32250c = obj;
    }

    public static void c() {
        f32246j.incrementAndGet();
    }

    public static void d(Context context) {
        if (f32243g != null || context == null) {
            return;
        }
        Object obj = f32242f;
        synchronized (obj) {
            try {
                if (f32243g == null) {
                    synchronized (obj) {
                        try {
                            K k10 = f32243g;
                            Context applicationContext = context.getApplicationContext();
                            if (applicationContext != null) {
                                context = applicationContext;
                            }
                            if (k10 == null || k10.a() != context) {
                                C2401q.d();
                                N.c();
                                C2421x.e();
                                f32243g = new C2392n(context, Z.a(new C(context)));
                                f32246j.incrementAndGet();
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

    abstract Object a(Object obj);

    /* JADX WARN: Code duplicated, block: B:14:0x003e A[PHI: r2
      0x003e: PHI (r2v1 com.google.android.gms.internal.auth.S) = (r2v0 com.google.android.gms.internal.auth.S), (r2v5 com.google.android.gms.internal.auth.S) binds: [B:8:0x0016, B:10:0x0026] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:28:0x0081  */
    /* JADX WARN: Code duplicated, block: B:30:0x0084 A[Catch: all -> 0x003b, TryCatch #0 {all -> 0x003b, blocks: (B:5:0x000b, B:7:0x000f, B:9:0x0018, B:11:0x0028, B:17:0x0043, B:19:0x0049, B:21:0x0053, B:25:0x0074, B:27:0x007c, B:30:0x0084, B:32:0x008a, B:36:0x009c, B:38:0x00a2, B:35:0x009a, B:40:0x00a8, B:42:0x00ac, B:45:0x00b4, B:46:0x00b7, B:47:0x00bb, B:23:0x0068, B:48:0x00c0, B:49:0x00c5, B:50:0x00c6), top: B:56:0x000b }] */
    /* JADX WARN: Code duplicated, block: B:32:0x008a A[Catch: all -> 0x003b, TryCatch #0 {all -> 0x003b, blocks: (B:5:0x000b, B:7:0x000f, B:9:0x0018, B:11:0x0028, B:17:0x0043, B:19:0x0049, B:21:0x0053, B:25:0x0074, B:27:0x007c, B:30:0x0084, B:32:0x008a, B:36:0x009c, B:38:0x00a2, B:35:0x009a, B:40:0x00a8, B:42:0x00ac, B:45:0x00b4, B:46:0x00b7, B:47:0x00bb, B:23:0x0068, B:48:0x00c0, B:49:0x00c5, B:50:0x00c6), top: B:56:0x000b }] */
    /* JADX WARN: Code duplicated, block: B:34:0x0098  */
    /* JADX WARN: Code duplicated, block: B:35:0x009a A[Catch: all -> 0x003b, TryCatch #0 {all -> 0x003b, blocks: (B:5:0x000b, B:7:0x000f, B:9:0x0018, B:11:0x0028, B:17:0x0043, B:19:0x0049, B:21:0x0053, B:25:0x0074, B:27:0x007c, B:30:0x0084, B:32:0x008a, B:36:0x009c, B:38:0x00a2, B:35:0x009a, B:40:0x00a8, B:42:0x00ac, B:45:0x00b4, B:46:0x00b7, B:47:0x00bb, B:23:0x0068, B:48:0x00c0, B:49:0x00c5, B:50:0x00c6), top: B:56:0x000b }] */
    /* JADX WARN: Code duplicated, block: B:38:0x00a2 A[Catch: all -> 0x003b, TryCatch #0 {all -> 0x003b, blocks: (B:5:0x000b, B:7:0x000f, B:9:0x0018, B:11:0x0028, B:17:0x0043, B:19:0x0049, B:21:0x0053, B:25:0x0074, B:27:0x007c, B:30:0x0084, B:32:0x008a, B:36:0x009c, B:38:0x00a2, B:35:0x009a, B:40:0x00a8, B:42:0x00ac, B:45:0x00b4, B:46:0x00b7, B:47:0x00bb, B:23:0x0068, B:48:0x00c0, B:49:0x00c5, B:50:0x00c6), top: B:56:0x000b }] */
    /* JADX WARN: Code duplicated, block: B:40:0x00a8 A[Catch: all -> 0x003b, TryCatch #0 {all -> 0x003b, blocks: (B:5:0x000b, B:7:0x000f, B:9:0x0018, B:11:0x0028, B:17:0x0043, B:19:0x0049, B:21:0x0053, B:25:0x0074, B:27:0x007c, B:30:0x0084, B:32:0x008a, B:36:0x009c, B:38:0x00a2, B:35:0x009a, B:40:0x00a8, B:42:0x00ac, B:45:0x00b4, B:46:0x00b7, B:47:0x00bb, B:23:0x0068, B:48:0x00c0, B:49:0x00c5, B:50:0x00c6), top: B:56:0x000b }] */
    /* JADX WARN: Code duplicated, block: B:41:0x00ab  */
    /* JADX WARN: Code duplicated, block: B:44:0x00b2 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:45:0x00b4 A[Catch: all -> 0x003b, TryCatch #0 {all -> 0x003b, blocks: (B:5:0x000b, B:7:0x000f, B:9:0x0018, B:11:0x0028, B:17:0x0043, B:19:0x0049, B:21:0x0053, B:25:0x0074, B:27:0x007c, B:30:0x0084, B:32:0x008a, B:36:0x009c, B:38:0x00a2, B:35:0x009a, B:40:0x00a8, B:42:0x00ac, B:45:0x00b4, B:46:0x00b7, B:47:0x00bb, B:23:0x0068, B:48:0x00c0, B:49:0x00c5, B:50:0x00c6), top: B:56:0x000b }] */
    /* JADX WARN: Code duplicated, block: B:46:0x00b7 A[Catch: all -> 0x003b, TryCatch #0 {all -> 0x003b, blocks: (B:5:0x000b, B:7:0x000f, B:9:0x0018, B:11:0x0028, B:17:0x0043, B:19:0x0049, B:21:0x0053, B:25:0x0074, B:27:0x007c, B:30:0x0084, B:32:0x008a, B:36:0x009c, B:38:0x00a2, B:35:0x009a, B:40:0x00a8, B:42:0x00ac, B:45:0x00b4, B:46:0x00b7, B:47:0x00bb, B:23:0x0068, B:48:0x00c0, B:49:0x00c5, B:50:0x00c6), top: B:56:0x000b }] */
    public final Object b() {
        String strA;
        C2401q c2401qB;
        Object objA;
        String str;
        String strA2;
        Object objA2;
        int i10 = f32246j.get();
        if (this.f32251d < i10) {
            synchronized (this) {
                try {
                    if (this.f32251d < i10) {
                        K k10 = f32243g;
                        S sC = S.c();
                        Object objA3 = null;
                        if (k10 != null) {
                            sC = (S) k10.b().zza();
                            if (sC.b()) {
                                r rVar = (r) sC.a();
                                I i11 = this.f32248a;
                                strA = rVar.a(i11.f32224a, null, i11.f32226c, this.f32249b);
                            } else {
                                strA = null;
                            }
                        } else {
                            strA = null;
                        }
                        if (k10 == null) {
                            throw new IllegalStateException("Must call PhenotypeFlag.init() first");
                        }
                        Uri uri = this.f32248a.f32224a;
                        if (uri != null) {
                            if (AbstractC2426z.a(k10.a(), uri)) {
                                c2401qB = C2401q.b(k10.a().getContentResolver(), this.f32248a.f32224a, B.f32209a);
                            }
                            if (c2401qB != null || (objA2 = c2401qB.a(this.f32249b)) == null) {
                                objA = null;
                            } else {
                                objA = a(objA2);
                            }
                            if (objA == null) {
                                if (!this.f32248a.f32227d) {
                                    C2421x c2421xB = C2421x.b(k10.a());
                                    if (this.f32248a.f32227d) {
                                        str = null;
                                    } else {
                                        str = this.f32249b;
                                    }
                                    strA2 = c2421xB.a(str);
                                    if (strA2 != null) {
                                        objA3 = a(strA2);
                                    }
                                }
                                if (objA3 == null) {
                                    objA = this.f32250c;
                                } else {
                                    objA = objA3;
                                }
                            }
                            if (sC.b()) {
                                if (strA == null) {
                                    objA = this.f32250c;
                                } else {
                                    objA = a(strA);
                                }
                            }
                            this.f32252e = objA;
                            this.f32251d = i10;
                        } else {
                            N.b(k10.a(), null, B.f32209a);
                        }
                        c2401qB = null;
                        if (c2401qB != null) {
                            objA = null;
                        } else {
                            objA = null;
                        }
                        if (objA == null) {
                            if (!this.f32248a.f32227d) {
                                C2421x c2421xB2 = C2421x.b(k10.a());
                                if (this.f32248a.f32227d) {
                                    str = null;
                                } else {
                                    str = this.f32249b;
                                }
                                strA2 = c2421xB2.a(str);
                                if (strA2 != null) {
                                    objA3 = a(strA2);
                                }
                            }
                            if (objA3 == null) {
                                objA = this.f32250c;
                            } else {
                                objA = objA3;
                            }
                        }
                        if (sC.b()) {
                            if (strA == null) {
                                objA = this.f32250c;
                            } else {
                                objA = a(strA);
                            }
                        }
                        this.f32252e = objA;
                        this.f32251d = i10;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return this.f32252e;
    }
}
