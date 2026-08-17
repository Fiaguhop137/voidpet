package androidx.core.view;

import android.animation.ValueAnimator;
import android.view.View;

/* JADX INFO: renamed from: androidx.core.view.i0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C1911i0 implements ValueAnimator.AnimatorUpdateListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ InterfaceC1919m0 f23219a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ View f23220b;

    public /* synthetic */ C1911i0(InterfaceC1919m0 interfaceC1919m0, View view) {
        this.f23219a = interfaceC1919m0;
        this.f23220b = view;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        this.f23219a.a(this.f23220b);
    }
}
