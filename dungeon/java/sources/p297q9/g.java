package p297q9;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Region;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Looper;
import android.util.AttributeSet;
import android.util.Log;
import com.google.android.material.drawable.d;
import java.util.BitSet;

/* JADX INFO: loaded from: classes2.dex */
public class g extends Drawable implements n {

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private static final String f51619x = "g";

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private static final Paint f51620y;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private c f51621a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final m.g[] f51622b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final m.g[] f51623c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final BitSet f51624d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f51625e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final Matrix f51626f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final Path f51627g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final Path f51628h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final RectF f51629i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final RectF f51630j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final Region f51631k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final Region f51632l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private k f51633m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final Paint f51634n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final Paint f51635o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private final p279p9.a f51636p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private final l.b f51637q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private final l f51638r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private PorterDuffColorFilter f51639s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private PorterDuffColorFilter f51640t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private int f51641u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private final RectF f51642v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private boolean f51643w;

    class a implements l.b {
        a() {
        }

        @Override // q9.l.b
        public void a(m mVar, Matrix matrix, int i10) {
            g.this.f51624d.set(i10, mVar.e());
            g.this.f51622b[i10] = mVar.f(matrix);
        }

        @Override // q9.l.b
        public void b(m mVar, Matrix matrix, int i10) {
            g.this.f51624d.set(i10 + 4, mVar.e());
            g.this.f51623c[i10] = mVar.f(matrix);
        }
    }

    class b implements k.c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ float f51645a;

        b(float f10) {
            this.f51645a = f10;
        }

