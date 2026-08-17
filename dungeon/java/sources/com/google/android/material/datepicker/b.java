package com.google.android.material.datepicker;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.RippleDrawable;
import android.widget.TextView;
import androidx.core.view.Z;

/* JADX INFO: loaded from: classes2.dex */
final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Rect f36521a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ColorStateList f36522b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final ColorStateList f36523c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final ColorStateList f36524d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final int f36525e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final p297q9.k f36526f;

    private b(ColorStateList colorStateList, ColorStateList colorStateList2, ColorStateList colorStateList3, int i10, p297q9.k kVar, Rect rect) {
        p199l1.g.d(rect.left);
        p199l1.g.d(rect.top);
        p199l1.g.d(rect.right);
        p199l1.g.d(rect.bottom);
        this.f36521a = rect;
        this.f36522b = colorStateList2;
        this.f36523c = colorStateList;
        this.f36524d = colorStateList3;
        this.f36525e = i10;
        this.f36526f = kVar;
    }

    static b a(Context context, int i10) {
        p199l1.g.b(i10 != 0, "Cannot create a CalendarItemStyle with a styleResId of 0");
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(i10, Y8.k.f17224A3);
        Rect rect = new Rect(typedArrayObtainStyledAttributes.getDimensionPixelOffset(Y8.k.f17233B3, 0), typedArrayObtainStyledAttributes.getDimensionPixelOffset(Y8.k.f17251D3, 0), typedArrayObtainStyledAttributes.getDimensionPixelOffset(Y8.k.f17242C3, 0), typedArrayObtainStyledAttributes.getDimensionPixelOffset(Y8.k.f17260E3, 0));
        ColorStateList colorStateListA = p243n9.c.a(context, typedArrayObtainStyledAttributes, Y8.k.f17269F3);
        ColorStateList colorStateListA2 = p243n9.c.a(context, typedArrayObtainStyledAttributes, Y8.k.f17314K3);
        ColorStateList colorStateListA3 = p243n9.c.a(context, typedArrayObtainStyledAttributes, Y8.k.f17296I3);
        int dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(Y8.k.f17305J3, 0);
        p297q9.k kVarM = p297q9.k.b(context, typedArrayObtainStyledAttributes.getResourceId(Y8.k.f17278G3, 0), typedArrayObtainStyledAttributes.getResourceId(Y8.k.f17287H3, 0)).m();
        typedArrayObtainStyledAttributes.recycle();
        return new b(colorStateListA, colorStateListA2, colorStateListA3, dimensionPixelSize, kVarM, rect);
    }

    void b(TextView textView) {
        c(textView, null, null);
    }

    void c(TextView textView, ColorStateList colorStateList, ColorStateList colorStateList2) {
        p297q9.g gVar = new p297q9.g();
        p297q9.g gVar2 = new p297q9.g();
        gVar.setShapeAppearanceModel(this.f36526f);
        gVar2.setShapeAppearanceModel(this.f36526f);
        if (colorStateList == null) {
            colorStateList = this.f36523c;
        }
        gVar.W(colorStateList);
        gVar.b0(this.f36525e, this.f36524d);
        if (colorStateList2 == null) {
            colorStateList2 = this.f36522b;
        }
        textView.setTextColor(colorStateList2);
        RippleDrawable rippleDrawable = new RippleDrawable(this.f36522b.withAlpha(30), gVar, gVar2);
        Rect rect = this.f36521a;
        Z.q0(textView, new InsetDrawable((Drawable) rippleDrawable, rect.left, rect.top, rect.right, rect.bottom));
    }
}
