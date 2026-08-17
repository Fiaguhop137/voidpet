package com.android.volley;

import android.os.SystemClock;
import android.util.Log;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

/* JADX INFO: loaded from: classes.dex */
public abstract class v {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static String f27910a = "Volley";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static boolean f27911b = Log.isLoggable("Volley", 2);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final String f27912c = v.class.getName();

    static class a {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final boolean f27913c = v.f27911b;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final List f27914a = new ArrayList();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private boolean f27915b = false;

        /* JADX INFO: renamed from: com.android.volley.v$a$a, reason: collision with other inner class name */
        private static class C0360a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final String f27916a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final long f27917b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final long f27918c;

            public C0360a(String str, long j10, long j11) {
                this.f27916a = str;
                this.f27917b = j10;
                this.f27918c = j11;
            }
        }

        a() {
        }

        private long c() {
            if (this.f27914a.size() == 0) {
                return 0L;
            }
            long j10 = ((C0360a) this.f27914a.get(0)).f27918c;
            List list = this.f27914a;
            return ((C0360a) list.get(list.size() - 1)).f27918c - j10;
        }

        public synchronized void a(String str, long j10) {
            if (this.f27915b) {
                throw new IllegalStateException("Marker added to finished log");
            }
            this.f27914a.add(new C0360a(str, j10, SystemClock.elapsedRealtime()));
        }

        public synchronized void b(String str) {
            this.f27915b = true;
            long jC = c();
            if (jC <= 0) {
                return;
            }
            long j10 = ((C0360a) this.f27914a.get(0)).f27918c;
            v.b("(%-4d ms) %s", Long.valueOf(jC), str);
            for (C0360a c0360a : this.f27914a) {
                long j11 = c0360a.f27918c;
                v.b("(+%-4d) [%2d] %s", Long.valueOf(j11 - j10), Long.valueOf(c0360a.f27917b), c0360a.f27916a);
                j10 = j11;
            }
        }

        protected void finalize() {
            if (this.f27915b) {
                return;
            }
            b("Request on the loose");
            v.c("Marker log finalized without finish() - uncaught exit point for request", new Object[0]);
        }
    }

    private static String a(String str, Object... objArr) {
        String str2;
        if (objArr != null) {
            str = String.format(Locale.US, str, objArr);
        }
        StackTraceElement[] stackTrace = new Throwable().fillInStackTrace().getStackTrace();
        for (int i10 = 2; i10 < stackTrace.length; i10++) {
            if (!stackTrace[i10].getClassName().equals(f27912c)) {
                String className = stackTrace[i10].getClassName();
                String strSubstring = className.substring(className.lastIndexOf(46) + 1);
                str2 = strSubstring.substring(strSubstring.lastIndexOf(36) + 1) + "." + stackTrace[i10].getMethodName();
                return String.format(Locale.US, "[%d] %s: %s", Long.valueOf(Thread.currentThread().getId()), str2, str);
            }
        }
        str2 = "<unknown>";
        return String.format(Locale.US, "[%d] %s: %s", Long.valueOf(Thread.currentThread().getId()), str2, str);
    }

    public static void b(String str, Object... objArr) {
        Log.d(f27910a, a(str, objArr));
    }

    public static void c(String str, Object... objArr) {
        Log.e(f27910a, a(str, objArr));
    }

    public static void d(Throwable th, String str, Object... objArr) {
        Log.e(f27910a, a(str, objArr), th);
    }

    public static void e(String str, Object... objArr) {
        if (f27911b) {
            Log.v(f27910a, a(str, objArr));
        }
    }
}
