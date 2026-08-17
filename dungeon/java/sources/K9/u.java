package K9;

import java.util.ArrayDeque;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes2.dex */
class u implements T9.d, T9.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Map f6128a = new HashMap();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Queue f6129b = new ArrayDeque();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Executor f6130c;

    u(Executor executor) {
        this.f6130c = executor;
    }

    private synchronized Set f(T9.a aVar) {
        Map map;
        try {
            map = (Map) this.f6128a.get(aVar.b());
        } catch (Throwable th) {
            throw th;
        }
        return map == null ? Collections.EMPTY_SET : map.entrySet();
    }

    @Override // T9.d
    public void a(Class cls, T9.b bVar) {
        b(cls, this.f6130c, bVar);
    }

    @Override // T9.d
    public synchronized void b(Class cls, Executor executor, T9.b bVar) {
        try {
            C.b(cls);
            C.b(bVar);
            C.b(executor);
            if (!this.f6128a.containsKey(cls)) {
                this.f6128a.put(cls, new ConcurrentHashMap());
            }
            ((ConcurrentHashMap) this.f6128a.get(cls)).put(bVar, executor);
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // T9.c
    public void c(T9.a aVar) {
        C.b(aVar);
        synchronized (this) {
            try {
                Queue queue = this.f6129b;
                if (queue != null) {
                    queue.add(aVar);
                    return;
                }
                for (Map.Entry entry : f(aVar)) {
                    ((Executor) entry.getValue()).execute(new t(entry, aVar));
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    void e() {
        Queue queue;
        synchronized (this) {
            try {
                queue = this.f6129b;
                if (queue != null) {
                    this.f6129b = null;
                } else {
                    queue = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (queue != null) {
            Iterator it = queue.iterator();
            while (it.hasNext()) {
                c((T9.a) it.next());
            }
        }
    }
}
