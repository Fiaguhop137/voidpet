package androidx.compose.ui.graphics;

import android.graphics.BlendMode;
import android.graphics.PorterDuff;

/* JADX INFO: loaded from: classes.dex */
public abstract class a {
    public static final BlendMode a(int i10) {
        c.a aVar = c.f21453a;
        if (c.E(i10, aVar.a())) {
            return BlendMode.CLEAR;
        }
        if (c.E(i10, aVar.x())) {
            return BlendMode.SRC;
        }
        if (c.E(i10, aVar.g())) {
            return BlendMode.DST;
        }
        if (c.E(i10, aVar.B())) {
            return BlendMode.SRC_OVER;
        }
        if (c.E(i10, aVar.k())) {
            return BlendMode.DST_OVER;
        }
        if (c.E(i10, aVar.z())) {
            return BlendMode.SRC_IN;
        }
        if (c.E(i10, aVar.i())) {
            return BlendMode.DST_IN;
        }
        if (c.E(i10, aVar.A())) {
            return BlendMode.SRC_OUT;
        }
        if (c.E(i10, aVar.j())) {
            return BlendMode.DST_OUT;
        }
        if (c.E(i10, aVar.y())) {
            return BlendMode.SRC_ATOP;
        }
        if (c.E(i10, aVar.h())) {
            return BlendMode.DST_ATOP;
        }
        if (c.E(i10, aVar.C())) {
            return BlendMode.XOR;
        }
        if (c.E(i10, aVar.t())) {
            return BlendMode.PLUS;
        }
        if (c.E(i10, aVar.q())) {
            return BlendMode.MODULATE;
        }
        if (c.E(i10, aVar.v())) {
            return BlendMode.SCREEN;
        }
        if (c.E(i10, aVar.s())) {
            return BlendMode.OVERLAY;
        }
        if (c.E(i10, aVar.e())) {
            return BlendMode.DARKEN;
        }
        if (c.E(i10, aVar.o())) {
            return BlendMode.LIGHTEN;
        }
        if (c.E(i10, aVar.d())) {
            return BlendMode.COLOR_DODGE;
        }
        if (c.E(i10, aVar.c())) {
            return BlendMode.COLOR_BURN;
        }
        if (c.E(i10, aVar.m())) {
            return BlendMode.HARD_LIGHT;
        }
        if (c.E(i10, aVar.w())) {
            return BlendMode.SOFT_LIGHT;
        }
        if (c.E(i10, aVar.f())) {
            return BlendMode.DIFFERENCE;
        }
        if (c.E(i10, aVar.l())) {
            return BlendMode.EXCLUSION;
        }
        if (c.E(i10, aVar.r())) {
            return BlendMode.MULTIPLY;
        }
        if (c.E(i10, aVar.n())) {
            return BlendMode.HUE;
        }
        if (c.E(i10, aVar.u())) {
            return BlendMode.SATURATION;
        }
        if (c.E(i10, aVar.b())) {
            return BlendMode.COLOR;
        }
        return c.E(i10, aVar.p()) ? BlendMode.LUMINOSITY : BlendMode.SRC_OVER;
    }

    public static final PorterDuff.Mode b(int i10) {
        c.a aVar = c.f21453a;
        if (c.E(i10, aVar.a())) {
            return PorterDuff.Mode.CLEAR;
        }
        if (c.E(i10, aVar.x())) {
            return PorterDuff.Mode.SRC;
        }
        if (c.E(i10, aVar.g())) {
            return PorterDuff.Mode.DST;
        }
        if (c.E(i10, aVar.B())) {
            return PorterDuff.Mode.SRC_OVER;
        }
        if (c.E(i10, aVar.k())) {
            return PorterDuff.Mode.DST_OVER;
        }
        if (c.E(i10, aVar.z())) {
            return PorterDuff.Mode.SRC_IN;
        }
        if (c.E(i10, aVar.i())) {
            return PorterDuff.Mode.DST_IN;
        }
        if (c.E(i10, aVar.A())) {
            return PorterDuff.Mode.SRC_OUT;
        }
        if (c.E(i10, aVar.j())) {
            return PorterDuff.Mode.DST_OUT;
        }
        if (c.E(i10, aVar.y())) {
            return PorterDuff.Mode.SRC_ATOP;
        }
        if (c.E(i10, aVar.h())) {
            return PorterDuff.Mode.DST_ATOP;
        }
        if (c.E(i10, aVar.C())) {
            return PorterDuff.Mode.XOR;
        }
        if (c.E(i10, aVar.t())) {
            return PorterDuff.Mode.ADD;
        }
        if (c.E(i10, aVar.v())) {
            return PorterDuff.Mode.SCREEN;
        }
        if (c.E(i10, aVar.s())) {
            return PorterDuff.Mode.OVERLAY;
        }
        if (c.E(i10, aVar.e())) {
            return PorterDuff.Mode.DARKEN;
        }
        if (c.E(i10, aVar.o())) {
            return PorterDuff.Mode.LIGHTEN;
        }
        return c.E(i10, aVar.q()) ? PorterDuff.Mode.MULTIPLY : PorterDuff.Mode.SRC_OVER;
    }
}
