package p459z9;

/* JADX INFO: loaded from: classes2.dex */
public final class m implements l {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final m f58532b = new m(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Object f58533a;

    private m(Object obj) {
        this.f58533a = obj;
    }

    public static l b(Object obj) {
        if (obj != null) {
            return new m(obj);
        }
        throw new NullPointerException("instance cannot be null");
    }

    @Override // p459z9.o
    public final Object a() {
        return this.f58533a;
    }
}
