package T2;

import S2.k;
import S2.p;
import S2.q;
import U1.AbstractC1459a;
import U1.AbstractC1477t;
import U1.F;
import android.text.Layout;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import android.text.style.StyleSpan;
import android.text.style.UnderlineSpan;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class a extends e {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final int f12012i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final int f12013j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final int f12014k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final long f12015l;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private List f12018o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private List f12019p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private int f12020q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private int f12021r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private boolean f12022s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private boolean f12023t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private byte f12024u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private byte f12025v;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private boolean f12027x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private long f12028y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private static final int[] f12010z = {11, 1, 3, 12, 14, 5, 7, 9};

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    private static final int[] f12003A = {0, 4, 8, 12, 16, 20, 24, 28};

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    private static final int[] f12004B = {-1, -16711936, -16776961, -16711681, -65536, -256, -65281};

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    private static final int[] f12005C = {32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 225, 43, 44, 45, 46, 47, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 58, 59, 60, 61, 62, 63, 64, 65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 91, 233, 93, 237, 243, 250, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 121, 122, 231, 247, 209, 241, 9632};

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    private static final int[] f12006D = {174, 176, 189, 191, 8482, 162, 163, 9834, 224, 32, 232, 226, 234, 238, 244, 251};

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    private static final int[] f12007E = {193, 201, 211, 218, 220, 252, 8216, 161, 42, 39, 8212, 169, 8480, 8226, 8220, 8221, 192, 194, 199, 200, 202, 203, 235, 206, 207, 239, 212, 217, 249, 219, 171, 187};

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    private static final int[] f12008F = {195, 227, 205, 204, 236, 210, 242, 213, 245, 123, 125, 92, 94, 95, 124, 126, 196, 228, 214, 246, 223, 165, 164, 9474, 197, 229, 216, 248, 9484, 9488, 9492, 9496};

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    private static final boolean[] f12009G = {false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false};

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final F f12011h = new F();

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final ArrayList f12016m = new ArrayList();

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private C0175a f12017n = new C0175a(0, 4);

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private int f12026w = 0;

    /* JADX INFO: renamed from: T2.a$a, reason: collision with other inner class name */
    private static final class C0175a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final List f12029a = new ArrayList();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final List f12030b = new ArrayList();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final StringBuilder f12031c = new StringBuilder();

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private int f12032d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private int f12033e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private int f12034f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private int f12035g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private int f12036h;

        /* JADX INFO: renamed from: T2.a$a$a, reason: collision with other inner class name */
        private static class C0176a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final int f12037a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final boolean f12038b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public int f12039c;

            public C0176a(int i10, boolean z10, int i11) {
                this.f12037a = i10;
                this.f12038b = z10;
                this.f12039c = i11;
            }
        }

        public C0175a(int i10, int i11) {
            j(i10);
            this.f12036h = i11;
        }

        private SpannableString h() {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(this.f12031c);
            int length = spannableStringBuilder.length();
            int i10 = -1;
            int i11 = -1;
            int i12 = -1;
            int i13 = -1;
            int i14 = 0;
            int i15 = 0;
            boolean z10 = false;
            while (i14 < this.f12029a.size()) {
                C0176a c0176a = (C0176a) this.f12029a.get(i14);
                boolean z11 = c0176a.f12038b;
                int i16 = c0176a.f12037a;
                if (i16 != 8) {
                    boolean z12 = i16 == 7;
                    if (i16 != 7) {
                        i13 = a.f12004B[i16];
                    }
                    z10 = z12;
                }
                int i17 = c0176a.f12039c;
                i14++;
                if (i17 != (i14 < this.f12029a.size() ? ((C0176a) this.f12029a.get(i14)).f12039c : length)) {
                    if (i10 != -1 && !z11) {
                        q(spannableStringBuilder, i10, i17);
                        i10 = -1;
                    } else if (i10 == -1 && z11) {
                        i10 = i17;
                    }
                    if (i11 != -1 && !z10) {
                        o(spannableStringBuilder, i11, i17);
                        i11 = -1;
                    } else if (i11 == -1 && z10) {
                        i11 = i17;
                    }
                    if (i13 != i12) {
                        n(spannableStringBuilder, i15, i17, i12);
                        i12 = i13;
                        i15 = i17;
                    }
                }
            }
            if (i10 != -1 && i10 != length) {
                q(spannableStringBuilder, i10, length);
            }
            if (i11 != -1 && i11 != length) {
                o(spannableStringBuilder, i11, length);
            }
            if (i15 != length) {
                n(spannableStringBuilder, i15, length, i12);
            }
            return new SpannableString(spannableStringBuilder);
        }

        private static void n(SpannableStringBuilder spannableStringBuilder, int i10, int i11, int i12) {
            if (i12 == -1) {
                return;
            }
            spannableStringBuilder.setSpan(new ForegroundColorSpan(i12), i10, i11, 33);
        }

        private static void o(SpannableStringBuilder spannableStringBuilder, int i10, int i11) {
            spannableStringBuilder.setSpan(new StyleSpan(2), i10, i11, 33);
        }

        private static void q(SpannableStringBuilder spannableStringBuilder, int i10, int i11) {
            spannableStringBuilder.setSpan(new UnderlineSpan(), i10, i11, 33);
        }

        public void e(char c10) {
            if (this.f12031c.length() < 32) {
                this.f12031c.append(c10);
            }
        }

        public void f() {
            int length = this.f12031c.length();
            if (length > 0) {
                this.f12031c.delete(length - 1, length);
                for (int size = this.f12029a.size() - 1; size >= 0; size--) {
                    C0176a c0176a = (C0176a) this.f12029a.get(size);
                    int i10 = c0176a.f12039c;
                    if (i10 != length) {
                        return;
                    }
                    c0176a.f12039c = i10 - 1;
                }
            }
        }

        public T1.a g(int i10) {
            float f10;
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            for (int i11 = 0; i11 < this.f12030b.size(); i11++) {
                spannableStringBuilder.append((CharSequence) this.f12030b.get(i11));
                spannableStringBuilder.append('\n');
            }
            spannableStringBuilder.append((CharSequence) h());
            if (spannableStringBuilder.length() == 0) {
                return null;
            }
            int i12 = this.f12033e + this.f12034f;
            int length = (32 - i12) - spannableStringBuilder.length();
            int i13 = i12 - length;
            if (i10 == Integer.MIN_VALUE) {
                i10 = (this.f12035g != 2 || (Math.abs(i13) >= 3 && length >= 0)) ? (this.f12035g != 2 || i13 <= 0) ? 0 : 2 : 1;
            }
            if (i10 != 1) {
                if (i10 == 2) {
                    i12 = 32 - length;
                }
                f10 = ((i12 / 32.0f) * 0.8f) + 0.1f;
            } else {
                f10 = 0.5f;
            }
            int i14 = this.f12032d;
            if (i14 > 7) {
                i14 -= 17;
            } else if (this.f12035g == 1) {
                i14 -= this.f12036h - 1;
            }
            return new T1.a.b().o(spannableStringBuilder).p(Layout.Alignment.ALIGN_NORMAL).h(i14, 1).k(f10).l(i10).a();
        }

        public boolean i() {
            return this.f12029a.isEmpty() && this.f12030b.isEmpty() && this.f12031c.length() == 0;
        }

        public void j(int i10) {
            this.f12035g = i10;
            this.f12029a.clear();
            this.f12030b.clear();
            this.f12031c.setLength(0);
            this.f12032d = 15;
            this.f12033e = 0;
            this.f12034f = 0;
        }

        public void k() {
            this.f12030b.add(h());
            this.f12031c.setLength(0);
            this.f12029a.clear();
            int iMin = Math.min(this.f12036h, this.f12032d);
            while (this.f12030b.size() >= iMin) {
                this.f12030b.remove(0);
            }
        }

        public void l(int i10) {
            this.f12035g = i10;
        }

        public void m(int i10) {
            this.f12036h = i10;
        }

        public void p(int i10, boolean z10) {
            this.f12029a.add(new C0176a(i10, z10, this.f12031c.length()));
        }
    }

    public a(String str, int i10, long j10) {
        if (j10 != -9223372036854775807L) {
            AbstractC1459a.a(j10 >= 16000);
            this.f12015l = j10 * 1000;
        } else {
            this.f12015l = -9223372036854775807L;
        }
        this.f12012i = "application/x-mp4-cea-608".equals(str) ? 2 : 3;
        if (i10 == 1) {
            this.f12014k = 0;
            this.f12013j = 0;
        } else if (i10 == 2) {
            this.f12014k = 1;
            this.f12013j = 0;
        } else if (i10 == 3) {
            this.f12014k = 0;
            this.f12013j = 1;
        } else if (i10 != 4) {
            AbstractC1477t.h("Cea608Decoder", "Invalid channel. Defaulting to CC1.");
            this.f12014k = 0;
            this.f12013j = 0;
        } else {
            this.f12014k = 1;
            this.f12013j = 1;
        }
        O(0);
        N();
        this.f12027x = true;
        this.f12028y = -9223372036854775807L;
    }

    private void A(byte b10, byte b11) {
        int i10 = f12010z[b10 & 7];
        if ((b11 & 32) != 0) {
            i10++;
        }
        if (i10 != this.f12017n.f12032d) {
            if (this.f12020q != 1 && !this.f12017n.i()) {
                C0175a c0175a = new C0175a(this.f12020q, this.f12021r);
                this.f12017n = c0175a;
                this.f12016m.add(c0175a);
            }
            this.f12017n.f12032d = i10;
        }
        boolean z10 = (b11 & 16) == 16;
        boolean z11 = (b11 & 1) == 1;
        int i11 = (b11 >> 1) & 7;
        this.f12017n.p(z10 ? 8 : i11, z11);
        if (z10) {
            this.f12017n.f12033e = f12003A[i11];
        }
    }

    private static boolean B(byte b10) {
        return (b10 & 224) == 0;
    }

    private static boolean C(byte b10, byte b11) {
        return (b10 & 246) == 18 && (b11 & 224) == 32;
    }

    private static boolean D(byte b10, byte b11) {
        return (b10 & 247) == 17 && (b11 & 240) == 32;
    }

    private static boolean E(byte b10, byte b11) {
        return (b10 & 246) == 20 && (b11 & 240) == 32;
    }

    private static boolean F(byte b10, byte b11) {
        return (b10 & 240) == 16 && (b11 & 192) == 64;
    }

    private static boolean G(byte b10) {
        return (b10 & 240) == 16;
    }

    private boolean H(boolean z10, byte b10, byte b11) {
        if (!z10 || !G(b10)) {
            this.f12023t = false;
        } else {
            if (this.f12023t && this.f12024u == b10 && this.f12025v == b11) {
                this.f12023t = false;
                return true;
            }
            this.f12023t = true;
            this.f12024u = b10;
            this.f12025v = b11;
        }
        return false;
    }

    private static boolean I(byte b10) {
        return (b10 & 246) == 20;
    }

    private static boolean J(byte b10, byte b11) {
        return (b10 & 247) == 17 && (b11 & 240) == 48;
    }

    private static boolean K(byte b10, byte b11) {
        return (b10 & 247) == 23 && b11 >= 33 && b11 <= 35;
    }

    private static boolean L(byte b10) {
        return 1 <= b10 && b10 <= 15;
    }

    private void M(byte b10, byte b11) {
        if (L(b10)) {
            this.f12027x = false;
            return;
        }
        if (I(b10)) {
            if (b11 != 32 && b11 != 47) {
                switch (b11) {
                    case 37:
                    case 38:
                    case 39:
                        break;
                    default:
                        switch (b11) {
                            case 42:
                            case 43:
                                this.f12027x = false;
                                break;
                        }
                        return;
                }
            }
            this.f12027x = true;
        }
    }

    private void N() {
        this.f12017n.j(this.f12020q);
        this.f12016m.clear();
        this.f12016m.add(this.f12017n);
    }

    private void O(int i10) {
        int i11 = this.f12020q;
        if (i11 == i10) {
            return;
        }
        this.f12020q = i10;
        if (i10 == 3) {
            for (int i12 = 0; i12 < this.f12016m.size(); i12++) {
                ((C0175a) this.f12016m.get(i12)).l(i10);
            }
            return;
        }
        N();
        if (i11 == 3 || i10 == 1 || i10 == 0) {
            this.f12018o = Collections.EMPTY_LIST;
        }
    }

    private void P(int i10) {
        this.f12021r = i10;
        this.f12017n.m(i10);
    }

    private boolean Q() {
        return (this.f12015l == -9223372036854775807L || this.f12028y == -9223372036854775807L || l() - this.f12028y < this.f12015l) ? false : true;
    }

    private boolean R(byte b10) {
        if (B(b10)) {
            this.f12026w = s(b10);
        }
        return this.f12026w == this.f12014k;
    }

    private static char r(byte b10) {
        return (char) f12005C[(b10 & 127) - 32];
    }

    private static int s(byte b10) {
        return (b10 >> 3) & 1;
    }

    private List t() {
        int size = this.f12016m.size();
        ArrayList arrayList = new ArrayList(size);
        int iMin = 2;
        for (int i10 = 0; i10 < size; i10++) {
            T1.a aVarG = ((C0175a) this.f12016m.get(i10)).g(Integer.MIN_VALUE);
            arrayList.add(aVarG);
            if (aVarG != null) {
                iMin = Math.min(iMin, aVarG.f11952i);
            }
        }
        ArrayList arrayList2 = new ArrayList(size);
        for (int i11 = 0; i11 < size; i11++) {
            T1.a aVar = (T1.a) arrayList.get(i11);
            if (aVar != null) {
                if (aVar.f11952i != iMin) {
                    aVar = (T1.a) AbstractC1459a.e(((C0175a) this.f12016m.get(i11)).g(iMin));
                }
                arrayList2.add(aVar);
            }
        }
        return arrayList2;
    }

    private static char u(byte b10) {
        return (char) f12007E[b10 & 31];
    }

    private static char v(byte b10) {
        return (char) f12008F[b10 & 31];
    }

    private static char w(byte b10, byte b11) {
        return (b10 & 1) == 0 ? u(b11) : v(b11);
    }

    private static char x(byte b10) {
        return (char) f12006D[b10 & 15];
    }

    private void y(byte b10) {
        this.f12017n.e(' ');
        this.f12017n.p((b10 >> 1) & 7, (b10 & 1) == 1);
    }

    private void z(byte b10) {
        if (b10 == 32) {
            O(2);
            return;
        }
        if (b10 == 41) {
            O(3);
            return;
        }
        switch (b10) {
            case 37:
                O(1);
                P(2);
                break;
            case 38:
                O(1);
                P(3);
                break;
            case 39:
                O(1);
                P(4);
                break;
            default:
                int i10 = this.f12020q;
                if (i10 != 0) {
                    if (b10 != 33) {
                        switch (b10) {
                            case 44:
                                this.f12018o = Collections.EMPTY_LIST;
                                if (i10 == 1 || i10 == 3) {
                                    N();
                                }
                                break;
                            case 45:
                                if (i10 == 1 && !this.f12017n.i()) {
                                    this.f12017n.k();
                                    break;
                                }
                                break;
                            case 46:
                                N();
                                break;
                            case 47:
                                this.f12018o = t();
                                N();
                                break;
                        }
                    } else {
                        this.f12017n.f();
                        break;
                    }
                }
                break;
        }
    }

    @Override // T2.e, S2.l
    public /* bridge */ /* synthetic */ void b(long j10) {
        super.b(j10);
    }

    @Override // T2.e, Y1.d
    public void flush() {
        super.flush();
        this.f12018o = null;
        this.f12019p = null;
        O(0);
        P(4);
        N();
        this.f12022s = false;
        this.f12023t = false;
        this.f12024u = (byte) 0;
        this.f12025v = (byte) 0;
        this.f12026w = 0;
        this.f12027x = true;
        this.f12028y = -9223372036854775807L;
    }

    @Override // T2.e
    protected k g() {
        List list = this.f12018o;
        this.f12019p = list;
        return new f((List) AbstractC1459a.e(list));
    }

    /* JADX WARN: Code duplicated, block: B:26:0x0063  */
    @Override // T2.e
    protected void h(p pVar) {
        boolean z10;
        ByteBuffer byteBuffer = (ByteBuffer) AbstractC1459a.e(pVar.f16811d);
        this.f12011h.Y(byteBuffer.array(), byteBuffer.limit());
        boolean z11 = false;
        while (true) {
            int iA = this.f12011h.a();
            int i10 = this.f12012i;
            if (iA < i10) {
                break;
            }
            int iL = i10 == 2 ? -4 : this.f12011h.L();
            int iL2 = this.f12011h.L();
            int iL3 = this.f12011h.L();
            if ((iL & 2) == 0 && (iL & 1) == this.f12013j) {
                byte b10 = (byte) (iL2 & 127);
                byte b11 = (byte) (iL3 & 127);
                if (b10 != 0 || b11 != 0) {
                    boolean z12 = this.f12022s;
                    if ((iL & 4) == 4) {
                        boolean[] zArr = f12009G;
                        if (zArr[iL2] && zArr[iL3]) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                    } else {
                        z10 = false;
                    }
                    this.f12022s = z10;
                    if (!H(z10, b10, b11)) {
                        if (this.f12022s) {
                            M(b10, b11);
                            if (this.f12027x && R(b10)) {
                                if (!B(b10)) {
                                    this.f12017n.e(r(b10));
                                    if ((b11 & 224) != 0) {
                                        this.f12017n.e(r(b11));
                                    }
                                } else if (J(b10, b11)) {
                                    this.f12017n.e(x(b11));
                                } else if (C(b10, b11)) {
                                    this.f12017n.f();
                                    this.f12017n.e(w(b10, b11));
                                } else if (D(b10, b11)) {
                                    y(b11);
                                } else if (F(b10, b11)) {
                                    A(b10, b11);
                                } else if (K(b10, b11)) {
                                    this.f12017n.f12034f = b11 - 32;
                                } else if (E(b10, b11)) {
                                    z(b11);
                                }
                                z11 = true;
                            }
                        } else if (z12) {
                            N();
                            z11 = true;
                        }
                    }
                }
            }
        }
        if (z11) {
            int i11 = this.f12020q;
            if (i11 == 1 || i11 == 3) {
                this.f12018o = t();
                this.f12028y = l();
            }
        }
    }

    @Override // T2.e
    /* JADX INFO: renamed from: i */
    public /* bridge */ /* synthetic */ p f() {
        return super.f();
    }

    @Override // T2.e, Y1.d
    /* JADX INFO: renamed from: j */
    public q a() {
        q qVarK;
        q qVarA = super.a();
        if (qVarA != null) {
            return qVarA;
        }
        if (!Q() || (qVarK = k()) == null) {
            return null;
        }
        this.f12018o = Collections.EMPTY_LIST;
        this.f12028y = -9223372036854775807L;
        qVarK.A(l(), g(), Long.MAX_VALUE);
        return qVarK;
    }

    @Override // T2.e
    protected boolean m() {
        return this.f12018o != this.f12019p;
    }

    @Override // T2.e
    /* JADX INFO: renamed from: n */
    public /* bridge */ /* synthetic */ void d(p pVar) {
        super.d(pVar);
    }

    @Override // T2.e, Y1.d
    public void release() {
    }
}
