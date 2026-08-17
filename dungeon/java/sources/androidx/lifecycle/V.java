package androidx.lifecycle;

import android.view.View;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public abstract class V {
    public static final InterfaceC1994q a(View view) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        while (view != null) {
            Object tag = view.getTag(N1.a.f7168a);
            InterfaceC1994q interfaceC1994q = tag instanceof InterfaceC1994q ? (InterfaceC1994q) tag : null;
            if (interfaceC1994q != null) {
                return interfaceC1994q;
            }
            Object objA = p271p1.b.a(view);
            view = objA instanceof View ? (View) objA : null;
        }
        return null;
    }

    public static final void b(View view, InterfaceC1994q interfaceC1994q) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        view.setTag(N1.a.f7168a, interfaceC1994q);
    }
}
