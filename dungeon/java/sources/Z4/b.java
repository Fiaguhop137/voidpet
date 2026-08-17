package Z4;

import V4.k;

/* JADX INFO: loaded from: classes.dex */
public class b extends a {
    private b(i iVar, a.c cVar, Throwable th) {
        super(iVar, cVar, th);
    }

    b(Object obj, h hVar, a.c cVar, Throwable th) {
        super(obj, hVar, cVar, th, true);
    }

    @Override // Z4.a
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public a clone() {
        k.i(p());
        return new b(this.f18772b, this.f18773c, this.f18774d != null ? new Throwable() : null);
    }

    protected void finalize() throws Throwable {
        try {
            synchronized (this) {
                if (this.f18771a) {
                    super.finalize();
                    return;
                }
                Object objF = this.f18772b.f();
                W4.a.K("DefaultCloseableReference", "Finalized without closing: %x %x (type = %s)", Integer.valueOf(System.identityHashCode(this)), Integer.valueOf(System.identityHashCode(this.f18772b)), objF == null ? null : objF.getClass().getName());
                a.c cVar = this.f18773c;
                if (cVar != null) {
                    cVar.a(this.f18772b, this.f18774d);
                }
                close();
                super.finalize();
            }
        } catch (Throwable th) {
            super.finalize();
            throw th;
        }
    }
}
