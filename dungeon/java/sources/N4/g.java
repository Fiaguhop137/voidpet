package N4;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Picture;
import android.graphics.RectF;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public class g {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static boolean f7421g = true;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private F f7422a = null;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f7423b = "";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private String f7424c = "";

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private float f7425d = 96.0f;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private b.r f7426e = new b.r();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private Map f7427f = new HashMap();

    static class A extends C1205z {
        A() {
        }

        @Override // N4.g.C1205z, N4.g.N
        String o() {
            return "polygon";
        }
    }

    static class B extends AbstractC1191l {

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        C1195p f7428o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        C1195p f7429p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        C1195p f7430q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        C1195p f7431r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        C1195p f7432s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        C1195p f7433t;

        B() {
        }

        @Override // N4.g.N
        String o() {
            return "rect";
        }
    }

    static class C extends L implements J {
        C() {
        }

        @Override // N4.g.J
        public List b() {
            return Collections.EMPTY_LIST;
        }

        @Override // N4.g.J
        public void i(N n10) {
        }

        @Override // N4.g.N
        String o() {
            return "solidColor";
        }
    }

    static class D extends L implements J {

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        Float f7434h;

        D() {
        }

        @Override // N4.g.J
        public List b() {
            return Collections.EMPTY_LIST;
        }

        @Override // N4.g.J
        public void i(N n10) {
        }

        @Override // N4.g.N
        String o() {
            return "stop";
        }
    }

    static class E implements Cloneable {

        /* JADX INFO: renamed from: A, reason: collision with root package name */
        Boolean f7435A;

        /* JADX INFO: renamed from: B, reason: collision with root package name */
        Boolean f7436B;

        /* JADX INFO: renamed from: C, reason: collision with root package name */
        O f7437C;

        /* JADX INFO: renamed from: D, reason: collision with root package name */
        Float f7438D;

        /* JADX INFO: renamed from: E, reason: collision with root package name */
        String f7439E;

        /* JADX INFO: renamed from: F, reason: collision with root package name */
        a f7440F;

        /* JADX INFO: renamed from: G, reason: collision with root package name */
        String f7441G;

        /* JADX INFO: renamed from: H, reason: collision with root package name */
        O f7442H;

        /* JADX INFO: renamed from: I, reason: collision with root package name */
        Float f7443I;

        /* JADX INFO: renamed from: J, reason: collision with root package name */
        O f7444J;

        /* JADX INFO: renamed from: K, reason: collision with root package name */
        Float f7445K;

        /* JADX INFO: renamed from: L, reason: collision with root package name */
        i f7446L;

        /* JADX INFO: renamed from: M, reason: collision with root package name */
        e f7447M;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        long f7448a = 0;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        O f7449b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        a f7450c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Float f7451d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        O f7452e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        Float f7453f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        C1195p f7454g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        c f7455h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        d f7456i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        Float f7457j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        C1195p[] f7458k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        C1195p f7459l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        Float f7460m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        C1186f f7461n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        List f7462o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        C1195p f7463p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        Integer f7464q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        b f7465r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        EnumC0131g f7466s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        h f7467t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        f f7468u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        Boolean f7469v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        C1183c f7470w;

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        String f7471x;

        /* JADX INFO: renamed from: y, reason: collision with root package name */
        String f7472y;

        /* JADX INFO: renamed from: z, reason: collision with root package name */
        String f7473z;

        public enum a {
            NonZero,
            EvenOdd
        }

        public enum b {
            Normal,
            Italic,
            Oblique
        }

        public enum c {
            Butt,
            Round,
            Square
        }

        public enum d {
            Miter,
            Round,
            Bevel
        }

        public enum e {
            auto,
            optimizeQuality,
            optimizeSpeed
        }

        public enum f {
            Start,
            Middle,
            End
        }

        /* JADX INFO: renamed from: N4.g$E$g, reason: collision with other inner class name */
        public enum EnumC0131g {
            None,
            Underline,
            Overline,
            LineThrough,
            Blink
        }

        public enum h {
            LTR,
            RTL
        }

        public enum i {
            None,
            NonScalingStroke
        }

        E() {
        }

        static E b() {
            E e10 = new E();
            e10.f7448a = -1L;
            C1186f c1186f = C1186f.f7585b;
            e10.f7449b = c1186f;
            a aVar = a.NonZero;
            e10.f7450c = aVar;
            Float fValueOf = Float.valueOf(1.0f);
            e10.f7451d = fValueOf;
            e10.f7452e = null;
            e10.f7453f = fValueOf;
            e10.f7454g = new C1195p(1.0f);
            e10.f7455h = c.Butt;
            e10.f7456i = d.Miter;
            e10.f7457j = Float.valueOf(4.0f);
            e10.f7458k = null;
            e10.f7459l = new C1195p(0.0f);
            e10.f7460m = fValueOf;
            e10.f7461n = c1186f;
            e10.f7462o = null;
            e10.f7463p = new C1195p(12.0f, d0.pt);
            e10.f7464q = 400;
            e10.f7465r = b.Normal;
            e10.f7466s = EnumC0131g.None;
            e10.f7467t = h.LTR;
            e10.f7468u = f.Start;
            Boolean bool = Boolean.TRUE;
            e10.f7469v = bool;
            e10.f7470w = null;
            e10.f7471x = null;
            e10.f7472y = null;
            e10.f7473z = null;
            e10.f7435A = bool;
            e10.f7436B = bool;
            e10.f7437C = c1186f;
            e10.f7438D = fValueOf;
            e10.f7439E = null;
            e10.f7440F = aVar;
            e10.f7441G = null;
            e10.f7442H = null;
            e10.f7443I = fValueOf;
            e10.f7444J = null;
            e10.f7445K = fValueOf;
            e10.f7446L = i.None;
            e10.f7447M = e.auto;
            return e10;
        }

        void c(boolean z10) {
            Float fValueOf = Float.valueOf(1.0f);
            Boolean bool = Boolean.TRUE;
            this.f7435A = bool;
            if (!z10) {
                bool = Boolean.FALSE;
            }
            this.f7469v = bool;
            this.f7470w = null;
            this.f7439E = null;
            this.f7460m = fValueOf;
            this.f7437C = C1186f.f7585b;
            this.f7438D = fValueOf;
            this.f7441G = null;
            this.f7442H = null;
            this.f7443I = fValueOf;
            this.f7444J = null;
            this.f7445K = fValueOf;
            this.f7446L = i.None;
        }

        protected Object clone() {
            E e10 = (E) super.clone();
            C1195p[] c1195pArr = this.f7458k;
            if (c1195pArr != null) {
                e10.f7458k = (C1195p[]) c1195pArr.clone();
            }
            return e10;
        }
    }

    static class F extends R {

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        C1195p f7509q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        C1195p f7510r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        C1195p f7511s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        C1195p f7512t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public String f7513u;

        F() {
        }

        @Override // N4.g.N
        String o() {
            return "svg";
        }
    }

    interface G {
        Set a();

        String c();

        void d(Set set);

        void f(Set set);

        Set g();

        void h(Set set);

        void j(Set set);

        void k(String str);

        Set m();

        Set n();
    }

    static abstract class H extends K implements J, G {

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        List f7514i = new ArrayList();

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        Set f7515j = null;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        String f7516k = null;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        Set f7517l = null;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        Set f7518m = null;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        Set f7519n = null;

        H() {
        }

        @Override // N4.g.G
        public Set a() {
            return null;
        }

        @Override // N4.g.J
        public List b() {
            return this.f7514i;
        }

        @Override // N4.g.G
        public String c() {
            return this.f7516k;
        }

        @Override // N4.g.G
        public void d(Set set) {
            this.f7519n = set;
        }

        @Override // N4.g.G
        public void f(Set set) {
            this.f7515j = set;
        }

        @Override // N4.g.G
        public Set g() {
            return this.f7515j;
        }

        @Override // N4.g.G
        public void h(Set set) {
            this.f7517l = set;
        }

        @Override // N4.g.J
        public void i(N n10) {
            this.f7514i.add(n10);
        }

        @Override // N4.g.G
        public void j(Set set) {
            this.f7518m = set;
        }

        @Override // N4.g.G
        public void k(String str) {
            this.f7516k = str;
        }

        @Override // N4.g.G
        public Set m() {
            return this.f7518m;
        }

        @Override // N4.g.G
        public Set n() {
            return this.f7519n;
        }
    }

    static abstract class I extends K implements G {

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        Set f7520i = null;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        String f7521j = null;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        Set f7522k = null;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        Set f7523l = null;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        Set f7524m = null;

        I() {
        }

        @Override // N4.g.G
        public Set a() {
            return this.f7522k;
        }

        @Override // N4.g.G
        public String c() {
            return this.f7521j;
        }

        @Override // N4.g.G
        public void d(Set set) {
            this.f7524m = set;
        }

        @Override // N4.g.G
        public void f(Set set) {
            this.f7520i = set;
        }

        @Override // N4.g.G
        public Set g() {
            return this.f7520i;
        }

        @Override // N4.g.G
        public void h(Set set) {
            this.f7522k = set;
        }

        @Override // N4.g.G
        public void j(Set set) {
            this.f7523l = set;
        }

        @Override // N4.g.G
        public void k(String str) {
            this.f7521j = str;
        }

        @Override // N4.g.G
        public Set m() {
            return this.f7523l;
        }

        @Override // N4.g.G
        public Set n() {
            return this.f7524m;
        }
    }

    interface J {
        List b();

        void i(N n10);
    }

    static abstract class K extends L {

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        C1182b f7525h = null;

        K() {
        }
    }

    static abstract class L extends N {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        String f7526c = null;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Boolean f7527d = null;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        E f7528e = null;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        E f7529f = null;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        List f7530g = null;

        L() {
        }

        public String toString() {
            return o();
        }
    }

    static class M extends AbstractC1189j {

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        C1195p f7531m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        C1195p f7532n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        C1195p f7533o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        C1195p f7534p;

        M() {
        }

        @Override // N4.g.N
        String o() {
            return "linearGradient";
        }
    }

    static class N {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        g f7535a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        J f7536b;

        N() {
        }

        abstract String o();
    }

    static abstract class O implements Cloneable {
        O() {
        }
    }

    static abstract class P extends H {

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        e f7537o = null;

        P() {
        }
    }

    static class Q extends AbstractC1189j {

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        C1195p f7538m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        C1195p f7539n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        C1195p f7540o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        C1195p f7541p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        C1195p f7542q;

        Q() {
        }

        @Override // N4.g.N
        String o() {
            return "radialGradient";
        }
    }

    static abstract class R extends P {

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        C1182b f7543p;

        R() {
        }
    }

    static class S extends C1192m {
        S() {
        }

        @Override // N4.g.C1192m, N4.g.N
        String o() {
            return "switch";
        }
    }

    static class T extends R implements InterfaceC1199t {
        T() {
        }

        @Override // N4.g.N
        String o() {
            return "symbol";
        }
    }

    static class U extends Y implements X {

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        String f7544o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        private b0 f7545p;

        U() {
        }

        @Override // N4.g.X
        public b0 e() {
            return this.f7545p;
        }

        @Override // N4.g.N
        String o() {
            return "tref";
        }

        public void p(b0 b0Var) {
            this.f7545p = b0Var;
        }
    }

    static class V extends a0 implements X {

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        private b0 f7546s;

        V() {
        }

        @Override // N4.g.X
        public b0 e() {
            return this.f7546s;
        }

        @Override // N4.g.N
        String o() {
            return "tspan";
        }

        public void p(b0 b0Var) {
            this.f7546s = b0Var;
        }
    }

    static class W extends a0 implements b0, InterfaceC1193n {

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        Matrix f7547s;

        W() {
        }

        @Override // N4.g.InterfaceC1193n
        public void l(Matrix matrix) {
            this.f7547s = matrix;
        }

        @Override // N4.g.N
        String o() {
            return "text";
        }
    }

    interface X {
        b0 e();
    }

    static abstract class Y extends H {
        Y() {
        }

        @Override // N4.g.H, N4.g.J
        public void i(N n10) throws j {
            if (n10 instanceof X) {
                this.f7514i.add(n10);
                return;
            }
            throw new j("Text content elements cannot contain " + n10 + " elements.");
        }
    }

    static class Z extends Y implements X {

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        String f7548o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        C1195p f7549p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        private b0 f7550q;

        Z() {
        }

        @Override // N4.g.X
        public b0 e() {
            return this.f7550q;
        }

        @Override // N4.g.N
        String o() {
            return "textPath";
        }

        public void p(b0 b0Var) {
            this.f7550q = b0Var;
        }
    }

    /* JADX INFO: renamed from: N4.g$a, reason: case insensitive filesystem */
    static /* synthetic */ class C1181a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f7551a;

        static {
            int[] iArr = new int[d0.values().length];
            f7551a = iArr;
            try {
                iArr[d0.px.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f7551a[d0.em.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f7551a[d0.ex.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f7551a[d0.in.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f7551a[d0.cm.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f7551a[d0.mm.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f7551a[d0.pt.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f7551a[d0.pc.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f7551a[d0.percent.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
        }
    }

    static abstract class a0 extends Y {

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        List f7552o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        List f7553p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        List f7554q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        List f7555r;

        a0() {
        }
    }

    /* JADX INFO: renamed from: N4.g$b, reason: case insensitive filesystem */
    static class C1182b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        float f7556a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        float f7557b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        float f7558c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        float f7559d;

        C1182b(float f10, float f11, float f12, float f13) {
            this.f7556a = f10;
            this.f7557b = f11;
            this.f7558c = f12;
            this.f7559d = f13;
        }

        C1182b(C1182b c1182b) {
            this.f7556a = c1182b.f7556a;
            this.f7557b = c1182b.f7557b;
            this.f7558c = c1182b.f7558c;
            this.f7559d = c1182b.f7559d;
        }

        static C1182b a(float f10, float f11, float f12, float f13) {
            return new C1182b(f10, f11, f12 - f10, f13 - f11);
        }

        float b() {
            return this.f7556a + this.f7558c;
        }

        float c() {
            return this.f7557b + this.f7559d;
        }

        RectF d() {
            return new RectF(this.f7556a, this.f7557b, b(), c());
        }

        void e(C1182b c1182b) {
            float f10 = c1182b.f7556a;
            if (f10 < this.f7556a) {
                this.f7556a = f10;
            }
            float f11 = c1182b.f7557b;
            if (f11 < this.f7557b) {
                this.f7557b = f11;
            }
            if (c1182b.b() > b()) {
                this.f7558c = c1182b.b() - this.f7556a;
            }
            if (c1182b.c() > c()) {
                this.f7559d = c1182b.c() - this.f7557b;
            }
        }

        public String toString() {
            return "[" + this.f7556a + " " + this.f7557b + " " + this.f7558c + " " + this.f7559d + "]";
        }
    }

    interface b0 {
    }

    /* JADX INFO: renamed from: N4.g$c, reason: case insensitive filesystem */
    static class C1183c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        C1195p f7560a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        C1195p f7561b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        C1195p f7562c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        C1195p f7563d;

        C1183c(C1195p c1195p, C1195p c1195p2, C1195p c1195p3, C1195p c1195p4) {
            this.f7560a = c1195p;
            this.f7561b = c1195p2;
            this.f7562c = c1195p3;
            this.f7563d = c1195p4;
        }
    }

    static class c0 extends N implements X {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        String f7564c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private b0 f7565d;

        c0(String str) {
            this.f7564c = str;
        }

        @Override // N4.g.X
        public b0 e() {
            return this.f7565d;
        }

        public String toString() {
            return "TextChild: '" + this.f7564c + "'";
        }
    }

    /* JADX INFO: renamed from: N4.g$d, reason: case insensitive filesystem */
    static class C1184d extends AbstractC1191l {

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        C1195p f7566o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        C1195p f7567p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        C1195p f7568q;

        C1184d() {
        }

        @Override // N4.g.N
        String o() {
            return "circle";
        }
    }

    enum d0 {
        px,
        em,
        ex,
        in,
        cm,
        mm,
        pt,
        pc,
        percent
    }

    /* JADX INFO: renamed from: N4.g$e, reason: case insensitive filesystem */
    static class C1185e extends C1192m implements InterfaceC1199t {

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        Boolean f7579p;

        C1185e() {
        }

        @Override // N4.g.C1192m, N4.g.N
        String o() {
            return "clipPath";
        }
    }

    static class e0 extends C1192m {

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        String f7580p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        C1195p f7581q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        C1195p f7582r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        C1195p f7583s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        C1195p f7584t;

        e0() {
        }

        @Override // N4.g.C1192m, N4.g.N
        String o() {
            return "use";
        }
    }

    /* JADX INFO: renamed from: N4.g$f, reason: case insensitive filesystem */
    static class C1186f extends O {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        static final C1186f f7585b = new C1186f(-16777216);

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        static final C1186f f7586c = new C1186f(0);

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f7587a;

        C1186f(int i10) {
            this.f7587a = i10;
        }

        public String toString() {
            return String.format("#%08x", Integer.valueOf(this.f7587a));
        }
    }

    static class f0 extends R implements InterfaceC1199t {
        f0() {
        }

        @Override // N4.g.N
        String o() {
            return "view";
        }
    }

    /* JADX INFO: renamed from: N4.g$g, reason: collision with other inner class name */
    static class C0132g extends O {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private static C0132g f7588a = new C0132g();

        private C0132g() {
        }

        static C0132g b() {
            return f7588a;
        }
    }

    /* JADX INFO: renamed from: N4.g$h, reason: case insensitive filesystem */
    static class C1187h extends C1192m implements InterfaceC1199t {
        C1187h() {
        }

        @Override // N4.g.C1192m, N4.g.N
        String o() {
            return "defs";
        }
    }

    /* JADX INFO: renamed from: N4.g$i, reason: case insensitive filesystem */
    static class C1188i extends AbstractC1191l {

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        C1195p f7589o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        C1195p f7590p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        C1195p f7591q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        C1195p f7592r;

        C1188i() {
        }

        @Override // N4.g.N
        String o() {
            return "ellipse";
        }
    }

    /* JADX INFO: renamed from: N4.g$j, reason: case insensitive filesystem */
    static abstract class AbstractC1189j extends L implements J {

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        List f7593h = new ArrayList();

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        Boolean f7594i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        Matrix f7595j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        EnumC1190k f7596k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        String f7597l;

        AbstractC1189j() {
        }

        @Override // N4.g.J
        public List b() {
            return this.f7593h;
        }

        @Override // N4.g.J
        public void i(N n10) throws j {
            if (n10 instanceof D) {
                this.f7593h.add(n10);
                return;
            }
            throw new j("Gradient elements cannot contain " + n10 + " elements.");
        }
    }

    /* JADX INFO: renamed from: N4.g$k, reason: case insensitive filesystem */
    enum EnumC1190k {
        pad,
        reflect,
        repeat
    }

    /* JADX INFO: renamed from: N4.g$l, reason: case insensitive filesystem */
    static abstract class AbstractC1191l extends I implements InterfaceC1193n {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        Matrix f7602n;

        AbstractC1191l() {
        }

        @Override // N4.g.InterfaceC1193n
        public void l(Matrix matrix) {
            this.f7602n = matrix;
        }
    }

    /* JADX INFO: renamed from: N4.g$m, reason: case insensitive filesystem */
    static class C1192m extends H implements InterfaceC1193n {

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        Matrix f7603o;

        C1192m() {
        }

        @Override // N4.g.InterfaceC1193n
        public void l(Matrix matrix) {
            this.f7603o = matrix;
        }

        @Override // N4.g.N
        String o() {
            return "group";
        }
    }

    /* JADX INFO: renamed from: N4.g$n, reason: case insensitive filesystem */
    interface InterfaceC1193n {
        void l(Matrix matrix);
    }

    /* JADX INFO: renamed from: N4.g$o, reason: case insensitive filesystem */
    static class C1194o extends P implements InterfaceC1193n {

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        String f7604p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        C1195p f7605q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        C1195p f7606r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        C1195p f7607s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        C1195p f7608t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        Matrix f7609u;

        C1194o() {
        }

        @Override // N4.g.InterfaceC1193n
        public void l(Matrix matrix) {
            this.f7609u = matrix;
        }

        @Override // N4.g.N
        String o() {
            return "image";
        }
    }

    /* JADX INFO: renamed from: N4.g$p, reason: case insensitive filesystem */
    static class C1195p implements Cloneable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        float f7610a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        d0 f7611b;

        C1195p(float f10) {
            this.f7610a = f10;
            this.f7611b = d0.px;
        }

        C1195p(float f10, d0 d0Var) {
            this.f7610a = f10;
            this.f7611b = d0Var;
        }

        float b() {
            return this.f7610a;
        }

        float c(float f10) {
            int i10 = C1181a.f7551a[this.f7611b.ordinal()];
            if (i10 == 1) {
                return this.f7610a;
            }
            switch (i10) {
                case 4:
                    return this.f7610a * f10;
                case 5:
                    return (this.f7610a * f10) / 2.54f;
                case 6:
                    return (this.f7610a * f10) / 25.4f;
                case 7:
                    return (this.f7610a * f10) / 72.0f;
                case 8:
                    return (this.f7610a * f10) / 6.0f;
                default:
                    return this.f7610a;
            }
        }

        float d(h hVar) {
            if (this.f7611b != d0.percent) {
                return f(hVar);
            }
            C1182b c1182bS = hVar.S();
            if (c1182bS == null) {
                return this.f7610a;
            }
            float f10 = c1182bS.f7558c;
            float f11 = c1182bS.f7559d;
            if (f10 == f11) {
                return (this.f7610a * f10) / 100.0f;
            }
            return (this.f7610a * ((float) (Math.sqrt((f10 * f10) + (f11 * f11)) / 1.414213562373095d))) / 100.0f;
        }

        float e(h hVar, float f10) {
            return this.f7611b == d0.percent ? (this.f7610a * f10) / 100.0f : f(hVar);
        }

        float f(h hVar) {
            switch (C1181a.f7551a[this.f7611b.ordinal()]) {
                case 1:
                    return this.f7610a;
                case 2:
                    return this.f7610a * hVar.Q();
                case 3:
                    return this.f7610a * hVar.R();
                case 4:
                    return this.f7610a * hVar.T();
                case 5:
                    return (this.f7610a * hVar.T()) / 2.54f;
                case 6:
                    return (this.f7610a * hVar.T()) / 25.4f;
                case 7:
                    return (this.f7610a * hVar.T()) / 72.0f;
                case 8:
                    return (this.f7610a * hVar.T()) / 6.0f;
                case 9:
                    C1182b c1182bS = hVar.S();
                    return c1182bS == null ? this.f7610a : (this.f7610a * c1182bS.f7558c) / 100.0f;
                default:
                    return this.f7610a;
            }
        }

        float g(h hVar) {
            if (this.f7611b != d0.percent) {
                return f(hVar);
            }
            C1182b c1182bS = hVar.S();
            return c1182bS == null ? this.f7610a : (this.f7610a * c1182bS.f7559d) / 100.0f;
        }

        boolean h() {
            return this.f7610a < 0.0f;
        }

        boolean j() {
            return this.f7610a == 0.0f;
        }

        public String toString() {
            return String.valueOf(this.f7610a) + this.f7611b;
        }
    }

    /* JADX INFO: renamed from: N4.g$q, reason: case insensitive filesystem */
    static class C1196q extends AbstractC1191l {

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        C1195p f7612o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        C1195p f7613p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        C1195p f7614q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        C1195p f7615r;

        C1196q() {
        }

        @Override // N4.g.N
        String o() {
            return "line";
        }
    }

    /* JADX INFO: renamed from: N4.g$r, reason: case insensitive filesystem */
    static class C1197r extends R implements InterfaceC1199t {

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        boolean f7616q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        C1195p f7617r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        C1195p f7618s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        C1195p f7619t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        C1195p f7620u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        Float f7621v;

        C1197r() {
        }

        @Override // N4.g.N
        String o() {
            return "marker";
        }
    }

    /* JADX INFO: renamed from: N4.g$s, reason: case insensitive filesystem */
    static class C1198s extends H implements InterfaceC1199t {

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        Boolean f7622o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        Boolean f7623p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        C1195p f7624q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        C1195p f7625r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        C1195p f7626s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        C1195p f7627t;

        C1198s() {
        }

        @Override // N4.g.N
        String o() {
            return "mask";
        }
    }

    /* JADX INFO: renamed from: N4.g$t, reason: case insensitive filesystem */
    interface InterfaceC1199t {
    }

    /* JADX INFO: renamed from: N4.g$u, reason: case insensitive filesystem */
    static class C1200u extends O {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        String f7628a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        O f7629b;

        C1200u(String str, O o10) {
            this.f7628a = str;
            this.f7629b = o10;
        }

        public String toString() {
            return this.f7628a + " " + this.f7629b;
        }
    }

    /* JADX INFO: renamed from: N4.g$v, reason: case insensitive filesystem */
    static class C1201v extends AbstractC1191l {

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        C1202w f7630o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        Float f7631p;

        C1201v() {
        }

        @Override // N4.g.N
        String o() {
            return "path";
        }
    }

    /* JADX INFO: renamed from: N4.g$w, reason: case insensitive filesystem */
    static class C1202w implements InterfaceC1203x {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private int f7633b = 0;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private int f7635d = 0;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private byte[] f7632a = new byte[8];

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private float[] f7634c = new float[16];

        C1202w() {
        }

        private void f(byte b10) {
            int i10 = this.f7633b;
            byte[] bArr = this.f7632a;
            if (i10 == bArr.length) {
                byte[] bArr2 = new byte[bArr.length * 2];
                System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
                this.f7632a = bArr2;
            }
            byte[] bArr3 = this.f7632a;
            int i11 = this.f7633b;
            this.f7633b = i11 + 1;
            bArr3[i11] = b10;
        }

        private void g(int i10) {
            float[] fArr = this.f7634c;
            if (fArr.length < this.f7635d + i10) {
                float[] fArr2 = new float[fArr.length * 2];
                System.arraycopy(fArr, 0, fArr2, 0, fArr.length);
                this.f7634c = fArr2;
            }
        }

        @Override // N4.g.InterfaceC1203x
        public void a(float f10, float f11, float f12, float f13) {
            f((byte) 3);
            g(4);
            float[] fArr = this.f7634c;
            int i10 = this.f7635d;
            int i11 = i10 + 1;
            this.f7635d = i11;
            fArr[i10] = f10;
            int i12 = i10 + 2;
            this.f7635d = i12;
            fArr[i11] = f11;
            int i13 = i10 + 3;
            this.f7635d = i13;
            fArr[i12] = f12;
            this.f7635d = i10 + 4;
            fArr[i13] = f13;
        }

        @Override // N4.g.InterfaceC1203x
        public void b(float f10, float f11) {
            f((byte) 0);
            g(2);
            float[] fArr = this.f7634c;
            int i10 = this.f7635d;
            int i11 = i10 + 1;
            this.f7635d = i11;
            fArr[i10] = f10;
            this.f7635d = i10 + 2;
            fArr[i11] = f11;
        }

        @Override // N4.g.InterfaceC1203x
        public void c(float f10, float f11, float f12, float f13, float f14, float f15) {
            f((byte) 2);
            g(6);
            float[] fArr = this.f7634c;
            int i10 = this.f7635d;
            int i11 = i10 + 1;
            this.f7635d = i11;
            fArr[i10] = f10;
            int i12 = i10 + 2;
            this.f7635d = i12;
            fArr[i11] = f11;
            int i13 = i10 + 3;
            this.f7635d = i13;
            fArr[i12] = f12;
            int i14 = i10 + 4;
            this.f7635d = i14;
            fArr[i13] = f13;
            int i15 = i10 + 5;
            this.f7635d = i15;
            fArr[i14] = f14;
            this.f7635d = i10 + 6;
            fArr[i15] = f15;
        }

        @Override // N4.g.InterfaceC1203x
        public void close() {
            f((byte) 8);
        }

        @Override // N4.g.InterfaceC1203x
        public void d(float f10, float f11, float f12, boolean z10, boolean z11, float f13, float f14) {
            f((byte) ((z10 ? 2 : 0) | 4 | (z11 ? 1 : 0)));
            g(5);
            float[] fArr = this.f7634c;
            int i10 = this.f7635d;
            int i11 = i10 + 1;
            this.f7635d = i11;
            fArr[i10] = f10;
            int i12 = i10 + 2;
            this.f7635d = i12;
            fArr[i11] = f11;
            int i13 = i10 + 3;
            this.f7635d = i13;
            fArr[i12] = f12;
            int i14 = i10 + 4;
            this.f7635d = i14;
            fArr[i13] = f13;
            this.f7635d = i10 + 5;
            fArr[i14] = f14;
        }

        @Override // N4.g.InterfaceC1203x
        public void e(float f10, float f11) {
            f((byte) 1);
            g(2);
            float[] fArr = this.f7634c;
            int i10 = this.f7635d;
            int i11 = i10 + 1;
            this.f7635d = i11;
            fArr[i10] = f10;
            this.f7635d = i10 + 2;
            fArr[i11] = f11;
        }

        void h(InterfaceC1203x interfaceC1203x) {
            int i10 = 0;
            for (int i11 = 0; i11 < this.f7633b; i11++) {
                byte b10 = this.f7632a[i11];
                if (b10 == 0) {
                    float[] fArr = this.f7634c;
                    int i12 = i10 + 1;
                    float f10 = fArr[i10];
                    i10 += 2;
                    interfaceC1203x.b(f10, fArr[i12]);
                } else if (b10 == 1) {
                    float[] fArr2 = this.f7634c;
                    int i13 = i10 + 1;
                    float f11 = fArr2[i10];
                    i10 += 2;
                    interfaceC1203x.e(f11, fArr2[i13]);
                } else if (b10 == 2) {
                    float[] fArr3 = this.f7634c;
                    interfaceC1203x.c(fArr3[i10], fArr3[i10 + 1], fArr3[i10 + 2], fArr3[i10 + 3], fArr3[i10 + 4], fArr3[i10 + 5]);
                    i10 += 6;
                } else if (b10 == 3) {
                    float[] fArr4 = this.f7634c;
                    float f12 = fArr4[i10];
                    float f13 = fArr4[i10 + 1];
                    int i14 = i10 + 3;
                    float f14 = fArr4[i10 + 2];
                    i10 += 4;
                    interfaceC1203x.a(f12, f13, f14, fArr4[i14]);
                } else if (b10 != 8) {
                    boolean z10 = (b10 & 2) != 0;
                    boolean z11 = (b10 & 1) != 0;
                    float[] fArr5 = this.f7634c;
                    interfaceC1203x.d(fArr5[i10], fArr5[i10 + 1], fArr5[i10 + 2], z10, z11, fArr5[i10 + 3], fArr5[i10 + 4]);
                    i10 += 5;
                } else {
                    interfaceC1203x.close();
                }
            }
        }

        boolean i() {
            return this.f7633b == 0;
        }
    }

    /* JADX INFO: renamed from: N4.g$x, reason: case insensitive filesystem */
    interface InterfaceC1203x {
        void a(float f10, float f11, float f12, float f13);

        void b(float f10, float f11);

        void c(float f10, float f11, float f12, float f13, float f14, float f15);

        void close();

        void d(float f10, float f11, float f12, boolean z10, boolean z11, float f13, float f14);

        void e(float f10, float f11);
    }

    /* JADX INFO: renamed from: N4.g$y, reason: case insensitive filesystem */
    static class C1204y extends R implements InterfaceC1199t {

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        Boolean f7636q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        Boolean f7637r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        Matrix f7638s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        C1195p f7639t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        C1195p f7640u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        C1195p f7641v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        C1195p f7642w;

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        String f7643x;

        C1204y() {
        }

        @Override // N4.g.N
        String o() {
            return "pattern";
        }
    }

    /* JADX INFO: renamed from: N4.g$z, reason: case insensitive filesystem */
    static class C1205z extends AbstractC1191l {

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        float[] f7644o;

        C1205z() {
        }

        @Override // N4.g.N
        String o() {
            return "polyline";
        }
    }

    g() {
    }

    private String c(String str) {
        if (str.startsWith("\"") && str.endsWith("\"")) {
            str = str.substring(1, str.length() - 1).replace("\\\"", "\"");
        } else if (str.startsWith("'") && str.endsWith("'")) {
            str = str.substring(1, str.length() - 1).replace("\\'", "'");
        }
        return str.replace("\\\n", "").replace("\\A", "\n");
    }

    private C1182b e(float f10) {
        d0 d0Var;
        d0 d0Var2;
        d0 d0Var3;
        d0 d0Var4;
        float fC;
        d0 d0Var5;
        F f11 = this.f7422a;
        C1195p c1195p = f11.f7511s;
        C1195p c1195p2 = f11.f7512t;
        if (c1195p == null || c1195p.j() || (d0Var = c1195p.f7611b) == (d0Var2 = d0.percent) || d0Var == (d0Var3 = d0.em) || d0Var == (d0Var4 = d0.ex)) {
            return new C1182b(-1.0f, -1.0f, -1.0f, -1.0f);
        }
        float fC2 = c1195p.c(f10);
        if (c1195p2 == null) {
            C1182b c1182b = this.f7422a.f7543p;
            fC = c1182b != null ? (c1182b.f7559d * fC2) / c1182b.f7558c : fC2;
        } else {
            if (c1195p2.j() || (d0Var5 = c1195p2.f7611b) == d0Var2 || d0Var5 == d0Var3 || d0Var5 == d0Var4) {
                return new C1182b(-1.0f, -1.0f, -1.0f, -1.0f);
            }
            fC = c1195p2.c(f10);
        }
        return new C1182b(0.0f, 0.0f, fC2, fC);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private L i(J j10, String str) {
        L lI;
        L l10 = (L) j10;
        if (str.equals(l10.f7526c)) {
            return l10;
        }
        for (Object obj : j10.b()) {
            if (obj instanceof L) {
                L l11 = (L) obj;
                if (str.equals(l11.f7526c)) {
                    return l11;
                }
                if ((obj instanceof J) && (lI = i((J) obj, str)) != null) {
                    return lI;
                }
            }
        }
        return null;
    }

    static i k() {
        return null;
    }

    public static g l(InputStream inputStream) {
        return new k().z(inputStream, f7421g);
    }

    void A(String str) {
        this.f7423b = str;
    }

    void a(b.r rVar) {
        this.f7426e.b(rVar);
    }

    void b() {
        this.f7426e.e(b.u.RenderOptions);
    }

    List d() {
        return this.f7426e.c();
    }

    public float f() {
        if (this.f7422a != null) {
            return e(this.f7425d).f7559d;
        }
        throw new IllegalArgumentException("SVG document is empty");
    }

    public RectF g() {
        F f10 = this.f7422a;
        if (f10 == null) {
            throw new IllegalArgumentException("SVG document is empty");
        }
        C1182b c1182b = f10.f7543p;
        if (c1182b == null) {
            return null;
        }
        return c1182b.d();
    }

    public float h() {
        if (this.f7422a != null) {
            return e(this.f7425d).f7558c;
        }
        throw new IllegalArgumentException("SVG document is empty");
    }

    L j(String str) {
        if (str == null || str.length() == 0) {
            return null;
        }
        if (str.equals(this.f7422a.f7526c)) {
            return this.f7422a;
        }
        if (this.f7427f.containsKey(str)) {
            return (L) this.f7427f.get(str);
        }
        L lI = i(this.f7422a, str);
        this.f7427f.put(str, lI);
        return lI;
    }

    F m() {
        return this.f7422a;
    }

    boolean n() {
        return !this.f7426e.d();
    }

    public void o(Canvas canvas, f fVar) {
        if (fVar == null) {
            fVar = new f();
        }
        if (!fVar.g()) {
            fVar.h(0.0f, 0.0f, canvas.getWidth(), canvas.getHeight());
        }
        new h(canvas, this.f7425d).G0(this, fVar);
    }

    public Picture p() {
        return r(null);
    }

    public Picture q(int i10, int i11, f fVar) {
        Picture picture = new Picture();
        Canvas canvasBeginRecording = picture.beginRecording(i10, i11);
        if (fVar == null || fVar.f7420f == null) {
            fVar = fVar == null ? new f() : new f(fVar);
            fVar.h(0.0f, 0.0f, i10, i11);
        }
        new h(canvasBeginRecording, this.f7425d).G0(this, fVar);
        picture.endRecording();
        return picture;
    }

    public Picture r(f fVar) {
        C1195p c1195p;
        C1182b c1182b = (fVar == null || !fVar.f()) ? this.f7422a.f7543p : fVar.f7418d;
        if (fVar != null && fVar.g()) {
            return q((int) Math.ceil(fVar.f7420f.b()), (int) Math.ceil(fVar.f7420f.c()), fVar);
        }
        F f10 = this.f7422a;
        C1195p c1195p2 = f10.f7511s;
        if (c1195p2 != null) {
            d0 d0Var = c1195p2.f7611b;
            d0 d0Var2 = d0.percent;
            if (d0Var != d0Var2 && (c1195p = f10.f7512t) != null && c1195p.f7611b != d0Var2) {
                return q((int) Math.ceil(c1195p2.c(this.f7425d)), (int) Math.ceil(this.f7422a.f7512t.c(this.f7425d)), fVar);
            }
        }
        if (c1195p2 != null && c1182b != null) {
            float fC = c1195p2.c(this.f7425d);
            return q((int) Math.ceil(fC), (int) Math.ceil((c1182b.f7559d * fC) / c1182b.f7558c), fVar);
        }
        C1195p c1195p3 = f10.f7512t;
        if (c1195p3 == null || c1182b == null) {
            return q(512, 512, fVar);
        }
        float fC2 = c1195p3.c(this.f7425d);
        return q((int) Math.ceil((c1182b.f7558c * fC2) / c1182b.f7559d), (int) Math.ceil(fC2), fVar);
    }

    N s(String str) {
        if (str == null) {
            return null;
        }
        String strC = c(str);
        if (strC.length() <= 1 || !strC.startsWith("#")) {
            return null;
        }
        return j(strC.substring(1));
    }

    void t(String str) {
        this.f7424c = str;
    }

    public void u(float f10) {
        F f11 = this.f7422a;
        if (f11 == null) {
            throw new IllegalArgumentException("SVG document is empty");
        }
        f11.f7512t = new C1195p(f10);
    }

    public void v(String str) {
        F f10 = this.f7422a;
        if (f10 == null) {
            throw new IllegalArgumentException("SVG document is empty");
        }
        f10.f7512t = k.o0(str);
    }

    public void w(float f10, float f11, float f12, float f13) {
        F f14 = this.f7422a;
        if (f14 == null) {
            throw new IllegalArgumentException("SVG document is empty");
        }
        f14.f7543p = new C1182b(f10, f11, f12, f13);
    }

    public void x(float f10) {
        F f11 = this.f7422a;
        if (f11 == null) {
            throw new IllegalArgumentException("SVG document is empty");
        }
        f11.f7511s = new C1195p(f10);
    }

    public void y(String str) {
        F f10 = this.f7422a;
        if (f10 == null) {
            throw new IllegalArgumentException("SVG document is empty");
        }
        f10.f7511s = k.o0(str);
    }

    void z(F f10) {
        this.f7422a = f10;
    }
}
