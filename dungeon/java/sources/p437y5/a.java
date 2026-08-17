package p437y5;

import A5.b;
import T5.d;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import p419x5.c;

/* JADX INFO: loaded from: classes2.dex */
public final class a implements p419x5.a, c.b {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final C0756a f57956r = new C0756a(null);

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private static final Class f57957s = a.class;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final d f57958a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final b f57959b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final p419x5.d f57960c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final c f57961d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final boolean f57962e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final A5.a f57963f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final b f57964g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final float[] f57965h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final Bitmap.Config f57966i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final Paint f57967j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private Rect f57968k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private int f57969l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private int f57970m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final Path f57971n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final Matrix f57972o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private int f57973p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private p419x5.a.InterfaceC0742a f57974q;

    /* JADX INFO: renamed from: y5.a$a, reason: collision with other inner class name */
    public static final class C0756a {
        private C0756a() {
        }

        public /* synthetic */ C0756a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public a(d platformBitmapFactory, b bitmapFrameCache, p419x5.d animationInformation, c bitmapFrameRenderer, boolean z10, A5.a aVar, b bVar, K5.d dVar) {
        Intrinsics.checkNotNullParameter(platformBitmapFactory, "platformBitmapFactory");
        Intrinsics.checkNotNullParameter(bitmapFrameCache, "bitmapFrameCache");
        Intrinsics.checkNotNullParameter(animationInformation, "animationInformation");
        Intrinsics.checkNotNullParameter(bitmapFrameRenderer, "bitmapFrameRenderer");
        this.f57958a = platformBitmapFactory;
        this.f57959b = bitmapFrameCache;
        this.f57960c = animationInformation;
        this.f57961d = bitmapFrameRenderer;
        this.f57962e = z10;
        this.f57963f = aVar;
        this.f57964g = bVar;
        this.f57965h = null;
        this.f57966i = Bitmap.Config.ARGB_8888;
        this.f57967j = new Paint(6);
        this.f57971n = new Path();
        this.f57972o = new Matrix();
        this.f57973p = -1;
        s();
    }

    private final void o(int i10, Bitmap bitmap, Canvas canvas) {
        Rect rect = this.f57968k;
        if (rect == null) {
            canvas.drawBitmap(bitmap, 0.0f, 0.0f, this.f57967j);
        } else if (t(i10, bitmap, rect.width(), rect.height())) {
            canvas.drawPath(this.f57971n, this.f57967j);
        } else {
            canvas.drawBitmap(bitmap, (Rect) null, rect, this.f57967j);
        }
    }

    private final boolean p(int i10, Z4.a aVar, Canvas canvas, int i11) {
        if (aVar == null || !Z4.a.r(aVar)) {
            return false;
        }
        Object objM = aVar.m();
        Intrinsics.checkNotNullExpressionValue(objM, "get(...)");
        o(i10, (Bitmap) objM, canvas);
        if (i11 == 3 || this.f57962e) {
            return true;
        }
        this.f57959b.a(i10, aVar, i11);
        return true;
    }

    private final boolean q(Canvas canvas, int i10, int i11) throws Throwable {
        Z4.a aVarE;
        boolean zP;
        Z4.a aVar = null;
        try {
            boolean z10 = false;
            int i12 = 1;
            if (this.f57962e) {
                A5.a aVar2 = this.f57963f;
                Z4.a aVarC = aVar2 != null ? aVar2.c(i10, canvas.getWidth(), canvas.getHeight()) : null;
                if (aVarC != null) {
                    try {
                        if (aVarC.p()) {
                            Object objM = aVarC.m();
                            Intrinsics.checkNotNullExpressionValue(objM, "get(...)");
                            o(i10, (Bitmap) objM, canvas);
                            Z4.a.g(aVarC);
                            return true;
                        }
                    } catch (Throwable th) {
                        th = th;
                        aVar = aVarC;
                        Z4.a.g(aVar);
                        throw th;
                    }
                }
                A5.a aVar3 = this.f57963f;
                if (aVar3 != null) {
                    aVar3.b(canvas.getWidth(), canvas.getHeight(), null);
                }
                Z4.a.g(aVarC);
                return false;
            }
            if (i11 == 0) {
                aVarE = this.f57959b.e(i10);
                zP = p(i10, aVarE, canvas, 0);
            } else if (i11 == 1) {
                aVarE = this.f57959b.d(i10, this.f57969l, this.f57970m);
                if (r(i10, aVarE) && p(i10, aVarE, canvas, 1)) {
                    z10 = true;
                }
                zP = z10;
                i12 = 2;
            } else if (i11 == 2) {
                try {
                    aVarE = this.f57958a.b(this.f57969l, this.f57970m, this.f57966i);
                    if (r(i10, aVarE) && p(i10, aVarE, canvas, 2)) {
                        z10 = true;
                    }
                    zP = z10;
                    i12 = 3;
                } catch (RuntimeException e10) {
                    W4.a.F(f57957s, "Failed to create frame bitmap", e10);
                    Z4.a.g(null);
                    return false;
                }
            } else {
                if (i11 != 3) {
                    Z4.a.g(null);
                    return false;
                }
                aVarE = this.f57959b.b(i10);
                zP = p(i10, aVarE, canvas, 3);
                i12 = -1;
            }
            Z4.a.g(aVarE);
            return (zP || i12 == -1) ? zP : q(canvas, i10, i12);
        } catch (Throwable th2) {
            th = th2;
            Z4.a.g(aVar);
            throw th;
        }
    }

