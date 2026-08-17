package io.sentry;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class E3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final D3 f44326a;

    public E3(D3 d10) {
        this.f44326a = (D3) io.sentry.util.w.c(d10, "The SentryStackTraceFactory is required.");
    }

    private io.sentry.protocol.D d(boolean z10, StackTraceElement[] stackTraceElementArr, Thread thread, boolean z11) {
        List listA;
        io.sentry.protocol.D d10 = new io.sentry.protocol.D();
        d10.w(thread.getName());
        d10.x(Integer.valueOf(thread.getPriority()));
        d10.u(Long.valueOf(thread.getId()));
        d10.s(Boolean.valueOf(thread.isDaemon()));
        d10.z(thread.getState().name());
        d10.q(Boolean.valueOf(z10));
        if (z11 && (listA = this.f44326a.a(stackTraceElementArr, false)) != null && !listA.isEmpty()) {
            io.sentry.protocol.C c10 = new io.sentry.protocol.C(listA);
            c10.i(Boolean.TRUE);
            d10.y(c10);
        }
        return d10;
    }

    List a(boolean z10) {
        HashMap map = new HashMap();
        Thread threadCurrentThread = Thread.currentThread();
        map.put(threadCurrentThread, threadCurrentThread.getStackTrace());
        return c(map, null, false, z10);
    }

    List b(List list, boolean z10, boolean z11) {
        return c(Thread.getAllStackTraces(), list, z10, z11);
    }

    List c(Map map, List list, boolean z10, boolean z11) {
        Thread threadCurrentThread = Thread.currentThread();
        if (map.isEmpty()) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        if (!map.containsKey(threadCurrentThread)) {
            map.put(threadCurrentThread, threadCurrentThread.getStackTrace());
        }
        for (Map.Entry entry : map.entrySet()) {
            Thread thread = (Thread) entry.getKey();
            arrayList.add(d((thread == threadCurrentThread && !z10) || !(list == null || !list.contains(Long.valueOf(thread.getId())) || z10), (StackTraceElement[]) entry.getValue(), (Thread) entry.getKey(), z11));
        }
        return arrayList;
    }
}
