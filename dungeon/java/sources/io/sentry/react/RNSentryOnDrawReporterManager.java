package io.sentry.react;

import android.app.Activity;
import android.view.View;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.uimanager.C2262k0;
import com.facebook.react.uimanager.SimpleViewManager;
import io.sentry.EnumC3721i3;
import io.sentry.ILogger;
import io.sentry.InterfaceC3755p2;
import io.sentry.android.core.C3636g0;
import io.sentry.android.core.C3680z;
import io.sentry.android.core.a1;
import java.util.Objects;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
public class RNSentryOnDrawReporterManager extends SimpleViewManager<a> {
    public static final String REACT_CLASS = "RNSentryOnDrawReporter";
    public static final String TTFD_PREFIX = "ttfd-";
    public static final String TTID_PREFIX = "ttid-";

    @NotNull
    private final ReactApplicationContext mCallerContext;

    public static class a extends View {

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private static final ILogger f46355h = new C3680z("RNSentryOnDrawReporterView");

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final ReactApplicationContext f46356a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final InterfaceC3755p2 f46357b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final C3636g0 f46358c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private boolean f46359d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private boolean f46360e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private boolean f46361f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private String f46362g;

        public a(ReactApplicationContext reactApplicationContext, C3636g0 c3636g0) {
            super(reactApplicationContext);
            this.f46357b = new a1();
            this.f46359d = false;
            this.f46360e = false;
            this.f46361f = false;
            this.f46362g = null;
            this.f46356a = reactApplicationContext;
            this.f46358c = c3636g0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void b() {
            Double dValueOf = Double.valueOf(this.f46357b.now().p() / 1.0E9d);
            if (this.f46362g == null) {
                f46355h.c(EnumC3721i3.ERROR, "[TimeToDisplay] parentSpanId removed before frame was rendered.", new Object[0]);
                return;
            }
            if (this.f46359d) {
                E.e("ttid-" + this.f46362g, dValueOf);
                return;
            }
            if (!this.f46360e) {
                f46355h.c(EnumC3721i3.DEBUG, "[TimeToDisplay] display type removed before frame was rendered.", new Object[0]);
                return;
            }
            E.e("ttfd-" + this.f46362g, dValueOf);
        }

        private void c() {
            if (this.f46362g == null) {
                return;
            }
            if (this.f46361f) {
                f46355h.c(EnumC3721i3.DEBUG, "[TimeToDisplay] Already recorded time to display for spanId: " + this.f46362g, new Object[0]);
                return;
            }
            if (this.f46359d) {
                f46355h.c(EnumC3721i3.DEBUG, "[TimeToDisplay] Register initial display event emitter.", new Object[0]);
            } else {
                if (!this.f46360e) {
                    f46355h.c(EnumC3721i3.DEBUG, "[TimeToDisplay] Not ready, missing displayType prop.", new Object[0]);
                    return;
                }
                f46355h.c(EnumC3721i3.DEBUG, "[TimeToDisplay] Register full display event emitter.", new Object[0]);
            }
            if (this.f46358c == null) {
                f46355h.c(EnumC3721i3.ERROR, "[TimeToDisplay] Won't emit next frame drawn event, buildInfo is null.", new Object[0]);
                return;
            }
            ReactApplicationContext reactApplicationContext = this.f46356a;
            if (reactApplicationContext == null) {
                f46355h.c(EnumC3721i3.ERROR, "[TimeToDisplay] Won't emit next frame drawn event, reactContext is null.", new Object[0]);
                return;
            }
            ILogger iLogger = f46355h;
            Activity activityA = io.sentry.react.utils.a.a(reactApplicationContext, iLogger);
            if (activityA == null) {
                iLogger.c(EnumC3721i3.ERROR, "[TimeToDisplay] Won't emit next frame drawn event, activity is null.", new Object[0]);
            } else {
                this.f46361f = true;
                d(activityA, new p(this), this.f46358c);
            }
        }

        protected void d(Activity activity, Runnable runnable, C3636g0 c3636g0) {
            io.sentry.android.core.internal.util.u.d(activity, runnable, c3636g0);
        }

        public void setFullDisplay(boolean z10) {
            if (z10 != this.f46360e) {
                this.f46360e = z10;
                c();
            }
        }

        public void setInitialDisplay(boolean z10) {
            if (z10 != this.f46359d) {
                this.f46359d = z10;
                c();
            }
        }

        public void setParentSpanId(@Nullable String str) {
            if (Objects.equals(str, this.f46362g)) {
                return;
            }
            this.f46362g = str;
            this.f46361f = false;
            c();
        }
    }

    public RNSentryOnDrawReporterManager(ReactApplicationContext reactApplicationContext) {
        this.mCallerContext = reactApplicationContext;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.facebook.react.uimanager.ViewManager
    @NotNull
    public a createViewInstance(@NotNull C2262k0 c2262k0) {
        return new a(this.mCallerContext, new C3636g0(new C3680z()));
    }

    @Override // com.facebook.react.uimanager.ViewManager, com.facebook.react.bridge.NativeModule
    @NotNull
    public String getName() {
        return "RNSentryOnDrawReporter";
    }

    @Y6.a(defaultBoolean = false, name = "fullDisplay")
    public void setFullDisplay(a aVar, boolean z10) {
        aVar.setFullDisplay(z10);
    }

    @Y6.a(defaultBoolean = false, name = "initialDisplay")
    public void setInitialDisplay(a aVar, boolean z10) {
        aVar.setInitialDisplay(z10);
    }

    @Y6.a(name = "parentSpanId")
    public void setParentSpanId(a aVar, String str) {
        aVar.setParentSpanId(str);
    }
}
