package Z1;

import android.util.Pair;

/* JADX INFO: renamed from: Z1.g1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class RunnableC1687g1 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ o1.a f18257a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Pair f18258b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Exception f18259c;

    public /* synthetic */ RunnableC1687g1(o1.a aVar, Pair pair, Exception exc) {
        this.f18257a = aVar;
        this.f18258b = pair;
        this.f18259c = exc;
    }

    @Override // java.lang.Runnable
    public final void run() {
        o1.a aVar = this.f18257a;
        Pair pair = this.f18258b;
        o1.this.f18403h.o0(((Integer) pair.first).intValue(), (n2.D.b) pair.second, this.f18259c);
    }
}
