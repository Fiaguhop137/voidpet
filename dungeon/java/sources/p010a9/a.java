package p010a9;

import Y8.e;
import Y8.i;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.core.view.Z;
import com.google.android.material.internal.j;
import com.google.android.material.internal.m;
import java.lang.ref.WeakReference;
import java.text.NumberFormat;
import p243n9.c;
import p243n9.d;
import p297q9.g;
import p297q9.k;

/* JADX INFO: loaded from: classes2.dex */
public class a extends Drawable implements j.b {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final int f19549n = Y8.j.f17209n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private static final int f19550o = Y8.a.f16983c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final WeakReference f19551a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final g f19552b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final j f19553c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Rect f19554d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final b f19555e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private float f19556f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private float f19557g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private int f19558h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private float f19559i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private float f19560j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private float f19561k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private WeakReference f19562l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private WeakReference f19563m;

    /* JADX INFO: renamed from: a9.a$a, reason: collision with other inner class name */
    class RunnableC0245a implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ View f19564a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ FrameLayout f19565b;

        RunnableC0245a(View view, FrameLayout frameLayout) {
            this.f19564a = view;
            this.f19565b = frameLayout;
        }

        @Override // java.lang.Runnable
        public void run() {
            a.this.Z(this.f19564a, this.f19565b);
        }
    }

    private a(Context context, int i10, int i11, int i12, b.a aVar) {
        this.f19551a = new WeakReference(context);
        m.c(context);
        this.f19554d = new Rect();
        j jVar = new j(this);
        this.f19553c = jVar;
        jVar.g().setTextAlign(Paint.Align.CENTER);
        b bVar = new b(context, i10, i11, i12, aVar);
        this.f19555e = bVar;
        this.f19552b = new g(k.b(context, C() ? bVar.o() : bVar.k(), C() ? bVar.n() : bVar.j()).m());
        R();
    }

    private int A() {
        int iT = C() ? this.f19555e.t() : this.f19555e.u();
        if (this.f19555e.f19577k == 1) {
            iT += C() ? this.f19555e.f19576j : this.f19555e.f19575i;
        }
        return iT + this.f19555e.d();
    }

    private int B() {
        int iE = this.f19555e.E();
        if (C()) {
            iE = this.f19555e.D();
            Context context = (Context) this.f19551a.get();
            if (context != null) {
                iE = Z8.a.c(iE, iE - this.f19555e.v(), Z8.a.b(0.0f, 1.0f, 0.3f, 1.0f, c.f(context) - 1.0f));
            }
        }
        if (this.f19555e.f19577k == 0) {
            iE -= Math.round(this.f19561k);
        }
        return iE + this.f19555e.e();
    }

    private boolean C() {
        return E() || D();
    }

    private boolean F() {
        FrameLayout frameLayoutL = l();
        return frameLayoutL != null && frameLayoutL.getId() == e.f17140v;
    }

    private void G() {
        this.f19553c.g().setAlpha(getAlpha());
        invalidateSelf();
    }

    private void H() {
        ColorStateList colorStateListValueOf = ColorStateList.valueOf(this.f19555e.g());
        if (this.f19552b.v() != colorStateListValueOf) {
            this.f19552b.W(colorStateListValueOf);
            invalidateSelf();
        }
    }

    private void I() {
        this.f19553c.l(true);
        K();
        a0();
        invalidateSelf();
    }

    private void J() {
        WeakReference weakReference = this.f19562l;
        if (weakReference == null || weakReference.get() == null) {
            return;
        }
        View view = (View) this.f19562l.get();
        WeakReference weakReference2 = this.f19563m;
        Z(view, weakReference2 != null ? (FrameLayout) weakReference2.get() : null);
    }

    private void K() {
        Context context = (Context) this.f19551a.get();
        if (context == null) {
            return;
        }
        this.f19552b.setShapeAppearanceModel(k.b(context, C() ? this.f19555e.o() : this.f19555e.k(), C() ? this.f19555e.n() : this.f19555e.j()).m());
        invalidateSelf();
    }

    private void L() {
        d dVar;
        Context context = (Context) this.f19551a.get();
        if (context == null || this.f19553c.e() == (dVar = new d(context, this.f19555e.C()))) {
            return;
        }
        this.f19553c.k(dVar, context);
        M();
        a0();
        invalidateSelf();
    }

    private void M() {
        this.f19553c.g().setColor(this.f19555e.l());
        invalidateSelf();
    }

    private void N() {
        b0();
        this.f19553c.l(true);
        a0();
        invalidateSelf();
    }

    private void O() {
        if (E()) {
            return;
        }
        I();
    }

    private void P() {
        I();
    }

    private void Q() {
        boolean zI = this.f19555e.I();
        setVisible(zI, false);
        if (!c.f19608a || l() == null || zI) {
            return;
        }
        ((ViewGroup) l().getParent()).invalidate();
    }

    private void R() {
        K();
        L();
        N();
        I();
        G();
        H();
        M();
        J();
        a0();
        Q();
    }

    private void X(View view) {
        ViewGroup viewGroup = (ViewGroup) view.getParent();
        if (viewGroup == null || viewGroup.getId() != e.f17140v) {
            WeakReference weakReference = this.f19563m;
            if (weakReference == null || weakReference.get() != viewGroup) {
                Y(view);
                FrameLayout frameLayout = new FrameLayout(view.getContext());
                frameLayout.setId(e.f17140v);
                frameLayout.setClipChildren(false);
                frameLayout.setClipToPadding(false);
                frameLayout.setLayoutParams(view.getLayoutParams());
                frameLayout.setMinimumWidth(view.getWidth());
                frameLayout.setMinimumHeight(view.getHeight());
                int iIndexOfChild = viewGroup.indexOfChild(view);
                viewGroup.removeViewAt(iIndexOfChild);
                view.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
                frameLayout.addView(view);
                viewGroup.addView(frameLayout, iIndexOfChild);
                this.f19563m = new WeakReference(frameLayout);
                frameLayout.post(new RunnableC0245a(view, frameLayout));
            }
        }
    }

    private static void Y(View view) {
        ViewGroup viewGroup = (ViewGroup) view.getParent();
        viewGroup.setClipChildren(false);
        viewGroup.setClipToPadding(false);
    }

    private void a0() {
        Context context = (Context) this.f19551a.get();
        WeakReference weakReference = this.f19562l;
        View view = weakReference != null ? (View) weakReference.get() : null;
        if (context == null || view == null) {
            return;
        }
        Rect rect = new Rect();
        rect.set(this.f19554d);
        Rect rect2 = new Rect();
        view.getDrawingRect(rect2);
        WeakReference weakReference2 = this.f19563m;
        ViewGroup viewGroup = weakReference2 != null ? (ViewGroup) weakReference2.get() : null;
        if (viewGroup != null || c.f19608a) {
            if (viewGroup == null) {
                viewGroup = (ViewGroup) view.getParent();
            }
            viewGroup.offsetDescendantRectToMyCoords(view, rect2);
        }
        c(rect2, view);
        c.f(this.f19554d, this.f19556f, this.f19557g, this.f19560j, this.f19561k);
        float f10 = this.f19559i;
        if (f10 != -1.0f) {
            this.f19552b.T(f10);
        }
        if (rect.equals(this.f19554d)) {
            return;
        }
        this.f19552b.setBounds(this.f19554d);
    }

    private void b(View view) {
        float y10;
        float x10;
        View viewL = l();
        if (viewL == null) {
            if (!(view.getParent() instanceof View)) {
                return;
            }
            float y11 = view.getY();
            x10 = view.getX();
            viewL = (View) view.getParent();
            y10 = y11;
        } else if (!F()) {
            y10 = 0.0f;
            x10 = 0.0f;
        } else {
            if (!(viewL.getParent() instanceof View)) {
                return;
            }
            y10 = viewL.getY();
            x10 = viewL.getX();
            viewL = (View) viewL.getParent();
        }
        float fZ = z(viewL, y10);
        float fO = o(viewL, x10);
        float fJ = j(viewL, y10);
        float fU = u(viewL, x10);
        if (fZ < 0.0f) {
            this.f19557g += Math.abs(fZ);
        }
        if (fO < 0.0f) {
            this.f19556f += Math.abs(fO);
        }
        if (fJ > 0.0f) {
            this.f19557g -= Math.abs(fJ);
        }
        if (fU > 0.0f) {
            this.f19556f -= Math.abs(fU);
        }
    }

    private void b0() {
        if (p() != -2) {
            this.f19558h = ((int) Math.pow(10.0d, ((double) p()) - 1.0d)) - 1;
        } else {
            this.f19558h = q();
        }
    }

    private void c(Rect rect, View view) {
        float f10 = C() ? this.f19555e.f19570d : this.f19555e.f19569c;
        this.f19559i = f10;
        if (f10 != -1.0f) {
            this.f19560j = f10;
            this.f19561k = f10;
        } else {
            this.f19560j = Math.round((C() ? this.f19555e.f19573g : this.f19555e.f19571e) / 2.0f);
            this.f19561k = Math.round((C() ? this.f19555e.f19574h : this.f19555e.f19572f) / 2.0f);
        }
        if (C()) {
            String strI = i();
            this.f19560j = Math.max(this.f19560j, (this.f19553c.h(strI) / 2.0f) + this.f19555e.i());
            float fMax = Math.max(this.f19561k, (this.f19553c.f(strI) / 2.0f) + this.f19555e.m());
            this.f19561k = fMax;
            this.f19560j = Math.max(this.f19560j, fMax);
        }
        int iB = B();
        int iH = this.f19555e.h();
        if (iH == 8388691 || iH == 8388693) {
            this.f19557g = rect.bottom - iB;
        } else {
            this.f19557g = rect.top + iB;
        }
        int iA = A();
        int iH2 = this.f19555e.h();
        if (iH2 == 8388659 || iH2 == 8388691) {
            this.f19556f = Z.z(view) == 0 ? (rect.left - this.f19560j) + iA : (rect.right + this.f19560j) - iA;
        } else {
            this.f19556f = Z.z(view) == 0 ? (rect.right + this.f19560j) - iA : (rect.left - this.f19560j) + iA;
        }
        if (this.f19555e.H()) {
            b(view);
        }
    }

    public static a f(Context context) {
        return new a(context, 0, f19550o, f19549n, null);
    }

    static a g(Context context, b.a aVar) {
        return new a(context, 0, f19550o, f19549n, aVar);
    }

    private void h(Canvas canvas) {
        String strI = i();
        if (strI != null) {
            Rect rect = new Rect();
            this.f19553c.g().getTextBounds(strI, 0, strI.length(), rect);
            float fExactCenterY = this.f19557g - rect.exactCenterY();
            canvas.drawText(strI, this.f19556f, rect.bottom <= 0 ? (int) fExactCenterY : Math.round(fExactCenterY), this.f19553c.g());
        }
    }

    private String i() {
        if (E()) {
            return x();
        }
        if (D()) {
            return s();
        }
        return null;
    }

    private float j(View view, float f10) {
        if (!(view.getParent() instanceof View)) {
            return 0.0f;
        }
        return ((this.f19557g + this.f19561k) - (((View) view.getParent()).getHeight() - view.getY())) + f10;
    }

    private CharSequence m() {
        return this.f19555e.r();
    }

    private float o(View view, float f10) {
        return (this.f19556f - this.f19560j) + view.getX() + f10;
    }

    private String s() {
        if (this.f19558h == -2 || r() <= this.f19558h) {
            return NumberFormat.getInstance(this.f19555e.z()).format(r());
        }
        Context context = (Context) this.f19551a.get();
        return context == null ? "" : String.format(this.f19555e.z(), context.getString(i.f17185p), Integer.valueOf(this.f19558h), "+");
    }

    private String t() {
        Context context;
        if (this.f19555e.s() == 0 || (context = (Context) this.f19551a.get()) == null) {
            return null;
        }
        return (this.f19558h == -2 || r() <= this.f19558h) ? context.getResources().getQuantityString(this.f19555e.s(), r(), Integer.valueOf(r())) : context.getString(this.f19555e.p(), Integer.valueOf(this.f19558h));
    }

    private float u(View view, float f10) {
        if (!(view.getParent() instanceof View)) {
            return 0.0f;
        }
        return ((this.f19556f + this.f19560j) - (((View) view.getParent()).getWidth() - view.getX())) + f10;
    }

    private String x() {
        String strW = w();
        int iP = p();
        if (iP == -2 || strW == null || strW.length() <= iP) {
            return strW;
        }
        Context context = (Context) this.f19551a.get();
        if (context == null) {
            return "";
        }
        return String.format(context.getString(i.f17178i), strW.substring(0, iP - 1), "…");
    }

    private CharSequence y() {
        CharSequence charSequenceQ = this.f19555e.q();
        return charSequenceQ != null ? charSequenceQ : w();
    }

    private float z(View view, float f10) {
        return (this.f19557g - this.f19561k) + view.getY() + f10;
    }

    public boolean D() {
        return !this.f19555e.G() && this.f19555e.F();
    }

    public boolean E() {
        return this.f19555e.G();
    }

    public void S(int i10) {
        this.f19555e.L(i10);
        H();
    }

    public void T(int i10) {
        if (this.f19553c.g().getColor() != i10) {
            this.f19555e.M(i10);
            M();
        }
    }

    public void U(int i10) {
        int iMax = Math.max(0, i10);
        if (this.f19555e.y() != iMax) {
            this.f19555e.N(iMax);
            O();
        }
    }

    public void V(String str) {
        if (TextUtils.equals(this.f19555e.B(), str)) {
            return;
        }
        this.f19555e.O(str);
        P();
    }

    public void W(boolean z10) {
        this.f19555e.P(z10);
        Q();
    }

    public void Z(View view, FrameLayout frameLayout) {
        this.f19562l = new WeakReference(view);
        boolean z10 = c.f19608a;
        if (z10 && frameLayout == null) {
            X(view);
        } else {
            this.f19563m = new WeakReference(frameLayout);
        }
        if (!z10) {
            Y(view);
        }
        a0();
        invalidateSelf();
    }

    @Override // com.google.android.material.internal.j.b
    public void a() {
        invalidateSelf();
    }

    public void d() {
        if (this.f19555e.F()) {
            this.f19555e.a();
            O();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        if (getBounds().isEmpty() || getAlpha() == 0 || !isVisible()) {
            return;
        }
        this.f19552b.draw(canvas);
        if (C()) {
            h(canvas);
        }
    }

    public void e() {
        if (this.f19555e.G()) {
            this.f19555e.b();
            P();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public int getAlpha() {
        return this.f19555e.f();
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        return this.f19554d.height();
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        return this.f19554d.width();
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isStateful() {
        return false;
    }

    public CharSequence k() {
        if (!isVisible()) {
            return null;
        }
        if (E()) {
            return y();
        }
        return D() ? t() : m();
    }

    public FrameLayout l() {
        WeakReference weakReference = this.f19563m;
        if (weakReference != null) {
            return (FrameLayout) weakReference.get();
        }
        return null;
    }

    public int n() {
        return this.f19555e.u();
    }

    @Override // android.graphics.drawable.Drawable, com.google.android.material.internal.j.b
    public boolean onStateChange(int[] iArr) {
        return super.onStateChange(iArr);
    }

    public int p() {
        return this.f19555e.w();
    }

    public int q() {
        return this.f19555e.x();
    }

    public int r() {
        if (this.f19555e.F()) {
            return this.f19555e.y();
        }
        return 0;
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i10) {
        this.f19555e.K(i10);
        G();
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
    }

    b.a v() {
        return this.f19555e.A();
    }

    public String w() {
        return this.f19555e.B();
    }
}
