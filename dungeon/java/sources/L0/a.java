package L0;

import Ad.n;
import android.graphics.Paint;
import android.text.TextPaint;
import android.text.style.CharacterStyle;
import android.text.style.UpdateAppearance;
import kotlin.jvm.internal.Intrinsics;
import p073e0.g;
import p073e0.j;
import p073e0.k;

/* JADX INFO: loaded from: classes.dex */
public final class a extends CharacterStyle implements UpdateAppearance {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final g f6261a;

    public a(g gVar) {
        this.f6261a = gVar;
    }

    @Override // android.text.style.CharacterStyle
    public void updateDrawState(TextPaint textPaint) {
        if (textPaint != null) {
            g gVar = this.f6261a;
            if (Intrinsics.b(gVar, j.f40222a)) {
                textPaint.setStyle(Paint.Style.FILL);
                return;
            }
            if (!(gVar instanceof k)) {
                throw new n();
            }
            textPaint.setStyle(Paint.Style.STROKE);
            textPaint.setStrokeWidth(((k) this.f6261a).e());
            textPaint.setStrokeMiter(((k) this.f6261a).c());
            textPaint.setStrokeJoin(b.b(((k) this.f6261a).b()));
            textPaint.setStrokeCap(b.a(((k) this.f6261a).a()));
            ((k) this.f6261a).d();
            textPaint.setPathEffect(null);
        }
    }
}
