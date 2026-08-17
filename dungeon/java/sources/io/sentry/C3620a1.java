package io.sentry;

import java.util.concurrent.Future;
import java.util.concurrent.FutureTask;

/* JADX INFO: renamed from: io.sentry.a1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C3620a1 implements InterfaceC3693d0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final C3620a1 f44551a = new C3620a1();

    private C3620a1() {
    }

    public static /* synthetic */ Object d() {
        return null;
    }

    public static /* synthetic */ Object e() {
        return null;
    }

    public static InterfaceC3693d0 f() {
        return f44551a;
    }

    @Override // io.sentry.InterfaceC3693d0
    public void a(long j10) {
    }

    @Override // io.sentry.InterfaceC3693d0
    public void b() {
    }

    @Override // io.sentry.InterfaceC3693d0
    public Future c(Runnable runnable, long j10) {
        return new FutureTask(new Z0());
    }

    @Override // io.sentry.InterfaceC3693d0
    public boolean isClosed() {
        return false;
    }

    @Override // io.sentry.InterfaceC3693d0
    public Future submit(Runnable runnable) {
        return new FutureTask(new Y0());
    }
}
