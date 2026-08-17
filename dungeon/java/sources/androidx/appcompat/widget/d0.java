package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.util.Log;
import android.util.TypedValue;
import android.view.View;
import p020b1.AbstractC2044c;

/* JADX INFO: loaded from: classes.dex */
public abstract class d0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final ThreadLocal f20973a = new ThreadLocal();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    static final int[] f20974b = {-16842910};

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    static final int[] f20975c = {16842908};

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    static final int[] f20976d = {16843518};

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    static final int[] f20977e = {16842919};

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    static final int[] f20978f = {16842912};

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    static final int[] f20979g = {16842913};

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    static final int[] f20980h = {-16842919, -16842908};

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    static final int[] f20981i = new int[0];

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final int[] f20982j = new int[1];

    public static void a(View view, Context context) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(p144i.j.f43490y0);
        try {
            if (!typedArrayObtainStyledAttributes.hasValue(p144i.j.f43263D0)) {
                Log.e("ThemeUtils", "View " + view.getClass() + " is an AppCompat widget that can only be used with a Theme.AppCompat theme (or descendant).");
            }
        } finally {
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    public static int b(Context context, int i10) {
        ColorStateList colorStateListE = e(context, i10);
        if (colorStateListE != null && colorStateListE.isStateful()) {
            return colorStateListE.getColorForState(f20974b, colorStateListE.getDefaultColor());
        }
        TypedValue typedValueF = f();
        context.getTheme().resolveAttribute(16842803, typedValueF, true);
        return d(context, i10, typedValueF.getFloat());
    }

    public static int c(Context context, int i10) {
        int[] iArr = f20982j;
        iArr[0] = i10;
        h0 h0VarU = h0.u(context, null, iArr);
        try {
            return h0VarU.b(0, 0);
        } finally {
            h0VarU.x();
        }
    }

    static int d(Context context, int i10, float f10) {
        int iC = c(context, i10);
        return AbstractC2044c.k(iC, Math.round(Color.alpha(iC) * f10));
    }

    public static ColorStateList e(Context context, int i10) {
        int[] iArr = f20982j;
        iArr[0] = i10;
        h0 h0VarU = h0.u(context, null, iArr);
        try {
            return h0VarU.c(0);
        } finally {
            h0VarU.x();
        }
    }

    private static TypedValue f() {
        ThreadLocal threadLocal = f20973a;
        TypedValue typedValue = (TypedValue) threadLocal.get();
        if (typedValue != null) {
            return typedValue;
        }
        TypedValue typedValue2 = new TypedValue();
        threadLocal.set(typedValue2);
        return typedValue2;
    }
}
