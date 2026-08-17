package p344t2;

import U1.InterfaceC1474p;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class p implements Executor {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ InterfaceC1474p f54321a;

    public /* synthetic */ p(InterfaceC1474p interfaceC1474p) {
        this.f54321a = interfaceC1474p;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        this.f54321a.h(runnable);
    }
}
