package com.facebook.react.devsupport;

import android.app.Activity;
import android.graphics.Rect;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.PopupWindow;
import android.widget.TextView;
import com.facebook.react.AbstractC2234n;
import com.facebook.react.bridge.UiThreadUtil;
import java.util.Arrays;
import java.util.Locale;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.facebook.react.devsupport.q, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C2216q implements p456z6.c {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final a f29726d = new a(null);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static boolean f29727e = true;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final l0 f29728a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private TextView f29729b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private PopupWindow f29730c;

    /* JADX INFO: renamed from: com.facebook.react.devsupport.q$a */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public C2216q(l0 reactInstanceDevHelper) {
        Intrinsics.checkNotNullParameter(reactInstanceDevHelper, "reactInstanceDevHelper");
        this.f29728a = reactInstanceDevHelper;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void g(C2216q c2216q) {
        c2216q.h();
    }

    private final void h() {
        PopupWindow popupWindow = this.f29730c;
        if (popupWindow != null && popupWindow.isShowing()) {
            popupWindow.dismiss();
            this.f29730c = null;
            this.f29729b = null;
        }
    }

    private final void i(String str) {
        PopupWindow popupWindow = this.f29730c;
        if (popupWindow == null || !popupWindow.isShowing()) {
            Activity activityA = this.f29728a.a();
            if (activityA == null) {
                W4.a.m("ReactNative", "Unable to display loading message because react activity isn't available");
                return;
            }
            try {
                Rect rect = new Rect();
                activityA.getWindow().getDecorView().getWindowVisibleDisplayFrame(rect);
                int i10 = rect.top;
                Object systemService = activityA.getSystemService("layout_inflater");
                Intrinsics.d(systemService, "null cannot be cast to non-null type android.view.LayoutInflater");
                View viewInflate = ((LayoutInflater) systemService).inflate(AbstractC2234n.f30003b, (ViewGroup) null);
                Intrinsics.d(viewInflate, "null cannot be cast to non-null type android.widget.TextView");
                TextView textView = (TextView) viewInflate;
                textView.setText(str);
                PopupWindow popupWindow2 = new PopupWindow(textView, -1, -2);
                popupWindow2.setTouchable(false);
                popupWindow2.showAtLocation(activityA.getWindow().getDecorView(), 0, 0, i10);
                this.f29729b = textView;
                this.f29730c = popupWindow2;
            } catch (WindowManager.BadTokenException unused) {
                W4.a.m("ReactNative", "Unable to display loading message because react activity isn't active, message: " + str);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void j(C2216q c2216q, String str) {
        c2216q.i(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void k(Integer num, Integer num2, C2216q c2216q, String str) {
        String str2;
        if (num == null || num2 == null || num2.intValue() <= 0) {
            str2 = "";
        } else {
            kotlin.jvm.internal.J j10 = kotlin.jvm.internal.J.f48342a;
            str2 = String.format(Locale.getDefault(), " %.1f%%", Arrays.copyOf(new Object[]{Float.valueOf((num.intValue() / num2.intValue()) * 100)}, 1));
            Intrinsics.checkNotNullExpressionValue(str2, "format(...)");
        }
        TextView textView = c2216q.f29729b;
        if (textView != null) {
            if (str == null) {
                str = "Loading";
            }
            textView.setText(str + str2 + "…");
        }
    }

    @Override // p456z6.c
    public void a(String message) {
        Intrinsics.checkNotNullParameter(message, "message");
        if (f29727e) {
            UiThreadUtil.runOnUiThread(new RunnableC2215p(this, message));
        }
    }

    @Override // p456z6.c
    public void b() {
        if (f29727e) {
            UiThreadUtil.runOnUiThread(new RunnableC2214o(this));
        }
    }

    @Override // p456z6.c
    public void c(String str, Integer num, Integer num2) {
        if (f29727e) {
            UiThreadUtil.runOnUiThread(new RunnableC2213n(num, num2, this, str));
        }
    }
}
