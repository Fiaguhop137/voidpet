package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.util.AttributeSet;
import android.widget.ImageView;

/* JADX INFO: loaded from: classes.dex */
public class r extends ImageView {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final C1817e f21098a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final C1829q f21099b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f21100c;

    public r(Context context) {
        this(context, null);
    }

    public r(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public r(Context context, AttributeSet attributeSet, int i10) {
        super(e0.b(context), attributeSet, i10);
        this.f21100c = false;
        d0.a(this, getContext());
        C1817e c1817e = new C1817e(this);
        this.f21098a = c1817e;
        c1817e.e(attributeSet, i10);
        C1829q c1829q = new C1829q(this);
        this.f21099b = c1829q;
        c1829q.g(attributeSet, i10);
    }

    @Override // android.widget.ImageView, android.view.View
    protected void drawableStateChanged() {
        super.drawableStateChanged();
        C1817e c1817e = this.f21098a;
        if (c1817e != null) {
            c1817e.b();
        }
        C1829q c1829q = this.f21099b;
        if (c1829q != null) {
            c1829q.c();
        }
    }

    public ColorStateList getSupportBackgroundTintList() {
        C1817e c1817e = this.f21098a;
        if (c1817e != null) {
            return c1817e.c();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        C1817e c1817e = this.f21098a;
        if (c1817e != null) {
            return c1817e.d();
        }
        return null;
    }

    public ColorStateList getSupportImageTintList() {
        C1829q c1829q = this.f21099b;
        if (c1829q != null) {
            return c1829q.d();
        }
        return null;
    }

    public PorterDuff.Mode getSupportImageTintMode() {
        C1829q c1829q = this.f21099b;
        if (c1829q != null) {
            return c1829q.e();
        }
        return null;
    }

    @Override // android.widget.ImageView, android.view.View
    public boolean hasOverlappingRendering() {
        return this.f21099b.f() && super.hasOverlappingRendering();
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C1817e c1817e = this.f21098a;
        if (c1817e != null) {
            c1817e.f(drawable);
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i10) {
        super.setBackgroundResource(i10);
        C1817e c1817e = this.f21098a;
        if (c1817e != null) {
            c1817e.g(i10);
        }
    }

    @Override // android.widget.ImageView
    public void setImageBitmap(Bitmap bitmap) {
        super.setImageBitmap(bitmap);
        C1829q c1829q = this.f21099b;
        if (c1829q != null) {
            c1829q.c();
        }
    }

    @Override // android.widget.ImageView
    public void setImageDrawable(Drawable drawable) {
        C1829q c1829q = this.f21099b;
        if (c1829q != null && drawable != null && !this.f21100c) {
            c1829q.h(drawable);
        }
        super.setImageDrawable(drawable);
        C1829q c1829q2 = this.f21099b;
        if (c1829q2 != null) {
            c1829q2.c();
            if (this.f21100c) {
                return;
            }
            this.f21099b.b();
        }
    }

    @Override // android.widget.ImageView
    public void setImageLevel(int i10) {
        super.setImageLevel(i10);
        this.f21100c = true;
    }

    @Override // android.widget.ImageView
    public void setImageResource(int i10) {
        C1829q c1829q = this.f21099b;
        if (c1829q != null) {
            c1829q.i(i10);
        }
    }

    @Override // android.widget.ImageView
    public void setImageURI(Uri uri) {
        super.setImageURI(uri);
        C1829q c1829q = this.f21099b;
        if (c1829q != null) {
            c1829q.c();
        }
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        C1817e c1817e = this.f21098a;
        if (c1817e != null) {
            c1817e.i(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        C1817e c1817e = this.f21098a;
        if (c1817e != null) {
            c1817e.j(mode);
        }
    }

    public void setSupportImageTintList(ColorStateList colorStateList) {
        C1829q c1829q = this.f21099b;
        if (c1829q != null) {
            c1829q.j(colorStateList);
        }
    }

    public void setSupportImageTintMode(PorterDuff.Mode mode) {
        C1829q c1829q = this.f21099b;
        if (c1829q != null) {
            c1829q.k(mode);
        }
    }
}
