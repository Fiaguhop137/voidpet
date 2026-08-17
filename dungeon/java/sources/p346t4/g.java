package p346t4;

import L4.h;
import p274p4.f;
import p310r4.v;

/* JADX INFO: loaded from: classes.dex */
public class g extends h implements h {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private h.a f54453e;

    public g(long j10) {
        super(j10);
    }

    @Override // p346t4.h
    public void a(int i10) {
        if (i10 >= 40) {
            b();
        } else if (i10 >= 20 || i10 == 15) {
            m(h() / 2);
        }
    }

    @Override // p346t4.h
    public void c(h.a aVar) {
        this.f54453e = aVar;
    }

    @Override // p346t4.h
    public /* bridge */ /* synthetic */ v d(f fVar, v vVar) {
        return (v) super.k(fVar, vVar);
    }

    @Override // p346t4.h
    public /* bridge */ /* synthetic */ v e(f fVar) {
        return (v) super.l(fVar);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // L4.h
    /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
    public int i(v vVar) {
        return vVar == null ? super.i(null) : vVar.a();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // L4.h
    /* JADX INFO: renamed from: o, reason: merged with bridge method [inline-methods] */
    public void j(f fVar, v vVar) {
        h.a aVar = this.f54453e;
        if (aVar == null || vVar == null) {
            return;
        }
        aVar.b(vVar);
    }
}
