package p054d;

import android.app.Dialog;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.window.OnBackInvokedDispatcher;
import androidx.lifecycle.AbstractC1987j;
import androidx.lifecycle.C1995s;
import androidx.lifecycle.InterfaceC1994q;
import androidx.lifecycle.V;
import kotlin.jvm.internal.Intrinsics;
import p237n3.f;
import p237n3.h;
import p237n3.i;
import p237n3.m;

/* JADX INFO: loaded from: classes.dex */
public class r extends Dialog implements InterfaceC1994q, y, i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private C1995s f39466a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final h f39467b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final w f39468c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(Context context, int i10) {
        super(context, i10);
        Intrinsics.checkNotNullParameter(context, "context");
        this.f39467b = h.f49899c.b(this);
        this.f39468c = new w(new q(this));
    }

    private final C1995s b() {
        C1995s c1995s = this.f39466a;
        if (c1995s != null) {
            return c1995s;
        }
        C1995s c1995s2 = new C1995s(this);
        this.f39466a = c1995s2;
        return c1995s2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void d(r this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        super.onBackPressed();
    }

    @Override // android.app.Dialog
    public void addContentView(View view, ViewGroup.LayoutParams layoutParams) {
        Intrinsics.checkNotNullParameter(view, "view");
        c();
        super.addContentView(view, layoutParams);
    }

    public void c() {
        Window window = getWindow();
        Intrinsics.c(window);
        View decorView = window.getDecorView();
        Intrinsics.checkNotNullExpressionValue(decorView, "window!!.decorView");
        V.b(decorView, this);
        Window window2 = getWindow();
        Intrinsics.c(window2);
        View decorView2 = window2.getDecorView();
        Intrinsics.checkNotNullExpressionValue(decorView2, "window!!.decorView");
        B.a(decorView2, this);
        Window window3 = getWindow();
        Intrinsics.c(window3);
        View decorView3 = window3.getDecorView();
        Intrinsics.checkNotNullExpressionValue(decorView3, "window!!.decorView");
        m.b(decorView3, this);
    }

    @Override // p237n3.i
    public f i() {
        return this.f39467b.b();
    }

    @Override // android.app.Dialog
    public void onBackPressed() {
        this.f39468c.k();
    }

    @Override // android.app.Dialog
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (Build.VERSION.SDK_INT >= 33) {
            w wVar = this.f39468c;
            OnBackInvokedDispatcher onBackInvokedDispatcher = getOnBackInvokedDispatcher();
            Intrinsics.checkNotNullExpressionValue(onBackInvokedDispatcher, "onBackInvokedDispatcher");
            wVar.n(onBackInvokedDispatcher);
        }
        this.f39467b.d(bundle);
        b().i(AbstractC1987j.a.ON_CREATE);
    }

    @Override // android.app.Dialog
    public Bundle onSaveInstanceState() {
        Bundle bundleOnSaveInstanceState = super.onSaveInstanceState();
        Intrinsics.checkNotNullExpressionValue(bundleOnSaveInstanceState, "super.onSaveInstanceState()");
        this.f39467b.e(bundleOnSaveInstanceState);
        return bundleOnSaveInstanceState;
    }

    @Override // android.app.Dialog
    protected void onStart() {
        super.onStart();
        b().i(AbstractC1987j.a.ON_RESUME);
    }

    @Override // android.app.Dialog
    protected void onStop() {
        b().i(AbstractC1987j.a.ON_DESTROY);
        this.f39466a = null;
        super.onStop();
    }

    @Override // p054d.y
    public final w p() {
        return this.f39468c;
    }

    @Override // android.app.Dialog
    public void setContentView(int i10) {
        c();
        super.setContentView(i10);
    }

    @Override // android.app.Dialog
    public void setContentView(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        c();
        super.setContentView(view);
    }

    @Override // android.app.Dialog
    public void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        Intrinsics.checkNotNullParameter(view, "view");
        c();
        super.setContentView(view, layoutParams);
    }

    @Override // androidx.lifecycle.InterfaceC1994q
    public AbstractC1987j y() {
        return b();
    }
}
