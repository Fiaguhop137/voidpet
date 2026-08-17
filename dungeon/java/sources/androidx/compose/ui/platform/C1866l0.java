package androidx.compose.ui.platform;

import android.graphics.Matrix;
import android.view.View;
import android.view.ViewParent;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: androidx.compose.ui.platform.l0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
final class C1866l0 implements InterfaceC1860i0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Matrix f22051a = new Matrix();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int[] f22052b = new int[2];

    @Override // androidx.compose.ui.platform.InterfaceC1860i0
    public void a(@NotNull View view, @NotNull float[] fArr) {
        this.f22051a.reset();
        view.transformMatrixToGlobal(this.f22051a);
        ViewParent parent = view.getParent();
        while (parent instanceof View) {
            view = parent;
            parent = view.getParent();
        }
        view.getLocationOnScreen(this.f22052b);
        int[] iArr = this.f22052b;
        int i10 = iArr[0];
        int i11 = iArr[1];
        view.getLocationInWindow(iArr);
        int[] iArr2 = this.f22052b;
        this.f22051a.postTranslate(iArr2[0] - i10, iArr2[1] - i11);
        p037c0.J.b(fArr, this.f22051a);
    }
}
