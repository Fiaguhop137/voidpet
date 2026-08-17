package io.sentry.android.core;

import android.os.SystemClock;
import android.system.Os;
import android.system.OsConstants;
import io.sentry.C3754p1;
import io.sentry.EnumC3721i3;
import io.sentry.ILogger;
import io.sentry.util.AbstractC3807i;
import java.io.File;
import java.io.IOException;
import java.util.regex.Pattern;

/* JADX INFO: renamed from: io.sentry.android.core.w, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C3674w implements io.sentry.W {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final ILogger f45204h;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private long f45197a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private long f45198b = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private long f45199c = 1;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private long f45200d = 1;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final long f45201e = 1000000000;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private double f45202f = 1.0E9d / 1;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final File f45203g = new File("/proc/self/stat");

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private boolean f45205i = false;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final Pattern f45206j = Pattern.compile("[\n\t\r ]");

    public C3674w(ILogger iLogger) {
        this.f45204h = (ILogger) io.sentry.util.w.c(iLogger, "Logger is required.");
    }

    private long e() {
        String strC;
        try {
            strC = AbstractC3807i.c(this.f45203g);
        } catch (IOException e10) {
            this.f45205i = false;
            this.f45204h.b(EnumC3721i3.WARNING, "Unable to read /proc/self/stat file. Disabling cpu collection.", e10);
            strC = null;
        }
        if (strC != null) {
            String[] strArrSplit = this.f45206j.split(strC.trim());
            try {
                return (long) ((Long.parseLong(strArrSplit[13]) + Long.parseLong(strArrSplit[14]) + Long.parseLong(strArrSplit[15]) + Long.parseLong(strArrSplit[16])) * this.f45202f);
            } catch (ArrayIndexOutOfBoundsException | NumberFormatException e11) {
                this.f45204h.b(EnumC3721i3.ERROR, "Error parsing /proc/self/stat file.", e11);
            }
        }
        return 0L;
    }

    @Override // io.sentry.W
    public void c() {
        this.f45205i = true;
        this.f45199c = Os.sysconf(OsConstants._SC_CLK_TCK);
        this.f45200d = Os.sysconf(OsConstants._SC_NPROCESSORS_CONF);
        this.f45202f = 1.0E9d / this.f45199c;
        this.f45198b = e();
    }

    @Override // io.sentry.W
    public void d(C3754p1 c3754p1) {
        if (this.f45205i) {
            long jElapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos();
            long j10 = jElapsedRealtimeNanos - this.f45197a;
            this.f45197a = jElapsedRealtimeNanos;
            long jE = e();
            long j11 = jE - this.f45198b;
            this.f45198b = jE;
            c3754p1.e(Double.valueOf(((j11 / j10) / this.f45200d) * 100.0d));
        }
    }
}
