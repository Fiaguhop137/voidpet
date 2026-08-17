package androidx.appcompat.view;

import android.content.Context;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import androidx.appcompat.widget.ActionBarContextView;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes.dex */
public class e extends b implements androidx.appcompat.view.menu.e.a {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Context f20169c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private ActionBarContextView f20170d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private b.a f20171e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private WeakReference f20172f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private boolean f20173g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private boolean f20174h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private androidx.appcompat.view.menu.e f20175i;

    public e(Context context, ActionBarContextView actionBarContextView, b.a aVar, boolean z10) {
        this.f20169c = context;
        this.f20170d = actionBarContextView;
        this.f20171e = aVar;
        androidx.appcompat.view.menu.e eVarX = new androidx.appcompat.view.menu.e(actionBarContextView.getContext()).X(1);
        this.f20175i = eVarX;
        eVarX.W(this);
        this.f20174h = z10;
    }

    @Override // androidx.appcompat.view.menu.e.a
    public boolean a(androidx.appcompat.view.menu.e eVar, MenuItem menuItem) {
        return this.f20171e.c(this, menuItem);
    }

    @Override // androidx.appcompat.view.menu.e.a
    public void b(androidx.appcompat.view.menu.e eVar) {
        k();
        this.f20170d.l();
    }

    @Override // androidx.appcompat.view.b
    public void c() {
        if (this.f20173g) {
            return;
        }
        this.f20173g = true;
        this.f20171e.a(this);
    }

    @Override // androidx.appcompat.view.b
    public View d() {
        WeakReference weakReference = this.f20172f;
        if (weakReference != null) {
            return (View) weakReference.get();
        }
        return null;
    }

    @Override // androidx.appcompat.view.b
    public Menu e() {
        return this.f20175i;
    }

    @Override // androidx.appcompat.view.b
    public MenuInflater f() {
        return new g(this.f20170d.getContext());
    }

    @Override // androidx.appcompat.view.b
    public CharSequence g() {
        return this.f20170d.getSubtitle();
    }

    @Override // androidx.appcompat.view.b
    public CharSequence i() {
        return this.f20170d.getTitle();
    }

    @Override // androidx.appcompat.view.b
    public void k() {
        this.f20171e.d(this, this.f20175i);
    }

    @Override // androidx.appcompat.view.b
    public boolean l() {
        return this.f20170d.j();
    }

    @Override // androidx.appcompat.view.b
    public void m(View view) {
        this.f20170d.setCustomView(view);
        this.f20172f = view != null ? new WeakReference(view) : null;
    }

    @Override // androidx.appcompat.view.b
    public void n(int i10) {
        o(this.f20169c.getString(i10));
    }

    @Override // androidx.appcompat.view.b
    public void o(CharSequence charSequence) {
        this.f20170d.setSubtitle(charSequence);
    }

    @Override // androidx.appcompat.view.b
    public void q(int i10) {
        r(this.f20169c.getString(i10));
    }

    @Override // androidx.appcompat.view.b
    public void r(CharSequence charSequence) {
        this.f20170d.setTitle(charSequence);
    }

    @Override // androidx.appcompat.view.b
    public void s(boolean z10) {
        super.s(z10);
        this.f20170d.setTitleOptional(z10);
    }
}