    private final boolean r(int i10, Z4.a aVar) {
        if (aVar == null || !aVar.p()) {
            return false;
        }
        c cVar = this.f57961d;
        Object objM = aVar.m();
        Intrinsics.checkNotNullExpressionValue(objM, "get(...)");
        boolean zA = cVar.a(i10, (Bitmap) objM);
        if (!zA) {
            Z4.a.g(aVar);
        }
        return zA;
    }

    private final void s() {
        int iE = this.f57961d.e();
        this.f57969l = iE;
        if (iE == -1) {
            Rect rect = this.f57968k;
            this.f57969l = rect != null ? rect.width() : -1;
        }
        int iC = this.f57961d.c();
        this.f57970m = iC;
        if (iC == -1) {
            Rect rect2 = this.f57968k;
            this.f57970m = rect2 != null ? rect2.height() : -1;
        }
    }

    private final boolean t(int i10, Bitmap bitmap, float f10, float f11) {
        if (this.f57965h == null) {
            return false;
        }
        if (i10 == this.f57973p) {
            return true;
        }
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        BitmapShader bitmapShader = new BitmapShader(bitmap, tileMode, tileMode);
        this.f57972o.setRectToRect(new RectF(0.0f, 0.0f, this.f57969l, this.f57970m), new RectF(0.0f, 0.0f, f10, f11), Matrix.ScaleToFit.FILL);
        bitmapShader.setLocalMatrix(this.f57972o);
        this.f57967j.setShader(bitmapShader);
        this.f57971n.addRoundRect(new RectF(0.0f, 0.0f, f10, f11), this.f57965h, Path.Direction.CW);
        this.f57973p = i10;
        return true;
    }

    @Override // p419x5.d
    public int a() {
        return this.f57960c.a();
    }

    @Override // p419x5.d
    public int b() {
        return this.f57960c.b();
    }

    @Override // p419x5.a
    public int c() {
        return this.f57970m;
    }

    @Override // p419x5.a
    public void clear() {
        if (!this.f57962e) {
            this.f57959b.clear();
            return;
        }
        A5.a aVar = this.f57963f;
        if (aVar != null) {
            aVar.d();
        }
    }

    @Override // p419x5.a
    public void d(Rect rect) {
        this.f57968k = rect;
        this.f57961d.d(rect);
        s();
    }

    @Override // p419x5.a
    public int e() {
        return this.f57969l;
    }

    @Override // p419x5.a
    public void f(ColorFilter colorFilter) {
        this.f57967j.setColorFilter(colorFilter);
    }

    @Override // p419x5.d
    public int g() {
        return this.f57960c.g();
    }

    @Override // p419x5.a
    public boolean h(Drawable parent, Canvas canvas, int i10) throws Throwable {
        b bVar;
        A5.a aVar;
        Intrinsics.checkNotNullParameter(parent, "parent");
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        boolean zQ = q(canvas, i10, 0);
        if (!this.f57962e && (bVar = this.f57964g) != null && (aVar = this.f57963f) != null) {
            A5.a.C0004a.f(aVar, bVar, this.f57959b, this, i10, null, 16, null);
        }
        return zQ;
    }

    @Override // x5.c.b
    public void i() {
        if (!this.f57962e) {
            clear();
            return;
        }
        A5.a aVar = this.f57963f;
        if (aVar != null) {
            aVar.a();
        }
    }

    @Override // p419x5.d
    public int j() {
        return this.f57960c.j();
    }

    @Override // p419x5.a
    public void k(p419x5.a.InterfaceC0742a interfaceC0742a) {
        this.f57974q = interfaceC0742a;
    }

    @Override // p419x5.d
    public int l(int i10) {
        return this.f57960c.l(i10);
    }

    @Override // p419x5.a
    public void m(int i10) {
        this.f57967j.setAlpha(i10);
    }

    @Override // p419x5.d
    public int n() {
        return this.f57960c.n();
    }
}
