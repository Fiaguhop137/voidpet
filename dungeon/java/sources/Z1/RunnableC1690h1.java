package Z1;

import android.util.Pair;

/* JADX INFO: renamed from: Z1.h1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class RunnableC1690h1 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ o1.a f18270a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Pair f18271b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ p236n2.B f18272c;

    public /* synthetic */ RunnableC1690h1(o1.a aVar, Pair pair, p236n2.B b10) {
        this.f18270a = aVar;
        this.f18271b = pair;
        this.f18272c = b10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        o1.a aVar = this.f18270a;
        Pair pair = this.f18271b;
        o1.this.f18403h.N(((Integer) pair.first).intValue(), (n2.D.b) pair.second, this.f18272c);
    }
}
