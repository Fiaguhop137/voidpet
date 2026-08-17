package Z1;

import android.util.Pair;

/* JADX INFO: renamed from: Z1.k1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class RunnableC1699k1 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ o1.a f18317a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Pair f18318b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f18319c;

    public /* synthetic */ RunnableC1699k1(o1.a aVar, Pair pair, int i10) {
        this.f18317a = aVar;
        this.f18318b = pair;
        this.f18319c = i10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        o1.a aVar = this.f18317a;
        Pair pair = this.f18318b;
        o1.this.f18403h.l0(((Integer) pair.first).intValue(), (n2.D.b) pair.second, this.f18319c);
    }
}
