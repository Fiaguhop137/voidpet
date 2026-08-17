package io.sentry;

/* JADX INFO: loaded from: classes3.dex */
public final class N0 implements ILogger {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final N0 f44411a = new N0();

    private N0() {
    }

    public static N0 e() {
        return f44411a;
    }

    @Override // io.sentry.ILogger
    public void a(EnumC3721i3 enumC3721i3, Throwable th, String str, Object... objArr) {
    }

    @Override // io.sentry.ILogger
    public void b(EnumC3721i3 enumC3721i3, String str, Throwable th) {
    }

    @Override // io.sentry.ILogger
    public void c(EnumC3721i3 enumC3721i3, String str, Object... objArr) {
    }

    @Override // io.sentry.ILogger
    public boolean d(EnumC3721i3 enumC3721i3) {
        return false;
    }
}
