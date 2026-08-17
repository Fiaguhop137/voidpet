package E0;

import android.graphics.Paint;
import android.text.style.LineHeightSpan;

/* JADX INFO: loaded from: classes.dex */
public final class h implements LineHeightSpan {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final float f2579a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f2580b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f2581c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final boolean f2582d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final boolean f2583e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final float f2584f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final boolean f2585g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private int f2586h = Integer.MIN_VALUE;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private int f2587i = Integer.MIN_VALUE;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private int f2588j = Integer.MIN_VALUE;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private int f2589k = Integer.MIN_VALUE;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private int f2590l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private int f2591m;

    public h(float f10, int i10, int i11, boolean z10, boolean z11, float f11, boolean z12) {
        this.f2579a = f10;
        this.f2580b = i10;
        this.f2581c = i11;
        this.f2582d = z10;
        this.f2583e = z11;
        this.f2584f = f11;
        this.f2585g = z12;
        if ((0.0f <= f11 && f11 <= 1.0f) || f11 == -1.0f) {
            return;
        }
        H0.a.c("topRatio should be in [0..1] range or -1");
    }

    private final void a(Paint.FontMetricsInt fontMetricsInt) {
        int iA = i.a(fontMetricsInt);
        int iCeil = (int) Math.ceil(this.f2579a);
        int i10 = iCeil - iA;
        if (this.f2585g && i10 <= 0) {
            int i11 = fontMetricsInt.ascent;
            this.f2587i = i11;
            int i12 = fontMetricsInt.descent;
            this.f2588j = i12;
            this.f2586h = i11;
            this.f2589k = i12;
            this.f2590l = 0;
            this.f2591m = 0;
            return;
        }
        float fAbs = this.f2584f;
        if (fAbs == -1.0f) {
            fAbs = Math.abs(fontMetricsInt.ascent) / i.a(fontMetricsInt);
        }
        int iCeil2 = (int) (i10 <= 0 ? Math.ceil(i10 * fAbs) : Math.ceil(i10 * (1.0f - fAbs)));
        int i13 = fontMetricsInt.descent;
        int i14 = iCeil2 + i13;
        this.f2588j = i14;
        int i15 = i14 - iCeil;
        this.f2587i = i15;
        if (this.f2582d) {
            i15 = fontMetricsInt.ascent;
        }
        this.f2586h = i15;
        if (this.f2583e) {
            i14 = i13;
        }
        this.f2589k = i14;
        this.f2590l = fontMetricsInt.ascent - i15;
        this.f2591m = i14 - i13;
    }

    public final h b(int i10, int i11, boolean z10) {
        return new h(this.f2579a, i10, i11, z10, this.f2583e, this.f2584f, this.f2585g);
    }

    public final int c() {
        return this.f2590l;
    }

    @Override // android.text.style.LineHeightSpan
    public void chooseHeight(CharSequence charSequence, int i10, int i11, int i12, int i13, Paint.FontMetricsInt fontMetricsInt) {
        if (i.a(fontMetricsInt) <= 0) {
            return;
        }
        boolean z10 = i10 == this.f2580b;
        boolean z11 = i11 == this.f2581c;
        if (z10 && z11 && this.f2582d && this.f2583e) {
            return;
        }
        if (this.f2586h == Integer.MIN_VALUE) {
            a(fontMetricsInt);
        }
        fontMetricsInt.ascent = z10 ? this.f2586h : this.f2587i;
        fontMetricsInt.descent = z11 ? this.f2589k : this.f2588j;
    }

    public final int d() {
        return this.f2591m;
    }

    public final boolean e() {
        return this.f2583e;
    }
}
