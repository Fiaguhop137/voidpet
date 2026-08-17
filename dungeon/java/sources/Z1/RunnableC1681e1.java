package Z1;

import android.util.Pair;

/* JADX INFO: renamed from: Z1.e1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class RunnableC1681e1 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ o1.a f18247a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Pair f18248b;

    public /* synthetic */ RunnableC1681e1(o1.a aVar, Pair pair) {
        this.f18247a = aVar;
        this.f18248b = pair;
    }

    @Override // java.lang.Runnable
    public final void run() {
        o1.a aVar = this.f18247a;
        Pair pair = this.f18248b;
        o1.this.f18403h.F(((Integer) pair.first).intValue(), (n2.D.b) pair.second);
    }
}
