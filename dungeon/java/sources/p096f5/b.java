package p096f5;

/* JADX INFO: loaded from: classes.dex */
public abstract class b implements e {
    @Override // p096f5.e
    public void a(c cVar) {
    }

    @Override // p096f5.e
    public void b(c cVar) {
        try {
            e(cVar);
        } finally {
            cVar.close();
        }
    }

    @Override // p096f5.e
    public void c(c cVar) {
        boolean zA = cVar.a();
        try {
            f(cVar);
        } finally {
            if (zA) {
                cVar.close();
            }
        }
    }

    @Override // p096f5.e
    public void d(c cVar) {
    }

    protected abstract void e(c cVar);

    protected abstract void f(c cVar);
}
