package androidx.appcompat.app;

import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Build;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import androidx.appcompat.widget.Toolbar;
import androidx.appcompat.widget.r0;
import androidx.lifecycle.V;
import androidx.lifecycle.W;
import p054d.B;

/* JADX INFO: loaded from: classes.dex */
public abstract class c extends androidx.fragment.app.j implements d, Y0.w.a {

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    private f f19991B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    private Resources f19992C;

    class a implements n3.f.b {
        a() {
        }

        @Override // n3.f.b
        public Bundle a() {
            Bundle bundle = new Bundle();
            c.this.o0().C(bundle);
            return bundle;
        }
    }

    class b implements p090f.b {
        b() {
        }

        @Override // p090f.b
        public void a(Context context) {
            f fVarO0 = c.this.o0();
            fVarO0.u();
            fVarO0.y(c.this.i().a("androidx:appcompat"));
        }
    }

    public c() {
        q0();
    }

    private void q0() {
        i().c("androidx:appcompat", new a());
        R(new b());
    }

    private void r0() {
        V.b(getWindow().getDecorView(), this);
        W.b(getWindow().getDecorView(), this);
        p237n3.m.b(getWindow().getDecorView(), this);
        B.a(getWindow().getDecorView(), this);
    }

    private boolean y0(KeyEvent keyEvent) {
        Window window;
        return (Build.VERSION.SDK_INT >= 26 || keyEvent.isCtrlPressed() || KeyEvent.metaStateHasNoModifiers(keyEvent.getMetaState()) || keyEvent.getRepeatCount() != 0 || KeyEvent.isModifierKey(keyEvent.getKeyCode()) || (window = getWindow()) == null || window.getDecorView() == null || !window.getDecorView().dispatchKeyShortcutEvent(keyEvent)) ? false : true;
    }

    public void A0(Intent intent) {
        Y0.j.e(this, intent);
    }

    public boolean B0(Intent intent) {
        return Y0.j.f(this, intent);
    }

    @Override // p054d.j, android.app.Activity
    public void addContentView(View view, ViewGroup.LayoutParams layoutParams) {
        r0();
        o0().e(view, layoutParams);
    }

