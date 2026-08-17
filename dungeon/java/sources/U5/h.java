package U5;

import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class h implements Callable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Object f13136a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ j f13137b;

    public /* synthetic */ h(Object obj, j jVar) {
        this.f13136a = obj;
        this.f13137b = jVar;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        return j.i(this.f13136a, this.f13137b);
    }
}
