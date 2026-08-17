package p381v3;

import android.os.Trace;

/* JADX INFO: loaded from: classes.dex */
abstract class c {
    public static void a(String str, int i10) {
        Trace.beginAsyncSection(str, i10);
    }

    public static void b(String str, int i10) {
        Trace.endAsyncSection(str, i10);
    }

    public static boolean c() {
        return Trace.isEnabled();
    }

    public static void d(String str, int i10) {
        Trace.setCounter(str, i10);
    }
}
