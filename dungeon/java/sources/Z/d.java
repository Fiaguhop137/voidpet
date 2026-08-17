package Z;

import O0.h;
import V.k;
import androidx.compose.ui.draw.ShadowGraphicsLayerElement;
import p037c0.g0;
import p037c0.t0;
import p037c0.x0;

/* JADX INFO: loaded from: classes.dex */
public abstract class d {
    public static final k a(k kVar, float f10, x0 x0Var, boolean z10, long j10, long j11) {
        return (h.i(f10, h.o((float) 0)) > 0 || z10) ? kVar.then(new ShadowGraphicsLayerElement(f10, x0Var, z10, j10, j11, null)) : kVar;
    }

    public static /* synthetic */ k b(k kVar, float f10, x0 x0Var, boolean z10, long j10, long j11, int i10, Object obj) {
        boolean z11;
        x0 x0VarA = (i10 & 2) != 0 ? t0.a() : x0Var;
        if ((i10 & 4) != 0) {
            z11 = false;
            if (h.i(f10, h.o(0)) > 0) {
                z11 = true;
            }
        } else {
            z11 = z10;
        }
        return a(kVar, f10, x0VarA, z11, (i10 & 8) != 0 ? g0.a() : j10, (i10 & 16) != 0 ? g0.a() : j11);
    }
}
