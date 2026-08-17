package androidx.appcompat.view;

import android.content.Context;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import java.util.ArrayList;
import p323s.f0;

/* JADX INFO: loaded from: classes.dex */
public class f extends ActionMode {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final Context f20176a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final b f20177b;

    public static class a implements b.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final ActionMode.Callback f20178a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final Context f20179b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final ArrayList f20180c = new ArrayList();

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final f0 f20181d = new f0();

        public a(Context context, ActionMode.Callback callback) {
            this.f20179b = context;
            this.f20178a = callback;
        }

        private Menu f(Menu menu) {
            Menu menu2 = (Menu) this.f20181d.get(menu);
            if (menu2 != null) {
                return menu2;
            }
            p233n.d dVar = new p233n.d(this.f20179b, (p074e1.a) menu);
            this.f20181d.put(menu, dVar);
            return dVar;
        }

        @Override // androidx.appcompat.view.b.a
        public void a(b bVar) {
            this.f20178a.onDestroyActionMode(e(bVar));
        }

        @Override // androidx.appcompat.view.b.a
        public boolean b(b bVar, Menu menu) {
            return this.f20178a.onCreateActionMode(e(bVar), f(menu));
        }

        @Override // androidx.appcompat.view.b.a
        public boolean c(b bVar, MenuItem menuItem) {
            return this.f20178a.onActionItemClicked(e(bVar), new p233n.c(this.f20179b, (p074e1.b) menuItem));
        }

        @Override // androidx.appcompat.view.b.a
        public boolean d(b bVar, Menu menu) {
            return this.f20178a.onPrepareActionMode(e(bVar), f(menu));
        }

        public ActionMode e(b bVar) {
            int size = this.f20180c.size();
            for (int i10 = 0; i10 < size; i10++) {
                f fVar = (f) this.f20180c.get(i10);
                if (fVar != null && fVar.f20177b == bVar) {
                    return fVar;
                }
            }
            f fVar2 = new f(this.f20179b, bVar);
            this.f20180c.add(fVar2);
            return fVar2;
        }
    }

    public f(Context context, b bVar) {
        this.f20176a = context;
        this.f20177b = bVar;
    }

    @Override // android.view.ActionMode
    public void finish() {
        this.f20177b.c();
    }

    @Override // android.view.ActionMode
    public View getCustomView() {
        return this.f20177b.d();
    }

    @Override // android.view.ActionMode
    public Menu getMenu() {
        return new p233n.d(this.f20176a, (p074e1.a) this.f20177b.e());
    }

    @Override // android.view.ActionMode
    public MenuInflater getMenuInflater() {
        return this.f20177b.f();
    }

    @Override // android.view.ActionMode
    public CharSequence getSubtitle() {
        return this.f20177b.g();
    }

    @Override // android.view.ActionMode
    public Object getTag() {
        return this.f20177b.h();
    }

    @Override // android.view.ActionMode
    public CharSequence getTitle() {
        return this.f20177b.i();
    }

    @Override // android.view.ActionMode
    public boolean getTitleOptionalHint() {
        return this.f20177b.j();
    }

    @Override // android.view.ActionMode
    public void invalidate() {
        this.f20177b.k();
    }

    @Override // android.view.ActionMode
    public boolean isTitleOptional() {
        return this.f20177b.l();
    }

    @Override // android.view.ActionMode
    public void setCustomView(View view) {
        this.f20177b.m(view);
    }

    @Override // android.view.ActionMode
    public void setSubtitle(int i10) {
        this.f20177b.n(i10);
    }

    @Override // android.view.ActionMode
    public void setSubtitle(CharSequence charSequence) {
        this.f20177b.o(charSequence);
    }

    @Override // android.view.ActionMode
    public void setTag(Object obj) {
        this.f20177b.p(obj);
    }

    @Override // android.view.ActionMode
    public void setTitle(int i10) {
        this.f20177b.q(i10);
    }

    @Override // android.view.ActionMode
    public void setTitle(CharSequence charSequence) {
        this.f20177b.r(charSequence);
    }

    @Override // android.view.ActionMode
    public void setTitleOptionalHint(boolean z10) {
        this.f20177b.s(z10);
    }
}
