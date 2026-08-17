package W1;

import U1.AbstractC1459a;
import U1.S;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public abstract class b implements f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final boolean f14459a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ArrayList f14460b = new ArrayList(1);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f14461c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private j f14462d;

    protected b(boolean z10) {
        this.f14459a = z10;
    }

    @Override // W1.f
    public final void j(x xVar) {
        AbstractC1459a.e(xVar);
        if (this.f14460b.contains(xVar)) {
            return;
        }
        this.f14460b.add(xVar);
        this.f14461c++;
    }

    protected final void p(int i10) {
        j jVar = (j) S.i(this.f14462d);
        for (int i11 = 0; i11 < this.f14461c; i11++) {
            ((x) this.f14460b.get(i11)).i(this, jVar, this.f14459a, i10);
        }
    }

    protected final void q() {
        j jVar = (j) S.i(this.f14462d);
        for (int i10 = 0; i10 < this.f14461c; i10++) {
            ((x) this.f14460b.get(i10)).g(this, jVar, this.f14459a);
        }
        this.f14462d = null;
    }

    protected final void r(j jVar) {
        for (int i10 = 0; i10 < this.f14461c; i10++) {
            ((x) this.f14460b.get(i10)).e(this, jVar, this.f14459a);
        }
    }

    protected final void s(j jVar) {
        this.f14462d = jVar;
        for (int i10 = 0; i10 < this.f14461c; i10++) {
            ((x) this.f14460b.get(i10)).h(this, jVar, this.f14459a);
        }
    }
}
