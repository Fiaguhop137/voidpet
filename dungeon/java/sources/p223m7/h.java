package p223m7;

import Od.a;
import android.graphics.Color;
import android.text.TextPaint;
import android.text.style.CharacterStyle;
import android.text.style.UpdateAppearance;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class h extends CharacterStyle implements UpdateAppearance, i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final float f49164a;

    public h(float f10) {
        this.f49164a = f10;
    }

    @Override // android.text.style.CharacterStyle
    public void updateDrawState(TextPaint paint) {
        Intrinsics.checkNotNullParameter(paint, "paint");
        paint.setAlpha(a.c(Color.alpha(paint.getColor()) * this.f49164a));
        int i10 = paint.bgColor;
        if (i10 != 0) {
            paint.bgColor = Color.argb(a.c(Color.alpha(i10) * this.f49164a), Color.red(paint.bgColor), Color.green(paint.bgColor), Color.blue(paint.bgColor));
        }
    }
}
