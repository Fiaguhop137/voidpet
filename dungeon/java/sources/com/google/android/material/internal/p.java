package com.google.android.material.internal;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewParent;
import android.view.inputmethod.InputMethodManager;
import androidx.core.view.C0;
import androidx.core.view.H;
import androidx.core.view.Z;
import androidx.core.view.c1;

/* JADX INFO: loaded from: classes2.dex */
public abstract class p {

    class a implements H {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ c f36789a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ d f36790b;

        a(c cVar, d dVar) {
            this.f36789a = cVar;
            this.f36790b = dVar;
        }

        @Override // androidx.core.view.H
        public C0 a(View view, C0 c10) {
            return this.f36789a.a(view, c10, new d(this.f36790b));
        }
    }

    class b implements View.OnAttachStateChangeListener {
        b() {
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(View view) {
            view.removeOnAttachStateChangeListener(this);
            Z.j0(view);
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View view) {
        }
    }

    public interface c {
        C0 a(View view, C0 c10, d dVar);
    }

    public static class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f36791a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f36792b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f36793c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f36794d;

        public d(int i10, int i11, int i12, int i13) {
            this.f36791a = i10;
            this.f36792b = i11;
            this.f36793c = i12;
            this.f36794d = i13;
        }

        public d(d dVar) {
            this.f36791a = dVar.f36791a;
            this.f36792b = dVar.f36792b;
            this.f36793c = dVar.f36793c;
            this.f36794d = dVar.f36794d;
        }

        public void a(View view) {
            Z.B0(view, this.f36791a, this.f36792b, this.f36793c, this.f36794d);
        }
    }

    public static void b(View view, c cVar) {
        Z.A0(view, new a(cVar, new d(Z.E(view), view.getPaddingTop(), Z.D(view), view.getPaddingBottom())));
        i(view);
    }

    public static float c(Context context, int i10) {
        return TypedValue.applyDimension(1, i10, context.getResources().getDisplayMetrics());
    }

    public static Integer d(View view) {
        ColorStateList colorStateListF = com.google.android.material.drawable.d.f(view.getBackground());
        if (colorStateListF != null) {
            return Integer.valueOf(colorStateListF.getDefaultColor());
        }
        return null;
    }

    private static InputMethodManager e(View view) {
        return (InputMethodManager) Z0.b.j(view.getContext(), InputMethodManager.class);
    }

    public static float f(View view) {
        float fU = 0.0f;
        for (ViewParent parent = view.getParent(); parent instanceof View; parent = parent.getParent()) {
            fU += Z.u((View) parent);
        }
        return fU;
    }

    public static boolean g(View view) {
        return Z.z(view) == 1;
    }

    public static PorterDuff.Mode h(int i10, PorterDuff.Mode mode) {
        if (i10 == 3) {
            return PorterDuff.Mode.SRC_OVER;
        }
        if (i10 == 5) {
            return PorterDuff.Mode.SRC_IN;
        }
        if (i10 == 9) {
            return PorterDuff.Mode.SRC_ATOP;
        }
        switch (i10) {
            case 14:
                return PorterDuff.Mode.MULTIPLY;
            case 15:
                return PorterDuff.Mode.SCREEN;
            case 16:
                return PorterDuff.Mode.ADD;
            default:
                return mode;
        }
    }

    public static void i(View view) {
        if (Z.Q(view)) {
            Z.j0(view);
        } else {
            view.addOnAttachStateChangeListener(new b());
        }
    }

    public static void j(View view, boolean z10) {
        view.requestFocus();
        view.post(new o(view, z10));
    }

    public static void k(View view, boolean z10) {
        c1 c1VarJ;
        if (!z10 || (c1VarJ = Z.J(view)) == null) {
            e(view).showSoftInput(view, 1);
        } else {
            c1VarJ.h(C0.p.d());
        }
    }
}
