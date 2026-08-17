package com.facebook.react.modules.core;

import android.util.SparseArray;
import android.view.Choreographer;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.LifecycleEventListener;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.UiThreadUtil;
import com.facebook.react.bridge.WritableArray;
import java.util.Iterator;
import java.util.PriorityQueue;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import p312r6.j;

/* JADX INFO: loaded from: classes2.dex */
public class JavaTimerManager implements LifecycleEventListener, F6.d {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private static final a f29858q = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ReactApplicationContext f29859a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final M6.c f29860b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final com.facebook.react.modules.core.b f29861c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final p456z6.e f29862d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Object f29863e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final Object f29864f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final SparseArray f29865g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final AtomicBoolean f29866h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final AtomicBoolean f29867i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final e f29868j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final c f29869k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private b f29870l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private boolean f29871m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private boolean f29872n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private boolean f29873o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private final PriorityQueue f29874p;

    private static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final boolean b(d dVar, long j10) {
            return !dVar.b() && ((long) dVar.a()) < j10;
        }
    }

    private final class b implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final long f29875a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private volatile boolean f29876b;

        public b(long j10) {
            this.f29875a = j10;
        }

        public final void a() {
            this.f29876b = true;
        }

        @Override // java.lang.Runnable
        public void run() {
            boolean z10;
            if (this.f29876b) {
                return;
            }
            long jC = j.c() - (this.f29875a / ((long) 1000000));
            long jA = j.a() - jC;
            if (16.666666f - jC < 1.0f) {
                return;
            }
            Object obj = JavaTimerManager.this.f29864f;
            JavaTimerManager javaTimerManager = JavaTimerManager.this;
            synchronized (obj) {
                z10 = javaTimerManager.f29873o;
                Unit unit = Unit.f48228a;
            }
            if (z10) {
                JavaTimerManager.this.f29860b.callIdleCallbacks(jA);
            }
            JavaTimerManager.this.f29870l = null;
        }
    }

    private final class c implements Choreographer.FrameCallback {
        public c() {
        }

        @Override // android.view.Choreographer.FrameCallback
        public void doFrame(long j10) {
            if (!JavaTimerManager.this.f29866h.get() || JavaTimerManager.this.f29867i.get()) {
                b bVar = JavaTimerManager.this.f29870l;
                if (bVar != null) {
                    bVar.a();
                }
                JavaTimerManager javaTimerManager = JavaTimerManager.this;
                javaTimerManager.f29870l = javaTimerManager.new b(j10);
                JavaTimerManager.this.f29859a.runOnJSQueueThread(JavaTimerManager.this.f29870l);
                JavaTimerManager.this.f29861c.k(com.facebook.react.modules.core.b.a.IDLE_EVENT, this);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    static final class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final int f29879a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private long f29880b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final int f29881c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final boolean f29882d;

        public d(int i10, long j10, int i11, boolean z10) {
            this.f29879a = i10;
            this.f29880b = j10;
            this.f29881c = i11;
            this.f29882d = z10;
        }

        public final int a() {
            return this.f29881c;
        }

        public final boolean b() {
            return this.f29882d;
        }

        public final long c() {
            return this.f29880b;
        }

        public final int d() {
            return this.f29879a;
        }

        public final void e(long j10) {
            this.f29880b = j10;
        }
    }

    private final class e implements Choreographer.FrameCallback {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private WritableArray f29883a;

        public e() {
        }

        @Override // android.view.Choreographer.FrameCallback
        public void doFrame(long j10) {
            d dVar;
            if (!JavaTimerManager.this.f29866h.get() || JavaTimerManager.this.f29867i.get()) {
                long j11 = j10 / ((long) 1000000);
                Object obj = JavaTimerManager.this.f29863e;
                JavaTimerManager javaTimerManager = JavaTimerManager.this;
                synchronized (obj) {
                    while (!javaTimerManager.f29874p.isEmpty()) {
                        try {
                            Object objPeek = javaTimerManager.f29874p.peek();
                            Intrinsics.c(objPeek);
                            if (((d) objPeek).c() >= j11 || (dVar = (d) javaTimerManager.f29874p.poll()) == null) {
                                break;
                                break;
                            }
                            if (this.f29883a == null) {
                                this.f29883a = Arguments.createArray();
                            }
                            WritableArray writableArray = this.f29883a;
                            if (writableArray != null) {
                                writableArray.pushInt(dVar.d());
                            }
                            if (dVar.b()) {
                                dVar.e(((long) dVar.a()) + j11);
                                javaTimerManager.f29874p.add(dVar);
                            } else {
                                javaTimerManager.f29865g.remove(dVar.d());
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                    Unit unit = Unit.f48228a;
                }
                WritableArray writableArray2 = this.f29883a;
                if (writableArray2 != null) {
                    JavaTimerManager.this.f29860b.callTimers(writableArray2);
                    this.f29883a = null;
                }
                JavaTimerManager.this.f29861c.k(com.facebook.react.modules.core.b.a.TIMERS_EVENTS, this);
            }
        }
    }

    public JavaTimerManager(ReactApplicationContext reactApplicationContext, M6.c javaScriptTimerExecutor, com.facebook.react.modules.core.b reactChoreographer, p456z6.e devSupportManager) {
        Intrinsics.checkNotNullParameter(reactApplicationContext, "reactApplicationContext");
        Intrinsics.checkNotNullParameter(javaScriptTimerExecutor, "javaScriptTimerExecutor");
        Intrinsics.checkNotNullParameter(reactChoreographer, "reactChoreographer");
        Intrinsics.checkNotNullParameter(devSupportManager, "devSupportManager");
        this.f29859a = reactApplicationContext;
        this.f29860b = javaScriptTimerExecutor;
        this.f29861c = reactChoreographer;
        this.f29862d = devSupportManager;
        this.f29863e = new Object();
        this.f29864f = new Object();
        this.f29865g = new SparseArray();
        this.f29866h = new AtomicBoolean(true);
        this.f29867i = new AtomicBoolean(false);
        this.f29868j = new e();
        this.f29869k = new c();
        this.f29874p = new PriorityQueue(11, new M6.d(new com.facebook.react.modules.core.a()));
        reactApplicationContext.addLifecycleEventListener(this);
        F6.c.f2968g.a(reactApplicationContext).c(this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void A(JavaTimerManager javaTimerManager, boolean z10) {
        synchronized (javaTimerManager.f29864f) {
            try {
                if (z10) {
                    javaTimerManager.z();
                } else {
                    javaTimerManager.r();
                }
                Unit unit = Unit.f48228a;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int B(d dVar, d dVar2) {
        return Od.a.a(dVar.c() - dVar2.c());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int C(Function2 function2, Object obj, Object obj2) {
        return ((Number) function2.invoke(obj, obj2)).intValue();
    }

    private final void r() {
        if (this.f29872n) {
            this.f29861c.n(com.facebook.react.modules.core.b.a.IDLE_EVENT, this.f29869k);
            this.f29872n = false;
        }
    }

    private final void s() {
        F6.c cVarA = F6.c.f2968g.a(this.f29859a);
        if (this.f29871m && this.f29866h.get() && !cVarA.f()) {
            this.f29861c.n(com.facebook.react.modules.core.b.a.TIMERS_EVENTS, this.f29868j);
            this.f29871m = false;
        }
    }

    private final void v() {
        if (!this.f29866h.get() || this.f29867i.get()) {
            return;
        }
        s();
    }

    private final void w() {
        synchronized (this.f29864f) {
            try {
                if (this.f29873o) {
                    z();
                }
                Unit unit = Unit.f48228a;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private final void y() {
        if (this.f29871m) {
            return;
        }
        this.f29861c.k(com.facebook.react.modules.core.b.a.TIMERS_EVENTS, this.f29868j);
        this.f29871m = true;
    }

    private final void z() {
        if (this.f29872n) {
            return;
        }
        this.f29861c.k(com.facebook.react.modules.core.b.a.IDLE_EVENT, this.f29869k);
        this.f29872n = true;
    }

    @Override // F6.d
    public void a(int i10) {
        if (this.f29867i.getAndSet(true)) {
            return;
        }
        y();
        w();
    }

    @Override // F6.d
    public void b(int i10) {
        if (F6.c.f2968g.a(this.f29859a).f()) {
            return;
        }
        this.f29867i.set(false);
        s();
        v();
    }

    @p276p6.a
    public void createTimer(int i10, long j10, boolean z10) {
        d dVar = new d(i10, (j.b() / ((long) 1000000)) + j10, (int) j10, z10);
        synchronized (this.f29863e) {
            this.f29874p.add(dVar);
            this.f29865g.put(i10, dVar);
            Unit unit = Unit.f48228a;
        }
    }

    @p276p6.a
    public void deleteTimer(int i10) {
        synchronized (this.f29863e) {
            d dVar = (d) this.f29865g.get(i10);
            if (dVar == null) {
                return;
            }
            this.f29865g.remove(i10);
            this.f29874p.remove(dVar);
        }
    }

    @Override // com.facebook.react.bridge.LifecycleEventListener
    public void onHostDestroy() {
        s();
        v();
    }

    @Override // com.facebook.react.bridge.LifecycleEventListener
    public void onHostPause() {
        this.f29866h.set(true);
        s();
        v();
    }

    @Override // com.facebook.react.bridge.LifecycleEventListener
    public void onHostResume() {
        this.f29866h.set(false);
        y();
        w();
    }

    @p276p6.a
    public void setSendIdleEvents(boolean z10) {
        synchronized (this.f29864f) {
            this.f29873o = z10;
            Unit unit = Unit.f48228a;
        }
        UiThreadUtil.runOnUiThread(new M6.e(this, z10));
    }

    public void t(int i10, int i11, double d10, boolean z10) {
        long jA = j.a();
        long j10 = (long) d10;
        if (this.f29862d.n() && Math.abs(j10 - jA) > 60000) {
            this.f29860b.emitTimeDriftWarning("Debugger and device times have drifted by more than 60s. Please correct this by running adb shell \"date `date +%m%d%H%M%Y.%S`\" on your debugger machine.");
        }
        long jMax = Math.max(0L, (j10 - jA) + ((long) i11));
        if (i11 != 0 || z10) {
            createTimer(i10, jMax, z10);
            return;
        }
        WritableArray writableArrayCreateArray = Arguments.createArray();
        Intrinsics.checkNotNullExpressionValue(writableArrayCreateArray, "createArray(...)");
        writableArrayCreateArray.pushInt(i10);
        this.f29860b.callTimers(writableArrayCreateArray);
    }

    public final boolean u(long j10) {
        synchronized (this.f29863e) {
            d dVar = (d) this.f29874p.peek();
            if (dVar == null) {
                return false;
            }
            if (f29858q.b(dVar, j10)) {
                return true;
            }
            Iterator it = this.f29874p.iterator();
            Intrinsics.checkNotNullExpressionValue(it, "iterator(...)");
            while (it.hasNext()) {
                d dVar2 = (d) it.next();
                a aVar = f29858q;
                Intrinsics.c(dVar2);
                if (aVar.b(dVar2, j10)) {
                    return true;
                }
            }
            Unit unit = Unit.f48228a;
            return false;
        }
    }

    public void x() {
        F6.c.f2968g.a(this.f29859a).h(this);
        this.f29859a.removeLifecycleEventListener(this);
        s();
        r();
    }
}
