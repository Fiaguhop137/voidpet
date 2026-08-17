package androidx.compose.ui.platform;

import android.content.Context;
import android.view.accessibility.AccessibilityManager;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: androidx.compose.ui.platform.j, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1861j implements InterfaceC1859i {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final a f22042b = new a(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f22043c = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final AccessibilityManager f22044a;

    /* JADX INFO: renamed from: androidx.compose.ui.platform.j$a */
    private static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public C1861j(Context context) {
        Object systemService = context.getSystemService("accessibility");
        Intrinsics.d(systemService, "null cannot be cast to non-null type android.view.accessibility.AccessibilityManager");
        this.f22044a = (AccessibilityManager) systemService;
    }
}
