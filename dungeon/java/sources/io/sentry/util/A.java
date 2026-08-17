package io.sentry.util;

import io.sentry.g4;

/* JADX INFO: loaded from: classes3.dex */
public abstract class A {
    public static g4 a(g4 g4Var) {
        if (g4Var.c() != null) {
            return g4Var;
        }
        return new g4(g4Var.e(), g4Var.d(), b(null, g4Var.d(), g4Var.e()), g4Var.b(), g4Var.a());
    }

    public static Double b(Double d10, Double d11, Boolean bool) {
        if (d10 != null) {
            return d10;
        }
        double dC = B.a().c();
        if (d11 == null || bool == null) {
            return Double.valueOf(dC);
        }
        return bool.booleanValue() ? Double.valueOf(dC * d11.doubleValue()) : Double.valueOf(d11.doubleValue() + (dC * (1.0d - d11.doubleValue())));
    }

    public static boolean c(Double d10) {
        return e(d10, true);
    }

    public static boolean d(Double d10) {
        return e(d10, true);
    }

    private static boolean e(Double d10, boolean z10) {
        if (d10 == null) {
            return z10;
        }
        return !d10.isNaN() && d10.doubleValue() >= 0.0d && d10.doubleValue() <= 1.0d;
    }

    public static boolean f(Double d10) {
        return e(d10, true);
    }

    public static boolean g(Double d10) {
        return h(d10, true);
    }

    public static boolean h(Double d10, boolean z10) {
        return e(d10, z10);
    }
}
