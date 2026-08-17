package io.sentry.android.replay.util;

import android.text.Layout;
import android.text.Spanned;
import android.text.style.ForegroundColorSpan;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class a implements q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Layout f45565a;

    public a(Layout layout) {
        Intrinsics.checkNotNullParameter(layout, "layout");
        this.f45565a = layout;
    }

    @Override // io.sentry.android.replay.util.q
    public int a(int i10) {
        return this.f45565a.getLineTop(i10);
    }

    @Override // io.sentry.android.replay.util.q
    public int b(int i10) {
        return this.f45565a.getLineStart(i10);
    }

    @Override // io.sentry.android.replay.util.q
    public int c() {
        return this.f45565a.getLineCount();
    }

    @Override // io.sentry.android.replay.util.q
    public float d(int i10, int i11) {
        return this.f45565a.getPrimaryHorizontal(i11);
    }

    @Override // io.sentry.android.replay.util.q
    public int e(int i10) {
        return this.f45565a.getLineBottom(i10);
    }

    @Override // io.sentry.android.replay.util.q
    public Integer f() {
        int i10;
        if (!(this.f45565a.getText() instanceof Spanned)) {
            return null;
        }
        CharSequence text = this.f45565a.getText();
        Intrinsics.d(text, "null cannot be cast to non-null type android.text.Spanned");
        ForegroundColorSpan[] foregroundColorSpanArr = (ForegroundColorSpan[]) ((Spanned) text).getSpans(0, this.f45565a.getText().length(), ForegroundColorSpan.class);
        Intrinsics.c(foregroundColorSpanArr);
        int i11 = Integer.MIN_VALUE;
        Integer numValueOf = null;
        for (ForegroundColorSpan foregroundColorSpan : foregroundColorSpanArr) {
            CharSequence text2 = this.f45565a.getText();
            Intrinsics.d(text2, "null cannot be cast to non-null type android.text.Spanned");
            int spanStart = ((Spanned) text2).getSpanStart(foregroundColorSpan);
            CharSequence text3 = this.f45565a.getText();
            Intrinsics.d(text3, "null cannot be cast to non-null type android.text.Spanned");
            int spanEnd = ((Spanned) text3).getSpanEnd(foregroundColorSpan);
            if (spanStart != -1 && spanEnd != -1 && (i10 = spanEnd - spanStart) > i11) {
                numValueOf = Integer.valueOf(foregroundColorSpan.getForegroundColor());
                i11 = i10;
            }
        }
        if (numValueOf != null) {
            return Integer.valueOf(r.j(numValueOf.intValue()));
        }
        return null;
    }

    @Override // io.sentry.android.replay.util.q
    public int g(int i10) {
        return this.f45565a.getLineVisibleEnd(i10);
    }

    @Override // io.sentry.android.replay.util.q
    public int h(int i10) {
        return this.f45565a.getEllipsisCount(i10);
    }
}
