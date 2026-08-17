package p019b0;

import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes.dex */
public final class g {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final a f25810e = new a(null);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final g f25811f = new g(0.0f, 0.0f, 0.0f, 0.0f);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final float f25812a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final float f25813b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final float f25814c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final float f25815d;

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final g a() {
            return g.f25811f;
        }
    }

    public g(float f10, float f11, float f12, float f13) {
        this.f25812a = f10;
        this.f25813b = f11;
        this.f25814c = f12;
        this.f25815d = f13;
    }

    public final boolean b(long j10) {
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j10 >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j10 & 4294967295L));
        return (fIntBitsToFloat >= this.f25812a) & (fIntBitsToFloat < this.f25814c) & (fIntBitsToFloat2 >= this.f25813b) & (fIntBitsToFloat2 < this.f25815d);
    }

    public final float c() {
        return this.f25815d;
    }

    public final long d() {
        float f10 = this.f25812a + ((f() - e()) / 2.0f);
        return e.e((((long) Float.floatToRawIntBits(this.f25813b + ((c() - h()) / 2.0f))) & 4294967295L) | (Float.floatToRawIntBits(f10) << 32));
    }

    public final float e() {
        return this.f25812a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        return Float.compare(this.f25812a, gVar.f25812a) == 0 && Float.compare(this.f25813b, gVar.f25813b) == 0 && Float.compare(this.f25814c, gVar.f25814c) == 0 && Float.compare(this.f25815d, gVar.f25815d) == 0;
    }

    public final float f() {
        return this.f25814c;
    }

    public final long g() {
        float f10 = f() - e();
        return k.d((((long) Float.floatToRawIntBits(c() - h())) & 4294967295L) | (Float.floatToRawIntBits(f10) << 32));
    }

    public final float h() {
        return this.f25813b;
    }

    public int hashCode() {
        return (((((Float.hashCode(this.f25812a) * 31) + Float.hashCode(this.f25813b)) * 31) + Float.hashCode(this.f25814c)) * 31) + Float.hashCode(this.f25815d);
    }

    public final g i(float f10, float f11, float f12, float f13) {
        return new g(Math.max(this.f25812a, f10), Math.max(this.f25813b, f11), Math.min(this.f25814c, f12), Math.min(this.f25815d, f13));
    }

    public final g j(g gVar) {
        return new g(Math.max(this.f25812a, gVar.f25812a), Math.max(this.f25813b, gVar.f25813b), Math.min(this.f25814c, gVar.f25814c), Math.min(this.f25815d, gVar.f25815d));
    }

    public final boolean k() {
        return (this.f25812a >= this.f25814c) | (this.f25813b >= this.f25815d);
    }

    public final boolean l(g gVar) {
        return (this.f25812a < gVar.f25814c) & (gVar.f25812a < this.f25814c) & (this.f25813b < gVar.f25815d) & (gVar.f25813b < this.f25815d);
    }

    public final g m(float f10, float f11) {
        return new g(this.f25812a + f10, this.f25813b + f11, this.f25814c + f10, this.f25815d + f11);
    }

    public final g n(long j10) {
        int i10 = (int) (j10 >> 32);
        int i11 = (int) (j10 & 4294967295L);
        return new g(this.f25812a + Float.intBitsToFloat(i10), this.f25813b + Float.intBitsToFloat(i11), this.f25814c + Float.intBitsToFloat(i10), this.f25815d + Float.intBitsToFloat(i11));
    }

    public String toString() {
        return "Rect.fromLTRB(" + b.a(this.f25812a, 1) + ", " + b.a(this.f25813b, 1) + ", " + b.a(this.f25814c, 1) + ", " + b.a(this.f25815d, 1) + ')';
    }
}
