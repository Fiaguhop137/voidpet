package androidx.compose.ui.platform;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import java.util.Comparator;
import kotlin.collections.AbstractC3952n;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
final class C0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static int f21843c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final C0 f21841a = new C0();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final p323s.L f21842b = new p323s.L(0, 1, null);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static int f21844d = 1;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final p323s.O f21845e = p323s.a0.b();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final Comparator f21846f = new A0();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final Comparator f21847g = new B0();

    private C0() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int c(View view, View view2) {
        if (view == view2) {
            return 0;
        }
        p323s.O o10 = f21845e;
        Object objE = o10.e(view);
        Intrinsics.c(objE);
        Rect rect = (Rect) objE;
        Object objE2 = o10.e(view2);
        Intrinsics.c(objE2);
        Rect rect2 = (Rect) objE2;
        int i10 = rect.left - rect2.left;
        return i10 == 0 ? (rect.right - rect2.right) * f21844d : i10 * f21844d;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int e(View view, View view2) {
        if (view == view2) {
            return 0;
        }
        p323s.O o10 = f21845e;
        Object objE = o10.e(view);
        Intrinsics.c(objE);
        Rect rect = (Rect) objE;
        Object objE2 = o10.e(view2);
        Intrinsics.c(objE2);
        Rect rect2 = (Rect) objE2;
        int i10 = rect.top - rect2.top;
        return i10 == 0 ? rect.bottom - rect2.bottom : i10;
    }

    public final void d(View[] viewArr, ViewGroup viewGroup, boolean z10) {
        int length = viewArr.length;
        if (length < 2) {
            return;
        }
        int iD = length - f21842b.d();
        for (int i10 = 0; i10 < iD; i10++) {
            f21842b.k(new Rect());
        }
        for (View view : viewArr) {
            p323s.L l10 = f21842b;
            int i11 = f21843c;
            f21843c = i11 + 1;
            Rect rect = (Rect) l10.c(i11);
            view.getDrawingRect(rect);
            viewGroup.offsetDescendantRectToMyCoords(view, rect);
            f21845e.x(view, rect);
        }
        AbstractC3952n.F(viewArr, f21846f);
        Object objE = f21845e.e(viewArr[0]);
        Intrinsics.c(objE);
        int iMax = ((Rect) objE).bottom;
        f21844d = z10 ? -1 : 1;
        int i12 = 0;
        for (int i13 = 0; i13 < length; i13++) {
            Object objE2 = f21845e.e(viewArr[i13]);
            Intrinsics.c(objE2);
            Rect rect2 = (Rect) objE2;
            if (rect2.top >= iMax) {
                if (i13 - i12 > 1) {
                    AbstractC3952n.G(viewArr, f21847g, i12, i13);
                }
                iMax = rect2.bottom;
                i12 = i13;
            } else {
                iMax = Math.max(iMax, rect2.bottom);
            }
        }
        if (length - i12 > 1) {
            AbstractC3952n.G(viewArr, f21847g, i12, length);
        }
        f21843c = 0;
        f21845e.k();
    }
}
