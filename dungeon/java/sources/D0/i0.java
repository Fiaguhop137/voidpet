package D0;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Trace;
import android.text.BoringLayout;
import android.text.Layout;
import android.text.Spanned;
import android.text.StaticLayout;
import android.text.TextDirectionHeuristic;
import android.text.TextPaint;
import android.text.TextUtils;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class i0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final TextPaint f2083a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final TextUtils.TruncateAt f2084b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final boolean f2085c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final boolean f2086d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final I f2087e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final boolean f2088f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final Layout f2089g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final int f2090h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final int f2091i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final int f2092j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final float f2093k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final float f2094l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final boolean f2095m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final Paint.FontMetricsInt f2096n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final int f2097o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private final E0.h[] f2098p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private final Rect f2099q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private G f2100r;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r14v2 */
    /* JADX WARN: Type inference failed for: r14v3, types: [int] */
    /* JADX WARN: Type inference failed for: r14v5 */
    public i0(CharSequence charSequence, float f10, TextPaint textPaint, int i10, TextUtils.TruncateAt truncateAt, int i11, float f11, float f12, boolean z10, boolean z11, int i12, int i13, int i14, int i15, int i16, int i17, int[] iArr, int[] iArr2, I i18) {
        boolean z12;
        int i19;
        boolean z13;
        TextDirectionHeuristic textDirectionHeuristic;
        TextPaint textPaint2;
        Layout layoutA;
        this.f2083a = textPaint;
        this.f2084b = truncateAt;
        this.f2085c = z10;
        this.f2086d = z11;
        this.f2087e = i18;
        this.f2099q = new Rect();
        int length = charSequence.length();
        TextDirectionHeuristic textDirectionHeuristicK = j0.k(i11);
        Layout.Alignment alignmentA = g0.f2079a.a(i10);
        boolean z14 = (charSequence instanceof Spanned) && ((Spanned) charSequence).nextSpanTransition(-1, length, E0.a.class) < length;
        Trace.beginSection("TextLayout:initLayout");
        try {
            BoringLayout.Metrics metricsE = i18.e();
            double d10 = f10;
            int iCeil = (int) Math.ceil(d10);
            if (metricsE == null || i18.i() > f10 || z14) {
                z12 = true;
                this.f2095m = false;
                i19 = i12;
                z13 = false;
                textDirectionHeuristic = textDirectionHeuristicK;
                textPaint2 = textPaint;
                layoutA = d0.f2052a.a(charSequence, textPaint2, iCeil, 0, charSequence.length(), textDirectionHeuristic, alignmentA, i19, truncateAt, (int) Math.ceil(d10), f11, f12, i17, z10, z11, i13, i14, i15, i16, iArr, iArr2);
            } else {
                z12 = true;
                this.f2095m = true;
                layoutA = C0916e.f2055a.a(charSequence, textPaint, iCeil, metricsE, alignmentA, z10, z11, truncateAt, iCeil);
                textPaint2 = textPaint;
                i19 = i12;
                textDirectionHeuristic = textDirectionHeuristicK;
                z13 = false;
            }
            this.f2089g = layoutA;
            Trace.endSection();
            int iMin = Math.min(layoutA.getLineCount(), i19);
            this.f2090h = iMin;
            int i20 = iMin - 1;
            this.f2088f = (iMin >= i19 && (layoutA.getEllipsisCount(i20) > 0 || layoutA.getLineEnd(i20) != charSequence.length())) ? z12 : z13;
            long jL = j0.l(this);
            E0.h[] hVarArrJ = j0.j(this);
            this.f2098p = hVarArrJ;
            long jI = hVarArrJ != null ? j0.i(hVarArrJ) : j0.f2102b;
            this.f2091i = Math.max(k0.c(jL), k0.c(jI));
            this.f2092j = Math.max(k0.b(jL), k0.b(jI));
            Paint.FontMetricsInt fontMetricsIntH = j0.h(this, textPaint2, textDirectionHeuristic, hVarArrJ);
            this.f2097o = fontMetricsIntH != null ? fontMetricsIntH.bottom - ((int) r(i20)) : z13;
            this.f2096n = fontMetricsIntH;
            this.f2093k = E0.d.b(layoutA, i20, null, 2, null);
            this.f2094l = E0.d.d(layoutA, i20, null, 2, null);
        } catch (Throwable th) {
            Trace.endSection();
            throw th;
        }
    }

    public /* synthetic */ i0(CharSequence charSequence, float f10, TextPaint textPaint, int i10, TextUtils.TruncateAt truncateAt, int i11, float f11, float f12, boolean z10, boolean z11, int i12, int i13, int i14, int i15, int i16, int i17, int[] iArr, int[] iArr2, I i18, int i19, DefaultConstructorMarker defaultConstructorMarker) {
        CharSequence charSequence2;
        TextPaint textPaint2;
        I i20;
        int i21 = (i19 & 8) != 0 ? 0 : i10;
        TextUtils.TruncateAt truncateAt2 = (i19 & 16) != 0 ? null : truncateAt;
        int i22 = (i19 & 32) != 0 ? 2 : i11;
        float f13 = (i19 & 64) != 0 ? 1.0f : f11;
        float f14 = (i19 & 128) != 0 ? 0.0f : f12;
        boolean z12 = (i19 & 256) != 0 ? false : z10;
        boolean z13 = (i19 & 512) != 0 ? true : z11;
        int i23 = (i19 & 1024) != 0 ? Integer.MAX_VALUE : i12;
        int i24 = (i19 & 2048) != 0 ? 0 : i13;
        int i25 = (i19 & 4096) != 0 ? 0 : i14;
        int i26 = (i19 & 8192) != 0 ? 0 : i15;
        int i27 = (i19 & 16384) != 0 ? 0 : i16;
        int i28 = (32768 & i19) != 0 ? 0 : i17;
        int[] iArr3 = (65536 & i19) != 0 ? null : iArr;
        int[] iArr4 = (131072 & i19) != 0 ? null : iArr2;
        if ((i19 & 262144) != 0) {
            charSequence2 = charSequence;
            textPaint2 = textPaint;
            i20 = new I(charSequence2, textPaint2, i22);
        } else {
            charSequence2 = charSequence;
            textPaint2 = textPaint;
            i20 = i18;
        }
        this(charSequence2, f10, textPaint2, i21, truncateAt2, i22, f13, f14, z12, z13, i23, i24, i25, i26, i27, i28, iArr3, iArr4, i20);
    }

    public static /* synthetic */ float B(i0 i0Var, int i10, boolean z10, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            z10 = false;
        }
        return i0Var.A(i10, z10);
    }

    private final float f(int i10) {
        if (i10 == this.f2090h - 1) {
            return this.f2093k + this.f2094l;
        }
        return 0.0f;
    }

    private final G i() {
        G g10 = this.f2100r;
        if (g10 != null) {
            Intrinsics.c(g10);
            return g10;
        }
        G g11 = new G(this.f2089g);
        this.f2100r = g11;
        return g11;
    }

    public static /* synthetic */ float z(i0 i0Var, int i10, boolean z10, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            z10 = false;
        }
        return i0Var.y(i10, z10);
    }

    public final float A(int i10, boolean z10) {
        return i().c(i10, false, z10) + f(p(i10));
    }

    public final CharSequence C() {
        return this.f2089g.getText();
    }

    public final boolean D() {
        if (this.f2095m) {
            C0916e c0916e = C0916e.f2055a;
            Layout layout = this.f2089g;
            Intrinsics.d(layout, "null cannot be cast to non-null type android.text.BoringLayout");
            return c0916e.b((BoringLayout) layout);
        }
        d0 d0Var = d0.f2052a;
        Layout layout2 = this.f2089g;
        Intrinsics.d(layout2, "null cannot be cast to non-null type android.text.StaticLayout");
        return d0Var.c((StaticLayout) layout2, this.f2086d);
    }

    public final boolean E(int i10) {
        return j0.m(this.f2089g, i10);
    }

    public final boolean F(int i10) {
        return this.f2089g.isRtlCharAt(i10);
    }

    public final void G(Canvas canvas) {
        if (canvas.getClipBounds(this.f2099q)) {
            int i10 = this.f2091i;
            if (i10 != 0) {
                canvas.translate(0.0f, i10);
            }
            h0 h0Var = j0.f2101a;
            h0Var.a(canvas);
            this.f2089g.draw(h0Var);
            int i11 = this.f2091i;
            if (i11 != 0) {
                canvas.translate(0.0f, (-1) * i11);
            }
        }
    }

    public final void a(int i10, int i11, float[] fArr, int i12) {
        float fD;
        float fE;
        int length = C().length();
        if (!(i10 >= 0)) {
            H0.a.a("startOffset must be > 0");
        }
        if (!(i10 < length)) {
            H0.a.a("startOffset must be less than text length");
        }
        if (!(i11 > i10)) {
            H0.a.a("endOffset must be greater than startOffset");
        }
        if (!(i11 <= length)) {
            H0.a.a("endOffset must be smaller or equal to text length");
        }
        if (!(fArr.length - i12 >= (i11 - i10) * 4)) {
            H0.a.a("array.size - arrayStart must be greater or equal than (endOffset - startOffset) * 4");
        }
        int iP = p(i10);
        int iP2 = p(i11 - 1);
        D d10 = new D(this);
        if (iP > iP2) {
            return;
        }
        int i13 = iP;
        int i14 = i12;
        while (true) {
            int iU = u(i13);
            int iO = o(i13);
            int iMin = Math.min(i11, iO);
            float fV = v(i13);
            float fK = k(i13);
            boolean z10 = x(i13) == 1;
            for (int iMax = Math.max(i10, iU); iMax < iMin; iMax++) {
                boolean zF = F(iMax);
                if (z10 && !zF) {
                    fD = d10.b(iMax);
                    fE = d10.c(iMax + 1);
                } else if (z10 && zF) {
                    fE = d10.d(iMax);
                    fD = d10.e(iMax + 1);
                } else if (z10 || !zF) {
                    fD = d10.d(iMax);
                    fE = d10.e(iMax + 1);
                } else {
                    fE = d10.b(iMax);
                    fD = d10.c(iMax + 1);
                }
                fArr[i14] = fD;
                fArr[i14 + 1] = fV;
                fArr[i14 + 2] = fE;
                fArr[i14 + 3] = fK;
                i14 += 4;
            }
            if (i13 == iP2) {
                return;
            } else {
                i13++;
            }
        }
    }

    public final RectF b(int i10) {
        float fA;
        float fA2;
        float fY;
        float fY2;
        int iP = p(i10);
        float fV = v(iP);
        float fK = k(iP);
        boolean z10 = x(iP) == 1;
        boolean zIsRtlCharAt = this.f2089g.isRtlCharAt(i10);
        if (!z10 || zIsRtlCharAt) {
            if (z10 && zIsRtlCharAt) {
                fY = A(i10, false);
                fY2 = A(i10 + 1, true);
            } else if (zIsRtlCharAt) {
                fY = y(i10, false);
                fY2 = y(i10 + 1, true);
            } else {
                fA = A(i10, false);
                fA2 = A(i10 + 1, true);
            }
            float f10 = fY;
            fA = fY2;
            fA2 = f10;
        } else {
            fA = y(i10, false);
            fA2 = y(i10 + 1, true);
        }
        return new RectF(fA, fV, fA2, fK);
    }

    public final boolean c() {
        return this.f2088f;
    }

    public final boolean d() {
        return this.f2086d;
    }

    public final int e() {
        return (this.f2088f ? this.f2089g.getLineBottom(this.f2090h - 1) : this.f2089g.getHeight()) + this.f2091i + this.f2092j + this.f2097o;
    }

    public final boolean g() {
        return this.f2085c;
    }

    public final Layout h() {
        return this.f2089g;
    }

    public final float j(int i10) {
        return this.f2091i + ((i10 != this.f2090h + (-1) || this.f2096n == null) ? this.f2089g.getLineBaseline(i10) : v(i10) - this.f2096n.ascent);
    }

    public final float k(int i10) {
        if (i10 != this.f2090h - 1 || this.f2096n == null) {
            return this.f2091i + this.f2089g.getLineBottom(i10) + (i10 == this.f2090h + (-1) ? this.f2092j : 0);
        }
        return this.f2089g.getLineBottom(i10 - 1) + this.f2096n.bottom;
    }

    public final int l() {
        return this.f2090h;
    }

    public final int m(int i10) {
        return this.f2089g.getEllipsisCount(i10);
    }

    public final int n(int i10) {
        return this.f2089g.getEllipsisStart(i10);
    }

    public final int o(int i10) {
        return (j0.m(this.f2089g, i10) && this.f2084b == TextUtils.TruncateAt.END) ? this.f2089g.getText().length() : this.f2089g.getLineEnd(i10);
    }

    public final int p(int i10) {
        return this.f2089g.getLineForOffset(i10);
    }

    public final int q(int i10) {
        return this.f2089g.getLineForVertical(i10 - this.f2091i);
    }

    public final float r(int i10) {
        return k(i10) - v(i10);
    }

    public final float s(int i10) {
        return this.f2089g.getLineLeft(i10) + (i10 == this.f2090h + (-1) ? this.f2093k : 0.0f);
    }

    public final float t(int i10) {
        return this.f2089g.getLineRight(i10) + (i10 == this.f2090h + (-1) ? this.f2094l : 0.0f);
    }

    public final int u(int i10) {
        return this.f2089g.getLineStart(i10);
    }

    public final float v(int i10) {
        return this.f2089g.getLineTop(i10) + (i10 == 0 ? 0 : this.f2091i);
    }

    public final int w(int i10) {
        return (j0.m(this.f2089g, i10) && this.f2084b == TextUtils.TruncateAt.END) ? this.f2089g.getLineStart(i10) + this.f2089g.getEllipsisStart(i10) : i().d(i10);
    }

    public final int x(int i10) {
        return this.f2089g.getParagraphDirection(i10);
    }

    public final float y(int i10, boolean z10) {
        return i().c(i10, true, z10) + f(p(i10));
    }
}
