package T3;

import android.graphics.Path;
import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

/* JADX INFO: loaded from: classes.dex */
public class l implements m, j {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final String f12186d;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final Z3.j f12188f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Path f12183a = new Path();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Path f12184b = new Path();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Path f12185c = new Path();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final List f12187e = new ArrayList();

    static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f12189a;

        static {
            int[] iArr = new int[Z3.j.a.values().length];
            f12189a = iArr;
            try {
                iArr[Z3.j.a.MERGE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f12189a[Z3.j.a.ADD.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f12189a[Z3.j.a.SUBTRACT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f12189a[Z3.j.a.INTERSECT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f12189a[Z3.j.a.EXCLUDE_INTERSECTIONS.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    public l(Z3.j jVar) {
        this.f12186d = jVar.c();
        this.f12188f = jVar;
    }

    private void a() {
        for (int i10 = 0; i10 < this.f12187e.size(); i10++) {
            this.f12185c.addPath(((m) this.f12187e.get(i10)).H());
        }
    }

    private void b(Path.Op op) {
        this.f12184b.reset();
        this.f12183a.reset();
        for (int size = this.f12187e.size() - 1; size >= 1; size--) {
            m mVar = (m) this.f12187e.get(size);
            if (mVar instanceof d) {
                d dVar = (d) mVar;
                List listL = dVar.l();
                for (int size2 = listL.size() - 1; size2 >= 0; size2--) {
                    Path pathH = ((m) listL.get(size2)).H();
                    pathH.transform(dVar.m());
                    this.f12184b.addPath(pathH);
                }
            } else {
                this.f12184b.addPath(mVar.H());
            }
        }
        m mVar2 = (m) this.f12187e.get(0);
        if (mVar2 instanceof d) {
            d dVar2 = (d) mVar2;
            List listL2 = dVar2.l();
            for (int i10 = 0; i10 < listL2.size(); i10++) {
                Path pathH2 = ((m) listL2.get(i10)).H();
                pathH2.transform(dVar2.m());
                this.f12183a.addPath(pathH2);
            }
        } else {
            this.f12183a.set(mVar2.H());
        }
        this.f12185c.op(this.f12183a, this.f12184b, op);
    }

    @Override // T3.m
    public Path H() {
        this.f12185c.reset();
        if (this.f12188f.d()) {
            return this.f12185c;
        }
        int i10 = a.f12189a[this.f12188f.b().ordinal()];
        if (i10 == 1) {
            a();
        } else if (i10 == 2) {
            b(Path.Op.UNION);
        } else if (i10 == 3) {
            b(Path.Op.REVERSE_DIFFERENCE);
        } else if (i10 == 4) {
            b(Path.Op.INTERSECT);
        } else if (i10 == 5) {
            b(Path.Op.XOR);
        }
        return this.f12185c;
    }

    @Override // T3.c
    public void c(List list, List list2) {
        for (int i10 = 0; i10 < this.f12187e.size(); i10++) {
            ((m) this.f12187e.get(i10)).c(list, list2);
        }
    }

    @Override // T3.j
    public void g(ListIterator listIterator) {
        while (listIterator.hasPrevious() && listIterator.previous() != this) {
        }
        while (listIterator.hasPrevious()) {
            c cVar = (c) listIterator.previous();
            if (cVar instanceof m) {
                this.f12187e.add((m) cVar);
                listIterator.remove();
            }
        }
    }
}
