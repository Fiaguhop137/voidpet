package U3;

import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class f extends g {
    public f(List list) {
        super(list);
    }

    int r(p095f4.a aVar, float f10) {
        float f11;
        if (aVar.f41713b == null) {
            throw new IllegalStateException("Missing values for keyframe.");
        }
        int iH = aVar.f41714c == null ? aVar.h() : aVar.e();
        p095f4.c cVar = this.f13034e;
        if (cVar != null) {
            f11 = f10;
            Integer num = (Integer) cVar.b(aVar.f41718g, aVar.f41719h.floatValue(), (Integer) aVar.f41713b, Integer.valueOf(iH), f11, e(), f());
            if (num != null) {
                return num.intValue();
            }
        } else {
            f11 = f10;
        }
        return p077e4.l.j(aVar.h(), iH, f11);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // U3.a
    /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
    public Integer i(p095f4.a aVar, float f10) {
        return Integer.valueOf(r(aVar, f10));
    }
}
