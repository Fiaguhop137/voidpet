package p055d0;

/* JADX INFO: loaded from: classes.dex */
public final class I {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final float f39540a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final float f39541b;

    public I(float f10, float f11) {
        this.f39540a = f10;
        this.f39541b = f11;
    }

    public final float a() {
        return this.f39540a;
    }

    public final float b() {
        return this.f39541b;
    }

    public final float[] c() {
        float f10 = this.f39540a;
        float f11 = this.f39541b;
        return new float[]{f10 / f11, 1.0f, ((1.0f - f10) - f11) / f11};
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof I)) {
            return false;
        }
        I i10 = (I) obj;
        return Float.compare(this.f39540a, i10.f39540a) == 0 && Float.compare(this.f39541b, i10.f39541b) == 0;
    }

    public int hashCode() {
        return (Float.hashCode(this.f39540a) * 31) + Float.hashCode(this.f39541b);
    }

    public String toString() {
        return "WhitePoint(x=" + this.f39540a + ", y=" + this.f39541b + ')';
    }
}
