package p119ga;

import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes2.dex */
public final class e extends f implements Iterable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ArrayList f42280a = new ArrayList();

    public boolean equals(Object obj) {
        if (obj != this) {
            return (obj instanceof e) && ((e) obj).f42280a.equals(this.f42280a);
        }
        return true;
    }

    public int hashCode() {
        return this.f42280a.hashCode();
    }

    @Override // java.lang.Iterable
    public Iterator iterator() {
        return this.f42280a.iterator();
    }

    public void k(f fVar) {
        if (fVar == null) {
            fVar = h.f42281a;
        }
        this.f42280a.add(fVar);
    }
}
