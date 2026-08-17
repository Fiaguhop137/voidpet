package androidx.compose.ui.platform;

import android.view.View;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
final class L {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final L f21891a = new L();

    private L() {
    }

    public final void a(@NotNull View view, int i10, boolean z10) {
        view.setFocusable(i10);
        view.setDefaultFocusHighlightEnabled(z10);
    }
}
