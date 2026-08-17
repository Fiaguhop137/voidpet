package com.swmansion.reanimated.layoutReanimation;

import android.view.View;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class f implements View.OnLayoutChangeListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ TabNavigatorObserver.FragmentLifecycleCallbacks f38944a;

    public /* synthetic */ f(TabNavigatorObserver.FragmentLifecycleCallbacks fragmentLifecycleCallbacks) {
        this.f38944a = fragmentLifecycleCallbacks;
    }

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17) {
        this.f38944a.lambda$addScreenListener$0(view, i10, i11, i12, i13, i14, i15, i16, i17);
    }
}
