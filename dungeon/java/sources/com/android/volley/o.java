package com.android.volley;

import android.os.Handler;
import android.os.Looper;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes.dex */
public class o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final AtomicInteger f27893a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Set f27894b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final PriorityBlockingQueue f27895c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final PriorityBlockingQueue f27896d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final b f27897e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final h f27898f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final q f27899g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final i[] f27900h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private c f27901i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final List f27902j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final List f27903k;

    public o(b bVar, h hVar) {
        this(bVar, hVar, 4);
    }

    public o(b bVar, h hVar, int i10) {
        this(bVar, hVar, i10, new f(new Handler(Looper.getMainLooper())));
    }

    public o(b bVar, h hVar, int i10, q qVar) {
        this.f27893a = new AtomicInteger();
        this.f27894b = new HashSet();
        this.f27895c = new PriorityBlockingQueue();
        this.f27896d = new PriorityBlockingQueue();
        this.f27902j = new ArrayList();
        this.f27903k = new ArrayList();
        this.f27897e = bVar;
        this.f27898f = hVar;
        this.f27900h = new i[i10];
        this.f27899g = qVar;
    }

    public n a(n nVar) {
        nVar.setRequestQueue(this);
        synchronized (this.f27894b) {
            this.f27894b.add(nVar);
        }
        nVar.setSequence(d());
        nVar.addMarker("add-to-queue");
        e(nVar, 0);
        b(nVar);
        return nVar;
    }

    void b(n nVar) {
        if (nVar.shouldCache()) {
            this.f27895c.add(nVar);
        } else {
            f(nVar);
        }
    }

    void c(n nVar) {
        synchronized (this.f27894b) {
            this.f27894b.remove(nVar);
        }
        synchronized (this.f27902j) {
            Iterator it = this.f27902j.iterator();
            if (it.hasNext()) {
                android.support.v4.media.session.b.a(it.next());
                throw null;
            }
        }
        e(nVar, 5);
    }

    public int d() {
        return this.f27893a.incrementAndGet();
    }

    void e(n nVar, int i10) {
        synchronized (this.f27903k) {
            try {
                Iterator it = this.f27903k.iterator();
                if (it.hasNext()) {
                    android.support.v4.media.session.b.a(it.next());
                    throw null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    void f(n nVar) {
        this.f27896d.add(nVar);
    }

    public void g() {
        h();
        c cVar = new c(this.f27895c, this.f27896d, this.f27897e, this.f27899g);
        this.f27901i = cVar;
        cVar.start();
        for (int i10 = 0; i10 < this.f27900h.length; i10++) {
            i iVar = new i(this.f27896d, this.f27898f, this.f27897e, this.f27899g);
            this.f27900h[i10] = iVar;
            iVar.start();
        }
    }

    public void h() {
        c cVar = this.f27901i;
        if (cVar != null) {
            cVar.d();
        }
        for (i iVar : this.f27900h) {
            if (iVar != null) {
                iVar.e();
            }
        }
    }
}
