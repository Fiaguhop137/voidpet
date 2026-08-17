package R1;

import U1.AbstractC1459a;
import U1.S;

/* JADX INFO: loaded from: classes.dex */
public final class B {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final B f9878d = new B(1.0f);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final String f9879e = S.z0(0);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final String f9880f = S.z0(1);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f9881a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f9882b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f9883c;

    public B(float f10) {
        this(f10, 1.0f);
    }

    public B(float f10, float f11) {
        AbstractC1459a.a(f10 > 0.0f);
        AbstractC1459a.a(f11 > 0.0f);
        this.f9881a = f10;
        this.f9882b = f11;
        this.f9883c = Math.round(f10 * 1000.0f);
    }

    public long a(long j10) {
        return j10 * ((long) this.f9883c);
    }

    public B b(float f10) {
        return new B(f10, this.f9882b);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && B.class == obj.getClass()) {
            B b10 = (B) obj;
            if (this.f9881a == b10.f9881a && this.f9882b == b10.f9882b) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return ((527 + Float.floatToRawIntBits(this.f9881a)) * 31) + Float.floatToRawIntBits(this.f9882b);
    }

    public String toString() {
        return S.G("PlaybackParameters(speed=%.2f, pitch=%.2f)", Float.valueOf(this.f9881a), Float.valueOf(this.f9882b));
    }
}
