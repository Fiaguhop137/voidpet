package com.th3rdwave.safeareacontext;

import android.content.Context;
import android.util.Log;
import android.view.View;
import android.view.ViewParent;
import android.view.ViewTreeObserver;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.uimanager.InterfaceC2260j0;
import com.facebook.react.uimanager.UIManagerModule;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.Unit;
import kotlin.jvm.internal.A;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
public final class k extends com.facebook.react.views.view.g implements ViewTreeObserver.OnPreDrawListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private o f39382a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private a f39383b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private m f39384c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private View f39385d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private InterfaceC2260j0 f39386e;

    public k(Context context) {
        super(context);
        this.f39382a = o.PADDING;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void A(UIManagerModule uIManagerModule) {
        uIManagerModule.getUIImplementation().m(-1);
    }

    private final void B() {
        A a10 = new A();
        ReentrantLock reentrantLock = new ReentrantLock();
        Condition conditionNewCondition = reentrantLock.newCondition();
        long jNanoTime = System.nanoTime();
        r.a(this).runOnNativeModulesQueueThread(new j(reentrantLock, a10, conditionNewCondition));
        reentrantLock.lock();
        long jNanoTime2 = 0;
        while (!a10.f48334a && jNanoTime2 < 500000000) {
            try {
                try {
                    conditionNewCondition.awaitNanos(500000000L);
                } catch (InterruptedException unused) {
                    a10.f48334a = true;
                }
                jNanoTime2 += System.nanoTime() - jNanoTime;
            } catch (Throwable th) {
                reentrantLock.unlock();
                throw th;
            }
        }
        Unit unit = Unit.f48228a;
        reentrantLock.unlock();
        if (jNanoTime2 >= 500000000) {
            Log.w("SafeAreaView", "Timed out waiting for layout.");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void C(ReentrantLock reentrantLock, A a10, Condition condition) {
        reentrantLock.lock();
        try {
            if (!a10.f48334a) {
                a10.f48334a = true;
                condition.signal();
            }
            Unit unit = Unit.f48228a;
        } finally {
            reentrantLock.unlock();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final View x() {
        for (ViewParent parent = getParent(); parent != 0; parent = parent.getParent()) {
            if (parent instanceof f) {
                return (View) parent;
            }
        }
        return this;
    }

    private final boolean y() {
        a aVarE;
        View view = this.f39385d;
        if (view == null || (aVarE = h.e(view)) == null || Intrinsics.b(this.f39383b, aVarE)) {
            return false;
        }
        this.f39383b = aVarE;
        z();
        return true;
    }

    private final void z() {
        a aVar = this.f39383b;
        if (aVar != null) {
            m mVar = this.f39384c;
            if (mVar == null) {
                l lVar = l.ADDITIVE;
                mVar = new m(lVar, lVar, lVar, lVar);
            }
            InterfaceC2260j0 stateWrapper = getStateWrapper();
            if (stateWrapper != null) {
                WritableMap writableMapCreateMap = Arguments.createMap();
                Intrinsics.checkNotNullExpressionValue(writableMapCreateMap, "createMap(...)");
                writableMapCreateMap.putMap("insets", q.b(aVar));
                stateWrapper.updateState(writableMapCreateMap);
                return;
            }
            n nVar = new n(aVar, this.f39382a, mVar);
            ReactContext reactContextA = r.a(this);
            UIManagerModule uIManagerModule = (UIManagerModule) reactContextA.getNativeModule(UIManagerModule.class);
            if (uIManagerModule != null) {
                uIManagerModule.setViewLocalData(getId(), nVar);
                reactContextA.runOnNativeModulesQueueThread(new i(uIManagerModule));
                B();
            }
        }
    }

    @Nullable
    public final InterfaceC2260j0 getStateWrapper() {
        return this.f39386e;
    }

    @Override // com.facebook.react.views.view.g, android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        ViewTreeObserver viewTreeObserver;
        super.onAttachedToWindow();
        View viewX = x();
        this.f39385d = viewX;
        if (viewX != null && (viewTreeObserver = viewX.getViewTreeObserver()) != null) {
            viewTreeObserver.addOnPreDrawListener(this);
        }
        y();
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        ViewTreeObserver viewTreeObserver;
        super.onDetachedFromWindow();
        View view = this.f39385d;
        if (view != null && (viewTreeObserver = view.getViewTreeObserver()) != null) {
            viewTreeObserver.removeOnPreDrawListener(this);
        }
        this.f39385d = null;
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public boolean onPreDraw() {
        boolean zY = y();
        if (zY) {
            requestLayout();
        }
        return !zY;
    }

    public final void setEdges(@NotNull m edges) {
        Intrinsics.checkNotNullParameter(edges, "edges");
        this.f39384c = edges;
        z();
    }

    public final void setMode(@NotNull o mode) {
        Intrinsics.checkNotNullParameter(mode, "mode");
        this.f39382a = mode;
        z();
    }

    public final void setStateWrapper(@Nullable InterfaceC2260j0 interfaceC2260j0) {
        this.f39386e = interfaceC2260j0;
    }
}
