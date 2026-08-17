package R1;

/* JADX INFO: renamed from: R1.f, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1346f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f10153a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f10154b;

    public C1346f(int i10, float f10) {
        this.f10153a = i10;
        this.f10154b = f10;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C1346f.class == obj.getClass()) {
            C1346f c1346f = (C1346f) obj;
            if (this.f10153a == c1346f.f10153a && Float.compare(c1346f.f10154b, this.f10154b) == 0) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return ((527 + this.f10153a) * 31) + Float.floatToIntBits(this.f10154b);
    }
}
