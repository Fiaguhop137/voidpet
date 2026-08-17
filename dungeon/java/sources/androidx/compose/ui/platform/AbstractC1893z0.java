package androidx.compose.ui.platform;

import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: androidx.compose.ui.platform.z0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1893z0 {

    /* JADX INFO: renamed from: androidx.compose.ui.platform.z0$a */
    static final class a extends kotlin.jvm.internal.o implements Function1 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ View f22270a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ View f22271b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(View view, View view2) {
            super(1);
            this.f22270a = view;
            this.f22271b = view2;
        }

        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke(View view) {
            return Boolean.valueOf(AbstractC1893z0.i(this.f22270a, view, view.getNextFocusForwardId()) == this.f22271b);
        }
    }

    /* JADX INFO: renamed from: androidx.compose.ui.platform.z0$b */
    static final class b extends kotlin.jvm.internal.o implements Function1 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ int f22272a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(int i10) {
            super(1);
            this.f22272a = i10;
        }

        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke(View view) {
            return Boolean.valueOf(view.getId() == this.f22272a);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void d(View view, ArrayList arrayList, int i10) {
        if (Build.VERSION.SDK_INT < 26) {
            e(view, arrayList, view.isInTouchMode());
        } else {
            view.addFocusables(arrayList, i10, view.isInTouchMode() ? 1 : 0);
        }
    }

    private static final void e(View view, ArrayList arrayList, boolean z10) {
        boolean z11 = view.getVisibility() == 0 && view.isFocusable() && view.isEnabled() && view.getWidth() > 0 && view.getHeight() > 0 && (!z10 || view.isFocusableInTouchMode());
        if (!(view instanceof ViewGroup)) {
            if (z11) {
                arrayList.add(view);
                return;
            }
            return;
        }
        int size = arrayList.size();
        ViewGroup viewGroup = (ViewGroup) view;
        boolean z12 = viewGroup.getDescendantFocusability() == 131072;
        if (z11 && z12) {
            arrayList.add(view);
        }
        if (viewGroup.getDescendantFocusability() != 393216) {
            int childCount = viewGroup.getChildCount();
            View[] viewArr = new View[childCount];
            for (int i10 = 0; i10 < childCount; i10++) {
                viewArr[i10] = viewGroup.getChildAt(i10);
            }
            C0.f21841a.d(viewArr, viewGroup, viewGroup.getLayoutDirection() == 1);
            for (int i11 = 0; i11 < childCount; i11++) {
                e(viewArr[i11], arrayList, z10);
            }
        }
        if (z11 && !z12 && size == arrayList.size()) {
            arrayList.add(view);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final View f(View view, View view2, int i10) {
        int nextFocusForwardId;
        if (i10 == 1) {
            if (view.getId() == -1) {
                return null;
            }
            return g(view2, view, new a(view2, view));
        }
        if (i10 == 2 && (nextFocusForwardId = view.getNextFocusForwardId()) != -1) {
            return i(view2, view, nextFocusForwardId);
        }
        return null;
    }

    private static final View g(View view, View view2, Function1 function1) {
        View viewH;
        View view3 = null;
        while (true) {
            viewH = h(view2, function1, view3);
            if (viewH != null || view2 == view) {
                break;
            }
            Object parent = view2.getParent();
            if (parent == null || !(parent instanceof View)) {
                return null;
            }
            View view4 = (View) parent;
            view3 = view2;
            view2 = view4;
        }
        return viewH;
    }

    private static final View h(View view, Function1 function1, View view2) {
        View viewH;
        if (((Boolean) function1.invoke(view)).booleanValue()) {
            return view;
        }
        if (!(view instanceof ViewGroup)) {
            return null;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        int childCount = viewGroup.getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = viewGroup.getChildAt(i10);
            if (childAt != view2 && (viewH = h(childAt, function1, view2)) != null) {
                return viewH;
            }
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final View i(View view, View view2, int i10) {
        return g(view, view2, new b(i10));
    }
}
