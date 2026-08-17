package com.facebook.react.uimanager.events;

import android.util.LongSparseArray;
import android.view.Choreographer;
import com.facebook.react.bridge.LifecycleEventListener;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.UiThreadUtil;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.Unit;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class g implements EventDispatcher, LifecycleEventListener {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final a f30396q = new a(null);

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private static final Comparator f30397r = new f();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ReactApplicationContext f30398a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Object f30399b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Object f30400c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final LongSparseArray f30401d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Map f30402e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final b f30403f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final ArrayList f30404g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final CopyOnWriteArrayList f30405h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final CopyOnWriteArrayList f30406i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final c f30407j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final AtomicInteger f30408k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private d[] f30409l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private int f30410m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final EventEmitterImpl f30411n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private short f30412o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private volatile boolean f30413p;

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final long b(int i10, short s10, short s11) {
            return ((((long) s10) & 65535) << 32) | ((long) i10) | ((((long) s11) & 65535) << 48);
        }
    }

    private final class b implements Runnable {
        public b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            p295q7.a.c(0L, "DispatchEventsRunnable");
            try {
                p295q7.a.f(0L, "ScheduleDispatchFrameCallback", g.this.f30408k.getAndIncrement());
                g.this.f30413p = false;
                Object obj = g.this.f30400c;
                g gVar = g.this;
                synchronized (obj) {
                    try {
                        if (gVar.f30410m > 0) {
                            if (gVar.f30410m > 1) {
                                Arrays.sort(gVar.f30409l, 0, gVar.f30410m, g.f30397r);
                            }
                            int i10 = gVar.f30410m;
                            for (int i11 = 0; i11 < i10; i11++) {
                                d dVar = gVar.f30409l[i11];
                                if (dVar != null) {
                                    p295q7.a.f(0L, dVar.getEventName(), dVar.getUniqueID());
                                    dVar.dispatchModern(gVar.f30411n);
                                    dVar.dispose();
                                }
                            }
                            gVar.x();
                            gVar.f30401d.clear();
                        }
                        Unit unit = Unit.f48228a;
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                Iterator it = g.this.f30406i.iterator();
                Intrinsics.checkNotNullExpressionValue(it, "iterator(...)");
                while (it.hasNext()) {
                    ((com.facebook.react.uimanager.events.a) it.next()).onBatchEventDispatched();
                }
                p295q7.a.i(0L);
            } catch (Throwable th2) {
                p295q7.a.i(0L);
                throw th2;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    final class c implements Choreographer.FrameCallback {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private volatile boolean f30415a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private boolean f30416b;

        public c() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void d(c cVar) {
            cVar.b();
        }

        public final void b() {
            if (this.f30415a) {
                return;
            }
            this.f30415a = true;
            e();
        }

        public final void c() {
            if (this.f30415a) {
                return;
            }
            if (g.this.f30398a.isOnUiQueueThread()) {
                b();
            } else {
                g.this.f30398a.runOnUiQueueThread(new h(this));
            }
        }

        @Override // android.view.Choreographer.FrameCallback
        public void doFrame(long j10) {
            UiThreadUtil.assertOnUiThread();
            if (this.f30416b) {
                this.f30415a = false;
            } else {
                e();
            }
            p295q7.a.c(0L, "ScheduleDispatchFrameCallback");
            try {
                g.this.A();
                if (!g.this.f30413p) {
                    g.this.f30413p = true;
                    p295q7.a.l(0L, "ScheduleDispatchFrameCallback", g.this.f30408k.get());
                    g.this.f30398a.runOnJSQueueThread(g.this.f30403f);
                }
            } finally {
                p295q7.a.i(0L);
            }
        }

        public final void e() {
            com.facebook.react.modules.core.b.f29885f.a().k(com.facebook.react.modules.core.b.a.TIMERS_EVENTS, g.this.f30407j);
        }

        public final void f() {
            this.f30416b = true;
        }
    }

    public g(ReactApplicationContext reactContext) {
        Intrinsics.checkNotNullParameter(reactContext, "reactContext");
        this.f30398a = reactContext;
        this.f30399b = new Object();
        this.f30400c = new Object();
        this.f30401d = new LongSparseArray();
        this.f30402e = new LinkedHashMap();
        this.f30403f = new b();
        this.f30404g = new ArrayList();
        this.f30405h = new CopyOnWriteArrayList();
        this.f30406i = new CopyOnWriteArrayList();
        this.f30407j = new c();
        this.f30408k = new AtomicInteger();
        this.f30409l = new d[16];
        reactContext.addLifecycleEventListener(this);
        this.f30411n = new EventEmitterImpl(reactContext);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void A() {
        synchronized (this.f30399b) {
            synchronized (this.f30400c) {
                try {
                    int size = this.f30404g.size();
                    for (int i10 = 0; i10 < size; i10++) {
                        Object obj = this.f30404g.get(i10);
                        Intrinsics.checkNotNullExpressionValue(obj, "get(...)");
                        d dVar = (d) obj;
                        if (dVar.canCoalesce()) {
                            long jY = y(dVar.getViewTag(), dVar.getEventName(), dVar.getCoalescingKey());
                            Integer num = (Integer) this.f30401d.get(jY);
                            d dVar2 = null;
                            if (num == null) {
                                this.f30401d.put(jY, Integer.valueOf(this.f30410m));
                            } else {
                                d dVar3 = this.f30409l[num.intValue()];
                                if (dVar3 == null) {
                                    throw new IllegalStateException("Required value was null.");
                                }
                                d dVarCoalesce = dVar.coalesce(dVar3);
                                if (dVarCoalesce != dVar3) {
                                    this.f30401d.put(jY, Integer.valueOf(this.f30410m));
                                    this.f30409l[num.intValue()] = null;
                                    dVar2 = dVar3;
                                    dVar = dVarCoalesce;
                                } else {
                                    dVar2 = dVar;
                                    dVar = null;
                                }
                            }
                            if (dVar != null) {
                                w(dVar);
                            }
                            if (dVar2 != null) {
                                dVar2.dispose();
                            }
                        } else {
                            w(dVar);
                        }
                    }
                    Unit unit = Unit.f48228a;
                } catch (Throwable th) {
                    throw th;
                }
            }
            this.f30404g.clear();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void B(g gVar) {
        gVar.C();
    }

    private final void C() {
        UiThreadUtil.assertOnUiThread();
        this.f30407j.f();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int g(d dVar, d dVar2) {
        if (dVar == null && dVar2 == null) {
            return 0;
        }
        if (dVar == null) {
            return -1;
        }
        if (dVar2 == null) {
            return 1;
        }
        long timestampMs = dVar.getTimestampMs() - dVar2.getTimestampMs();
        if (timestampMs == 0) {
            return 0;
        }
        return timestampMs < 0 ? -1 : 1;
    }

    private final void w(d dVar) {
        int i10 = this.f30410m;
        d[] dVarArr = this.f30409l;
        if (i10 == dVarArr.length) {
            Object[] objArrCopyOf = Arrays.copyOf(dVarArr, dVarArr.length * 2);
            Intrinsics.checkNotNullExpressionValue(objArrCopyOf, "copyOf(...)");
            this.f30409l = (d[]) objArrCopyOf;
        }
        d[] dVarArr2 = this.f30409l;
        int i11 = this.f30410m;
        this.f30410m = i11 + 1;
        dVarArr2[i11] = dVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void x() {
        Arrays.fill(this.f30409l, 0, this.f30410m, (Object) null);
        this.f30410m = 0;
    }

    private final long y(int i10, String str, short s10) {
        short sShortValue;
        Short sh = (Short) this.f30402e.get(str);
        if (sh != null) {
            sShortValue = sh.shortValue();
        } else {
            short s11 = this.f30412o;
            this.f30412o = (short) (s11 + 1);
            this.f30402e.put(str, Short.valueOf(s11));
            sShortValue = s11;
        }
        return f30396q.b(i10, sShortValue, s10);
    }

    private final void z() {
        this.f30407j.c();
    }

    @Override // com.facebook.react.uimanager.events.EventDispatcher
    public void a() {
        UiThreadUtil.runOnUiThread(new e(this));
    }

    @Override // com.facebook.react.uimanager.events.EventDispatcher
    public void b(i listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.f30405h.remove(listener);
    }

    @Override // com.facebook.react.uimanager.events.EventDispatcher
    public void c(i listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.f30405h.add(listener);
    }

    @Override // com.facebook.react.uimanager.events.EventDispatcher
    public void d(d event) {
        Intrinsics.checkNotNullParameter(event, "event");
        if (!event.isInitialized()) {
            throw new IllegalArgumentException("Dispatched event hasn't been initialized");
        }
        Iterator it = this.f30405h.iterator();
        Intrinsics.checkNotNullExpressionValue(it, "iterator(...)");
        while (it.hasNext()) {
            ((i) it.next()).onEventDispatch(event);
        }
        synchronized (this.f30399b) {
            this.f30404g.add(event);
            p295q7.a.l(0L, event.getEventName(), event.getUniqueID());
            Unit unit = Unit.f48228a;
        }
        z();
    }

    @Override // com.facebook.react.bridge.LifecycleEventListener
    public void onHostDestroy() {
        C();
    }

    @Override // com.facebook.react.bridge.LifecycleEventListener
    public void onHostPause() {
        C();
    }

    @Override // com.facebook.react.bridge.LifecycleEventListener
    public void onHostResume() {
        z();
    }
}
