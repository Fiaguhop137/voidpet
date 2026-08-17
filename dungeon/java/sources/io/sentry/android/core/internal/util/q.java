package io.sentry.android.core.internal.util;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: loaded from: classes3.dex */
public class q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final long f45057a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final io.sentry.transport.o f45058b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f45060d;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final AtomicInteger f45059c = new AtomicInteger(0);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final AtomicLong f45061e = new AtomicLong(0);

    public q(io.sentry.transport.o oVar, long j10, int i10) {
        this.f45058b = oVar;
        this.f45057a = j10;
        this.f45060d = i10 <= 0 ? 1 : i10;
    }

    public boolean a() {
        long jA = this.f45058b.a();
        if (this.f45061e.get() == 0 || this.f45061e.get() + this.f45057a <= jA) {
            this.f45059c.set(0);
            this.f45061e.set(jA);
            return false;
        }
        if (this.f45059c.incrementAndGet() < this.f45060d) {
            return false;
        }
        this.f45059c.set(0);
        return true;
    }
}
