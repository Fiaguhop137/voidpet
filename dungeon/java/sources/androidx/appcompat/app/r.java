package androidx.appcompat.app;

import android.content.Context;
import android.os.Bundle;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.view.AbstractC1931t;
import androidx.lifecycle.V;
import p054d.B;

/* JADX INFO: loaded from: classes.dex */
public abstract class r extends p054d.r implements d {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private f f20112d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final AbstractC1931t.a f20113e;

    public r(Context context, int i10) {
        super(context, f(context, i10));
        this.f20113e = new q(this);
        f fVarE = e();
        fVarE.O(f(context, i10));
        fVarE.y(null);
    }

    private static int f(Context context, int i10) {
        if (i10 != 0) {
            return i10;
        }
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(p144i.a.f43096x, typedValue, true);
        return typedValue.resourceId;
    }

    private void g() {
        V.b(getWindow().getDecorView(), this);
        p237n3.m.b(getWindow().getDecorView(), this);
        B.a(getWindow().getDecorView(), this);
    }

    @Override // p054d.r, android.app.Dialog
    public void addContentView(View view, ViewGroup.LayoutParams layoutParams) {
        e().e(view, layoutParams);
    }

    @Override // android.app.Dialog, android.content.DialogInterface
    public void dismiss() {
        super.dismiss();
        e().z();
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return AbstractC1931t.e(this.f20113e, getWindow().getDecorView(), this, keyEvent);
    }

    public f e() {
        if (this.f20112d == null) {
            this.f20112d = f.k(this, this);
        }
        return this.f20112d;
    }

    @Override // android.app.Dialog
    public View findViewById(int i10) {
        return e().l(i10);
    }

    boolean h(KeyEvent keyEvent) {
        return super.dispatchKeyEvent(keyEvent);
    }

    @Override // android.app.Dialog
    public void invalidateOptionsMenu() {
        e().v();
    }

    public boolean j(int i10) {
        return e().H(i10);
    }

    @Override // androidx.appcompat.app.d
    public void n(androidx.appcompat.view.b bVar) {
    }

    @Override // androidx.appcompat.app.d
    public void o(androidx.appcompat.view.b bVar) {
    }

    @Override // p054d.r, android.app.Dialog
    protected void onCreate(Bundle bundle) {
        e().u();
        super.onCreate(bundle);
        e().y(bundle);
    }

    @Override // p054d.r, android.app.Dialog
    protected void onStop() {
        super.onStop();
        e().E();
    }

    @Override // p054d.r, android.app.Dialog
    public void setContentView(int i10) {
        g();
        e().I(i10);
    }

    @Override // p054d.r, android.app.Dialog
    public void setContentView(View view) {
        g();
        e().J(view);
    }

    @Override // p054d.r, android.app.Dialog
    public void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        g();
        e().K(view, layoutParams);
    }

    @Override // android.app.Dialog
    public void setTitle(int i10) {
        super.setTitle(i10);
        e().P(getContext().getString(i10));
    }

    @Override // android.app.Dialog
    public void setTitle(CharSequence charSequence) {
        super.setTitle(charSequence);
        e().P(charSequence);
    }

    @Override // androidx.appcompat.app.d
    public androidx.appcompat.view.b u(androidx.appcompat.view.b.a aVar) {
        return null;
    }
}
