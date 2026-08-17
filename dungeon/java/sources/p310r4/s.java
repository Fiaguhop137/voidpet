package p310r4;

import java.util.HashMap;
import java.util.Map;
import p274p4.f;

/* JADX INFO: loaded from: classes.dex */
final class s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Map f52353a = new HashMap();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Map f52354b = new HashMap();

    s() {
    }

    private Map b(boolean z10) {
        return z10 ? this.f52354b : this.f52353a;
    }

    l a(f fVar, boolean z10) {
        return (l) b(z10).get(fVar);
    }

    void c(f fVar, l lVar) {
        b(lVar.p()).put(fVar, lVar);
    }

    void d(f fVar, l lVar) {
        Map mapB = b(lVar.p());
        if (lVar.equals(mapB.get(fVar))) {
            mapB.remove(fVar);
        }
    }
}
