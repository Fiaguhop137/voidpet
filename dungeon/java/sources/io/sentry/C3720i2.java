package io.sentry;

/* JADX INFO: renamed from: io.sentry.i2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C3720i2 implements InterfaceC3755p2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final InterfaceC3755p2 f45892a;

    public C3720i2() {
        if (a()) {
            this.f45892a = new C3706f3();
        } else {
            this.f45892a = new C3786s3();
        }
    }

    private static boolean a() {
        return io.sentry.util.y.c() && io.sentry.util.y.b();
    }

    @Override // io.sentry.InterfaceC3755p2
    public AbstractC3750o2 now() {
        return this.f45892a.now();
    }
}
