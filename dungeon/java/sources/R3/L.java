package R3;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.ImageView;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.Semaphore;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes.dex */
public class L extends Drawable implements Drawable.Callback, Animatable {

    /* JADX INFO: renamed from: V, reason: collision with root package name */
    private static final boolean f10611V;

    /* JADX INFO: renamed from: W, reason: collision with root package name */
    private static final List f10612W;

    /* JADX INFO: renamed from: X, reason: collision with root package name */
    private static final Executor f10613X;

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    private final Matrix f10614A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    private Bitmap f10615B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    private Canvas f10616C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    private Rect f10617D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    private RectF f10618E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    private Paint f10619F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    private Rect f10620G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    private Rect f10621H;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    private RectF f10622I;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    private RectF f10623J;

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    private Matrix f10624K;

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    private float[] f10625L;

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    private Matrix f10626M;

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    private boolean f10627N;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private EnumC1354a f10628O;

    /* JADX INFO: renamed from: P, reason: collision with root package name */
    private final ValueAnimator.AnimatorUpdateListener f10629P;

    /* JADX INFO: renamed from: Q, reason: collision with root package name */
    private final Semaphore f10630Q;

    /* JADX INFO: renamed from: R, reason: collision with root package name */
    private Handler f10631R;

    /* JADX INFO: renamed from: S, reason: collision with root package name */
    private Runnable f10632S;

    /* JADX INFO: renamed from: T, reason: collision with root package name */
    private final Runnable f10633T;

    /* JADX INFO: renamed from: U, reason: collision with root package name */
    private float f10634U;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private C1364k f10635a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final p077e4.j f10636b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f10637c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f10638d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f10639e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private b f10640f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final ArrayList f10641g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private W3.b f10642h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private String f10643i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private W3.a f10644j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private Map f10645k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    String f10646l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    AbstractC1355b f10647m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    c0 f10648n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final N f10649o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private boolean f10650p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private boolean f10651q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private p005a4.c f10652r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private int f10653s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private boolean f10654t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private boolean f10655u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private boolean f10656v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private boolean f10657w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private boolean f10658x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private a0 f10659y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private boolean f10660z;

    /* JADX INFO: Access modifiers changed from: private */
    interface a {
        void a(C1364k c1364k);
    }

    private enum b {
        NONE,
        PLAY,
        RESUME
    }

    static {
        f10611V = Build.VERSION.SDK_INT <= 25;
        f10612W = Arrays.asList("reduced motion", "reduced_motion", "reduced-motion", "reducedmotion");
        f10613X = new ThreadPoolExecutor(0, 2, 35L, TimeUnit.MILLISECONDS, new LinkedBlockingQueue(), new p077e4.h());
    }

    public L() {
        p077e4.j jVar = new p077e4.j();
        this.f10636b = jVar;
        this.f10637c = true;
        this.f10638d = false;
        this.f10639e = false;
        this.f10640f = b.NONE;
        this.f10641g = new ArrayList();
        this.f10649o = new N();
        this.f10650p = false;
        this.f10651q = true;
        this.f10653s = 255;
        this.f10658x = false;
        this.f10659y = a0.AUTOMATIC;
        this.f10660z = false;
        this.f10614A = new Matrix();
        this.f10625L = new float[9];
        this.f10627N = false;
        F f10 = new F(this);
        this.f10629P = f10;
        this.f10630Q = new Semaphore(1);
        this.f10633T = new G(this);
        this.f10634U = -3.4028235E38f;
        jVar.addUpdateListener(f10);
    }

    private void C(int i10, int i11) {
        Bitmap bitmap = this.f10615B;
        if (bitmap == null || bitmap.getWidth() < i10 || this.f10615B.getHeight() < i11) {
            Bitmap bitmapCreateBitmap = Bitmap.createBitmap(i10, i11, Bitmap.Config.ARGB_8888);
            this.f10615B = bitmapCreateBitmap;
            this.f10616C.setBitmap(bitmapCreateBitmap);
            this.f10627N = true;
            return;
        }
        if (this.f10615B.getWidth() > i10 || this.f10615B.getHeight() > i11) {
            Bitmap bitmapCreateBitmap2 = Bitmap.createBitmap(this.f10615B, 0, 0, i10, i11);
            this.f10615B = bitmapCreateBitmap2;
            this.f10616C.setBitmap(bitmapCreateBitmap2);
            this.f10627N = true;
        }
    }

