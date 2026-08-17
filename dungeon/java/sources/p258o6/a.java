package p258o6;

/* JADX INFO: loaded from: classes2.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f50454a = new a();

    private a() {
    }

    public static final int a(int i10, Object obj) {
        return (i10 * 31) + (obj != null ? obj.hashCode() : 0);
    }
}
