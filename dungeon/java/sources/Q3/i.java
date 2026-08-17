package Q3;

import android.os.SystemClock;
import java.io.File;

/* JADX INFO: loaded from: classes.dex */
final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final i f9346a = new i();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final File f9347b = new File("/proc/self/fd");

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static int f9348c = 30;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static long f9349d = SystemClock.uptimeMillis();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static boolean f9350e = true;

    private i() {
    }

    private final boolean a() {
        int i10 = f9348c;
        f9348c = i10 + 1;
        return i10 >= 30 || SystemClock.uptimeMillis() > f9349d + ((long) 30000);
    }

    public final synchronized boolean b(s sVar) {
        try {
            if (a()) {
                f9348c = 0;
                f9349d = SystemClock.uptimeMillis();
                String[] list = f9347b.list();
                if (list == null) {
                    list = new String[0];
                }
                int length = list.length;
                boolean z10 = length < 800;
                f9350e = z10;
                if (!z10 && sVar != null) {
                    s.a aVar = s.a.Warn;
                    if (sVar.a().compareTo(aVar) <= 0) {
                        sVar.b("FileDescriptorCounter", aVar, "Unable to allocate more hardware bitmaps. Number of used file descriptors: " + length, null);
                    }
                }
            }
        } catch (Throwable th) {
            throw th;
        }
        return f9350e;
    }
}
