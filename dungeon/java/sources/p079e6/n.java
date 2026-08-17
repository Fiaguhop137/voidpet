package p079e6;

import android.util.SparseIntArray;

/* JADX INFO: loaded from: classes2.dex */
public final class n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final n f40510a = new n();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final SparseIntArray f40511b = new SparseIntArray(0);

    private n() {
    }

    public static final E a() {
        return new E(0, f40510a.b(), f40511b);
    }

    private final int b() {
        int iMin = (int) Math.min(Runtime.getRuntime().maxMemory(), 2147483647L);
        return iMin > 16777216 ? (iMin / 4) * 3 : iMin / 2;
    }
}
