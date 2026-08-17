package p379v1;

import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: renamed from: v1.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C4228b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final AtomicInteger f55704a;

    public C4228b(int i10) {
        this.f55704a = new AtomicInteger(i10);
    }

    public final int a() {
        return this.f55704a.decrementAndGet();
    }

    public final int b() {
        return this.f55704a.get();
    }

    public final int c() {
        return this.f55704a.getAndIncrement();
    }

    public final int d() {
        return this.f55704a.incrementAndGet();
    }
}
