package E0;

import android.text.TextPaint;
import android.text.style.CharacterStyle;

/* JADX INFO: loaded from: classes.dex */
public final class n extends CharacterStyle {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final boolean f2609a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final boolean f2610b;

    public n(boolean z10, boolean z11) {
        this.f2609a = z10;
        this.f2610b = z11;
    }

    @Override // android.text.style.CharacterStyle
    public void updateDrawState(TextPaint textPaint) {
        textPaint.setUnderlineText(this.f2609a);
        textPaint.setStrikeThruText(this.f2610b);
    }
}