    private void D() {
        if (this.f10616C != null) {
            return;
        }
        this.f10616C = new Canvas();
        this.f10623J = new RectF();
        this.f10624K = new Matrix();
        this.f10626M = new Matrix();
        this.f10617D = new Rect();
        this.f10618E = new RectF();
        this.f10619F = new S3.a();
        this.f10620G = new Rect();
        this.f10621H = new Rect();
        this.f10622I = new RectF();
    }

    private Context K() {
        Drawable.Callback callback = getCallback();
        if (callback != null && (callback instanceof View)) {
            return ((View) callback).getContext();
        }
        return null;
    }

    private W3.a L() {
        if (getCallback() == null) {
            return null;
        }
        if (this.f10644j == null) {
            W3.a aVar = new W3.a(getCallback(), this.f10647m);
            this.f10644j = aVar;
            String str = this.f10646l;
            if (str != null) {
                aVar.c(str);
            }
        }
        return this.f10644j;
    }

    private W3.b N() {
        W3.b bVar = this.f10642h;
        if (bVar != null && !bVar.b(K())) {
            this.f10642h = null;
        }
        if (this.f10642h == null) {
            this.f10642h = new W3.b(getCallback(), this.f10643i, null, this.f10635a.j());
        }
        return this.f10642h;
    }

    private boolean X0() {
        C1364k c1364k = this.f10635a;
        if (c1364k == null) {
            return false;
        }
        float f10 = this.f10634U;
        float fN = this.f10636b.n();
        this.f10634U = fN;
        return Math.abs(fN - f10) * c1364k.d() >= 50.0f;
    }

    private boolean c0() {
        Drawable.Callback callback = getCallback();
        if (!(callback instanceof View)) {
            return false;
        }
        ViewParent parent = ((View) callback).getParent();
        if (parent instanceof ViewGroup) {
            return !((ViewGroup) parent).getClipChildren();
        }
        return false;
    }

    public static /* synthetic */ void g(L l10, ValueAnimator valueAnimator) {
        if (l10.F()) {
            l10.invalidateSelf();
            return;
        }
        p005a4.c cVar = l10.f10652r;
        if (cVar != null) {
            cVar.N(l10.f10636b.n());
        }
    }

    private static boolean i0(float f10) {
        return (Float.isNaN(f10) || Float.isInfinite(f10)) ? false : true;
    }

    private static boolean j0(RectF rectF) {
        return i0(rectF.left) && i0(rectF.top) && i0(rectF.right) && i0(rectF.bottom);
    }

    public static /* synthetic */ void k(L l10) {
        p005a4.c cVar = l10.f10652r;
        if (cVar == null) {
            return;
        }
        try {
            l10.f10630Q.acquire();
            cVar.N(l10.f10636b.n());
            if (f10611V && l10.f10627N) {
                if (l10.f10631R == null) {
                    l10.f10631R = new Handler(Looper.getMainLooper());
                    l10.f10632S = new B(l10);
                }
                l10.f10631R.post(l10.f10632S);
            }
        } catch (InterruptedException unused) {
        } finally {
            l10.f10630Q.release();
        }
    }

