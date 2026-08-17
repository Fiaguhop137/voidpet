package p379v1;

/* JADX INFO: renamed from: v1.f, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C4232f extends D {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Object f55705b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f55706c;

    public C4232f(Object obj, int i10, int i11) {
        super(i11, null);
        this.f55705b = obj;
        this.f55706c = i10;
    }

    public final void b() {
        Object obj = this.f55705b;
        if ((obj != null ? obj.hashCode() : 0) != this.f55706c) {
            throw new IllegalStateException("Data in DataStore was mutated but DataStore is only compatible with Immutable types.");
        }
    }

    public final Object c() {
        return this.f55705b;
    }
}
