package U5;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public class C {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final Class f13111b = C.class;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Map f13112a = new HashMap();

    private C() {
    }

    public static C d() {
        return new C();
    }

    private synchronized void e() {
        W4.a.y(f13111b, "Count = %d", Integer.valueOf(this.f13112a.size()));
    }

    public void a() {
        ArrayList arrayList;
        synchronized (this) {
            arrayList = new ArrayList(this.f13112a.values());
            this.f13112a.clear();
        }
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            p025b6.k kVar = (p025b6.k) arrayList.get(i10);
            if (kVar != null) {
                kVar.close();
            }
        }
    }

    public synchronized boolean b(P4.d dVar) {
        V4.k.g(dVar);
        if (!this.f13112a.containsKey(dVar)) {
            return false;
        }
        p025b6.k kVar = (p025b6.k) this.f13112a.get(dVar);
        synchronized (kVar) {
            if (p025b6.k.F(kVar)) {
                return true;
            }
            this.f13112a.remove(dVar);
            W4.a.G(f13111b, "Found closed reference %d for key %s (%d)", Integer.valueOf(System.identityHashCode(kVar)), dVar.a(), Integer.valueOf(System.identityHashCode(dVar)));
            return false;
        }
    }

    public synchronized p025b6.k c(P4.d dVar) {
        V4.k.g(dVar);
        p025b6.k kVarB = (p025b6.k) this.f13112a.get(dVar);
        if (kVarB != null) {
            synchronized (kVarB) {
                if (!p025b6.k.F(kVarB)) {
                    this.f13112a.remove(dVar);
                    W4.a.G(f13111b, "Found closed reference %d for key %s (%d)", Integer.valueOf(System.identityHashCode(kVarB)), dVar.a(), Integer.valueOf(System.identityHashCode(dVar)));
                    return null;
                }
                kVarB = p025b6.k.b(kVarB);
            }
        }
        return kVarB;
    }

    public synchronized void f(P4.d dVar, p025b6.k kVar) {
        V4.k.g(dVar);
        V4.k.b(Boolean.valueOf(p025b6.k.F(kVar)));
        p025b6.k.c((p025b6.k) this.f13112a.put(dVar, p025b6.k.b(kVar)));
        e();
    }

    public boolean g(P4.d dVar) {
        p025b6.k kVar;
        V4.k.g(dVar);
        synchronized (this) {
            kVar = (p025b6.k) this.f13112a.remove(dVar);
        }
        if (kVar == null) {
            return false;
        }
        try {
            return kVar.z();
        } finally {
            kVar.close();
        }
    }

    public synchronized boolean h(P4.d dVar, p025b6.k kVar) {
        V4.k.g(dVar);
        V4.k.g(kVar);
        V4.k.b(Boolean.valueOf(p025b6.k.F(kVar)));
        p025b6.k kVar2 = (p025b6.k) this.f13112a.get(dVar);
        if (kVar2 == null) {
            return false;
        }
        Z4.a aVarE = kVar2.e();
        Z4.a aVarE2 = kVar.e();
        if (aVarE != null && aVarE2 != null) {
            try {
                if (aVarE.m() == aVarE2.m()) {
                    this.f13112a.remove(dVar);
                    Z4.a.g(aVarE2);
                    Z4.a.g(aVarE);
                    p025b6.k.c(kVar2);
                    e();
                    return true;
                }
            } catch (Throwable th) {
                Z4.a.g(aVarE2);
                Z4.a.g(aVarE);
                p025b6.k.c(kVar2);
                throw th;
            }
        }
        Z4.a.g(aVarE2);
        Z4.a.g(aVarE);
        p025b6.k.c(kVar2);
        return false;
    }
}
