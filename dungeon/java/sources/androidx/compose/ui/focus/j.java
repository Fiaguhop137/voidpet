package androidx.compose.ui.focus;

import p324s0.InterfaceC4144j;

/* JADX INFO: loaded from: classes.dex */
public interface j extends InterfaceC4144j {
    static /* synthetic */ boolean h0(j jVar, int i10, int i11, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: requestFocus-3ESFkO8");
        }
        if ((i11 & 1) != 0) {
            i10 = b.f21373b.b();
        }
        return jVar.J(i10);
    }

    boolean J(int i10);

    p001a0.n Q();
}
