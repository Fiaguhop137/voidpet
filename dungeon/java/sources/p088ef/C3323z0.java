package p088ef;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: ef.z0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
final class C3323z0 extends G0 {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final /* synthetic */ AtomicIntegerFieldUpdater f40876f = AtomicIntegerFieldUpdater.newUpdater(C3323z0.class, "_invoked$volatile");
    private volatile /* synthetic */ int _invoked$volatile = 0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Function1 f40877e;

    public C3323z0(Function1 function1) {
        this.f40877e = function1;
    }

    @Override // p088ef.G0
    public boolean v() {
        return true;
    }

    @Override // p088ef.G0
    public void w(Throwable th) {
        if (f40876f.compareAndSet(this, 0, 1)) {
            this.f40877e.invoke(th);
        }
    }
}
