package io.sentry;

/* JADX INFO: loaded from: classes3.dex */
public final class O0 implements X {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final O0 f44415a = new O0();

    private O0() {
    }

    public static O0 b() {
        return f44415a;
    }

    @Override // io.sentry.X
    public io.sentry.protocol.profiling.a a(String str) {
        return new io.sentry.protocol.profiling.a();
    }
}
