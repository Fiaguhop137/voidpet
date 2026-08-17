package L0;

import I.A0;
import I.T1;
import I.X1;
import I.d2;
import J0.j;
import android.graphics.Shader;
import android.text.TextPaint;
import android.text.style.CharacterStyle;
import android.text.style.UpdateAppearance;
import p019b0.k;
import p037c0.v0;

/* JADX INFO: loaded from: classes.dex */
public final class d extends CharacterStyle implements UpdateAppearance {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final v0 f6263a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final float f6264b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final A0 f6265c = X1.d(k.c(k.f25826b.a()), null, 2, null);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final d2 f6266d = T1.c(new c(this));

    public d(v0 v0Var, float f10) {
        this.f6263a = v0Var;
        this.f6264b = f10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Shader d(d dVar) {
        if (dVar.b() == 9205357640488583168L || k.k(dVar.b())) {
            return null;
        }
        return dVar.f6263a.b(dVar.b());
    }

    public final long b() {
        return ((k) this.f6265c.getValue()).m();
    }

    public final void c(long j10) {
        this.f6265c.setValue(k.c(j10));
    }

    @Override // android.text.style.CharacterStyle
    public void updateDrawState(TextPaint textPaint) {
        j.a(textPaint, this.f6264b);
        textPaint.setShader((Shader) this.f6266d.getValue());
    }
}
