package I;

/* JADX INFO: renamed from: I.q1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
final class C1068q1 implements S1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final C1068q1 f4798a = new C1068q1();

    private C1068q1() {
    }

    @Override // I.S1
    public boolean b(Object obj, Object obj2) {
        return obj == obj2;
    }

    public String toString() {
        return "ReferentialEqualityPolicy";
    }
}
