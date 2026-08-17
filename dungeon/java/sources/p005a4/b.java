package p005a4;

import R3.AbstractC1358e;
import R3.C1364k;
import R3.L;
import T3.e;
import U3.d;
import U3.h;
import U3.s;
import X3.f;
import Z3.i;
import android.graphics.BlurMaskFilter;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import android.os.Build;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import p041c4.C2123j;
import p077e4.g;
import p077e4.r;
import p095f4.c;

/* JADX INFO: loaded from: classes.dex */
public abstract class b implements e, U3.a.b, f {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    private Paint f19371A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    float f19372B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    BlurMaskFilter f19373C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    S3.a f19374D;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Path f19375a = new Path();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Matrix f19376b = new Matrix();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Matrix f19377c = new Matrix();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Paint f19378d = new S3.a(1);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Paint f19379e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final Paint f19380f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final Paint f19381g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final Paint f19382h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final RectF f19383i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final RectF f19384j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final RectF f19385k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final RectF f19386l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final RectF f19387m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final String f19388n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    protected final Matrix f19389o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    final L f19390p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    final e f19391q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private h f19392r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private d f19393s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private b f19394t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private b f19395u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private List f19396v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private final List f19397w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final s f19398x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private boolean f19399y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private boolean f19400z;

    static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f19401a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        static final /* synthetic */ int[] f19402b;

