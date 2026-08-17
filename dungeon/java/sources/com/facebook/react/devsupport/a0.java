package com.facebook.react.devsupport;

import android.app.Activity;
import android.view.View;
import android.view.ViewGroup;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class a0 implements p312r6.h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final p456z6.e f29644a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private View f29645b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Z f29646c;

    public a0(p456z6.e devSupportManager) {
        Intrinsics.checkNotNullParameter(devSupportManager, "devSupportManager");
        this.f29644a = devSupportManager;
    }

    @Override // p312r6.h
    public boolean a() {
        Z z10 = this.f29646c;
        if (z10 != null) {
            return z10.isShowing();
        }
        return false;
    }

    @Override // p312r6.h
    public void b() {
        Z z10;
        if (a() && (z10 = this.f29646c) != null) {
            z10.dismiss();
        }
        View view = this.f29645b;
        ViewGroup viewGroup = (ViewGroup) (view != null ? view.getParent() : null);
        if (viewGroup != null) {
            viewGroup.removeView(this.f29645b);
        }
        this.f29646c = null;
    }

    @Override // p312r6.h
    public void c() {
        if (a() || !d()) {
            return;
        }
        Activity activityA = this.f29644a.a();
        if (activityA == null || activityA.isFinishing()) {
            p116g7.d.a("Unable to launch logbox because react activity is not available, here is the error that logbox would've displayed: ");
            return;
        }
        Z z10 = new Z(activityA, this.f29645b);
        this.f29646c = z10;
        z10.setCancelable(false);
        z10.show();
    }

    @Override // p312r6.h
    public boolean d() {
        return this.f29645b != null;
    }

    @Override // p312r6.h
    public void e(String appKey) {
        Intrinsics.checkNotNullParameter(appKey, "appKey");
        p240n6.a.b(Intrinsics.b(appKey, "LogBox"), "This surface manager can only create LogBox React application");
        View viewC = this.f29644a.c("LogBox");
        this.f29645b = viewC;
        if (viewC == null) {
            p116g7.d.a("Unable to launch logbox because react was unable to create the root view");
        }
    }

    @Override // p312r6.h
    public void f() {
        View view = this.f29645b;
        if (view != null) {
            this.f29644a.f(view);
            this.f29645b = null;
        }
    }
}
