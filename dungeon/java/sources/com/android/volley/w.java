package com.android.volley;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.BlockingQueue;

/* JADX INFO: loaded from: classes.dex */
class w implements n.b {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final q f27920b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final c f27922d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final BlockingQueue f27923e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Map f27919a = new HashMap();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final o f27921c = null;

    w(c cVar, BlockingQueue blockingQueue, q qVar) {
        this.f27920b = qVar;
        this.f27922d = cVar;
        this.f27923e = blockingQueue;
    }

    @Override // com.android.volley.n.b
    public void a(n nVar, p pVar) {
        List list;
        b.a aVar = pVar.f27905b;
        if (aVar == null || aVar.a()) {
            b(nVar);
            return;
        }
        String cacheKey = nVar.getCacheKey();
        synchronized (this) {
            list = (List) this.f27919a.remove(cacheKey);
        }
        if (list != null) {
            if (v.f27911b) {
                v.e("Releasing %d waiting requests for cacheKey=%s.", Integer.valueOf(list.size()), cacheKey);
            }
            Iterator it = list.iterator();
            while (it.hasNext()) {
                this.f27920b.a((n) it.next(), pVar);
            }
        }
    }

    @Override // com.android.volley.n.b
    public synchronized void b(n nVar) {
        BlockingQueue blockingQueue;
        try {
            String cacheKey = nVar.getCacheKey();
            List list = (List) this.f27919a.remove(cacheKey);
            if (list != null && !list.isEmpty()) {
                if (v.f27911b) {
                    v.e("%d waiting requests for cacheKey=%s; resend to network", Integer.valueOf(list.size()), cacheKey);
                }
                n nVar2 = (n) list.remove(0);
                this.f27919a.put(cacheKey, list);
                nVar2.setNetworkRequestCompleteListener(this);
                o oVar = this.f27921c;
                if (oVar != null) {
                    oVar.f(nVar2);
                } else if (this.f27922d != null && (blockingQueue = this.f27923e) != null) {
                    try {
                        blockingQueue.put(nVar2);
                    } catch (InterruptedException e10) {
                        v.c("Couldn't add request to queue. %s", e10.toString());
                        Thread.currentThread().interrupt();
                        this.f27922d.d();
                    }
                }
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    synchronized boolean c(n nVar) {
        try {
            String cacheKey = nVar.getCacheKey();
            if (!this.f27919a.containsKey(cacheKey)) {
                this.f27919a.put(cacheKey, null);
                nVar.setNetworkRequestCompleteListener(this);
                if (v.f27911b) {
                    v.b("new request, sending to network %s", cacheKey);
                }
                return false;
            }
            List arrayList = (List) this.f27919a.get(cacheKey);
            if (arrayList == null) {
                arrayList = new ArrayList();
            }
            nVar.addMarker("waiting-for-response");
            arrayList.add(nVar);
            this.f27919a.put(cacheKey, arrayList);
            if (v.f27911b) {
                v.b("Request for cacheKey=%s is in flight, putting on hold.", cacheKey);
            }
            return true;
        } catch (Throwable th) {
            throw th;
        }
    }
}
