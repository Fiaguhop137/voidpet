package com.facebook.react.devsupport;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.provider.Settings;
import android.view.WindowManager;
import android.widget.FrameLayout;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.UiThreadUtil;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.facebook.react.devsupport.m, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C2212m {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final a f29699d = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ReactContext f29700a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final WindowManager f29701b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private FrameLayout f29702c;

    /* JADX INFO: renamed from: com.facebook.react.devsupport.m$a */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private final boolean b(Context context, Intent intent) {
            PackageManager packageManager = context.getPackageManager();
            return (packageManager == null || intent.resolveActivity(packageManager) == null) ? false : true;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final boolean c(Context context) {
            return Settings.canDrawOverlays(context);
        }

        public final void d(Context context) {
            Intrinsics.checkNotNullParameter(context, "context");
            if (Settings.canDrawOverlays(context)) {
                return;
            }
            Intent intent = new Intent("android.settings.action.MANAGE_OVERLAY_PERMISSION", Uri.parse("package:" + context.getPackageName()));
            intent.setFlags(268435456);
            W4.a.I("ReactNative", "Overlay permissions needs to be granted in order for react native apps to run in dev mode");
            if (b(context, intent)) {
                context.startActivity(intent);
            }
        }
    }

    public C2212m(ReactContext reactContext) {
        Intrinsics.checkNotNullParameter(reactContext, "reactContext");
        this.f29700a = reactContext;
        Object systemService = reactContext.getSystemService("window");
        Intrinsics.d(systemService, "null cannot be cast to non-null type android.view.WindowManager");
        this.f29701b = (WindowManager) systemService;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void c(boolean z10, C2212m c2212m) {
        FrameLayout frameLayout;
        if (z10 && c2212m.f29702c == null) {
            if (!f29699d.c(c2212m.f29700a)) {
                W4.a.b("ReactNative", "Wait for overlay permission to be set");
                return;
            } else {
                c2212m.f29702c = new V(c2212m.f29700a);
                c2212m.f29701b.addView(c2212m.f29702c, new WindowManager.LayoutParams(-1, -1, v0.f29788b, 24, -3));
                return;
            }
        }
        if (z10 || (frameLayout = c2212m.f29702c) == null) {
            return;
        }
        if (frameLayout != null) {
            frameLayout.removeAllViews();
        }
        c2212m.f29701b.removeView(c2212m.f29702c);
        c2212m.f29702c = null;
    }

    public final void b(boolean z10) {
        UiThreadUtil.runOnUiThread(new RunnableC2211l(z10, this));
    }
}
