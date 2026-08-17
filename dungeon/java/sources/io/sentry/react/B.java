package io.sentry.react;

import android.app.Activity;
import android.content.Context;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.ReadableType;
import com.facebook.react.common.JavascriptException;
import io.sentry.AbstractC3710g2;
import io.sentry.B3;
import io.sentry.C3697e;
import io.sentry.C3833z3;
import io.sentry.EnumC3721i3;
import io.sentry.EnumC3789t1;
import io.sentry.H;
import io.sentry.ILogger;
import io.sentry.InterfaceC3753p0;
import io.sentry.S1;
import io.sentry.UncaughtExceptionHandlerIntegration;
import io.sentry.V2;
import io.sentry.android.core.AnrIntegration;
import io.sentry.android.core.C3664q0;
import io.sentry.android.core.NdkIntegration;
import io.sentry.android.core.SentryAndroidOptions;
import io.sentry.android.core.Z0;
import java.net.URI;
import java.net.URISyntaxException;

/* JADX INFO: loaded from: classes3.dex */
abstract class B {
    public static /* synthetic */ boolean a(InterfaceC3753p0 interfaceC3753p0) {
        return (interfaceC3753p0 instanceof UncaughtExceptionHandlerIntegration) || (interfaceC3753p0 instanceof AnrIntegration) || (interfaceC3753p0 instanceof NdkIntegration);
    }

    public static /* synthetic */ V2 c(C3833z3.c cVar, V2 v10, H h10) {
        m(v10);
        return cVar != null ? cVar.a(v10, h10) : v10;
    }

    public static /* synthetic */ C3697e e(String str, String str2, C3697e c3697e, H h10) {
        Object objV = c3697e.v("url");
        String str3 = objV instanceof String ? (String) objV : "";
        if ("http".equals(c3697e.B())) {
            if (str != null && str3.startsWith(str)) {
                return null;
            }
            if (str2 != null && str3.startsWith(str2)) {
                return null;
            }
        }
        return c3697e;
    }

    private static void f(SentryAndroidOptions sentryAndroidOptions, ReadableMap readableMap, ILogger iLogger) {
        ReadableMap map;
        ReadableMap map2;
        if (readableMap.hasKey("_experiments") && (map = readableMap.getMap("_experiments")) != null && map.hasKey("profilingOptions") && (map2 = map.getMap("profilingOptions")) != null) {
            if (map2.hasKey("profileSessionSampleRate")) {
                if (map2.getType("profileSessionSampleRate") == ReadableType.Number) {
                    double d10 = map2.getDouble("profileSessionSampleRate");
                    sentryAndroidOptions.setProfileSessionSampleRate(Double.valueOf(d10));
                    iLogger.c(EnumC3721i3.INFO, String.format("UI Profiling profileSessionSampleRate set to: %.2f", Double.valueOf(d10)), new Object[0]);
                } else {
                    iLogger.c(EnumC3721i3.WARNING, "UI Profiling profileSessionSampleRate must be a number, ignoring invalid value", new Object[0]);
                }
            }
            if (map2.hasKey("lifecycle")) {
                if (map2.getType("lifecycle") == ReadableType.String) {
                    String string = map2.getString("lifecycle");
                    if ("manual".equalsIgnoreCase(string)) {
                        sentryAndroidOptions.setProfileLifecycle(EnumC3789t1.MANUAL);
                        iLogger.c(EnumC3721i3.INFO, "UI Profile Lifecycle set to MANUAL", new Object[0]);
                    } else if ("trace".equalsIgnoreCase(string)) {
                        sentryAndroidOptions.setProfileLifecycle(EnumC3789t1.TRACE);
                        iLogger.c(EnumC3721i3.INFO, "UI Profile Lifecycle set to TRACE", new Object[0]);
                    }
                } else {
                    iLogger.c(EnumC3721i3.WARNING, "UI Profiling lifecycle must be a string, ignoring invalid value", new Object[0]);
                }
            }
            if (map2.hasKey("startOnAppStart")) {
                if (map2.getType("startOnAppStart") != ReadableType.Boolean) {
                    iLogger.c(EnumC3721i3.WARNING, "UI Profiling startOnAppStart must be a boolean, ignoring invalid value", new Object[0]);
                    return;
                }
                boolean z10 = map2.getBoolean("startOnAppStart");
                sentryAndroidOptions.setStartProfilerOnAppStart(z10);
                iLogger.c(EnumC3721i3.INFO, String.format("UI Profiling startOnAppStart set to %b", Boolean.valueOf(z10)), new Object[0]);
            }
        }
    }

