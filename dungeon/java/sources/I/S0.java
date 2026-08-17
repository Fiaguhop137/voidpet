package I;

/* JADX INFO: loaded from: classes.dex */
public interface S0 extends L.f, I, E {

    public interface a extends L.f.a {
        @Override // L.f.a
        S0 build();
    }

    @Override // L.f
    a builder();

    @Override // I.E
    default Object j(D d10) {
        return J.b(this, d10);
    }

    S0 l(D d10, i2 i2Var);
}
