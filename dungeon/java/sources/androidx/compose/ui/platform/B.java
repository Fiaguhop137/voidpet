package androidx.compose.ui.platform;

import android.view.View;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
final class B {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final B f21839a = new B();

    private B() {
    }

    public final void a(@NotNull View view) {
        view.setForceDarkAllowed(false);
    }
}
