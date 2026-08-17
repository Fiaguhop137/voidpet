package Z1;

import U1.AbstractC1459a;
import android.util.Pair;

/* JADX INFO: renamed from: Z1.c1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class RunnableC1675c1 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ o1.a f18233a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Pair f18234b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ p236n2.B f18235c;

    public /* synthetic */ RunnableC1675c1(o1.a aVar, Pair pair, p236n2.B b10) {
        this.f18233a = aVar;
        this.f18234b = pair;
        this.f18235c = b10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        o1.a aVar = this.f18233a;
        Pair pair = this.f18234b;
        o1.this.f18403h.f0(((Integer) pair.first).intValue(), (n2.D.b) AbstractC1459a.e((n2.D.b) pair.second), this.f18235c);
    }
}
