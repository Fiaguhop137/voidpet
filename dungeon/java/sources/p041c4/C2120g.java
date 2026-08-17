package p041c4;

import android.graphics.Color;
import p059d4.c;

/* JADX INFO: renamed from: c4.g, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C2120g implements N {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final C2120g f27212a = new C2120g();

    private C2120g() {
    }

    @Override // p041c4.N
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public Integer a(c cVar, float f10) {
        boolean z10 = cVar.d() == c.b.BEGIN_ARRAY;
        if (z10) {
            cVar.N();
        }
        double dNextDouble = cVar.nextDouble();
        double dNextDouble2 = cVar.nextDouble();
        double dNextDouble3 = cVar.nextDouble();
        double dNextDouble4 = cVar.d() == c.b.NUMBER ? cVar.nextDouble() : 1.0d;
        if (z10) {
            cVar.J();
        }
        if (dNextDouble <= 1.0d && dNextDouble2 <= 1.0d && dNextDouble3 <= 1.0d) {
            dNextDouble *= 255.0d;
            dNextDouble2 *= 255.0d;
            dNextDouble3 *= 255.0d;
            if (dNextDouble4 <= 1.0d) {
                dNextDouble4 *= 255.0d;
            }
        }
        return Integer.valueOf(Color.argb((int) dNextDouble4, (int) dNextDouble, (int) dNextDouble2, (int) dNextDouble3));
    }
}
