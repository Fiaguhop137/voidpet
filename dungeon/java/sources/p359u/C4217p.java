package p359u;

/* JADX INFO: renamed from: u.p, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C4217p extends AbstractC4218q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private float f54905a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private float f54906b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private float f54907c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private float f54908d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final int f54909e;

    public C4217p(float f10, float f11, float f12, float f13) {
        super(null);
        this.f54905a = f10;
        this.f54906b = f11;
        this.f54907c = f12;
        this.f54908d = f13;
        this.f54909e = 4;
    }

    @Override // p359u.AbstractC4218q
    public float a(int i10) {
        if (i10 == 0) {
            return this.f54905a;
        }
        if (i10 == 1) {
            return this.f54906b;
        }
        if (i10 == 2) {
            return this.f54907c;
        }
        if (i10 != 3) {
            return 0.0f;
        }
        return this.f54908d;
    }

    @Override // p359u.AbstractC4218q
    public int b() {
        return this.f54909e;
    }

    @Override // p359u.AbstractC4218q
    public void d() {
        this.f54905a = 0.0f;
        this.f54906b = 0.0f;
        this.f54907c = 0.0f;
        this.f54908d = 0.0f;
    }

    @Override // p359u.AbstractC4218q
    public void e(int i10, float f10) {
        if (i10 == 0) {
            this.f54905a = f10;
            return;
        }
        if (i10 == 1) {
            this.f54906b = f10;
        } else if (i10 == 2) {
            this.f54907c = f10;
        } else {
            if (i10 != 3) {
                return;
            }
            this.f54908d = f10;
        }
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C4217p)) {
            return false;
        }
        C4217p c4217p = (C4217p) obj;
        return c4217p.f54905a == this.f54905a && c4217p.f54906b == this.f54906b && c4217p.f54907c == this.f54907c && c4217p.f54908d == this.f54908d;
    }

    public final float f() {
        return this.f54905a;
    }

    public final float g() {
        return this.f54906b;
    }

    public final float h() {
        return this.f54907c;
    }

    public int hashCode() {
        return (((((Float.hashCode(this.f54905a) * 31) + Float.hashCode(this.f54906b)) * 31) + Float.hashCode(this.f54907c)) * 31) + Float.hashCode(this.f54908d);
    }

    public final float i() {
        return this.f54908d;
    }

    @Override // p359u.AbstractC4218q
    /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
    public C4217p c() {
        return new C4217p(0.0f, 0.0f, 0.0f, 0.0f);
    }

    public String toString() {
        return "AnimationVector4D: v1 = " + this.f54905a + ", v2 = " + this.f54906b + ", v3 = " + this.f54907c + ", v4 = " + this.f54908d;
    }
}
