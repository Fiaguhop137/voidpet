package U3;

import R3.C1364k;
import android.graphics.Path;
import android.graphics.PointF;

/* JADX INFO: loaded from: classes.dex */
public class i extends p095f4.a {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private Path f13058q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private final p095f4.a f13059r;

    public i(C1364k c1364k, p095f4.a aVar) {
        super(c1364k, (PointF) aVar.f41713b, (PointF) aVar.f41714c, aVar.f41715d, aVar.f41716e, aVar.f41717f, aVar.f41718g, aVar.f41719h);
        this.f13059r = aVar;
        j();
    }

    public void j() {
        Object obj;
        Object obj2;
        Object obj3 = this.f41714c;
        boolean z10 = (obj3 == null || (obj2 = this.f41713b) == null || !((PointF) obj2).equals(((PointF) obj3).x, ((PointF) obj3).y)) ? false : true;
        Object obj4 = this.f41713b;
        if (obj4 == null || (obj = this.f41714c) == null || z10) {
            return;
        }
        p095f4.a aVar = this.f13059r;
        this.f13058q = p077e4.r.d((PointF) obj4, (PointF) obj, aVar.f41726o, aVar.f41727p);
    }

    Path k() {
        return this.f13058q;
    }
}
