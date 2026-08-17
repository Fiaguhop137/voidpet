package O0;

/* JADX INFO: loaded from: classes.dex */
public interface d extends l {
    default float V0(int i10) {
        return h.o(i10 / getDensity());
    }

    default float W0(float f10) {
        return h.o(f10 / getDensity());
    }

    default long b0(float f10) {
        return P(W0(f10));
    }

    default float e1(float f10) {
        return f10 * getDensity();
    }

    float getDensity();

    default long n1(long j10) {
        if (j10 == 9205357640488583168L) {
            return p019b0.k.f25826b.a();
        }
        float fE1 = e1(k.e(j10));
        return p019b0.k.d((((long) Float.floatToRawIntBits(e1(k.d(j10)))) & 4294967295L) | (Float.floatToRawIntBits(fE1) << 32));
    }

    default int q0(float f10) {
        float fE1 = e1(f10);
        if (Float.isInfinite(fE1)) {
            return Integer.MAX_VALUE;
        }
        return Math.round(fE1);
    }

    default float w0(long j10) {
        if (!x.g(v.g(j10), x.f8301b.b())) {
            m.b("Only Sp can convert to Px");
        }
        return e1(S(j10));
    }
}
