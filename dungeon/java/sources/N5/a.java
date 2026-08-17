package N5;

import kotlin.collections.AbstractC3952n;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class a implements c.b {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final byte[] f7852c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final int f7853d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final byte[] f7854e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final int f7855f;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final byte[] f7858i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final int f7859j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static final byte[] f7860k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static final int f7861l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static final byte[] f7862m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final byte[][] f7863n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private static final byte[] f7864o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private static final byte[] f7865p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private static final int f7866q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private static final byte[] f7867r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private static final byte[] f7868s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private static final byte[] f7869t;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f7870a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final C0134a f7851b = new C0134a(null);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final byte[] f7856g = f.a("GIF87a");

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final byte[] f7857h = f.a("GIF89a");

    /* JADX INFO: renamed from: N5.a$a, reason: collision with other inner class name */
    public static final class C0134a {
        private C0134a() {
        }

        public /* synthetic */ C0134a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private final int k(byte[] bArr) {
            if (bArr.length < 4) {
                return -1;
            }
            return (bArr[3] & 255) | ((bArr[0] & 255) << 24) | ((bArr[1] & 255) << 16) | ((bArr[2] & 255) << 8);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final c l(byte[] bArr, int i10) {
            if (!p078e5.c.h(bArr, 0, i10)) {
                throw new IllegalStateException("Check failed.");
            }
            if (p078e5.c.g(bArr, 0)) {
                return b.f7877g;
            }
            if (p078e5.c.f(bArr, 0)) {
                return b.f7878h;
            }
            if (!p078e5.c.c(bArr, 0, i10)) {
                return c.f7888d;
            }
            if (p078e5.c.b(bArr, 0)) {
                return b.f7881k;
            }
            return p078e5.c.d(bArr, 0) ? b.f7880j : b.f7879i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final boolean m(byte[] bArr, int i10) {
            if (i10 >= 12 && k(bArr) >= 8 && f.b(bArr, a.f7868s, 4)) {
                return f.b(bArr, a.f7869t, 8);
            }
            return false;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final boolean n(byte[] bArr, int i10) {
            return i10 >= 4 && f.c(bArr, a.f7867r);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final boolean o(byte[] bArr, int i10) {
            if (i10 < a.f7858i.length) {
                return false;
            }
            return f.c(bArr, a.f7858i);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final boolean p(byte[] bArr, int i10) {
            if (i10 >= a.f7866q) {
                return f.c(bArr, a.f7864o) || f.c(bArr, a.f7865p);
            }
            return false;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final boolean q(byte[] bArr, int i10) {
            if (i10 < 6) {
                return false;
            }
            return f.c(bArr, a.f7856g) || f.c(bArr, a.f7857h);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final boolean r(byte[] bArr, int i10) {
            if (i10 < 12 || bArr[3] < 8 || !f.b(bArr, a.f7862m, 4)) {
                return false;
            }
            for (byte[] bArr2 : a.f7863n) {
                if (f.b(bArr, bArr2, 8)) {
                    return true;
                }
            }
            return false;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final boolean s(byte[] bArr, int i10) {
            if (i10 < a.f7860k.length) {
                return false;
            }
            return f.c(bArr, a.f7860k);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final boolean t(byte[] bArr, int i10) {
            return i10 >= a.f7852c.length && f.c(bArr, a.f7852c);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final boolean u(byte[] bArr, int i10) {
            return i10 >= a.f7854e.length && f.c(bArr, a.f7854e);
        }
    }

    static {
        byte[] bArr = {-1, -40, -1};
        f7852c = bArr;
        f7853d = bArr.length;
        byte[] bArr2 = {-119, 80, 78, 71, 13, 10, 26, 10};
        f7854e = bArr2;
        f7855f = bArr2.length;
        byte[] bArrA = f.a("BM");
        f7858i = bArrA;
        f7859j = bArrA.length;
        byte[] bArr3 = {0, 0, 1, 0};
        f7860k = bArr3;
        f7861l = bArr3.length;
        f7862m = f.a("ftyp");
        f7863n = new byte[][]{f.a("heic"), f.a("heix"), f.a("hevc"), f.a("hevx"), f.a("mif1"), f.a("msf1")};
        byte[] bArr4 = {73, 73, 42, 0};
        f7864o = bArr4;
        f7865p = new byte[]{77, 77, 0, 42};
        f7866q = bArr4.length;
        f7867r = new byte[]{3, 0, 8, 0};
        f7868s = f.a("ftyp");
        f7869t = f.a("avif");
    }

    public a() {
        Object objR0 = AbstractC3952n.r0(new Integer[]{21, 20, Integer.valueOf(f7853d), Integer.valueOf(f7855f), 6, Integer.valueOf(f7859j), Integer.valueOf(f7861l), 12, 4, 12});
        if (objR0 == null) {
            throw new IllegalStateException("Required value was null.");
        }
        this.f7870a = ((Number) objR0).intValue();
    }

    @Override // N5.c.b
    public c a(byte[] headerBytes, int i10) {
        Intrinsics.checkNotNullParameter(headerBytes, "headerBytes");
        if (p078e5.c.h(headerBytes, 0, i10)) {
            return f7851b.l(headerBytes, i10);
        }
        C0134a c0134a = f7851b;
        if (c0134a.t(headerBytes, i10)) {
            return b.f7872b;
        }
        if (c0134a.u(headerBytes, i10)) {
            return b.f7873c;
        }
        if (c0134a.q(headerBytes, i10)) {
            return b.f7874d;
        }
        if (c0134a.o(headerBytes, i10)) {
            return b.f7875e;
        }
        if (c0134a.s(headerBytes, i10)) {
            return b.f7876f;
        }
        if (c0134a.m(headerBytes, i10)) {
            return b.f7885o;
        }
        if (c0134a.r(headerBytes, i10)) {
            return b.f7882l;
        }
        if (c0134a.n(headerBytes, i10)) {
            return b.f7884n;
        }
        return c0134a.p(headerBytes, i10) ? b.f7883m : c.f7888d;
    }

    @Override // N5.c.b
    public int b() {
        return this.f7870a;
    }
}
