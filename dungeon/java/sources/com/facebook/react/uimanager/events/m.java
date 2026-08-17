package com.facebook.react.uimanager.events;

import android.os.Handler;
import android.view.Choreographer;
import com.facebook.react.bridge.LifecycleEventListener;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactSoftExceptionLogger;
import com.facebook.react.bridge.UIManager;
import com.facebook.react.bridge.UiThreadUtil;
import com.facebook.react.uimanager.C2270o0;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class m implements EventDispatcher, LifecycleEventListener {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final a f30421h = new a(null);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final Handler f30422i = UiThreadUtil.getUiThreadHandler();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ReactApplicationContext f30423a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final EventEmitterImpl f30424b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final CopyOnWriteArrayList f30425c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final CopyOnWriteArrayList f30426d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final b f30427e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private boolean f30428f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final Runnable f30429g;

    private static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    final class b implements Choreographer.FrameCallback {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private volatile boolean f30430a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private boolean f30431b;

        public b() {
        }

        private final void b() {
            com.facebook.react.modules.core.b.f29885f.a().k(com.facebook.react.modules.core.b.a.TIMERS_EVENTS, m.this.f30427e);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void e(b bVar) {
            bVar.c();
        }

        public final void c() {
            if (this.f30430a) {
                return;
            }
            this.f30430a = true;
            b();
        }

        public final void d() {
            if (this.f30430a) {
                return;
            }
            if (m.this.f30423a.isOnUiQueueThread()) {
                c();
            } else {
                m.this.f30423a.runOnUiQueueThread(new n(this));
            }
        }

        @Override // android.view.Choreographer.FrameCallback
        public void doFrame(long j10) {
            UiThreadUtil.assertOnUiThread();
            if (this.f30431b) {
                this.f30430a = false;
            } else {
                b();
            }
            p295q7.a.c(0L, "BatchEventDispatchedListeners");
            try {
                Iterator it = m.this.f30426d.iterator();
                Intrinsics.checkNotNullExpressionValue(it, "iterator(...)");
                while (it.hasNext()) {
                    ((com.facebook.react.uimanager.events.a) it.next()).onBatchEventDispatched();
                }
                p295q7.a.i(0L);
            } catch (Throwable th) {
                p295q7.a.i(0L);
                throw th;
            }
        }

        public final void f() {
            this.f30431b = false;
        }

        public final void g() {
            this.f30431b = true;
        }
    }

    public m(ReactApplicationContext reactContext, RCTModernEventEmitter fabricEventEmitter) {
        Intrinsics.checkNotNullParameter(reactContext, "reactContext");
        Intrinsics.checkNotNullParameter(fabricEventEmitter, "fabricEventEmitter");
        this.f30423a = reactContext;
        EventEmitterImpl eventEmitterImpl = new EventEmitterImpl(reactContext);
        this.f30424b = eventEmitterImpl;
        this.f30425c = new CopyOnWriteArrayList();
        this.f30426d = new CopyOnWriteArrayList();
        this.f30427e = new b();
        this.f30429g = new l(this);
        reactContext.addLifecycleEventListener(this);
        eventEmitterImpl.registerFabricEventEmitter(fabricEventEmitter);
    }

    private final void k() {
        UiThreadUtil.assertOnUiThread();
        if (!D6.b.x()) {
            this.f30427e.g();
        } else {
            this.f30428f = false;
            f30422i.removeCallbacks(this.f30429g);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void m(m mVar) {
        mVar.f30428f = false;
        p295q7.a.c(0L, "BatchEventDispatchedListeners");
        try {
            Iterator it = mVar.f30426d.iterator();
            Intrinsics.checkNotNullExpressionValue(it, "iterator(...)");
            while (it.hasNext()) {
                ((com.facebook.react.uimanager.events.a) it.next()).onBatchEventDispatched();
            }
            p295q7.a.i(0L);
        } catch (Throwable th) {
            p295q7.a.i(0L);
            throw th;
        }
    }

    private final void n(d dVar) {
        p295q7.a.c(0L, "FabricEventDispatcher.dispatchSynchronous('" + dVar.getEventName() + "')");
        try {
            UIManager uIManagerG = C2270o0.g(this.f30423a, 2);
            if (uIManagerG instanceof u) {
                ((u) uIManagerG).receiveEvent(dVar.getSurfaceId(), dVar.getViewTag(), dVar.getEventName(), dVar.canCoalesce(), dVar.internal_getEventData$ReactAndroid_release(), dVar.internal_getEventCategory$ReactAndroid_release(), true);
            } else {
                ReactSoftExceptionLogger.logSoftException("FabricEventDispatcher", new IllegalStateException("Fabric UIManager expected to implement SynchronousEventReceiver."));
            }
        } finally {
            p295q7.a.i(0L);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void p(m mVar) {
        mVar.k();
    }

    private final void r() {
        if (!D6.b.x()) {
            this.f30427e.d();
        } else {
            if (this.f30428f) {
                return;
            }
            this.f30428f = true;
            f30422i.postAtFrontOfQueue(this.f30429g);
        }
    }

    @Override // com.facebook.react.uimanager.events.EventDispatcher
    public void a() {
        o();
    }

    @Override // com.facebook.react.uimanager.events.EventDispatcher
    public void b(i listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.f30425c.remove(listener);
    }

    @Override // com.facebook.react.uimanager.events.EventDispatcher
    public void c(i listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.f30425c.add(listener);
    }

    @Override // com.facebook.react.uimanager.events.EventDispatcher
    public void d(d event) {
        Intrinsics.checkNotNullParameter(event, "event");
        Iterator it = this.f30425c.iterator();
        Intrinsics.checkNotNullExpressionValue(it, "iterator(...)");
        while (it.hasNext()) {
            ((i) it.next()).onEventDispatch(event);
        }
        if (event.internal_experimental_isSynchronous$ReactAndroid_release()) {
            n(event);
        } else {
            event.dispatchModern(this.f30424b);
        }
        event.dispose();
        r();
    }

    public void j(com.facebook.react.uimanager.events.a listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.f30426d.add(listener);
    }

    public void l() {
        r();
    }

    public final void o() {
        this.f30424b.registerFabricEventEmitter(null);
        UiThreadUtil.runOnUiThread(new k(this));
    }

    @Override // com.facebook.react.bridge.LifecycleEventListener
    public void onHostDestroy() {
        k();
    }

    @Override // com.facebook.react.bridge.LifecycleEventListener
    public void onHostPause() {
        k();
    }

    @Override // com.facebook.react.bridge.LifecycleEventListener
    public void onHostResume() {
        r();
        if (D6.b.x()) {
            return;
        }
        this.f30427e.f();
    }

    public void q(com.facebook.react.uimanager.events.a listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.f30426d.remove(listener);
    }
}
