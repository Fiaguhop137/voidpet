package p223m7;

import android.text.TextPaint;
import android.text.style.CharacterStyle;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class o extends CharacterStyle implements i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final float f49171a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final float f49172b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final float f49173c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f49174d;

    public o(float f10, float f11, float f12, int i10) {
        this.f49171a = f10;
        this.f49172b = f11;
        this.f49173c = f12;
        this.f49174d = i10;
    }

    @Override // android.text.style.CharacterStyle
    public void updateDrawState(TextPaint textPaint) {
        Intrinsics.checkNotNullParameter(textPaint, "textPaint");
        textPaint.setShadowLayer(this.f49173c, this.f49171a, this.f49172b, this.f49174d);
    }
}
