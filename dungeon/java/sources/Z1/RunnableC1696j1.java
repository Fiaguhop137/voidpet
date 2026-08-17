package Z1;

import android.util.Pair;
import p236n2.C4027y;

/* JADX INFO: renamed from: Z1.j1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class RunnableC1696j1 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ o1.a f18307a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Pair f18308b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ C4027y f18309c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ p236n2.B f18310d;

    public /* synthetic */ RunnableC1696j1(o1.a aVar, Pair pair, C4027y c4027y, p236n2.B b10) {
        this.f18307a = aVar;
        this.f18308b = pair;
        this.f18309c = c4027y;
        this.f18310d = b10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        o1.a aVar = this.f18307a;
        Pair pair = this.f18308b;
        o1.this.f18403h.L(((Integer) pair.first).intValue(), (n2.D.b) pair.second, this.f18309c, this.f18310d);
    }
}
