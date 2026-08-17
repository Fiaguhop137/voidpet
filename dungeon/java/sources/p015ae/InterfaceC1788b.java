package p015ae;

import java.util.Collection;

/* JADX INFO: renamed from: ae.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public interface InterfaceC1788b extends InterfaceC1787a, D {

    /* JADX INFO: renamed from: ae.b$a */
    public enum a {
        DECLARATION,
        FAKE_OVERRIDE,
        DELEGATION,
        SYNTHESIZED;

        public boolean e() {
            return this != FAKE_OVERRIDE;
        }
    }

    void D0(Collection collection);

    @Override // p015ae.InterfaceC1787a, p015ae.InterfaceC1799m
    InterfaceC1788b a();

    InterfaceC1788b c0(InterfaceC1799m interfaceC1799m, E e10, AbstractC1806u abstractC1806u, a aVar, boolean z10);

    @Override // p015ae.InterfaceC1787a
    Collection e();

    a j();
}
