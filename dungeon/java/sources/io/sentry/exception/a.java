package io.sentry.exception;

import io.sentry.protocol.l;
import io.sentry.util.w;

/* JADX INFO: loaded from: classes3.dex */
public final class a extends RuntimeException {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final l f45819a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Throwable f45820b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Thread f45821c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final boolean f45822d;

    public a(l lVar, Throwable th, Thread thread) {
        this(lVar, th, thread, false);
    }

    public a(l lVar, Throwable th, Thread thread, boolean z10) {
        this.f45819a = (l) w.c(lVar, "Mechanism is required.");
        this.f45820b = (Throwable) w.c(th, "Throwable is required.");
        this.f45821c = (Thread) w.c(thread, "Thread is required.");
        this.f45822d = z10;
    }

    public l a() {
        return this.f45819a;
    }

    public Thread b() {
        return this.f45821c;
    }

    public Throwable c() {
        return this.f45820b;
    }

    public boolean d() {
        return this.f45822d;
    }
}
