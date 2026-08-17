package com.google.android.material.internal;

import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextDirectionHeuristics;
import android.text.TextPaint;
import android.text.TextUtils;

/* JADX INFO: loaded from: classes2.dex */
final class h {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    static final int f36760n = 1;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private CharSequence f36761a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final TextPaint f36762b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f36763c;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f36765e;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private boolean f36772l;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f36764d = 0;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private Layout.Alignment f36766f = Layout.Alignment.ALIGN_NORMAL;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f36767g = Integer.MAX_VALUE;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private float f36768h = 0.0f;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private float f36769i = 1.0f;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private int f36770j = f36760n;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private boolean f36771k = true;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private TextUtils.TruncateAt f36773m = null;

    static class a extends Exception {
    }

    private h(CharSequence charSequence, TextPaint textPaint, int i10) {
        this.f36761a = charSequence;
        this.f36762b = textPaint;
        this.f36763c = i10;
        this.f36765e = charSequence.length();
    }

    public static h b(CharSequence charSequence, TextPaint textPaint, int i10) {
        return new h(charSequence, textPaint, i10);
    }

    public StaticLayout a() {
        if (this.f36761a == null) {
            this.f36761a = "";
        }
        int iMax = Math.max(0, this.f36763c);
        CharSequence charSequenceEllipsize = this.f36761a;
        if (this.f36767g == 1) {
            charSequenceEllipsize = TextUtils.ellipsize(charSequenceEllipsize, this.f36762b, iMax, this.f36773m);
        }
        int iMin = Math.min(charSequenceEllipsize.length(), this.f36765e);
        this.f36765e = iMin;
        if (this.f36772l && this.f36767g == 1) {
            this.f36766f = Layout.Alignment.ALIGN_OPPOSITE;
        }
        StaticLayout.Builder builderObtain = StaticLayout.Builder.obtain(charSequenceEllipsize, this.f36764d, iMin, this.f36762b, iMax);
        builderObtain.setAlignment(this.f36766f);
        builderObtain.setIncludePad(this.f36771k);
        builderObtain.setTextDirection(this.f36772l ? TextDirectionHeuristics.RTL : TextDirectionHeuristics.LTR);
        TextUtils.TruncateAt truncateAt = this.f36773m;
        if (truncateAt != null) {
            builderObtain.setEllipsize(truncateAt);
        }
        builderObtain.setMaxLines(this.f36767g);
        float f10 = this.f36768h;
        if (f10 != 0.0f || this.f36769i != 1.0f) {
            builderObtain.setLineSpacing(f10, this.f36769i);
        }
        if (this.f36767g > 1) {
            builderObtain.setHyphenationFrequency(this.f36770j);
        }
        return builderObtain.build();
    }

    public h c(Layout.Alignment alignment) {
        this.f36766f = alignment;
        return this;
    }

    public h d(TextUtils.TruncateAt truncateAt) {
        this.f36773m = truncateAt;
        return this;
    }

    public h e(int i10) {
        this.f36770j = i10;
        return this;
    }

    public h f(boolean z10) {
        this.f36771k = z10;
        return this;
    }

    public h g(boolean z10) {
        this.f36772l = z10;
        return this;
    }

    public h h(float f10, float f11) {
        this.f36768h = f10;
        this.f36769i = f11;
        return this;
    }

    public h i(int i10) {
        this.f36767g = i10;
        return this;
    }

    public h j(i iVar) {
        return this;
    }
}
