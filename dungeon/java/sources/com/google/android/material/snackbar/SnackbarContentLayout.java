package com.google.android.material.snackbar;

import Y8.c;
import Y8.e;
import android.animation.TimeInterpolator;
import android.content.Context;
import android.text.Layout;
import android.util.AttributeSet;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.core.view.Z;
import p207l9.d;

/* JADX INFO: loaded from: classes2.dex */
public class SnackbarContentLayout extends LinearLayout {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private TextView f36940a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Button f36941b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final TimeInterpolator f36942c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f36943d;

    public SnackbarContentLayout(@NonNull Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f36942c = d.g(context, Y8.a.f16966N, Z8.a.f18802b);
    }

    private static void a(View view, int i10, int i11) {
        if (Z.T(view)) {
            Z.B0(view, Z.E(view), i10, Z.D(view), i11);
        } else {
            view.setPadding(view.getPaddingLeft(), i10, view.getPaddingRight(), i11);
        }
    }

    private boolean b(int i10, int i11, int i12) {
        boolean z10;
        if (i10 != getOrientation()) {
            setOrientation(i10);
            z10 = true;
        } else {
            z10 = false;
        }
        if (this.f36940a.getPaddingTop() == i11 && this.f36940a.getPaddingBottom() == i12) {
            return z10;
        }
        a(this.f36940a, i11, i12);
        return true;
    }

    public Button getActionView() {
        return this.f36941b;
    }

    public TextView getMessageView() {
        return this.f36940a;
    }

    @Override // android.view.View
    protected void onFinishInflate() {
        super.onFinishInflate();
        this.f36940a = (TextView) findViewById(e.f17109N);
        this.f36941b = (Button) findViewById(e.f17108M);
    }

    @Override // android.widget.LinearLayout, android.view.View
    protected void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        if (getOrientation() == 1) {
            return;
        }
        int dimensionPixelSize = getResources().getDimensionPixelSize(c.f17065l);
        int dimensionPixelSize2 = getResources().getDimensionPixelSize(c.f17063k);
        Layout layout = this.f36940a.getLayout();
        boolean z10 = layout != null && layout.getLineCount() > 1;
        if (!z10 || this.f36943d <= 0 || this.f36941b.getMeasuredWidth() <= this.f36943d) {
            if (!z10) {
                dimensionPixelSize = dimensionPixelSize2;
            }
            if (!b(0, dimensionPixelSize, dimensionPixelSize)) {
                return;
            }
        } else if (!b(1, dimensionPixelSize, dimensionPixelSize - dimensionPixelSize2)) {
            return;
        }
        super.onMeasure(i10, i11);
    }

    public void setMaxInlineActionWidth(int i10) {
        this.f36943d = i10;
    }
}
