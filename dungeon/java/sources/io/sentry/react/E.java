package io.sentry.react;

import android.os.Handler;
import android.os.Looper;
import android.view.Choreographer;
import com.facebook.react.bridge.Promise;
import io.sentry.InterfaceC3755p2;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public abstract class E {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Map f46353a = new a(51, 0.75f, true);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static String f46354b = null;

    class a extends LinkedHashMap {
        a(int i10, float f10, boolean z10) {
            super(i10, f10, z10);
        }

        @Override // java.util.LinkedHashMap
        protected boolean removeEldestEntry(Map.Entry entry) {
            return size() > 50;
        }
    }

    public static /* synthetic */ void a(InterfaceC3755p2 interfaceC3755p2, Promise promise) {
        try {
            Choreographer.getInstance().postFrameCallback(new D(interfaceC3755p2, promise));
        } catch (Exception e10) {
            promise.reject("Failed to receive the instance of Choreographer", e10);
        }
    }

    public static void c(Promise promise, InterfaceC3755p2 interfaceC3755p2) {
        Looper mainLooper = Looper.getMainLooper();
        if (mainLooper == null) {
            promise.reject("GetTimeToDisplay is not able to measure the time to display: Main looper not available.");
        } else {
            new Handler(mainLooper).post(new C(interfaceC3755p2, promise));
        }
    }

    public static Double d(String str) {
        return (Double) f46353a.remove(str);
    }

    public static void e(String str, Double d10) {
        f46353a.put(str, d10);
    }

    public static void f(Double d10) {
        if (f46354b != null) {
            e("ttid-navigation-" + f46354b, d10);
        }
    }

    public static void g(String str) {
        f46354b = str;
    }
}