    private void m0(Canvas canvas, p005a4.c cVar) {
        if (this.f10635a == null || cVar == null) {
            return;
        }
        D();
        canvas.getMatrix(this.f10624K);
        canvas.getClipBounds(this.f10617D);
        x(this.f10617D, this.f10618E);
        this.f10624K.mapRect(this.f10618E);
        y(this.f10618E, this.f10617D);
        if (this.f10651q) {
            this.f10623J.set(0.0f, 0.0f, getIntrinsicWidth(), getIntrinsicHeight());
        } else {
            cVar.f(this.f10623J, null, false);
        }
        this.f10624K.mapRect(this.f10623J);
        Rect bounds = getBounds();
        float fWidth = bounds.width() / getIntrinsicWidth();
        float fHeight = bounds.height() / getIntrinsicHeight();
        q0(this.f10623J, fWidth, fHeight);
        if (!c0()) {
            RectF rectF = this.f10623J;
            Rect rect = this.f10617D;
            rectF.intersect(rect.left, rect.top, rect.right, rect.bottom);
        }
        if (!j0(this.f10623J)) {
            p077e4.g.c("Skipping software rendering: transformed bounds contain non-finite values.");
            return;
        }
        int iCeil = (int) Math.ceil(this.f10623J.width());
        int iCeil2 = (int) Math.ceil(this.f10623J.height());
        if (iCeil <= 0 || iCeil2 <= 0) {
            p077e4.g.c("Skipping software rendering: transformed bounds have negative values.");
            return;
        }
        long j10 = ((long) iCeil) * ((long) iCeil2);
        if (j10 > 50000000) {
            p077e4.g.c("Skipping software rendering: bitmap request exceeds safe pixel count (" + j10 + ")");
            return;
        }
        C(iCeil, iCeil2);
        if (this.f10627N) {
            this.f10624K.getValues(this.f10625L);
            float[] fArr = this.f10625L;
            float f10 = fArr[0];
            float f11 = fArr[4];
            this.f10614A.set(this.f10624K);
            this.f10614A.preScale(fWidth, fHeight);
            Matrix matrix = this.f10614A;
            RectF rectF2 = this.f10623J;
            matrix.postTranslate(-rectF2.left, -rectF2.top);
            this.f10614A.postScale(1.0f / f10, 1.0f / f11);
            this.f10615B.eraseColor(0);
            this.f10616C.setMatrix(p077e4.r.f40429a);
            this.f10616C.scale(f10, f11);
            cVar.h(this.f10616C, this.f10614A, this.f10653s, null);
            this.f10624K.invert(this.f10626M);
            this.f10626M.mapRect(this.f10622I, this.f10623J);
            y(this.f10622I, this.f10621H);
        }
        this.f10620G.set(0, 0, iCeil, iCeil2);
        canvas.drawBitmap(this.f10615B, this.f10620G, this.f10621H, this.f10619F);
    }

    public static /* synthetic */ void n(L l10) {
        Drawable.Callback callback = l10.getCallback();
        if (callback != null) {
            callback.invalidateDrawable(l10);
        }
    }

    private void q0(RectF rectF, float f10, float f11) {
        rectF.set(rectF.left * f10, rectF.top * f11, rectF.right * f10, rectF.bottom * f11);
    }

    private void t() {
        C1364k c1364k = this.f10635a;
        if (c1364k == null) {
            return;
        }
        p005a4.c cVar = new p005a4.c(this, p041c4.v.a(c1364k), c1364k.k(), c1364k);
        this.f10652r = cVar;
        if (this.f10655u) {
            cVar.L(true);
        }
        this.f10652r.R(this.f10651q);
    }

    private void w() {
        C1364k c1364k = this.f10635a;
        if (c1364k == null) {
            return;
        }
        this.f10660z = this.f10659y.g(Build.VERSION.SDK_INT, c1364k.q(), c1364k.m());
    }

    private void x(Rect rect, RectF rectF) {
        rectF.set(rect.left, rect.top, rect.right, rect.bottom);
    }

    private void y(RectF rectF, Rect rect) {
        rect.set((int) Math.floor(rectF.left), (int) Math.floor(rectF.top), (int) Math.ceil(rectF.right), (int) Math.ceil(rectF.bottom));
    }

    private void z(Canvas canvas) {
        p005a4.c cVar = this.f10652r;
        C1364k c1364k = this.f10635a;
        if (cVar == null || c1364k == null) {
            return;
        }
        this.f10614A.reset();
        Rect bounds = getBounds();
        if (!bounds.isEmpty()) {
            float fWidth = bounds.width() / c1364k.b().width();
            float fHeight = bounds.height() / c1364k.b().height();
            this.f10614A.preTranslate(bounds.left, bounds.top);
            this.f10614A.preScale(fWidth, fHeight);
        }
        cVar.h(canvas, this.f10614A, this.f10653s, null);
    }

    public void A(M m10, boolean z10) {
        boolean zA = this.f10649o.a(m10, z10);
        if (this.f10635a == null || !zA) {
            return;
        }
        t();
    }

    public void A0(int i10) {
        if (this.f10635a == null) {
            this.f10641g.add(new K(this, i10));
        } else {
            this.f10636b.D(i10);
        }
    }

