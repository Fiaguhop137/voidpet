package K2;

import R1.x;

/* JADX INFO: loaded from: classes.dex */
public final class d implements x.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f5902a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f5903b;

    public d(float f10, int i10) {
        this.f5902a = f10;
        this.f5903b = i10;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && d.class == obj.getClass()) {
            d dVar = (d) obj;
            if (this.f5902a == dVar.f5902a && this.f5903b == dVar.f5903b) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return ((527 + F9.c.a(this.f5902a)) * 31) + this.f5903b;
    }

    public String toString() {
        return "smta: captureFrameRate=" + this.f5902a + ", svcTemporalLayerCount=" + this.f5903b;
    }
}
