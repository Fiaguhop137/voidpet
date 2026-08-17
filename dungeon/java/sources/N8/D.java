package N8;

import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class D implements Callable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ F f7987a;

    public /* synthetic */ D(F f10) {
        this.f7987a = f10;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        return this.f7987a.a();
    }
}
