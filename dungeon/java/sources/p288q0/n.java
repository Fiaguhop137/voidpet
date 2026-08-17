package p288q0;

import p019b0.e;
import p019b0.g;
import p324s0.AbstractC4133d0;

/* JADX INFO: loaded from: classes.dex */
public abstract class n {
    public static final g a(m mVar) {
        g gVarX;
        m mVarE0 = mVar.e0();
        return (mVarE0 == null || (gVarX = m.X(mVarE0, mVar, false, 2, null)) == null) ? new g(0.0f, 0.0f, (int) (mVar.g() >> 32), (int) (mVar.g() & 4294967295L)) : gVarX;
    }

    public static final g b(m mVar) {
        return m.X(d(mVar), mVar, false, 2, null);
    }

    public static final g c(m mVar) {
        m mVarD = d(mVar);
        float fG = (int) (mVarD.g() >> 32);
        float fG2 = (int) (mVarD.g() & 4294967295L);
        g gVarX = m.X(mVarD, mVar, false, 2, null);
        float fE = gVarX.e();
        if (fE < 0.0f) {
            fE = 0.0f;
        }
        if (fE > fG) {
            fE = fG;
        }
        float fH = gVarX.h();
        if (fH < 0.0f) {
            fH = 0.0f;
        }
        if (fH > fG2) {
            fH = fG2;
        }
        float f10 = gVarX.f();
        if (f10 < 0.0f) {
            f10 = 0.0f;
        }
        if (f10 <= fG) {
            fG = f10;
        }
        float fC = gVarX.c();
        float f11 = fC >= 0.0f ? fC : 0.0f;
        if (f11 <= fG2) {
            fG2 = f11;
        }
        if (fE == fG || fH == fG2) {
            return g.f25810e.a();
        }
        long jT = mVarD.T(e.e((((long) Float.floatToRawIntBits(fE)) << 32) | (((long) Float.floatToRawIntBits(fH)) & 4294967295L)));
        long jT2 = mVarD.T(e.e((((long) Float.floatToRawIntBits(fH)) & 4294967295L) | (((long) Float.floatToRawIntBits(fG)) << 32)));
        long jT3 = mVarD.T(e.e((((long) Float.floatToRawIntBits(fG)) << 32) | (((long) Float.floatToRawIntBits(fG2)) & 4294967295L)));
        long jT4 = mVarD.T(e.e((((long) Float.floatToRawIntBits(fG2)) & 4294967295L) | (((long) Float.floatToRawIntBits(fE)) << 32)));
        float fIntBitsToFloat = Float.intBitsToFloat((int) (jT >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (jT2 >> 32));
        float fIntBitsToFloat3 = Float.intBitsToFloat((int) (jT4 >> 32));
        float fIntBitsToFloat4 = Float.intBitsToFloat((int) (jT3 >> 32));
        float fMin = Math.min(fIntBitsToFloat, Math.min(fIntBitsToFloat2, Math.min(fIntBitsToFloat3, fIntBitsToFloat4)));
        float fMax = Math.max(fIntBitsToFloat, Math.max(fIntBitsToFloat2, Math.max(fIntBitsToFloat3, fIntBitsToFloat4)));
        float fIntBitsToFloat5 = Float.intBitsToFloat((int) (jT & 4294967295L));
        float fIntBitsToFloat6 = Float.intBitsToFloat((int) (jT2 & 4294967295L));
        float fIntBitsToFloat7 = Float.intBitsToFloat((int) (jT4 & 4294967295L));
        float fIntBitsToFloat8 = Float.intBitsToFloat((int) (jT3 & 4294967295L));
        return new g(fMin, Math.min(fIntBitsToFloat5, Math.min(fIntBitsToFloat6, Math.min(fIntBitsToFloat7, fIntBitsToFloat8))), fMax, Math.max(fIntBitsToFloat5, Math.max(fIntBitsToFloat6, Math.max(fIntBitsToFloat7, fIntBitsToFloat8))));
    }

    public static final m d(m mVar) {
        m mVar2;
        m mVarE0 = mVar.e0();
        while (true) {
            m mVar3 = mVarE0;
            mVar2 = mVar;
            mVar = mVar3;
            if (mVar == null) {
                break;
            }
            mVarE0 = mVar.e0();
        }
        AbstractC4133d0 abstractC4133d0 = mVar2 instanceof AbstractC4133d0 ? (AbstractC4133d0) mVar2 : null;
        if (abstractC4133d0 == null) {
            return mVar2;
        }
        AbstractC4133d0 abstractC4133d0X2 = abstractC4133d0.x2();
        while (true) {
            AbstractC4133d0 abstractC4133d1 = abstractC4133d0X2;
            AbstractC4133d0 abstractC4133d2 = abstractC4133d0;
            abstractC4133d0 = abstractC4133d1;
            if (abstractC4133d0 == null) {
                return abstractC4133d2;
            }
            abstractC4133d0X2 = abstractC4133d0.x2();
        }
    }

    public static final long e(m mVar) {
        return mVar.k0(e.f25805b.c());
    }

    public static final long f(m mVar) {
        return mVar.z(e.f25805b.c());
    }
}
