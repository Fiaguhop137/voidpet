package p011aa;

/* JADX INFO: loaded from: classes2.dex */
public class b implements a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static b f19609a;

    private b() {
    }

    public static b b() {
        if (f19609a == null) {
            f19609a = new b();
        }
        return f19609a;
    }

    @Override // p011aa.a
    public long a() {
        return System.currentTimeMillis();
    }
}
