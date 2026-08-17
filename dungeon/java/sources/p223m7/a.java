package p223m7;

import android.text.TextPaint;
import android.text.style.MetricAffectingSpan;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class a extends MetricAffectingSpan implements i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final float f49153a;

    public a(float f10) {
        this.f49153a = f10;
    }

    private final void a(TextPaint textPaint) {
        if (Float.isNaN(this.f49153a)) {
            return;
        }
        textPaint.setLetterSpacing(this.f49153a);
    }

    public final float b() {
        return this.f49153a;
    }

    @Override // android.text.style.CharacterStyle
    public void updateDrawState(TextPaint paint) {
        Intrinsics.checkNotNullParameter(paint, "paint");
        a(paint);
    }

    @Override // android.text.style.MetricAffectingSpan
    public void updateMeasureState(TextPaint paint) {
        Intrinsics.checkNotNullParameter(paint, "paint");
        a(paint);
    }
}
