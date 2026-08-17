package com.facebook.react.devsupport;

import android.app.Dialog;
import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.widget.TextView;
import com.facebook.react.AbstractC2231k;
import com.facebook.react.AbstractC2232l;
import com.facebook.react.AbstractC2234n;
import com.facebook.react.AbstractC2236p;
import com.facebook.react.bridge.UiThreadUtil;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class j0 implements p456z6.h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final p199l1.j f29691a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Dialog f29692b;

    public j0(p199l1.j contextSupplier) {
        Intrinsics.checkNotNullParameter(contextSupplier, "contextSupplier");
        this.f29691a = contextSupplier;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void e(j0 j0Var) {
        Dialog dialog = j0Var.f29692b;
        if (dialog != null) {
            dialog.dismiss();
        }
        j0Var.f29692b = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void f(j0 j0Var, String str, z6.e.a aVar) {
        Dialog dialog = j0Var.f29692b;
        if (dialog != null) {
            dialog.dismiss();
        }
        Context context = (Context) j0Var.f29691a.get();
        if (context == null) {
            return;
        }
        View viewInflate = LayoutInflater.from(context).inflate(AbstractC2234n.f30005d, (ViewGroup) null);
        Intrinsics.checkNotNullExpressionValue(viewInflate, "inflate(...)");
        viewInflate.findViewById(AbstractC2232l.f29827m).setOnClickListener(new i0(aVar));
        ((TextView) viewInflate.findViewById(AbstractC2232l.f29828n)).setText(str);
        Dialog dialog2 = new Dialog(context, AbstractC2236p.f30052a);
        dialog2.setContentView(viewInflate);
        dialog2.setCancelable(false);
        j0Var.f29692b = dialog2;
        Window window = dialog2.getWindow();
        if (window != null) {
            WindowManager.LayoutParams attributes = window.getAttributes();
            Intrinsics.checkNotNullExpressionValue(attributes, "getAttributes(...)");
            attributes.dimAmount = 0.2f;
            window.setAttributes(attributes);
            window.addFlags(2);
            window.setGravity(48);
            window.setElevation(0.0f);
            window.setBackgroundDrawable(new ColorDrawable(0));
            window.setBackgroundDrawableResource(AbstractC2231k.f29806a);
        }
        Dialog dialog3 = j0Var.f29692b;
        if (dialog3 != null) {
            dialog3.show();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void h(z6.e.a aVar, View view) {
        aVar.a();
    }

    @Override // p456z6.h
    public void b(String message, z6.e.a listener) {
        Intrinsics.checkNotNullParameter(message, "message");
        Intrinsics.checkNotNullParameter(listener, "listener");
        UiThreadUtil.runOnUiThread(new g0(this, message, listener));
    }

    @Override // p456z6.h
    public void g() {
        UiThreadUtil.runOnUiThread(new h0(this));
    }
}
