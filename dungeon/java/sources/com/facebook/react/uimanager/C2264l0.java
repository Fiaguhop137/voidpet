package com.facebook.react.uimanager;

import android.graphics.Matrix;
import android.graphics.PointF;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.react.bridge.UiThreadUtil;
import java.util.ArrayList;
import java.util.EnumSet;
import java.util.List;
import kotlin.enums.EnumEntries;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.facebook.react.uimanager.l0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C2264l0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final C2264l0 f30515a = new C2264l0();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final float[] f30516b = new float[2];

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final PointF f30517c = new PointF();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final float[] f30518d = new float[2];

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final Matrix f30519e = new Matrix();

    /* JADX INFO: renamed from: com.facebook.react.uimanager.l0$a */
    private enum a {
        SELF,
        CHILD;


        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private static final /* synthetic */ EnumEntries f30523d = Gd.a.a(e());
    }

    /* JADX INFO: renamed from: com.facebook.react.uimanager.l0$b */
    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final int f30524a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final View f30525b;

        public b(int i10, View view) {
            this.f30524a = i10;
            this.f30525b = view;
        }

        public final View a() {
            return this.f30525b;
        }

        public final int b() {
            return this.f30524a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && ((b) obj).b() == this.f30524a;
        }

        public int hashCode() {
            return Integer.hashCode(this.f30524a);
        }
    }

    /* JADX INFO: renamed from: com.facebook.react.uimanager.l0$c */
    public /* synthetic */ class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f30526a;

        static {
            int[] iArr = new int[I.values().length];
            try {
                iArr[I.AUTO.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[I.BOX_ONLY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[I.NONE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[I.BOX_NONE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            f30526a = iArr;
        }
    }

    private C2264l0() {
    }

    private final View a(View view) {
        while (view != null && view.getId() <= 0) {
            Object parent = view.getParent();
            view = parent instanceof View ? (View) parent : null;
        }
        return view;
    }

    public static final List b(float f10, float f11, ViewGroup viewGroup, float[] viewCoords) {
        int iH;
        Intrinsics.checkNotNullParameter(viewGroup, "viewGroup");
        Intrinsics.checkNotNullParameter(viewCoords, "viewCoords");
        UiThreadUtil.assertOnUiThread();
        viewCoords[0] = f10;
        viewCoords[1] = f11;
        ArrayList arrayList = new ArrayList();
        View viewF = f30515a.f(viewCoords, viewGroup, arrayList);
        if (viewF != null) {
            int i10 = 0;
            while (viewF != null && viewF.getId() <= 0) {
                Object parent = viewF.getParent();
                viewF = parent instanceof View ? (View) parent : null;
                i10++;
            }
            if (i10 > 0 && i10 <= arrayList.size()) {
                arrayList.subList(i10, arrayList.size());
            }
            if (viewF != null && (iH = f30515a.h(viewF, viewCoords[0], viewCoords[1])) != viewF.getId()) {
                arrayList.add(0, new b(iH, null));
            }
        }
        return arrayList;
    }

    public static final int c(float f10, float f11, ViewGroup viewGroup, float[] viewCoords, int[] iArr) {
        View viewA;
        Intrinsics.checkNotNullParameter(viewGroup, "viewGroup");
        Intrinsics.checkNotNullParameter(viewCoords, "viewCoords");
        UiThreadUtil.assertOnUiThread();
        int id2 = viewGroup.getId();
        viewCoords[0] = f10;
        viewCoords[1] = f11;
        C2264l0 c2264l0 = f30515a;
        View viewF = c2264l0.f(viewCoords, viewGroup, null);
        if (viewF == null || (viewA = c2264l0.a(viewF)) == null) {
            return id2;
        }
        if (iArr != null) {
            iArr[0] = viewA.getId();
        }
        return c2264l0.h(viewA, viewCoords[0], viewCoords[1]);
    }

    public static final int d(float f10, float f11, ViewGroup viewGroup) {
        Intrinsics.checkNotNullParameter(viewGroup, "viewGroup");
        return c(f10, f11, viewGroup, f30516b, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final View e(float[] fArr, View view, EnumSet enumSet, List list) {
        if (enumSet.contains(a.CHILD) && (view instanceof ViewGroup)) {
            if (!i(fArr[0], fArr[1], view)) {
                if (view instanceof Q) {
                    if (Z6.a.a(view.getId()) == 2 && !j(fArr[0], fArr[1], view)) {
                        return null;
                    }
                    String overflow = ((P) view).getOverflow();
                    if (Intrinsics.b("hidden", overflow) || Intrinsics.b("scroll", overflow)) {
                        return null;
                    }
                }
                if (((ViewGroup) view).getClipChildren()) {
                    return null;
                }
            }
            ViewGroup viewGroup = (ViewGroup) view;
            int childCount = viewGroup.getChildCount();
            InterfaceC2246c0 interfaceC2246c0 = view instanceof InterfaceC2246c0 ? (InterfaceC2246c0) view : null;
            for (int i10 = childCount - 1; -1 < i10; i10--) {
                View childAt = viewGroup.getChildAt(interfaceC2246c0 != null ? interfaceC2246c0.getZIndexMappedChildIndex(i10) : i10);
                PointF pointF = f30517c;
                float f10 = fArr[0];
                float f11 = fArr[1];
                Intrinsics.c(childAt);
                g(f10, f11, viewGroup, childAt, pointF);
                float f12 = fArr[0];
                float f13 = fArr[1];
                fArr[0] = pointF.x;
                fArr[1] = pointF.y;
                View viewF = f(fArr, childAt, list);
                if (viewF != null) {
                    return viewF;
                }
                fArr[0] = f12;
                fArr[1] = f13;
            }
        }
        if (enumSet.contains(a.SELF) && i(fArr[0], fArr[1], view)) {
            return view;
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final View f(float[] fArr, View view, List list) {
        I pointerEvents = view instanceof S ? ((S) view).getPointerEvents() : I.AUTO;
        if (!view.isEnabled()) {
            int i10 = c.f30526a[pointerEvents.ordinal()];
            if (i10 == 1) {
                pointerEvents = I.BOX_NONE;
            } else if (i10 == 2) {
                pointerEvents = I.NONE;
            }
        }
        int i11 = c.f30526a[pointerEvents.ordinal()];
        if (i11 == 2) {
            EnumSet enumSetOf = EnumSet.of(a.SELF);
            Intrinsics.checkNotNullExpressionValue(enumSetOf, "of(...)");
            View viewE = e(fArr, view, enumSetOf, list);
            if (viewE != null && list != null) {
                list.add(new b(view.getId(), view));
            }
            return viewE;
        }
        if (i11 != 3) {
            if (i11 != 4) {
                if (pointerEvents != I.AUTO) {
                    W4.a.I("ReactNative", "Unknown pointer event type: " + pointerEvents);
                }
                if (!(view instanceof O) || !i(fArr[0], fArr[1], view) || !((O) view).interceptsTouchEvent(fArr[0], fArr[1])) {
                    EnumSet enumSetOf2 = EnumSet.of(a.SELF, a.CHILD);
                    Intrinsics.checkNotNullExpressionValue(enumSetOf2, "of(...)");
                    View viewE2 = e(fArr, view, enumSetOf2, list);
                    if (viewE2 != null && list != null) {
                        list.add(new b(view.getId(), view));
                    }
                    return viewE2;
                }
                if (list != null) {
                    list.add(new b(view.getId(), view));
                    return view;
                }
            } else {
                EnumSet enumSetOf3 = EnumSet.of(a.CHILD);
                Intrinsics.checkNotNullExpressionValue(enumSetOf3, "of(...)");
                View viewE3 = e(fArr, view, enumSetOf3, list);
                if (viewE3 != null) {
                    if (list != null) {
                        list.add(new b(view.getId(), view));
                    }
                    return viewE3;
                }
                if ((view instanceof N) && i(fArr[0], fArr[1], view) && ((N) view).reactTagForTouch(fArr[0], fArr[1]) != view.getId()) {
                    if (list != null) {
                        list.add(new b(view.getId(), view));
                    }
                }
            }
            return view;
        }
        return null;
    }

    private final void g(float f10, float f11, ViewGroup viewGroup, View view, PointF pointF) {
        float scrollX = (f10 + viewGroup.getScrollX()) - view.getLeft();
        float scrollY = (f11 + viewGroup.getScrollY()) - view.getTop();
        Matrix matrix = view.getMatrix();
        if (!matrix.isIdentity()) {
            float[] fArr = f30518d;
            fArr[0] = scrollX;
            fArr[1] = scrollY;
            Matrix matrix2 = f30519e;
            matrix.invert(matrix2);
            matrix2.mapPoints(fArr);
            float f12 = fArr[0];
            scrollY = fArr[1];
            scrollX = f12;
        }
        pointF.set(scrollX, scrollY);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final int h(View view, float f10, float f11) {
        return view instanceof N ? ((N) view).reactTagForTouch(f10, f11) : view.getId();
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final boolean i(float f10, float f11, View view) {
        X6.c cVar = view instanceof X6.c ? (X6.c) view : null;
        Rect hitSlopRect = cVar != null ? cVar.getHitSlopRect() : null;
        if (hitSlopRect != null) {
            return f10 >= ((float) (-hitSlopRect.left)) && f10 < ((float) (view.getWidth() + hitSlopRect.right)) && f11 >= ((float) (-hitSlopRect.top)) && f11 < ((float) (view.getHeight() + hitSlopRect.bottom));
        }
        return f10 >= 0.0f && f10 < ((float) view.getWidth()) && f11 >= 0.0f && f11 < ((float) view.getHeight());
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final boolean j(float f10, float f11, View view) {
        if (!(view instanceof Q)) {
            return false;
        }
        Rect overflowInset = ((Q) view).getOverflowInset();
        return f10 >= ((float) overflowInset.left) && f10 < ((float) (view.getWidth() - overflowInset.right)) && f11 >= ((float) overflowInset.top) && f11 < ((float) (view.getHeight() - overflowInset.bottom));
    }
}
