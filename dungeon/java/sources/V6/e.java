package V6;

import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class e implements a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ o f14115a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ a f14116b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Executor f14117c;

    public /* synthetic */ e(o oVar, a aVar, Executor executor) {
        this.f14115a = oVar;
        this.f14116b = aVar;
        this.f14117c = executor;
    }

    @Override // V6.a
    public final Object a(n nVar) {
        return n.q(this.f14115a, this.f14116b, this.f14117c, nVar);
    }
}
