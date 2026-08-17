package p359u;

/* JADX INFO: renamed from: u.o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C4216o extends AbstractC4218q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private float f54901a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private float f54902b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private float f54903c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f54904d;

    public C4216o(float f10, float f11, float f12) {
        super(null);
        this.f54901a = f10;
        this.f54902b = f11;
        this.f54903c = f12;
        this.f54904d = 3;
    }

    @Override // p359u.AbstractC4218q
    public float a(int i10) {
        if (i10 == 0) {
            return this.f54901a;
        }
        if (i10 == 1) {
            return this.f54902b;
        }
        if (i10 != 2) {
            return 0.0f;
        }
        return this.f54903c;
    }

    @Override // p359u.AbstractC4218q
    public int b() {
        return this.f54904d;
    }

    @Override // p359u.AbstractC4218q
    public void d() {
        this.f54901a = 0.0f;
        this.f54902b = 0.0f;
        this.f54903c = 0.0f;
    }

    @Override // p359u.AbstractC4218q
    public void e(int i10, float f10) {
        if (i10 == 0) {
            this.f54901a = f10;
        } else if (i10 == 1) {
            this.f54902b = f10;
        } else {
            if (i10 != 2) {
                return;
            }
            this.f54903c = f10;
        }
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C4216o)) {
            return false;
        }
        C4216o c4216o = (C4216o) obj;
        return c4216o.f54901a == this.f54901a && c4216o.f54902b == this.f54902b && c4216o.f54903c == this.f54903c;
    }

    @Override // p359u.AbstractC4218q
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public C4216o c() {
        return new C4216o(0.0f, 0.0f, 0.0f);
    }

    public int hashCode() {
        return (((Float.hashCode(this.f54901a) * 31) + Float.hashCode(this.f54902b)) * 31) + Float.hashCode(this.f54903c);
    }

    public String toString() {
        return "AnimationVector3D: v1 = " + this.f54901a + ", v2 = " + this.f54902b + ", v3 = " + this.f54903c;
    }
}