        @Override // q9.k.c
        public p297q9.c a(p297q9.c cVar) {
            return cVar instanceof i ? cVar : new p297q9.b(this.f51645a, cVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public static class c extends Drawable.ConstantState {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        k f51647a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        p154i9.a f51648b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        ColorFilter f51649c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        ColorStateList f51650d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        ColorStateList f51651e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        ColorStateList f51652f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        ColorStateList f51653g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        PorterDuff.Mode f51654h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        Rect f51655i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        float f51656j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        float f51657k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        float f51658l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        int f51659m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        float f51660n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        float f51661o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        float f51662p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        int f51663q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        int f51664r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        int f51665s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        int f51666t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        boolean f51667u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        Paint.Style f51668v;

        public c(c cVar) {
            this.f51650d = null;
            this.f51651e = null;
            this.f51652f = null;
            this.f51653g = null;
            this.f51654h = PorterDuff.Mode.SRC_IN;
            this.f51655i = null;
            this.f51656j = 1.0f;
            this.f51657k = 1.0f;
            this.f51659m = 255;
            this.f51660n = 0.0f;
            this.f51661o = 0.0f;
            this.f51662p = 0.0f;
            this.f51663q = 0;
            this.f51664r = 0;
            this.f51665s = 0;
            this.f51666t = 0;
            this.f51667u = false;
            this.f51668v = Paint.Style.FILL_AND_STROKE;
            this.f51647a = cVar.f51647a;
            this.f51648b = cVar.f51648b;
            this.f51658l = cVar.f51658l;
            this.f51649c = cVar.f51649c;
            this.f51650d = cVar.f51650d;
            this.f51651e = cVar.f51651e;
            this.f51654h = cVar.f51654h;
            this.f51653g = cVar.f51653g;
            this.f51659m = cVar.f51659m;
            this.f51656j = cVar.f51656j;
            this.f51665s = cVar.f51665s;
            this.f51663q = cVar.f51663q;
            this.f51667u = cVar.f51667u;
            this.f51657k = cVar.f51657k;
            this.f51660n = cVar.f51660n;
            this.f51661o = cVar.f51661o;
            this.f51662p = cVar.f51662p;
            this.f51664r = cVar.f51664r;
            this.f51666t = cVar.f51666t;
            this.f51652f = cVar.f51652f;
            this.f51668v = cVar.f51668v;
            if (cVar.f51655i != null) {
                this.f51655i = new Rect(cVar.f51655i);
            }
        }

        public c(k kVar, p154i9.a aVar) {
            this.f51650d = null;
            this.f51651e = null;
            this.f51652f = null;
            this.f51653g = null;
            this.f51654h = PorterDuff.Mode.SRC_IN;
            this.f51655i = null;
            this.f51656j = 1.0f;
            this.f51657k = 1.0f;
            this.f51659m = 255;
            this.f51660n = 0.0f;
            this.f51661o = 0.0f;
            this.f51662p = 0.0f;
            this.f51663q = 0;
            this.f51664r = 0;
            this.f51665s = 0;
            this.f51666t = 0;
            this.f51667u = false;
            this.f51668v = Paint.Style.FILL_AND_STROKE;
            this.f51647a = kVar;
            this.f51648b = aVar;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public int getChangingConfigurations() {
            return 0;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable() {
            g gVar = new g(this);
            gVar.f51625e = true;
            return gVar;
        }
    }

    static {
        Paint paint = new Paint(1);
        f51620y = paint;
        paint.setColor(-1);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
    }

    public g() {
        this(new k());
    }

    public g(Context context, AttributeSet attributeSet, int i10, int i11) {
        this(k.e(context, attributeSet, i10, i11).m());
    }

    protected g(c cVar) {
        this.f51622b = new m.g[4];
        this.f51623c = new m.g[4];
        this.f51624d = new BitSet(8);
        this.f51626f = new Matrix();
        this.f51627g = new Path();
        this.f51628h = new Path();
        this.f51629i = new RectF();
        this.f51630j = new RectF();
        this.f51631k = new Region();
        this.f51632l = new Region();
        Paint paint = new Paint(1);
        this.f51634n = paint;
        Paint paint2 = new Paint(1);
        this.f51635o = paint2;
        this.f51636p = new p279p9.a();
        this.f51638r = Looper.getMainLooper().getThread() == Thread.currentThread() ? l.k() : new l();
        this.f51642v = new RectF();
        this.f51643w = true;
        this.f51621a = cVar;
        paint2.setStyle(Paint.Style.STROKE);
        paint.setStyle(Paint.Style.FILL);
        f0();
        e0(getState());
        this.f51637q = new a();
    }

    public g(k kVar) {
        this(new c(kVar, null));
    }

    private float C() {
        if (K()) {
            return this.f51635o.getStrokeWidth() / 2.0f;
        }
        return 0.0f;
    }

    private boolean I() {
        c cVar = this.f51621a;
        int i10 = cVar.f51663q;
        if (i10 == 1 || cVar.f51664r <= 0) {
            return false;
        }
        return i10 == 2 || S();
    }

    private boolean J() {
        Paint.Style style = this.f51621a.f51668v;
        return style == Paint.Style.FILL_AND_STROKE || style == Paint.Style.FILL;
    }

    private boolean K() {
        Paint.Style style = this.f51621a.f51668v;
        return (style == Paint.Style.FILL_AND_STROKE || style == Paint.Style.STROKE) && this.f51635o.getStrokeWidth() > 0.0f;
    }

    private void M() {
        super.invalidateSelf();
    }

    private void P(Canvas canvas) {
        if (I()) {
            canvas.save();
            R(canvas);
            if (!this.f51643w) {
                n(canvas);
                canvas.restore();
                return;
            }
            int iWidth = (int) (this.f51642v.width() - getBounds().width());
            int iHeight = (int) (this.f51642v.height() - getBounds().height());
            if (iWidth < 0 || iHeight < 0) {
                throw new IllegalStateException("Invalid shadow bounds. Check that the treatments result in a valid path.");
            }
            Bitmap bitmapCreateBitmap = Bitmap.createBitmap(((int) this.f51642v.width()) + (this.f51621a.f51664r * 2) + iWidth, ((int) this.f51642v.height()) + (this.f51621a.f51664r * 2) + iHeight, Bitmap.Config.ARGB_8888);
            Canvas canvas2 = new Canvas(bitmapCreateBitmap);
            float f10 = (getBounds().left - this.f51621a.f51664r) - iWidth;
            float f11 = (getBounds().top - this.f51621a.f51664r) - iHeight;
            canvas2.translate(-f10, -f11);
            n(canvas2);
            canvas.drawBitmap(bitmapCreateBitmap, f10, f11, (Paint) null);
            bitmapCreateBitmap.recycle();
            canvas.restore();
        }
    }

    private static int Q(int i10, int i11) {
        return (i10 * (i11 + (i11 >>> 7))) >>> 8;
    }

    private void R(Canvas canvas) {
        canvas.translate(z(), A());
    }

    private boolean e0(int[] iArr) {
        boolean z10;
        int color;
        int colorForState;
        int color2;
        int colorForState2;
        if (this.f51621a.f51650d == null || color2 == (colorForState2 = this.f51621a.f51650d.getColorForState(iArr, (color2 = this.f51634n.getColor())))) {
            z10 = false;
        } else {
            this.f51634n.setColor(colorForState2);
            z10 = true;
        }
        if (this.f51621a.f51651e == null || color == (colorForState = this.f51621a.f51651e.getColorForState(iArr, (color = this.f51635o.getColor())))) {
            return z10;
        }
        this.f51635o.setColor(colorForState);
        return true;
    }

    private PorterDuffColorFilter f(Paint paint, boolean z10) {
        if (!z10) {
            return null;
        }
        int color = paint.getColor();
        int iL = l(color);
        this.f51641u = iL;
        if (iL != color) {
            return new PorterDuffColorFilter(iL, PorterDuff.Mode.SRC_IN);
        }
        return null;
    }

    private boolean f0() {
        PorterDuffColorFilter porterDuffColorFilter = this.f51639s;
        PorterDuffColorFilter porterDuffColorFilter2 = this.f51640t;
        c cVar = this.f51621a;
        this.f51639s = k(cVar.f51653g, cVar.f51654h, this.f51634n, true);
        c cVar2 = this.f51621a;
        this.f51640t = k(cVar2.f51652f, cVar2.f51654h, this.f51635o, false);
        c cVar3 = this.f51621a;
        if (cVar3.f51667u) {
            this.f51636p.d(cVar3.f51653g.getColorForState(getState(), 0));
        }
        return (p199l1.c.a(porterDuffColorFilter, this.f51639s) && p199l1.c.a(porterDuffColorFilter2, this.f51640t)) ? false : true;
    }

    private void g(RectF rectF, Path path) {
        h(rectF, path);
        if (this.f51621a.f51656j != 1.0f) {
            this.f51626f.reset();
            Matrix matrix = this.f51626f;
            float f10 = this.f51621a.f51656j;
            matrix.setScale(f10, f10, rectF.width() / 2.0f, rectF.height() / 2.0f);
            path.transform(this.f51626f);
        }
        path.computeBounds(this.f51642v, true);
    }

    private void g0() {
        float fH = H();
        this.f51621a.f51664r = (int) Math.ceil(0.75f * fH);
        this.f51621a.f51665s = (int) Math.ceil(fH * 0.25f);
        f0();
        M();
    }

    private void i() {
        k kVarY = B().y(new b(-C()));
        this.f51633m = kVarY;
        this.f51638r.d(kVarY, this.f51621a.f51657k, t(), this.f51628h);
    }

    private PorterDuffColorFilter j(ColorStateList colorStateList, PorterDuff.Mode mode, boolean z10) {
        int colorForState = colorStateList.getColorForState(getState(), 0);
        if (z10) {
            colorForState = l(colorForState);
        }
        this.f51641u = colorForState;
        return new PorterDuffColorFilter(colorForState, mode);
    }

    private PorterDuffColorFilter k(ColorStateList colorStateList, PorterDuff.Mode mode, Paint paint, boolean z10) {
        return (colorStateList == null || mode == null) ? f(paint, z10) : j(colorStateList, mode, z10);
    }

    public static g m(Context context, float f10, ColorStateList colorStateList) {
        if (colorStateList == null) {
            colorStateList = ColorStateList.valueOf(p118g9.a.c(context, Y8.a.f17002s, g.class.getSimpleName()));
        }
        g gVar = new g();
        gVar.L(context);
        gVar.W(colorStateList);
        gVar.V(f10);
        return gVar;
    }

    private void n(Canvas canvas) {
        if (this.f51624d.cardinality() > 0) {
            Log.w(f51619x, "Compatibility shadow requested but can't be drawn for all operations in this shape.");
        }
        if (this.f51621a.f51665s != 0) {
            canvas.drawPath(this.f51627g, this.f51636p.c());
        }
        for (int i10 = 0; i10 < 4; i10++) {
            this.f51622b[i10].b(this.f51636p, this.f51621a.f51664r, canvas);
            this.f51623c[i10].b(this.f51636p, this.f51621a.f51664r, canvas);
        }
        if (this.f51643w) {
            int iZ = z();
            int iA = A();
            canvas.translate(-iZ, -iA);
            canvas.drawPath(this.f51627g, f51620y);
            canvas.translate(iZ, iA);
        }
    }

    private void o(Canvas canvas) {
        q(canvas, this.f51634n, this.f51627g, this.f51621a.f51647a, s());
    }

    private void q(Canvas canvas, Paint paint, Path path, k kVar, RectF rectF) {
        if (!kVar.u(rectF)) {
            canvas.drawPath(path, paint);
        } else {
            float fA = kVar.t().a(rectF) * this.f51621a.f51657k;
            canvas.drawRoundRect(rectF, fA, fA, paint);
        }
    }

    private RectF t() {
        this.f51630j.set(s());
        float fC = C();
        this.f51630j.inset(fC, fC);
        return this.f51630j;
    }

    public int A() {
        c cVar = this.f51621a;
        return (int) (((double) cVar.f51665s) * Math.cos(Math.toRadians(cVar.f51666t)));
    }

    public k B() {
        return this.f51621a.f51647a;
    }

    public ColorStateList D() {
        return this.f51621a.f51653g;
    }

    public float E() {
        return this.f51621a.f51647a.r().a(s());
    }

    public float F() {
        return this.f51621a.f51647a.t().a(s());
    }

    public float G() {
        return this.f51621a.f51662p;
    }

    public float H() {
        return u() + G();
    }

    public void L(Context context) {
        this.f51621a.f51648b = new p154i9.a(context);
        g0();
    }

    public boolean N() {
        p154i9.a aVar = this.f51621a.f51648b;
        return aVar != null && aVar.d();
    }

    public boolean O() {
        return this.f51621a.f51647a.u(s());
    }

    public boolean S() {
        return (O() || this.f51627g.isConvex() || Build.VERSION.SDK_INT >= 29) ? false : true;
    }

    public void T(float f10) {
        setShapeAppearanceModel(this.f51621a.f51647a.w(f10));
    }

    public void U(p297q9.c cVar) {
        setShapeAppearanceModel(this.f51621a.f51647a.x(cVar));
    }

    public void V(float f10) {
        c cVar = this.f51621a;
        if (cVar.f51661o != f10) {
            cVar.f51661o = f10;
            g0();
        }
    }

    public void W(ColorStateList colorStateList) {
        c cVar = this.f51621a;
        if (cVar.f51650d != colorStateList) {
            cVar.f51650d = colorStateList;
            onStateChange(getState());
        }
    }

    public void X(float f10) {
        c cVar = this.f51621a;
        if (cVar.f51657k != f10) {
            cVar.f51657k = f10;
            this.f51625e = true;
            invalidateSelf();
        }
    }

    public void Y(int i10, int i11, int i12, int i13) {
        c cVar = this.f51621a;
        if (cVar.f51655i == null) {
            cVar.f51655i = new Rect();
        }
        this.f51621a.f51655i.set(i10, i11, i12, i13);
        invalidateSelf();
    }

    public void Z(float f10) {
        c cVar = this.f51621a;
        if (cVar.f51660n != f10) {
            cVar.f51660n = f10;
            g0();
        }
    }

    public void a0(float f10, int i10) {
        d0(f10);
        c0(ColorStateList.valueOf(i10));
    }

    public void b0(float f10, ColorStateList colorStateList) {
        d0(f10);
        c0(colorStateList);
    }

    public void c0(ColorStateList colorStateList) {
        c cVar = this.f51621a;
        if (cVar.f51651e != colorStateList) {
            cVar.f51651e = colorStateList;
            onStateChange(getState());
        }
    }

    public void d0(float f10) {
        this.f51621a.f51658l = f10;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        this.f51634n.setColorFilter(this.f51639s);
        int alpha = this.f51634n.getAlpha();
        this.f51634n.setAlpha(Q(alpha, this.f51621a.f51659m));
        this.f51635o.setColorFilter(this.f51640t);
        this.f51635o.setStrokeWidth(this.f51621a.f51658l);
        int alpha2 = this.f51635o.getAlpha();
        this.f51635o.setAlpha(Q(alpha2, this.f51621a.f51659m));
        if (this.f51625e) {
            i();
            g(s(), this.f51627g);
            this.f51625e = false;
        }
        P(canvas);
        if (J()) {
            o(canvas);
        }
        if (K()) {
            r(canvas);
        }
        this.f51634n.setAlpha(alpha);
        this.f51635o.setAlpha(alpha2);
    }

    @Override // android.graphics.drawable.Drawable
    public int getAlpha() {
        return this.f51621a.f51659m;
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable.ConstantState getConstantState() {
        return this.f51621a;
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public void getOutline(Outline outline) {
        if (this.f51621a.f51663q == 2) {
            return;
        }
        if (O()) {
            outline.setRoundRect(getBounds(), E() * this.f51621a.f51657k);
        } else {
            g(s(), this.f51627g);
            d.j(outline, this.f51627g);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean getPadding(Rect rect) {
        Rect rect2 = this.f51621a.f51655i;
        if (rect2 == null) {
            return super.getPadding(rect);
        }
        rect.set(rect2);
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public Region getTransparentRegion() {
        this.f51631k.set(getBounds());
        g(s(), this.f51627g);
        this.f51632l.setPath(this.f51627g, this.f51631k);
        this.f51631k.op(this.f51632l, Region.Op.DIFFERENCE);
        return this.f51631k;
    }

    protected final void h(RectF rectF, Path path) {
        l lVar = this.f51638r;
        c cVar = this.f51621a;
        lVar.e(cVar.f51647a, cVar.f51657k, rectF, this.f51637q, path);
    }

    @Override // android.graphics.drawable.Drawable
    public void invalidateSelf() {
        this.f51625e = true;
        super.invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isStateful() {
        if (super.isStateful()) {
            return true;
        }
        ColorStateList colorStateList = this.f51621a.f51653g;
        if (colorStateList != null && colorStateList.isStateful()) {
            return true;
        }
        ColorStateList colorStateList2 = this.f51621a.f51652f;
        if (colorStateList2 != null && colorStateList2.isStateful()) {
            return true;
        }
        ColorStateList colorStateList3 = this.f51621a.f51651e;
        if (colorStateList3 != null && colorStateList3.isStateful()) {
            return true;
        }
        ColorStateList colorStateList4 = this.f51621a.f51650d;
        return colorStateList4 != null && colorStateList4.isStateful();
    }

    protected int l(int i10) {
        float fH = H() + x();
        p154i9.a aVar = this.f51621a.f51648b;
        return aVar != null ? aVar.c(i10, fH) : i10;
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable mutate() {
        this.f51621a = new c(this.f51621a);
        return this;
    }

    @Override // android.graphics.drawable.Drawable
    protected void onBoundsChange(Rect rect) {
        this.f51625e = true;
        super.onBoundsChange(rect);
    }

    @Override // android.graphics.drawable.Drawable, com.google.android.material.internal.j.b
    protected boolean onStateChange(int[] iArr) {
        boolean z10 = e0(iArr) || f0();
        if (z10) {
            invalidateSelf();
        }
        return z10;
    }

    protected void p(Canvas canvas, Paint paint, Path path, RectF rectF) {
        q(canvas, paint, path, this.f51621a.f51647a, rectF);
    }

    protected void r(Canvas canvas) {
        q(canvas, this.f51635o, this.f51628h, this.f51633m, t());
    }

    protected RectF s() {
        this.f51629i.set(getBounds());
        return this.f51629i;
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i10) {
        c cVar = this.f51621a;
        if (cVar.f51659m != i10) {
            cVar.f51659m = i10;
            M();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        this.f51621a.f51649c = colorFilter;
        M();
    }

    @Override // p297q9.n
    public void setShapeAppearanceModel(k kVar) {
        this.f51621a.f51647a = kVar;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void setTint(int i10) {
        setTintList(ColorStateList.valueOf(i10));
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintList(ColorStateList colorStateList) {
        this.f51621a.f51653g = colorStateList;
        f0();
        M();
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintMode(PorterDuff.Mode mode) {
        c cVar = this.f51621a;
        if (cVar.f51654h != mode) {
            cVar.f51654h = mode;
            f0();
            M();
        }
    }

    public float u() {
        return this.f51621a.f51661o;
    }

    public ColorStateList v() {
        return this.f51621a.f51650d;
    }

    public float w() {
        return this.f51621a.f51657k;
    }

    public float x() {
        return this.f51621a.f51660n;
    }

    public int y() {
        return this.f51641u;
    }

    public int z() {
        c cVar = this.f51621a;
        return (int) (((double) cVar.f51665s) * Math.sin(Math.toRadians(cVar.f51666t)));
    }
}
