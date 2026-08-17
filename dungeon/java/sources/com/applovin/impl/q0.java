package com.applovin.impl;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewParent;
import android.widget.FrameLayout;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes.dex */
public final class q0 extends a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ r0 f28296a;

    public q0(r0 r0Var) {
        this.f28296a = r0Var;
    }

    public final void a(Activity activity) {
        if (!this.f28296a.b() || (activity instanceof o0)) {
            return;
        }
        View view = (View) this.f28296a.f28311c.get();
        if (view != null) {
            ViewParent parent = view.getParent();
            if (parent instanceof FrameLayout) {
                View viewFindViewById = activity.findViewById(16908290);
                if ((viewFindViewById instanceof FrameLayout) && parent == viewFindViewById) {
                    return;
                }
                r0 r0Var = this.f28296a;
                r0Var.getClass();
                view.setVisibility(8);
                ((FrameLayout) parent).removeView(view);
                r0Var.f28311c = new WeakReference(null);
            }
        }
        this.f28296a.a();
    }

    @Override // com.applovin.impl.a, android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
        if (activity instanceof n0) {
            p1.c(p1.f28288a, "Started Debugger");
            this.f28296a.getClass();
            WeakReference weakReference = r0.f28306f;
            if (weakReference == null || weakReference.get() == null || r0.f28306f.get() != activity) {
                n0 n0Var = (n0) activity;
                r0.f28306f = new WeakReference(n0Var);
                r0 r0Var = this.f28296a;
                p0 p0Var = r0Var.f28312d;
                r0Var.f28309a.getClass();
                n0Var.a(p0Var, p.a(p.f28247J));
            }
            r0.f28307g.set(false);
        }
    }

    @Override // com.applovin.impl.a, android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
        if (activity instanceof n0) {
            p1.c(p1.f28288a, "Debugger destroyed");
            r0.f28306f = null;
        }
    }

    @Override // com.applovin.impl.a, android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
        i3.a(false, new p184k4.k0(this, activity));
    }
}
