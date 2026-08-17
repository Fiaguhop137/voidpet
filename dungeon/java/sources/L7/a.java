package L7;

/* JADX INFO: loaded from: classes2.dex */
final class a extends d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Integer f6387a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Object f6388b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final e f6389c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final f f6390d;

    a(Integer num, Object obj, e eVar, f fVar) {
        this.f6387a = num;
        if (obj == null) {
            throw new NullPointerException("Null payload");
        }
        this.f6388b = obj;
        if (eVar == null) {
            throw new NullPointerException("Null priority");
        }
        this.f6389c = eVar;
        this.f6390d = fVar;
    }

    @Override // L7.d
    public Integer a() {
        return this.f6387a;
    }

    @Override // L7.d
    public Object b() {
        return this.f6388b;
    }

    @Override // L7.d
    public e c() {
        return this.f6389c;
    }

    @Override // L7.d
    public f d() {
        return this.f6390d;
    }

    public boolean equals(Object obj) {
        f fVar;
        if (obj == this) {
            return true;
        }
        if (obj instanceof d) {
            d dVar = (d) obj;
            Integer num = this.f6387a;
            if (num != null ? num.equals(dVar.a()) : dVar.a() == null) {
                if (this.f6388b.equals(dVar.b()) && this.f6389c.equals(dVar.c()) && ((fVar = this.f6390d) != null ? fVar.equals(dVar.d()) : dVar.d() == null)) {
                    return true;
                }
            }
        }
        return false;
    }

    public int hashCode() {
        Integer num = this.f6387a;
        int iHashCode = ((((((num == null ? 0 : num.hashCode()) ^ 1000003) * 1000003) ^ this.f6388b.hashCode()) * 1000003) ^ this.f6389c.hashCode()) * 1000003;
        f fVar = this.f6390d;
        return iHashCode ^ (fVar != null ? fVar.hashCode() : 0);
    }

    public String toString() {
        return "Event{code=" + this.f6387a + ", payload=" + this.f6388b + ", priority=" + this.f6389c + ", productData=" + this.f6390d + "}";
    }
}
