package E0;

import android.text.TextPaint;
import android.text.style.CharacterStyle;

/* JADX INFO: loaded from: classes.dex */
public final class l extends CharacterStyle {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f2604a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final float f2605b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final float f2606c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final float f2607d;

    public l(int i10, float f10, float f11, float f12) {
        this.f2604a = i10;
        this.f2605b = f10;
        this.f2606c = f11;
        this.f2607d = f12;
    }

    @Override // android.text.style.CharacterStyle
    public void updateDrawState(TextPaint textPaint) {
        textPaint.setShadowLayer(this.f2607d, this.f2605b, this.f2606c, this.f2604a);
    }
}
