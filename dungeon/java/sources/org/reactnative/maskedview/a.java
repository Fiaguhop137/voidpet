package org.reactnative.maskedview;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.view.View;
import com.facebook.react.views.view.g;

/* JADX INFO: loaded from: classes3.dex */
public class a extends g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Bitmap f50706a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f50707b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Paint f50708c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private PorterDuffXfermode f50709d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f50710e;

    public a(Context context) {
        super(context);
        this.f50706a = null;
        this.f50707b = false;
        this.f50710e = 2;
        this.f50708c = new Paint(1);
        this.f50709d = new PorterDuffXfermode(PorterDuff.Mode.DST_IN);
    }

    public static Bitmap v(View view) {
        view.layout(0, 0, view.getMeasuredWidth(), view.getMeasuredHeight());
        if (view.getMeasuredWidth() <= 0 || view.getMeasuredHeight() <= 0) {
            return null;
        }
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(view.getMeasuredWidth(), view.getMeasuredHeight(), Bitmap.Config.ARGB_8888);
        view.draw(new Canvas(bitmapCreateBitmap));
        return bitmapCreateBitmap;
    }

    private void w() {
        View childAt = getChildAt(0);
        if (childAt != null) {
            childAt.setVisibility(0);
            Bitmap bitmap = this.f50706a;
            if (bitmap != null) {
                bitmap.recycle();
            }
            this.f50706a = v(childAt);
            childAt.setVisibility(4);
        }
    }

    @Override // com.facebook.react.views.view.g, android.view.ViewGroup, android.view.View
    protected void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        if (this.f50707b) {
            w();
            this.f50707b = false;
        }
        if (this.f50706a != null) {
            setLayerType(this.f50710e, this.f50708c);
            this.f50708c.setXfermode(this.f50709d);
            canvas.drawBitmap(this.f50706a, 0.0f, 0.0f, this.f50708c);
            this.f50708c.setXfermode(null);
        }
    }

    @Override // com.facebook.react.views.view.g, android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f50707b = true;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void onDescendantInvalidated(View view, View view2) {
        View childAt;
        super.onDescendantInvalidated(view, view2);
        if (!this.f50707b && (childAt = getChildAt(0)) != null && childAt.equals(view)) {
            this.f50707b = true;
        }
        invalidate();
    }

    @Override // com.facebook.react.views.view.g, android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        if (z10) {
            this.f50707b = true;
        }
    }

    public void setRenderingMode(String str) {
        this.f50710e = str.equals("software") ? 1 : 2;
    }
}
