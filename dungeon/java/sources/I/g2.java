package I;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
final class g2 implements S1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final g2 f4654a = new g2();

    private g2() {
    }

    @Override // I.S1
    public boolean b(Object obj, Object obj2) {
        return Intrinsics.b(obj, obj2);
    }

    public String toString() {
        return "StructuralEqualityPolicy";
    }
}
