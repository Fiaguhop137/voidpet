package If;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: If.q, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC1115q implements Y {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Y f5551a;

    public AbstractC1115q(Y delegate) {
        Intrinsics.checkNotNullParameter(delegate, "delegate");
        this.f5551a = delegate;
    }

    @Override // If.Y
    public b0 C() {
        return this.f5551a.C();
    }

    @Override // If.Y, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.f5551a.close();
    }

    @Override // If.Y, java.io.Flushable
    public void flush() {
        this.f5551a.flush();
    }

    public String toString() {
        return getClass().getSimpleName() + '(' + this.f5551a + ')';
    }

    @Override // If.Y
    public void w1(C1106h source, long j10) {
        Intrinsics.checkNotNullParameter(source, "source");
        this.f5551a.w1(source, j10);
    }
}
