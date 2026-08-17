package N8;

/* JADX INFO: renamed from: N8.f, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
final class C1211f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Object f8014a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Object f8015b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Object f8016c;

    C1211f(Object obj, Object obj2, Object obj3) {
        this.f8014a = obj;
        this.f8015b = obj2;
        this.f8016c = obj3;
    }

    final IllegalArgumentException a() {
        Object obj = this.f8016c;
        Object obj2 = this.f8015b;
        Object obj3 = this.f8014a;
        return new IllegalArgumentException("Multiple entries with same key: " + String.valueOf(obj3) + "=" + String.valueOf(obj2) + " and " + String.valueOf(obj3) + "=" + String.valueOf(obj));
    }
}
