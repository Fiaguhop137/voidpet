package p352ta;

import java.lang.ref.PhantomReference;
import java.lang.ref.ReferenceQueue;
import java.util.Set;

/* JADX INFO: loaded from: classes2.dex */
final class p extends PhantomReference implements a.InterfaceC0676a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Set f54613a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Runnable f54614b;

    /* synthetic */ p(Object obj, ReferenceQueue referenceQueue, Set set, Runnable runnable, o oVar) {
        super(obj, referenceQueue);
        this.f54613a = set;
        this.f54614b = runnable;
    }

    @Override // p352ta.a.InterfaceC0676a
    public final void a() {
        if (this.f54613a.remove(this)) {
            clear();
            this.f54614b.run();
        }
    }
}
