package kotlin.ranges;

/* JADX INFO: loaded from: classes3.dex */
final class a implements Rd.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final float f48375a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final float f48376b;

    public a(float f10, float f11) {
        this.f48375a = f10;
        this.f48376b = f11;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // Rd.a
    public /* bridge */ /* synthetic */ boolean a(Comparable comparable, Comparable comparable2) {
        return f(((Number) comparable).floatValue(), ((Number) comparable2).floatValue());
    }

    @Override // Rd.b
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public Float e() {
        return Float.valueOf(this.f48376b);
    }

    @Override // Rd.b
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public Float c() {
        return Float.valueOf(this.f48375a);
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof a)) {
            return false;
        }
        if (isEmpty() && ((a) obj).isEmpty()) {
            return true;
        }
        a aVar = (a) obj;
        return this.f48375a == aVar.f48375a && this.f48376b == aVar.f48376b;
    }

    public boolean f(float f10, float f11) {
        return f10 <= f11;
    }

    public int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        return (Float.hashCode(this.f48375a) * 31) + Float.hashCode(this.f48376b);
    }

    @Override // Rd.a, Rd.b
    public boolean isEmpty() {
        return this.f48375a > this.f48376b;
    }

    public String toString() {
        return this.f48375a + ".." + this.f48376b;
    }
}
