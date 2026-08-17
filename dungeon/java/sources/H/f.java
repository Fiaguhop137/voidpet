package H;

/* JADX INFO: loaded from: classes.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final float f4039a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final float f4040b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final float f4041c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final float f4042d;

    public f(float f10, float f11, float f12, float f13) {
        this.f4039a = f10;
        this.f4040b = f11;
        this.f4041c = f12;
        this.f4042d = f13;
    }

    public final float a() {
        return this.f4039a;
    }

    public final float b() {
        return this.f4040b;
    }

    public final float c() {
        return this.f4041c;
    }

    public final float d() {
        return this.f4042d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        return this.f4039a == fVar.f4039a && this.f4040b == fVar.f4040b && this.f4041c == fVar.f4041c && this.f4042d == fVar.f4042d;
    }

    public int hashCode() {
        return (((((Float.hashCode(this.f4039a) * 31) + Float.hashCode(this.f4040b)) * 31) + Float.hashCode(this.f4041c)) * 31) + Float.hashCode(this.f4042d);
    }

    public String toString() {
        return "RippleAlpha(draggedAlpha=" + this.f4039a + ", focusedAlpha=" + this.f4040b + ", hoveredAlpha=" + this.f4041c + ", pressedAlpha=" + this.f4042d + ')';
    }
}
