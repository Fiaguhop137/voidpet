package U1;

import android.text.TextUtils;
import android.util.Log;
import java.net.UnknownHostException;

/* JADX INFO: renamed from: U1.t, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1477t {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static int f12950b = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static boolean f12951c = true;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Object f12949a = new Object();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static a f12952d = a.f12953a;

    /* JADX INFO: renamed from: U1.t$a */
    public interface a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f12953a = new C0183a();

        /* JADX INFO: renamed from: U1.t$a$a, reason: collision with other inner class name */
        class C0183a implements a {
            C0183a() {
            }

            @Override // U1.AbstractC1477t.a
            public void a(String str, String str2, Throwable th) {
                Log.d(str, AbstractC1477t.a(str2, th));
            }

            @Override // U1.AbstractC1477t.a
            public void b(String str, String str2, Throwable th) {
                Log.w(str, AbstractC1477t.a(str2, th));
            }

            @Override // U1.AbstractC1477t.a
            public void c(String str, String str2, Throwable th) {
                Log.e(str, AbstractC1477t.a(str2, th));
            }

            @Override // U1.AbstractC1477t.a
            public void d(String str, String str2, Throwable th) {
                Log.i(str, AbstractC1477t.a(str2, th));
            }
        }

        void a(String str, String str2, Throwable th);

        void b(String str, String str2, Throwable th);

        void c(String str, String str2, Throwable th);

        void d(String str, String str2, Throwable th);
    }

    public static String a(String str, Throwable th) {
        String strE = e(th);
        if (TextUtils.isEmpty(strE)) {
            return str;
        }
        return str + "\n  " + strE.replace("\n", "\n  ") + '\n';
    }

    public static void b(String str, String str2) {
        synchronized (f12949a) {
            try {
                if (f12950b == 0) {
                    f12952d.a(str, str2, null);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static void c(String str, String str2) {
        synchronized (f12949a) {
            try {
                if (f12950b <= 3) {
                    f12952d.c(str, str2, null);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static void d(String str, String str2, Throwable th) {
        synchronized (f12949a) {
            try {
                if (f12950b <= 3) {
                    f12952d.c(str, str2, th);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public static String e(Throwable th) {
        if (th == null) {
            return null;
        }
        synchronized (f12949a) {
            try {
                if (g(th)) {
                    return "UnknownHostException (no network)";
                }
                if (f12951c) {
                    return Log.getStackTraceString(th).trim().replace("\t", "    ");
                }
                return th.getMessage();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public static void f(String str, String str2) {
        synchronized (f12949a) {
            try {
                if (f12950b <= 1) {
                    f12952d.d(str, str2, null);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private static boolean g(Throwable th) {
        while (th != null) {
            if (th instanceof UnknownHostException) {
                return true;
            }
            th = th.getCause();
        }
        return false;
    }

    public static void h(String str, String str2) {
        synchronized (f12949a) {
            try {
                if (f12950b <= 2) {
                    f12952d.b(str, str2, null);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static void i(String str, String str2, Throwable th) {
        synchronized (f12949a) {
            try {
                if (f12950b <= 2) {
                    f12952d.b(str, str2, th);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