    @Override // android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    protected void attachBaseContext(Context context) {
        super.attachBaseContext(o0().i(context));
    }

    @Override // android.app.Activity
    public void closeOptionsMenu() {
        AbstractC1812a abstractC1812aP0 = p0();
        if (getWindow().hasFeature(0)) {
            if (abstractC1812aP0 == null || !abstractC1812aP0.f()) {
                super.closeOptionsMenu();
            }
        }
    }

    @Override // Y0.h, android.app.Activity, android.view.Window.Callback
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        int keyCode = keyEvent.getKeyCode();
        AbstractC1812a abstractC1812aP0 = p0();
        if (keyCode == 82 && abstractC1812aP0 != null && abstractC1812aP0.o(keyEvent)) {
            return true;
        }
        return super.dispatchKeyEvent(keyEvent);
    }

    @Override // Y0.w.a
    public Intent f() {
        return Y0.j.a(this);
    }

    @Override // android.app.Activity
    public View findViewById(int i10) {
        return o0().l(i10);
    }

    @Override // android.app.Activity
    public MenuInflater getMenuInflater() {
        return o0().r();
    }

    @Override // android.view.ContextThemeWrapper, android.content.ContextWrapper, android.content.Context
    public Resources getResources() {
        if (this.f19992C == null && r0.c()) {
            this.f19992C = new r0(this, super.getResources());
        }
        Resources resources = this.f19992C;
        return resources == null ? super.getResources() : resources;
    }

    @Override // android.app.Activity
    public void invalidateOptionsMenu() {
        o0().v();
    }

    @Override // androidx.appcompat.app.d
    public void n(androidx.appcompat.view.b bVar) {
    }

    @Override // androidx.appcompat.app.d
    public void o(androidx.appcompat.view.b bVar) {
    }

    public f o0() {
        if (this.f19991B == null) {
            this.f19991B = f.j(this, this);
        }
        return this.f19991B;
    }

    @Override // p054d.j, android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        o0().x(configuration);
        if (this.f19992C != null) {
            this.f19992C.updateConfiguration(super.getResources().getConfiguration(), super.getResources().getDisplayMetrics());
        }
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public void onContentChanged() {
        w0();
    }

    @Override // androidx.fragment.app.j, android.app.Activity
    protected void onDestroy() {
        super.onDestroy();
        o0().z();
    }

    @Override // android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i10, KeyEvent keyEvent) {
        if (y0(keyEvent)) {
            return true;
        }
        return super.onKeyDown(i10, keyEvent);
    }

    @Override // androidx.fragment.app.j, p054d.j, android.app.Activity, android.view.Window.Callback
    public final boolean onMenuItemSelected(int i10, MenuItem menuItem) {
        if (super.onMenuItemSelected(i10, menuItem)) {
            return true;
        }
        AbstractC1812a abstractC1812aP0 = p0();
        if (menuItem.getItemId() != 16908332 || abstractC1812aP0 == null || (abstractC1812aP0.i() & 4) == 0) {
            return false;
        }
        return x0();
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean onMenuOpened(int i10, Menu menu) {
        return super.onMenuOpened(i10, menu);
    }

    @Override // p054d.j, android.app.Activity, android.view.Window.Callback
    public void onPanelClosed(int i10, Menu menu) {
        super.onPanelClosed(i10, menu);
    }

    @Override // android.app.Activity
    protected void onPostCreate(Bundle bundle) {
        super.onPostCreate(bundle);
        o0().A(bundle);
    }

    @Override // androidx.fragment.app.j, android.app.Activity
    protected void onPostResume() {
        super.onPostResume();
        o0().B();
    }

    @Override // androidx.fragment.app.j, android.app.Activity
    protected void onStart() {
        super.onStart();
        o0().D();
    }

    @Override // androidx.fragment.app.j, android.app.Activity
    protected void onStop() {
        super.onStop();
        o0().E();
    }

    @Override // android.app.Activity
    protected void onTitleChanged(CharSequence charSequence, int i10) {
        super.onTitleChanged(charSequence, i10);
        o0().P(charSequence);
    }

    @Override // android.app.Activity
    public void openOptionsMenu() {
        AbstractC1812a abstractC1812aP0 = p0();
        if (getWindow().hasFeature(0)) {
            if (abstractC1812aP0 == null || !abstractC1812aP0.p()) {
                super.openOptionsMenu();
            }
        }
    }

    public AbstractC1812a p0() {
        return o0().t();
    }

    public void s0(Y0.w wVar) {
        wVar.c(this);
    }

    @Override // p054d.j, android.app.Activity
    public void setContentView(int i10) {
        r0();
        o0().I(i10);
    }

    @Override // p054d.j, android.app.Activity
    public void setContentView(View view) {
        r0();
        o0().J(view);
    }

    @Override // p054d.j, android.app.Activity
    public void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        r0();
        o0().K(view, layoutParams);
    }

    @Override // android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper, android.content.Context
    public void setTheme(int i10) {
        super.setTheme(i10);
        o0().O(i10);
    }

    protected void t0(p128h1.i iVar) {
    }

    @Override // androidx.appcompat.app.d
    public androidx.appcompat.view.b u(androidx.appcompat.view.b.a aVar) {
        return null;
    }

    protected void u0(int i10) {
    }

    public void v0(Y0.w wVar) {
    }

    public void w0() {
    }

    public boolean x0() {
        Intent intentF = f();
        if (intentF == null) {
            return false;
        }
        if (!B0(intentF)) {
            A0(intentF);
            return true;
        }
        Y0.w wVarG = Y0.w.g(this);
        s0(wVarG);
        v0(wVarG);
        wVarG.h();
        try {
            Y0.b.q(this);
            return true;
        } catch (IllegalStateException unused) {
            finish();
            return true;
        }
    }

    public void z0(Toolbar toolbar) {
        o0().N(toolbar);
    }
}
