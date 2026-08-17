package com.facebook.react.devsupport;

import android.app.Activity;
import android.app.Dialog;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.FrameLayout;
import androidx.core.view.C0;
import com.facebook.react.AbstractC2236p;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class Z extends Dialog {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final View f29643a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Z(Activity context, View view) {
        super(context, AbstractC2236p.f30053b);
        Intrinsics.checkNotNullParameter(context, "context");
        this.f29643a = view;
        requestWindowFeature(1);
        if (view != null) {
            setContentView(view);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C0 c(int i10, View view, C0 windowInsets) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(windowInsets, "windowInsets");
        p020b1.d dVarF = windowInsets.f(i10);
        Intrinsics.checkNotNullExpressionValue(dVarF, "getInsets(...)");
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        Intrinsics.d(layoutParams, "null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
        ((FrameLayout.LayoutParams) layoutParams).setMargins(dVarF.f25865a, dVarF.f25866b, dVarF.f25867c, dVarF.f25868d);
        return C0.f23104b;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C0 d(Function2 function2, View p10, C0 p11) {
        Intrinsics.checkNotNullParameter(p10, "p0");
        Intrinsics.checkNotNullParameter(p11, "p1");
        return (C0) function2.invoke(p10, p11);
    }

    @Override // android.app.Dialog
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Window window = getWindow();
        if (window != null) {
            window.setBackgroundDrawable(new ColorDrawable(-16777216));
        }
        View view = this.f29643a;
        if (view != null) {
            androidx.core.view.Z.A0(view, new Y(new X(C0.p.i() | C0.p.c())));
        }
    }
}
