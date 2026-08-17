package S2;

import android.util.SparseArray;
import p380v2.J;
import p380v2.O;

/* JADX INFO: loaded from: classes.dex */
public final class t implements p380v2.r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final p380v2.r f11532a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final s.a f11533b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final SparseArray f11534c = new SparseArray();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f11535d;

    public t(p380v2.r rVar, s.a aVar) {
        this.f11532a = rVar;
        this.f11533b = aVar;
    }

    @Override // p380v2.r
    public O f(int i10, int i11) {
        if (i11 != 3) {
            this.f11535d = true;
            return this.f11532a.f(i10, i11);
        }
        v vVar = (v) this.f11534c.get(i10);
        if (vVar != null) {
            return vVar;
        }
        v vVar2 = new v(this.f11532a.f(i10, i11), this.f11533b);
        this.f11534c.put(i10, vVar2);
        return vVar2;
    }

    @Override // p380v2.r
    public void p(J j10) {
        this.f11532a.p(j10);
    }

    @Override // p380v2.r
    public void t() {
        this.f11532a.t();
        if (this.f11535d) {
            for (int i10 = 0; i10 < this.f11534c.size(); i10++) {
                ((v) this.f11534c.valueAt(i10)).k(true);
            }
        }
    }
}
