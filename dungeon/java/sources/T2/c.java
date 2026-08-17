package T2;

import S2.k;
import S2.p;
import S2.q;
import U1.AbstractC1459a;
import U1.AbstractC1467i;
import U1.AbstractC1477t;
import U1.E;
import U1.F;
import android.graphics.Color;
import android.text.Layout;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.style.BackgroundColorSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.StyleSpan;
import android.text.style.UnderlineSpan;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class c extends e {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final F f12040h = new F();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final E f12041i = new E();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private int f12042j = -1;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final boolean f12043k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final int f12044l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final b[] f12045m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private b f12046n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private List f12047o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private List f12048p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private C0177c f12049q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private int f12050r;

    /* JADX INFO: Access modifiers changed from: private */
    static final class a {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private static final Comparator f12051c = new T2.b();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final T1.a f12052a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f12053b;

        public a(CharSequence charSequence, Layout.Alignment alignment, float f10, int i10, int i11, float f11, int i12, float f12, boolean z10, int i13, int i14) {
            T1.a.b bVarN = new T1.a.b().o(charSequence).p(alignment).h(f10, i10).i(i11).k(f11).l(i12).n(f12);
            if (z10) {
                bVarN.s(i13);
            }
            this.f12052a = bVarN.a();
            this.f12053b = i14;
        }
    }

    private static final class b {

        /* JADX INFO: renamed from: A, reason: collision with root package name */
        private static final int[] f12054A;

        /* JADX INFO: renamed from: B, reason: collision with root package name */
        private static final boolean[] f12055B;

        /* JADX INFO: renamed from: C, reason: collision with root package name */
        private static final int[] f12056C;

        /* JADX INFO: renamed from: D, reason: collision with root package name */
        private static final int[] f12057D;

        /* JADX INFO: renamed from: E, reason: collision with root package name */
        private static final int[] f12058E;

        /* JADX INFO: renamed from: F, reason: collision with root package name */
        private static final int[] f12059F;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public static final int f12060v = h(2, 2, 2, 0);

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        public static final int f12061w;

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        public static final int f12062x;

        /* JADX INFO: renamed from: y, reason: collision with root package name */
        private static final int[] f12063y;

        /* JADX INFO: renamed from: z, reason: collision with root package name */
        private static final int[] f12064z;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final List f12065a = new ArrayList();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final SpannableStringBuilder f12066b = new SpannableStringBuilder();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private boolean f12067c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private boolean f12068d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private int f12069e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private boolean f12070f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private int f12071g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private int f12072h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private int f12073i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private int f12074j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        private int f12075k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        private int f12076l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        private int f12077m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private int f12078n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        private int f12079o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        private int f12080p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        private int f12081q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        private int f12082r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        private int f12083s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        private int f12084t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        private int f12085u;

        static {
            int iH = h(0, 0, 0, 0);
            f12061w = iH;
            int iH2 = h(0, 0, 0, 3);
            f12062x = iH2;
            f12063y = new int[]{0, 0, 0, 0, 0, 2, 0};
            f12064z = new int[]{0, 0, 0, 0, 0, 0, 2};
            f12054A = new int[]{3, 3, 3, 3, 3, 3, 1};
            f12055B = new boolean[]{false, false, false, true, true, true, false};
            f12056C = new int[]{iH, iH2, iH, iH, iH2, iH, iH};
            f12057D = new int[]{0, 1, 2, 3, 4, 3, 4};
            f12058E = new int[]{0, 0, 0, 0, 0, 3, 3};
            f12059F = new int[]{iH, iH, iH, iH, iH, iH2, iH2};
        }

        public b() {
            l();
        }

        public static int g(int i10, int i11, int i12) {
            return h(i10, i11, i12, 0);
        }

        /* JADX WARN: Code duplicated, block: B:9:0x001b  */
        public static int h(int i10, int i11, int i12, int i13) {
            int i14;
            AbstractC1459a.c(i10, 0, 4);
            AbstractC1459a.c(i11, 0, 4);
            AbstractC1459a.c(i12, 0, 4);
            AbstractC1459a.c(i13, 0, 4);
            if (i13 == 0 || i13 == 1) {
                i14 = 255;
            } else if (i13 == 2) {
                i14 = 127;
            } else if (i13 != 3) {
                i14 = 255;
            } else {
                i14 = 0;
            }
            return Color.argb(i14, i10 > 1 ? 255 : 0, i11 > 1 ? 255 : 0, i12 > 1 ? 255 : 0);
        }

        public void a(char c10) {
            if (c10 != '\n') {
                this.f12066b.append(c10);
                return;
            }
            this.f12065a.add(d());
            this.f12066b.clear();
            if (this.f12079o != -1) {
                this.f12079o = 0;
            }
            if (this.f12080p != -1) {
                this.f12080p = 0;
            }
            if (this.f12081q != -1) {
                this.f12081q = 0;
            }
            if (this.f12083s != -1) {
                this.f12083s = 0;
            }
            while (true) {
                if (this.f12065a.size() < this.f12074j && this.f12065a.size() < 15) {
                    this.f12085u = this.f12065a.size();
                    return;
                }
                this.f12065a.remove(0);
            }
        }

        public void b() {
            int length = this.f12066b.length();
            if (length > 0) {
                this.f12066b.delete(length - 1, length);
            }
        }

        public a c() {
            Layout.Alignment alignment;
            float f10;
            float f11;
            if (j()) {
                return null;
            }
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            for (int i10 = 0; i10 < this.f12065a.size(); i10++) {
                spannableStringBuilder.append((CharSequence) this.f12065a.get(i10));
                spannableStringBuilder.append('\n');
            }
            spannableStringBuilder.append((CharSequence) d());
            int i11 = this.f12075k;
            int i12 = 2;
            if (i11 == 0) {
                alignment = Layout.Alignment.ALIGN_NORMAL;
            } else if (i11 == 1) {
                alignment = Layout.Alignment.ALIGN_OPPOSITE;
            } else if (i11 != 2) {
                if (i11 != 3) {
                    throw new IllegalArgumentException("Unexpected justification value: " + this.f12075k);
                }
                alignment = Layout.Alignment.ALIGN_NORMAL;
            } else {
                alignment = Layout.Alignment.ALIGN_CENTER;
            }
            if (this.f12070f) {
                f10 = this.f12072h / 99.0f;
                f11 = this.f12071g / 99.0f;
            } else {
                f10 = this.f12072h / 209.0f;
                f11 = this.f12071g / 74.0f;
            }
            float f12 = (f10 * 0.9f) + 0.05f;
            float f13 = (f11 * 0.9f) + 0.05f;
            int i13 = this.f12073i;
            int i14 = i13 / 3 == 0 ? 0 : i13 / 3 == 1 ? 1 : 2;
            if (i13 % 3 == 0) {
                i12 = 0;
            } else if (i13 % 3 == 1) {
                i12 = 1;
            }
            return new a(spannableStringBuilder, alignment, f13, 0, i14, f12, i12, -3.4028235E38f, this.f12078n != f12061w, this.f12078n, this.f12069e);
        }

        public SpannableString d() {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(this.f12066b);
            int length = spannableStringBuilder.length();
            if (length > 0) {
                if (this.f12079o != -1) {
                    spannableStringBuilder.setSpan(new StyleSpan(2), this.f12079o, length, 33);
                }
                if (this.f12080p != -1) {
                    spannableStringBuilder.setSpan(new UnderlineSpan(), this.f12080p, length, 33);
                }
                if (this.f12081q != -1) {
                    spannableStringBuilder.setSpan(new ForegroundColorSpan(this.f12082r), this.f12081q, length, 33);
                }
                if (this.f12083s != -1) {
                    spannableStringBuilder.setSpan(new BackgroundColorSpan(this.f12084t), this.f12083s, length, 33);
                }
            }
            return new SpannableString(spannableStringBuilder);
        }

        public void e() {
            this.f12065a.clear();
            this.f12066b.clear();
            this.f12079o = -1;
            this.f12080p = -1;
            this.f12081q = -1;
            this.f12083s = -1;
            this.f12085u = 0;
        }

        public void f(boolean z10, int i10, boolean z11, int i11, int i12, int i13, int i14, int i15, int i16) {
            this.f12067c = true;
            this.f12068d = z10;
            this.f12069e = i10;
            this.f12070f = z11;
            this.f12071g = i11;
            this.f12072h = i12;
            this.f12073i = i14;
            int i17 = i13 + 1;
            if (this.f12074j != i17) {
                this.f12074j = i17;
                while (true) {
                    if (this.f12065a.size() < this.f12074j && this.f12065a.size() < 15) {
                        break;
                    } else {
                        this.f12065a.remove(0);
                    }
                }
            }
            if (i15 != 0 && this.f12076l != i15) {
                this.f12076l = i15;
                int i18 = i15 - 1;
                q(f12056C[i18], f12062x, f12055B[i18], 0, f12064z[i18], f12054A[i18], f12063y[i18]);
            }
            if (i16 == 0 || this.f12077m == i16) {
                return;
            }
            this.f12077m = i16;
            int i19 = i16 - 1;
            m(0, 1, 1, false, false, f12058E[i19], f12057D[i19]);
            n(f12060v, f12059F[i19], f12061w);
        }

        public boolean i() {
            return this.f12067c;
        }

        public boolean j() {
            if (i()) {
                return this.f12065a.isEmpty() && this.f12066b.length() == 0;
            }
            return true;
        }

        public boolean k() {
            return this.f12068d;
        }

        public void l() {
            e();
            this.f12067c = false;
            this.f12068d = false;
            this.f12069e = 4;
            this.f12070f = false;
            this.f12071g = 0;
            this.f12072h = 0;
            this.f12073i = 0;
            this.f12074j = 15;
            this.f12075k = 0;
            this.f12076l = 0;
            this.f12077m = 0;
            int i10 = f12061w;
            this.f12078n = i10;
            this.f12082r = f12060v;
            this.f12084t = i10;
        }

        public void m(int i10, int i11, int i12, boolean z10, boolean z11, int i13, int i14) {
            if (this.f12079o != -1) {
                if (!z10) {
                    this.f12066b.setSpan(new StyleSpan(2), this.f12079o, this.f12066b.length(), 33);
                    this.f12079o = -1;
                }
            } else if (z10) {
                this.f12079o = this.f12066b.length();
            }
            if (this.f12080p == -1) {
                if (z11) {
                    this.f12080p = this.f12066b.length();
                }
            } else {
                if (z11) {
                    return;
                }
                this.f12066b.setSpan(new UnderlineSpan(), this.f12080p, this.f12066b.length(), 33);
                this.f12080p = -1;
            }
        }

        public void n(int i10, int i11, int i12) {
            if (this.f12081q != -1 && this.f12082r != i10) {
                this.f12066b.setSpan(new ForegroundColorSpan(this.f12082r), this.f12081q, this.f12066b.length(), 33);
            }
            if (i10 != f12060v) {
                this.f12081q = this.f12066b.length();
                this.f12082r = i10;
            }
            if (this.f12083s != -1 && this.f12084t != i11) {
                this.f12066b.setSpan(new BackgroundColorSpan(this.f12084t), this.f12083s, this.f12066b.length(), 33);
            }
            if (i11 != f12061w) {
                this.f12083s = this.f12066b.length();
                this.f12084t = i11;
            }
        }

        public void o(int i10, int i11) {
            if (this.f12085u != i10) {
                a('\n');
            }
            this.f12085u = i10;
        }

        public void p(boolean z10) {
            this.f12068d = z10;
        }

        public void q(int i10, int i11, boolean z10, int i12, int i13, int i14, int i15) {
            this.f12078n = i10;
            this.f12075k = i15;
        }
    }

    /* JADX INFO: renamed from: T2.c$c, reason: collision with other inner class name */
    private static final class C0177c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f12086a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f12087b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final byte[] f12088c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        int f12089d = 0;

        public C0177c(int i10, int i11) {
            this.f12086a = i10;
            this.f12087b = i11;
            this.f12088c = new byte[(i11 * 2) - 1];
        }
    }

    public c(int i10, List list) {
        this.f12044l = i10 == -1 ? 1 : i10;
        this.f12043k = list != null && AbstractC1467i.C(list);
        this.f12045m = new b[8];
        for (int i11 = 0; i11 < 8; i11++) {
            this.f12045m[i11] = new b();
        }
        this.f12046n = this.f12045m[0];
    }

    private void A(int i10) {
        if (i10 == 160) {
            this.f12046n.a((char) 13252);
            return;
        }
        AbstractC1477t.h("Cea708Decoder", "Invalid G3 character: " + i10);
        this.f12046n.a('_');
    }

    private void B() {
        this.f12046n.m(this.f12041i.h(4), this.f12041i.h(2), this.f12041i.h(2), this.f12041i.g(), this.f12041i.g(), this.f12041i.h(3), this.f12041i.h(3));
    }

    private void C() {
        int iH = b.h(this.f12041i.h(2), this.f12041i.h(2), this.f12041i.h(2), this.f12041i.h(2));
        int iH2 = b.h(this.f12041i.h(2), this.f12041i.h(2), this.f12041i.h(2), this.f12041i.h(2));
        this.f12041i.r(2);
        this.f12046n.n(iH, iH2, b.g(this.f12041i.h(2), this.f12041i.h(2), this.f12041i.h(2)));
    }

    private void D() {
        this.f12041i.r(4);
        int iH = this.f12041i.h(4);
        this.f12041i.r(2);
        this.f12046n.o(iH, this.f12041i.h(6));
    }

    private void E() {
        int iH = b.h(this.f12041i.h(2), this.f12041i.h(2), this.f12041i.h(2), this.f12041i.h(2));
        int iH2 = this.f12041i.h(2);
        int iG = b.g(this.f12041i.h(2), this.f12041i.h(2), this.f12041i.h(2));
        if (this.f12041i.g()) {
            iH2 |= 4;
        }
        boolean zG = this.f12041i.g();
        int iH3 = this.f12041i.h(2);
        int iH4 = this.f12041i.h(2);
        int iH5 = this.f12041i.h(2);
        this.f12041i.r(8);
        this.f12046n.q(iH, iG, zG, iH2, iH3, iH4, iH5);
    }

    private void F() {
        C0177c c0177c = this.f12049q;
        if (c0177c.f12089d != (c0177c.f12087b * 2) - 1) {
            AbstractC1477t.b("Cea708Decoder", "DtvCcPacket ended prematurely; size is " + ((this.f12049q.f12087b * 2) - 1) + ", but current index is " + this.f12049q.f12089d + " (sequence number " + this.f12049q.f12086a + ");");
        }
        E e10 = this.f12041i;
        C0177c c0177c2 = this.f12049q;
        e10.o(c0177c2.f12088c, c0177c2.f12089d);
        boolean z10 = false;
        while (this.f12041i.b() > 0) {
            int iH = this.f12041i.h(3);
            int iH2 = this.f12041i.h(5);
            if (iH == 7) {
                this.f12041i.r(2);
                iH = this.f12041i.h(6);
                if (iH < 7) {
                    AbstractC1477t.h("Cea708Decoder", "Invalid extended service number: " + iH);
                }
            }
            if (iH2 == 0) {
                if (iH == 0) {
                    break;
                }
                AbstractC1477t.h("Cea708Decoder", "serviceNumber is non-zero (" + iH + ") when blockSize is 0");
                break;
            }
            if (iH != this.f12044l) {
                this.f12041i.s(iH2);
            } else {
                int iE = this.f12041i.e() + (iH2 * 8);
                while (this.f12041i.e() < iE) {
                    int iH3 = this.f12041i.h(8);
                    if (iH3 == 16) {
                        int iH4 = this.f12041i.h(8);
                        if (iH4 <= 31) {
                            u(iH4);
                        } else {
                            if (iH4 <= 127) {
                                z(iH4);
                            } else if (iH4 <= 159) {
                                v(iH4);
                            } else if (iH4 <= 255) {
                                A(iH4);
                            } else {
                                AbstractC1477t.h("Cea708Decoder", "Invalid extended command: " + iH4);
                            }
                            z10 = true;
                        }
                    } else if (iH3 <= 31) {
                        s(iH3);
                    } else {
                        if (iH3 <= 127) {
                            x(iH3);
                        } else if (iH3 <= 159) {
                            t(iH3);
                        } else if (iH3 <= 255) {
                            y(iH3);
                        } else {
                            AbstractC1477t.h("Cea708Decoder", "Invalid base command: " + iH3);
                        }
                        z10 = true;
                    }
                }
            }
        }
        if (z10) {
            this.f12047o = r();
        }
    }

    private void G() {
        for (int i10 = 0; i10 < 8; i10++) {
            this.f12045m[i10].l();
        }
    }

    private void q() {
        if (this.f12049q == null) {
            return;
        }
        F();
        this.f12049q = null;
    }

    private List r() {
        a aVarC;
        ArrayList arrayList = new ArrayList();
        for (int i10 = 0; i10 < 8; i10++) {
            if (!this.f12045m[i10].j() && this.f12045m[i10].k() && (aVarC = this.f12045m[i10].c()) != null) {
                arrayList.add(aVarC);
            }
        }
        Collections.sort(arrayList, a.f12051c);
        ArrayList arrayList2 = new ArrayList(arrayList.size());
        for (int i11 = 0; i11 < arrayList.size(); i11++) {
            arrayList2.add(((a) arrayList.get(i11)).f12052a);
        }
        return Collections.unmodifiableList(arrayList2);
    }

    private void s(int i10) {
        if (i10 != 0) {
            if (i10 == 3) {
                this.f12047o = r();
                return;
            }
            if (i10 == 8) {
                this.f12046n.b();
                return;
            }
            switch (i10) {
                case 12:
                    G();
                    break;
                case 13:
                    this.f12046n.a('\n');
                    break;
                case 14:
                    break;
                default:
                    if (i10 >= 17 && i10 <= 23) {
                        AbstractC1477t.h("Cea708Decoder", "Currently unsupported COMMAND_EXT1 Command: " + i10);
                        this.f12041i.r(8);
                    } else if (i10 >= 24 && i10 <= 31) {
                        AbstractC1477t.h("Cea708Decoder", "Currently unsupported COMMAND_P16 Command: " + i10);
                        this.f12041i.r(16);
                    } else {
                        AbstractC1477t.h("Cea708Decoder", "Invalid C0 command: " + i10);
                    }
                    break;
            }
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    private void t(int i10) {
        int i11 = 1;
        switch (i10) {
            case 128:
            case 129:
            case 130:
            case 131:
            case 132:
            case 133:
            case 134:
            case 135:
                int i12 = i10 - 128;
                if (this.f12050r != i12) {
                    this.f12050r = i12;
                    this.f12046n = this.f12045m[i12];
                }
                break;
            case 136:
                while (i11 <= 8) {
                    if (this.f12041i.g()) {
                        this.f12045m[8 - i11].e();
                    }
                    i11++;
                }
                break;
            case 137:
                for (int i13 = 1; i13 <= 8; i13++) {
                    if (this.f12041i.g()) {
                        this.f12045m[8 - i13].p(true);
                    }
                }
                break;
            case 138:
                while (i11 <= 8) {
                    if (this.f12041i.g()) {
                        this.f12045m[8 - i11].p(false);
                    }
                    i11++;
                }
                break;
            case 139:
                for (int i14 = 1; i14 <= 8; i14++) {
                    if (this.f12041i.g()) {
                        b bVar = this.f12045m[8 - i14];
                        bVar.p(!bVar.k());
                    }
                }
                break;
            case 140:
                while (i11 <= 8) {
                    if (this.f12041i.g()) {
                        this.f12045m[8 - i11].l();
                    }
                    i11++;
                }
                break;
            case 141:
                this.f12041i.r(8);
                break;
            case 142:
                break;
            case 143:
                G();
                break;
            case 144:
                if (this.f12046n.i()) {
                    B();
                } else {
                    this.f12041i.r(16);
                }
                break;
            case 145:
                if (this.f12046n.i()) {
                    C();
                } else {
                    this.f12041i.r(24);
                }
                break;
            case 146:
                if (this.f12046n.i()) {
                    D();
                } else {
                    this.f12041i.r(16);
                }
                break;
            case 147:
            case 148:
            case 149:
            case 150:
            default:
                AbstractC1477t.h("Cea708Decoder", "Invalid C1 command: " + i10);
                break;
            case 151:
                if (this.f12046n.i()) {
                    E();
                } else {
                    this.f12041i.r(32);
                }
                break;
            case 152:
            case 153:
            case 154:
            case 155:
            case 156:
            case 157:
            case 158:
            case 159:
                int i15 = i10 - 152;
                w(i15);
                if (this.f12050r != i15) {
                    this.f12050r = i15;
                    this.f12046n = this.f12045m[i15];
                }
                break;
        }
    }

    private void u(int i10) {
        if (i10 <= 7) {
            return;
        }
        if (i10 <= 15) {
            this.f12041i.r(8);
        } else if (i10 <= 23) {
            this.f12041i.r(16);
        } else if (i10 <= 31) {
            this.f12041i.r(24);
        }
    }

    private void v(int i10) {
        if (i10 <= 135) {
            this.f12041i.r(32);
            return;
        }
        if (i10 <= 143) {
            this.f12041i.r(40);
        } else if (i10 <= 159) {
            this.f12041i.r(2);
            this.f12041i.r(this.f12041i.h(6) * 8);
        }
    }

    private void w(int i10) {
        b bVar = this.f12045m[i10];
        this.f12041i.r(2);
        boolean zG = this.f12041i.g();
        this.f12041i.r(2);
        int iH = this.f12041i.h(3);
        boolean zG2 = this.f12041i.g();
        int iH2 = this.f12041i.h(7);
        int iH3 = this.f12041i.h(8);
        int iH4 = this.f12041i.h(4);
        int iH5 = this.f12041i.h(4);
        this.f12041i.r(2);
        this.f12041i.r(6);
        this.f12041i.r(2);
        bVar.f(zG, iH, zG2, iH2, iH3, iH5, iH4, this.f12041i.h(3), this.f12041i.h(3));
    }

    private void x(int i10) {
        if (i10 == 127) {
            this.f12046n.a((char) 9835);
        } else {
            this.f12046n.a((char) (i10 & 255));
        }
    }

    private void y(int i10) {
        this.f12046n.a((char) (i10 & 255));
    }

    private void z(int i10) {
        if (i10 == 32) {
            this.f12046n.a(' ');
            return;
        }
        if (i10 == 33) {
            this.f12046n.a((char) 160);
            return;
        }
        if (i10 == 37) {
            this.f12046n.a((char) 8230);
            return;
        }
        if (i10 == 42) {
            this.f12046n.a((char) 352);
            return;
        }
        if (i10 == 44) {
            this.f12046n.a((char) 338);
            return;
        }
        if (i10 == 63) {
            this.f12046n.a((char) 376);
            return;
        }
        if (i10 == 57) {
            this.f12046n.a((char) 8482);
            return;
        }
        if (i10 == 58) {
            this.f12046n.a((char) 353);
            return;
        }
        if (i10 == 60) {
            this.f12046n.a((char) 339);
            return;
        }
        if (i10 == 61) {
            this.f12046n.a((char) 8480);
            return;
        }
        switch (i10) {
            case 48:
                this.f12046n.a((char) 9608);
                break;
            case 49:
                this.f12046n.a((char) 8216);
                break;
            case 50:
                this.f12046n.a((char) 8217);
                break;
            case 51:
                this.f12046n.a((char) 8220);
                break;
            case 52:
                this.f12046n.a((char) 8221);
                break;
            case 53:
                this.f12046n.a((char) 8226);
                break;
            default:
                switch (i10) {
                    case 118:
                        this.f12046n.a((char) 8539);
                        break;
                    case 119:
                        this.f12046n.a((char) 8540);
                        break;
                    case 120:
                        this.f12046n.a((char) 8541);
                        break;
                    case 121:
                        this.f12046n.a((char) 8542);
                        break;
                    case 122:
                        this.f12046n.a((char) 9474);
                        break;
                    case 123:
                        this.f12046n.a((char) 9488);
                        break;
                    case 124:
                        this.f12046n.a((char) 9492);
                        break;
                    case 125:
                        this.f12046n.a((char) 9472);
                        break;
                    case 126:
                        this.f12046n.a((char) 9496);
                        break;
                    case 127:
                        this.f12046n.a((char) 9484);
                        break;
                    default:
                        AbstractC1477t.h("Cea708Decoder", "Invalid G2 character: " + i10);
                        break;
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
        this.f12047o = null;
        this.f12048p = null;
        this.f12050r = 0;
        this.f12046n = this.f12045m[0];
        G();
        this.f12049q = null;
    }

    @Override // T2.e
    protected k g() {
        List list = this.f12047o;
        this.f12048p = list;
        return new f((List) AbstractC1459a.e(list));
    }

    @Override // T2.e
    protected void h(p pVar) {
        ByteBuffer byteBuffer = (ByteBuffer) AbstractC1459a.e(pVar.f16811d);
        this.f12040h.Y(byteBuffer.array(), byteBuffer.limit());
        while (this.f12040h.a() >= 3) {
            int iL = this.f12040h.L();
            int i10 = iL & 3;
            boolean z10 = (iL & 4) == 4;
            byte bL = (byte) this.f12040h.L();
            byte bL2 = (byte) this.f12040h.L();
            if (i10 == 2 || i10 == 3) {
                if (z10) {
                    if (i10 == 3) {
                        q();
                        int i11 = (bL & 192) >> 6;
                        int i12 = this.f12042j;
                        if (i12 != -1 && i11 != (i12 + 1) % 4) {
                            G();
                            AbstractC1477t.h("Cea708Decoder", "Sequence number discontinuity. previous=" + this.f12042j + " current=" + i11);
                        }
                        this.f12042j = i11;
                        int i13 = bL & 63;
                        if (i13 == 0) {
                            i13 = 64;
                        }
                        C0177c c0177c = new C0177c(i11, i13);
                        this.f12049q = c0177c;
                        byte[] bArr = c0177c.f12088c;
                        int i14 = c0177c.f12089d;
                        c0177c.f12089d = i14 + 1;
                        bArr[i14] = bL2;
                    } else {
                        AbstractC1459a.a(i10 == 2);
                        C0177c c0177c2 = this.f12049q;
                        if (c0177c2 == null) {
                            AbstractC1477t.c("Cea708Decoder", "Encountered DTVCC_PACKET_DATA before DTVCC_PACKET_START");
                        } else {
                            byte[] bArr2 = c0177c2.f12088c;
                            int i15 = c0177c2.f12089d;
                            int i16 = i15 + 1;
                            c0177c2.f12089d = i16;
                            bArr2[i15] = bL;
                            c0177c2.f12089d = i15 + 2;
                            bArr2[i16] = bL2;
                        }
                    }
                    C0177c c0177c3 = this.f12049q;
                    if (c0177c3.f12089d == (c0177c3.f12087b * 2) - 1) {
                        q();
                    }
                }
            }
        }
    }

    @Override // T2.e
    /* JADX INFO: renamed from: i */
    public /* bridge */ /* synthetic */ p f() {
        return super.f();
    }

    @Override // T2.e
    /* JADX INFO: renamed from: j */
    public /* bridge */ /* synthetic */ q a() {
        return super.a();
    }

    @Override // T2.e
    protected boolean m() {
        return this.f12047o != this.f12048p;
    }

    @Override // T2.e
    /* JADX INFO: renamed from: n */
    public /* bridge */ /* synthetic */ void d(p pVar) {
        super.d(pVar);
    }

    @Override // T2.e, Y1.d
    public /* bridge */ /* synthetic */ void release() {
        super.release();
    }
}
