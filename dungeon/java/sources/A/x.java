package A;

import p324s0.r0;

/* JADX INFO: loaded from: classes.dex */
public final class x extends V.k.c implements r0 {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private V.d.b f104o;

    public x(V.d.b bVar) {
        this.f104o = bVar;
    }

    @Override // p324s0.r0
    /* JADX INFO: renamed from: W1, reason: merged with bridge method [inline-methods] */
    public J T0(O0.d dVar, Object obj) {
        J j10 = obj instanceof J ? (J) obj : null;
        if (j10 == null) {
            j10 = new J(0.0f, false, null, null, 15, null);
        }
        j10.e(AbstractC0785u.f91a.a(this.f104o));
        return j10;
    }

    public final void X1(V.d.b bVar) {
        this.f104o = bVar;
    }
}
