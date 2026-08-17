package io.sentry;

/* JADX INFO: renamed from: io.sentry.q0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C3769q0 implements W {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Runtime f46312a = Runtime.getRuntime();

    @Override // io.sentry.W
    public void c() {
    }

    @Override // io.sentry.W
    public void d(C3754p1 c3754p1) {
        c3754p1.f(Long.valueOf(this.f46312a.totalMemory() - this.f46312a.freeMemory()));
    }
}
