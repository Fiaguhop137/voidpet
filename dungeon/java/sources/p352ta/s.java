package p352ta;

import java.util.Deque;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class s implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Runnable f54619a;

    public /* synthetic */ s(Runnable runnable) {
        this.f54619a = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        i.e((Deque) i.f54601b.get(), this.f54619a);
    }
}
