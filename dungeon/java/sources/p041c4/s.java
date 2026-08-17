package p041c4;

import android.graphics.Color;
import android.graphics.PointF;
import java.util.ArrayList;
import java.util.List;
import p059d4.c;

/* JADX INFO: loaded from: classes.dex */
abstract class s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final c.a f27239a = c.a.a("x", "y");

    static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f27240a;

        static {
            int[] iArr = new int[c.b.values().length];
            f27240a = iArr;
            try {
                iArr[c.b.NUMBER.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f27240a[c.b.BEGIN_ARRAY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f27240a[c.b.BEGIN_OBJECT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    private static PointF a(c cVar, float f10) {
        cVar.N();
        float fNextDouble = (float) cVar.nextDouble();
        float fNextDouble2 = (float) cVar.nextDouble();
        while (cVar.d() != c.b.END_ARRAY) {
            cVar.k0();
        }
        cVar.J();
        return new PointF(fNextDouble * f10, fNextDouble2 * f10);
    }

    private static PointF b(c cVar, float f10) {
        float fNextDouble = (float) cVar.nextDouble();
        float fNextDouble2 = (float) cVar.nextDouble();
        while (cVar.hasNext()) {
            cVar.k0();
        }
        return new PointF(fNextDouble * f10, fNextDouble2 * f10);
    }

    private static PointF c(c cVar, float f10) {
        cVar.I();
        float fG = 0.0f;
        float fG2 = 0.0f;
        while (cVar.hasNext()) {
            int iF = cVar.f(f27239a);
            if (iF == 0) {
                fG = g(cVar);
            } else if (iF != 1) {
                cVar.g();
                cVar.k0();
            } else {
                fG2 = g(cVar);
            }
        }
        cVar.T();
        return new PointF(fG * f10, fG2 * f10);
    }

    static int d(c cVar) {
        cVar.N();
        int iNextDouble = (int) (cVar.nextDouble() * 255.0d);
        int iNextDouble2 = (int) (cVar.nextDouble() * 255.0d);
        int iNextDouble3 = (int) (cVar.nextDouble() * 255.0d);
        while (cVar.hasNext()) {
            cVar.k0();
        }
        cVar.J();
        return Color.argb(255, iNextDouble, iNextDouble2, iNextDouble3);
    }

    static PointF e(c cVar, float f10) {
        int i10 = a.f27240a[cVar.d().ordinal()];
        if (i10 == 1) {
            return b(cVar, f10);
        }
        if (i10 == 2) {
            return a(cVar, f10);
        }
        if (i10 == 3) {
            return c(cVar, f10);
        }
        throw new IllegalArgumentException("Unknown point starts with " + cVar.d());
    }

    static List f(c cVar, float f10) {
        ArrayList arrayList = new ArrayList();
        cVar.N();
        while (cVar.d() == c.b.BEGIN_ARRAY) {
            cVar.N();
            arrayList.add(e(cVar, f10));
            cVar.J();
        }
        cVar.J();
        return arrayList;
    }

    static float g(c cVar) {
        c.b bVarD = cVar.d();
        int i10 = a.f27240a[bVarD.ordinal()];
        if (i10 == 1) {
            return (float) cVar.nextDouble();
        }
        if (i10 != 2) {
            throw new IllegalArgumentException("Unknown value for token of type " + bVarD);
        }
        cVar.N();
        float fNextDouble = (float) cVar.nextDouble();
        while (cVar.hasNext()) {
            cVar.k0();
        }
        cVar.J();
        return fNextDouble;
    }
}
