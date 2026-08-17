package Q4;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes.dex */
public class g implements k, S4.a {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private static final Class f9420r = g.class;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private static final long f9421s = TimeUnit.HOURS.toMillis(2);

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private static final long f9422t = TimeUnit.MINUTES.toMillis(30);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final long f9423a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final long f9424b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final CountDownLatch f9425c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private long f9426d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final P4.c f9427e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    final Set f9428f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private long f9429g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final long f9430h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final p006a5.a f9431i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final f f9432j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final j f9433k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final P4.a f9434l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final boolean f9435m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final b f9436n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final p042c5.a f9437o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private final Object f9438p = new Object();

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private boolean f9439q;

    class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            synchronized (g.this.f9438p) {
                g.this.p();
            }
            g.this.f9439q = true;
            g.this.f9425c.countDown();
        }
    }

    static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private boolean f9441a = false;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private long f9442b = -1;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private long f9443c = -1;

        b() {
        }

        public synchronized long a() {
            return this.f9443c;
        }

        public synchronized long b() {
            return this.f9442b;
        }

        public synchronized void c(long j10, long j11) {
            if (this.f9441a) {
                this.f9442b += j10;
                this.f9443c += j11;
            }
        }

        public synchronized boolean d() {
            return this.f9441a;
        }

        public synchronized void e() {
            this.f9441a = false;
            this.f9443c = -1L;
            this.f9442b = -1L;
        }

        public synchronized void f(long j10, long j11) {
            this.f9443c = j11;
            this.f9442b = j10;
            this.f9441a = true;
        }
    }

    public static class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final long f9444a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final long f9445b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final long f9446c;

        public c(long j10, long j11, long j12) {
            this.f9444a = j10;
            this.f9445b = j11;
            this.f9446c = j12;
        }
    }

    public g(f fVar, j jVar, c cVar, P4.c cVar2, P4.a aVar, S4.b bVar, Executor executor, boolean z10) {
        this.f9423a = cVar.f9445b;
        long j10 = cVar.f9446c;
        this.f9424b = j10;
        this.f9426d = j10;
        this.f9431i = p006a5.a.d();
        this.f9432j = fVar;
        this.f9433k = jVar;
        this.f9429g = -1L;
        this.f9427e = cVar2;
        this.f9430h = cVar.f9444a;
        this.f9434l = aVar;
        this.f9436n = new b();
        this.f9437o = p042c5.d.a();
        this.f9435m = z10;
        this.f9428f = new HashSet();
        if (bVar != null) {
            bVar.a(this);
        }
        if (!z10) {
            this.f9425c = new CountDownLatch(0);
        } else {
            this.f9425c = new CountDownLatch(1);
            executor.execute(new a());
        }
    }

    private O4.a l(f.b bVar, P4.d dVar, String str) {
        O4.a aVarA;
        synchronized (this.f9438p) {
            aVarA = bVar.A(dVar);
            this.f9428f.add(str);
            this.f9436n.c(aVarA.size(), 1L);
        }
        return aVarA;
    }

    private void m(long j10, P4.c.a aVar) throws IOException {
        try {
            Collection<f.a> collectionN = n(this.f9432j.h());
            long jB = this.f9436n.b();
            long j11 = jB - j10;
            int i10 = 0;
            long j12 = 0;
            for (f.a aVar2 : collectionN) {
                if (j12 > j11) {
                    break;
                }
                long jC = this.f9432j.c(aVar2);
                this.f9428f.remove(aVar2.getId());
                if (jC > 0) {
                    i10++;
                    j12 += jC;
                    l lVarE = l.a().j(aVar2.getId()).g(aVar).i(jC).f(jB - j12).e(j10);
                    P4.c cVar = this.f9427e;
                    if (cVar != null) {
                        cVar.e(lVarE);
                    }
                    lVarE.b();
                }
            }
            this.f9436n.c(-j12, -i10);
            this.f9432j.b();
        } catch (IOException e10) {
            this.f9434l.a(P4.a.EnumC0147a.EVICTION, f9420r, "evictAboveSize: " + e10.getMessage(), e10);
            throw e10;
        }
    }

    private Collection n(Collection collection) {
        long jNow = this.f9437o.now() + f9421s;
        ArrayList arrayList = new ArrayList(collection.size());
        ArrayList arrayList2 = new ArrayList(collection.size());
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            f.a aVar = (f.a) it.next();
            if (aVar.b() > jNow) {
                arrayList.add(aVar);
            } else {
                arrayList2.add(aVar);
            }
        }
        Collections.sort(arrayList2, this.f9433k.get());
        arrayList.addAll(arrayList2);
        return arrayList;
    }

    private void o() {
        synchronized (this.f9438p) {
            try {
                boolean zP = p();
                s();
                long jB = this.f9436n.b();
                if (jB > this.f9426d && !zP) {
                    this.f9436n.e();
                    p();
                }
                long j10 = this.f9426d;
                if (jB > j10) {
                    m((j10 * 9) / 10, P4.c.a.CACHE_FULL);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean p() {
        long jNow = this.f9437o.now();
        if (this.f9436n.d()) {
            long j10 = this.f9429g;
            if (j10 != -1 && jNow - j10 <= f9422t) {
                return false;
            }
        }
        return q();
    }

    private boolean q() {
        boolean z10;
        long j10;
        long jNow = this.f9437o.now();
        long j11 = f9421s + jNow;
        Set hashSet = (this.f9435m && this.f9428f.isEmpty()) ? this.f9428f : this.f9435m ? new HashSet() : null;
        try {
            long jA = 0;
            long jMax = -1;
            int iA = 0;
            boolean z11 = false;
            int i10 = 0;
            int i11 = 0;
            z10 = false;
            for (f.a aVar : this.f9432j.h()) {
                try {
                    i10++;
                    jA += aVar.a();
                    if (aVar.b() > j11) {
                        i11++;
                        iA = (int) (((long) iA) + aVar.a());
                        j10 = j11;
                        jMax = Math.max(aVar.b() - jNow, jMax);
                        z11 = true;
                    } else {
                        j10 = j11;
                        if (this.f9435m) {
                            V4.k.g(hashSet);
                            hashSet.add(aVar.getId());
                        }
                    }
                    j11 = j10;
                } catch (IOException e10) {
                    e = e10;
                    this.f9434l.a(P4.a.EnumC0147a.GENERIC_IO, f9420r, "calcFileCacheSize: " + e.getMessage(), e);
                    return z10;
                }
            }
            if (z11) {
                this.f9434l.a(P4.a.EnumC0147a.READ_INVALID_ENTRY, f9420r, "Future timestamp found in " + i11 + " files , with a total size of " + iA + " bytes, and a maximum time delta of " + jMax + "ms", null);
            }
            long j12 = i10;
            if (this.f9436n.a() != j12 || this.f9436n.b() != jA) {
                if (this.f9435m && this.f9428f != hashSet) {
                    V4.k.g(hashSet);
                    this.f9428f.clear();
                    this.f9428f.addAll(hashSet);
                }
                this.f9436n.f(jA, j12);
            }
            this.f9429g = jNow;
            return true;
        } catch (IOException e11) {
            e = e11;
            z10 = false;
        }
    }

    private f.b r(String str, P4.d dVar) {
        o();
        return this.f9432j.e(str, dVar);
    }

    private void s() {
        if (this.f9431i.f(this.f9432j.isExternal() ? p006a5.a.EnumC0244a.EXTERNAL : p006a5.a.EnumC0244a.INTERNAL, this.f9424b - this.f9436n.b())) {
            this.f9426d = this.f9423a;
        } else {
            this.f9426d = this.f9424b;
        }
    }

    @Override // Q4.k
    public void a() {
        synchronized (this.f9438p) {
            try {
                this.f9432j.a();
                this.f9428f.clear();
                P4.c cVar = this.f9427e;
                if (cVar != null) {
                    cVar.f();
                }
            } catch (IOException | NullPointerException e10) {
                this.f9434l.a(P4.a.EnumC0147a.EVICTION, f9420r, "clearAll: " + e10.getMessage(), e10);
            }
            this.f9436n.e();
        }
    }

    @Override // Q4.k
    public boolean b(P4.d dVar) throws Throwable {
        String str;
        IOException e10;
        String str2 = null;
        try {
            try {
                synchronized (this.f9438p) {
                    try {
                        List listB = P4.e.b(dVar);
                        int i10 = 0;
                        while (i10 < listB.size()) {
                            String str3 = (String) listB.get(i10);
                            if (this.f9432j.d(str3, dVar)) {
                                this.f9428f.add(str3);
                                return true;
                            }
                            i10++;
                            str2 = str3;
                        }
                        return false;
                    } catch (Throwable th) {
                        str = str2;
                        th = th;
                        try {
                            throw th;
                        } catch (IOException e11) {
                            e10 = e11;
                            l lVarH = l.a().d(dVar).j(str).h(e10);
                            P4.c cVar = this.f9427e;
                            if (cVar != null) {
                                cVar.b(lVarH);
                            }
                            lVarH.b();
                            return false;
                        }
                    }
                }
            } catch (Throwable th2) {
                th = th2;
            }
        } catch (IOException e12) {
            str = null;
            e10 = e12;
        }
    }

    @Override // Q4.k
    public O4.a c(P4.d dVar, P4.j jVar) {
        String strA;
        l lVarD = l.a().d(dVar);
        P4.c cVar = this.f9427e;
        if (cVar != null) {
            cVar.d(lVarD);
        }
        synchronized (this.f9438p) {
            strA = P4.e.a(dVar);
        }
        lVarD.j(strA);
        try {
            try {
                f.b bVarR = r(strA, dVar);
                try {
                    bVarR.z(jVar, dVar);
                    O4.a aVarL = l(bVarR, dVar, strA);
                    lVarD.i(aVarL.size()).f(this.f9436n.b());
                    P4.c cVar2 = this.f9427e;
                    if (cVar2 != null) {
                        cVar2.c(lVarD);
                    }
                    if (!bVarR.y()) {
                        W4.a.i(f9420r, "Failed to delete temp file");
                    }
                    lVarD.b();
                    return aVarL;
                } catch (Throwable th) {
                    if (!bVarR.y()) {
                        W4.a.i(f9420r, "Failed to delete temp file");
                    }
                    throw th;
                }
            } catch (IOException e10) {
                lVarD.h(e10);
                P4.c cVar3 = this.f9427e;
                if (cVar3 != null) {
                    cVar3.g(lVarD);
                }
                W4.a.j(f9420r, "Failed inserting a file into the cache", e10);
                throw e10;
            }
        } catch (Throwable th2) {
            lVarD.b();
            throw th2;
        }
    }

    @Override // Q4.k
    public boolean d(P4.d dVar) {
        synchronized (this.f9438p) {
            if (e(dVar)) {
                return true;
            }
            try {
                List listB = P4.e.b(dVar);
                for (int i10 = 0; i10 < listB.size(); i10++) {
                    String str = (String) listB.get(i10);
                    if (this.f9432j.f(str, dVar)) {
                        this.f9428f.add(str);
                        return true;
                    }
                }
                return false;
            } catch (IOException unused) {
                return false;
            }
        }
    }

    @Override // Q4.k
    public boolean e(P4.d dVar) {
        synchronized (this.f9438p) {
            try {
                List listB = P4.e.b(dVar);
                for (int i10 = 0; i10 < listB.size(); i10++) {
                    if (this.f9428f.contains((String) listB.get(i10))) {
                        return true;
                    }
                }
                return false;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // Q4.k
    public O4.a f(P4.d dVar) {
        O4.a aVarG;
        l lVarD = l.a().d(dVar);
        try {
            try {
                synchronized (this.f9438p) {
                    try {
                        List listB = P4.e.b(dVar);
                        String str = null;
                        aVarG = null;
                        for (int i10 = 0; i10 < listB.size(); i10++) {
                            str = (String) listB.get(i10);
                            lVarD.j(str);
                            aVarG = this.f9432j.g(str, dVar);
                            if (aVarG != null) {
                                break;
                            }
                        }
                        if (aVarG == null) {
                            P4.c cVar = this.f9427e;
                            if (cVar != null) {
                                cVar.a(lVarD);
                            }
                            this.f9428f.remove(str);
                        } else {
                            V4.k.g(str);
                            P4.c cVar2 = this.f9427e;
                            if (cVar2 != null) {
                                cVar2.h(lVarD);
                            }
                            this.f9428f.add(str);
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                lVarD.b();
                return aVarG;
            } catch (IOException e10) {
                this.f9434l.a(P4.a.EnumC0147a.GENERIC_IO, f9420r, "getResource", e10);
                lVarD.h(e10);
                P4.c cVar3 = this.f9427e;
                if (cVar3 != null) {
                    cVar3.b(lVarD);
                }
                lVarD.b();
                return null;
            }
        } catch (Throwable th2) {
            lVarD.b();
            throw th2;
        }
    }

    @Override // Q4.k
    public void g(P4.d dVar) {
        synchronized (this.f9438p) {
            try {
                List listB = P4.e.b(dVar);
                for (int i10 = 0; i10 < listB.size(); i10++) {
                    String str = (String) listB.get(i10);
                    this.f9432j.remove(str);
                    this.f9428f.remove(str);
                }
            } catch (IOException e10) {
                this.f9434l.a(P4.a.EnumC0147a.DELETE_FILE, f9420r, "delete: " + e10.getMessage(), e10);
            }
        }
    }
}
