package androidx.compose.ui.platform;

import android.graphics.Matrix;
import android.view.View;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: androidx.compose.ui.platform.j0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
final class C1862j0 implements InterfaceC1860i0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final float[] f22045a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int[] f22046b;

    private C1862j0(float[] fArr) {
        this.f22045a = fArr;
        this.f22046b = new int[2];
    }

    public /* synthetic */ C1862j0(float[] fArr, DefaultConstructorMarker defaultConstructorMarker) {
        this(fArr);
    }

    private final void b(float[] fArr, Matrix matrix) {
        p037c0.J.b(this.f22045a, matrix);
        M.i(fArr, this.f22045a);
    }

    private final void c(float[] fArr, float f10, float f11) {
        M.j(fArr, f10, f11, this.f22045a);
    }

    private final void d(View view, float[] fArr) {
        Object parent = view.getParent();
        if (parent instanceof View) {
            d((View) parent, fArr);
            c(fArr, -view.getScrollX(), -view.getScrollY());
            c(fArr, view.getLeft(), view.getTop());
        } else {
            int[] iArr = this.f22046b;
            view.getLocationInWindow(iArr);
            c(fArr, -view.getScrollX(), -view.getScrollY());
            c(fArr, iArr[0], iArr[1]);
        }
        Matrix matrix = view.getMatrix();
        if (matrix.isIdentity()) {
            return;
        }
        b(fArr, matrix);
    }

    @Override // androidx.compose.ui.platform.InterfaceC1860i0
    public void a(View view, float[] fArr) {
        p037c0.i0.h(fArr);
        d(view, fArr);
    }
}
