package androidx.compose.ui.platform;

import java.lang.ref.Reference;
import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes.dex */
public final class i1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final K.c f22040a = new K.c(new Reference[16], 0);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ReferenceQueue f22041b = new ReferenceQueue();

    private final void a() {
        Reference referencePoll;
        do {
            referencePoll = this.f22041b.poll();
            if (referencePoll != null) {
                this.f22040a.p(referencePoll);
            }
        } while (referencePoll != null);
    }

    public final Object b() {
        a();
        while (this.f22040a.l() != 0) {
            K.c cVar = this.f22040a;
            Object obj = ((Reference) cVar.r(cVar.l() - 1)).get();
            if (obj != null) {
                return obj;
            }
        }
        return null;
    }

    public final void c(Object obj) {
        a();
        this.f22040a.b(new WeakReference(obj, this.f22041b));
    }
}
