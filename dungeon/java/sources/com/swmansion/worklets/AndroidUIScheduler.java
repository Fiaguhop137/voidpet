package com.swmansion.worklets;

import com.facebook.jni.HybridData;
import com.facebook.react.bridge.GuardedRunnable;
import com.facebook.react.bridge.JSExceptionHandler;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.UiThreadUtil;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes2.dex */
public class AndroidUIScheduler {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ReactApplicationContext f39356a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final AtomicBoolean f39357b = new AtomicBoolean(true);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Runnable f39358c = new com.swmansion.worklets.a(this);

    @p276p6.a
    private final HybridData mHybridData = initHybrid();

    class a extends GuardedRunnable {
        a(JSExceptionHandler jSExceptionHandler) {
            super(jSExceptionHandler);
        }

        @Override // com.facebook.react.bridge.GuardedRunnable
        public void runGuarded() {
            AndroidUIScheduler.this.f39358c.run();
        }
    }

    public AndroidUIScheduler(ReactApplicationContext reactApplicationContext) {
        this.f39356a = reactApplicationContext;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void d() {
        synchronized (this.f39357b) {
            try {
                if (this.f39357b.get()) {
                    triggerUI();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private native HybridData initHybrid();

    @p276p6.a
    private void scheduleTriggerOnUI() {
        UiThreadUtil.runOnUiThread(new a(this.f39356a.getExceptionHandler()));
    }

    public void c() {
        synchronized (this.f39357b) {
            this.f39357b.set(false);
            invalidate();
        }
    }

    public native void invalidate();

    public native void triggerUI();
}
