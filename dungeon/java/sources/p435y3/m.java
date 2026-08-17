package p435y3;

import K3.f;
import K3.o;

/* JADX INFO: loaded from: classes.dex */
public abstract class m {
    public static final Object a(f fVar, l.c cVar) {
        Object objC = fVar.k().c(cVar);
        if (objC != null) {
            return objC;
        }
        Object objC2 = fVar.g().f().c(cVar);
        return objC2 == null ? cVar.a() : objC2;
    }

    public static final Object b(o oVar, l.c cVar) {
        Object objC = oVar.f().c(cVar);
        return objC == null ? cVar.a() : objC;
    }

    public static final Object c(l lVar, l.c cVar) {
        Object objC = lVar.c(cVar);
        return objC == null ? cVar.a() : objC;
    }
}
