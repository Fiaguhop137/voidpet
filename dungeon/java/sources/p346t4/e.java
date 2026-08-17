package p346t4;

import android.util.Log;
import java.io.File;
import java.io.IOException;
import p202l4.b;
import p274p4.f;

/* JADX INFO: loaded from: classes.dex */
public class e implements a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final File f54447b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final long f54448c;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private b f54450e;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final c f54449d = new c();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final j f54446a = new j();

    protected e(File file, long j10) {
        this.f54447b = file;
        this.f54448c = j10;
    }

    public static a c(File file, long j10) {
        return new e(file, j10);
    }

    private synchronized b d() {
        try {
            if (this.f54450e == null) {
                this.f54450e = b.z(this.f54447b, 1, 1, this.f54448c);
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.f54450e;
    }

    private synchronized void e() {
        this.f54450e = null;
    }

    @Override // p346t4.a
    public File a(f fVar) {
        String strB = this.f54446a.b(fVar);
        if (Log.isLoggable("DiskLruCacheWrapper", 2)) {
            Log.v("DiskLruCacheWrapper", "Get: Obtained: " + strB + " for for Key: " + fVar);
        }
        try {
            b.e eVarU = d().u(strB);
            if (eVarU != null) {
                return eVarU.a(0);
            }
            return null;
        } catch (IOException e10) {
            if (!Log.isLoggable("DiskLruCacheWrapper", 5)) {
                return null;
            }
            Log.w("DiskLruCacheWrapper", "Unable to get from disk cache", e10);
            return null;
        }
    }

    @Override // p346t4.a
    public void b(f fVar, a.b bVar) {
        String strB = this.f54446a.b(fVar);
        this.f54449d.a(strB);
        try {
            if (Log.isLoggable("DiskLruCacheWrapper", 2)) {
                Log.v("DiskLruCacheWrapper", "Put: Obtained: " + strB + " for for Key: " + fVar);
            }
            try {
                b bVarD = d();
                if (bVarD.u(strB) == null) {
                    b.c cVarR = bVarD.r(strB);
                    if (cVarR == null) {
                        throw new IllegalStateException("Had two simultaneous puts for: " + strB);
                    }
                    try {
                        if (bVar.a(cVarR.f(0))) {
                            cVarR.e();
                        }
                        cVarR.b();
                    } catch (Throwable th) {
                        cVarR.b();
                        throw th;
                    }
                }
            } catch (IOException e10) {
                if (Log.isLoggable("DiskLruCacheWrapper", 5)) {
                    Log.w("DiskLruCacheWrapper", "Unable to put to disk cache", e10);
                }
            }
            this.f54449d.b(strB);
        } catch (Throwable th2) {
            this.f54449d.b(strB);
            throw th2;
        }
    }

    @Override // p346t4.a
    public synchronized void clear() {
        try {
            try {
                d().o();
            } catch (IOException e10) {
                if (Log.isLoggable("DiskLruCacheWrapper", 5)) {
                    Log.w("DiskLruCacheWrapper", "Unable to clear disk cache or disk cache cleared externally", e10);
                }
            }
            e();
        } catch (Throwable th) {
            e();
            throw th;
        }
    }
}
