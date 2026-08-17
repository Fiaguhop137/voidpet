package V6;

import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class i implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Callable f14123a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ o f14124b;

    public /* synthetic */ i(Callable callable, o oVar) {
        this.f14123a = callable;
        this.f14124b = oVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        n.a.i(this.f14123a, this.f14124b);
    }
}
