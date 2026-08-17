package p352ta;

import java.lang.ref.ReferenceQueue;
import java.util.Set;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class n implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ReferenceQueue f54611a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Set f54612b;

    public /* synthetic */ n(ReferenceQueue referenceQueue, Set set) {
        this.f54611a = referenceQueue;
        this.f54612b = set;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ReferenceQueue referenceQueue = this.f54611a;
        while (!this.f54612b.isEmpty()) {
            try {
                ((p) referenceQueue.remove()).a();
            } catch (InterruptedException unused) {
            }
        }
    }
}
