package p119ga;

import java.util.Set;
import p155ia.h;

/* JADX INFO: loaded from: classes2.dex */
public final class i extends f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final h f42282a = new h(false);

    public boolean equals(Object obj) {
        if (obj != this) {
            return (obj instanceof i) && ((i) obj).f42282a.equals(this.f42282a);
        }
        return true;
    }

    public int hashCode() {
        return this.f42282a.hashCode();
    }

    public void k(String str, f fVar) {
        h hVar = this.f42282a;
        if (fVar == null) {
            fVar = h.f42281a;
        }
        hVar.put(str, fVar);
    }

    public Set l() {
        return this.f42282a.entrySet();
    }
}
