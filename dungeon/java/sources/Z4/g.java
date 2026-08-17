package Z4;

import V4.k;

/* JADX INFO: loaded from: classes.dex */
public class g extends a {
    private g(i iVar, a.c cVar, Throwable th) {
        super(iVar, cVar, th);
    }

    g(Object obj, h hVar, a.c cVar, Throwable th) {
        super(obj, hVar, cVar, th, false);
    }

    @Override // Z4.a
    /* JADX INFO: renamed from: c */
    public a clone() {
        k.i(p());
        return new g(this.f18772b, this.f18773c, this.f18774d);
    }
}
