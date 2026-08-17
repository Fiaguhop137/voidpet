package com.google.android.material.transformation;

import android.content.Context;
import android.graphics.Rect;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;

/* JADX INFO: loaded from: classes2.dex */
@Deprecated
public abstract class FabTransformationBehavior extends ExpandableTransformationBehavior {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Rect f37242b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final RectF f37243c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final RectF f37244d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final int[] f37245e;

    public FabTransformationBehavior() {
        this.f37242b = new Rect();
        this.f37243c = new RectF();
        this.f37244d = new RectF();
        this.f37245e = new int[2];
    }

    public FabTransformationBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f37242b = new Rect();
        this.f37243c = new RectF();
        this.f37244d = new RectF();
        this.f37245e = new int[2];
    }

    @Override // com.google.android.material.transformation.ExpandableBehavior, androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public boolean e(CoordinatorLayout coordinatorLayout, View view, View view2) {
        if (view.getVisibility() != 8) {
            return false;
        }
        throw new IllegalStateException("This behavior cannot be attached to a GONE view. Set the view to INVISIBLE instead.");
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public void g(CoordinatorLayout.f fVar) {
        if (fVar.f23058h == 0) {
            fVar.f23058h = 80;
        }
    }
}
