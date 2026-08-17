package p088ef;

import Ed.b;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* JADX INFO: renamed from: ef.s, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C3308s extends C {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final /* synthetic */ AtomicIntegerFieldUpdater f40866c = AtomicIntegerFieldUpdater.newUpdater(C3308s.class, "_resumed$volatile");
    private volatile /* synthetic */ int _resumed$volatile;

    public C3308s(b bVar, Throwable th, boolean z10) {
        if (th == null) {
            th = new CancellationException("Continuation " + bVar + " was cancelled normally");
        }
        super(th, z10);
        this._resumed$volatile = 0;
    }

    public final boolean e() {
        return f40866c.compareAndSet(this, 0, 1);
    }
}
