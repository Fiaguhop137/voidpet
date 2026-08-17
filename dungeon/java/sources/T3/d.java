package T3;

import R3.C1364k;
import R3.L;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.RectF;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class d implements e, m, U3.a.b, X3.f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final e4.p.b f12120a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final RectF f12121b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final p077e4.p f12122c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Matrix f12123d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Path f12124e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final RectF f12125f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final String f12126g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final boolean f12127h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final List f12128i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final L f12129j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private List f12130k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private U3.s f12131l;

    public d(L l10, p005a4.b bVar, Z3.q qVar, C1364k c1364k) {
        this(l10, bVar, qVar.c(), qVar.d(), g(l10, c1364k, bVar, qVar.b()), j(qVar.b()));
    }

    d(L l10, p005a4.b bVar, String str, boolean z10, List list, Y3.n nVar) {
        this.f12120a = new e4.p.b();
        this.f12121b = new RectF();
        this.f12122c = new p077e4.p();
        this.f12123d = new Matrix();
        this.f12124e = new Path();
        this.f12125f = new RectF();
        this.f12126g = str;
        this.f12129j = l10;
        this.f12127h = z10;
        this.f12128i = list;
        if (nVar != null) {
            U3.s sVarB = nVar.b();
            this.f12131l = sVarB;
            sVarB.d(bVar);
            this.f12131l.e(this);
        }
        ArrayList arrayList = new ArrayList();
        for (int size = list.size() - 1; size >= 0; size--) {
            c cVar = (c) list.get(size);
            if (cVar instanceof j) {
                arrayList.add((j) cVar);
            }
        }
        for (int size2 = arrayList.size() - 1; size2 >= 0; size2--) {
            ((j) arrayList.get(size2)).g(list.listIterator(list.size()));
        }
    }

    private static List g(L l10, C1364k c1364k, p005a4.b bVar, List list) {
        ArrayList arrayList = new ArrayList(list.size());
        for (int i10 = 0; i10 < list.size(); i10++) {
            c cVarA = ((Z3.c) list.get(i10)).a(l10, c1364k, bVar);
            if (cVarA != null) {
                arrayList.add(cVarA);
            }
        }
        return arrayList;
    }

    static Y3.n j(List list) {
        for (int i10 = 0; i10 < list.size(); i10++) {
            Z3.c cVar = (Z3.c) list.get(i10);
            if (cVar instanceof Y3.n) {
                return (Y3.n) cVar;
            }
        }
        return null;
    }

    private boolean n() {
        int i10 = 0;
        for (int i11 = 0; i11 < this.f12128i.size(); i11++) {
            if ((this.f12128i.get(i11) instanceof e) && (i10 = i10 + 1) >= 2) {
                return true;
            }
        }
        return false;
    }

    @Override // T3.m
    public Path H() {
        this.f12123d.reset();
        U3.s sVar = this.f12131l;
        if (sVar != null) {
            this.f12123d.set(sVar.i());
        }
        this.f12124e.reset();
        if (this.f12127h) {
            return this.f12124e;
        }
        for (int size = this.f12128i.size() - 1; size >= 0; size--) {
            c cVar = (c) this.f12128i.get(size);
            if (cVar instanceof m) {
                this.f12124e.addPath(((m) cVar).H(), this.f12123d);
            }
        }
        return this.f12124e;
    }

    @Override // X3.f
    public void a(Object obj, p095f4.c cVar) {
        U3.s sVar = this.f12131l;
        if (sVar != null) {
            sVar.f(obj, cVar);
        }
    }

    @Override // U3.a.b
    public void b() {
        this.f12129j.invalidateSelf();
    }

    @Override // T3.c
    public void c(List list, List list2) {
        ArrayList arrayList = new ArrayList(list.size() + this.f12128i.size());
        arrayList.addAll(list);
        for (int size = this.f12128i.size() - 1; size >= 0; size--) {
            c cVar = (c) this.f12128i.get(size);
            cVar.c(arrayList, this.f12128i.subList(0, size));
            arrayList.add(cVar);
        }
    }

    @Override // X3.f
    public void e(X3.e eVar, int i10, List list, X3.e eVar2) {
        if (eVar.g(getName(), i10) || "__container".equals(getName())) {
            if (!"__container".equals(getName())) {
                eVar2 = eVar2.a(getName());
                if (eVar.c(getName(), i10)) {
                    list.add(eVar2.i(this));
                }
            }
            if (eVar.h(getName(), i10)) {
                int iE = i10 + eVar.e(getName(), i10);
                for (int i11 = 0; i11 < this.f12128i.size(); i11++) {
                    c cVar = (c) this.f12128i.get(i11);
                    if (cVar instanceof X3.f) {
                        ((X3.f) cVar).e(eVar, iE, list, eVar2);
                    }
                }
            }
        }
    }

    @Override // T3.e
    public void f(RectF rectF, Matrix matrix, boolean z10) {
        this.f12123d.set(matrix);
        U3.s sVar = this.f12131l;
        if (sVar != null) {
            this.f12123d.preConcat(sVar.i());
        }
        this.f12125f.set(0.0f, 0.0f, 0.0f, 0.0f);
        for (int size = this.f12128i.size() - 1; size >= 0; size--) {
            c cVar = (c) this.f12128i.get(size);
            if (cVar instanceof e) {
                ((e) cVar).f(this.f12125f, this.f12123d, z10);
                rectF.union(this.f12125f);
            }
        }
    }

    @Override // T3.c
    public String getName() {
        return this.f12126g;
    }

    @Override // T3.e
    public void h(Canvas canvas, Matrix matrix, int i10, p077e4.d dVar) {
        if (this.f12127h) {
            return;
        }
        this.f12123d.set(matrix);
        U3.s sVar = this.f12131l;
        if (sVar != null) {
            this.f12123d.preConcat(sVar.i());
            i10 = (int) (((((this.f12131l.k() == null ? 100 : ((Integer) this.f12131l.k().h()).intValue()) / 100.0f) * i10) / 255.0f) * 255.0f);
        }
        boolean z10 = (this.f12129j.f0() && n() && i10 != 255) || (dVar != null && this.f12129j.g0() && n());
        int i11 = z10 ? 255 : i10;
        if (z10) {
            this.f12121b.set(0.0f, 0.0f, 0.0f, 0.0f);
            f(this.f12121b, matrix, true);
            e4.p.b bVar = this.f12120a;
            bVar.f40420a = i10;
            if (dVar != null) {
                dVar.b(bVar);
                dVar = null;
            } else {
                bVar.f40423d = null;
            }
            canvas = this.f12122c.j(canvas, this.f12121b, this.f12120a);
        } else if (dVar != null) {
            p077e4.d dVar2 = new p077e4.d(dVar);
            dVar2.i(i11);
            dVar = dVar2;
        }
        for (int size = this.f12128i.size() - 1; size >= 0; size--) {
            Object obj = this.f12128i.get(size);
            if (obj instanceof e) {
                ((e) obj).h(canvas, this.f12123d, i11, dVar);
            }
        }
        if (z10) {
            this.f12122c.e();
        }
    }

    public List k() {
        return this.f12128i;
    }

    List l() {
        if (this.f12130k == null) {
            this.f12130k = new ArrayList();
            for (int i10 = 0; i10 < this.f12128i.size(); i10++) {
                c cVar = (c) this.f12128i.get(i10);
                if (cVar instanceof m) {
                    this.f12130k.add((m) cVar);
                }
            }
        }
        return this.f12130k;
    }

    Matrix m() {
        U3.s sVar = this.f12131l;
        if (sVar != null) {
            return sVar.i();
        }
        this.f12123d.reset();
        return this.f12123d;
    }
}
