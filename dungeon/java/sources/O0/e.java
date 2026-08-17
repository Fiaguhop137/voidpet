package O0;

/* JADX INFO: loaded from: classes.dex */
final class e implements d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final float f8262a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final float f8263b;

    public e(float f10, float f11) {
        this.f8262a = f10;
        this.f8263b = f11;
    }

    @Override // O0.l
    public float b1() {
        return this.f8263b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return Float.compare(this.f8262a, eVar.f8262a) == 0 && Float.compare(this.f8263b, eVar.f8263b) == 0;
    }

    @Override // O0.d
    public float getDensity() {
        return this.f8262a;
    }

    public int hashCode() {
        return (Float.hashCode(this.f8262a) * 31) + Float.hashCode(this.f8263b);
    }

    public String toString() {
        return "DensityImpl(density=" + this.f8262a + ", fontScale=" + this.f8263b + ')';
    }
}
