package J0;

import I.T1;
import I.d2;
import android.graphics.Paint;
import android.graphics.Shader;
import android.text.TextPaint;
import kotlin.jvm.internal.Intrinsics;
import p037c0.AbstractC2073b0;
import p037c0.K;
import p037c0.P;
import p037c0.Z;
import p037c0.m0;
import p037c0.n0;
import p037c0.v0;
import p037c0.w0;

/* JADX INFO: loaded from: classes.dex */
public final class i extends TextPaint {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private m0 f5655a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private M0.j f5656b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f5657c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private w0 f5658d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private Z f5659e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private P f5660f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private d2 f5661g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private p019b0.k f5662h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private p073e0.g f5663i;

    public i(int i10, float f10) {
        super(i10);
        ((TextPaint) this).density = f10;
        this.f5656b = M0.j.f6737b.b();
        this.f5657c = p073e0.f.f40217x1.a();
        this.f5658d = w0.f26744d.a();
    }

    private final void b() {
        this.f5661g = null;
        this.f5660f = null;
        this.f5662h = null;
        setShader(null);
    }

    private final m0 d() {
        m0 m0Var = this.f5655a;
        if (m0Var != null) {
            return m0Var;
        }
        m0 m0VarB = K.b(this);
        this.f5655a = m0VarB;
        return m0VarB;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Shader g(P p10, long j10) {
        return ((v0) p10).b(j10);
    }

    public final int c() {
        return this.f5657c;
    }

    public final void e(int i10) {
        if (androidx.compose.ui.graphics.c.E(i10, this.f5657c)) {
            return;
        }
        d().b(i10);
        this.f5657c = i10;
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0023  */
    /* JADX WARN: Code duplicated, block: B:16:0x002c  */
    /* JADX WARN: Code duplicated, block: B:18:0x002f  */
    public final void f(P p10, long j10, float f10) {
        if (p10 == null) {
            b();
            return;
        }
        if (!(p10 instanceof v0)) {
            throw new Ad.n();
        }
        if (Intrinsics.b(this.f5660f, p10)) {
            p019b0.k kVar = this.f5662h;
            if (!(kVar == null ? false : p019b0.k.f(kVar.m(), j10))) {
                if (j10 != 9205357640488583168L) {
                    this.f5660f = p10;
                    this.f5662h = p019b0.k.c(j10);
                    this.f5661g = T1.c(new h(p10, j10));
                }
            }
        } else {
            if (j10 != 9205357640488583168L) {
                this.f5660f = p10;
                this.f5662h = p019b0.k.c(j10);
                this.f5661g = T1.c(new h(p10, j10));
            }
        }
        m0 m0VarD = d();
        d2 d2Var = this.f5661g;
        m0VarD.A(d2Var != null ? (Shader) d2Var.getValue() : null);
        this.f5659e = null;
        j.a(this, f10);
    }

    public final void h(long j10) {
        Z z10 = this.f5659e;
        if (z10 == null ? false : Z.m(z10.u(), j10)) {
            return;
        }
        if (j10 != 16) {
            this.f5659e = Z.g(j10);
            setColor(AbstractC2073b0.g(j10));
            b();
        }
    }

    public final void i(p073e0.g gVar) {
        if (gVar == null || Intrinsics.b(this.f5663i, gVar)) {
            return;
        }
        this.f5663i = gVar;
        if (Intrinsics.b(gVar, p073e0.j.f40222a)) {
            setStyle(Paint.Style.FILL);
            return;
        }
        if (!(gVar instanceof p073e0.k)) {
            throw new Ad.n();
        }
        d().E(n0.f26724a.b());
        p073e0.k kVar = (p073e0.k) gVar;
        d().F(kVar.e());
        d().C(kVar.c());
        d().t(kVar.b());
        d().q(kVar.a());
        m0 m0VarD = d();
        kVar.d();
        m0VarD.w(null);
    }

    public final void j(w0 w0Var) {
        if (w0Var == null || Intrinsics.b(this.f5658d, w0Var)) {
            return;
        }
        this.f5658d = w0Var;
        if (Intrinsics.b(w0Var, w0.f26744d.a())) {
            clearShadowLayer();
        } else {
            setShadowLayer(K0.e.b(this.f5658d.b()), Float.intBitsToFloat((int) (this.f5658d.d() >> 32)), Float.intBitsToFloat((int) (this.f5658d.d() & 4294967295L)), AbstractC2073b0.g(this.f5658d.c()));
        }
    }

    public final void k(M0.j jVar) {
        if (jVar == null || Intrinsics.b(this.f5656b, jVar)) {
            return;
        }
        this.f5656b = jVar;
        M0.j.a aVar = M0.j.f6737b;
        setUnderlineText(jVar.d(aVar.c()));
        setStrikeThruText(this.f5656b.d(aVar.a()));
    }
}
