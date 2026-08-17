package p359u;

/* JADX INFO: renamed from: u.n, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C4215n extends AbstractC4218q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private float f54898a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private float f54899b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f54900c;

    public C4215n(float f10, float f11) {
        super(null);
        this.f54898a = f10;
        this.f54899b = f11;
        this.f54900c = 2;
    }

    @Override // p359u.AbstractC4218q
    public float a(int i10) {
        if (i10 == 0) {
            return this.f54898a;
        }
        if (i10 != 1) {
            return 0.0f;
        }
        return this.f54899b;
    }

    @Override // p359u.AbstractC4218q
    public int b() {
        return this.f54900c;
    }

    @Override // p359u.AbstractC4218q
    public void d() {
        this.f54898a = 0.0f;
        this.f54899b = 0.0f;
    }

    @Override // p359u.AbstractC4218q
    public void e(int i10, float f10) {
        if (i10 == 0) {
            this.f54898a = f10;
        } else {
            if (i10 != 1) {
                return;
            }
            this.f54899b = f10;
        }
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C4215n)) {
            return false;
        }
        C4215n c4215n = (C4215n) obj;
        return c4215n.f54898a == this.f54898a && c4215n.f54899b == this.f54899b;
    }

    public final float f() {
        return this.f54898a;
    }

    public final float g() {
        return this.f54899b;
    }

    @Override // p359u.AbstractC4218q
    /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
    public C4215n c() {
        return new C4215n(0.0f, 0.0f);
    }

    public int hashCode() {
        return (Float.hashCode(this.f54898a) * 31) + Float.hashCode(this.f54899b);
    }

    public String toString() {
        return "AnimationVector2D: v1 = " + this.f54898a + ", v2 = " + this.f54899b;
    }
}
