package com.facebook.react.uimanager;

import android.graphics.Point;
import android.graphics.Rect;
import android.view.View;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.facebook.react.uimanager.g0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C2254g0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final C2254g0 f30499a = new C2254g0();

    private C2254g0() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final InterfaceC2252f0 a(View reactView) {
        Intrinsics.checkNotNullParameter(reactView, "reactView");
        View view = reactView;
        while (!(view instanceof InterfaceC2252f0)) {
            Object parent = view.getParent();
            if (parent == null) {
                return null;
            }
            p240n6.a.a(parent instanceof View);
            view = (View) parent;
        }
        return (InterfaceC2252f0) view;
    }

    public static final Point b(View v10) {
        Intrinsics.checkNotNullParameter(v10, "v");
        int[] iArr = new int[2];
        v10.getLocationInWindow(iArr);
        Rect rect = new Rect();
        v10.getWindowVisibleDisplayFrame(rect);
        iArr[0] = iArr[0] - rect.left;
        iArr[1] = iArr[1] - rect.top;
        return new Point(iArr[0], iArr[1]);
    }
}