    private static B3 g(ReadableMap readableMap) {
        ReadableMap map;
        B3 b10 = new B3(false, new io.sentry.protocol.r("sentry.javascript.react-native", "8.4.0"));
        if (readableMap.hasKey("replaysSessionSampleRate") || readableMap.hasKey("replaysOnErrorSampleRate")) {
            b10.L(readableMap.hasKey("replaysSessionSampleRate") ? Double.valueOf(readableMap.getDouble("replaysSessionSampleRate")) : null);
            b10.I(readableMap.hasKey("replaysOnErrorSampleRate") ? Double.valueOf(readableMap.getDouble("replaysOnErrorSampleRate")) : null);
            if (readableMap.hasKey("mobileReplayOptions") && (map = readableMap.getMap("mobileReplayOptions")) != null) {
                b10.B(!map.hasKey("maskAllText") || map.getBoolean("maskAllText"));
                b10.A(!map.hasKey("maskAllImages") || map.getBoolean("maskAllImages"));
                if (!map.hasKey("maskAllVectors") || map.getBoolean("maskAllVectors")) {
                    b10.a("com.horcrux.svg.SvgView");
                }
                if (map.hasKey("screenshotStrategy")) {
                    if ("canvas".equals(map.getString("screenshotStrategy"))) {
                        b10.J(S1.CANVAS);
                    } else {
                        b10.J(S1.PIXEL_COPY);
                    }
                }
                b10.C(io.sentry.react.replay.a.class.getName());
                b10.M(io.sentry.react.replay.b.class.getName());
                return b10;
            }
        }
        return b10;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void h(SentryAndroidOptions sentryAndroidOptions, ReadableMap readableMap, ILogger iLogger) {
        if (readableMap.hasKey("debug") && readableMap.getBoolean("debug")) {
            sentryAndroidOptions.setDebug(true);
        }
        if (!readableMap.hasKey("dsn") || readableMap.getString("dsn") == null) {
            sentryAndroidOptions.setDsn("");
        } else {
            String string = readableMap.getString("dsn");
            iLogger.c(EnumC3721i3.INFO, String.format("Starting with DSN: '%s'", string), new Object[0]);
            sentryAndroidOptions.setDsn(string);
        }
        if (readableMap.hasKey("sampleRate")) {
            sentryAndroidOptions.setSampleRate(Double.valueOf(readableMap.getDouble("sampleRate")));
        }
        if (readableMap.hasKey("sendClientReports")) {
            sentryAndroidOptions.setSendClientReports(readableMap.getBoolean("sendClientReports"));
        }
        if (readableMap.hasKey("maxBreadcrumbs")) {
            sentryAndroidOptions.setMaxBreadcrumbs(readableMap.getInt("maxBreadcrumbs"));
        }
        if (readableMap.hasKey("maxCacheItems")) {
            sentryAndroidOptions.setMaxCacheItems(readableMap.getInt("maxCacheItems"));
        }
        if (readableMap.hasKey("environment") && readableMap.getString("environment") != null) {
            sentryAndroidOptions.setEnvironment(readableMap.getString("environment"));
        }
        if (readableMap.hasKey("release") && readableMap.getString("release") != null) {
            sentryAndroidOptions.setRelease(readableMap.getString("release"));
        }
        if (readableMap.hasKey("dist") && readableMap.getString("dist") != null) {
            sentryAndroidOptions.setDist(readableMap.getString("dist"));
        }
        if (readableMap.hasKey("enableAutoSessionTracking")) {
            sentryAndroidOptions.setEnableAutoSessionTracking(readableMap.getBoolean("enableAutoSessionTracking"));
        }
        if (readableMap.hasKey("sessionTrackingIntervalMillis")) {
            sentryAndroidOptions.setSessionTrackingIntervalMillis(readableMap.getInt("sessionTrackingIntervalMillis"));
        }
        if (readableMap.hasKey("shutdownTimeout")) {
            sentryAndroidOptions.setShutdownTimeoutMillis(readableMap.getInt("shutdownTimeout"));
        }
        if (readableMap.hasKey("enableNdkScopeSync")) {
            sentryAndroidOptions.setEnableScopeSync(readableMap.getBoolean("enableNdkScopeSync"));
        }
        if (readableMap.hasKey("attachStacktrace")) {
            sentryAndroidOptions.setAttachStacktrace(readableMap.getBoolean("attachStacktrace"));
        }
        if (readableMap.hasKey("attachThreads")) {
            sentryAndroidOptions.setAttachThreads(readableMap.getBoolean("attachThreads"));
        }
        if (readableMap.hasKey("attachScreenshot")) {
            sentryAndroidOptions.setAttachScreenshot(readableMap.getBoolean("attachScreenshot"));
        }
        if (readableMap.hasKey("attachViewHierarchy")) {
            sentryAndroidOptions.setAttachViewHierarchy(readableMap.getBoolean("attachViewHierarchy"));
        }
        if (readableMap.hasKey("sendDefaultPii")) {
            sentryAndroidOptions.setSendDefaultPii(readableMap.getBoolean("sendDefaultPii"));
        }
        if (readableMap.hasKey("maxQueueSize")) {
            sentryAndroidOptions.setMaxQueueSize(readableMap.getInt("maxQueueSize"));
        }
        if (readableMap.hasKey("enableNdk")) {
            sentryAndroidOptions.setEnableNdk(readableMap.getBoolean("enableNdk"));
        }
        if (readableMap.hasKey("enableTombstone")) {
            sentryAndroidOptions.setTombstoneEnabled(readableMap.getBoolean("enableTombstone"));
        }
        if (readableMap.hasKey("spotlight")) {
            if (readableMap.getType("spotlight") == ReadableType.Boolean) {
                sentryAndroidOptions.setEnableSpotlight(readableMap.getBoolean("spotlight"));
                if (readableMap.hasKey("defaultSidecarUrl")) {
                    sentryAndroidOptions.setSpotlightConnectionUrl(readableMap.getString("defaultSidecarUrl"));
                }
            } else if (readableMap.getType("spotlight") == ReadableType.String) {
                sentryAndroidOptions.setEnableSpotlight(true);
                sentryAndroidOptions.setSpotlightConnectionUrl(readableMap.getString("spotlight"));
            }
        }
        B3 b3G = g(readableMap);
        sentryAndroidOptions.setSessionReplay(b3G);
        if (j(b3G)) {
            sentryAndroidOptions.getReplayController().x(new u());
        }
        f(sentryAndroidOptions, readableMap, iLogger);
        sentryAndroidOptions.setBeforeBreadcrumb(new z(readableMap.hasKey("dsn") ? i(readableMap.getString("dsn")) : null, readableMap.hasKey("devServerUrl") ? readableMap.getString("devServerUrl") : null));
        if (readableMap.hasKey("enableNativeCrashHandling") && !readableMap.getBoolean("enableNativeCrashHandling")) {
            sentryAndroidOptions.getIntegrations().removeIf(new A());
        }
        iLogger.c(EnumC3721i3.INFO, String.format("Native Integrations '%s'", sentryAndroidOptions.getIntegrations()), new Object[0]);
    }

    private static String i(String str) {
        if (str == null) {
            return null;
        }
        try {
            URI uri = new URI(str);
            return uri.getScheme() + "://" + uri.getHost();
        } catch (URISyntaxException unused) {
            return null;
        }
    }

    private static boolean j(B3 b10) {
        return (b10.p() == null && b10.k() == null) ? false : true;
    }

    private static void k(Activity activity) {
        C3664q0 c3664q0C = C3664q0.c();
        if (activity != null) {
            c3664q0C.d(activity);
        }
    }

    private static void l(V2 v10, String str) {
        v10.d0("event.origin", "android");
        v10.d0("event.environment", str);
    }

    private static void m(V2 v10) {
        io.sentry.protocol.r rVarL = v10.L();
        if (rVarL != null) {
            String strE = rVarL.e();
            strE.getClass();
            if (strE.equals("sentry.java.android.react-native")) {
                l(v10, "java");
            } else if (strE.equals("sentry.native.android.react-native")) {
                l(v10, "native");
            }
        }
    }

    static void n(Context context, ReadableMap readableMap, Activity activity, AbstractC3710g2.a aVar, ILogger iLogger) {
        Z0.g(context, new C3778b(new w(readableMap, iLogger), new v(activity), aVar, new x()));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void o(SentryAndroidOptions sentryAndroidOptions, Activity activity) {
        io.sentry.protocol.r sdkVersion = sentryAndroidOptions.getSdkVersion();
        if (sdkVersion == null) {
            sdkVersion = new io.sentry.protocol.r("sentry.java.android.react-native", "8.33.0");
        } else {
            sdkVersion.h("sentry.java.android.react-native");
        }
        sdkVersion.c("npm:@sentry/react-native", "8.4.0");
        sentryAndroidOptions.setSentryClientName(sdkVersion.e() + "/" + sdkVersion.g());
        sentryAndroidOptions.setNativeSdkName("sentry.native.android.react-native");
        sentryAndroidOptions.setSdkVersion(sdkVersion);
        sentryAndroidOptions.setTracesSampleRate(null);
        sentryAndroidOptions.setTracesSampler(null);
        sentryAndroidOptions.addIgnoredExceptionForType(JavascriptException.class);
        k(activity);
    }

    static void p(SentryAndroidOptions sentryAndroidOptions) {
        sentryAndroidOptions.setBeforeSend(new y(sentryAndroidOptions.getBeforeSend()));
    }
}
