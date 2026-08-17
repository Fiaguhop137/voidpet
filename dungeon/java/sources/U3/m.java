package U3;

import android.graphics.Path;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class m extends a {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final Z3.o f13067i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final Path f13068j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private Path f13069k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private Path f13070l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private List f13071m;

    public m(List list) {
        super(list);
        this.f13067i = new Z3.o();
        this.f13068j = new Path();
    }

    @Override // U3.a
    protected boolean p() {
        List list = this.f13071m;
        return (list == null || list.isEmpty()) ? false : true;
    }

    @Override // U3.a
    /* JADX INFO: renamed from: r, reason: merged with bridge method [inline-methods] */
    public Path i(p095f4.a aVar, float f10) {
        Z3.o oVar = (Z3.o) aVar.f41713b;
        Z3.o oVar2 = (Z3.o) aVar.f41714c;
        this.f13067i.c(oVar, oVar2 == null ? oVar : oVar2, f10);
        Z3.o oVarD = this.f13067i;
        List list = this.f13071m;
        if (list != null) {
            for (int size = list.size() - 1; size >= 0; size--) {
                oVarD = ((T3.s) this.f13071m.get(size)).d(oVarD);
            }
        }
        p077e4.l.h(oVarD, this.f13068j);
        if (this.f13034e == null) {
            return this.f13068j;
        }
        if (this.f13069k == null) {
            this.f13069k = new Path();
            this.f13070l = new Path();
        }
        p077e4.l.h(oVar, this.f13069k);
        if (oVar2 != null) {
            p077e4.l.h(oVar2, this.f13070l);
        }
        p095f4.c cVar = this.f13034e;
        float f11 = aVar.f41718g;
        float fFloatValue = aVar.f41719h.floatValue();
        Path path = this.f13069k;
        return (Path) cVar.b(f11, fFloatValue, path, oVar2 == null ? path : this.f13070l, f10, e(), f());
    }

    public void s(List list) {
        this.f13071m = list;
    }
}
