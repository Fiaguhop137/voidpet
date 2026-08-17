package U3;

import android.graphics.PointF;
import java.util.Collections;

/* JADX INFO: loaded from: classes.dex */
public class n extends a {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final PointF f13072i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final PointF f13073j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final a f13074k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final a f13075l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    protected p095f4.c f13076m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    protected p095f4.c f13077n;

    public n(a aVar, a aVar2) {
        super(Collections.EMPTY_LIST);
        this.f13072i = new PointF();
        this.f13073j = new PointF();
        this.f13074k = aVar;
        this.f13075l = aVar2;
        n(f());
    }

    @Override // U3.a
    public void n(float f10) {
        this.f13074k.n(f10);
        this.f13075l.n(f10);
        this.f13072i.set(((Float) this.f13074k.h()).floatValue(), ((Float) this.f13075l.h()).floatValue());
        for (int i10 = 0; i10 < this.f13030a.size(); i10++) {
            ((a.b) this.f13030a.get(i10)).b();
        }
    }

    @Override // U3.a
    /* JADX INFO: renamed from: r, reason: merged with bridge method [inline-methods] */
    public PointF h() {
        return i(null, 0.0f);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // U3.a
    /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
    public PointF i(p095f4.a aVar, float f10) {
        Float f11;
        p095f4.a aVarB;
        p095f4.a aVarB2;
        Float f12 = null;
        if (this.f13076m == null || (aVarB2 = this.f13074k.b()) == null) {
            f11 = null;
        } else {
            Float f13 = aVarB2.f41719h;
            p095f4.c cVar = this.f13076m;
            float f14 = aVarB2.f41718g;
            f11 = (Float) cVar.b(f14, f13 == null ? f14 : f13.floatValue(), (Float) aVarB2.f41713b, (Float) aVarB2.f41714c, this.f13074k.d(), this.f13074k.e(), this.f13074k.f());
        }
        if (this.f13077n != null && (aVarB = this.f13075l.b()) != null) {
            Float f15 = aVarB.f41719h;
            p095f4.c cVar2 = this.f13077n;
            float f16 = aVarB.f41718g;
            f12 = (Float) cVar2.b(f16, f15 == null ? f16 : f15.floatValue(), (Float) aVarB.f41713b, (Float) aVarB.f41714c, this.f13075l.d(), this.f13075l.e(), this.f13075l.f());
        }
        if (f11 == null) {
            this.f13073j.set(this.f13072i.x, 0.0f);
        } else {
            this.f13073j.set(f11.floatValue(), 0.0f);
        }
        if (f12 == null) {
            PointF pointF = this.f13073j;
            pointF.set(pointF.x, this.f13072i.y);
        } else {
            PointF pointF2 = this.f13073j;
            pointF2.set(pointF2.x, f12.floatValue());
        }
        return this.f13073j;
    }

    public void t(p095f4.c cVar) {
        p095f4.c cVar2 = this.f13076m;
        if (cVar2 != null) {
            cVar2.c(null);
        }
        this.f13076m = cVar;
        if (cVar != null) {
            cVar.c(this);
        }
    }

    public void u(p095f4.c cVar) {
        p095f4.c cVar2 = this.f13077n;
        if (cVar2 != null) {
            cVar2.c(null);
        }
        this.f13077n = cVar;
        if (cVar != null) {
            cVar.c(this);
        }
    }
}
