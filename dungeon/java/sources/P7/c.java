package P7;

/* JADX INFO: loaded from: classes2.dex */
public final class c implements b {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final c f8853b = new c(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Object f8854a;

    private c(Object obj) {
        this.f8854a = obj;
    }

    public static b a(Object obj) {
        return new c(d.c(obj, "instance cannot be null"));
    }

    @Override // javax.inject.Provider
    public Object get() {
        return this.f8854a;
    }
}
