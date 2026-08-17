package F3;

import kotlin.Unit;

/* JADX INFO: loaded from: classes.dex */
public final class g implements d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final j f2935a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final k f2936b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Object f2937c = new Object();

    public g(j jVar, k kVar) {
        this.f2935a = jVar;
        this.f2936b = kVar;
    }

    @Override // F3.d
    public long a() {
        long jA;
        synchronized (this.f2937c) {
            jA = this.f2935a.a();
        }
        return jA;
    }

    @Override // F3.d
    public d.c b(d.b bVar) {
        d.c cVarB;
        synchronized (this.f2937c) {
            try {
                cVarB = this.f2935a.b(bVar);
                if (cVarB == null) {
                    cVarB = this.f2936b.b(bVar);
                }
                if (cVarB != null && !cVarB.b().b()) {
                    c(bVar);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return cVarB;
    }

    public boolean c(d.b bVar) {
        boolean z10;
        synchronized (this.f2937c) {
            z10 = this.f2935a.c(bVar) || this.f2936b.c(bVar);
        }
        return z10;
    }

    @Override // F3.d
    public void clear() {
        synchronized (this.f2937c) {
            this.f2935a.clear();
            this.f2936b.clear();
            Unit unit = Unit.f48228a;
        }
    }

    @Override // F3.d
    public void e(long j10) {
        synchronized (this.f2937c) {
            this.f2935a.e(j10);
            Unit unit = Unit.f48228a;
        }
    }

    @Override // F3.d
    public void f(d.b bVar, d.c cVar) {
        synchronized (this.f2937c) {
            long jA = cVar.b().a();
            if (jA < 0) {
                throw new IllegalStateException(("Image size must be non-negative: " + jA).toString());
            }
            this.f2935a.d(bVar, cVar.b(), cVar.a(), jA);
            Unit unit = Unit.f48228a;
        }
    }
}
