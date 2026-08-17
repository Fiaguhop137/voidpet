package p177jf;

import p124gf.a;
import p142hf.H;
import p142hf.y;

/* JADX INFO: loaded from: classes3.dex */
final class x extends y implements H {
    public x(int i10) {
        super(1, Integer.MAX_VALUE, a.DROP_OLDEST);
        b(Integer.valueOf(i10));
    }

    @Override // p142hf.H
    /* JADX INFO: renamed from: Y, reason: merged with bridge method [inline-methods] */
    public Integer getValue() {
        Integer numValueOf;
        synchronized (this) {
            numValueOf = Integer.valueOf(((Number) L()).intValue());
        }
        return numValueOf;
    }

    public final boolean Z(int i10) {
        boolean zB;
        synchronized (this) {
            zB = b(Integer.valueOf(((Number) L()).intValue() + i10));
        }
        return zB;
    }
}
