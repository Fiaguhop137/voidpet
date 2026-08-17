package U3;

import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.PointF;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class j extends g {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final PointF f13060i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final float[] f13061j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final float[] f13062k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final PathMeasure f13063l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private i f13064m;

    public j(List list) {
        super(list);
        this.f13060i = new PointF();
        this.f13061j = new float[2];
        this.f13062k = new float[2];
        this.f13063l = new PathMeasure();
    }

    @Override // U3.a
    /* JADX INFO: renamed from: r, reason: merged with bridge method [inline-methods] */
    public PointF i(p095f4.a aVar, float f10) {
        float f11;
        i iVar = (i) aVar;
        Path pathK = iVar.k();
        p095f4.c cVar = this.f13034e;
        if (cVar == null || aVar.f41719h == null) {
            f11 = f10;
        } else {
            f11 = f10;
            PointF pointF = (PointF) cVar.b(iVar.f41718g, iVar.f41719h.floatValue(), (PointF) iVar.f41713b, (PointF) iVar.f41714c, e(), f11, f());
            if (pointF != null) {
                return pointF;
            }
        }
        if (pathK == null) {
            return (PointF) aVar.f41713b;
        }
        if (this.f13064m != iVar) {
            this.f13063l.setPath(pathK, false);
            this.f13064m = iVar;
        }
        float length = this.f13063l.getLength();
        float f12 = f11 * length;
        this.f13063l.getPosTan(f12, this.f13061j, this.f13062k);
        PointF pointF2 = this.f13060i;
        float[] fArr = this.f13061j;
        pointF2.set(fArr[0], fArr[1]);
        if (f12 < 0.0f) {
            PointF pointF3 = this.f13060i;
            float[] fArr2 = this.f13062k;
            pointF3.offset(fArr2[0] * f12, fArr2[1] * f12);
        } else if (f12 > length) {
            PointF pointF4 = this.f13060i;
            float[] fArr3 = this.f13062k;
            float f13 = f12 - length;
            pointF4.offset(fArr3[0] * f13, fArr3[1] * f13);
        }
        return this.f13060i;
    }
}
