package p233n;

import android.content.Context;
import android.view.MenuItem;
import android.view.SubMenu;
import p323s.f0;

/* JADX INFO: loaded from: classes.dex */
abstract class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final Context f49424a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private f0 f49425b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private f0 f49426c;

    b(Context context) {
        this.f49424a = context;
    }

    final MenuItem c(MenuItem menuItem) {
        if (!(menuItem instanceof p074e1.b)) {
            return menuItem;
        }
        p074e1.b bVar = (p074e1.b) menuItem;
        if (this.f49425b == null) {
            this.f49425b = new f0();
        }
        MenuItem menuItem2 = (MenuItem) this.f49425b.get(bVar);
        if (menuItem2 != null) {
            return menuItem2;
        }
        c cVar = new c(this.f49424a, bVar);
        this.f49425b.put(bVar, cVar);
        return cVar;
    }

    final SubMenu d(SubMenu subMenu) {
        return subMenu;
    }

    final void e() {
        f0 f0Var = this.f49425b;
        if (f0Var != null) {
            f0Var.clear();
        }
        f0 f0Var2 = this.f49426c;
        if (f0Var2 != null) {
            f0Var2.clear();
        }
    }

    final void f(int i10) {
        if (this.f49425b == null) {
            return;
        }
        int i11 = 0;
        while (i11 < this.f49425b.size()) {
            if (((p074e1.b) this.f49425b.f(i11)).getGroupId() == i10) {
                this.f49425b.h(i11);
                i11--;
            }
            i11++;
        }
    }

    final void g(int i10) {
        if (this.f49425b == null) {
            return;
        }
        for (int i11 = 0; i11 < this.f49425b.size(); i11++) {
            if (((p074e1.b) this.f49425b.f(i11)).getItemId() == i10) {
                this.f49425b.h(i11);
                return;
            }
        }
    }
}