        static {
            int[] iArr = new int[i.a.values().length];
            f19402b = iArr;
            try {
                iArr[i.a.MASK_MODE_NONE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f19402b[i.a.MASK_MODE_SUBTRACT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f19402b[i.a.MASK_MODE_INTERSECT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f19402b[i.a.MASK_MODE_ADD.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            int[] iArr2 = new int[e.a.values().length];
            f19401a = iArr2;
            try {
                iArr2[e.a.SHAPE.ordinal()] = 1;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f19401a[e.a.PRE_COMP.ordinal()] = 2;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f19401a[e.a.SOLID.ordinal()] = 3;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f19401a[e.a.IMAGE.ordinal()] = 4;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f19401a[e.a.NULL.ordinal()] = 5;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f19401a[e.a.TEXT.ordinal()] = 6;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f19401a[e.a.UNKNOWN.ordinal()] = 7;
            } catch (NoSuchFieldError unused11) {
            }
        }
    }

    b(L l10, e eVar) {
        PorterDuff.Mode mode = PorterDuff.Mode.DST_IN;
        this.f19379e = new S3.a(1, mode);
        PorterDuff.Mode mode2 = PorterDuff.Mode.DST_OUT;
        this.f19380f = new S3.a(1, mode2);
        S3.a aVar = new S3.a(1);
        this.f19381g = aVar;
        this.f19382h = new S3.a(PorterDuff.Mode.CLEAR);
        this.f19383i = new RectF();
        this.f19384j = new RectF();
        this.f19385k = new RectF();
        this.f19386l = new RectF();
        this.f19387m = new RectF();
        this.f19389o = new Matrix();
        this.f19397w = new ArrayList();
        this.f19399y = true;
        this.f19372B = 0.0f;
        this.f19390p = l10;
        this.f19391q = eVar;
        this.f19388n = eVar.j() + "#draw";
        if (eVar.i() == e.b.INVERT) {
            aVar.setXfermode(new PorterDuffXfermode(mode2));
        } else {
            aVar.setXfermode(new PorterDuffXfermode(mode));
        }
        s sVarB = eVar.x().b();
        this.f19398x = sVarB;
        sVarB.e(this);
        if (eVar.h() != null && !eVar.h().isEmpty()) {
            h hVar = new h(eVar.h());
            this.f19392r = hVar;
            Iterator it = hVar.a().iterator();
            while (it.hasNext()) {
                ((U3.a) it.next()).a(this);
            }
            for (U3.a aVar2 : this.f19392r.c()) {
                j(aVar2);
                aVar2.a(this);
            }
        }
        P();
    }

    private void D(RectF rectF, Matrix matrix) {
        this.f19385k.set(0.0f, 0.0f, 0.0f, 0.0f);
        if (B()) {
            int size = this.f19392r.b().size();
            for (int i10 = 0; i10 < size; i10++) {
                i iVar = (i) this.f19392r.b().get(i10);
                Path path = (Path) ((U3.a) this.f19392r.a().get(i10)).h();
                if (path != null) {
                    this.f19375a.set(path);
                    this.f19375a.transform(matrix);
                    int i11 = a.f19402b[iVar.a().ordinal()];
                    if (i11 == 1 || i11 == 2) {
                        return;
                    }
                    if ((i11 == 3 || i11 == 4) && iVar.d()) {
                        return;
                    }
                    this.f19375a.computeBounds(this.f19387m, false);
                    if (i10 == 0) {
                        this.f19385k.set(this.f19387m);
                    } else {
                        RectF rectF2 = this.f19385k;
                        rectF2.set(Math.min(rectF2.left, this.f19387m.left), Math.min(this.f19385k.top, this.f19387m.top), Math.max(this.f19385k.right, this.f19387m.right), Math.max(this.f19385k.bottom, this.f19387m.bottom));
                    }
                }
            }
            if (rectF.intersect(this.f19385k)) {
                return;
            }
            rectF.set(0.0f, 0.0f, 0.0f, 0.0f);
        }
    }

    private void E(RectF rectF, Matrix matrix) {
        if (C() && this.f19391q.i() != e.b.INVERT) {
            this.f19386l.set(0.0f, 0.0f, 0.0f, 0.0f);
            this.f19394t.f(this.f19386l, matrix, true);
            if (rectF.intersect(this.f19386l)) {
                return;
            }
            rectF.set(0.0f, 0.0f, 0.0f, 0.0f);
        }
    }

    private void F() {
        this.f19390p.invalidateSelf();
    }

    private void G(float f10) {
        this.f19390p.J().n().a(this.f19391q.j(), f10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void O(boolean z10) {
        if (z10 != this.f19399y) {
            this.f19399y = z10;
            F();
        }
    }

    private void P() {
        if (this.f19391q.f().isEmpty()) {
            O(true);
            return;
        }
        d dVar = new d(this.f19391q.f());
        this.f19393s = dVar;
        dVar.m();
        this.f19393s.a(new p005a4.a(this));
        O(((Float) this.f19393s.h()).floatValue() == 1.0f);
        j(this.f19393s);
    }

    private void k(Canvas canvas, Matrix matrix, U3.a aVar, U3.a aVar2) {
        this.f19375a.set((Path) aVar.h());
        this.f19375a.transform(matrix);
        this.f19378d.setAlpha((int) (((Integer) aVar2.h()).intValue() * 2.55f));
        canvas.drawPath(this.f19375a, this.f19378d);
    }

    private void l(Canvas canvas, Matrix matrix, U3.a aVar, U3.a aVar2) {
        r.n(canvas, this.f19383i, this.f19379e);
        this.f19375a.set((Path) aVar.h());
        this.f19375a.transform(matrix);
        this.f19378d.setAlpha((int) (((Integer) aVar2.h()).intValue() * 2.55f));
        canvas.drawPath(this.f19375a, this.f19378d);
        canvas.restore();
    }

    private void m(Canvas canvas, Matrix matrix, U3.a aVar, U3.a aVar2) {
        r.n(canvas, this.f19383i, this.f19378d);
        canvas.drawRect(this.f19383i, this.f19378d);
        this.f19375a.set((Path) aVar.h());
        this.f19375a.transform(matrix);
        this.f19378d.setAlpha((int) (((Integer) aVar2.h()).intValue() * 2.55f));
        canvas.drawPath(this.f19375a, this.f19380f);
        canvas.restore();
    }

    private void n(Canvas canvas, Matrix matrix, U3.a aVar, U3.a aVar2) {
        r.n(canvas, this.f19383i, this.f19379e);
        canvas.drawRect(this.f19383i, this.f19378d);
        this.f19380f.setAlpha((int) (((Integer) aVar2.h()).intValue() * 2.55f));
        this.f19375a.set((Path) aVar.h());
        this.f19375a.transform(matrix);
        canvas.drawPath(this.f19375a, this.f19380f);
        canvas.restore();
    }

    private void o(Canvas canvas, Matrix matrix, U3.a aVar, U3.a aVar2) {
        r.n(canvas, this.f19383i, this.f19380f);
        canvas.drawRect(this.f19383i, this.f19378d);
        this.f19380f.setAlpha((int) (((Integer) aVar2.h()).intValue() * 2.55f));
        this.f19375a.set((Path) aVar.h());
        this.f19375a.transform(matrix);
        canvas.drawPath(this.f19375a, this.f19380f);
        canvas.restore();
    }

    private void p(Canvas canvas, Matrix matrix) {
        if (AbstractC1358e.h()) {
            AbstractC1358e.b("Layer#saveLayer");
        }
        r.o(canvas, this.f19383i, this.f19379e, 19);
        if (Build.VERSION.SDK_INT < 28) {
            t(canvas);
        }
        if (AbstractC1358e.h()) {
            AbstractC1358e.c("Layer#saveLayer");
        }
        for (int i10 = 0; i10 < this.f19392r.b().size(); i10++) {
            i iVar = (i) this.f19392r.b().get(i10);
            U3.a aVar = (U3.a) this.f19392r.a().get(i10);
            U3.a aVar2 = (U3.a) this.f19392r.c().get(i10);
            int i11 = a.f19402b[iVar.a().ordinal()];
            if (i11 != 1) {
                if (i11 == 2) {
                    if (i10 == 0) {
                        this.f19378d.setColor(-16777216);
                        this.f19378d.setAlpha(255);
                        canvas.drawRect(this.f19383i, this.f19378d);
                    }
                    if (iVar.d()) {
                        o(canvas, matrix, aVar, aVar2);
                    } else {
                        q(canvas, matrix, aVar);
                    }
                } else if (i11 != 3) {
                    if (i11 == 4) {
                        if (iVar.d()) {
                            m(canvas, matrix, aVar, aVar2);
                        } else {
                            k(canvas, matrix, aVar, aVar2);
                        }
                    }
                } else if (iVar.d()) {
                    n(canvas, matrix, aVar, aVar2);
                } else {
                    l(canvas, matrix, aVar, aVar2);
                }
            } else if (r()) {
                this.f19378d.setAlpha(255);
                canvas.drawRect(this.f19383i, this.f19378d);
            }
        }
        if (AbstractC1358e.h()) {
            AbstractC1358e.b("Layer#restoreLayer");
        }
        canvas.restore();
        if (AbstractC1358e.h()) {
            AbstractC1358e.c("Layer#restoreLayer");
        }
    }

    private void q(Canvas canvas, Matrix matrix, U3.a aVar) {
        this.f19375a.set((Path) aVar.h());
        this.f19375a.transform(matrix);
        canvas.drawPath(this.f19375a, this.f19380f);
    }

    private boolean r() {
        if (this.f19392r.a().isEmpty()) {
            return false;
        }
        for (int i10 = 0; i10 < this.f19392r.b().size(); i10++) {
            if (((i) this.f19392r.b().get(i10)).a() != i.a.MASK_MODE_NONE) {
                return false;
            }
        }
        return true;
    }

    private void s() {
        if (this.f19396v != null) {
            return;
        }
        if (this.f19395u == null) {
            this.f19396v = Collections.EMPTY_LIST;
            return;
        }
        this.f19396v = new ArrayList();
        for (b bVar = this.f19395u; bVar != null; bVar = bVar.f19395u) {
            this.f19396v.add(bVar);
        }
    }

    private void t(Canvas canvas) {
        if (AbstractC1358e.h()) {
            AbstractC1358e.b("Layer#clearLayer");
        }
        RectF rectF = this.f19383i;
        canvas.drawRect(rectF.left - 1.0f, rectF.top - 1.0f, rectF.right + 1.0f, rectF.bottom + 1.0f, this.f19382h);
        if (AbstractC1358e.h()) {
            AbstractC1358e.c("Layer#clearLayer");
        }
    }

    static b v(c cVar, e eVar, L l10, C1364k c1364k) {
        switch (a.f19401a[eVar.g().ordinal()]) {
            case 1:
                return new g(l10, eVar, cVar, c1364k);
            case 2:
                return new c(l10, eVar, c1364k.o(eVar.n()), c1364k);
            case 3:
                return new h(l10, eVar);
            case 4:
                return new d(l10, eVar);
            case 5:
                return new f(l10, eVar);
            case 6:
                return new i(l10, eVar);
            default:
                g.c("Unknown layer type " + eVar.g());
                return null;
        }
    }

    e A() {
        return this.f19391q;
    }

    boolean B() {
        h hVar = this.f19392r;
        return (hVar == null || hVar.a().isEmpty()) ? false : true;
    }

    boolean C() {
        return this.f19394t != null;
    }

    public void I(U3.a aVar) {
        this.f19397w.remove(aVar);
    }

    void J(X3.e eVar, int i10, List list, X3.e eVar2) {
    }

    void K(b bVar) {
        this.f19394t = bVar;
    }

    void L(boolean z10) {
        if (z10 && this.f19371A == null) {
            this.f19371A = new S3.a();
        }
        this.f19400z = z10;
    }

    void M(b bVar) {
        this.f19395u = bVar;
    }

    void N(float f10) {
        if (AbstractC1358e.h()) {
            AbstractC1358e.b("BaseLayer#setProgress");
            AbstractC1358e.b("BaseLayer#setProgress.transform");
        }
        this.f19398x.m(f10);
        if (AbstractC1358e.h()) {
            AbstractC1358e.c("BaseLayer#setProgress.transform");
        }
        if (this.f19392r != null) {
            if (AbstractC1358e.h()) {
                AbstractC1358e.b("BaseLayer#setProgress.mask");
            }
            for (int i10 = 0; i10 < this.f19392r.a().size(); i10++) {
                ((U3.a) this.f19392r.a().get(i10)).n(f10);
            }
            if (AbstractC1358e.h()) {
                AbstractC1358e.c("BaseLayer#setProgress.mask");
            }
        }
        if (this.f19393s != null) {
            if (AbstractC1358e.h()) {
                AbstractC1358e.b("BaseLayer#setProgress.inout");
            }
            this.f19393s.n(f10);
            if (AbstractC1358e.h()) {
                AbstractC1358e.c("BaseLayer#setProgress.inout");
            }
        }
        if (this.f19394t != null) {
            if (AbstractC1358e.h()) {
                AbstractC1358e.b("BaseLayer#setProgress.matte");
            }
            this.f19394t.N(f10);
            if (AbstractC1358e.h()) {
                AbstractC1358e.c("BaseLayer#setProgress.matte");
            }
        }
        if (AbstractC1358e.h()) {
            AbstractC1358e.b("BaseLayer#setProgress.animations." + this.f19397w.size());
        }
        for (int i11 = 0; i11 < this.f19397w.size(); i11++) {
            ((U3.a) this.f19397w.get(i11)).n(f10);
        }
        if (AbstractC1358e.h()) {
            AbstractC1358e.c("BaseLayer#setProgress.animations." + this.f19397w.size());
            AbstractC1358e.c("BaseLayer#setProgress");
        }
    }

    @Override // X3.f
    public void a(Object obj, c cVar) {
        this.f19398x.f(obj, cVar);
    }

    @Override // U3.a.b
    public void b() {
        F();
    }

    @Override // T3.c
    public void c(List list, List list2) {
    }

    @Override // X3.f
    public void e(X3.e eVar, int i10, List list, X3.e eVar2) {
        b bVar = this.f19394t;
        if (bVar != null) {
            X3.e eVarA = eVar2.a(bVar.getName());
            if (eVar.c(this.f19394t.getName(), i10)) {
                list.add(eVarA.i(this.f19394t));
            }
            if (eVar.g(this.f19394t.getName(), i10) && eVar.h(getName(), i10)) {
                this.f19394t.J(eVar, eVar.e(this.f19394t.getName(), i10) + i10, list, eVarA);
            }
        }
        if (eVar.g(getName(), i10)) {
            if (!"__container".equals(getName())) {
                eVar2 = eVar2.a(getName());
                if (eVar.c(getName(), i10)) {
                    list.add(eVar2.i(this));
                }
            }
            if (eVar.h(getName(), i10)) {
                J(eVar, i10 + eVar.e(getName(), i10), list, eVar2);
            }
        }
    }

    @Override // T3.e
    public void f(RectF rectF, Matrix matrix, boolean z10) {
        this.f19383i.set(0.0f, 0.0f, 0.0f, 0.0f);
        s();
        this.f19389o.set(matrix);
        if (z10) {
            List list = this.f19396v;
            if (list != null) {
                for (int size = list.size() - 1; size >= 0; size--) {
                    this.f19389o.preConcat(((b) this.f19396v.get(size)).f19398x.i());
                }
            } else {
                b bVar = this.f19395u;
                if (bVar != null) {
                    this.f19389o.preConcat(bVar.f19398x.i());
                }
            }
        }
        this.f19389o.preConcat(this.f19398x.i());
    }

    @Override // T3.c
    public String getName() {
        return this.f19391q.j();
    }

    @Override // T3.e
    public void h(Canvas canvas, Matrix matrix, int i10, p077e4.d dVar) {
        Paint paint;
        Integer num;
        AbstractC1358e.b(this.f19388n);
        if (!this.f19399y || this.f19391q.y()) {
            AbstractC1358e.c(this.f19388n);
            return;
        }
        s();
        if (AbstractC1358e.h()) {
            AbstractC1358e.b("Layer#parentMatrix");
        }
        this.f19376b.reset();
        this.f19376b.set(matrix);
        for (int size = this.f19396v.size() - 1; size >= 0; size--) {
            this.f19376b.preConcat(((b) this.f19396v.get(size)).f19398x.i());
        }
        if (AbstractC1358e.h()) {
            AbstractC1358e.c("Layer#parentMatrix");
        }
        U3.a aVarK = this.f19398x.k();
        int iIntValue = (int) ((((i10 / 255.0f) * ((aVarK == null || (num = (Integer) aVarK.h()) == null) ? 100 : num.intValue())) / 100.0f) * 255.0f);
        if (!C() && !B() && w() == Z3.h.NORMAL) {
            this.f19376b.preConcat(this.f19398x.i());
            if (AbstractC1358e.h()) {
                AbstractC1358e.b("Layer#drawLayer");
            }
            u(canvas, this.f19376b, iIntValue, dVar);
            if (AbstractC1358e.h()) {
                AbstractC1358e.c("Layer#drawLayer");
            }
            G(AbstractC1358e.c(this.f19388n));
            return;
        }
        if (AbstractC1358e.h()) {
            AbstractC1358e.b("Layer#computeBounds");
        }
        f(this.f19383i, this.f19376b, false);
        E(this.f19383i, matrix);
        this.f19376b.preConcat(this.f19398x.i());
        D(this.f19383i, this.f19376b);
        this.f19384j.set(0.0f, 0.0f, canvas.getWidth(), canvas.getHeight());
        canvas.getMatrix(this.f19377c);
        if (!this.f19377c.isIdentity()) {
            Matrix matrix2 = this.f19377c;
            matrix2.invert(matrix2);
            this.f19377c.mapRect(this.f19384j);
        }
        if (!this.f19383i.intersect(this.f19384j)) {
            this.f19383i.set(0.0f, 0.0f, 0.0f, 0.0f);
        }
        if (AbstractC1358e.h()) {
            AbstractC1358e.c("Layer#computeBounds");
        }
        if (this.f19383i.width() >= 1.0f && this.f19383i.height() >= 1.0f) {
            if (AbstractC1358e.h()) {
                AbstractC1358e.b("Layer#saveLayer");
            }
            this.f19378d.setAlpha(255);
            p020b1.e.b(this.f19378d, w().g());
            r.n(canvas, this.f19383i, this.f19378d);
            if (AbstractC1358e.h()) {
                AbstractC1358e.c("Layer#saveLayer");
            }
            if (w() != Z3.h.MULTIPLY) {
                t(canvas);
            } else if (Build.VERSION.SDK_INT < 29) {
                if (this.f19374D == null) {
                    S3.a aVar = new S3.a();
                    this.f19374D = aVar;
                    aVar.setColor(-1);
                }
                RectF rectF = this.f19383i;
                canvas.drawRect(rectF.left - 1.0f, rectF.top - 1.0f, rectF.right + 1.0f, rectF.bottom + 1.0f, this.f19374D);
            }
            if (AbstractC1358e.h()) {
                AbstractC1358e.b("Layer#drawLayer");
            }
            u(canvas, this.f19376b, iIntValue, dVar);
            if (AbstractC1358e.h()) {
                AbstractC1358e.c("Layer#drawLayer");
            }
            if (B()) {
                p(canvas, this.f19376b);
            }
            if (C()) {
                if (AbstractC1358e.h()) {
                    AbstractC1358e.b("Layer#drawMatte");
                    AbstractC1358e.b("Layer#saveLayer");
                }
                r.o(canvas, this.f19383i, this.f19381g, 19);
                if (AbstractC1358e.h()) {
                    AbstractC1358e.c("Layer#saveLayer");
                }
                t(canvas);
                this.f19394t.h(canvas, matrix, i10, null);
                if (AbstractC1358e.h()) {
                    AbstractC1358e.b("Layer#restoreLayer");
                }
                canvas.restore();
                if (AbstractC1358e.h()) {
                    AbstractC1358e.c("Layer#restoreLayer");
                    AbstractC1358e.c("Layer#drawMatte");
                }
            }
            if (AbstractC1358e.h()) {
                AbstractC1358e.b("Layer#restoreLayer");
            }
            canvas.restore();
            if (AbstractC1358e.h()) {
                AbstractC1358e.c("Layer#restoreLayer");
            }
        }
        if (this.f19400z && (paint = this.f19371A) != null) {
            paint.setStyle(Paint.Style.STROKE);
            this.f19371A.setColor(-251901);
            this.f19371A.setStrokeWidth(4.0f);
            canvas.drawRect(this.f19383i, this.f19371A);
            this.f19371A.setStyle(Paint.Style.FILL);
            this.f19371A.setColor(1357638635);
            canvas.drawRect(this.f19383i, this.f19371A);
        }
        G(AbstractC1358e.c(this.f19388n));
    }

    public void j(U3.a aVar) {
        if (aVar == null) {
            return;
        }
        this.f19397w.add(aVar);
    }

    abstract void u(Canvas canvas, Matrix matrix, int i10, p077e4.d dVar);

    public Z3.h w() {
        return this.f19391q.a();
    }

    public Z3.a x() {
        return this.f19391q.b();
    }

    public BlurMaskFilter y(float f10) {
        if (this.f19372B == f10) {
            return this.f19373C;
        }
        BlurMaskFilter blurMaskFilter = new BlurMaskFilter(f10 / 2.0f, BlurMaskFilter.Blur.NORMAL);
        this.f19373C = blurMaskFilter;
        this.f19372B = f10;
        return blurMaskFilter;
    }

    public C2123j z() {
        return this.f19391q.d();
    }
}
