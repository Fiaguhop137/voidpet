package p359u;

/* JADX INFO: renamed from: u.m, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C4214m extends AbstractC4218q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private float f54896a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f54897b;

    public C4214m(float f10) {
        super(null);
        this.f54896a = f10;
        this.f54897b = 1;
    }

    @Override // p359u.AbstractC4218q
    public float a(int i10) {
        if (i10 == 0) {
            return this.f54896a;
        }
        return 0.0f;
    }

    @Override // p359u.AbstractC4218q
    public int b() {
        return this.f54897b;
    }

    @Override // p359u.AbstractC4218q
    public void d() {
        this.f54896a = 0.0f;
    }

    @Override // p359u.AbstractC4218q
    public void e(int i10, float f10) {
        if (i10 == 0) {
            this.f54896a = f10;
        }
    }

    public boolean equals(Object obj) {
        return (obj instanceof C4214m) && ((C4214m) obj).f54896a == this.f54896a;
    }

    public final float f() {
        return this.f54896a;
    }

    @Override // p359u.AbstractC4218q
    /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
    public C4214m c() {
        return new C4214m(0.0f);
    }

    public int hashCode() {
        return Float.hashCode(this.f54896a);
    }

    public String toString() {
        return "AnimationVector1D: value = " + this.f54896a;
    }
}
