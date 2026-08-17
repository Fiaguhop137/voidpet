package U5;

import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class f implements Callable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Object f13129a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ AtomicBoolean f13130b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ j f13131c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ P4.d f13132d;

    public /* synthetic */ f(Object obj, AtomicBoolean atomicBoolean, j jVar, P4.d dVar) {
        this.f13129a = obj;
        this.f13130b = atomicBoolean;
        this.f13131c = jVar;
        this.f13132d = dVar;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        return j.o(this.f13129a, this.f13130b, this.f13131c, this.f13132d);
    }
}
