package p041c4;

import X3.a;
import Z3.o;
import android.graphics.PointF;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import p059d4.c;
import p077e4.l;

/* JADX INFO: loaded from: classes.dex */
public class H implements N {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final H f27195a = new H();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final c.a f27196b = c.a.a("c", "v", "i", "o");

    private H() {
    }

    @Override // p041c4.N
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public o a(c cVar, float f10) {
        if (cVar.d() == c.b.BEGIN_ARRAY) {
            cVar.N();
        }
        cVar.I();
        List listF = null;
        List listF2 = null;
        List listF3 = null;
        boolean zB = false;
        while (cVar.hasNext()) {
            int iF = cVar.f(f27196b);
            if (iF == 0) {
                zB = cVar.b();
            } else if (iF == 1) {
                listF = s.f(cVar, f10);
            } else if (iF == 2) {
                listF2 = s.f(cVar, f10);
            } else if (iF != 3) {
                cVar.g();
                cVar.k0();
            } else {
                listF3 = s.f(cVar, f10);
            }
        }
        cVar.T();
        if (cVar.d() == c.b.END_ARRAY) {
            cVar.J();
        }
        if (listF == null || listF2 == null || listF3 == null) {
            throw new IllegalArgumentException("Shape data was missing information.");
        }
        if (listF.isEmpty()) {
            return new o(new PointF(), false, Collections.EMPTY_LIST);
        }
        int size = listF.size();
        PointF pointF = (PointF) listF.get(0);
        ArrayList arrayList = new ArrayList(size);
        for (int i10 = 1; i10 < size; i10++) {
            PointF pointF2 = (PointF) listF.get(i10);
            int i11 = i10 - 1;
            arrayList.add(new a(l.a((PointF) listF.get(i11), (PointF) listF3.get(i11)), l.a(pointF2, (PointF) listF2.get(i10)), pointF2));
        }
        if (zB) {
            PointF pointF3 = (PointF) listF.get(0);
            int i12 = size - 1;
            arrayList.add(new a(l.a((PointF) listF.get(i12), (PointF) listF3.get(i12)), l.a(pointF3, (PointF) listF2.get(0)), pointF3));
        }
        return new o(pointF, zB, arrayList);
    }
}
