package Qe;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public class d implements k {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Lock f9572b;

    public d(Lock lock) {
        Intrinsics.checkNotNullParameter(lock, "lock");
        this.f9572b = lock;
    }

    public /* synthetic */ d(Lock lock, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? new ReentrantLock() : lock);
    }

    protected final Lock a() {
        return this.f9572b;
    }

    @Override // Qe.k
    public void lock() {
        this.f9572b.lock();
    }

    @Override // Qe.k
    public void unlock() {
        this.f9572b.unlock();
    }
}
