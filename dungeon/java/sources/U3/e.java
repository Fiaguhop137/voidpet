package U3;

import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class e extends g {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final Z3.d f13054i;

    public e(List list) {
        super(list);
        int iMax = 0;
        for (int i10 = 0; i10 < list.size(); i10++) {
            Z3.d dVar = (Z3.d) ((p095f4.a) list.get(i10)).f41713b;
            if (dVar != null) {
                iMax = Math.max(iMax, dVar.f());
            }
        }
        this.f13054i = new Z3.d(new float[iMax], new int[iMax]);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // U3.a
    /* JADX INFO: renamed from: r, reason: merged with bridge method [inline-methods] */
    public Z3.d i(p095f4.a aVar, float f10) {
        this.f13054i.g((Z3.d) aVar.f41713b, (Z3.d) aVar.f41714c, f10);
        return this.f13054i;
    }
}
