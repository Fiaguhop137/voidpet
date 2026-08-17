package com.facebook.react.views.scroll;

import android.view.MotionEvent;
import android.view.VelocityTracker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private VelocityTracker f30953a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private float f30954b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private float f30955c;

    public final void a(MotionEvent ev) {
        Intrinsics.checkNotNullParameter(ev, "ev");
        if (this.f30953a == null) {
            this.f30953a = VelocityTracker.obtain();
        }
        VelocityTracker velocityTracker = this.f30953a;
        if (velocityTracker != null) {
            velocityTracker.addMovement(ev);
            int action = ev.getAction() & 255;
            if (action == 1 || action == 3) {
                velocityTracker.computeCurrentVelocity(1);
                this.f30954b = velocityTracker.getXVelocity();
                this.f30955c = velocityTracker.getYVelocity();
                velocityTracker.recycle();
                this.f30953a = null;
            }
        }
    }

    public final float b() {
        return this.f30954b;
    }

    public final float c() {
        return this.f30955c;
    }
}
