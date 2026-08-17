package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Shader;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import p020b1.AbstractC2044c;

/* JADX INFO: renamed from: androidx.appcompat.widget.k, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1823k {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final PorterDuff.Mode f21026b = PorterDuff.Mode.SRC_IN;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static C1823k f21027c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private X f21028a;

    /* JADX INFO: renamed from: androidx.appcompat.widget.k$a */
    class a implements X.c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final int[] f21029a = {p144i.e.f43138R, p144i.e.f43136P, p144i.e.f43140a};

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final int[] f21030b = {p144i.e.f43154o, p144i.e.f43122B, p144i.e.f43159t, p144i.e.f43155p, p144i.e.f43156q, p144i.e.f43158s, p144i.e.f43157r};

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final int[] f21031c = {p144i.e.f43135O, p144i.e.f43137Q, p144i.e.f43150k, p144i.e.f43131K, p144i.e.f43132L, p144i.e.f43133M, p144i.e.f43134N};

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final int[] f21032d = {p144i.e.f43162w, p144i.e.f43148i, p144i.e.f43161v};

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final int[] f21033e = {p144i.e.f43130J, p144i.e.f43139S};

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private final int[] f21034f = {p144i.e.f43142c, p144i.e.f43146g, p144i.e.f43143d, p144i.e.f43147h};

        a() {
        }

        private boolean f(int[] iArr, int i10) {
            for (int i11 : iArr) {
                if (i11 == i10) {
                    return true;
                }
            }
            return false;
        }

        private ColorStateList g(Context context) {
            return h(context, 0);
        }

        private ColorStateList h(Context context, int i10) {
            int iC = d0.c(context, p144i.a.f43092t);
            return new ColorStateList(new int[][]{d0.f20974b, d0.f20977e, d0.f20975c, d0.f20981i}, new int[]{d0.b(context, p144i.a.f43090r), AbstractC2044c.g(iC, i10), AbstractC2044c.g(iC, i10), i10});
        }

        private ColorStateList i(Context context) {
            return h(context, d0.c(context, p144i.a.f43089q));
        }

        private ColorStateList j(Context context) {
            return h(context, d0.c(context, p144i.a.f43090r));
        }

        private ColorStateList k(Context context) {
            int[][] iArr = new int[3][];
            int[] iArr2 = new int[3];
            ColorStateList colorStateListE = d0.e(context, p144i.a.f43095w);
            if (colorStateListE == null || !colorStateListE.isStateful()) {
                iArr[0] = d0.f20974b;
                iArr2[0] = d0.b(context, p144i.a.f43095w);
                iArr[1] = d0.f20978f;
                iArr2[1] = d0.c(context, p144i.a.f43091s);
                iArr[2] = d0.f20981i;
                iArr2[2] = d0.c(context, p144i.a.f43095w);
            } else {
                int[] iArr3 = d0.f20974b;
                iArr[0] = iArr3;
                iArr2[0] = colorStateListE.getColorForState(iArr3, 0);
                iArr[1] = d0.f20978f;
                iArr2[1] = d0.c(context, p144i.a.f43091s);
                iArr[2] = d0.f20981i;
                iArr2[2] = colorStateListE.getDefaultColor();
            }
            return new ColorStateList(iArr, iArr2);
        }

        private LayerDrawable l(X x10, Context context, int i10) {
            BitmapDrawable bitmapDrawable;
            BitmapDrawable bitmapDrawable2;
            BitmapDrawable bitmapDrawable3;
            int dimensionPixelSize = context.getResources().getDimensionPixelSize(i10);
            Drawable drawableI = x10.i(context, p144i.e.f43126F);
            Drawable drawableI2 = x10.i(context, p144i.e.f43127G);
            if ((drawableI instanceof BitmapDrawable) && drawableI.getIntrinsicWidth() == dimensionPixelSize && drawableI.getIntrinsicHeight() == dimensionPixelSize) {
                bitmapDrawable = (BitmapDrawable) drawableI;
                bitmapDrawable2 = new BitmapDrawable(bitmapDrawable.getBitmap());
            } else {
                Bitmap bitmapCreateBitmap = Bitmap.createBitmap(dimensionPixelSize, dimensionPixelSize, Bitmap.Config.ARGB_8888);
                Canvas canvas = new Canvas(bitmapCreateBitmap);
                drawableI.setBounds(0, 0, dimensionPixelSize, dimensionPixelSize);
                drawableI.draw(canvas);
                bitmapDrawable = new BitmapDrawable(bitmapCreateBitmap);
                bitmapDrawable2 = new BitmapDrawable(bitmapCreateBitmap);
            }
            bitmapDrawable2.setTileModeX(Shader.TileMode.REPEAT);
            if ((drawableI2 instanceof BitmapDrawable) && drawableI2.getIntrinsicWidth() == dimensionPixelSize && drawableI2.getIntrinsicHeight() == dimensionPixelSize) {
                bitmapDrawable3 = (BitmapDrawable) drawableI2;
            } else {
                Bitmap bitmapCreateBitmap2 = Bitmap.createBitmap(dimensionPixelSize, dimensionPixelSize, Bitmap.Config.ARGB_8888);
                Canvas canvas2 = new Canvas(bitmapCreateBitmap2);
                drawableI2.setBounds(0, 0, dimensionPixelSize, dimensionPixelSize);
                drawableI2.draw(canvas2);
                bitmapDrawable3 = new BitmapDrawable(bitmapCreateBitmap2);
            }
            LayerDrawable layerDrawable = new LayerDrawable(new Drawable[]{bitmapDrawable, bitmapDrawable3, bitmapDrawable2});
            layerDrawable.setId(0, 16908288);
            layerDrawable.setId(1, 16908303);
            layerDrawable.setId(2, 16908301);
            return layerDrawable;
        }

        private void m(Drawable drawable, int i10, PorterDuff.Mode mode) {
            Drawable drawableMutate = drawable.mutate();
            if (mode == null) {
                mode = C1823k.f21026b;
            }
            drawableMutate.setColorFilter(C1823k.e(i10, mode));
        }

        @Override // androidx.appcompat.widget.X.c
        public Drawable a(X x10, Context context, int i10) {
            if (i10 == p144i.e.f43149j) {
                return new LayerDrawable(new Drawable[]{x10.i(context, p144i.e.f43148i), x10.i(context, p144i.e.f43150k)});
            }
            if (i10 == p144i.e.f43164y) {
                return l(x10, context, p144i.d.f43114g);
            }
            if (i10 == p144i.e.f43163x) {
                return l(x10, context, p144i.d.f43115h);
            }
            if (i10 == p144i.e.f43165z) {
                return l(x10, context, p144i.d.f43116i);
            }
            return null;
        }

        @Override // androidx.appcompat.widget.X.c
        public ColorStateList b(Context context, int i10) {
            if (i10 == p144i.e.f43152m) {
                return p161j.a.a(context, p144i.c.f43104e);
            }
            if (i10 == p144i.e.f43129I) {
                return p161j.a.a(context, p144i.c.f43107h);
            }
            if (i10 == p144i.e.f43128H) {
                return k(context);
            }
            if (i10 == p144i.e.f43145f) {
                return j(context);
            }
            if (i10 == p144i.e.f43141b) {
                return g(context);
            }
            if (i10 == p144i.e.f43144e) {
                return i(context);
            }
            if (i10 == p144i.e.f43124D || i10 == p144i.e.f43125E) {
                return p161j.a.a(context, p144i.c.f43106g);
            }
            if (f(this.f21030b, i10)) {
                return d0.e(context, p144i.a.f43093u);
            }
            if (f(this.f21033e, i10)) {
                return p161j.a.a(context, p144i.c.f43103d);
            }
            if (f(this.f21034f, i10)) {
                return p161j.a.a(context, p144i.c.f43102c);
            }
            if (i10 == p144i.e.f43121A) {
                return p161j.a.a(context, p144i.c.f43105f);
            }
            return null;
        }

        /* JADX WARN: Code duplicated, block: B:23:0x0050  */
        /* JADX WARN: Code duplicated, block: B:25:0x0061  */
        /* JADX WARN: Code duplicated, block: B:27:0x0065 A[RETURN] */
        @Override // androidx.appcompat.widget.X.c
        public boolean c(Context context, int i10, Drawable drawable) {
            int i11;
            boolean z10;
            int iRound;
            Drawable drawableMutate;
            PorterDuff.Mode mode = C1823k.f21026b;
            if (!f(this.f21029a, i10)) {
                if (f(this.f21031c, i10)) {
                    i11 = p144i.a.f43091s;
                } else {
                    if (f(this.f21032d, i10)) {
                        mode = PorterDuff.Mode.MULTIPLY;
                    } else {
                        if (i10 == p144i.e.f43160u) {
                            iRound = Math.round(40.8f);
                            i11 = 16842800;
                            mode = mode;
                        } else if (i10 != p144i.e.f43151l) {
                            i11 = 0;
                            z10 = false;
                            iRound = -1;
                        }
                        z10 = true;
                    }
                    mode = mode;
                    iRound = -1;
                    i11 = 16842801;
                    z10 = true;
                }
                if (z10) {
                    return false;
                }
                drawableMutate = drawable.mutate();
                drawableMutate.setColorFilter(C1823k.e(d0.c(context, i11), mode));
                if (iRound != -1) {
                    drawableMutate.setAlpha(iRound);
                }
                return true;
            }
            i11 = p144i.a.f43093u;
            z10 = true;
            iRound = -1;
            if (z10) {
                return false;
            }
            drawableMutate = drawable.mutate();
            drawableMutate.setColorFilter(C1823k.e(d0.c(context, i11), mode));
            if (iRound != -1) {
                drawableMutate.setAlpha(iRound);
            }
            return true;
        }

        @Override // androidx.appcompat.widget.X.c
        public PorterDuff.Mode d(int i10) {
            if (i10 == p144i.e.f43128H) {
                return PorterDuff.Mode.MULTIPLY;
            }
            return null;
        }

        @Override // androidx.appcompat.widget.X.c
        public boolean e(Context context, int i10, Drawable drawable) {
            if (i10 == p144i.e.f43123C) {
                LayerDrawable layerDrawable = (LayerDrawable) drawable;
                m(layerDrawable.findDrawableByLayerId(16908288), d0.c(context, p144i.a.f43093u), C1823k.f21026b);
                m(layerDrawable.findDrawableByLayerId(16908303), d0.c(context, p144i.a.f43093u), C1823k.f21026b);
                m(layerDrawable.findDrawableByLayerId(16908301), d0.c(context, p144i.a.f43091s), C1823k.f21026b);
                return true;
            }
            if (i10 != p144i.e.f43164y && i10 != p144i.e.f43163x && i10 != p144i.e.f43165z) {
                return false;
            }
            LayerDrawable layerDrawable2 = (LayerDrawable) drawable;
            m(layerDrawable2.findDrawableByLayerId(16908288), d0.b(context, p144i.a.f43093u), C1823k.f21026b);
            m(layerDrawable2.findDrawableByLayerId(16908303), d0.c(context, p144i.a.f43091s), C1823k.f21026b);
            m(layerDrawable2.findDrawableByLayerId(16908301), d0.c(context, p144i.a.f43091s), C1823k.f21026b);
            return true;
        }
    }

    public static synchronized C1823k b() {
        try {
            if (f21027c == null) {
                h();
            }
        } catch (Throwable th) {
            throw th;
        }
        return f21027c;
    }

    public static synchronized PorterDuffColorFilter e(int i10, PorterDuff.Mode mode) {
        return X.k(i10, mode);
    }

    public static synchronized void h() {
        if (f21027c == null) {
            C1823k c1823k = new C1823k();
            f21027c = c1823k;
            c1823k.f21028a = X.g();
            f21027c.f21028a.t(new a());
        }
    }

    static void i(Drawable drawable, f0 f0Var, int[] iArr) {
        X.v(drawable, f0Var, iArr);
    }

    public synchronized Drawable c(Context context, int i10) {
        return this.f21028a.i(context, i10);
    }

    synchronized Drawable d(Context context, int i10, boolean z10) {
        return this.f21028a.j(context, i10, z10);
    }

    synchronized ColorStateList f(Context context, int i10) {
        return this.f21028a.l(context, i10);
    }

    public synchronized void g(Context context) {
        this.f21028a.r(context);
    }
}
