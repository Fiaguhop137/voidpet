package p195kf;

import p088ef.K;

/* JADX INFO: renamed from: kf.l, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC3934l {
    public static final void a(int i10) {
        if (i10 >= 1) {
            return;
        }
        throw new IllegalArgumentException(("Expected positive parallelism level, but got " + i10).toString());
    }

    public static final K b(K k10, String str) {
        return str != null ? new v(k10, str) : k10;
    }
}
