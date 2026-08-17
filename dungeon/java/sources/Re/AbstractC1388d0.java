package Re;

import java.io.IOException;
import java.util.Iterator;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.text.StringsKt;

/* JADX INFO: renamed from: Re.d0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC1388d0 extends M0 implements Ve.k, Ve.l {
    public AbstractC1388d0() {
        super(null);
    }

    public abstract AbstractC1388d0 U0(boolean z10);

    public abstract AbstractC1388d0 V0(r0 r0Var);

    public String toString() throws IOException {
        StringBuilder sb2 = new StringBuilder();
        Iterator it = getAnnotations().iterator();
        while (it.hasNext()) {
            StringsKt.m(sb2, "[", Ce.n.O(Ce.n.f1888k, (p033be.c) it.next(), null, 2, null), "] ");
        }
        sb2.append(N0());
        if (!L0().isEmpty()) {
            CollectionsKt___CollectionsKt.p0(L0(), sb2, (124 & 2) != 0 ? ", " : ", ", (124 & 4) != 0 ? "" : "<", (124 & 8) == 0 ? ">" : "", (124 & 16) != 0 ? -1 : 0, (124 & 32) != 0 ? "..." : null, (124 & 64) != 0 ? null : null);
        }
        if (O0()) {
            sb2.append("?");
        }
        return sb2.toString();
    }
}
