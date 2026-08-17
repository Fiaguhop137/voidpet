package U5;

import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class g implements Callable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Object f13133a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ j f13134b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ P4.d f13135c;

    public /* synthetic */ g(Object obj, j jVar, P4.d dVar) {
        this.f13133a = obj;
        this.f13134b = jVar;
        this.f13135c = dVar;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        return j.t(this.f13133a, this.f13134b, this.f13135c);
    }
}
