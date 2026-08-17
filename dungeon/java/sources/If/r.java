package If;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public abstract class r implements a0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final a0 f5552a;

    public r(a0 delegate) {
        Intrinsics.checkNotNullParameter(delegate, "delegate");
        this.f5552a = delegate;
    }

    @Override // If.a0
    public b0 C() {
        return this.f5552a.C();
    }

    public final a0 a() {
        return this.f5552a;
    }

    @Override // If.a0, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.f5552a.close();
    }

    @Override // If.a0
    public long o0(C1106h sink, long j10) {
        Intrinsics.checkNotNullParameter(sink, "sink");
        return this.f5552a.o0(sink, j10);
    }

    public String toString() {
        return getClass().getSimpleName() + '(' + this.f5552a + ')';
    }
}
