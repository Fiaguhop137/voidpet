package p041c4;

import X3.b;
import android.graphics.PointF;
import p059d4.c;

/* JADX INFO: renamed from: c4.i, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C2122i implements N {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final C2122i f27214a = new C2122i();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final c.a f27215b = c.a.a("t", "f", "s", "j", "tr", "lh", "ls", "fc", "sc", "sw", "of", "ps", "sz");

    private C2122i() {
    }

    @Override // p041c4.N
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public b a(c cVar, float f10) {
        b.a aVar = b.a.CENTER;
        cVar.I();
        b.a aVar2 = aVar;
        String strJ2 = null;
        String strJ3 = null;
        PointF pointF = null;
        PointF pointF2 = null;
        float fNextDouble = 0.0f;
        float fNextDouble2 = 0.0f;
        float fNextDouble3 = 0.0f;
        float fNextDouble4 = 0.0f;
        int iNextInt = 0;
        int iD = 0;
        int iD2 = 0;
        boolean zB = true;
        while (cVar.hasNext()) {
            switch (cVar.f(f27215b)) {
                case 0:
                    strJ2 = cVar.j2();
                    break;
                case 1:
                    strJ3 = cVar.j2();
                    break;
                case 2:
                    fNextDouble = (float) cVar.nextDouble();
                    break;
                case 3:
                    int iNextInt2 = cVar.nextInt();
                    aVar2 = b.a.CENTER;
                    if (iNextInt2 <= aVar2.ordinal() && iNextInt2 >= 0) {
                        aVar2 = b.a.values()[iNextInt2];
                    }
                    break;
                case 4:
                    iNextInt = cVar.nextInt();
                    break;
                case 5:
                    fNextDouble2 = (float) cVar.nextDouble();
                    break;
                case 6:
                    fNextDouble3 = (float) cVar.nextDouble();
                    break;
                case 7:
                    iD = s.d(cVar);
                    break;
                case 8:
                    iD2 = s.d(cVar);
                    break;
                case 9:
                    fNextDouble4 = (float) cVar.nextDouble();
                    break;
                case 10:
                    zB = cVar.b();
                    break;
                case 11:
                    cVar.N();
                    PointF pointF3 = new PointF(((float) cVar.nextDouble()) * f10, ((float) cVar.nextDouble()) * f10);
                    cVar.J();
                    pointF = pointF3;
                    break;
                case 12:
                    cVar.N();
                    PointF pointF4 = new PointF(((float) cVar.nextDouble()) * f10, ((float) cVar.nextDouble()) * f10);
                    cVar.J();
                    pointF2 = pointF4;
                    break;
                default:
                    cVar.g();
                    cVar.k0();
                    break;
            }
        }
        cVar.T();
        return new b(strJ2, strJ3, fNextDouble, aVar2, iNextInt, fNextDouble2, fNextDouble3, iD, iD2, fNextDouble4, zB, pointF, pointF2);
    }
}
