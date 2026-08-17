package p093f2;

import U1.K;
import android.util.SparseArray;

/* JADX INFO: loaded from: classes.dex */
public final class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final SparseArray f41697a = new SparseArray();

    public K a(int i10) {
        K k10 = (K) this.f41697a.get(i10);
        if (k10 != null) {
            return k10;
        }
        K k11 = new K(9223372036854775806L);
        this.f41697a.put(i10, k11);
        return k11;
    }

    public void b() {
        this.f41697a.clear();
    }
}
