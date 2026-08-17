package io.sentry.transport;

/* JADX INFO: loaded from: classes3.dex */
public final class m implements o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final o f46527a = new m();

    private m() {
    }

    public static o b() {
        return f46527a;
    }

    @Override // io.sentry.transport.o
    public final long a() {
        return System.currentTimeMillis();
    }
}
