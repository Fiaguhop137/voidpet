package O0;

/* JADX INFO: loaded from: classes.dex */
public interface l {
    default long P(float f10) {
        P0.b bVar = P0.b.f8570a;
        if (!bVar.f(b1())) {
            return w.c(f10 / b1());
        }
        P0.a aVarB = bVar.b(b1());
        return w.c(aVarB != null ? aVarB.a(f10) : f10 / b1());
    }

    default float S(long j10) {
        if (!x.g(v.g(j10), x.f8301b.b())) {
            m.b("Only Sp can convert to Px");
        }
        P0.b bVar = P0.b.f8570a;
        if (!bVar.f(b1())) {
            return h.o(v.h(j10) * b1());
        }
        P0.a aVarB = bVar.b(b1());
        float fH = v.h(j10);
        return aVarB == null ? h.o(fH * b1()) : h.o(aVarB.b(fH));
    }

    float b1();
}
