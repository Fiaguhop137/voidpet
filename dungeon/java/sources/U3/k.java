package U3;

import android.graphics.PointF;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class k extends g {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final PointF f13065i;

    public k(List list) {
        super(list);
        this.f13065i = new PointF();
    }

    @Override // U3.a
    /* JADX INFO: renamed from: r, reason: merged with bridge method [inline-methods] */
    public PointF i(p095f4.a aVar, float f10) {
        return j(aVar, f10, f10, f10);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // U3.a
    /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
    public PointF j(p095f4.a aVar, float f10, float f11, float f12) {
        Object obj;
        PointF pointF;
        Object obj2 = aVar.f41713b;
        if (obj2 == null || (obj = aVar.f41714c) == null) {
            throw new IllegalStateException("Missing values for keyframe.");
        }
        PointF pointF2 = (PointF) obj2;
        PointF pointF3 = (PointF) obj;
        p095f4.c cVar = this.f13034e;
        if (cVar != null && (pointF = (PointF) cVar.b(aVar.f41718g, aVar.f41719h.floatValue(), pointF2, pointF3, f10, e(), f())) != null) {
            return pointF;
        }
        PointF pointF4 = this.f13065i;
        float f13 = pointF2.x;
        float f14 = f13 + (f11 * (pointF3.x - f13));
        float f15 = pointF2.y;
        pointF4.set(f14, f15 + (f12 * (pointF3.y - f15)));
        return this.f13065i;
    }
}
