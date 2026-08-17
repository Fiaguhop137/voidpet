package com.google.android.material.appbar;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;

/* JADX INFO: loaded from: classes2.dex */
abstract class f extends CoordinatorLayout.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private g f36147a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f36148b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f36149c;

    public f() {
        this.f36148b = 0;
        this.f36149c = 0;
    }

    public f(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f36148b = 0;
        this.f36149c = 0;
    }

    public int E() {
        g gVar = this.f36147a;
        if (gVar != null) {
            return gVar.b();
        }
        return 0;
    }

    protected void F(CoordinatorLayout coordinatorLayout, View view, int i10) {
        coordinatorLayout.K(view, i10);
    }

    public boolean G(int i10) {
        g gVar = this.f36147a;
        if (gVar != null) {
            return gVar.e(i10);
        }
        this.f36148b = i10;
        return false;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public boolean l(CoordinatorLayout coordinatorLayout, View view, int i10) {
        F(coordinatorLayout, view, i10);
        if (this.f36147a == null) {
            this.f36147a = new g(view);
        }
        this.f36147a.c();
        this.f36147a.a();
        int i11 = this.f36148b;
        if (i11 != 0) {
            this.f36147a.e(i11);
            this.f36148b = 0;
        }
        int i12 = this.f36149c;
        if (i12 == 0) {
            return true;
        }
        this.f36147a.d(i12);
        this.f36149c = 0;
        return true;
    }
}
