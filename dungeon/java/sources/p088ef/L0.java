package p088ef;

import p195kf.AbstractC3934l;

/* JADX INFO: loaded from: classes3.dex */
public abstract class L0 extends K {
    @Override // p088ef.K
    public K m0(int i10, String str) {
        AbstractC3934l.a(i10);
        return AbstractC3934l.b(this, str);
    }

    public abstract L0 r0();

    protected final String s0() {
        L0 l0R0;
        L0 l0C = C3282e0.c();
        if (this == l0C) {
            return "Dispatchers.Main";
        }
        try {
            l0R0 = l0C.r0();
        } catch (UnsupportedOperationException unused) {
            l0R0 = null;
        }
        if (this == l0R0) {
            return "Dispatchers.Main.immediate";
        }
        return null;
    }
}
