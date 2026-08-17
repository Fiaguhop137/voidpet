package androidx.appcompat.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.PopupWindow;

/* JADX INFO: renamed from: androidx.appcompat.widget.t, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
class C1831t extends PopupWindow {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final boolean f21110b = false;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private boolean f21111a;

    public C1831t(Context context, AttributeSet attributeSet, int i10, int i11) {
        super(context, attributeSet, i10, i11);
        a(context, attributeSet, i10, i11);
    }

    private void a(Context context, AttributeSet attributeSet, int i10, int i11) {
        h0 h0VarV = h0.v(context, attributeSet, p144i.j.f43363Y1, i10, i11);
        if (h0VarV.s(p144i.j.f43372a2)) {
            b(h0VarV.a(p144i.j.f43372a2, false));
        }
        setBackgroundDrawable(h0VarV.g(p144i.j.f43367Z1));
        h0VarV.x();
    }

    private void b(boolean z10) {
        if (f21110b) {
            this.f21111a = z10;
        } else {
            androidx.core.widget.h.a(this, z10);
        }
    }

    @Override // android.widget.PopupWindow
    public void showAsDropDown(View view, int i10, int i11) {
        if (f21110b && this.f21111a) {
            i11 -= view.getHeight();
        }
        super.showAsDropDown(view, i10, i11);
    }

    @Override // android.widget.PopupWindow
    public void showAsDropDown(View view, int i10, int i11, int i12) {
        if (f21110b && this.f21111a) {
            i11 -= view.getHeight();
        }
        super.showAsDropDown(view, i10, i11, i12);
    }

    @Override // android.widget.PopupWindow
    public void update(View view, int i10, int i11, int i12, int i13) {
        if (f21110b && this.f21111a) {
            i11 -= view.getHeight();
        }
        super.update(view, i10, i11, i12, i13);
    }
}
