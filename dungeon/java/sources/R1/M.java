package R1;

import U1.S;

/* JADX INFO: loaded from: classes.dex */
public final class M {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final M f10090e = new M(0, 0);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final String f10091f = S.z0(0);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final String f10092g = S.z0(1);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final String f10093h = S.z0(3);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f10094a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f10095b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f10096c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final float f10097d;

    public M(int i10, int i11) {
        this(i10, i11, 1.0f);
    }

    public M(int i10, int i11, float f10) {
        this.f10094a = i10;
        this.f10095b = i11;
        this.f10096c = 0;
        this.f10097d = f10;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof M) {
            M m10 = (M) obj;
            if (this.f10094a == m10.f10094a && this.f10095b == m10.f10095b && this.f10097d == m10.f10097d) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return ((((217 + this.f10094a) * 31) + this.f10095b) * 31) + Float.floatToRawIntBits(this.f10097d);
    }
}
