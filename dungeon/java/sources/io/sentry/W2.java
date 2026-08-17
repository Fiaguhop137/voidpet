package io.sentry;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.HashSet;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes3.dex */
public final class W2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final D3 f44531a;

    public W2(D3 d10) {
        this.f44531a = (D3) io.sentry.util.w.c(d10, "The SentryStackTraceFactory is required.");
    }

    private io.sentry.protocol.s c(Throwable th, io.sentry.protocol.l lVar, Long l10, List list, boolean z10) {
        Package r10 = th.getClass().getPackage();
        String name = th.getClass().getName();
        io.sentry.protocol.s sVar = new io.sentry.protocol.s();
        String message = th.getMessage();
        if (r10 != null) {
            name = name.replace(r10.getName() + ".", "");
        }
        String name2 = r10 != null ? r10.getName() : null;
        if (list != null && !list.isEmpty()) {
            io.sentry.protocol.C c10 = new io.sentry.protocol.C(list);
            if (z10) {
                c10.i(Boolean.TRUE);
            }
            sVar.n(c10);
        }
        sVar.o(l10);
        sVar.p(name);
        sVar.l(lVar);
        sVar.m(name2);
        sVar.r(message);
        return sVar;
    }

    private List e(Deque deque) {
        return new ArrayList(deque);
    }

    Deque a(Throwable th) {
        return b(th, new AtomicInteger(-1), new HashSet(), new ArrayDeque(), null);
    }

    Deque b(Throwable th, AtomicInteger atomicInteger, HashSet hashSet, Deque deque, String str) {
        io.sentry.protocol.l lVar;
        Thread threadCurrentThread;
        Throwable th2;
        boolean zD;
        String str2 = str;
        int i10 = atomicInteger.get();
        Throwable cause = th;
        while (cause != null) {
            HashSet hashSet2 = hashSet;
            if (!hashSet2.add(cause)) {
                break;
            }
            if (str2 == null) {
                str2 = "chained";
            }
            int i11 = 0;
            if (cause instanceof io.sentry.exception.a) {
                io.sentry.exception.a aVar = (io.sentry.exception.a) cause;
                lVar = aVar.a();
                Throwable thC = aVar.c();
                threadCurrentThread = aVar.b();
                zD = aVar.d();
                th2 = thC;
            } else {
                lVar = new io.sentry.protocol.l();
                threadCurrentThread = Thread.currentThread();
                th2 = cause;
                zD = false;
            }
            io.sentry.protocol.l lVar2 = lVar;
            deque.addFirst(c(th2, lVar2, Long.valueOf(threadCurrentThread.getId()), this.f44531a.a(th2.getStackTrace(), Boolean.FALSE.equals(lVar2.l())), zD));
            if (lVar2.k() == null) {
                lVar2.r(str2);
            }
            if (atomicInteger.get() >= 0) {
                lVar2.p(Integer.valueOf(i10));
            }
            int iIncrementAndGet = atomicInteger.incrementAndGet();
            lVar2.m(Integer.valueOf(iIncrementAndGet));
            Throwable[] suppressed = th2.getSuppressed();
            if (suppressed != null && suppressed.length > 0) {
                int length = suppressed.length;
                while (i11 < length) {
                    b(suppressed[i11], atomicInteger, hashSet2, deque, "suppressed");
                    i11++;
                    hashSet2 = hashSet;
                    deque = deque;
                }
            }
            cause = th2.getCause();
            str2 = null;
            i10 = iIncrementAndGet;
        }
        return deque;
    }

    public List d(Throwable th) {
        return e(a(th));
    }

    public List f(io.sentry.protocol.D d10, io.sentry.protocol.l lVar, Throwable th) {
        io.sentry.protocol.C cN = d10.n();
        if (cN == null) {
            return new ArrayList(0);
        }
        ArrayList arrayList = new ArrayList(1);
        arrayList.add(c(th, lVar, d10.l(), cN.e(), true));
        return arrayList;
    }
}
