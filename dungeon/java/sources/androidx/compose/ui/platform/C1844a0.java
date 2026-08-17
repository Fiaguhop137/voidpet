package androidx.compose.ui.platform;

import android.view.View;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: androidx.compose.ui.platform.a0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
final class C1844a0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final C1844a0 f21982a = new C1844a0();

    private C1844a0() {
    }

    public final boolean a(@NotNull View view) {
        return view.isShowingLayoutBounds();
    }
}
