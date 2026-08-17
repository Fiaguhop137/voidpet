package p346t4;

import L4.k;
import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.Map;
import java.util.Queue;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/* JADX INFO: loaded from: classes.dex */
final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Map f54439a = new HashMap();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final b f54440b = new b();

    private static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final Lock f54441a = new ReentrantLock();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        int f54442b;

        a() {
        }
    }

    private static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Queue f54443a = new ArrayDeque();

        b() {
        }

        a a() {
            a aVar;
            synchronized (this.f54443a) {
                aVar = (a) this.f54443a.poll();
            }
            return aVar == null ? new a() : aVar;
        }

        void b(a aVar) {
            synchronized (this.f54443a) {
                try {
                    if (this.f54443a.size() < 10) {
                        this.f54443a.offer(aVar);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    c() {
    }

    void a(String str) {
        a aVarA;
        synchronized (this) {
            try {
                aVarA = (a) this.f54439a.get(str);
                if (aVarA == null) {
                    aVarA = this.f54440b.a();
                    this.f54439a.put(str, aVarA);
                }
                aVarA.f54442b++;
            } catch (Throwable th) {
                throw th;
            }
        }
        aVarA.f54441a.lock();
    }

    void b(String str) {
        a aVar;
        synchronized (this) {
            try {
                aVar = (a) k.d(this.f54439a.get(str));
                int i10 = aVar.f54442b;
                if (i10 < 1) {
                    throw new IllegalStateException("Cannot release a lock that is not held, safeKey: " + str + ", interestedThreads: " + aVar.f54442b);
                }
                int i11 = i10 - 1;
                aVar.f54442b = i11;
                if (i11 == 0) {
                    a aVar2 = (a) this.f54439a.remove(str);
                    if (!aVar2.equals(aVar)) {
                        throw new IllegalStateException("Removed the wrong lock, expected to remove: " + aVar + ", but actually removed: " + aVar2 + ", safeKey: " + str);
                    }
                    this.f54440b.b(aVar2);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        aVar.f54441a.unlock();
    }
}
