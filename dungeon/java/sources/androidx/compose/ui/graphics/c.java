package androidx.compose.ui.graphics;

import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes.dex */
public abstract class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f21453a = new a(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final int f21454b = D(0);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final int f21455c = D(1);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final int f21456d = D(2);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final int f21457e = D(3);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final int f21458f = D(4);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final int f21459g = D(5);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final int f21460h = D(6);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final int f21461i = D(7);

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final int f21462j = D(8);

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static final int f21463k = D(9);

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static final int f21464l = D(10);

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static final int f21465m = D(11);

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final int f21466n = D(12);

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private static final int f21467o = D(13);

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private static final int f21468p = D(14);

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private static final int f21469q = D(15);

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private static final int f21470r = D(16);

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private static final int f21471s = D(17);

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private static final int f21472t = D(18);

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private static final int f21473u = D(19);

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private static final int f21474v = D(20);

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private static final int f21475w = D(21);

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private static final int f21476x = D(22);

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private static final int f21477y = D(23);

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private static final int f21478z = D(24);

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    private static final int f21449A = D(25);

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    private static final int f21450B = D(26);

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    private static final int f21451C = D(27);

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    private static final int f21452D = D(28);

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final int A() {
            return c.f21461i;
        }

        public final int B() {
            return c.f21457e;
        }

        public final int C() {
            return c.f21465m;
        }

        public final int a() {
            return c.f21454b;
        }

        public final int b() {
            return c.f21451C;
        }

        public final int c() {
            return c.f21473u;
        }

        public final int d() {
            return c.f21472t;
        }

        public final int e() {
            return c.f21470r;
        }

        public final int f() {
            return c.f21476x;
        }

        public final int g() {
            return c.f21456d;
        }

        public final int h() {
            return c.f21464l;
        }

        public final int i() {
            return c.f21460h;
        }

        public final int j() {
            return c.f21462j;
        }

        public final int k() {
            return c.f21458f;
        }

        public final int l() {
            return c.f21477y;
        }

        public final int m() {
            return c.f21474v;
        }

        public final int n() {
            return c.f21449A;
        }

        public final int o() {
            return c.f21471s;
        }

        public final int p() {
            return c.f21452D;
        }

        public final int q() {
            return c.f21467o;
        }

        public final int r() {
            return c.f21478z;
        }

        public final int s() {
            return c.f21469q;
        }

        public final int t() {
            return c.f21466n;
        }

        public final int u() {
            return c.f21450B;
        }

        public final int v() {
            return c.f21468p;
        }

        public final int w() {
            return c.f21475w;
        }

        public final int x() {
            return c.f21455c;
        }

        public final int y() {
            return c.f21463k;
        }

        public final int z() {
            return c.f21459g;
        }
    }

    public static int D(int i10) {
        return i10;
    }

    public static final boolean E(int i10, int i11) {
        return i10 == i11;
    }

    public static int F(int i10) {
        return Integer.hashCode(i10);
    }

    public static String G(int i10) {
        if (E(i10, f21454b)) {
            return "Clear";
        }
        if (E(i10, f21455c)) {
            return "Src";
        }
        if (E(i10, f21456d)) {
            return "Dst";
        }
        if (E(i10, f21457e)) {
            return "SrcOver";
        }
        if (E(i10, f21458f)) {
            return "DstOver";
        }
        if (E(i10, f21459g)) {
            return "SrcIn";
        }
        if (E(i10, f21460h)) {
            return "DstIn";
        }
        if (E(i10, f21461i)) {
            return "SrcOut";
        }
        if (E(i10, f21462j)) {
            return "DstOut";
        }
        if (E(i10, f21463k)) {
            return "SrcAtop";
        }
        if (E(i10, f21464l)) {
            return "DstAtop";
        }
        if (E(i10, f21465m)) {
            return "Xor";
        }
        if (E(i10, f21466n)) {
            return "Plus";
        }
        if (E(i10, f21467o)) {
            return "Modulate";
        }
        if (E(i10, f21468p)) {
            return "Screen";
        }
        if (E(i10, f21469q)) {
            return "Overlay";
        }
        if (E(i10, f21470r)) {
            return "Darken";
        }
        if (E(i10, f21471s)) {
            return "Lighten";
        }
        if (E(i10, f21472t)) {
            return "ColorDodge";
        }
        if (E(i10, f21473u)) {
            return "ColorBurn";
        }
        if (E(i10, f21474v)) {
            return "HardLight";
        }
        if (E(i10, f21475w)) {
            return "Softlight";
        }
        if (E(i10, f21476x)) {
            return "Difference";
        }
        if (E(i10, f21477y)) {
            return "Exclusion";
        }
        if (E(i10, f21478z)) {
            return "Multiply";
        }
        if (E(i10, f21449A)) {
            return "Hue";
        }
        if (E(i10, f21450B)) {
            return "Saturation";
        }
        if (E(i10, f21451C)) {
            return "Color";
        }
        return E(i10, f21452D) ? "Luminosity" : "Unknown";
    }
}
