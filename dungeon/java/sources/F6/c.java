package F6;

import android.util.SparseArray;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.UiThreadUtil;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.WeakHashMap;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class c {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final a f2968g = new a(null);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final WeakHashMap f2969h = new WeakHashMap();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final WeakReference f2970a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Set f2971b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final AtomicInteger f2972c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Set f2973d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Map f2974e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final SparseArray f2975f;

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final c a(ReactContext context) {
            Intrinsics.checkNotNullParameter(context, "context");
            WeakHashMap weakHashMap = c.f2969h;
            Object cVar = weakHashMap.get(context);
            if (cVar == null) {
                cVar = new c(context, null);
                weakHashMap.put(context, cVar);
            }
            return (c) cVar;
        }
    }

    private c(ReactContext reactContext) {
        this.f2970a = new WeakReference(reactContext);
        this.f2971b = new CopyOnWriteArraySet();
        this.f2972c = new AtomicInteger(0);
        this.f2973d = new CopyOnWriteArraySet();
        this.f2974e = new ConcurrentHashMap();
        this.f2975f = new SparseArray();
    }

    public /* synthetic */ c(ReactContext reactContext, DefaultConstructorMarker defaultConstructorMarker) {
        this(reactContext);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void e(c cVar, int i10) {
        Iterator it = cVar.f2971b.iterator();
        while (it.hasNext()) {
            ((d) it.next()).b(i10);
        }
    }

    private final void i(int i10) {
        Runnable runnable = (Runnable) this.f2975f.get(i10);
        if (runnable != null) {
            UiThreadUtil.removeOnUiThread(runnable);
            this.f2975f.remove(i10);
        }
    }

    public final synchronized void c(d listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.f2971b.add(listener);
        Iterator it = this.f2973d.iterator();
        while (it.hasNext()) {
            listener.a(((Number) it.next()).intValue());
        }
    }

    public final synchronized void d(int i10) {
        boolean zRemove = this.f2973d.remove(Integer.valueOf(i10));
        this.f2974e.remove(Integer.valueOf(i10));
        i(i10);
        if (zRemove) {
            UiThreadUtil.runOnUiThread(new b(this, i10));
        }
    }

    public final boolean f() {
        return !this.f2973d.isEmpty();
    }

    public final synchronized boolean g(int i10) {
        return this.f2973d.contains(Integer.valueOf(i10));
    }

    public final void h(d listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.f2971b.remove(listener);
    }

    public final synchronized boolean j(int i10) {
        throw new IllegalStateException(("Tried to retrieve non-existent task config with id " + i10 + ".").toString());
    }
}
