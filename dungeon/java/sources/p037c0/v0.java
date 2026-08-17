package p037c0;

import android.graphics.Shader;
import kotlin.jvm.internal.Intrinsics;
import p019b0.k;

/* JADX INFO: loaded from: classes.dex */
public abstract class v0 extends P {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private B0 f26741c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private long f26742d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private float[] f26743e;

    public v0() {
        super(null);
        this.f26742d = k.f25826b.a();
    }

    private final B0 c() {
        B0 b10 = this.f26741c;
        if (b10 != null) {
            return b10;
        }
        B0 b11 = new B0();
        this.f26741c = b11;
        return b11;
    }

    @Override // p037c0.P
    public final void a(long j10, m0 m0Var, float f10) {
        B0 b0C = this.f26741c;
        if (b0C == null || !k.f(this.f26742d, j10)) {
            if (k.k(j10)) {
                this.f26741c = null;
                this.f26742d = k.f25826b.a();
                b0C = null;
            } else {
                b0C = c();
                float[] fArr = this.f26743e;
                if (fArr != null) {
                    b0C.d(fArr);
                }
                b0C.c(b(j10));
                this.f26741c = b0C;
                this.f26742d = j10;
            }
        }
        long jE = m0Var.e();
        Z.a aVar = Z.f26696b;
        if (!Z.m(jE, aVar.a())) {
            m0Var.u(aVar.a());
        }
        if (!Intrinsics.b(m0Var.B(), b0C != null ? b0C.a() : null)) {
            m0Var.A(b0C != null ? b0C.a() : null);
        }
        if (m0Var.a() == f10) {
            return;
        }
        m0Var.d(f10);
    }

    public abstract Shader b(long j10);
}