    public void B() {
        this.f10641g.clear();
        this.f10636b.m();
        if (isVisible()) {
            return;
        }
        this.f10640f = b.NONE;
    }

    public void B0(boolean z10) {
        this.f10638d = z10;
    }

    public void C0(InterfaceC1356c interfaceC1356c) {
        W3.b bVar = this.f10642h;
        if (bVar != null) {
            bVar.d(interfaceC1356c);
        }
    }

    public void D0(String str) {
        this.f10643i = str;
    }

    public EnumC1354a E() {
        EnumC1354a enumC1354a = this.f10628O;
        return enumC1354a != null ? enumC1354a : AbstractC1358e.d();
    }

    public void E0(boolean z10) {
        this.f10650p = z10;
    }

    public boolean F() {
        return E() == EnumC1354a.ENABLED;
    }

    public void F0(int i10) {
        if (this.f10635a == null) {
            this.f10641g.add(new C1376x(this, i10));
        } else {
            this.f10636b.E(i10 + 0.99f);
        }
    }

    public Bitmap G(String str) {
        W3.b bVarN = N();
        if (bVarN != null) {
            return bVarN.a(str);
        }
        return null;
    }

    public void G0(String str) {
        C1364k c1364k = this.f10635a;
        if (c1364k == null) {
            this.f10641g.add(new D(this, str));
            return;
        }
        X3.h hVarL = c1364k.l(str);
        if (hVarL != null) {
            F0((int) (hVarL.f15289b + hVarL.f15290c));
            return;
        }
        throw new IllegalArgumentException("Cannot find marker with name " + str + ".");
    }

    public boolean H() {
        return this.f10658x;
    }

    public void H0(float f10) {
        C1364k c1364k = this.f10635a;
        if (c1364k == null) {
            this.f10641g.add(new A(this, f10));
        } else {
            this.f10636b.E(p077e4.l.i(c1364k.p(), this.f10635a.f(), f10));
        }
    }

    public boolean I() {
        return this.f10651q;
    }

    public void I0(int i10, int i11) {
        if (this.f10635a == null) {
            this.f10641g.add(new C1375w(this, i10, i11));
        } else {
            this.f10636b.F(i10, i11 + 0.99f);
        }
    }

    public C1364k J() {
        return this.f10635a;
    }

    public void J0(String str) {
        C1364k c1364k = this.f10635a;
        if (c1364k == null) {
            this.f10641g.add(new C1374v(this, str));
            return;
        }
        X3.h hVarL = c1364k.l(str);
        if (hVarL != null) {
            int i10 = (int) hVarL.f15289b;
            I0(i10, ((int) hVarL.f15290c) + i10);
        } else {
            throw new IllegalArgumentException("Cannot find marker with name " + str + ".");
        }
    }

    public void K0(int i10) {
        if (this.f10635a == null) {
            this.f10641g.add(new C1377y(this, i10));
        } else {
            this.f10636b.H(i10);
        }
    }

    public void L0(String str) {
        C1364k c1364k = this.f10635a;
        if (c1364k == null) {
            this.f10641g.add(new E(this, str));
            return;
        }
        X3.h hVarL = c1364k.l(str);
        if (hVarL != null) {
            K0((int) hVarL.f15289b);
            return;
        }
        throw new IllegalArgumentException("Cannot find marker with name " + str + ".");
    }

    public int M() {
        return (int) this.f10636b.o();
    }

    public void M0(float f10) {
        C1364k c1364k = this.f10635a;
        if (c1364k == null) {
            this.f10641g.add(new I(this, f10));
        } else {
            K0((int) p077e4.l.i(c1364k.p(), this.f10635a.f(), f10));
        }
    }

    public void N0(boolean z10) {
        if (this.f10655u == z10) {
            return;
        }
        this.f10655u = z10;
        p005a4.c cVar = this.f10652r;
        if (cVar != null) {
            cVar.L(z10);
        }
    }

    public String O() {
        return this.f10643i;
    }

    public void O0(boolean z10) {
        this.f10654t = z10;
        C1364k c1364k = this.f10635a;
        if (c1364k != null) {
            c1364k.v(z10);
        }
    }

