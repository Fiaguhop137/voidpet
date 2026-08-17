package Z1;

import android.util.Pair;

/* JADX INFO: renamed from: Z1.n1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class RunnableC1708n1 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ o1.a f18381a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Pair f18382b;

    public /* synthetic */ RunnableC1708n1(o1.a aVar, Pair pair) {
        this.f18381a = aVar;
        this.f18382b = pair;
    }

    @Override // java.lang.Runnable
    public final void run() {
        o1.a aVar = this.f18381a;
        Pair pair = this.f18382b;
        o1.this.f18403h.V(((Integer) pair.first).intValue(), (n2.D.b) pair.second);
    }
}
