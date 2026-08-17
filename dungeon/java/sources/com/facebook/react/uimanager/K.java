package com.facebook.react.uimanager;

import android.view.View;
import android.view.ViewGroup;
import com.facebook.react.AbstractC2232l;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class K {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final K f30320a = new K();

    private K() {
    }

    public static final void b(ViewGroup host) {
        Intrinsics.checkNotNullParameter(host, "host");
        int childCount = host.getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = host.getChildAt(i10);
            Intrinsics.checkNotNullExpressionValue(childAt, "getChildAt(...)");
            c(childAt);
        }
    }

    private static final void c(View view) {
        Boolean bool = (Boolean) view.getTag(AbstractC2232l.f29834t);
        if (bool != null) {
            view.setFocusable(bool.booleanValue());
        }
        if (((View) view.getTag(AbstractC2232l.f29821g)) != null) {
            view.setTag(AbstractC2232l.f29821g, null);
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int childCount = viewGroup.getChildCount();
            for (int i10 = 0; i10 < childCount; i10++) {
                View childAt = viewGroup.getChildAt(i10);
                Intrinsics.checkNotNullExpressionValue(childAt, "getChildAt(...)");
                c(childAt);
            }
        }
    }

    private static final void e(List list, View view) {
        if (!CollectionsKt.b0(list, view.getTag(AbstractC2232l.f29814H))) {
            if (view.getTag(AbstractC2232l.f29834t) == null) {
                view.setTag(AbstractC2232l.f29834t, Boolean.valueOf(view.isFocusable()));
            }
            view.setFocusable(false);
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int childCount = viewGroup.getChildCount();
            for (int i10 = 0; i10 < childCount; i10++) {
                View childAt = viewGroup.getChildAt(i10);
                Intrinsics.checkNotNullExpressionValue(childAt, "getChildAt(...)");
                e(list, childAt);
            }
        }
    }

    public static final void f(ViewGroup host) {
        Intrinsics.checkNotNullParameter(host, "host");
        int childCount = host.getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = host.getChildAt(i10);
            Intrinsics.checkNotNullExpressionValue(childAt, "getChildAt(...)");
            g(childAt);
        }
    }

    private static final void g(View view) {
        Boolean bool = (Boolean) view.getTag(AbstractC2232l.f29834t);
        if (bool != null) {
            view.setFocusable(bool.booleanValue());
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int childCount = viewGroup.getChildCount();
            for (int i10 = 0; i10 < childCount; i10++) {
                View childAt = viewGroup.getChildAt(i10);
                Intrinsics.checkNotNullExpressionValue(childAt, "getChildAt(...)");
                g(childAt);
            }
        }
    }

    public final void a(View view, List axOrderList, View[] result) {
        int iN0;
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(axOrderList, "axOrderList");
        Intrinsics.checkNotNullParameter(result, "result");
        Object tag = view.getTag(AbstractC2232l.f29814H);
        view.setTag(AbstractC2232l.f29821g, this);
        if (CollectionsKt.b0(axOrderList, tag) && (iN0 = CollectionsKt.n0(axOrderList, tag)) != -1) {
            result[iN0] = view;
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int childCount = viewGroup.getChildCount();
            for (int i10 = 0; i10 < childCount; i10++) {
                View childAt = viewGroup.getChildAt(i10);
                Intrinsics.checkNotNullExpressionValue(childAt, "getChildAt(...)");
                a(childAt, axOrderList, result);
            }
        }
    }

    public final void d(ViewGroup view, List axOrderList) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(axOrderList, "axOrderList");
        int childCount = view.getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = view.getChildAt(i10);
            Intrinsics.checkNotNullExpressionValue(childAt, "getChildAt(...)");
            e(axOrderList, childAt);
        }
    }
}
