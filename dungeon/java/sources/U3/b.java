package U3;

import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class b extends g {
    public b(List list) {
        super(list);
    }

    public int r() {
        return s(b(), d());
    }

    public int s(p095f4.a aVar, float f10) {
        float f11;
        Float f12;
        if (aVar.f41713b == null || aVar.f41714c == null) {
            throw new IllegalStateException("Missing values for keyframe.");
        }
        p095f4.c cVar = this.f13034e;
        if (cVar == null || (f12 = aVar.f41719h) == null) {
            f11 = f10;
        } else {
            f11 = f10;
            Integer num = (Integer) cVar.b(aVar.f41718g, f12.floatValue(), (Integer) aVar.f41713b, (Integer) aVar.f41714c, f11, e(), f());
            if (num != null) {
                return num.intValue();
            }
        }
        return p077e4.e.c(p077e4.l.b(f11, 0.0f, 1.0f), ((Integer) aVar.f41713b).intValue(), ((Integer) aVar.f41714c).intValue());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // U3.a
    /* JADX INFO: renamed from: t, reason: merged with bridge method [inline-methods] */
    public Integer i(p095f4.a aVar, float f10) {
        return Integer.valueOf(s(aVar, f10));
    }
}
