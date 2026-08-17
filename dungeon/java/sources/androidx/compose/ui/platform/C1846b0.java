package androidx.compose.ui.platform;

import android.view.View;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: androidx.compose.ui.platform.b0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
final class C1846b0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final C1846b0 f21989a = new C1846b0();

    private C1846b0() {
    }

    public static final void a(@NotNull View view, float f10) {
        view.setRequestedFrameRate(f10);
    }
}
