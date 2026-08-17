package D0;

import android.text.Layout;
import android.text.TextDirectionHeuristic;
import android.text.TextPaint;
import android.text.TextUtils;

/* JADX INFO: loaded from: classes.dex */
final class f0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final CharSequence f2057a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f2058b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f2059c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final TextPaint f2060d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final int f2061e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final TextDirectionHeuristic f2062f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final Layout.Alignment f2063g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final int f2064h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final TextUtils.TruncateAt f2065i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final int f2066j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final float f2067k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final float f2068l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final int f2069m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final boolean f2070n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final boolean f2071o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private final int f2072p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private final int f2073q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private final int f2074r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private final int f2075s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final int[] f2076t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private final int[] f2077u;

    public f0(CharSequence charSequence, int i10, int i11, TextPaint textPaint, int i12, TextDirectionHeuristic textDirectionHeuristic, Layout.Alignment alignment, int i13, TextUtils.TruncateAt truncateAt, int i14, float f10, float f11, int i15, boolean z10, boolean z11, int i16, int i17, int i18, int i19, int[] iArr, int[] iArr2) {
        this.f2057a = charSequence;
        this.f2058b = i10;
        this.f2059c = i11;
        this.f2060d = textPaint;
        this.f2061e = i12;
        this.f2062f = textDirectionHeuristic;
        this.f2063g = alignment;
        this.f2064h = i13;
        this.f2065i = truncateAt;
        this.f2066j = i14;
        this.f2067k = f10;
        this.f2068l = f11;
        this.f2069m = i15;
        this.f2070n = z10;
        this.f2071o = z11;
        this.f2072p = i16;
        this.f2073q = i17;
        this.f2074r = i18;
        this.f2075s = i19;
        this.f2076t = iArr;
        this.f2077u = iArr2;
        if (!(i10 >= 0 && i10 <= i11)) {
            H0.a.a("invalid start value");
        }
        if (!(i11 >= 0 && i11 <= charSequence.length())) {
            H0.a.a("invalid end value");
        }
        if (!(i13 >= 0)) {
            H0.a.a("invalid maxLines value");
        }
        if (!(i12 >= 0)) {
            H0.a.a("invalid width value");
        }
        if (!(i14 >= 0)) {
            H0.a.a("invalid ellipsizedWidth value");
        }
        if (f10 >= 0.0f) {
            return;
        }
        H0.a.a("invalid lineSpacingMultiplier value");
    }

    public final Layout.Alignment a() {
        return this.f2063g;
    }

    public final int b() {
        return this.f2072p;
    }

    public final TextUtils.TruncateAt c() {
        return this.f2065i;
    }

    public final int d() {
        return this.f2066j;
    }

    public final int e() {
        return this.f2059c;
    }

    public final int f() {
        return this.f2075s;
    }

    public final boolean g() {
        return this.f2070n;
    }

    public final int h() {
        return this.f2069m;
    }

    public final int[] i() {
        return this.f2076t;
    }

    public final int j() {
        return this.f2073q;
    }

    public final int k() {
        return this.f2074r;
    }

    public final float l() {
        return this.f2068l;
    }

    public final float m() {
        return this.f2067k;
    }

    public final int n() {
        return this.f2064h;
    }

    public final TextPaint o() {
        return this.f2060d;
    }

    public final int[] p() {
        return this.f2077u;
    }

    public final int q() {
        return this.f2058b;
    }

    public final CharSequence r() {
        return this.f2057a;
    }

    public final TextDirectionHeuristic s() {
        return this.f2062f;
    }

    public final boolean t() {
        return this.f2071o;
    }

    public final int u() {
        return this.f2061e;
    }
}
