package com.google.android.material.internal;

import android.content.Context;
import android.os.Build;
import android.view.Window;
import androidx.core.view.AbstractC1921n0;
import p020b1.AbstractC2044c;

/* JADX INFO: loaded from: classes2.dex */
public abstract class c {
    public static void a(Window window, boolean z10, Integer num, Integer num2) {
        boolean z11 = num == null || num.intValue() == 0;
        boolean z12 = num2 == null || num2.intValue() == 0;
        if (z11 || z12) {
            int iB = p118g9.a.b(window.getContext(), 16842801, -16777216);
            if (z11) {
                num = Integer.valueOf(iB);
            }
            if (z12) {
                num2 = Integer.valueOf(iB);
            }
        }
        AbstractC1921n0.b(window, !z10);
        int iC = c(window.getContext(), z10);
        int iB2 = b(window.getContext(), z10);
        window.setStatusBarColor(iC);
        window.setNavigationBarColor(iB2);
        f(window, d(iC, p118g9.a.h(num.intValue())));
        e(window, d(iB2, p118g9.a.h(num2.intValue())));
    }

    private static int b(Context context, boolean z10) {
        if (z10 && Build.VERSION.SDK_INT < 27) {
            return AbstractC2044c.k(p118g9.a.b(context, 16843858, -16777216), 128);
        }
        if (z10) {
            return 0;
        }
        return p118g9.a.b(context, 16843858, -16777216);
    }

    private static int c(Context context, boolean z10) {
        if (z10) {
            return 0;
        }
        return p118g9.a.b(context, 16843857, -16777216);
    }

    private static boolean d(int i10, boolean z10) {
        if (p118g9.a.h(i10)) {
            return true;
        }
        return i10 == 0 && z10;
    }

    public static void e(Window window, boolean z10) {
        AbstractC1921n0.a(window, window.getDecorView()).e(z10);
    }

    public static void f(Window window, boolean z10) {
        AbstractC1921n0.a(window, window.getDecorView()).f(z10);
    }
}
