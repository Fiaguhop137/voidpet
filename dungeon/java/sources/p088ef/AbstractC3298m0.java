package p088ef;

import java.util.concurrent.locks.LockSupport;

/* JADX INFO: renamed from: ef.m0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC3298m0 extends AbstractC3294k0 {
    protected abstract Thread T0();

    protected void V0(long j10, AbstractC3296l0.c cVar) {
        U.f40801i.t1(j10, cVar);
    }

    protected final void W0() {
        Thread threadT0 = T0();
        if (Thread.currentThread() != threadT0) {
            AbstractC3277c.a();
            LockSupport.unpark(threadT0);
        }
    }
}
