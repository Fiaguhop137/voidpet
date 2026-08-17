package p088ef;

import java.util.concurrent.Executor;

/* JADX INFO: renamed from: ef.t0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC3311t0 {
    public static final Executor a(K k10) {
        Executor executorR0;
        AbstractC3307r0 abstractC3307r0 = k10 instanceof AbstractC3307r0 ? (AbstractC3307r0) k10 : null;
        return (abstractC3307r0 == null || (executorR0 = abstractC3307r0.r0()) == null) ? new ExecutorC3280d0(k10) : executorR0;
    }

    public static final K b(Executor executor) {
        K k10;
        ExecutorC3280d0 executorC3280d0 = executor instanceof ExecutorC3280d0 ? (ExecutorC3280d0) executor : null;
        return (executorC3280d0 == null || (k10 = executorC3280d0.f40818a) == null) ? new C3309s0(executor) : k10;
    }
}
