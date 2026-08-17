package p436y4;

import L4.l;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Build;
import android.util.Log;
import java.io.File;
import java.util.Arrays;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes.dex */
public final class t {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final boolean f57927e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final boolean f57928f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final File f57929g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static volatile t f57930h;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f57932b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f57933c = true;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final AtomicBoolean f57934d = new AtomicBoolean(false);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f57931a = 20000;

    static {
        int i10 = Build.VERSION.SDK_INT;
        f57927e = i10 < 29;
        f57928f = i10 >= 28;
        f57929g = new File("/proc/self/fd");
    }

    t() {
    }

    private boolean a() {
        return f57927e && !this.f57934d.get();
    }

    public static t b() {
        if (f57930h == null) {
            synchronized (t.class) {
                try {
                    if (f57930h == null) {
                        f57930h = new t();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f57930h;
    }

    private int c() {
        if (e()) {
            return 500;
        }
        return this.f57931a;
    }

    private synchronized boolean d() {
        try {
            boolean z10 = true;
            int i10 = this.f57932b + 1;
            this.f57932b = i10;
            if (i10 >= 50) {
                this.f57932b = 0;
                int length = f57929g.list().length;
                long jC = c();
                if (length >= jC) {
                    z10 = false;
                }
                this.f57933c = z10;
                if (!z10 && Log.isLoggable("Downsampler", 5)) {
                    Log.w("Downsampler", "Excluding HARDWARE bitmap config because we're over the file descriptor limit, file descriptors " + length + ", limit " + jC);
                }
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.f57933c;
    }

    private static boolean e() {
        if (Build.VERSION.SDK_INT != 28) {
            return false;
        }
        Iterator it = Arrays.asList("GM1900", "GM1901", "GM1903", "GM1911", "GM1915", "ONEPLUS A3000", "ONEPLUS A3010", "ONEPLUS A5010", "ONEPLUS A5000", "ONEPLUS A3003", "ONEPLUS A6000", "ONEPLUS A6003", "ONEPLUS A6010", "ONEPLUS A6013").iterator();
        while (it.hasNext()) {
            if (Build.MODEL.startsWith((String) it.next())) {
                return true;
            }
        }
        return false;
    }

    public boolean f(int i10, int i11, boolean z10, boolean z11) {
        if (!z10) {
            if (Log.isLoggable("HardwareConfig", 2)) {
                Log.v("HardwareConfig", "Hardware config disallowed by caller");
            }
            return false;
        }
        if (!f57928f) {
            if (Log.isLoggable("HardwareConfig", 2)) {
                Log.v("HardwareConfig", "Hardware config disallowed by sdk");
            }
            return false;
        }
        if (a()) {
            if (Log.isLoggable("HardwareConfig", 2)) {
                Log.v("HardwareConfig", "Hardware config disallowed by app state");
            }
            return false;
        }
        if (z11) {
            if (Log.isLoggable("HardwareConfig", 2)) {
                Log.v("HardwareConfig", "Hardware config disallowed because exif orientation is required");
            }
            return false;
        }
        if (i10 < 0 || i11 < 0) {
            if (Log.isLoggable("HardwareConfig", 2)) {
                Log.v("HardwareConfig", "Hardware config disallowed because of invalid dimensions");
            }
            return false;
        }
        if (d()) {
            return true;
        }
        if (Log.isLoggable("HardwareConfig", 2)) {
            Log.v("HardwareConfig", "Hardware config disallowed because there are insufficient FDs");
        }
        return false;
    }

    boolean g(int i10, int i11, BitmapFactory.Options options, boolean z10, boolean z11) {
        boolean zF = f(i10, i11, z10, z11);
        if (zF) {
            options.inPreferredConfig = Bitmap.Config.HARDWARE;
            options.inMutable = false;
        }
        return zF;
    }

    public void h() {
        l.b();
        this.f57934d.set(true);
    }
}
