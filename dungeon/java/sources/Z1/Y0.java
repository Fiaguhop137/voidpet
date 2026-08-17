package Z1;

import C9.AbstractC0876t;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class Y0 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Z0 f18202a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ AbstractC0876t.a f18203b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ n2.D.b f18204c;

    public /* synthetic */ Y0(Z0 z10, AbstractC0876t.a aVar, n2.D.b bVar) {
        this.f18202a = z10;
        this.f18203b = aVar;
        this.f18204c = bVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f18202a.f18208c.P(this.f18203b.k(), this.f18204c);
    }
}
