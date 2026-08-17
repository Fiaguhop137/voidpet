package androidx.compose.ui.platform;

import android.app.Activity;
import android.graphics.Rect;
import android.view.WindowManager;

/* JADX INFO: renamed from: androidx.compose.ui.platform.g0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
final class C1856g0 implements InterfaceC1848c0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final C1856g0 f22031b = new C1856g0();

    private C1856g0() {
    }

    @Override // androidx.compose.ui.platform.InterfaceC1848c0
    public Rect a(Activity activity) {
        return ((WindowManager) activity.getSystemService(WindowManager.class)).getCurrentWindowMetrics().getBounds();
    }
}
