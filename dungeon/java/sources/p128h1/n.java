package p128h1;

import android.os.Build;
import android.os.Trace;
import android.util.Log;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes.dex */
public abstract class n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static long f42511a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static Method f42512b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static Method f42513c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static Method f42514d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static Method f42515e;

    static {
        if (Build.VERSION.SDK_INT < 29) {
            try {
                f42511a = Trace.class.getField("TRACE_TAG_APP").getLong(null);
                Class cls = Long.TYPE;
                f42512b = Trace.class.getMethod("isTagEnabled", cls);
                Class cls2 = Integer.TYPE;
                f42513c = Trace.class.getMethod("asyncTraceBegin", cls, String.class, cls2);
                f42514d = Trace.class.getMethod("asyncTraceEnd", cls, String.class, cls2);
                f42515e = Trace.class.getMethod("traceCounter", cls, String.class, cls2);
            } catch (Exception e10) {
                Log.i("TraceCompat", "Unable to initialize via reflection.", e10);
            }
        }
    }

    public static void a(String str) {
        Trace.beginSection(str);
    }

    public static void b() {
        Trace.endSection();
    }
}
