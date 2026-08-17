package com.google.android.gms.internal.play_billing;

import java.util.Locale;
import java.util.concurrent.TimeUnit;

/* JADX INFO: renamed from: com.google.android.gms.internal.play_billing.z, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C2903z {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final C f34825a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f34826b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private long f34827c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private long f34828d;

    C2903z(C c10) {
        AbstractC2895x.c(c10, "ticker");
        this.f34825a = c10;
    }

    public static C2903z b(C c10) {
        C2903z c2903z = new C2903z(c10);
        c2903z.e();
        return c2903z;
    }

    public static C2903z c(C c10) {
        return new C2903z(c10);
    }

    private final long h() {
        return this.f34826b ? (this.f34825a.a() - this.f34828d) + this.f34827c : this.f34827c;
    }

    public final long a(TimeUnit timeUnit) {
        return timeUnit.convert(h(), TimeUnit.NANOSECONDS);
    }

    public final C2903z d() {
        this.f34827c = 0L;
        this.f34826b = false;
        return this;
    }

    public final C2903z e() {
        AbstractC2895x.e(!this.f34826b, "This stopwatch is already running.");
        this.f34826b = true;
        this.f34828d = this.f34825a.a();
        return this;
    }

    public final C2903z f() {
        long jA = this.f34825a.a();
        AbstractC2895x.e(this.f34826b, "This stopwatch is already stopped.");
        this.f34826b = false;
        this.f34827c += jA - this.f34828d;
        return this;
    }

    public final boolean g() {
        return this.f34826b;
    }

    public final String toString() {
        String str;
        long jH = h();
        TimeUnit timeUnit = TimeUnit.DAYS;
        TimeUnit timeUnit2 = TimeUnit.NANOSECONDS;
        if (timeUnit.convert(jH, timeUnit2) <= 0) {
            timeUnit = TimeUnit.HOURS;
            if (timeUnit.convert(jH, timeUnit2) <= 0) {
                timeUnit = TimeUnit.MINUTES;
                if (timeUnit.convert(jH, timeUnit2) <= 0) {
                    timeUnit = TimeUnit.SECONDS;
                    if (timeUnit.convert(jH, timeUnit2) <= 0) {
                        timeUnit = TimeUnit.MILLISECONDS;
                        if (timeUnit.convert(jH, timeUnit2) <= 0) {
                            timeUnit = TimeUnit.MICROSECONDS;
                            if (timeUnit.convert(jH, timeUnit2) <= 0) {
                                timeUnit = timeUnit2;
                            }
                        }
                    }
                }
            }
        }
        String str2 = String.format(Locale.ROOT, "%.4g", Double.valueOf(jH / timeUnit2.convert(1L, timeUnit)));
        switch (AbstractC2899y.f34823a[timeUnit.ordinal()]) {
            case 1:
                str = "ns";
                break;
            case 2:
                str = "μs";
                break;
            case 3:
                str = "ms";
                break;
            case 4:
                str = "s";
                break;
            case 5:
                str = "min";
                break;
            case 6:
                str = "h";
                break;
            case 7:
                str = "d";
                break;
            default:
                throw new AssertionError();
        }
        return str2 + " " + str;
    }
}
