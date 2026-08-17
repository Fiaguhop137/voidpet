package p223m7;

import android.graphics.Paint;
import android.text.style.LineHeightSpan;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class b implements LineHeightSpan, i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f49154a;

    public b(float f10) {
        this.f49154a = (int) Math.ceil(f10);
    }

    @Override // android.text.style.LineHeightSpan
    public void chooseHeight(CharSequence text, int i10, int i11, int i12, int i13, Paint.FontMetricsInt fm) {
        Intrinsics.checkNotNullParameter(text, "text");
        Intrinsics.checkNotNullParameter(fm, "fm");
        int i14 = this.f49154a;
        int i15 = fm.ascent;
        double d10 = (i14 - ((-i15) + fm.descent)) / 2.0f;
        fm.ascent = i15 - ((int) Math.ceil(d10));
        fm.descent += (int) Math.floor(d10);
        if (i10 == 0) {
            fm.top = fm.ascent;
        }
        if (i11 == text.length()) {
            fm.bottom = fm.descent;
        }
    }
}