    public O P(String str) {
        C1364k c1364k = this.f10635a;
        if (c1364k == null) {
            return null;
        }
        return (O) c1364k.j().get(str);
    }

    public void P0(float f10) {
        if (this.f10635a == null) {
            this.f10641g.add(new J(this, f10));
            return;
        }
        if (AbstractC1358e.h()) {
            AbstractC1358e.b("Drawable#setProgress");
        }
        this.f10636b.D(this.f10635a.h(f10));
        if (AbstractC1358e.h()) {
            AbstractC1358e.c("Drawable#setProgress");
        }
    }

    public boolean Q() {
        return this.f10650p;
    }

    public void Q0(a0 a0Var) {
        this.f10659y = a0Var;
        w();
    }

    public X3.h R() {
        Iterator it = f10612W.iterator();
        X3.h hVarL = null;
        while (it.hasNext()) {
            hVarL = this.f10635a.l((String) it.next());
            if (hVarL != null) {
                break;
            }
        }
        return hVarL;
    }

    public void R0(int i10) {
        this.f10636b.setRepeatCount(i10);
    }

    public float S() {
        return this.f10636b.q();
    }

    public void S0(int i10) {
        this.f10636b.setRepeatMode(i10);
    }

    public float T() {
        return this.f10636b.r();
    }

    public void T0(boolean z10) {
        this.f10639e = z10;
    }

    public X U() {
        C1364k c1364k = this.f10635a;
        if (c1364k != null) {
            return c1364k.n();
        }
        return null;
    }

    public void U0(float f10) {
        this.f10636b.I(f10);
    }

    public float V() {
        return this.f10636b.n();
    }

    public void V0(c0 c0Var) {
        this.f10648n = c0Var;
    }

    public a0 W() {
        return this.f10660z ? a0.SOFTWARE : a0.HARDWARE;
    }

    public void W0(boolean z10) {
        this.f10636b.J(z10);
    }

    public int X() {
        return this.f10636b.getRepeatCount();
    }

    public int Y() {
        return this.f10636b.getRepeatMode();
    }

    public boolean Y0() {
        return this.f10645k == null && this.f10648n == null && this.f10635a.c().m() > 0;
    }

    public float Z() {
        return this.f10636b.s();
    }

    public c0 a0() {
        return this.f10648n;
    }

    public Typeface b0(X3.c cVar) {
        Map map = this.f10645k;
        if (map != null) {
            String strA = cVar.a();
            if (map.containsKey(strA)) {
                return (Typeface) map.get(strA);
            }
            String strB = cVar.b();
            if (map.containsKey(strB)) {
                return (Typeface) map.get(strB);
            }
            String str = cVar.a() + "-" + cVar.c();
            if (map.containsKey(str)) {
                return (Typeface) map.get(str);
            }
        }
        W3.a aVarL = L();
        if (aVarL != null) {
            return aVarL.b(cVar);
        }
        return null;
    }

    public boolean d0() {
        p077e4.j jVar = this.f10636b;
        if (jVar == null) {
            return false;
        }
        return jVar.isRunning();
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        float fQ;
        float fN;
        p005a4.c cVar = this.f10652r;
        if (cVar == null) {
            return;
        }
        boolean zF = F();
        if (zF) {
            try {
                this.f10630Q.acquire();
            } catch (InterruptedException unused) {
                if (!zF) {
                    return;
                } else {
                    if ((fQ > fN ? 1 : (fQ == fN ? 0 : -1)) == 0) {
                        return;
                    }
                }
            } finally {
                if (AbstractC1358e.h()) {
                    AbstractC1358e.c("Drawable#draw");
                }
                if (zF) {
                    this.f10630Q.release();
                    if (cVar.Q() != this.f10636b.n()) {
                        f10613X.execute(this.f10633T);
                    }
                }
            }
        }
        if (AbstractC1358e.h()) {
            AbstractC1358e.b("Drawable#draw");
        }
        if (zF && X0()) {
            P0(this.f10636b.n());
        }
        if (this.f10639e) {
            try {
                if (this.f10660z) {
                    m0(canvas, cVar);
                } else {
                    z(canvas);
                }
            } catch (Throwable th) {
                p077e4.g.b("Lottie crashed in draw!", th);
            }
        } else if (this.f10660z) {
            m0(canvas, cVar);
        } else {
            z(canvas);
        }
        this.f10627N = false;
    }

