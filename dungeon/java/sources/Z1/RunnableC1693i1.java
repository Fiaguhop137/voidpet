package Z1;

import android.util.Pair;

/* JADX INFO: renamed from: Z1.i1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class RunnableC1693i1 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ o1.a f18292a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Pair f18293b;

    public /* synthetic */ RunnableC1693i1(o1.a aVar, Pair pair) {
        this.f18292a = aVar;
        this.f18293b = pair;
    }

    @Override // java.lang.Runnable
    public final void run() {
        o1.a aVar = this.f18292a;
        Pair pair = this.f18293b;
        o1.this.f18403h.H(((Integer) pair.first).intValue(), (n2.D.b) pair.second);
    }
}
