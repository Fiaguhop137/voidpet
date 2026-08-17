package Z1;

import android.util.Pair;
import p236n2.C4027y;

/* JADX INFO: renamed from: Z1.l1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class RunnableC1702l1 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ o1.a f18347a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Pair f18348b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ C4027y f18349c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ p236n2.B f18350d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f18351e;

    public /* synthetic */ RunnableC1702l1(o1.a aVar, Pair pair, C4027y c4027y, p236n2.B b10, int i10) {
        this.f18347a = aVar;
        this.f18348b = pair;
        this.f18349c = c4027y;
        this.f18350d = b10;
        this.f18351e = i10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        o1.a aVar = this.f18347a;
        Pair pair = this.f18348b;
        o1.this.f18403h.h0(((Integer) pair.first).intValue(), (n2.D.b) pair.second, this.f18349c, this.f18350d, this.f18351e);
    }
}
