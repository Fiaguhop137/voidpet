package U9;

import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class e implements Callable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ f f13401a;

    public /* synthetic */ e(f fVar) {
        this.f13401a = fVar;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        return f.f(this.f13401a);
    }
}
