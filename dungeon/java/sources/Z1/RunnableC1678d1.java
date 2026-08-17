package Z1;

import android.util.Pair;

/* JADX INFO: renamed from: Z1.d1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class RunnableC1678d1 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ o1.a f18238a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Pair f18239b;

    public /* synthetic */ RunnableC1678d1(o1.a aVar, Pair pair) {
        this.f18238a = aVar;
        this.f18239b = pair;
    }

    @Override // java.lang.Runnable
    public final void run() {
        o1.a aVar = this.f18238a;
        Pair pair = this.f18239b;
        o1.this.f18403h.c0(((Integer) pair.first).intValue(), (n2.D.b) pair.second);
    }
}
