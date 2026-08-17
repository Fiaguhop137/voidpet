package androidx.compose.ui.platform;

import android.view.View;
import android.view.ViewStructure;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: androidx.compose.ui.platform.z, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
final class C1892z {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final C1892z f22269a = new C1892z();

    private C1892z() {
    }

    public final void a(@NotNull ViewStructure viewStructure, @NotNull View view) {
        viewStructure.setClassName(view.getAccessibilityClassName().toString());
    }
}
