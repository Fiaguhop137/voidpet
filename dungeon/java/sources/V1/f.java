package V1;

import R1.x;
import U1.AbstractC1459a;

/* JADX INFO: loaded from: classes.dex */
public final class f implements x.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f13915a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f13916b;

    public f(float f10, float f11) {
        AbstractC1459a.b(f10 >= -90.0f && f10 <= 90.0f && f11 >= -180.0f && f11 <= 180.0f, "Invalid latitude or longitude");
        this.f13915a = f10;
        this.f13916b = f11;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && f.class == obj.getClass()) {
            f fVar = (f) obj;
            if (this.f13915a == fVar.f13915a && this.f13916b == fVar.f13916b) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return ((527 + F9.c.a(this.f13915a)) * 31) + F9.c.a(this.f13916b);
    }

    public String toString() {
        return "xyz: latitude=" + this.f13915a + ", longitude=" + this.f13916b;
    }
}
