package com.google.android.material.timepicker;

import Y8.k;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.view.Z;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import p297q9.g;
import p297q9.i;

/* JADX INFO: loaded from: classes2.dex */
abstract class d extends ConstraintLayout {

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private final Runnable f37230x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private int f37231y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private g f37232z;

    public d(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        LayoutInflater.from(context).inflate(Y8.g.f17154g, this);
        Z.q0(this, u());
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, k.f17537i5, i10, 0);
        this.f37231y = typedArrayObtainStyledAttributes.getDimensionPixelSize(k.f17546j5, 0);
        this.f37230x = new c(this);
        typedArrayObtainStyledAttributes.recycle();
    }

    private void A() {
        Handler handler = getHandler();
        if (handler != null) {
            handler.removeCallbacks(this.f37230x);
            handler.post(this.f37230x);
        }
    }

    private void t(List list, androidx.constraintlayout.widget.e eVar, int i10) {
        Iterator it = list.iterator();
        float size = 0.0f;
        while (it.hasNext()) {
            eVar.g(((View) it.next()).getId(), Y8.e.f17121c, i10, size);
            size += 360.0f / list.size();
        }
    }

    private Drawable u() {
        g gVar = new g();
        this.f37232z = gVar;
        gVar.U(new i(0.5f));
        this.f37232z.W(ColorStateList.valueOf(-1));
        return this.f37232z;
    }

    private static boolean y(View view) {
        return "skip".equals(view.getTag());
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.ViewGroup
    public void addView(View view, int i10, ViewGroup.LayoutParams layoutParams) {
        super.addView(view, i10, layoutParams);
        if (view.getId() == -1) {
            view.setId(Z.k());
        }
        A();
    }

    @Override // android.view.View
    protected void onFinishInflate() {
        super.onFinishInflate();
        z();
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.ViewGroup
    public void onViewRemoved(View view) {
        super.onViewRemoved(view);
        A();
    }

    @Override // android.view.View
    public void setBackgroundColor(int i10) {
        this.f37232z.W(ColorStateList.valueOf(i10));
    }

    int v(int i10) {
        return i10 == 2 ? Math.round(this.f37231y * 0.66f) : this.f37231y;
    }

    public int w() {
        return this.f37231y;
    }

    public void x(int i10) {
        this.f37231y = i10;
        z();
    }

    protected void z() {
        androidx.constraintlayout.widget.e eVar = new androidx.constraintlayout.widget.e();
        eVar.f(this);
        HashMap map = new HashMap();
        for (int i10 = 0; i10 < getChildCount(); i10++) {
            View childAt = getChildAt(i10);
            if (childAt.getId() != Y8.e.f17121c && !y(childAt)) {
                int i11 = (Integer) childAt.getTag(Y8.e.f17129k);
                if (i11 == null) {
                    i11 = 1;
                }
                if (!map.containsKey(i11)) {
                    map.put(i11, new ArrayList());
                }
                ((List) map.get(i11)).add(childAt);
            }
        }
        for (Map.Entry entry : map.entrySet()) {
            t((List) entry.getValue(), eVar, v(((Integer) entry.getKey()).intValue()));
        }
        eVar.c(this);
    }
}
