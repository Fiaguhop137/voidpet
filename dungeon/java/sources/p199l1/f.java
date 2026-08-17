package p199l1;

import androidx.core.util.Pools$SimplePool;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public class f extends Pools$SimplePool {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Object f48590c;

    public f(int i10) {
        super(i10);
        this.f48590c = new Object();
    }

    @Override // androidx.core.util.Pools$SimplePool, p199l1.e
    public boolean a(Object instance) {
        boolean zA;
        Intrinsics.checkNotNullParameter(instance, "instance");
        synchronized (this.f48590c) {
            zA = super.a(instance);
        }
        return zA;
    }

    @Override // androidx.core.util.Pools$SimplePool, p199l1.e
    public Object acquire() {
        Object objAcquire;
        synchronized (this.f48590c) {
            objAcquire = super.acquire();
        }
        return objAcquire;
    }
}
