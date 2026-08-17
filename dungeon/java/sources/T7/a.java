package T7;

import L7.j;
import N7.o;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class a implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ c f12312a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ o f12313b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ j f12314c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ N7.i f12315d;

    public /* synthetic */ a(c cVar, o oVar, j jVar, N7.i iVar) {
        this.f12312a = cVar;
        this.f12313b = oVar;
        this.f12314c = jVar;
        this.f12315d = iVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        c.c(this.f12312a, this.f12313b, this.f12314c, this.f12315d);
    }
}
