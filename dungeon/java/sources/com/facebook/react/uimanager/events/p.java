package com.facebook.react.uimanager.events;

import android.view.MotionEvent;
import android.view.View;
import com.facebook.react.uimanager.C2254g0;
import com.facebook.react.uimanager.InterfaceC2252f0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final p f30435a = new p();

    private p() {
    }

    public static final void a(View view, MotionEvent event) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(event, "event");
        InterfaceC2252f0 interfaceC2252f0A = C2254g0.a(view);
        if (interfaceC2252f0A != null) {
            interfaceC2252f0A.d(view, event);
        }
    }

    public static final void b(View view, MotionEvent event) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(event, "event");
        InterfaceC2252f0 interfaceC2252f0A = C2254g0.a(view);
        if (interfaceC2252f0A != null) {
            interfaceC2252f0A.a(view, event);
        }
    }
}
