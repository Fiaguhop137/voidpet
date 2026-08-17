package p088ef;

import Ad.g;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* JADX INFO: loaded from: classes3.dex */
final class Z0 extends G0 {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final /* synthetic */ AtomicIntegerFieldUpdater f40809g = AtomicIntegerFieldUpdater.newUpdater(Z0.class, "_state$volatile");
    private volatile /* synthetic */ int _state$volatile;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Thread f40810e = Thread.currentThread();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private InterfaceC3286g0 f40811f;

    private final Void A(int i10) {
        throw new IllegalStateException(("Illegal state " + i10).toString());
    }

    public final void B(B0 b10) {
        int i10;
        this.f40811f = F0.m(b10, false, this, 1, null);
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f40809g;
        do {
            i10 = atomicIntegerFieldUpdater.get(this);
            if (i10 != 0) {
                if (i10 == 2 || i10 == 3) {
                    return;
                }
                A(i10);
                throw new g();
            }
        } while (!f40809g.compareAndSet(this, i10, 0));
    }

    @Override // p088ef.G0
    public boolean v() {
        return true;
    }

    @Override // p088ef.G0
    public void w(Throwable th) {
        int i10;
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f40809g;
        do {
            i10 = atomicIntegerFieldUpdater.get(this);
            if (i10 != 0) {
                if (i10 == 1 || i10 == 2 || i10 == 3) {
                    return;
                }
                A(i10);
                throw new g();
            }
        } while (!f40809g.compareAndSet(this, i10, 2));
        this.f40810e.interrupt();
        f40809g.set(this, 3);
    }

    public final void y() {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f40809g;
        while (true) {
            int i10 = atomicIntegerFieldUpdater.get(this);
            if (i10 != 0) {
                if (i10 != 2) {
                    if (i10 == 3) {
                        Thread.interrupted();
                        return;
                    } else {
                        A(i10);
                        throw new g();
                    }
                }
            } else if (f40809g.compareAndSet(this, i10, 1)) {
                InterfaceC3286g0 interfaceC3286g0 = this.f40811f;
                if (interfaceC3286g0 != null) {
                    interfaceC3286g0.dispose();
                    return;
                }
                return;
            }
        }
    }
}
