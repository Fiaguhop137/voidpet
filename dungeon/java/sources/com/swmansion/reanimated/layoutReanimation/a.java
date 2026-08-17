package com.swmansion.reanimated.layoutReanimation;

import com.facebook.react.uimanager.events.i;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class a implements i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ReaLayoutAnimator f38936a;

    public /* synthetic */ a(ReaLayoutAnimator reaLayoutAnimator) {
        this.f38936a = reaLayoutAnimator;
    }

    @Override // com.facebook.react.uimanager.events.i
    public final void onEventDispatch(com.facebook.react.uimanager.events.d dVar) {
        this.f38936a.lambda$deleteView$0(dVar);
    }
}
