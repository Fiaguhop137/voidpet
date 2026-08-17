package androidx.appcompat.app;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.ViewGroup;

/* JADX INFO: renamed from: androidx.appcompat.app.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1812a {

    /* JADX INFO: renamed from: androidx.appcompat.app.a$a, reason: collision with other inner class name */
    public static class C0251a extends ViewGroup.MarginLayoutParams {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f19987a;

        public C0251a(int i10, int i11) {
            super(i10, i11);
            this.f19987a = 8388627;
        }

        public C0251a(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f19987a = 0;
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, p144i.j.f43464t);
            this.f19987a = typedArrayObtainStyledAttributes.getInt(p144i.j.f43469u, 0);
            typedArrayObtainStyledAttributes.recycle();
        }

        public C0251a(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.f19987a = 0;
        }

        public C0251a(C0251a c0251a) {
            super((ViewGroup.MarginLayoutParams) c0251a);
            this.f19987a = 0;
            this.f19987a = c0251a.f19987a;
        }
    }

    public boolean f() {
        return false;
    }

    public abstract boolean g();

    public abstract void h(boolean z10);

    public abstract int i();

    public abstract Context j();

    public boolean k() {
        return false;
    }

    public void l(Configuration configuration) {
    }

    void m() {
    }

    public abstract boolean n(int i10, KeyEvent keyEvent);

    public boolean o(KeyEvent keyEvent) {
        return false;
    }

    public boolean p() {
        return false;
    }

    public abstract void q(boolean z10);

    public abstract void r(boolean z10);

    public abstract void s(Drawable drawable);

    public abstract void t(boolean z10);

    public abstract void u(CharSequence charSequence);

    public abstract void v(CharSequence charSequence);

    public androidx.appcompat.view.b w(androidx.appcompat.view.b.a aVar) {
        return null;
    }
}
