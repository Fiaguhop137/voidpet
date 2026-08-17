package p223m7;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.text.style.ReplacementSpan;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class q extends ReplacementSpan implements i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f49176a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f49177b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f49178c;

    public q(int i10, int i11, int i12) {
        this.f49176a = i10;
        this.f49177b = i11;
        this.f49178c = i12;
    }

    public final int a() {
        return this.f49178c;
    }

    public final int b() {
        return this.f49176a;
    }

    public final int c() {
        return this.f49177b;
    }

    @Override // android.text.style.ReplacementSpan
    public void draw(Canvas canvas, CharSequence charSequence, int i10, int i11, float f10, int i12, int i13, int i14, Paint paint) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        Intrinsics.checkNotNullParameter(paint, "paint");
    }

    @Override // android.text.style.ReplacementSpan
    public int getSize(Paint paint, CharSequence charSequence, int i10, int i11, Paint.FontMetricsInt fontMetricsInt) {
        Intrinsics.checkNotNullParameter(paint, "paint");
        if (fontMetricsInt != null) {
            int i12 = -this.f49178c;
            fontMetricsInt.ascent = i12;
            fontMetricsInt.descent = 0;
            fontMetricsInt.top = i12;
            fontMetricsInt.bottom = 0;
        }
        return this.f49177b;
    }
}
