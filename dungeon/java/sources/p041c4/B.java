package p041c4;

import android.graphics.PointF;
import p059d4.c;

/* JADX INFO: loaded from: classes.dex */
public class B implements N {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final B f27189a = new B();

    private B() {
    }

    @Override // p041c4.N
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public PointF a(c cVar, float f10) {
        c.b bVarD = cVar.d();
        if (bVarD != c.b.BEGIN_ARRAY && bVarD != c.b.BEGIN_OBJECT) {
            if (bVarD == c.b.NUMBER) {
                PointF pointF = new PointF(((float) cVar.nextDouble()) * f10, ((float) cVar.nextDouble()) * f10);
                while (cVar.hasNext()) {
                    cVar.k0();
                }
                return pointF;
            }
            throw new IllegalArgumentException("Cannot convert json to point. Next token is " + bVarD);
        }
        return s.e(cVar, f10);
    }
}
