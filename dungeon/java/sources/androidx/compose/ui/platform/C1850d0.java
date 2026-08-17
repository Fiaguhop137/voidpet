package androidx.compose.ui.platform;

import android.app.Activity;
import android.graphics.Point;
import android.graphics.Rect;
import android.view.Display;

/* JADX INFO: renamed from: androidx.compose.ui.platform.d0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
final class C1850d0 implements InterfaceC1848c0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final C1850d0 f22009b = new C1850d0();

    private C1850d0() {
    }

    @Override // androidx.compose.ui.platform.InterfaceC1848c0
    public Rect a(Activity activity) {
        Rect rect = new Rect();
        Display defaultDisplay = activity.getWindowManager().getDefaultDisplay();
        defaultDisplay.getRectSize(rect);
        if (!activity.isInMultiWindowMode()) {
            Point point = new Point();
            defaultDisplay.getRealSize(point);
            int iG = Z.g(activity);
            int i10 = rect.bottom;
            if (i10 + iG == point.y) {
                rect.bottom = i10 + iG;
                return rect;
            }
            int i11 = rect.right;
            if (i11 + iG == point.x) {
                rect.right = i11 + iG;
            }
        }
        return rect;
    }
}
