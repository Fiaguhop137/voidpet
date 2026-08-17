package p170j8;

import android.util.Log;

/* JADX INFO: renamed from: j8.j, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C3845j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f46991a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f46992b;

    public C3845j(String str) {
        this(str, null);
    }

    public C3845j(String str, String str2) {
        r.m(str, "log tag cannot be null");
        r.c(str.length() <= 23, "tag \"%s\" is longer than the %d character maximum", str, 23);
        this.f46991a = str;
        this.f46992b = (str2 == null || str2.length() <= 0) ? null : str2;
    }

    private final String i(String str) {
        String str2 = this.f46992b;
        return str2 == null ? str : str2.concat(str);
    }

    public boolean a(int i10) {
        return Log.isLoggable(this.f46991a, i10);
    }

    public void b(String str, String str2) {
        if (a(3)) {
            Log.d(str, i(str2));
        }
    }

    public void c(String str, String str2, Throwable th) {
        if (a(3)) {
            Log.d(str, i(str2), th);
        }
    }

    public void d(String str, String str2) {
        if (a(6)) {
            Log.e(str, i(str2));
        }
    }

    public void e(String str, String str2, Throwable th) {
        if (a(6)) {
            Log.e(str, i(str2), th);
        }
    }

    public void f(String str, String str2) {
        if (a(2)) {
            Log.v(str, i(str2));
        }
    }

    public void g(String str, String str2) {
        if (a(5)) {
            Log.w(str, i(str2));
        }
    }

    public void h(String str, String str2, Throwable th) {
        if (a(5)) {
            Log.w(str, i(str2), th);
        }
    }
}
