package Ua;

import Ad.v;
import Rb.u;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import com.applovin.sdk.Axon;
import com.applovin.sdk.AxonInitializationConfiguration;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes2.dex */
final class b {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static Context f13427b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static boolean f13428c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static boolean f13429d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final b f13426a = new b();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final LinkedList f13430e = new LinkedList();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final LinkedList f13431f = new LinkedList();

    private b() {
    }

    private final Axon b() {
        Context context = f13427b;
        if (context != null) {
            return Axon.getInstance(context);
        }
        return null;
    }

    private final void c() {
        Axon axonB = b();
        if (axonB == null) {
            return;
        }
        while (true) {
            LinkedList linkedList = f13430e;
            if (linkedList.isEmpty()) {
                break;
            } else {
                axonB.processDeepLink((Uri) linkedList.removeFirst());
            }
        }
        while (true) {
            LinkedList linkedList2 = f13431f;
            if (linkedList2.isEmpty()) {
                return;
            }
            Object objRemoveFirst = linkedList2.removeFirst();
            Intrinsics.checkNotNullExpressionValue(objRemoveFirst, "removeFirst(...)");
            Pair pair = (Pair) objRemoveFirst;
            axonB.getEventService().trackEvent((String) pair.getFirst(), (HashMap) pair.getSecond());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void e(u uVar) {
        f13428c = true;
        f13429d = false;
        f13426a.c();
        uVar.d(true);
    }

    private final void h(Context context) {
        if (context != null) {
            f13427b = context.getApplicationContext();
        }
    }

    public final void d(Context context, String key, List testDeviceAdvertisingIds, u promise) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(testDeviceAdvertisingIds, "testDeviceAdvertisingIds");
        Intrinsics.checkNotNullParameter(promise, "promise");
        h(context);
        if (StringsKt.j0(key)) {
            promise.d(false);
            return;
        }
        Axon axonB = b();
        if (axonB == null) {
            f13429d = false;
            promise.d(false);
            return;
        }
        if (f13428c) {
            c();
            promise.d(true);
        } else {
            if (f13429d) {
                promise.d(true);
                return;
            }
            f13429d = true;
            AxonInitializationConfiguration.Builder builder = AxonInitializationConfiguration.builder(key);
            if (!testDeviceAdvertisingIds.isEmpty()) {
                builder.setTestDeviceAdvertisingIds(testDeviceAdvertisingIds);
            }
            axonB.initialize(builder.build(), new a(promise));
        }
    }

    public final void f(Context context, Uri uri) {
        h(context);
        if (uri == null) {
            return;
        }
        Axon axonB = f13428c ? b() : null;
        if (axonB != null) {
            axonB.processDeepLink(uri);
        } else {
            f13430e.add(uri);
        }
    }

    public final void g(Context context, Intent intent) {
        h(context);
        if (Intrinsics.b(intent != null ? intent.getAction() : null, "android.intent.action.VIEW")) {
            f(context, intent.getData());
        }
    }

    public final void i(Context context, String eventName, HashMap parameters) {
        Intrinsics.checkNotNullParameter(eventName, "eventName");
        Intrinsics.checkNotNullParameter(parameters, "parameters");
        h(context);
        Axon axonB = f13428c ? b() : null;
        if (axonB != null) {
            axonB.getEventService().trackEvent(eventName, parameters);
        } else {
            f13431f.add(v.a(eventName, parameters));
        }
    }
}
