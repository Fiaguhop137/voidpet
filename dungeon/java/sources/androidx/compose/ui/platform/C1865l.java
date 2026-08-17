package androidx.compose.ui.platform;

import android.content.ClipDescription;
import android.content.ClipboardManager;
import android.content.Context;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: androidx.compose.ui.platform.l, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1865l implements InterfaceC1870n0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ClipboardManager f22050a;

    public C1865l(ClipboardManager clipboardManager) {
        this.f22050a = clipboardManager;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public C1865l(Context context) {
        Object systemService = context.getSystemService("clipboard");
        Intrinsics.d(systemService, "null cannot be cast to non-null type android.content.ClipboardManager");
        this((ClipboardManager) systemService);
    }

    public boolean a() {
        ClipDescription primaryClipDescription = this.f22050a.getPrimaryClipDescription();
        if (primaryClipDescription != null) {
            return primaryClipDescription.hasMimeType("text/*");
        }
        return false;
    }
}
