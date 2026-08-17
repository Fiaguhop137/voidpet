package U3;

import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class d extends g {
    public d(List list) {
        super(list);
    }

    public float r() {
        return s(b(), d());
    }

    float s(p095f4.a aVar, float f10) {
        float f11;
        if (aVar.f41713b == null || aVar.f41714c == null) {
            throw new IllegalStateException("Missing values for keyframe.");
        }
        p095f4.c cVar = this.f13034e;
        if (cVar != null) {
            f11 = f10;
            Float f12 = (Float) cVar.b(aVar.f41718g, aVar.f41719h.floatValue(), (Float) aVar.f41713b, (Float) aVar.f41714c, f11, e(), f());
            if (f12 != null) {
                return f12.floatValue();
            }
        } else {
            f11 = f10;
        }
        return p077e4.l.i(aVar.g(), aVar.d(), f11);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // U3.a
    /* JADX INFO: renamed from: t, reason: merged with bridge method [inline-methods] */
    public Float i(p095f4.a aVar, float f10) {
        return Float.valueOf(s(aVar, f10));
    }
}