    boolean e0() {
        if (isVisible()) {
            return this.f10636b.isRunning();
        }
        b bVar = this.f10640f;
        return bVar == b.PLAY || bVar == b.RESUME;
    }

    public boolean f0() {
        return this.f10656v;
    }

    public boolean g0() {
        return this.f10657w;
    }

    @Override // android.graphics.drawable.Drawable
    public int getAlpha() {
        return this.f10653s;
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        C1364k c1364k = this.f10635a;
        if (c1364k == null) {
            return -1;
        }
        return c1364k.b().height();
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        C1364k c1364k = this.f10635a;
        if (c1364k == null) {
            return -1;
        }
        return c1364k.b().width();
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    public boolean h0(M m10) {
        return this.f10649o.b(m10);
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void invalidateDrawable(Drawable drawable) {
        Drawable.Callback callback = getCallback();
        if (callback == null) {
            return;
        }
        callback.invalidateDrawable(this);
    }

    @Override // android.graphics.drawable.Drawable
    public void invalidateSelf() {
        Drawable.Callback callback;
        if (this.f10627N) {
            return;
        }
        this.f10627N = true;
        if ((!f10611V || Looper.getMainLooper() == Looper.myLooper()) && (callback = getCallback()) != null) {
            callback.invalidateDrawable(this);
        }
    }

    @Override // android.graphics.drawable.Animatable
    public boolean isRunning() {
        return d0();
    }

    public void k0() {
        this.f10641g.clear();
        this.f10636b.v();
        if (isVisible()) {
            return;
        }
        this.f10640f = b.NONE;
    }

    public void l0() {
        if (this.f10652r == null) {
            this.f10641g.add(new H(this));
            return;
        }
        w();
        if (s(K()) || X() == 0) {
            if (isVisible()) {
                this.f10636b.w();
                this.f10640f = b.NONE;
            } else {
                this.f10640f = b.PLAY;
            }
        }
        if (s(K())) {
            return;
        }
        X3.h hVarR = R();
        if (hVarR != null) {
            A0((int) hVarR.f15289b);
        } else {
            A0((int) (Z() < 0.0f ? T() : S()));
        }
        this.f10636b.m();
        if (isVisible()) {
            return;
        }
        this.f10640f = b.NONE;
    }

    public List n0(X3.e eVar) {
        if (this.f10652r == null) {
            p077e4.g.c("Cannot resolve KeyPath. Composition is not set yet.");
            return Collections.EMPTY_LIST;
        }
        ArrayList arrayList = new ArrayList();
        this.f10652r.e(eVar, 0, arrayList, new X3.e(new String[0]));
        return arrayList;
    }

    public void o0() {
        if (this.f10652r == null) {
            this.f10641g.add(new C(this));
            return;
        }
        w();
        if (s(K()) || X() == 0) {
            if (isVisible()) {
                this.f10636b.A();
                this.f10640f = b.NONE;
            } else {
                this.f10640f = b.RESUME;
            }
        }
        if (s(K())) {
            return;
        }
        A0((int) (Z() < 0.0f ? T() : S()));
        this.f10636b.m();
        if (isVisible()) {
            return;
        }
        this.f10640f = b.NONE;
    }

    public void p0() {
        this.f10636b.B();
    }

    public void q(Animator.AnimatorListener animatorListener) {
        this.f10636b.addListener(animatorListener);
    }

    public void r(X3.e eVar, Object obj, p095f4.c cVar) {
        p005a4.c cVar2 = this.f10652r;
        if (cVar2 == null) {
            this.f10641g.add(new C1378z(this, eVar, obj, cVar));
            return;
        }
        boolean zIsEmpty = true;
        if (eVar == X3.e.f15283c) {
            cVar2.a(obj, cVar);
        } else if (eVar.d() != null) {
            eVar.d().a(obj, cVar);
        } else {
            List listN0 = n0(eVar);
            for (int i10 = 0; i10 < listN0.size(); i10++) {
                ((X3.e) listN0.get(i10)).d().a(obj, cVar);
            }
            zIsEmpty = true ^ listN0.isEmpty();
        }
        if (zIsEmpty) {
            invalidateSelf();
            if (obj == T.f10682H) {
                P0(V());
            }
        }
    }

    public void r0(boolean z10) {
        this.f10656v = z10;
    }

    public boolean s(Context context) {
        if (this.f10638d) {
            return true;
        }
        return this.f10637c && AbstractC1358e.f().a(context) == V3.a.STANDARD_MOTION;
    }

    public void s0(boolean z10) {
        this.f10657w = z10;
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void scheduleDrawable(Drawable drawable, Runnable runnable, long j10) {
        Drawable.Callback callback = getCallback();
        if (callback == null) {
            return;
        }
        callback.scheduleDrawable(this, runnable, j10);
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i10) {
        this.f10653s = i10;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        p077e4.g.c("Use addColorFilter instead.");
    }

    @Override // android.graphics.drawable.Drawable
    public boolean setVisible(boolean z10, boolean z11) {
        boolean zIsVisible = isVisible();
        boolean visible = super.setVisible(z10, z11);
        if (z10) {
            b bVar = this.f10640f;
            if (bVar == b.PLAY) {
                l0();
                return visible;
            }
            if (bVar == b.RESUME) {
                o0();
                return visible;
            }
        } else {
            if (this.f10636b.isRunning()) {
                k0();
                this.f10640f = b.RESUME;
                return visible;
            }
            if (zIsVisible) {
                this.f10640f = b.NONE;
            }
        }
        return visible;
    }

    @Override // android.graphics.drawable.Animatable
    public void start() {
        Drawable.Callback callback = getCallback();
        if ((callback instanceof View) && ((View) callback).isInEditMode()) {
            return;
        }
        l0();
    }

    @Override // android.graphics.drawable.Animatable
    public void stop() {
        B();
    }

    public void t0(EnumC1354a enumC1354a) {
        this.f10628O = enumC1354a;
    }

    public void u() {
        this.f10641g.clear();
        this.f10636b.cancel();
        if (isVisible()) {
            return;
        }
        this.f10640f = b.NONE;
    }

    public void u0(boolean z10) {
        if (z10 != this.f10658x) {
            this.f10658x = z10;
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        Drawable.Callback callback = getCallback();
        if (callback == null) {
            return;
        }
        callback.unscheduleDrawable(this, runnable);
    }

    public void v() {
        if (this.f10636b.isRunning()) {
            this.f10636b.cancel();
            if (!isVisible()) {
                this.f10640f = b.NONE;
            }
        }
        this.f10635a = null;
        this.f10652r = null;
        this.f10642h = null;
        this.f10634U = -3.4028235E38f;
        this.f10636b.l();
        invalidateSelf();
    }

    public void v0(boolean z10) {
        if (z10 != this.f10651q) {
            this.f10651q = z10;
            p005a4.c cVar = this.f10652r;
            if (cVar != null) {
                cVar.R(z10);
            }
            invalidateSelf();
        }
    }

    public boolean w0(C1364k c1364k) {
        if (this.f10635a == c1364k) {
            return false;
        }
        this.f10627N = true;
        v();
        this.f10635a = c1364k;
        t();
        this.f10636b.C(c1364k);
        P0(this.f10636b.getAnimatedFraction());
        Iterator it = new ArrayList(this.f10641g).iterator();
        while (it.hasNext()) {
            a aVar = (a) it.next();
            if (aVar != null) {
                aVar.a(c1364k);
            }
            it.remove();
        }
        this.f10641g.clear();
        c1364k.v(this.f10654t);
        w();
        Drawable.Callback callback = getCallback();
        if (callback instanceof ImageView) {
            ImageView imageView = (ImageView) callback;
            imageView.setImageDrawable(null);
            imageView.setImageDrawable(this);
        }
        return true;
    }

    public void x0(String str) {
        this.f10646l = str;
        W3.a aVarL = L();
        if (aVarL != null) {
            aVarL.c(str);
        }
    }

    public void y0(AbstractC1355b abstractC1355b) {
        this.f10647m = abstractC1355b;
        W3.a aVar = this.f10644j;
        if (aVar != null) {
            aVar.d(abstractC1355b);
        }
    }

    public void z0(Map map) {
        if (map == this.f10645k) {
            return;
        }
        this.f10645k = map;
        invalidateSelf();
    }
}
