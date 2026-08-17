package p195kf;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import kotlin.coroutines.CoroutineContext;
import p088ef.P0;

/* JADX INFO: loaded from: classes3.dex */
public abstract class A extends AbstractC3924b implements P0 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final /* synthetic */ AtomicIntegerFieldUpdater f48120d = AtomicIntegerFieldUpdater.newUpdater(A.class, "cleanedAndPointers$volatile");

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f48121c;
    private volatile /* synthetic */ int cleanedAndPointers$volatile;

    public A(long j10, A a10, int i10) {
        super(a10);
        this.f48121c = j10;
        this.cleanedAndPointers$volatile = i10 << 16;
    }

    @Override // p195kf.AbstractC3924b
    public boolean k() {
        return f48120d.get(this) == r() && !l();
    }

    public final boolean p() {
        return f48120d.addAndGet(this, -65536) == r() && !l();
    }

    public abstract int r();

    public abstract void s(int i10, Throwable th, CoroutineContext coroutineContext);

    public final void t() {
        if (f48120d.incrementAndGet(this) == r()) {
            n();
        }
    }

    public final boolean u() {
        int i10;
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f48120d;
        do {
            i10 = atomicIntegerFieldUpdater.get(this);
            if (i10 == r() && !l()) {
                return false;
            }
        } while (!atomicIntegerFieldUpdater.compareAndSet(this, i10, 65536 + i10));
        return true;
    }
}
