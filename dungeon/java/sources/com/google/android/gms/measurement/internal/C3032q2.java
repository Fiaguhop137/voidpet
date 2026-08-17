package com.google.android.gms.measurement.internal;

import android.text.TextUtils;
import android.util.Log;

/* JADX INFO: renamed from: com.google.android.gms.measurement.internal.q2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C3032q2 extends B3 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private char f35750c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private long f35751d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private String f35752e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final C3018o2 f35753f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final C3018o2 f35754g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final C3018o2 f35755h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final C3018o2 f35756i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final C3018o2 f35757j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final C3018o2 f35758k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final C3018o2 f35759l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final C3018o2 f35760m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final C3018o2 f35761n;

    C3032q2(X2 x10) {
        super(x10);
        this.f35750c = (char) 0;
        this.f35751d = -1L;
        this.f35753f = new C3018o2(this, 6, false, false);
        this.f35754g = new C3018o2(this, 6, true, false);
        this.f35755h = new C3018o2(this, 6, false, true);
        this.f35756i = new C3018o2(this, 5, false, false);
        this.f35757j = new C3018o2(this, 5, true, false);
        this.f35758k = new C3018o2(this, 5, false, true);
        this.f35759l = new C3018o2(this, 4, false, false);
        this.f35760m = new C3018o2(this, 3, false, false);
        this.f35761n = new C3018o2(this, 2, false, false);
    }

    static String A(boolean z10, String str, Object obj, Object obj2, Object obj3) {
        String strB = B(z10, obj);
        String strB2 = B(z10, obj2);
        String strB3 = B(z10, obj3);
        StringBuilder sb2 = new StringBuilder();
        String str2 = "";
        if (str == null) {
            str = "";
        }
        if (!TextUtils.isEmpty(str)) {
            sb2.append(str);
            str2 = ": ";
        }
        String str3 = ", ";
        if (!TextUtils.isEmpty(strB)) {
            sb2.append(str2);
            sb2.append(strB);
            str2 = ", ";
        }
        if (TextUtils.isEmpty(strB2)) {
            str3 = str2;
        } else {
            sb2.append(str2);
            sb2.append(strB2);
        }
        if (!TextUtils.isEmpty(strB3)) {
            sb2.append(str3);
            sb2.append(strB3);
        }
        return sb2.toString();
    }

    static String B(boolean z10, Object obj) {
        String className;
        if (obj == null) {
            return "";
        }
        if (obj instanceof Integer) {
            obj = Long.valueOf(((Integer) obj).intValue());
        }
        if (obj instanceof Long) {
            if (!z10) {
                return obj.toString();
            }
            Long l10 = (Long) obj;
            if (Math.abs(l10.longValue()) < 100) {
                return obj.toString();
            }
            char cCharAt = obj.toString().charAt(0);
            String strValueOf = String.valueOf(Math.abs(l10.longValue()));
            long jRound = Math.round(Math.pow(10.0d, strValueOf.length() - 1));
            long jRound2 = Math.round(Math.pow(10.0d, strValueOf.length()) - 1.0d);
            int length = String.valueOf(jRound).length();
            String str = cCharAt == '-' ? "-" : "";
            StringBuilder sb2 = new StringBuilder(str.length() + length + 3 + str.length() + String.valueOf(jRound2).length());
            sb2.append(str);
            sb2.append(jRound);
            sb2.append("...");
            sb2.append(str);
            sb2.append(jRound2);
            return sb2.toString();
        }
        if (obj instanceof Boolean) {
            return obj.toString();
        }
        if (!(obj instanceof Throwable)) {
            if (obj instanceof C3025p2) {
                return ((C3025p2) obj).a();
            }
            return z10 ? "-" : obj.toString();
        }
        Throwable th = (Throwable) obj;
        StringBuilder sb3 = new StringBuilder(z10 ? th.getClass().getName() : th.toString());
        String strC = C(X2.class.getCanonicalName());
        for (StackTraceElement stackTraceElement : th.getStackTrace()) {
            if (!stackTraceElement.isNativeMethod() && (className = stackTraceElement.getClassName()) != null && C(className).equals(strC)) {
                sb3.append(": ");
                sb3.append(stackTraceElement);
                break;
            }
        }
        return sb3.toString();
    }

    static String C(String str) {
        int iLastIndexOf;
        return (TextUtils.isEmpty(str) || (iLastIndexOf = str.lastIndexOf(46)) == -1) ? "" : str.substring(0, iLastIndexOf);
    }

    protected static Object x(String str) {
        if (str == null) {
            return null;
        }
        return new C3025p2(str);
    }

    final /* synthetic */ char D() {
        return this.f35750c;
    }

    final /* synthetic */ void E(char c10) {
        this.f35750c = c10;
    }

    final /* synthetic */ long F() {
        return this.f35751d;
    }

    final /* synthetic */ void G(long j10) {
        this.f35751d = 133005L;
    }

    @Override // com.google.android.gms.measurement.internal.B3
    protected final boolean i() {
        return false;
    }

    public final C3018o2 o() {
        return this.f35753f;
    }

    public final C3018o2 p() {
        return this.f35754g;
    }

    public final C3018o2 q() {
        return this.f35755h;
    }

    public final C3018o2 r() {
        return this.f35756i;
    }

    public final C3018o2 s() {
        return this.f35757j;
    }

    public final C3018o2 t() {
        return this.f35758k;
    }

    public final C3018o2 u() {
        return this.f35759l;
    }

    public final C3018o2 v() {
        return this.f35760m;
    }

    public final C3018o2 w() {
        return this.f35761n;
    }

    protected final void y(int i10, boolean z10, boolean z11, String str, Object obj, Object obj2, Object obj3) {
        if (!z10 && Log.isLoggable(z(), i10)) {
            Log.println(i10, z(), A(false, str, obj, obj2, obj3));
        }
        if (z11 || i10 < 5) {
            return;
        }
        p170j8.r.l(str);
        T2 t2A = this.f34853a.A();
        if (t2A == null) {
            Log.println(6, z(), "Scheduler not set. Not logging error/warn");
        } else {
            if (!t2A.k()) {
                Log.println(6, z(), "Scheduler not initialized. Not logging error/warn");
                return;
            }
            if (i10 >= 9) {
                i10 = 8;
            }
            t2A.t(new RunnableC3011n2(this, i10, str, obj, obj2, obj3));
        }
    }

    protected final String z() {
        String str;
        synchronized (this) {
            try {
                if (this.f35752e == null) {
                    this.f35752e = this.f34853a.w().u();
                }
                p170j8.r.l(this.f35752e);
                str = this.f35752e;
            } catch (Throwable th) {
                throw th;
            }
        }
        return str;
    }
}
