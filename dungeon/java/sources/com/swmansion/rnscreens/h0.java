package com.swmansion.rnscreens;

import android.view.View;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.uimanager.C2279w;
import com.facebook.react.uimanager.UIManagerModule;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class h0 extends C2279w {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    private ReactContext f39168A;

    public h0(ReactContext context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.f39168A = context;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void w1(h0 h0Var, com.facebook.react.uimanager.D d10) {
        if (d10 == null) {
            return;
        }
        View viewResolveView = d10.resolveView(h0Var.M());
        if (viewResolveView instanceof C3210v) {
            ((C3210v) viewResolveView).u();
        }
    }

    @Override // com.facebook.react.uimanager.W, com.facebook.react.uimanager.V
    public void Z(com.facebook.react.uimanager.E nativeViewHierarchyOptimizer) {
        Intrinsics.checkNotNullParameter(nativeViewHierarchyOptimizer, "nativeViewHierarchyOptimizer");
        super.Z(nativeViewHierarchyOptimizer);
        UIManagerModule uIManagerModule = (UIManagerModule) this.f39168A.getNativeModule(UIManagerModule.class);
        if (uIManagerModule != null) {
            uIManagerModule.addUIBlock(new g0(this));
        }
    }
}
