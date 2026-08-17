package C;

import p019b0.k;

/* JADX INFO: loaded from: classes.dex */
final class e implements b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final float f1061a;

    public e(float f10) {
        this.f1061a = f10;
        if (f10 < 0.0f || f10 > 100.0f) {
            p449z.a.a("The percent should be in the range of [0, 100]");
        }
    }

    @Override // C.b
    public float a(long j10, O0.d dVar) {
        return k.h(j10) * (this.f1061a / 100.0f);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof e) && Float.compare(this.f1061a, ((e) obj).f1061a) == 0;
    }

    public int hashCode() {
        return Float.hashCode(this.f1061a);
    }

    public String toString() {
        return "CornerSize(size = " + this.f1061a + "%)";
    }
}
