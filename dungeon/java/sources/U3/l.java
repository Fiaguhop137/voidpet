package U3;

import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class l extends g {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final p095f4.d f13066i;

    public l(List list) {
        super(list);
        this.f13066i = new p095f4.d();
    }

    @Override // U3.a
    /* JADX INFO: renamed from: r, reason: merged with bridge method [inline-methods] */
    public p095f4.d i(p095f4.a aVar, float f10) {
        Object obj;
        float f11;
        Object obj2 = aVar.f41713b;
        if (obj2 == null || (obj = aVar.f41714c) == null) {
            throw new IllegalStateException("Missing values for keyframe.");
        }
        p095f4.d dVar = (p095f4.d) obj2;
        p095f4.d dVar2 = (p095f4.d) obj;
        p095f4.c cVar = this.f13034e;
        if (cVar != null) {
            f11 = f10;
            p095f4.d dVar3 = (p095f4.d) cVar.b(aVar.f41718g, aVar.f41719h.floatValue(), dVar, dVar2, f11, e(), f());
            if (dVar3 != null) {
                return dVar3;
            }
        } else {
            f11 = f10;
        }
        this.f13066i.d(p077e4.l.i(dVar.b(), dVar2.b(), f11), p077e4.l.i(dVar.c(), dVar2.c(), f11));
        return this.f13066i;
    }
}
