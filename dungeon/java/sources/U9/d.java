package U9;

import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class d implements Callable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ f f13400a;

    public /* synthetic */ d(f fVar) {
        this.f13400a = fVar;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        return f.c(this.f13400a);
    }
}
