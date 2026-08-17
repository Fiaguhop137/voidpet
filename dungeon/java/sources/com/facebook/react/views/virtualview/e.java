package com.facebook.react.views.virtualview;

import android.graphics.Rect;
import com.facebook.react.uimanager.events.EventDispatcher;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class e implements a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f31292a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f31293b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final EventDispatcher f31294c;

    public e(int i10, int i11, EventDispatcher dispatcher) {
        Intrinsics.checkNotNullParameter(dispatcher, "dispatcher");
        this.f31292a = i10;
        this.f31293b = i11;
        this.f31294c = dispatcher;
    }

    @Override // com.facebook.react.views.virtualview.a
    public void a(f mode, Rect targetRect, Rect thresholdRect, boolean z10) {
        Intrinsics.checkNotNullParameter(mode, "mode");
        Intrinsics.checkNotNullParameter(targetRect, "targetRect");
        Intrinsics.checkNotNullParameter(thresholdRect, "thresholdRect");
        this.f31294c.d(new g(this.f31293b, this.f31292a, mode, targetRect, thresholdRect, z10));
    }
}
