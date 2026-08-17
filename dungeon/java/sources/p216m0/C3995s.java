package p216m0;

import java.util.concurrent.CancellationException;

/* JADX INFO: renamed from: m0.s, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C3995s extends CancellationException {
    public C3995s(long j10) {
        super("Timed out waiting for " + j10 + " ms");
    }

    @Override // java.lang.Throwable
    public Throwable fillInStackTrace() {
        setStackTrace(T.f48819a);
        return this;
    }
}
