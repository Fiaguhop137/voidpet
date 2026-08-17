package p006a5;

import V4.p;
import android.os.Environment;
import android.os.StatFs;
import android.os.SystemClock;
import java.io.File;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/* JADX INFO: loaded from: classes.dex */
public class a {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static a f19509h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final long f19510i = TimeUnit.MINUTES.toMillis(2);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private volatile File f19512b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private volatile File f19514d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private long f19515e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private volatile StatFs f19511a = null;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private volatile StatFs f19513c = null;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private volatile boolean f19517g = false;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final Lock f19516f = new ReentrantLock();

    /* JADX INFO: renamed from: a5.a$a, reason: collision with other inner class name */
    public enum EnumC0244a {
        INTERNAL,
        EXTERNAL
    }

    protected a() {
    }

    protected static StatFs a(String str) {
        return new StatFs(str);
    }

    private void b() {
        if (this.f19517g) {
            return;
        }
        this.f19516f.lock();
        try {
            if (!this.f19517g) {
                this.f19512b = Environment.getDataDirectory();
                this.f19514d = Environment.getExternalStorageDirectory();
                g();
                this.f19517g = true;
            }
        } finally {
            this.f19516f.unlock();
        }
    }

    public static synchronized a d() {
        try {
            if (f19509h == null) {
                f19509h = new a();
            }
        } catch (Throwable th) {
            throw th;
        }
        return f19509h;
    }

    private void e() {
        if (this.f19516f.tryLock()) {
            try {
                if (SystemClock.uptimeMillis() - this.f19515e > f19510i) {
                    g();
                }
            } finally {
                this.f19516f.unlock();
            }
        }
    }

    private void g() {
        this.f19511a = h(this.f19511a, this.f19512b);
        this.f19513c = h(this.f19513c, this.f19514d);
        this.f19515e = SystemClock.uptimeMillis();
    }

    private StatFs h(StatFs statFs, File file) {
        if (file != null && file.exists()) {
            try {
                if (statFs == null) {
                    return a(file.getAbsolutePath());
                }
                statFs.restat(file.getAbsolutePath());
                return statFs;
            } catch (IllegalArgumentException unused) {
            } catch (Throwable th) {
                throw p.a(th);
            }
        }
        return null;
    }

    public long c(EnumC0244a enumC0244a) {
        b();
        e();
        StatFs statFs = enumC0244a == EnumC0244a.INTERNAL ? this.f19511a : this.f19513c;
        if (statFs != null) {
            return statFs.getBlockSizeLong() * statFs.getAvailableBlocksLong();
        }
        return 0L;
    }

    public boolean f(EnumC0244a enumC0244a, long j10) {
        b();
        long jC = c(enumC0244a);
        return jC <= 0 || jC < j10;
    }
}
