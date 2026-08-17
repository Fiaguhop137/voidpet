package androidx.emoji2.text;

import android.graphics.Paint;
import android.text.style.ReplacementSpan;

/* JADX INFO: loaded from: classes.dex */
public abstract class j extends ReplacementSpan {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final p f23737b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Paint.FontMetricsInt f23736a = new Paint.FontMetricsInt();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private short f23738c = -1;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private short f23739d = -1;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private float f23740e = 1.0f;

    j(p pVar) {
        p199l1.g.h(pVar, "rasterizer cannot be null");
        this.f23737b = pVar;
    }

    public final p a() {
        return this.f23737b;
    }

    final int b() {
        return this.f23738c;
    }

    @Override // android.text.style.ReplacementSpan
    public int getSize(Paint paint, CharSequence charSequence, int i10, int i11, Paint.FontMetricsInt fontMetricsInt) {
        paint.getFontMetricsInt(this.f23736a);
        Paint.FontMetricsInt fontMetricsInt2 = this.f23736a;
        this.f23740e = (Math.abs(fontMetricsInt2.descent - fontMetricsInt2.ascent) * 1.0f) / this.f23737b.e();
        this.f23739d = (short) (this.f23737b.e() * this.f23740e);
        short sI = (short) (this.f23737b.i() * this.f23740e);
        this.f23738c = sI;
        if (fontMetricsInt != null) {
            Paint.FontMetricsInt fontMetricsInt3 = this.f23736a;
            fontMetricsInt.ascent = fontMetricsInt3.ascent;
            fontMetricsInt.descent = fontMetricsInt3.descent;
            fontMetricsInt.top = fontMetricsInt3.top;
            fontMetricsInt.bottom = fontMetricsInt3.bottom;
        }
        return sI;
    }
}
