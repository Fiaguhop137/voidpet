package N4;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.ColorMatrix;
import android.graphics.ColorMatrixColorFilter;
import android.graphics.DashPathEffect;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RadialGradient;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.Typeface;
import android.util.Base64;
import android.util.Log;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import java.util.Stack;

/* JADX INFO: loaded from: classes.dex */
class h {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static HashSet f7645i;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Canvas f7646a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private float f7647b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private N4.g f7648c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private C0133h f7649d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private Stack f7650e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private Stack f7651f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private Stack f7652g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private N4.b.q f7653h = null;

    static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f7654a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        static final /* synthetic */ int[] f7655b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        static final /* synthetic */ int[] f7656c;

        static {
            int[] iArr = new int[N4.g.E.d.values().length];
            f7656c = iArr;
            try {
                iArr[N4.g.E.d.Miter.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f7656c[N4.g.E.d.Round.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f7656c[N4.g.E.d.Bevel.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            int[] iArr2 = new int[N4.g.E.c.values().length];
            f7655b = iArr2;
            try {
                iArr2[N4.g.E.c.Butt.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f7655b[N4.g.E.c.Round.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f7655b[N4.g.E.c.Square.ordinal()] = 3;
            } catch (NoSuchFieldError unused6) {
            }
            int[] iArr3 = new int[N4.e.a.values().length];
            f7654a = iArr3;
            try {
                iArr3[N4.e.a.xMidYMin.ordinal()] = 1;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f7654a[N4.e.a.xMidYMid.ordinal()] = 2;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f7654a[N4.e.a.xMidYMax.ordinal()] = 3;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f7654a[N4.e.a.xMaxYMin.ordinal()] = 4;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f7654a[N4.e.a.xMaxYMid.ordinal()] = 5;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f7654a[N4.e.a.xMaxYMax.ordinal()] = 6;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                f7654a[N4.e.a.xMinYMid.ordinal()] = 7;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                f7654a[N4.e.a.xMinYMax.ordinal()] = 8;
            } catch (NoSuchFieldError unused14) {
            }
        }
    }

    private class b implements N4.g.InterfaceC1203x {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private float f7658b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private float f7659c;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private boolean f7664h;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private List f7657a = new ArrayList();

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private c f7660d = null;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private boolean f7661e = false;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private boolean f7662f = true;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private int f7663g = -1;

        b(N4.g.C1202w c1202w) {
            if (c1202w == null) {
                return;
            }
            c1202w.h(this);
            if (this.f7664h) {
                this.f7660d.b((c) this.f7657a.get(this.f7663g));
                this.f7657a.set(this.f7663g, this.f7660d);
                this.f7664h = false;
            }
            c cVar = this.f7660d;
            if (cVar != null) {
                this.f7657a.add(cVar);
            }
        }

        @Override // N4.g.InterfaceC1203x
        public void a(float f10, float f11, float f12, float f13) {
            this.f7660d.a(f10, f11);
            this.f7657a.add(this.f7660d);
            this.f7660d = h.this.new c(f12, f13, f12 - f10, f13 - f11);
            this.f7664h = false;
        }

        @Override // N4.g.InterfaceC1203x
        public void b(float f10, float f11) {
            if (this.f7664h) {
                this.f7660d.b((c) this.f7657a.get(this.f7663g));
                this.f7657a.set(this.f7663g, this.f7660d);
                this.f7664h = false;
            }
            c cVar = this.f7660d;
            if (cVar != null) {
                this.f7657a.add(cVar);
            }
            this.f7658b = f10;
            this.f7659c = f11;
            this.f7660d = h.this.new c(f10, f11, 0.0f, 0.0f);
            this.f7663g = this.f7657a.size();
        }

        @Override // N4.g.InterfaceC1203x
        public void c(float f10, float f11, float f12, float f13, float f14, float f15) {
            if (this.f7662f || this.f7661e) {
                this.f7660d.a(f10, f11);
                this.f7657a.add(this.f7660d);
                this.f7661e = false;
            }
            this.f7660d = h.this.new c(f14, f15, f14 - f12, f15 - f13);
            this.f7664h = false;
        }

        @Override // N4.g.InterfaceC1203x
        public void close() {
            this.f7657a.add(this.f7660d);
            e(this.f7658b, this.f7659c);
            this.f7664h = true;
        }

        @Override // N4.g.InterfaceC1203x
        public void d(float f10, float f11, float f12, boolean z10, boolean z11, float f13, float f14) {
            this.f7661e = true;
            this.f7662f = false;
            c cVar = this.f7660d;
            h.h(cVar.f7666a, cVar.f7667b, f10, f11, f12, z10, z11, f13, f14, this);
            this.f7662f = true;
            this.f7664h = false;
        }

        @Override // N4.g.InterfaceC1203x
        public void e(float f10, float f11) {
            this.f7660d.a(f10, f11);
            this.f7657a.add(this.f7660d);
            h hVar = h.this;
            c cVar = this.f7660d;
            this.f7660d = hVar.new c(f10, f11, f10 - cVar.f7666a, f11 - cVar.f7667b);
            this.f7664h = false;
        }

        List f() {
            return this.f7657a;
        }
    }

    private class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        float f7666a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        float f7667b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        float f7668c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        float f7669d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        boolean f7670e = false;

        c(float f10, float f11, float f12, float f13) {
            this.f7668c = 0.0f;
            this.f7669d = 0.0f;
            this.f7666a = f10;
            this.f7667b = f11;
            double dSqrt = Math.sqrt((f12 * f12) + (f13 * f13));
            if (dSqrt != 0.0d) {
                this.f7668c = (float) (((double) f12) / dSqrt);
                this.f7669d = (float) (((double) f13) / dSqrt);
            }
        }

        void a(float f10, float f11) {
            float f12 = f10 - this.f7666a;
            float f13 = f11 - this.f7667b;
            double dSqrt = Math.sqrt((f12 * f12) + (f13 * f13));
            if (dSqrt != 0.0d) {
                f12 = (float) (((double) f12) / dSqrt);
                f13 = (float) (((double) f13) / dSqrt);
            }
            float f14 = this.f7668c;
            if (f12 != (-f14) || f13 != (-this.f7669d)) {
                this.f7668c = f14 + f12;
                this.f7669d += f13;
            } else {
                this.f7670e = true;
                this.f7668c = -f13;
                this.f7669d = f12;
            }
        }

        void b(c cVar) {
            float f10 = cVar.f7668c;
            float f11 = this.f7668c;
            if (f10 == (-f11)) {
                float f12 = cVar.f7669d;
                if (f12 == (-this.f7669d)) {
                    this.f7670e = true;
                    this.f7668c = -f12;
                    this.f7669d = cVar.f7668c;
                    return;
                }
            }
            this.f7668c = f11 + f10;
            this.f7669d += cVar.f7669d;
        }

        public String toString() {
            return "(" + this.f7666a + "," + this.f7667b + " " + this.f7668c + "," + this.f7669d + ")";
        }
    }

    private class d implements N4.g.InterfaceC1203x {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Path f7672a = new Path();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        float f7673b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        float f7674c;

        d(N4.g.C1202w c1202w) {
            if (c1202w == null) {
                return;
            }
            c1202w.h(this);
        }

        @Override // N4.g.InterfaceC1203x
        public void a(float f10, float f11, float f12, float f13) {
            this.f7672a.quadTo(f10, f11, f12, f13);
            this.f7673b = f12;
            this.f7674c = f13;
        }

        @Override // N4.g.InterfaceC1203x
        public void b(float f10, float f11) {
            this.f7672a.moveTo(f10, f11);
            this.f7673b = f10;
            this.f7674c = f11;
        }

        @Override // N4.g.InterfaceC1203x
        public void c(float f10, float f11, float f12, float f13, float f14, float f15) {
            this.f7672a.cubicTo(f10, f11, f12, f13, f14, f15);
            this.f7673b = f14;
            this.f7674c = f15;
        }

        @Override // N4.g.InterfaceC1203x
        public void close() {
            this.f7672a.close();
        }

        @Override // N4.g.InterfaceC1203x
        public void d(float f10, float f11, float f12, boolean z10, boolean z11, float f13, float f14) {
            h.h(this.f7673b, this.f7674c, f10, f11, f12, z10, z11, f13, f14, this);
            this.f7673b = f13;
            this.f7674c = f14;
        }

        @Override // N4.g.InterfaceC1203x
        public void e(float f10, float f11) {
            this.f7672a.lineTo(f10, f11);
            this.f7673b = f10;
            this.f7674c = f11;
        }

        Path f() {
            return this.f7672a;
        }
    }

    private class e extends f {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private Path f7676e;

        e(Path path, float f10, float f11) {
            super(f10, f11);
            this.f7676e = path;
        }

        @Override // N4.h.f, N4.h.j
        public void b(String str) {
            String str2;
            if (h.this.Y0()) {
                if (h.this.f7649d.f7686b) {
                    str2 = str;
                    h.this.f7646a.drawTextOnPath(str2, this.f7676e, this.f7678b, this.f7679c, h.this.f7649d.f7688d);
                } else {
                    str2 = str;
                }
                if (h.this.f7649d.f7687c) {
                    h.this.f7646a.drawTextOnPath(str2, this.f7676e, this.f7678b, this.f7679c, h.this.f7649d.f7689e);
                }
            } else {
                str2 = str;
            }
            this.f7678b += h.this.f7649d.f7688d.measureText(str2);
        }
    }

    private class f extends j {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        float f7678b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        float f7679c;

        f(float f10, float f11) {
            super(h.this, null);
            this.f7678b = f10;
            this.f7679c = f11;
        }

        @Override // N4.h.j
        public void b(String str) {
            h.y("TextSequence render", new Object[0]);
            if (h.this.Y0()) {
                if (h.this.f7649d.f7686b) {
                    h.this.f7646a.drawText(str, this.f7678b, this.f7679c, h.this.f7649d.f7688d);
                }
                if (h.this.f7649d.f7687c) {
                    h.this.f7646a.drawText(str, this.f7678b, this.f7679c, h.this.f7649d.f7689e);
                }
            }
            this.f7678b += h.this.f7649d.f7688d.measureText(str);
        }
    }

    private class g extends j {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        float f7681b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        float f7682c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Path f7683d;

        g(float f10, float f11, Path path) {
            super(h.this, null);
            this.f7681b = f10;
            this.f7682c = f11;
            this.f7683d = path;
        }

        @Override // N4.h.j
        public boolean a(N4.g.Y y10) {
            if (!(y10 instanceof N4.g.Z)) {
                return true;
            }
            h.Z0("Using <textPath> elements in a clip path is not supported.", new Object[0]);
            return false;
        }

        @Override // N4.h.j
        public void b(String str) {
            String str2;
            if (h.this.Y0()) {
                Path path = new Path();
                str2 = str;
                h.this.f7649d.f7688d.getTextPath(str2, 0, str.length(), this.f7681b, this.f7682c, path);
                this.f7683d.addPath(path);
            } else {
                str2 = str;
            }
            this.f7681b += h.this.f7649d.f7688d.measureText(str2);
        }
    }

    /* JADX INFO: renamed from: N4.h$h, reason: collision with other inner class name */
    private class C0133h {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        N4.g.E f7685a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        boolean f7686b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        boolean f7687c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Paint f7688d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Paint f7689e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        N4.g.C1182b f7690f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        N4.g.C1182b f7691g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        boolean f7692h;

        C0133h() {
            Paint paint = new Paint();
            this.f7688d = paint;
            paint.setFlags(193);
            this.f7688d.setHinting(0);
            this.f7688d.setStyle(Paint.Style.FILL);
            Paint paint2 = this.f7688d;
            Typeface typeface = Typeface.DEFAULT;
            paint2.setTypeface(typeface);
            Paint paint3 = new Paint();
            this.f7689e = paint3;
            paint3.setFlags(193);
            this.f7689e.setHinting(0);
            this.f7689e.setStyle(Paint.Style.STROKE);
            this.f7689e.setTypeface(typeface);
            this.f7685a = N4.g.E.b();
        }

        C0133h(C0133h c0133h) {
            this.f7686b = c0133h.f7686b;
            this.f7687c = c0133h.f7687c;
            this.f7688d = new Paint(c0133h.f7688d);
            this.f7689e = new Paint(c0133h.f7689e);
            N4.g.C1182b c1182b = c0133h.f7690f;
            if (c1182b != null) {
                this.f7690f = new N4.g.C1182b(c1182b);
            }
            N4.g.C1182b c1182b2 = c0133h.f7691g;
            if (c1182b2 != null) {
                this.f7691g = new N4.g.C1182b(c1182b2);
            }
            this.f7692h = c0133h.f7692h;
            try {
                this.f7685a = (N4.g.E) c0133h.f7685a.clone();
            } catch (CloneNotSupportedException e10) {
                Log.e("SVGAndroidRenderer", "Unexpected clone error", e10);
                this.f7685a = N4.g.E.b();
            }
        }
    }

    private class i extends j {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        float f7694b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        float f7695c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        RectF f7696d;

        i(float f10, float f11) {
            super(h.this, null);
            this.f7696d = new RectF();
            this.f7694b = f10;
            this.f7695c = f11;
        }

        @Override // N4.h.j
        public boolean a(N4.g.Y y10) {
            if (!(y10 instanceof N4.g.Z)) {
                return true;
            }
            N4.g.Z z10 = (N4.g.Z) y10;
            N4.g.N nS = y10.f7535a.s(z10.f7548o);
            if (nS == null) {
                h.F("TextPath path reference '%s' not found", z10.f7548o);
                return false;
            }
            N4.g.C1201v c1201v = (N4.g.C1201v) nS;
            Path pathF = h.this.new d(c1201v.f7630o).f();
            Matrix matrix = c1201v.f7602n;
            if (matrix != null) {
                pathF.transform(matrix);
            }
            RectF rectF = new RectF();
            pathF.computeBounds(rectF, true);
            this.f7696d.union(rectF);
            return false;
        }

        @Override // N4.h.j
        public void b(String str) {
            if (h.this.Y0()) {
                Rect rect = new Rect();
                h.this.f7649d.f7688d.getTextBounds(str, 0, str.length(), rect);
                RectF rectF = new RectF(rect);
                rectF.offset(this.f7694b, this.f7695c);
                this.f7696d.union(rectF);
            }
            this.f7694b += h.this.f7649d.f7688d.measureText(str);
        }
    }

    private abstract class j {
        private j() {
        }

        /* synthetic */ j(h hVar, a aVar) {
            this();
        }

        public boolean a(N4.g.Y y10) {
            return true;
        }

        public abstract void b(String str);
    }

    private class k extends j {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        float f7699b;

        private k() {
            super(h.this, null);
            this.f7699b = 0.0f;
        }

        /* synthetic */ k(h hVar, a aVar) {
            this();
        }

        @Override // N4.h.j
        public void b(String str) {
            this.f7699b += h.this.f7649d.f7688d.measureText(str);
        }
    }

    h(Canvas canvas, float f10) {
        this.f7646a = canvas;
        this.f7647b = f10;
    }

    private boolean A() {
        Boolean bool = this.f7649d.f7685a.f7435A;
        if (bool != null) {
            return bool.booleanValue();
        }
        return true;
    }

    private void A0(N4.g.N n10) {
        if (n10 instanceof N4.g.InterfaceC1199t) {
            return;
        }
        S0();
        u(n10);
        if (n10 instanceof N4.g.F) {
            x0((N4.g.F) n10);
        } else if (n10 instanceof N4.g.e0) {
            E0((N4.g.e0) n10);
        } else if (n10 instanceof N4.g.S) {
            B0((N4.g.S) n10);
        } else if (n10 instanceof N4.g.C1192m) {
            q0((N4.g.C1192m) n10);
        } else if (n10 instanceof N4.g.C1194o) {
            r0((N4.g.C1194o) n10);
        } else if (n10 instanceof N4.g.C1201v) {
            t0((N4.g.C1201v) n10);
        } else if (n10 instanceof N4.g.B) {
            w0((N4.g.B) n10);
        } else if (n10 instanceof N4.g.C1184d) {
            o0((N4.g.C1184d) n10);
        } else if (n10 instanceof N4.g.C1188i) {
            p0((N4.g.C1188i) n10);
        } else if (n10 instanceof N4.g.C1196q) {
            s0((N4.g.C1196q) n10);
        } else if (n10 instanceof N4.g.A) {
            v0((N4.g.A) n10);
        } else if (n10 instanceof N4.g.C1205z) {
            u0((N4.g.C1205z) n10);
        } else if (n10 instanceof N4.g.W) {
            D0((N4.g.W) n10);
        }
        R0();
    }

    private void B(N4.g.K k10, Path path) {
        N4.g.O o10 = this.f7649d.f7685a.f7449b;
        if (o10 instanceof N4.g.C1200u) {
            N4.g.N nS = this.f7648c.s(((N4.g.C1200u) o10).f7628a);
            if (nS instanceof N4.g.C1204y) {
                L(k10, path, (N4.g.C1204y) nS);
                return;
            }
        }
        this.f7646a.drawPath(path, this.f7649d.f7688d);
    }

    private void B0(N4.g.S s10) {
        y("Switch render", new Object[0]);
        W0(this.f7649d, s10);
        if (A()) {
            Matrix matrix = s10.f7603o;
            if (matrix != null) {
                this.f7646a.concat(matrix);
            }
            p(s10);
            boolean zM0 = m0();
            K0(s10);
            if (zM0) {
                j0(s10);
            }
            U0(s10);
        }
    }

    private void C(Path path) {
        C0133h c0133h = this.f7649d;
        if (c0133h.f7685a.f7446L != N4.g.E.i.NonScalingStroke) {
            this.f7646a.drawPath(path, c0133h.f7689e);
            return;
        }
        Matrix matrix = this.f7646a.getMatrix();
        Path path2 = new Path();
        path.transform(matrix, path2);
        this.f7646a.setMatrix(new Matrix());
        Shader shader = this.f7649d.f7689e.getShader();
        Matrix matrix2 = new Matrix();
        if (shader != null) {
            shader.getLocalMatrix(matrix2);
            Matrix matrix3 = new Matrix(matrix2);
            matrix3.postConcat(matrix);
            shader.setLocalMatrix(matrix3);
        }
        this.f7646a.drawPath(path2, this.f7649d.f7689e);
        this.f7646a.setMatrix(matrix);
        if (shader != null) {
            shader.setLocalMatrix(matrix2);
        }
    }

    private void C0(N4.g.T t10, N4.g.C1182b c1182b) {
        y("Symbol render", new Object[0]);
        if (c1182b.f7558c == 0.0f || c1182b.f7559d == 0.0f) {
            return;
        }
        N4.e eVar = t10.f7537o;
        if (eVar == null) {
            eVar = N4.e.f7392e;
        }
        W0(this.f7649d, t10);
        C0133h c0133h = this.f7649d;
        c0133h.f7690f = c1182b;
        if (!c0133h.f7685a.f7469v.booleanValue()) {
            N4.g.C1182b c1182b2 = this.f7649d.f7690f;
            O0(c1182b2.f7556a, c1182b2.f7557b, c1182b2.f7558c, c1182b2.f7559d);
        }
        N4.g.C1182b c1182b3 = t10.f7543p;
        if (c1182b3 != null) {
            this.f7646a.concat(o(this.f7649d.f7690f, c1182b3, eVar));
            this.f7649d.f7691g = t10.f7543p;
        } else {
            Canvas canvas = this.f7646a;
            N4.g.C1182b c1182b4 = this.f7649d.f7690f;
            canvas.translate(c1182b4.f7556a, c1182b4.f7557b);
        }
        boolean zM0 = m0();
        F0(t10, true);
        if (zM0) {
            j0(t10);
        }
        U0(t10);
    }

    private float D(float f10, float f11, float f12, float f13) {
        return (f10 * f12) + (f11 * f13);
    }

    private void D0(N4.g.W w10) {
        y("Text render", new Object[0]);
        W0(this.f7649d, w10);
        if (A()) {
            Matrix matrix = w10.f7547s;
            if (matrix != null) {
                this.f7646a.concat(matrix);
            }
            List list = w10.f7552o;
            float fG = 0.0f;
            float f10 = (list == null || list.size() == 0) ? 0.0f : ((N4.g.C1195p) w10.f7552o.get(0)).f(this);
            List list2 = w10.f7553p;
            float fG2 = (list2 == null || list2.size() == 0) ? 0.0f : ((N4.g.C1195p) w10.f7553p.get(0)).g(this);
            List list3 = w10.f7554q;
            float f11 = (list3 == null || list3.size() == 0) ? 0.0f : ((N4.g.C1195p) w10.f7554q.get(0)).f(this);
            List list4 = w10.f7555r;
            if (list4 != null && list4.size() != 0) {
                fG = ((N4.g.C1195p) w10.f7555r.get(0)).g(this);
            }
            N4.g.E.f fVarO = O();
            if (fVarO != N4.g.E.f.Start) {
                float fN = n(w10);
                if (fVarO == N4.g.E.f.Middle) {
                    fN /= 2.0f;
                }
                f10 -= fN;
            }
            if (w10.f7525h == null) {
                i iVar = new i(f10, fG2);
                E(w10, iVar);
                RectF rectF = iVar.f7696d;
                w10.f7525h = new N4.g.C1182b(rectF.left, rectF.top, rectF.width(), iVar.f7696d.height());
            }
            U0(w10);
            r(w10);
            p(w10);
            boolean zM0 = m0();
            E(w10, new f(f10 + f11, fG2 + fG));
            if (zM0) {
                j0(w10);
            }
        }
    }

    private void E(N4.g.Y y10, j jVar) {
        if (A()) {
            Iterator it = y10.f7514i.iterator();
            boolean z10 = true;
            while (it.hasNext()) {
                N4.g.N n10 = (N4.g.N) it.next();
                if (n10 instanceof N4.g.c0) {
                    jVar.b(T0(((N4.g.c0) n10).f7564c, z10, !it.hasNext()));
                } else {
                    l0(n10, jVar);
                }
                z10 = false;
            }
        }
    }

    private void E0(N4.g.e0 e0Var) {
        y("Use render", new Object[0]);
        N4.g.C1195p c1195p = e0Var.f7583s;
        if (c1195p == null || !c1195p.j()) {
            N4.g.C1195p c1195p2 = e0Var.f7584t;
            if (c1195p2 == null || !c1195p2.j()) {
                W0(this.f7649d, e0Var);
                if (A()) {
                    N4.g.N nS = e0Var.f7535a.s(e0Var.f7580p);
                    if (nS == null) {
                        F("Use reference '%s' not found", e0Var.f7580p);
                        return;
                    }
                    Matrix matrix = e0Var.f7603o;
                    if (matrix != null) {
                        this.f7646a.concat(matrix);
                    }
                    N4.g.C1195p c1195p3 = e0Var.f7581q;
                    float f10 = c1195p3 != null ? c1195p3.f(this) : 0.0f;
                    N4.g.C1195p c1195p4 = e0Var.f7582r;
                    this.f7646a.translate(f10, c1195p4 != null ? c1195p4.g(this) : 0.0f);
                    p(e0Var);
                    boolean zM0 = m0();
                    i0(e0Var);
                    if (nS instanceof N4.g.F) {
                        N4.g.C1182b c1182bF0 = f0(null, null, e0Var.f7583s, e0Var.f7584t);
                        S0();
                        y0((N4.g.F) nS, c1182bF0);
                        R0();
                    } else if (nS instanceof N4.g.T) {
                        N4.g.C1195p c1195p5 = e0Var.f7583s;
                        if (c1195p5 == null) {
                            c1195p5 = new N4.g.C1195p(100.0f, N4.g.d0.percent);
                        }
                        N4.g.C1195p c1195p6 = e0Var.f7584t;
                        if (c1195p6 == null) {
                            c1195p6 = new N4.g.C1195p(100.0f, N4.g.d0.percent);
                        }
                        N4.g.C1182b c1182bF1 = f0(null, null, c1195p5, c1195p6);
                        S0();
                        C0((N4.g.T) nS, c1182bF1);
                        R0();
                    } else {
                        A0(nS);
                    }
                    h0();
                    if (zM0) {
                        j0(e0Var);
                    }
                    U0(e0Var);
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void F(String str, Object... objArr) {
        Log.e("SVGAndroidRenderer", String.format(str, objArr));
    }

    private void F0(N4.g.J j10, boolean z10) {
        if (z10) {
            i0(j10);
        }
        Iterator it = j10.b().iterator();
        while (it.hasNext()) {
            A0((N4.g.N) it.next());
        }
        if (z10) {
            h0();
        }
    }

    private void G(N4.g.Y y10, StringBuilder sb2) {
        Iterator it = y10.f7514i.iterator();
        boolean z10 = true;
        while (it.hasNext()) {
            N4.g.N n10 = (N4.g.N) it.next();
            if (n10 instanceof N4.g.Y) {
                G((N4.g.Y) n10, sb2);
            } else if (n10 instanceof N4.g.c0) {
                sb2.append(T0(((N4.g.c0) n10).f7564c, z10, !it.hasNext()));
            }
            z10 = false;
        }
    }

    private void H(N4.g.AbstractC1189j abstractC1189j, String str) {
        N4.g.N nS = abstractC1189j.f7535a.s(str);
        if (nS == null) {
            Z0("Gradient reference '%s' not found", str);
            return;
        }
        if (!(nS instanceof N4.g.AbstractC1189j)) {
            F("Gradient href attributes must point to other gradient elements", new Object[0]);
            return;
        }
        if (nS == abstractC1189j) {
            F("Circular reference in gradient href attribute '%s'", str);
            return;
        }
        N4.g.AbstractC1189j abstractC1189j2 = (N4.g.AbstractC1189j) nS;
        if (abstractC1189j.f7594i == null) {
            abstractC1189j.f7594i = abstractC1189j2.f7594i;
        }
        if (abstractC1189j.f7595j == null) {
            abstractC1189j.f7595j = abstractC1189j2.f7595j;
        }
        if (abstractC1189j.f7596k == null) {
            abstractC1189j.f7596k = abstractC1189j2.f7596k;
        }
        if (abstractC1189j.f7593h.isEmpty()) {
            abstractC1189j.f7593h = abstractC1189j2.f7593h;
        }
        try {
            if (abstractC1189j instanceof N4.g.M) {
                I((N4.g.M) abstractC1189j, (N4.g.M) nS);
            } else {
                J((N4.g.Q) abstractC1189j, (N4.g.Q) nS);
            }
        } catch (ClassCastException unused) {
        }
        String str2 = abstractC1189j2.f7597l;
        if (str2 != null) {
            H(abstractC1189j, str2);
        }
    }

    /* JADX WARN: Code duplicated, block: B:12:0x0033  */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x0101, code lost:
    
        if (r7 != 8) goto L68;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void H0(N4.g.C1197r r12, N4.h.c r13) {
        /*
            Method dump skipped, instruction units count: 354
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: N4.h.H0(N4.g$r, N4.h$c):void");
    }

    private void I(N4.g.M m10, N4.g.M m11) {
        if (m10.f7531m == null) {
            m10.f7531m = m11.f7531m;
        }
        if (m10.f7532n == null) {
            m10.f7532n = m11.f7532n;
        }
        if (m10.f7533o == null) {
            m10.f7533o = m11.f7533o;
        }
        if (m10.f7534p == null) {
            m10.f7534p = m11.f7534p;
        }
    }

    private void I0(N4.g.AbstractC1191l abstractC1191l) {
        N4.g.C1197r c1197r;
        N4.g.C1197r c1197r2;
        N4.g.C1197r c1197r3;
        List listK;
        int size;
        N4.g.E e10 = this.f7649d.f7685a;
        String str = e10.f7471x;
        if (str == null && e10.f7472y == null && e10.f7473z == null) {
            return;
        }
        if (str == null) {
            c1197r = null;
        } else {
            N4.g.N nS = abstractC1191l.f7535a.s(str);
            if (nS != null) {
                c1197r = (N4.g.C1197r) nS;
            } else {
                F("Marker reference '%s' not found", this.f7649d.f7685a.f7471x);
                c1197r = null;
            }
        }
        String str2 = this.f7649d.f7685a.f7472y;
        if (str2 == null) {
            c1197r2 = null;
        } else {
            N4.g.N nS2 = abstractC1191l.f7535a.s(str2);
            if (nS2 != null) {
                c1197r2 = (N4.g.C1197r) nS2;
            } else {
                F("Marker reference '%s' not found", this.f7649d.f7685a.f7472y);
                c1197r2 = null;
            }
        }
        String str3 = this.f7649d.f7685a.f7473z;
        if (str3 == null) {
            c1197r3 = null;
        } else {
            N4.g.N nS3 = abstractC1191l.f7535a.s(str3);
            if (nS3 != null) {
                c1197r3 = (N4.g.C1197r) nS3;
            } else {
                F("Marker reference '%s' not found", this.f7649d.f7685a.f7473z);
                c1197r3 = null;
            }
        }
        if (abstractC1191l instanceof N4.g.C1201v) {
            listK = new b(((N4.g.C1201v) abstractC1191l).f7630o).f();
        } else {
            listK = abstractC1191l instanceof N4.g.C1196q ? k((N4.g.C1196q) abstractC1191l) : l((N4.g.C1205z) abstractC1191l);
        }
        if (listK == null || (size = listK.size()) == 0) {
            return;
        }
        N4.g.E e11 = this.f7649d.f7685a;
        e11.f7473z = null;
        e11.f7472y = null;
        e11.f7471x = null;
        if (c1197r != null) {
            H0(c1197r, (c) listK.get(0));
        }
        if (c1197r2 != null && listK.size() > 2) {
            c cVarN0 = (c) listK.get(0);
            c cVar = (c) listK.get(1);
            int i10 = 1;
            while (i10 < size - 1) {
                i10++;
                c cVar2 = (c) listK.get(i10);
                cVarN0 = cVar.f7670e ? n0(cVarN0, cVar, cVar2) : cVar;
                H0(c1197r2, cVarN0);
                cVar = cVar2;
            }
        }
        if (c1197r3 != null) {
            H0(c1197r3, (c) listK.get(size - 1));
        }
    }

    private void J(N4.g.Q q10, N4.g.Q q11) {
        if (q10.f7538m == null) {
            q10.f7538m = q11.f7538m;
        }
        if (q10.f7539n == null) {
            q10.f7539n = q11.f7539n;
        }
        if (q10.f7540o == null) {
            q10.f7540o = q11.f7540o;
        }
        if (q10.f7541p == null) {
            q10.f7541p = q11.f7541p;
        }
        if (q10.f7542q == null) {
            q10.f7542q = q11.f7542q;
        }
    }

    private void J0(N4.g.C1198s c1198s, N4.g.K k10, N4.g.C1182b c1182b) {
        float f10;
        float fG;
        y("Mask render", new Object[0]);
        Boolean bool = c1198s.f7622o;
        if (bool == null || !bool.booleanValue()) {
            N4.g.C1195p c1195p = c1198s.f7626s;
            float fE = c1195p != null ? c1195p.e(this, 1.0f) : 1.2f;
            N4.g.C1195p c1195p2 = c1198s.f7627t;
            float fE2 = c1195p2 != null ? c1195p2.e(this, 1.0f) : 1.2f;
            f10 = fE * c1182b.f7558c;
            fG = fE2 * c1182b.f7559d;
        } else {
            N4.g.C1195p c1195p3 = c1198s.f7626s;
            f10 = c1195p3 != null ? c1195p3.f(this) : c1182b.f7558c;
            N4.g.C1195p c1195p4 = c1198s.f7627t;
            fG = c1195p4 != null ? c1195p4.g(this) : c1182b.f7559d;
        }
        if (f10 == 0.0f || fG == 0.0f) {
            return;
        }
        S0();
        C0133h c0133hM = M(c1198s);
        this.f7649d = c0133hM;
        c0133hM.f7685a.f7460m = Float.valueOf(1.0f);
        boolean zM0 = m0();
        this.f7646a.save();
        Boolean bool2 = c1198s.f7623p;
        if (bool2 != null && !bool2.booleanValue()) {
            this.f7646a.translate(c1182b.f7556a, c1182b.f7557b);
            this.f7646a.scale(c1182b.f7558c, c1182b.f7559d);
        }
        F0(c1198s, false);
        this.f7646a.restore();
        if (zM0) {
            k0(k10, c1182b);
        }
        R0();
    }

    private void K(N4.g.C1204y c1204y, String str) {
        N4.g.N nS = c1204y.f7535a.s(str);
        if (nS == null) {
            Z0("Pattern reference '%s' not found", str);
            return;
        }
        if (!(nS instanceof N4.g.C1204y)) {
            F("Pattern href attributes must point to other pattern elements", new Object[0]);
            return;
        }
        if (nS == c1204y) {
            F("Circular reference in pattern href attribute '%s'", str);
            return;
        }
        N4.g.C1204y c1204y2 = (N4.g.C1204y) nS;
        if (c1204y.f7636q == null) {
            c1204y.f7636q = c1204y2.f7636q;
        }
        if (c1204y.f7637r == null) {
            c1204y.f7637r = c1204y2.f7637r;
        }
        if (c1204y.f7638s == null) {
            c1204y.f7638s = c1204y2.f7638s;
        }
        if (c1204y.f7639t == null) {
            c1204y.f7639t = c1204y2.f7639t;
        }
        if (c1204y.f7640u == null) {
            c1204y.f7640u = c1204y2.f7640u;
        }
        if (c1204y.f7641v == null) {
            c1204y.f7641v = c1204y2.f7641v;
        }
        if (c1204y.f7642w == null) {
            c1204y.f7642w = c1204y2.f7642w;
        }
        if (c1204y.f7514i.isEmpty()) {
            c1204y.f7514i = c1204y2.f7514i;
        }
        if (c1204y.f7543p == null) {
            c1204y.f7543p = c1204y2.f7543p;
        }
        if (c1204y.f7537o == null) {
            c1204y.f7537o = c1204y2.f7537o;
        }
        String str2 = c1204y2.f7643x;
        if (str2 != null) {
            K(c1204y, str2);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void K0(N4.g.S s10) {
        Set setA;
        String language = Locale.getDefault().getLanguage();
        N4.g.k();
        for (N4.g.N n10 : s10.b()) {
            if (n10 instanceof N4.g.G) {
                N4.g.G g10 = (N4.g.G) n10;
                if (g10.c() == null && ((setA = g10.a()) == null || (!setA.isEmpty() && setA.contains(language)))) {
                    Set setG = g10.g();
                    if (setG != null) {
                        if (f7645i == null) {
                            V();
                        }
                        if (setG.isEmpty() || !f7645i.containsAll(setG)) {
                        }
                    }
                    Set setM = g10.m();
                    if (setM != null) {
                        setM.isEmpty();
                    } else {
                        Set setN = g10.n();
                        if (setN == null) {
                            A0(n10);
                            return;
                        }
                        setN.isEmpty();
                    }
                }
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:75:0x015a  */
    private void L(N4.g.K k10, Path path, N4.g.C1204y c1204y) {
        float f10;
        float fG;
        float fG2;
        float f11;
        boolean z10;
        boolean z11;
        Boolean bool = c1204y.f7636q;
        boolean z12 = bool != null && bool.booleanValue();
        String str = c1204y.f7643x;
        if (str != null) {
            K(c1204y, str);
        }
        if (z12) {
            N4.g.C1195p c1195p = c1204y.f7639t;
            f10 = c1195p != null ? c1195p.f(this) : 0.0f;
            N4.g.C1195p c1195p2 = c1204y.f7640u;
            fG2 = c1195p2 != null ? c1195p2.g(this) : 0.0f;
            N4.g.C1195p c1195p3 = c1204y.f7641v;
            f11 = c1195p3 != null ? c1195p3.f(this) : 0.0f;
            N4.g.C1195p c1195p4 = c1204y.f7642w;
            fG = c1195p4 != null ? c1195p4.g(this) : 0.0f;
        } else {
            N4.g.C1195p c1195p5 = c1204y.f7639t;
            float fE = c1195p5 != null ? c1195p5.e(this, 1.0f) : 0.0f;
            N4.g.C1195p c1195p6 = c1204y.f7640u;
            float fE2 = c1195p6 != null ? c1195p6.e(this, 1.0f) : 0.0f;
            N4.g.C1195p c1195p7 = c1204y.f7641v;
            float fE3 = c1195p7 != null ? c1195p7.e(this, 1.0f) : 0.0f;
            N4.g.C1195p c1195p8 = c1204y.f7642w;
            float fE4 = c1195p8 != null ? c1195p8.e(this, 1.0f) : 0.0f;
            N4.g.C1182b c1182b = k10.f7525h;
            float f12 = c1182b.f7556a;
            float f13 = c1182b.f7558c;
            f10 = (fE * f13) + f12;
            float f14 = c1182b.f7557b;
            float f15 = c1182b.f7559d;
            float f16 = fE3 * f13;
            fG = fE4 * f15;
            fG2 = (fE2 * f15) + f14;
            f11 = f16;
        }
        if (f11 == 0.0f || fG == 0.0f) {
            return;
        }
        N4.e eVar = c1204y.f7537o;
        if (eVar == null) {
            eVar = N4.e.f7392e;
        }
        S0();
        this.f7646a.clipPath(path);
        C0133h c0133h = new C0133h();
        V0(c0133h, N4.g.E.b());
        c0133h.f7685a.f7469v = Boolean.FALSE;
        this.f7649d = N(c1204y, c0133h);
        N4.g.C1182b c1182b2 = k10.f7525h;
        Matrix matrix = c1204y.f7638s;
        if (matrix != null) {
            this.f7646a.concat(matrix);
            Matrix matrix2 = new Matrix();
            if (c1204y.f7638s.invert(matrix2)) {
                N4.g.C1182b c1182b3 = k10.f7525h;
                float f17 = c1182b3.f7556a;
                float f18 = c1182b3.f7557b;
                float fB = c1182b3.b();
                N4.g.C1182b c1182b4 = k10.f7525h;
                z10 = false;
                float f19 = c1182b4.f7557b;
                float fB2 = c1182b4.b();
                z11 = true;
                float fC = k10.f7525h.c();
                N4.g.C1182b c1182b5 = k10.f7525h;
                float[] fArr = {f17, f18, fB, f19, fB2, fC, c1182b5.f7556a, c1182b5.c()};
                matrix2.mapPoints(fArr);
                float f20 = fArr[0];
                float f21 = fArr[1];
                RectF rectF = new RectF(f20, f21, f20, f21);
                for (int i10 = 2; i10 <= 6; i10 += 2) {
                    float f22 = fArr[i10];
                    if (f22 < rectF.left) {
                        rectF.left = f22;
                    }
                    if (f22 > rectF.right) {
                        rectF.right = f22;
                    }
                    float f23 = fArr[i10 + 1];
                    if (f23 < rectF.top) {
                        rectF.top = f23;
                    }
                    if (f23 > rectF.bottom) {
                        rectF.bottom = f23;
                    }
                }
                float f24 = rectF.left;
                float f25 = rectF.top;
                c1182b2 = new N4.g.C1182b(f24, f25, rectF.right - f24, rectF.bottom - f25);
            } else {
                z10 = false;
                z11 = true;
            }
        } else {
            z10 = false;
            z11 = true;
        }
        float fFloor = f10 + (((float) Math.floor((c1182b2.f7556a - f10) / f11)) * f11);
        float fB3 = c1182b2.b();
        float fC2 = c1182b2.c();
        N4.g.C1182b c1182b6 = new N4.g.C1182b(0.0f, 0.0f, f11, fG);
        boolean zM0 = m0();
        for (float fFloor2 = fG2 + (((float) Math.floor((c1182b2.f7557b - fG2) / fG)) * fG); fFloor2 < fC2; fFloor2 += fG) {
            float f26 = fFloor;
            while (f26 < fB3) {
                c1182b6.f7556a = f26;
                c1182b6.f7557b = fFloor2;
                S0();
                if (!this.f7649d.f7685a.f7469v.booleanValue()) {
                    O0(c1182b6.f7556a, c1182b6.f7557b, c1182b6.f7558c, c1182b6.f7559d);
                }
                N4.g.C1182b c1182b7 = c1204y.f7543p;
                if (c1182b7 != null) {
                    this.f7646a.concat(o(c1182b6, c1182b7, eVar));
                } else {
                    Boolean bool2 = c1204y.f7637r;
                    boolean z13 = (bool2 == null || bool2.booleanValue()) ? z11 : z10;
                    this.f7646a.translate(f26, fFloor2);
                    if (!z13) {
                        Canvas canvas = this.f7646a;
                        N4.g.C1182b c1182b8 = k10.f7525h;
                        canvas.scale(c1182b8.f7558c, c1182b8.f7559d);
                    }
                }
                Iterator it = c1204y.f7514i.iterator();
                while (it.hasNext()) {
                    A0((N4.g.N) it.next());
                }
                R0();
                f26 += f11;
                fFloor = fFloor;
            }
        }
        if (zM0) {
            j0(c1204y);
        }
        R0();
    }

    private void L0(N4.g.Z z10) {
        y("TextPath render", new Object[0]);
        W0(this.f7649d, z10);
        if (A() && Y0()) {
            N4.g.N nS = z10.f7535a.s(z10.f7548o);
            if (nS == null) {
                F("TextPath reference '%s' not found", z10.f7548o);
                return;
            }
            N4.g.C1201v c1201v = (N4.g.C1201v) nS;
            Path pathF = new d(c1201v.f7630o).f();
            Matrix matrix = c1201v.f7602n;
            if (matrix != null) {
                pathF.transform(matrix);
            }
            PathMeasure pathMeasure = new PathMeasure(pathF, false);
            N4.g.C1195p c1195p = z10.f7549p;
            float fE = c1195p != null ? c1195p.e(this, pathMeasure.getLength()) : 0.0f;
            N4.g.E.f fVarO = O();
            if (fVarO != N4.g.E.f.Start) {
                float fN = n(z10);
                if (fVarO == N4.g.E.f.Middle) {
                    fN /= 2.0f;
                }
                fE -= fN;
            }
            r((N4.g.K) z10.e());
            boolean zM0 = m0();
            E(z10, new e(pathF, fE, 0.0f));
            if (zM0) {
                j0(z10);
            }
        }
    }

    private C0133h M(N4.g.N n10) {
        C0133h c0133h = new C0133h();
        V0(c0133h, N4.g.E.b());
        return N(n10, c0133h);
    }

    private boolean M0() {
        return this.f7649d.f7685a.f7460m.floatValue() < 1.0f || this.f7649d.f7685a.f7441G != null;
    }

    private C0133h N(N4.g.N n10, C0133h c0133h) {
        ArrayList arrayList = new ArrayList();
        while (true) {
            if (n10 instanceof N4.g.L) {
                arrayList.add(0, (N4.g.L) n10);
            }
            Object obj = n10.f7536b;
            if (obj == null) {
                break;
            }
            n10 = (N4.g.N) obj;
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            W0(c0133h, (N4.g.L) it.next());
        }
        C0133h c0133h2 = this.f7649d;
        c0133h.f7691g = c0133h2.f7691g;
        c0133h.f7690f = c0133h2.f7690f;
        return c0133h;
    }

    private void N0() {
        this.f7649d = new C0133h();
        this.f7650e = new Stack();
        V0(this.f7649d, N4.g.E.b());
        C0133h c0133h = this.f7649d;
        c0133h.f7690f = null;
        c0133h.f7692h = false;
        this.f7650e.push(new C0133h(c0133h));
        this.f7652g = new Stack();
        this.f7651f = new Stack();
    }

    private N4.g.E.f O() {
        N4.g.E.f fVar;
        N4.g.E e10 = this.f7649d.f7685a;
        if (e10.f7467t == N4.g.E.h.LTR || (fVar = e10.f7468u) == N4.g.E.f.Middle) {
            return e10.f7468u;
        }
        N4.g.E.f fVar2 = N4.g.E.f.Start;
        return fVar == fVar2 ? N4.g.E.f.End : fVar2;
    }

    private void O0(float f10, float f11, float f12, float f13) {
        float f14 = f12 + f10;
        float fG = f13 + f11;
        N4.g.C1183c c1183c = this.f7649d.f7685a.f7470w;
        if (c1183c != null) {
            f10 += c1183c.f7563d.f(this);
            f11 += this.f7649d.f7685a.f7470w.f7560a.g(this);
            f14 -= this.f7649d.f7685a.f7470w.f7561b.f(this);
            fG -= this.f7649d.f7685a.f7470w.f7562c.g(this);
        }
        this.f7646a.clipRect(f10, f11, f14, fG);
    }

    private Path.FillType P() {
        N4.g.E.a aVar = this.f7649d.f7685a.f7440F;
        return (aVar == null || aVar != N4.g.E.a.EvenOdd) ? Path.FillType.WINDING : Path.FillType.EVEN_ODD;
    }

    private void P0(C0133h c0133h, boolean z10, N4.g.O o10) {
        int i10;
        N4.g.E e10 = c0133h.f7685a;
        float fFloatValue = (z10 ? e10.f7451d : e10.f7453f).floatValue();
        if (o10 instanceof N4.g.C1186f) {
            i10 = ((N4.g.C1186f) o10).f7587a;
        } else if (!(o10 instanceof N4.g.C0132g)) {
            return;
        } else {
            i10 = c0133h.f7685a.f7461n.f7587a;
        }
        int iX = x(i10, fFloatValue);
        if (z10) {
            c0133h.f7688d.setColor(iX);
        } else {
            c0133h.f7689e.setColor(iX);
        }
    }

    private void Q0(boolean z10, N4.g.C c10) {
        if (z10) {
            if (W(c10.f7528e, 2147483648L)) {
                C0133h c0133h = this.f7649d;
                N4.g.E e10 = c0133h.f7685a;
                N4.g.O o10 = c10.f7528e.f7442H;
                e10.f7449b = o10;
                c0133h.f7686b = o10 != null;
            }
            if (W(c10.f7528e, 4294967296L)) {
                this.f7649d.f7685a.f7451d = c10.f7528e.f7443I;
            }
            if (W(c10.f7528e, 6442450944L)) {
                C0133h c0133h2 = this.f7649d;
                P0(c0133h2, z10, c0133h2.f7685a.f7449b);
                return;
            }
            return;
        }
        if (W(c10.f7528e, 2147483648L)) {
            C0133h c0133h3 = this.f7649d;
            N4.g.E e11 = c0133h3.f7685a;
            N4.g.O o11 = c10.f7528e.f7442H;
            e11.f7452e = o11;
            c0133h3.f7687c = o11 != null;
        }
        if (W(c10.f7528e, 4294967296L)) {
            this.f7649d.f7685a.f7453f = c10.f7528e.f7443I;
        }
        if (W(c10.f7528e, 6442450944L)) {
            C0133h c0133h4 = this.f7649d;
            P0(c0133h4, z10, c0133h4.f7685a.f7452e);
        }
    }

    private void R0() {
        this.f7646a.restore();
        this.f7649d = (C0133h) this.f7650e.pop();
    }

    private void S0() {
        this.f7646a.save();
        this.f7650e.push(this.f7649d);
        this.f7649d = new C0133h(this.f7649d);
    }

    private String T0(String str, boolean z10, boolean z11) {
        if (this.f7649d.f7692h) {
            return str.replaceAll("[\\n\\t]", " ");
        }
        String strReplaceAll = str.replaceAll("\\n", "").replaceAll("\\t", " ");
        if (z10) {
            strReplaceAll = strReplaceAll.replaceAll("^\\s+", "");
        }
        if (z11) {
            strReplaceAll = strReplaceAll.replaceAll("\\s+$", "");
        }
        return strReplaceAll.replaceAll("\\s{2,}", " ");
    }

    private Path.FillType U() {
        N4.g.E.a aVar = this.f7649d.f7685a.f7450c;
        return (aVar == null || aVar != N4.g.E.a.EvenOdd) ? Path.FillType.WINDING : Path.FillType.EVEN_ODD;
    }

    private void U0(N4.g.K k10) {
        if (k10.f7536b == null || k10.f7525h == null) {
            return;
        }
        Matrix matrix = new Matrix();
        if (((Matrix) this.f7652g.peek()).invert(matrix)) {
            N4.g.C1182b c1182b = k10.f7525h;
            float f10 = c1182b.f7556a;
            float f11 = c1182b.f7557b;
            float fB = c1182b.b();
            N4.g.C1182b c1182b2 = k10.f7525h;
            float f12 = c1182b2.f7557b;
            float fB2 = c1182b2.b();
            float fC = k10.f7525h.c();
            N4.g.C1182b c1182b3 = k10.f7525h;
            float[] fArr = {f10, f11, fB, f12, fB2, fC, c1182b3.f7556a, c1182b3.c()};
            matrix.preConcat(this.f7646a.getMatrix());
            matrix.mapPoints(fArr);
            float f13 = fArr[0];
            float f14 = fArr[1];
            RectF rectF = new RectF(f13, f14, f13, f14);
            for (int i10 = 2; i10 <= 6; i10 += 2) {
                float f15 = fArr[i10];
                if (f15 < rectF.left) {
                    rectF.left = f15;
                }
                if (f15 > rectF.right) {
                    rectF.right = f15;
                }
                float f16 = fArr[i10 + 1];
                if (f16 < rectF.top) {
                    rectF.top = f16;
                }
                if (f16 > rectF.bottom) {
                    rectF.bottom = f16;
                }
            }
            N4.g.K k11 = (N4.g.K) this.f7651f.peek();
            N4.g.C1182b c1182b4 = k11.f7525h;
            if (c1182b4 == null) {
                k11.f7525h = N4.g.C1182b.a(rectF.left, rectF.top, rectF.right, rectF.bottom);
            } else {
                c1182b4.e(N4.g.C1182b.a(rectF.left, rectF.top, rectF.right, rectF.bottom));
            }
        }
    }

    private static synchronized void V() {
        HashSet hashSet = new HashSet();
        f7645i = hashSet;
        hashSet.add("Structure");
        f7645i.add("BasicStructure");
        f7645i.add("ConditionalProcessing");
        f7645i.add("Image");
        f7645i.add("Style");
        f7645i.add("ViewportAttribute");
        f7645i.add("Shape");
        f7645i.add("BasicText");
        f7645i.add("PaintAttribute");
        f7645i.add("BasicPaintAttribute");
        f7645i.add("OpacityAttribute");
        f7645i.add("BasicGraphicsAttribute");
        f7645i.add("Marker");
        f7645i.add("Gradient");
        f7645i.add("Pattern");
        f7645i.add("Clip");
        f7645i.add("BasicClip");
        f7645i.add("Mask");
        f7645i.add("View");
    }

    private void V0(C0133h c0133h, N4.g.E e10) {
        if (W(e10, 4096L)) {
            c0133h.f7685a.f7461n = e10.f7461n;
        }
        if (W(e10, 2048L)) {
            c0133h.f7685a.f7460m = e10.f7460m;
        }
        if (W(e10, 1L)) {
            c0133h.f7685a.f7449b = e10.f7449b;
            N4.g.O o10 = e10.f7449b;
            c0133h.f7686b = (o10 == null || o10 == N4.g.C1186f.f7586c) ? false : true;
        }
        if (W(e10, 4L)) {
            c0133h.f7685a.f7451d = e10.f7451d;
        }
        if (W(e10, 6149L)) {
            P0(c0133h, true, c0133h.f7685a.f7449b);
        }
        if (W(e10, 2L)) {
            c0133h.f7685a.f7450c = e10.f7450c;
        }
        if (W(e10, 8L)) {
            c0133h.f7685a.f7452e = e10.f7452e;
            N4.g.O o11 = e10.f7452e;
            c0133h.f7687c = (o11 == null || o11 == N4.g.C1186f.f7586c) ? false : true;
        }
        if (W(e10, 16L)) {
            c0133h.f7685a.f7453f = e10.f7453f;
        }
        if (W(e10, 6168L)) {
            P0(c0133h, false, c0133h.f7685a.f7452e);
        }
        if (W(e10, 34359738368L)) {
            c0133h.f7685a.f7446L = e10.f7446L;
        }
        if (W(e10, 32L)) {
            N4.g.E e11 = c0133h.f7685a;
            N4.g.C1195p c1195p = e10.f7454g;
            e11.f7454g = c1195p;
            c0133h.f7689e.setStrokeWidth(c1195p.d(this));
        }
        if (W(e10, 64L)) {
            c0133h.f7685a.f7455h = e10.f7455h;
            int i10 = a.f7655b[e10.f7455h.ordinal()];
            if (i10 == 1) {
                c0133h.f7689e.setStrokeCap(Paint.Cap.BUTT);
            } else if (i10 == 2) {
                c0133h.f7689e.setStrokeCap(Paint.Cap.ROUND);
            } else if (i10 == 3) {
                c0133h.f7689e.setStrokeCap(Paint.Cap.SQUARE);
            }
        }
        if (W(e10, 128L)) {
            c0133h.f7685a.f7456i = e10.f7456i;
            int i11 = a.f7656c[e10.f7456i.ordinal()];
            if (i11 == 1) {
                c0133h.f7689e.setStrokeJoin(Paint.Join.MITER);
            } else if (i11 == 2) {
                c0133h.f7689e.setStrokeJoin(Paint.Join.ROUND);
            } else if (i11 == 3) {
                c0133h.f7689e.setStrokeJoin(Paint.Join.BEVEL);
            }
        }
        if (W(e10, 256L)) {
            c0133h.f7685a.f7457j = e10.f7457j;
            c0133h.f7689e.setStrokeMiter(e10.f7457j.floatValue());
        }
        if (W(e10, 512L)) {
            c0133h.f7685a.f7458k = e10.f7458k;
        }
        if (W(e10, 1024L)) {
            c0133h.f7685a.f7459l = e10.f7459l;
        }
        Typeface typefaceT = null;
        if (W(e10, 1536L)) {
            N4.g.C1195p[] c1195pArr = c0133h.f7685a.f7458k;
            if (c1195pArr == null) {
                c0133h.f7689e.setPathEffect(null);
            } else {
                int length = c1195pArr.length;
                int i12 = length % 2 == 0 ? length : length * 2;
                float[] fArr = new float[i12];
                float f10 = 0.0f;
                for (int i13 = 0; i13 < i12; i13++) {
                    float fD = c0133h.f7685a.f7458k[i13 % length].d(this);
                    fArr[i13] = fD;
                    f10 += fD;
                }
                if (f10 == 0.0f) {
                    c0133h.f7689e.setPathEffect(null);
                } else {
                    float fD2 = c0133h.f7685a.f7459l.d(this);
                    if (fD2 < 0.0f) {
                        fD2 = (fD2 % f10) + f10;
                    }
                    c0133h.f7689e.setPathEffect(new DashPathEffect(fArr, fD2));
                }
            }
        }
        if (W(e10, 16384L)) {
            float fQ = Q();
            c0133h.f7685a.f7463p = e10.f7463p;
            c0133h.f7688d.setTextSize(e10.f7463p.e(this, fQ));
            c0133h.f7689e.setTextSize(e10.f7463p.e(this, fQ));
        }
        if (W(e10, 8192L)) {
            c0133h.f7685a.f7462o = e10.f7462o;
        }
        if (W(e10, 32768L)) {
            if (e10.f7464q.intValue() == -1 && c0133h.f7685a.f7464q.intValue() > 100) {
                N4.g.E e12 = c0133h.f7685a;
                e12.f7464q = Integer.valueOf(e12.f7464q.intValue() - 100);
            } else if (e10.f7464q.intValue() != 1 || c0133h.f7685a.f7464q.intValue() >= 900) {
                c0133h.f7685a.f7464q = e10.f7464q;
            } else {
                N4.g.E e13 = c0133h.f7685a;
                e13.f7464q = Integer.valueOf(e13.f7464q.intValue() + 100);
            }
        }
        if (W(e10, 65536L)) {
            c0133h.f7685a.f7465r = e10.f7465r;
        }
        if (W(e10, 106496L)) {
            if (c0133h.f7685a.f7462o != null && this.f7648c != null) {
                N4.g.k();
                for (String str : c0133h.f7685a.f7462o) {
                    N4.g.E e14 = c0133h.f7685a;
                    typefaceT = t(str, e14.f7464q, e14.f7465r);
                    if (typefaceT != null) {
                        break;
                    }
                }
            }
            if (typefaceT == null) {
                N4.g.E e15 = c0133h.f7685a;
                typefaceT = t("serif", e15.f7464q, e15.f7465r);
            }
            c0133h.f7688d.setTypeface(typefaceT);
            c0133h.f7689e.setTypeface(typefaceT);
        }
        if (W(e10, 131072L)) {
            c0133h.f7685a.f7466s = e10.f7466s;
            Paint paint = c0133h.f7688d;
            N4.g.E.EnumC0131g enumC0131g = e10.f7466s;
            N4.g.E.EnumC0131g enumC0131g2 = N4.g.E.EnumC0131g.LineThrough;
            paint.setStrikeThruText(enumC0131g == enumC0131g2);
            Paint paint2 = c0133h.f7688d;
            N4.g.E.EnumC0131g enumC0131g3 = e10.f7466s;
            N4.g.E.EnumC0131g enumC0131g4 = N4.g.E.EnumC0131g.Underline;
            paint2.setUnderlineText(enumC0131g3 == enumC0131g4);
            c0133h.f7689e.setStrikeThruText(e10.f7466s == enumC0131g2);
            c0133h.f7689e.setUnderlineText(e10.f7466s == enumC0131g4);
        }
        if (W(e10, 68719476736L)) {
            c0133h.f7685a.f7467t = e10.f7467t;
        }
        if (W(e10, 262144L)) {
            c0133h.f7685a.f7468u = e10.f7468u;
        }
        if (W(e10, 524288L)) {
            c0133h.f7685a.f7469v = e10.f7469v;
        }
        if (W(e10, 2097152L)) {
            c0133h.f7685a.f7471x = e10.f7471x;
        }
        if (W(e10, 4194304L)) {
            c0133h.f7685a.f7472y = e10.f7472y;
        }
        if (W(e10, 8388608L)) {
            c0133h.f7685a.f7473z = e10.f7473z;
        }
        if (W(e10, 16777216L)) {
            c0133h.f7685a.f7435A = e10.f7435A;
        }
        if (W(e10, 33554432L)) {
            c0133h.f7685a.f7436B = e10.f7436B;
        }
        if (W(e10, 1048576L)) {
            c0133h.f7685a.f7470w = e10.f7470w;
        }
        if (W(e10, 268435456L)) {
            c0133h.f7685a.f7439E = e10.f7439E;
        }
        if (W(e10, 536870912L)) {
            c0133h.f7685a.f7440F = e10.f7440F;
        }
        if (W(e10, 1073741824L)) {
            c0133h.f7685a.f7441G = e10.f7441G;
        }
        if (W(e10, 67108864L)) {
            c0133h.f7685a.f7437C = e10.f7437C;
        }
        if (W(e10, 134217728L)) {
            c0133h.f7685a.f7438D = e10.f7438D;
        }
        if (W(e10, 8589934592L)) {
            c0133h.f7685a.f7444J = e10.f7444J;
        }
        if (W(e10, 17179869184L)) {
            c0133h.f7685a.f7445K = e10.f7445K;
        }
        if (W(e10, 137438953472L)) {
            c0133h.f7685a.f7447M = e10.f7447M;
        }
    }

    private boolean W(N4.g.E e10, long j10) {
        return (e10.f7448a & j10) != 0;
    }

    private void W0(C0133h c0133h, N4.g.L l10) {
        c0133h.f7685a.c(l10.f7536b == null);
        N4.g.E e10 = l10.f7528e;
        if (e10 != null) {
            V0(c0133h, e10);
        }
        if (this.f7648c.n()) {
            for (N4.b.p pVar : this.f7648c.d()) {
                if (N4.b.l(this.f7653h, pVar.f7371a, l10)) {
                    V0(c0133h, pVar.f7372b);
                }
            }
        }
        N4.g.E e11 = l10.f7529f;
        if (e11 != null) {
            V0(c0133h, e11);
        }
    }

    private void X(boolean z10, N4.g.C1182b c1182b, N4.g.M m10) {
        float fE;
        float f10;
        float fE2;
        float f11;
        String str = m10.f7597l;
        if (str != null) {
            H(m10, str);
        }
        Boolean bool = m10.f7594i;
        int i10 = 0;
        boolean z11 = bool != null && bool.booleanValue();
        C0133h c0133h = this.f7649d;
        Paint paint = z10 ? c0133h.f7688d : c0133h.f7689e;
        if (z11) {
            N4.g.C1182b c1182bS = S();
            N4.g.C1195p c1195p = m10.f7531m;
            float f12 = c1195p != null ? c1195p.f(this) : 0.0f;
            N4.g.C1195p c1195p2 = m10.f7532n;
            fE = c1195p2 != null ? c1195p2.g(this) : 0.0f;
            N4.g.C1195p c1195p3 = m10.f7533o;
            float f13 = c1195p3 != null ? c1195p3.f(this) : c1182bS.f7558c;
            N4.g.C1195p c1195p4 = m10.f7534p;
            f11 = f13;
            f10 = f12;
            fE2 = c1195p4 != null ? c1195p4.g(this) : 0.0f;
        } else {
            N4.g.C1195p c1195p5 = m10.f7531m;
            float fE3 = c1195p5 != null ? c1195p5.e(this, 1.0f) : 0.0f;
            N4.g.C1195p c1195p6 = m10.f7532n;
            fE = c1195p6 != null ? c1195p6.e(this, 1.0f) : 0.0f;
            N4.g.C1195p c1195p7 = m10.f7533o;
            float fE4 = c1195p7 != null ? c1195p7.e(this, 1.0f) : 1.0f;
            N4.g.C1195p c1195p8 = m10.f7534p;
            f10 = fE3;
            fE2 = c1195p8 != null ? c1195p8.e(this, 1.0f) : 0.0f;
            f11 = fE4;
        }
        float f14 = fE;
        S0();
        this.f7649d = M(m10);
        Matrix matrix = new Matrix();
        if (!z11) {
            matrix.preTranslate(c1182b.f7556a, c1182b.f7557b);
            matrix.preScale(c1182b.f7558c, c1182b.f7559d);
        }
        Matrix matrix2 = m10.f7595j;
        if (matrix2 != null) {
            matrix.preConcat(matrix2);
        }
        int size = m10.f7593h.size();
        if (size == 0) {
            R0();
            if (z10) {
                this.f7649d.f7686b = false;
                return;
            } else {
                this.f7649d.f7687c = false;
                return;
            }
        }
        int[] iArr = new int[size];
        float[] fArr = new float[size];
        Iterator it = m10.f7593h.iterator();
        float f15 = -1.0f;
        while (it.hasNext()) {
            N4.g.D d10 = (N4.g.D) ((N4.g.N) it.next());
            Float f16 = d10.f7434h;
            float fFloatValue = f16 != null ? f16.floatValue() : 0.0f;
            if (i10 == 0 || fFloatValue >= f15) {
                fArr[i10] = fFloatValue;
                f15 = fFloatValue;
            } else {
                fArr[i10] = f15;
            }
            S0();
            W0(this.f7649d, d10);
            N4.g.E e10 = this.f7649d.f7685a;
            N4.g.C1186f c1186f = (N4.g.C1186f) e10.f7437C;
            if (c1186f == null) {
                c1186f = N4.g.C1186f.f7585b;
            }
            iArr[i10] = x(c1186f.f7587a, e10.f7438D.floatValue());
            i10++;
            R0();
        }
        if ((f10 == f11 && f14 == fE2) || size == 1) {
            R0();
            paint.setColor(iArr[size - 1]);
            return;
        }
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        N4.g.EnumC1190k enumC1190k = m10.f7596k;
        if (enumC1190k != null) {
            if (enumC1190k == N4.g.EnumC1190k.reflect) {
                tileMode = Shader.TileMode.MIRROR;
            } else if (enumC1190k == N4.g.EnumC1190k.repeat) {
                tileMode = Shader.TileMode.REPEAT;
            }
        }
        Shader.TileMode tileMode2 = tileMode;
        R0();
        LinearGradient linearGradient = new LinearGradient(f10, f14, f11, fE2, iArr, fArr, tileMode2);
        linearGradient.setLocalMatrix(matrix);
        paint.setShader(linearGradient);
        paint.setAlpha(w(this.f7649d.f7685a.f7451d.floatValue()));
    }

    private void X0() {
        int iX;
        N4.g.E e10 = this.f7649d.f7685a;
        N4.g.O o10 = e10.f7444J;
        if (o10 instanceof N4.g.C1186f) {
            iX = ((N4.g.C1186f) o10).f7587a;
        } else if (!(o10 instanceof N4.g.C0132g)) {
            return;
        } else {
            iX = e10.f7461n.f7587a;
        }
        Float f10 = e10.f7445K;
        if (f10 != null) {
            iX = x(iX, f10.floatValue());
        }
        this.f7646a.drawColor(iX);
    }

    private Path Y(N4.g.C1184d c1184d) {
        N4.g.C1195p c1195p = c1184d.f7566o;
        float f10 = c1195p != null ? c1195p.f(this) : 0.0f;
        N4.g.C1195p c1195p2 = c1184d.f7567p;
        float fG = c1195p2 != null ? c1195p2.g(this) : 0.0f;
        float fD = c1184d.f7568q.d(this);
        float f11 = f10 - fD;
        float f12 = fG - fD;
        float f13 = f10 + fD;
        float f14 = fG + fD;
        if (c1184d.f7525h == null) {
            float f15 = 2.0f * fD;
            c1184d.f7525h = new N4.g.C1182b(f11, f12, f15, f15);
        }
        float f16 = fD * 0.5522848f;
        Path path = new Path();
        path.moveTo(f10, f12);
        float f17 = f10 + f16;
        float f18 = fG - f16;
        path.cubicTo(f17, f12, f13, f18, f13, fG);
        float f19 = fG + f16;
        path.cubicTo(f13, f19, f17, f14, f10, f14);
        float f20 = f10 - f16;
        path.cubicTo(f20, f14, f11, f19, f11, fG);
        path.cubicTo(f11, f18, f20, f12, f10, f12);
        path.close();
        return path;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean Y0() {
        Boolean bool = this.f7649d.f7685a.f7436B;
        if (bool != null) {
            return bool.booleanValue();
        }
        return true;
    }

    private Path Z(N4.g.C1188i c1188i) {
        N4.g.C1195p c1195p = c1188i.f7589o;
        float f10 = c1195p != null ? c1195p.f(this) : 0.0f;
        N4.g.C1195p c1195p2 = c1188i.f7590p;
        float fG = c1195p2 != null ? c1195p2.g(this) : 0.0f;
        float f11 = c1188i.f7591q.f(this);
        float fG2 = c1188i.f7592r.g(this);
        float f12 = f10 - f11;
        float f13 = fG - fG2;
        float f14 = f10 + f11;
        float f15 = fG + fG2;
        if (c1188i.f7525h == null) {
            c1188i.f7525h = new N4.g.C1182b(f12, f13, f11 * 2.0f, 2.0f * fG2);
        }
        float f16 = f11 * 0.5522848f;
        float f17 = fG2 * 0.5522848f;
        Path path = new Path();
        path.moveTo(f10, f13);
        float f18 = f10 + f16;
        float f19 = fG - f17;
        path.cubicTo(f18, f13, f14, f19, f14, fG);
        float f20 = fG + f17;
        path.cubicTo(f14, f20, f18, f15, f10, f15);
        float f21 = f10 - f16;
        path.cubicTo(f21, f15, f12, f20, f12, fG);
        path.cubicTo(f12, f19, f21, f13, f10, f13);
        path.close();
        return path;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void Z0(String str, Object... objArr) {
        Log.w("SVGAndroidRenderer", String.format(str, objArr));
    }

    private Path a0(N4.g.C1196q c1196q) {
        N4.g.C1195p c1195p = c1196q.f7612o;
        float f10 = c1195p == null ? 0.0f : c1195p.f(this);
        N4.g.C1195p c1195p2 = c1196q.f7613p;
        float fG = c1195p2 == null ? 0.0f : c1195p2.g(this);
        N4.g.C1195p c1195p3 = c1196q.f7614q;
        float f11 = c1195p3 == null ? 0.0f : c1195p3.f(this);
        N4.g.C1195p c1195p4 = c1196q.f7615r;
        float fG2 = c1195p4 != null ? c1195p4.g(this) : 0.0f;
        if (c1196q.f7525h == null) {
            c1196q.f7525h = new N4.g.C1182b(Math.min(f10, f11), Math.min(fG, fG2), Math.abs(f11 - f10), Math.abs(fG2 - fG));
        }
        Path path = new Path();
        path.moveTo(f10, fG);
        path.lineTo(f11, fG2);
        return path;
    }

    private Path b0(N4.g.C1205z c1205z) {
        Path path = new Path();
        float[] fArr = c1205z.f7644o;
        path.moveTo(fArr[0], fArr[1]);
        int i10 = 2;
        while (true) {
            float[] fArr2 = c1205z.f7644o;
            if (i10 >= fArr2.length) {
                break;
            }
            path.lineTo(fArr2[i10], fArr2[i10 + 1]);
            i10 += 2;
        }
        if (c1205z instanceof N4.g.A) {
            path.close();
        }
        if (c1205z.f7525h == null) {
            c1205z.f7525h = m(path);
        }
        return path;
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0048  */
    /* JADX WARN: Code duplicated, block: B:17:0x004e  */
    /* JADX WARN: Code duplicated, block: B:20:0x0053  */
    /* JADX WARN: Code duplicated, block: B:21:0x0059  */
    /* JADX WARN: Code duplicated, block: B:24:0x006a  */
    /* JADX WARN: Code duplicated, block: B:29:0x0081  */
    private Path c0(N4.g.B b10) {
        float f10;
        float fG;
        float fMin;
        N4.g.C1195p c1195p;
        float f11;
        N4.g.C1195p c1195p2;
        float fG2;
        float f12;
        float fG3;
        float f13;
        float f14;
        Path path;
        N4.g.C1195p c1195p3 = b10.f7432s;
        if (c1195p3 == null && b10.f7433t == null) {
            f10 = 0.0f;
        } else {
            if (c1195p3 != null) {
                if (b10.f7433t == null) {
                    f10 = c1195p3.f(this);
                } else {
                    f10 = c1195p3.f(this);
                    fG = b10.f7433t.g(this);
                }
                fMin = Math.min(f10, b10.f7430q.f(this) / 2.0f);
                float fMin2 = Math.min(fG, b10.f7431r.g(this) / 2.0f);
                c1195p = b10.f7428o;
                if (c1195p != null) {
                    f11 = c1195p.f(this);
                } else {
                    f11 = 0.0f;
                }
                c1195p2 = b10.f7429p;
                if (c1195p2 != null) {
                    fG2 = c1195p2.g(this);
                } else {
                    fG2 = 0.0f;
                }
                f12 = b10.f7430q.f(this);
                fG3 = b10.f7431r.g(this);
                if (b10.f7525h == null) {
                    b10.f7525h = new N4.g.C1182b(f11, fG2, f12, fG3);
                }
                f13 = f12 + f11;
                f14 = fG2 + fG3;
                path = new Path();
                if (fMin != 0.0f || fMin2 == 0.0f) {
                    path.moveTo(f11, fG2);
                    path.lineTo(f13, fG2);
                    path.lineTo(f13, f14);
                    path.lineTo(f11, f14);
                    path.lineTo(f11, fG2);
                } else {
                    float f15 = fMin * 0.5522848f;
                    float f16 = 0.5522848f * fMin2;
                    float f17 = fG2 + fMin2;
                    path.moveTo(f11, f17);
                    float f18 = f17 - f16;
                    float f19 = f11 + fMin;
                    float f20 = f19 - f15;
                    path.cubicTo(f11, f18, f20, fG2, f19, fG2);
                    float f21 = f13 - fMin;
                    path.lineTo(f21, fG2);
                    float f22 = f21 + f15;
                    path.cubicTo(f22, fG2, f13, f18, f13, f17);
                    float f23 = f14 - fMin2;
                    path.lineTo(f13, f23);
                    float f24 = f23 + f16;
                    path.cubicTo(f13, f24, f22, f14, f21, f14);
                    path.lineTo(f19, f14);
                    float f25 = f11;
                    path.cubicTo(f20, f14, f25, f24, f11, f23);
                    path.lineTo(f25, f17);
                }
                path.close();
                return path;
            }
            f10 = b10.f7433t.g(this);
        }
        fG = f10;
        fMin = Math.min(f10, b10.f7430q.f(this) / 2.0f);
        float fMin3 = Math.min(fG, b10.f7431r.g(this) / 2.0f);
        c1195p = b10.f7428o;
        if (c1195p != null) {
            f11 = c1195p.f(this);
        } else {
            f11 = 0.0f;
        }
        c1195p2 = b10.f7429p;
        if (c1195p2 != null) {
            fG2 = c1195p2.g(this);
        } else {
            fG2 = 0.0f;
        }
        f12 = b10.f7430q.f(this);
        fG3 = b10.f7431r.g(this);
        if (b10.f7525h == null) {
            b10.f7525h = new N4.g.C1182b(f11, fG2, f12, fG3);
        }
        f13 = f12 + f11;
        f14 = fG2 + fG3;
        path = new Path();
        if (fMin != 0.0f) {
            path.moveTo(f11, fG2);
            path.lineTo(f13, fG2);
            path.lineTo(f13, f14);
            path.lineTo(f11, f14);
            path.lineTo(f11, fG2);
        } else {
            path.moveTo(f11, fG2);
            path.lineTo(f13, fG2);
            path.lineTo(f13, f14);
            path.lineTo(f11, f14);
            path.lineTo(f11, fG2);
        }
        path.close();
        return path;
    }

    private Path d0(N4.g.W w10) {
        List list = w10.f7552o;
        float fG = 0.0f;
        float f10 = (list == null || list.size() == 0) ? 0.0f : ((N4.g.C1195p) w10.f7552o.get(0)).f(this);
        List list2 = w10.f7553p;
        float fG2 = (list2 == null || list2.size() == 0) ? 0.0f : ((N4.g.C1195p) w10.f7553p.get(0)).g(this);
        List list3 = w10.f7554q;
        float f11 = (list3 == null || list3.size() == 0) ? 0.0f : ((N4.g.C1195p) w10.f7554q.get(0)).f(this);
        List list4 = w10.f7555r;
        if (list4 != null && list4.size() != 0) {
            fG = ((N4.g.C1195p) w10.f7555r.get(0)).g(this);
        }
        if (this.f7649d.f7685a.f7468u != N4.g.E.f.Start) {
            float fN = n(w10);
            if (this.f7649d.f7685a.f7468u == N4.g.E.f.Middle) {
                fN /= 2.0f;
            }
            f10 -= fN;
        }
        if (w10.f7525h == null) {
            i iVar = new i(f10, fG2);
            E(w10, iVar);
            RectF rectF = iVar.f7696d;
            w10.f7525h = new N4.g.C1182b(rectF.left, rectF.top, rectF.width(), iVar.f7696d.height());
        }
        Path path = new Path();
        E(w10, new g(f10 + f11, fG2 + fG, path));
        return path;
    }

    private void e0(boolean z10, N4.g.C1182b c1182b, N4.g.Q q10) {
        float f10;
        float fE;
        float f11;
        String str = q10.f7597l;
        if (str != null) {
            H(q10, str);
        }
        Boolean bool = q10.f7594i;
        int i10 = 0;
        boolean z11 = bool != null && bool.booleanValue();
        C0133h c0133h = this.f7649d;
        Paint paint = z10 ? c0133h.f7688d : c0133h.f7689e;
        if (z11) {
            N4.g.C1195p c1195p = new N4.g.C1195p(50.0f, N4.g.d0.percent);
            N4.g.C1195p c1195p2 = q10.f7538m;
            float f12 = c1195p2 != null ? c1195p2.f(this) : c1195p.f(this);
            N4.g.C1195p c1195p3 = q10.f7539n;
            float fG = c1195p3 != null ? c1195p3.g(this) : c1195p.g(this);
            N4.g.C1195p c1195p4 = q10.f7540o;
            fE = c1195p4 != null ? c1195p4.d(this) : c1195p.d(this);
            f10 = f12;
            f11 = fG;
        } else {
            N4.g.C1195p c1195p5 = q10.f7538m;
            float fE2 = c1195p5 != null ? c1195p5.e(this, 1.0f) : 0.5f;
            N4.g.C1195p c1195p6 = q10.f7539n;
            float fE3 = c1195p6 != null ? c1195p6.e(this, 1.0f) : 0.5f;
            N4.g.C1195p c1195p7 = q10.f7540o;
            f10 = fE2;
            fE = c1195p7 != null ? c1195p7.e(this, 1.0f) : 0.5f;
            f11 = fE3;
        }
        S0();
        this.f7649d = M(q10);
        Matrix matrix = new Matrix();
        if (!z11) {
            matrix.preTranslate(c1182b.f7556a, c1182b.f7557b);
            matrix.preScale(c1182b.f7558c, c1182b.f7559d);
        }
        Matrix matrix2 = q10.f7595j;
        if (matrix2 != null) {
            matrix.preConcat(matrix2);
        }
        int size = q10.f7593h.size();
        if (size == 0) {
            R0();
            if (z10) {
                this.f7649d.f7686b = false;
                return;
            } else {
                this.f7649d.f7687c = false;
                return;
            }
        }
        int[] iArr = new int[size];
        float[] fArr = new float[size];
        Iterator it = q10.f7593h.iterator();
        float f13 = -1.0f;
        while (it.hasNext()) {
            N4.g.D d10 = (N4.g.D) ((N4.g.N) it.next());
            Float f14 = d10.f7434h;
            float fFloatValue = f14 != null ? f14.floatValue() : 0.0f;
            if (i10 == 0 || fFloatValue >= f13) {
                fArr[i10] = fFloatValue;
                f13 = fFloatValue;
            } else {
                fArr[i10] = f13;
            }
            S0();
            W0(this.f7649d, d10);
            N4.g.E e10 = this.f7649d.f7685a;
            N4.g.C1186f c1186f = (N4.g.C1186f) e10.f7437C;
            if (c1186f == null) {
                c1186f = N4.g.C1186f.f7585b;
            }
            iArr[i10] = x(c1186f.f7587a, e10.f7438D.floatValue());
            i10++;
            R0();
        }
        if (fE == 0.0f || size == 1) {
            R0();
            paint.setColor(iArr[size - 1]);
            return;
        }
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        N4.g.EnumC1190k enumC1190k = q10.f7596k;
        if (enumC1190k != null) {
            if (enumC1190k == N4.g.EnumC1190k.reflect) {
                tileMode = Shader.TileMode.MIRROR;
            } else if (enumC1190k == N4.g.EnumC1190k.repeat) {
                tileMode = Shader.TileMode.REPEAT;
            }
        }
        Shader.TileMode tileMode2 = tileMode;
        R0();
        RadialGradient radialGradient = new RadialGradient(f10, f11, fE, iArr, fArr, tileMode2);
        radialGradient.setLocalMatrix(matrix);
        paint.setShader(radialGradient);
        paint.setAlpha(w(this.f7649d.f7685a.f7451d.floatValue()));
    }

    private N4.g.C1182b f0(N4.g.C1195p c1195p, N4.g.C1195p c1195p2, N4.g.C1195p c1195p3, N4.g.C1195p c1195p4) {
        float f10 = c1195p != null ? c1195p.f(this) : 0.0f;
        float fG = c1195p2 != null ? c1195p2.g(this) : 0.0f;
        N4.g.C1182b c1182bS = S();
        return new N4.g.C1182b(f10, fG, c1195p3 != null ? c1195p3.f(this) : c1182bS.f7558c, c1195p4 != null ? c1195p4.g(this) : c1182bS.f7559d);
    }

    private Path g0(N4.g.K k10, boolean z10) {
        Path pathD0;
        Path pathJ;
        this.f7650e.push(this.f7649d);
        C0133h c0133h = new C0133h(this.f7649d);
        this.f7649d = c0133h;
        W0(c0133h, k10);
        if (!A() || !Y0()) {
            this.f7649d = (C0133h) this.f7650e.pop();
            return null;
        }
        if (k10 instanceof N4.g.e0) {
            if (!z10) {
                F("<use> elements inside a <clipPath> cannot reference another <use>", new Object[0]);
            }
            N4.g.e0 e0Var = (N4.g.e0) k10;
            N4.g.N nS = k10.f7535a.s(e0Var.f7580p);
            if (nS == null) {
                F("Use reference '%s' not found", e0Var.f7580p);
                this.f7649d = (C0133h) this.f7650e.pop();
                return null;
            }
            if (!(nS instanceof N4.g.K)) {
                this.f7649d = (C0133h) this.f7650e.pop();
                return null;
            }
            pathD0 = g0((N4.g.K) nS, false);
            if (pathD0 == null) {
                return null;
            }
            if (e0Var.f7525h == null) {
                e0Var.f7525h = m(pathD0);
            }
            Matrix matrix = e0Var.f7603o;
            if (matrix != null) {
                pathD0.transform(matrix);
            }
        } else if (k10 instanceof N4.g.AbstractC1191l) {
            N4.g.AbstractC1191l abstractC1191l = (N4.g.AbstractC1191l) k10;
            if (k10 instanceof N4.g.C1201v) {
                pathD0 = new d(((N4.g.C1201v) k10).f7630o).f();
                if (k10.f7525h == null) {
                    k10.f7525h = m(pathD0);
                }
            } else if (k10 instanceof N4.g.B) {
                pathD0 = c0((N4.g.B) k10);
            } else if (k10 instanceof N4.g.C1184d) {
                pathD0 = Y((N4.g.C1184d) k10);
            } else if (k10 instanceof N4.g.C1188i) {
                pathD0 = Z((N4.g.C1188i) k10);
            } else {
                pathD0 = k10 instanceof N4.g.C1205z ? b0((N4.g.C1205z) k10) : null;
            }
            if (pathD0 == null) {
                return null;
            }
            if (abstractC1191l.f7525h == null) {
                abstractC1191l.f7525h = m(pathD0);
            }
            Matrix matrix2 = abstractC1191l.f7602n;
            if (matrix2 != null) {
                pathD0.transform(matrix2);
            }
            pathD0.setFillType(P());
        } else {
            if (!(k10 instanceof N4.g.W)) {
                F("Invalid %s element found in clipPath definition", k10.o());
                return null;
            }
            N4.g.W w10 = (N4.g.W) k10;
            pathD0 = d0(w10);
            if (pathD0 == null) {
                return null;
            }
            Matrix matrix3 = w10.f7547s;
            if (matrix3 != null) {
                pathD0.transform(matrix3);
            }
            pathD0.setFillType(P());
        }
        if (this.f7649d.f7685a.f7439E != null && (pathJ = j(k10, k10.f7525h)) != null) {
            pathD0.op(pathJ, Path.Op.INTERSECT);
        }
        this.f7649d = (C0133h) this.f7650e.pop();
        return pathD0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void h(float f10, float f11, float f12, float f13, float f14, boolean z10, boolean z11, float f15, float f16, N4.g.InterfaceC1203x interfaceC1203x) {
        if (f10 == f15 && f11 == f16) {
            return;
        }
        if (f12 == 0.0f || f13 == 0.0f) {
            interfaceC1203x.e(f15, f16);
            return;
        }
        float fAbs = Math.abs(f12);
        float fAbs2 = Math.abs(f13);
        double radians = Math.toRadians(((double) f14) % 360.0d);
        double dCos = Math.cos(radians);
        double dSin = Math.sin(radians);
        double d10 = ((double) (f10 - f15)) / 2.0d;
        double d11 = ((double) (f11 - f16)) / 2.0d;
        double d12 = (dCos * d10) + (dSin * d11);
        double d13 = ((-dSin) * d10) + (dCos * d11);
        double d14 = fAbs * fAbs;
        double d15 = fAbs2 * fAbs2;
        double d16 = d12 * d12;
        double d17 = d13 * d13;
        double d18 = (d16 / d14) + (d17 / d15);
        if (d18 > 0.99999d) {
            double dSqrt = Math.sqrt(d18) * 1.00001d;
            fAbs = (float) (((double) fAbs) * dSqrt);
            fAbs2 = (float) (dSqrt * ((double) fAbs2));
            d14 = fAbs * fAbs;
            d15 = fAbs2 * fAbs2;
        }
        double d19 = z10 == z11 ? -1.0d : 1.0d;
        double d20 = d14 * d15;
        double d21 = d14 * d17;
        double d22 = d15 * d16;
        double d23 = ((d20 - d21) - d22) / (d21 + d22);
        if (d23 < 0.0d) {
            d23 = 0.0d;
        }
        double dSqrt2 = d19 * Math.sqrt(d23);
        double d24 = fAbs;
        double d25 = fAbs2;
        double d26 = ((d24 * d13) / d25) * dSqrt2;
        double d27 = (-((d25 * d12) / d24)) * dSqrt2;
        double d28 = (((double) (f10 + f15)) / 2.0d) + ((dCos * d26) - (dSin * d27));
        double d29 = (((double) (f11 + f16)) / 2.0d) + (dSin * d26) + (dCos * d27);
        double d30 = (d12 - d26) / d24;
        double d31 = (d13 - d27) / d25;
        double d32 = ((-d12) - d26) / d24;
        double d33 = ((-d13) - d27) / d25;
        double d34 = (d30 * d30) + (d31 * d31);
        double dAcos = (d31 < 0.0d ? -1.0d : 1.0d) * Math.acos(d30 / Math.sqrt(d34));
        double dV = ((d30 * d33) - (d31 * d32) < 0.0d ? -1.0d : 1.0d) * v(((d30 * d32) + (d31 * d33)) / Math.sqrt(d34 * ((d32 * d32) + (d33 * d33))));
        if (!z11 && dV > 0.0d) {
            dV -= 6.283185307179586d;
        } else if (z11 && dV < 0.0d) {
            dV += 6.283185307179586d;
        }
        float[] fArrI = i(dAcos % 6.283185307179586d, dV % 6.283185307179586d);
        Matrix matrix = new Matrix();
        matrix.postScale(fAbs, fAbs2);
        matrix.postRotate(f14);
        matrix.postTranslate((float) d28, (float) d29);
        matrix.mapPoints(fArrI);
        fArrI[fArrI.length - 2] = f15;
        fArrI[fArrI.length - 1] = f16;
        for (int i10 = 0; i10 < fArrI.length; i10 += 6) {
            interfaceC1203x.c(fArrI[i10], fArrI[i10 + 1], fArrI[i10 + 2], fArrI[i10 + 3], fArrI[i10 + 4], fArrI[i10 + 5]);
        }
    }

    private void h0() {
        this.f7651f.pop();
        this.f7652g.pop();
    }

    private static float[] i(double d10, double d11) {
        int iCeil = (int) Math.ceil((Math.abs(d11) * 2.0d) / 3.141592653589793d);
        double d12 = d11 / ((double) iCeil);
        double d13 = d12 / 2.0d;
        double dSin = (Math.sin(d13) * 1.3333333333333333d) / (Math.cos(d13) + 1.0d);
        float[] fArr = new float[iCeil * 6];
        int i10 = 0;
        int i11 = 0;
        while (i10 < iCeil) {
            double d14 = d10 + (((double) i10) * d12);
            double dCos = Math.cos(d14);
            double dSin2 = Math.sin(d14);
            float[] fArr2 = fArr;
            fArr2[i11] = (float) (dCos - (dSin * dSin2));
            fArr2[i11 + 1] = (float) (dSin2 + (dCos * dSin));
            double d15 = d14 + d12;
            double dCos2 = Math.cos(d15);
            double dSin3 = Math.sin(d15);
            fArr2[i11 + 2] = (float) ((dSin * dSin3) + dCos2);
            fArr2[i11 + 3] = (float) (dSin3 - (dSin * dCos2));
            int i12 = i11 + 5;
            fArr2[i11 + 4] = (float) dCos2;
            i11 += 6;
            fArr2[i12] = (float) dSin3;
            i10++;
            fArr = fArr2;
            iCeil = iCeil;
        }
        return fArr;
    }

    private void i0(N4.g.J j10) {
        this.f7651f.push(j10);
        this.f7652g.push(this.f7646a.getMatrix());
    }

    private Path j(N4.g.K k10, N4.g.C1182b c1182b) {
        Path pathG0;
        N4.g.N nS = k10.f7535a.s(this.f7649d.f7685a.f7439E);
        if (nS == null) {
            F("ClipPath reference '%s' not found", this.f7649d.f7685a.f7439E);
            return null;
        }
        N4.g.C1185e c1185e = (N4.g.C1185e) nS;
        this.f7650e.push(this.f7649d);
        this.f7649d = M(c1185e);
        Boolean bool = c1185e.f7579p;
        boolean z10 = bool == null || bool.booleanValue();
        Matrix matrix = new Matrix();
        if (!z10) {
            matrix.preTranslate(c1182b.f7556a, c1182b.f7557b);
            matrix.preScale(c1182b.f7558c, c1182b.f7559d);
        }
        Matrix matrix2 = c1185e.f7603o;
        if (matrix2 != null) {
            matrix.preConcat(matrix2);
        }
        Path path = new Path();
        for (N4.g.N n10 : c1185e.f7514i) {
            if ((n10 instanceof N4.g.K) && (pathG0 = g0((N4.g.K) n10, true)) != null) {
                path.op(pathG0, Path.Op.UNION);
            }
        }
        if (this.f7649d.f7685a.f7439E != null) {
            if (c1185e.f7525h == null) {
                c1185e.f7525h = m(path);
            }
            Path pathJ = j(c1185e, c1185e.f7525h);
            if (pathJ != null) {
                path.op(pathJ, Path.Op.INTERSECT);
            }
        }
        path.transform(matrix);
        this.f7649d = (C0133h) this.f7650e.pop();
        return path;
    }

    private void j0(N4.g.K k10) {
        k0(k10, k10.f7525h);
    }

    private List k(N4.g.C1196q c1196q) {
        N4.g.C1195p c1195p = c1196q.f7612o;
        float f10 = c1195p != null ? c1195p.f(this) : 0.0f;
        N4.g.C1195p c1195p2 = c1196q.f7613p;
        float fG = c1195p2 != null ? c1195p2.g(this) : 0.0f;
        N4.g.C1195p c1195p3 = c1196q.f7614q;
        float f11 = c1195p3 != null ? c1195p3.f(this) : 0.0f;
        N4.g.C1195p c1195p4 = c1196q.f7615r;
        float fG2 = c1195p4 != null ? c1195p4.g(this) : 0.0f;
        ArrayList arrayList = new ArrayList(2);
        float f12 = f11 - f10;
        float f13 = fG2 - fG;
        arrayList.add(new c(f10, fG, f12, f13));
        arrayList.add(new c(f11, fG2, f12, f13));
        return arrayList;
    }

    private void k0(N4.g.K k10, N4.g.C1182b c1182b) {
        if (this.f7649d.f7685a.f7441G != null) {
            Paint paint = new Paint();
            PorterDuff.Mode mode = PorterDuff.Mode.DST_IN;
            paint.setXfermode(new PorterDuffXfermode(mode));
            this.f7646a.saveLayer(null, paint, 31);
            Paint paint2 = new Paint();
            paint2.setColorFilter(new ColorMatrixColorFilter(new ColorMatrix(new float[]{0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.2127f, 0.7151f, 0.0722f, 0.0f, 0.0f})));
            this.f7646a.saveLayer(null, paint2, 31);
            N4.g.C1198s c1198s = (N4.g.C1198s) this.f7648c.s(this.f7649d.f7685a.f7441G);
            J0(c1198s, k10, c1182b);
            this.f7646a.restore();
            Paint paint3 = new Paint();
            paint3.setXfermode(new PorterDuffXfermode(mode));
            this.f7646a.saveLayer(null, paint3, 31);
            J0(c1198s, k10, c1182b);
            this.f7646a.restore();
            this.f7646a.restore();
        }
        R0();
    }

    private List l(N4.g.C1205z c1205z) {
        int length = c1205z.f7644o.length;
        int i10 = 2;
        if (length < 2) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        float[] fArr = c1205z.f7644o;
        c cVar = new c(fArr[0], fArr[1], 0.0f, 0.0f);
        float f10 = 0.0f;
        float f11 = 0.0f;
        while (i10 < length) {
            float[] fArr2 = c1205z.f7644o;
            float f12 = fArr2[i10];
            float f13 = fArr2[i10 + 1];
            cVar.a(f12, f13);
            arrayList.add(cVar);
            i10 += 2;
            cVar = new c(f12, f13, f12 - cVar.f7666a, f13 - cVar.f7667b);
            f10 = f12;
            f11 = f13;
        }
        if (!(c1205z instanceof N4.g.A)) {
            arrayList.add(cVar);
            return arrayList;
        }
        float[] fArr3 = c1205z.f7644o;
        float f14 = fArr3[0];
        if (f10 != f14) {
            float f15 = fArr3[1];
            if (f11 != f15) {
                cVar.a(f14, f15);
                arrayList.add(cVar);
                c cVar2 = new c(f14, f15, f14 - cVar.f7666a, f15 - cVar.f7667b);
                cVar2.b((c) arrayList.get(0));
                arrayList.add(cVar2);
                arrayList.set(0, cVar2);
            }
        }
        return arrayList;
    }

    private void l0(N4.g.N n10, j jVar) {
        float f10;
        float fG;
        float f11;
        N4.g.E.f fVarO;
        if (jVar.a((N4.g.Y) n10)) {
            if (n10 instanceof N4.g.Z) {
                S0();
                L0((N4.g.Z) n10);
                R0();
                return;
            }
            if (!(n10 instanceof N4.g.V)) {
                if (n10 instanceof N4.g.U) {
                    S0();
                    N4.g.U u10 = (N4.g.U) n10;
                    W0(this.f7649d, u10);
                    if (A()) {
                        r((N4.g.K) u10.e());
                        N4.g.N nS = n10.f7535a.s(u10.f7544o);
                        if (nS == null || !(nS instanceof N4.g.Y)) {
                            F("Tref reference '%s' not found", u10.f7544o);
                        } else {
                            StringBuilder sb2 = new StringBuilder();
                            G((N4.g.Y) nS, sb2);
                            if (sb2.length() > 0) {
                                jVar.b(sb2.toString());
                            }
                        }
                    }
                    R0();
                    return;
                }
                return;
            }
            y("TSpan render", new Object[0]);
            S0();
            N4.g.V v10 = (N4.g.V) n10;
            W0(this.f7649d, v10);
            if (A()) {
                List list = v10.f7552o;
                boolean z10 = list != null && list.size() > 0;
                boolean z11 = jVar instanceof f;
                float fG2 = 0.0f;
                if (z11) {
                    float f12 = !z10 ? ((f) jVar).f7678b : ((N4.g.C1195p) v10.f7552o.get(0)).f(this);
                    List list2 = v10.f7553p;
                    fG = (list2 == null || list2.size() == 0) ? ((f) jVar).f7679c : ((N4.g.C1195p) v10.f7553p.get(0)).g(this);
                    List list3 = v10.f7554q;
                    f11 = (list3 == null || list3.size() == 0) ? 0.0f : ((N4.g.C1195p) v10.f7554q.get(0)).f(this);
                    List list4 = v10.f7555r;
                    if (list4 != null && list4.size() != 0) {
                        fG2 = ((N4.g.C1195p) v10.f7555r.get(0)).g(this);
                    }
                    f10 = fG2;
                    fG2 = f12;
                } else {
                    f10 = 0.0f;
                    fG = 0.0f;
                    f11 = 0.0f;
                }
                if (z10 && (fVarO = O()) != N4.g.E.f.Start) {
                    float fN = n(v10);
                    if (fVarO == N4.g.E.f.Middle) {
                        fN /= 2.0f;
                    }
                    fG2 -= fN;
                }
                r((N4.g.K) v10.e());
                if (z11) {
                    f fVar = (f) jVar;
                    fVar.f7678b = fG2 + f11;
                    fVar.f7679c = fG + f10;
                }
                boolean zM0 = m0();
                E(v10, jVar);
                if (zM0) {
                    j0(v10);
                }
            }
            R0();
        }
    }

    private N4.g.C1182b m(Path path) {
        RectF rectF = new RectF();
        path.computeBounds(rectF, true);
        return new N4.g.C1182b(rectF.left, rectF.top, rectF.width(), rectF.height());
    }

    private boolean m0() {
        N4.g.N nS;
        if (!M0()) {
            return false;
        }
        this.f7646a.saveLayerAlpha(null, w(this.f7649d.f7685a.f7460m.floatValue()), 31);
        this.f7650e.push(this.f7649d);
        C0133h c0133h = new C0133h(this.f7649d);
        this.f7649d = c0133h;
        String str = c0133h.f7685a.f7441G;
        if (str != null && ((nS = this.f7648c.s(str)) == null || !(nS instanceof N4.g.C1198s))) {
            F("Mask reference '%s' not found", this.f7649d.f7685a.f7441G);
            this.f7649d.f7685a.f7441G = null;
        }
        return true;
    }

    private float n(N4.g.Y y10) {
        k kVar = new k(this, null);
        E(y10, kVar);
        return kVar.f7699b;
    }

    private c n0(c cVar, c cVar2, c cVar3) {
        float fD = D(cVar2.f7668c, cVar2.f7669d, cVar2.f7666a - cVar.f7666a, cVar2.f7667b - cVar.f7667b);
        if (fD == 0.0f) {
            fD = D(cVar2.f7668c, cVar2.f7669d, cVar3.f7666a - cVar2.f7666a, cVar3.f7667b - cVar2.f7667b);
        }
        if (fD > 0.0f || (fD == 0.0f && (cVar2.f7668c > 0.0f || cVar2.f7669d >= 0.0f))) {
            return cVar2;
        }
        cVar2.f7668c = -cVar2.f7668c;
        cVar2.f7669d = -cVar2.f7669d;
        return cVar2;
    }

    /* JADX WARN: Code duplicated, block: B:23:0x0075  */
    /* JADX WARN: Code duplicated, block: B:25:0x0078  */
    /* JADX WARN: Code duplicated, block: B:27:0x007b  */
    /* JADX WARN: Code duplicated, block: B:29:0x007e  */
    /* JADX WARN: Code duplicated, block: B:31:0x0081  */
    /* JADX WARN: Code duplicated, block: B:36:0x008b  */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0083, code lost:
    
        if (r12 != 8) goto L37;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private android.graphics.Matrix o(N4.g.C1182b r10, N4.g.C1182b r11, N4.e r12) {
        /*
            r9 = this;
            android.graphics.Matrix r0 = new android.graphics.Matrix
            r0.<init>()
            if (r12 == 0) goto L9d
            N4.e$a r1 = r12.a()
            if (r1 != 0) goto Lf
            goto L9d
        Lf:
            float r1 = r10.f7558c
            float r2 = r11.f7558c
            float r1 = r1 / r2
            float r2 = r10.f7559d
            float r3 = r11.f7559d
            float r2 = r2 / r3
            float r3 = r11.f7556a
            float r3 = -r3
            float r4 = r11.f7557b
            float r4 = -r4
            N4.e r5 = N4.e.f7391d
            boolean r5 = r12.equals(r5)
            if (r5 == 0) goto L35
            float r11 = r10.f7556a
            float r10 = r10.f7557b
            r0.preTranslate(r11, r10)
            r0.preScale(r1, r2)
            r0.preTranslate(r3, r4)
            return r0
        L35:
            N4.e$b r5 = r12.b()
            N4.e$b r6 = N4.e.b.slice
            if (r5 != r6) goto L42
            float r1 = java.lang.Math.max(r1, r2)
            goto L46
        L42:
            float r1 = java.lang.Math.min(r1, r2)
        L46:
            float r2 = r10.f7558c
            float r2 = r2 / r1
            float r5 = r10.f7559d
            float r5 = r5 / r1
            int[] r6 = N4.h.a.f7654a
            N4.e$a r7 = r12.a()
            int r7 = r7.ordinal()
            r7 = r6[r7]
            r8 = 1073741824(0x40000000, float:2.0)
            switch(r7) {
                case 1: goto L63;
                case 2: goto L63;
                case 3: goto L63;
                case 4: goto L5e;
                case 5: goto L5e;
                case 6: goto L5e;
                default: goto L5d;
            }
        L5d:
            goto L68
        L5e:
            float r7 = r11.f7558c
            float r7 = r7 - r2
        L61:
            float r3 = r3 - r7
            goto L68
        L63:
            float r7 = r11.f7558c
            float r7 = r7 - r2
            float r7 = r7 / r8
            goto L61
        L68:
            N4.e$a r12 = r12.a()
            int r12 = r12.ordinal()
            r12 = r6[r12]
            r2 = 2
            if (r12 == r2) goto L8b
            r2 = 3
            if (r12 == r2) goto L86
            r2 = 5
            if (r12 == r2) goto L8b
            r2 = 6
            if (r12 == r2) goto L86
            r2 = 7
            if (r12 == r2) goto L8b
            r2 = 8
            if (r12 == r2) goto L86
            goto L90
        L86:
            float r11 = r11.f7559d
            float r11 = r11 - r5
        L89:
            float r4 = r4 - r11
            goto L90
        L8b:
            float r11 = r11.f7559d
            float r11 = r11 - r5
            float r11 = r11 / r8
            goto L89
        L90:
            float r11 = r10.f7556a
            float r10 = r10.f7557b
            r0.preTranslate(r11, r10)
            r0.preScale(r1, r1)
            r0.preTranslate(r3, r4)
        L9d:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: N4.h.o(N4.g$b, N4.g$b, N4.e):android.graphics.Matrix");
    }

    private void o0(N4.g.C1184d c1184d) {
        y("Circle render", new Object[0]);
        N4.g.C1195p c1195p = c1184d.f7568q;
        if (c1195p == null || c1195p.j()) {
            return;
        }
        W0(this.f7649d, c1184d);
        if (A() && Y0()) {
            Matrix matrix = c1184d.f7602n;
            if (matrix != null) {
                this.f7646a.concat(matrix);
            }
            Path pathY = Y(c1184d);
            U0(c1184d);
            r(c1184d);
            p(c1184d);
            boolean zM0 = m0();
            if (this.f7649d.f7686b) {
                B(c1184d, pathY);
            }
            if (this.f7649d.f7687c) {
                C(pathY);
            }
            if (zM0) {
                j0(c1184d);
            }
        }
    }

    private void p(N4.g.K k10) {
        q(k10, k10.f7525h);
    }

    private void p0(N4.g.C1188i c1188i) {
        y("Ellipse render", new Object[0]);
        N4.g.C1195p c1195p = c1188i.f7591q;
        if (c1195p == null || c1188i.f7592r == null || c1195p.j() || c1188i.f7592r.j()) {
            return;
        }
        W0(this.f7649d, c1188i);
        if (A() && Y0()) {
            Matrix matrix = c1188i.f7602n;
            if (matrix != null) {
                this.f7646a.concat(matrix);
            }
            Path pathZ = Z(c1188i);
            U0(c1188i);
            r(c1188i);
            p(c1188i);
            boolean zM0 = m0();
            if (this.f7649d.f7686b) {
                B(c1188i, pathZ);
            }
            if (this.f7649d.f7687c) {
                C(pathZ);
            }
            if (zM0) {
                j0(c1188i);
            }
        }
    }

    private void q(N4.g.K k10, N4.g.C1182b c1182b) {
        Path pathJ;
        if (this.f7649d.f7685a.f7439E == null || (pathJ = j(k10, c1182b)) == null) {
            return;
        }
        this.f7646a.clipPath(pathJ);
    }

    private void q0(N4.g.C1192m c1192m) {
        y("Group render", new Object[0]);
        W0(this.f7649d, c1192m);
        if (A()) {
            Matrix matrix = c1192m.f7603o;
            if (matrix != null) {
                this.f7646a.concat(matrix);
            }
            p(c1192m);
            boolean zM0 = m0();
            F0(c1192m, true);
            if (zM0) {
                j0(c1192m);
            }
            U0(c1192m);
        }
    }

    private void r(N4.g.K k10) {
        N4.g.O o10 = this.f7649d.f7685a.f7449b;
        if (o10 instanceof N4.g.C1200u) {
            z(true, k10.f7525h, (N4.g.C1200u) o10);
        }
        N4.g.O o11 = this.f7649d.f7685a.f7452e;
        if (o11 instanceof N4.g.C1200u) {
            z(false, k10.f7525h, (N4.g.C1200u) o11);
        }
    }

    private void r0(N4.g.C1194o c1194o) {
        N4.g.C1195p c1195p;
        String str;
        y("Image render", new Object[0]);
        N4.g.C1195p c1195p2 = c1194o.f7607s;
        if (c1195p2 == null || c1195p2.j() || (c1195p = c1194o.f7608t) == null || c1195p.j() || (str = c1194o.f7604p) == null) {
            return;
        }
        N4.e eVar = c1194o.f7537o;
        if (eVar == null) {
            eVar = N4.e.f7392e;
        }
        Bitmap bitmapS = s(str);
        if (bitmapS == null) {
            N4.g.k();
            return;
        }
        N4.g.C1182b c1182b = new N4.g.C1182b(0.0f, 0.0f, bitmapS.getWidth(), bitmapS.getHeight());
        W0(this.f7649d, c1194o);
        if (A() && Y0()) {
            Matrix matrix = c1194o.f7609u;
            if (matrix != null) {
                this.f7646a.concat(matrix);
            }
            N4.g.C1195p c1195p3 = c1194o.f7605q;
            float f10 = c1195p3 != null ? c1195p3.f(this) : 0.0f;
            N4.g.C1195p c1195p4 = c1194o.f7606r;
            this.f7649d.f7690f = new N4.g.C1182b(f10, c1195p4 != null ? c1195p4.g(this) : 0.0f, c1194o.f7607s.f(this), c1194o.f7608t.f(this));
            if (!this.f7649d.f7685a.f7469v.booleanValue()) {
                N4.g.C1182b c1182b2 = this.f7649d.f7690f;
                O0(c1182b2.f7556a, c1182b2.f7557b, c1182b2.f7558c, c1182b2.f7559d);
            }
            c1194o.f7525h = this.f7649d.f7690f;
            U0(c1194o);
            p(c1194o);
            boolean zM0 = m0();
            X0();
            this.f7646a.save();
            this.f7646a.concat(o(this.f7649d.f7690f, c1182b, eVar));
            this.f7646a.drawBitmap(bitmapS, 0.0f, 0.0f, new Paint(this.f7649d.f7685a.f7447M != N4.g.E.e.optimizeSpeed ? 2 : 0));
            this.f7646a.restore();
            if (zM0) {
                j0(c1194o);
            }
        }
    }

    private Bitmap s(String str) {
        int iIndexOf;
        if (!str.startsWith("data:") || str.length() < 14 || (iIndexOf = str.indexOf(44)) < 12 || !";base64".equals(str.substring(iIndexOf - 7, iIndexOf))) {
            return null;
        }
        try {
            byte[] bArrDecode = Base64.decode(str.substring(iIndexOf + 1), 0);
            return BitmapFactory.decodeByteArray(bArrDecode, 0, bArrDecode.length);
        } catch (Exception e10) {
            Log.e("SVGAndroidRenderer", "Could not decode bad Data URL", e10);
            return null;
        }
    }

    private void s0(N4.g.C1196q c1196q) {
        y("Line render", new Object[0]);
        W0(this.f7649d, c1196q);
        if (A() && Y0() && this.f7649d.f7687c) {
            Matrix matrix = c1196q.f7602n;
            if (matrix != null) {
                this.f7646a.concat(matrix);
            }
            Path pathA0 = a0(c1196q);
            U0(c1196q);
            r(c1196q);
            p(c1196q);
            boolean zM0 = m0();
            C(pathA0);
            I0(c1196q);
            if (zM0) {
                j0(c1196q);
            }
        }
    }

    private Typeface t(String str, Integer num, N4.g.E.b bVar) {
        int i10;
        boolean z10 = bVar == N4.g.E.b.Italic;
        if (num.intValue() > 500) {
            i10 = z10 ? 3 : 1;
        } else {
            i10 = z10 ? 2 : 0;
        }
        str.getClass();
        switch (str) {
            case "sans-serif":
                return Typeface.create(Typeface.SANS_SERIF, i10);
            case "monospace":
                return Typeface.create(Typeface.MONOSPACE, i10);
            case "fantasy":
                return Typeface.create(Typeface.SANS_SERIF, i10);
            case "serif":
                return Typeface.create(Typeface.SERIF, i10);
            case "cursive":
                return Typeface.create(Typeface.SANS_SERIF, i10);
            default:
                return null;
        }
    }

    private void t0(N4.g.C1201v c1201v) {
        y("Path render", new Object[0]);
        if (c1201v.f7630o == null) {
            return;
        }
        W0(this.f7649d, c1201v);
        if (A() && Y0()) {
            C0133h c0133h = this.f7649d;
            if (c0133h.f7687c || c0133h.f7686b) {
                Matrix matrix = c1201v.f7602n;
                if (matrix != null) {
                    this.f7646a.concat(matrix);
                }
                Path pathF = new d(c1201v.f7630o).f();
                if (c1201v.f7525h == null) {
                    c1201v.f7525h = m(pathF);
                }
                U0(c1201v);
                r(c1201v);
                p(c1201v);
                boolean zM0 = m0();
                if (this.f7649d.f7686b) {
                    pathF.setFillType(U());
                    B(c1201v, pathF);
                }
                if (this.f7649d.f7687c) {
                    C(pathF);
                }
                I0(c1201v);
                if (zM0) {
                    j0(c1201v);
                }
            }
        }
    }

    private void u(N4.g.N n10) {
        Boolean bool;
        if ((n10 instanceof N4.g.L) && (bool = ((N4.g.L) n10).f7527d) != null) {
            this.f7649d.f7692h = bool.booleanValue();
        }
    }

    private void u0(N4.g.C1205z c1205z) {
        y("PolyLine render", new Object[0]);
        W0(this.f7649d, c1205z);
        if (A() && Y0()) {
            C0133h c0133h = this.f7649d;
            if (c0133h.f7687c || c0133h.f7686b) {
                Matrix matrix = c1205z.f7602n;
                if (matrix != null) {
                    this.f7646a.concat(matrix);
                }
                if (c1205z.f7644o.length < 2) {
                    return;
                }
                Path pathB0 = b0(c1205z);
                U0(c1205z);
                pathB0.setFillType(U());
                r(c1205z);
                p(c1205z);
                boolean zM0 = m0();
                if (this.f7649d.f7686b) {
                    B(c1205z, pathB0);
                }
                if (this.f7649d.f7687c) {
                    C(pathB0);
                }
                I0(c1205z);
                if (zM0) {
                    j0(c1205z);
                }
            }
        }
    }

    private static double v(double d10) {
        if (d10 < -1.0d) {
            return 3.141592653589793d;
        }
        if (d10 > 1.0d) {
            return 0.0d;
        }
        return Math.acos(d10);
    }

    private void v0(N4.g.A a10) {
        y("Polygon render", new Object[0]);
        W0(this.f7649d, a10);
        if (A() && Y0()) {
            C0133h c0133h = this.f7649d;
            if (c0133h.f7687c || c0133h.f7686b) {
                Matrix matrix = a10.f7602n;
                if (matrix != null) {
                    this.f7646a.concat(matrix);
                }
                if (a10.f7644o.length < 2) {
                    return;
                }
                Path pathB0 = b0(a10);
                U0(a10);
                r(a10);
                p(a10);
                boolean zM0 = m0();
                if (this.f7649d.f7686b) {
                    B(a10, pathB0);
                }
                if (this.f7649d.f7687c) {
                    C(pathB0);
                }
                I0(a10);
                if (zM0) {
                    j0(a10);
                }
            }
        }
    }

    private static int w(float f10) {
        int i10 = (int) (f10 * 256.0f);
        if (i10 < 0) {
            return 0;
        }
        if (i10 > 255) {
            return 255;
        }
        return i10;
    }

    private void w0(N4.g.B b10) {
        y("Rect render", new Object[0]);
        N4.g.C1195p c1195p = b10.f7430q;
        if (c1195p == null || b10.f7431r == null || c1195p.j() || b10.f7431r.j()) {
            return;
        }
        W0(this.f7649d, b10);
        if (A() && Y0()) {
            Matrix matrix = b10.f7602n;
            if (matrix != null) {
                this.f7646a.concat(matrix);
            }
            Path pathC0 = c0(b10);
            U0(b10);
            r(b10);
            p(b10);
            boolean zM0 = m0();
            if (this.f7649d.f7686b) {
                B(b10, pathC0);
            }
            if (this.f7649d.f7687c) {
                C(pathC0);
            }
            if (zM0) {
                j0(b10);
            }
        }
    }

    private static int x(int i10, float f10) {
        int i11 = 255;
        int iRound = Math.round(((i10 >> 24) & 255) * f10);
        if (iRound < 0) {
            i11 = 0;
        } else if (iRound <= 255) {
            i11 = iRound;
        }
        return (i10 & 16777215) | (i11 << 24);
    }

    private void x0(N4.g.F f10) {
        z0(f10, f0(f10.f7509q, f10.f7510r, f10.f7511s, f10.f7512t), f10.f7543p, f10.f7537o);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void y(String str, Object... objArr) {
    }

    private void y0(N4.g.F f10, N4.g.C1182b c1182b) {
        z0(f10, c1182b, f10.f7543p, f10.f7537o);
    }

    private void z(boolean z10, N4.g.C1182b c1182b, N4.g.C1200u c1200u) {
        N4.g.N nS = this.f7648c.s(c1200u.f7628a);
        if (nS == null) {
            F("%s reference '%s' not found", z10 ? "Fill" : "Stroke", c1200u.f7628a);
            N4.g.O o10 = c1200u.f7629b;
            if (o10 != null) {
                P0(this.f7649d, z10, o10);
                return;
            } else if (z10) {
                this.f7649d.f7686b = false;
                return;
            } else {
                this.f7649d.f7687c = false;
                return;
            }
        }
        if (nS instanceof N4.g.M) {
            X(z10, c1182b, (N4.g.M) nS);
        } else if (nS instanceof N4.g.Q) {
            e0(z10, c1182b, (N4.g.Q) nS);
        } else if (nS instanceof N4.g.C) {
            Q0(z10, (N4.g.C) nS);
        }
    }

    private void z0(N4.g.F f10, N4.g.C1182b c1182b, N4.g.C1182b c1182b2, N4.e eVar) {
        y("Svg render", new Object[0]);
        if (c1182b.f7558c == 0.0f || c1182b.f7559d == 0.0f) {
            return;
        }
        if (eVar == null && (eVar = f10.f7537o) == null) {
            eVar = N4.e.f7392e;
        }
        W0(this.f7649d, f10);
        if (A()) {
            C0133h c0133h = this.f7649d;
            c0133h.f7690f = c1182b;
            if (!c0133h.f7685a.f7469v.booleanValue()) {
                N4.g.C1182b c1182b3 = this.f7649d.f7690f;
                O0(c1182b3.f7556a, c1182b3.f7557b, c1182b3.f7558c, c1182b3.f7559d);
            }
            q(f10, this.f7649d.f7690f);
            if (c1182b2 != null) {
                this.f7646a.concat(o(this.f7649d.f7690f, c1182b2, eVar));
                this.f7649d.f7691g = f10.f7543p;
            } else {
                Canvas canvas = this.f7646a;
                N4.g.C1182b c1182b4 = this.f7649d.f7690f;
                canvas.translate(c1182b4.f7556a, c1182b4.f7557b);
            }
            boolean zM0 = m0();
            X0();
            F0(f10, true);
            if (zM0) {
                j0(f10);
            }
            U0(f10);
        }
    }

    void G0(N4.g gVar, N4.f fVar) {
        N4.g.C1182b c1182b;
        N4.e eVar;
        if (fVar == null) {
            throw new NullPointerException("renderOptions shouldn't be null");
        }
        this.f7648c = gVar;
        N4.g.F fM = gVar.m();
        if (fM == null) {
            Z0("Nothing to render. Document is empty.", new Object[0]);
            return;
        }
        if (fVar.e()) {
            N4.g.L lJ = this.f7648c.j(fVar.f7419e);
            if (lJ == null || !(lJ instanceof N4.g.f0)) {
                Log.w("SVGAndroidRenderer", String.format("View element with id \"%s\" not found.", fVar.f7419e));
                return;
            }
            N4.g.f0 f0Var = (N4.g.f0) lJ;
            c1182b = f0Var.f7543p;
            if (c1182b == null) {
                Log.w("SVGAndroidRenderer", String.format("View element with id \"%s\" is missing a viewBox attribute.", fVar.f7419e));
                return;
            }
            eVar = f0Var.f7537o;
        } else {
            c1182b = fVar.f() ? fVar.f7418d : fM.f7543p;
            eVar = fVar.c() ? fVar.f7416b : fM.f7537o;
        }
        if (fVar.b()) {
            gVar.a(fVar.f7415a);
        }
        if (fVar.d()) {
            N4.b.q qVar = new N4.b.q();
            this.f7653h = qVar;
            qVar.f7374a = gVar.j(fVar.f7417c);
        }
        N0();
        u(fM);
        S0();
        N4.g.C1182b c1182b2 = new N4.g.C1182b(fVar.f7420f);
        N4.g.C1195p c1195p = fM.f7511s;
        if (c1195p != null) {
            c1182b2.f7558c = c1195p.e(this, c1182b2.f7558c);
        }
        N4.g.C1195p c1195p2 = fM.f7512t;
        if (c1195p2 != null) {
            c1182b2.f7559d = c1195p2.e(this, c1182b2.f7559d);
        }
        z0(fM, c1182b2, c1182b, eVar);
        R0();
        if (fVar.b()) {
            gVar.b();
        }
    }

    float Q() {
        return this.f7649d.f7688d.getTextSize();
    }

    float R() {
        return this.f7649d.f7688d.getTextSize() / 2.0f;
    }

    N4.g.C1182b S() {
        C0133h c0133h = this.f7649d;
        N4.g.C1182b c1182b = c0133h.f7691g;
        return c1182b != null ? c1182b : c0133h.f7690f;
    }

    float T() {
        return this.f7647b;
    }
}
