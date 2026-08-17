package V6;

import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class g implements a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ o f14119a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ a f14120b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Executor f14121c;

    public /* synthetic */ g(o oVar, a aVar, Executor executor) {
        this.f14119a = oVar;
        this.f14120b = aVar;
        this.f14121c = executor;
    }

    @Override // V6.a
    public final Object a(n nVar) {
        return n.n(this.f14119a, this.f14120b, this.f14121c, nVar);
    }
}
