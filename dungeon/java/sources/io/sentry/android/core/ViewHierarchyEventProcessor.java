package io.sentry.android.core;

import android.app.Activity;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import io.sentry.C3682b;
import io.sentry.EnumC3721i3;
import io.sentry.ILogger;
import io.sentry.V2;
import io.sentry.android.core.internal.util.C3648h;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes3.dex */
public final class ViewHierarchyEventProcessor implements io.sentry.C {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final SentryAndroidOptions f44813a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final io.sentry.android.core.internal.util.q f44814b = new io.sentry.android.core.internal.util.q(C3648h.b(), 2000, 3);

    public ViewHierarchyEventProcessor(SentryAndroidOptions sentryAndroidOptions) {
        this.f44813a = (SentryAndroidOptions) io.sentry.util.w.c(sentryAndroidOptions, "SentryAndroidOptions is required");
        if (sentryAndroidOptions.isAttachViewHierarchy()) {
            io.sentry.util.n.a("ViewHierarchy");
        }
    }

    public static /* synthetic */ void d(AtomicReference atomicReference, View view, List list, CountDownLatch countDownLatch, ILogger iLogger) {
        try {
            atomicReference.set(h(view, list));
            countDownLatch.countDown();
        } catch (Throwable th) {
            iLogger.b(EnumC3721i3.ERROR, "Failed to process view hierarchy.", th);
        }
    }

    private static void e(View view, io.sentry.protocol.K k10, List list) {
        if (view instanceof ViewGroup) {
            Iterator it = list.iterator();
            if (it.hasNext()) {
                android.support.v4.media.session.b.a(it.next());
                throw null;
            }
            ViewGroup viewGroup = (ViewGroup) view;
            int childCount = viewGroup.getChildCount();
            if (childCount == 0) {
                return;
            }
            ArrayList arrayList = new ArrayList(childCount);
            for (int i10 = 0; i10 < childCount; i10++) {
                View childAt = viewGroup.getChildAt(i10);
                if (childAt != null) {
                    io.sentry.protocol.K kI = i(childAt);
                    arrayList.add(kI);
                    e(childAt, kI, list);
                }
            }
            k10.m(arrayList);
        }
    }

    public static io.sentry.protocol.J f(Activity activity, ILogger iLogger) {
        return g(activity, new ArrayList(0), io.sentry.android.core.internal.util.m.e(), iLogger);
    }

    public static io.sentry.protocol.J g(Activity activity, List list, io.sentry.util.thread.a aVar, ILogger iLogger) {
        ILogger iLogger2;
        Throwable th;
        if (activity == null) {
            iLogger.c(EnumC3721i3.INFO, "Missing activity for view hierarchy snapshot.", new Object[0]);
            return null;
        }
        Window window = activity.getWindow();
        if (window == null) {
            iLogger.c(EnumC3721i3.INFO, "Missing window for view hierarchy snapshot.", new Object[0]);
            return null;
        }
        View viewPeekDecorView = window.peekDecorView();
        if (viewPeekDecorView == null) {
            iLogger.c(EnumC3721i3.INFO, "Missing decor view for view hierarchy snapshot.", new Object[0]);
            return null;
        }
        try {
            if (!aVar.a()) {
                CountDownLatch countDownLatch = new CountDownLatch(1);
                AtomicReference atomicReference = new AtomicReference(null);
                iLogger2 = iLogger;
                try {
                    activity.runOnUiThread(new l1(atomicReference, viewPeekDecorView, list, countDownLatch, iLogger2));
                    if (countDownLatch.await(1000L, TimeUnit.MILLISECONDS)) {
                        return (io.sentry.protocol.J) atomicReference.get();
                    }
                } catch (Throwable th2) {
                    th = th2;
                    th = th;
                    iLogger2.b(EnumC3721i3.ERROR, "Failed to process view hierarchy.", th);
                }
                return null;
            }
            try {
                return h(viewPeekDecorView, list);
            } catch (Throwable th3) {
                th = th3;
                iLogger2 = iLogger;
            }
        } catch (Throwable th4) {
            th = th4;
            iLogger2 = iLogger;
        }
        th = th;
        iLogger2.b(EnumC3721i3.ERROR, "Failed to process view hierarchy.", th);
        return null;
    }

    public static io.sentry.protocol.J h(View view, List list) {
        ArrayList arrayList = new ArrayList(1);
        io.sentry.protocol.J j10 = new io.sentry.protocol.J("android_view_system", arrayList);
        io.sentry.protocol.K kI = i(view);
        arrayList.add(kI);
        e(view, kI, list);
        return j10;
    }

    private static io.sentry.protocol.K i(View view) {
        io.sentry.protocol.K k10 = new io.sentry.protocol.K();
        k10.p(io.sentry.android.core.internal.util.n.a(view));
        try {
            k10.o(io.sentry.android.core.internal.gestures.i.b(view));
        } catch (Throwable unused) {
        }
        k10.t(Double.valueOf(view.getX()));
        k10.u(Double.valueOf(view.getY()));
        k10.s(Double.valueOf(view.getWidth()));
        k10.n(Double.valueOf(view.getHeight()));
        k10.l(Double.valueOf(view.getAlpha()));
        int visibility = view.getVisibility();
        if (visibility == 0) {
            k10.r("visible");
        } else if (visibility == 4) {
            k10.r("invisible");
        } else if (visibility == 8) {
            k10.r("gone");
        }
        return k10;
    }

    @Override // io.sentry.C
    public V2 b(V2 v10, io.sentry.H h10) {
        io.sentry.protocol.J jG;
        if (v10.z0()) {
            if (!this.f44813a.isAttachViewHierarchy()) {
                this.f44813a.getLogger().c(EnumC3721i3.DEBUG, "attachViewHierarchy is disabled.", new Object[0]);
                return v10;
            }
            if (!io.sentry.util.l.g(h10)) {
                boolean zA = this.f44814b.a();
                this.f44813a.getBeforeViewHierarchyCaptureCallback();
                if (!zA && (jG = g(C3664q0.c().b(), this.f44813a.getViewHierarchyExporters(), this.f44813a.getThreadChecker(), this.f44813a.getLogger())) != null) {
                    h10.p(C3682b.c(jG));
                }
            }
        }
        return v10;
    }

    @Override // io.sentry.C
    public io.sentry.protocol.E c(io.sentry.protocol.E e10, io.sentry.H h10) {
        return e10;
    }
}
