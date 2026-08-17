package com.google.android.material.navigation;

import android.content.Context;
import android.view.MenuItem;
import android.view.SubMenu;
import androidx.appcompat.view.menu.g;

/* JADX INFO: loaded from: classes2.dex */
public final class c extends androidx.appcompat.view.menu.e {

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    private final Class f36835B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    private final int f36836C;

    public c(Context context, Class cls, int i10) {
        super(context);
        this.f36835B = cls;
        this.f36836C = i10;
    }

    @Override // androidx.appcompat.view.menu.e
    protected MenuItem a(int i10, int i11, int i12, CharSequence charSequence) {
        if (size() + 1 <= this.f36836C) {
            i0();
            MenuItem menuItemA = super.a(i10, i11, i12, charSequence);
            if (menuItemA instanceof g) {
                ((g) menuItemA).t(true);
            }
            h0();
            return menuItemA;
        }
        String simpleName = this.f36835B.getSimpleName();
        throw new IllegalArgumentException("Maximum number of items supported by " + simpleName + " is " + this.f36836C + ". Limit can be checked with " + simpleName + "#getMaxItemCount()");
    }

    @Override // androidx.appcompat.view.menu.e, android.view.Menu
    public SubMenu addSubMenu(int i10, int i11, int i12, CharSequence charSequence) {
        throw new UnsupportedOperationException(this.f36835B.getSimpleName() + " does not support submenus");
    }
}
