package D0;

import android.graphics.Paint;
import android.graphics.Rect;
import android.text.Layout;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.StaticLayout;
import android.text.TextDirectionHeuristic;
import android.text.TextDirectionHeuristics;
import android.text.TextPaint;
import kotlin.collections.AbstractC3952n;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public abstract class j0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final h0 f2101a = new h0();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final long f2102b = a(0, 0);

    public static final long a(int i10, int i11) {
        return k0.a((((long) i11) & 4294967295L) | (((long) i10) << 32));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Paint.FontMetricsInt h(i0 i0Var, TextPaint textPaint, TextDirectionHeuristic textDirectionHeuristic, E0.h[] hVarArr) {
        int iL = i0Var.l() - 1;
        if (i0Var.h().getLineStart(iL) != i0Var.h().getLineEnd(iL) || hVarArr == null || hVarArr.length == 0) {
            return null;
        }
        SpannableString spannableString = new SpannableString("\u200b");
        E0.h hVar = (E0.h) AbstractC3952n.R(hVarArr);
        spannableString.setSpan(hVar.b(0, spannableString.length(), (iL == 0 || !hVar.e()) ? hVar.e() : false), 0, spannableString.length(), 33);
        StaticLayout staticLayoutA = d0.f2052a.a(spannableString, textPaint, Integer.MAX_VALUE, (2072512 & 8) != 0 ? 0 : 0, (2072512 & 16) != 0 ? spannableString.length() : spannableString.length(), (2072512 & 32) != 0 ? E.f2024a.b() : textDirectionHeuristic, (2072512 & 64) != 0 ? E.f2024a.a() : null, (2072512 & 128) != 0 ? Integer.MAX_VALUE : 0, (2072512 & 256) != 0 ? null : null, (2072512 & 512) != 0 ? Integer.MAX_VALUE : 0, (2072512 & 1024) != 0 ? 1.0f : 0.0f, (2072512 & 2048) != 0 ? 0.0f : 0.0f, (2072512 & 4096) != 0 ? 0 : 0, (2072512 & 8192) != 0 ? false : i0Var.g(), (2072512 & 16384) != 0 ? true : i0Var.d(), (32768 & 2072512) != 0 ? 0 : 0, (65536 & 2072512) != 0 ? 0 : 0, (131072 & 2072512) != 0 ? 0 : 0, (262144 & 2072512) != 0 ? 0 : 0, (524288 & 2072512) != 0 ? null : null, (2072512 & 1048576) != 0 ? null : null);
        Paint.FontMetricsInt fontMetricsInt = new Paint.FontMetricsInt();
        fontMetricsInt.ascent = staticLayoutA.getLineAscent(0);
        fontMetricsInt.descent = staticLayoutA.getLineDescent(0);
        fontMetricsInt.top = staticLayoutA.getLineTop(0);
        fontMetricsInt.bottom = staticLayoutA.getLineBottom(0);
        return fontMetricsInt;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final long i(E0.h[] hVarArr) {
        int iMax = 0;
        int iMax2 = 0;
        for (E0.h hVar : hVarArr) {
            if (hVar.c() < 0) {
                iMax = Math.max(iMax, Math.abs(hVar.c()));
            }
            if (hVar.d() < 0) {
                iMax2 = Math.max(iMax, Math.abs(hVar.d()));
            }
        }
        return (iMax == 0 && iMax2 == 0) ? f2102b : a(iMax, iMax2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final E0.h[] j(i0 i0Var) {
        if (!(i0Var.C() instanceof Spanned)) {
            return null;
        }
        CharSequence charSequenceC = i0Var.C();
        Intrinsics.d(charSequenceC, "null cannot be cast to non-null type android.text.Spanned");
        if (!N.a((Spanned) charSequenceC, E0.h.class) && i0Var.C().length() > 0) {
            return null;
        }
        CharSequence charSequenceC2 = i0Var.C();
        Intrinsics.d(charSequenceC2, "null cannot be cast to non-null type android.text.Spanned");
        return (E0.h[]) ((Spanned) charSequenceC2).getSpans(0, i0Var.C().length(), E0.h.class);
    }

    public static final TextDirectionHeuristic k(int i10) {
        if (i10 == 0) {
            return TextDirectionHeuristics.LTR;
        }
        if (i10 == 1) {
            return TextDirectionHeuristics.RTL;
        }
        if (i10 == 2) {
            return TextDirectionHeuristics.FIRSTSTRONG_LTR;
        }
        if (i10 == 3) {
            return TextDirectionHeuristics.FIRSTSTRONG_RTL;
        }
        if (i10 != 4) {
            return i10 != 5 ? TextDirectionHeuristics.FIRSTSTRONG_LTR : TextDirectionHeuristics.LOCALE;
        }
        return TextDirectionHeuristics.ANYRTL_LTR;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final long l(i0 i0Var) {
        if (i0Var.g() || i0Var.D()) {
            return f2102b;
        }
        TextPaint paint = i0Var.h().getPaint();
        CharSequence text = i0Var.h().getText();
        Rect rectC = M.c(paint, text, i0Var.h().getLineStart(0), i0Var.h().getLineEnd(0));
        int lineAscent = i0Var.h().getLineAscent(0);
        int i10 = rectC.top;
        int topPadding = i10 < lineAscent ? lineAscent - i10 : i0Var.h().getTopPadding();
        if (i0Var.l() != 1) {
            int iL = i0Var.l() - 1;
            rectC = M.c(paint, text, i0Var.h().getLineStart(iL), i0Var.h().getLineEnd(iL));
        }
        int lineDescent = i0Var.h().getLineDescent(i0Var.l() - 1);
        int i11 = rectC.bottom;
        int bottomPadding = i11 > lineDescent ? i11 - lineDescent : i0Var.h().getBottomPadding();
        return (topPadding == 0 && bottomPadding == 0) ? f2102b : a(topPadding, bottomPadding);
    }

    public static final boolean m(Layout layout, int i10) {
        return layout.getEllipsisCount(i10) > 0;
    }
}
