package p231mf;

import androidx.concurrent.futures.b;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.jvm.internal.E;

/* JADX INFO: loaded from: classes3.dex */
public final class l {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final /* synthetic */ AtomicReferenceFieldUpdater f49348b = AtomicReferenceFieldUpdater.newUpdater(l.class, Object.class, "lastScheduledTask$volatile");

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final /* synthetic */ AtomicIntegerFieldUpdater f49349c = AtomicIntegerFieldUpdater.newUpdater(l.class, "producerIndex$volatile");

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final /* synthetic */ AtomicIntegerFieldUpdater f49350d = AtomicIntegerFieldUpdater.newUpdater(l.class, "consumerIndex$volatile");

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final /* synthetic */ AtomicIntegerFieldUpdater f49351e = AtomicIntegerFieldUpdater.newUpdater(l.class, "blockingTasksInBuffer$volatile");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final AtomicReferenceArray f49352a = new AtomicReferenceArray(128);
    private volatile /* synthetic */ int blockingTasksInBuffer$volatile;
    private volatile /* synthetic */ int consumerIndex$volatile;
    private volatile /* synthetic */ Object lastScheduledTask$volatile;
    private volatile /* synthetic */ int producerIndex$volatile;

    private final h b(h hVar) {
        if (e() == 127) {
            return hVar;
        }
        if (hVar.f49339b) {
            f49351e.incrementAndGet(this);
        }
        int i10 = f49349c.get(this) & 127;
        while (this.f49352a.get(i10) != null) {
            Thread.yield();
        }
        this.f49352a.lazySet(i10, hVar);
        f49349c.incrementAndGet(this);
        return null;
    }

    private final void c(h hVar) {
        if (hVar == null || !hVar.f49339b) {
            return;
        }
        f49351e.decrementAndGet(this);
    }

    private final int e() {
        return f49349c.get(this) - f49350d.get(this);
    }

    private final h m() {
        h hVar;
        while (true) {
            int i10 = f49350d.get(this);
            if (i10 - f49349c.get(this) == 0) {
                return null;
            }
            int i11 = i10 & 127;
            if (f49350d.compareAndSet(this, i10, i10 + 1) && (hVar = (h) this.f49352a.getAndSet(i11, null)) != null) {
                c(hVar);
                return hVar;
            }
        }
    }

    private final boolean n(d dVar) {
        h hVarM = m();
        if (hVarM == null) {
            return false;
        }
        dVar.a(hVarM);
        return true;
    }

    private final h o(boolean z10) {
        h hVar;
        do {
            hVar = (h) f49348b.get(this);
            if (hVar == null || hVar.f49339b != z10) {
                int i10 = f49350d.get(this);
                int i11 = f49349c.get(this);
                while (i10 != i11) {
                    if (z10 && f49351e.get(this) == 0) {
                        return null;
                    }
                    i11--;
                    h hVarQ = q(i11, z10);
                    if (hVarQ != null) {
                        return hVarQ;
                    }
                }
                return null;
            }
        } while (!b.a(f49348b, this, hVar, null));
        return hVar;
    }

    private final h p(int i10) {
        int i11 = f49350d.get(this);
        int i12 = f49349c.get(this);
        boolean z10 = i10 == 1;
        while (i11 != i12) {
            if (z10 && f49351e.get(this) == 0) {
                return null;
            }
            int i13 = i11 + 1;
            h hVarQ = q(i11, z10);
            if (hVarQ != null) {
                return hVarQ;
            }
            i11 = i13;
        }
        return null;
    }

    private final h q(int i10, boolean z10) {
        int i11 = i10 & 127;
        h hVar = (h) this.f49352a.get(i11);
        if (hVar == null || hVar.f49339b != z10 || !p124gf.l.a(this.f49352a, i11, hVar, null)) {
            return null;
        }
        if (z10) {
            f49351e.decrementAndGet(this);
        }
        return hVar;
    }

    private final long s(int i10, E e10) {
        h hVar;
        do {
            hVar = (h) f49348b.get(this);
            if (hVar == null) {
                return -2L;
            }
            if (((hVar.f49339b ? 1 : 2) & i10) == 0) {
                return -2L;
            }
            long jA = j.f49346f.a() - hVar.f49338a;
            long j10 = j.f49342b;
            if (jA < j10) {
                return j10 - jA;
            }
        } while (!b.a(f49348b, this, hVar, null));
        e10.f48338a = hVar;
        return -1L;
    }

    public final h a(h hVar, boolean z10) {
        if (z10) {
            return b(hVar);
        }
        h hVar2 = (h) f49348b.getAndSet(this, hVar);
        if (hVar2 == null) {
            return null;
        }
        return b(hVar2);
    }

    public final int i() {
        return f49348b.get(this) != null ? e() + 1 : e();
    }

    public final void j(d dVar) {
        h hVar = (h) f49348b.getAndSet(this, null);
        if (hVar != null) {
            dVar.a(hVar);
        }
        while (n(dVar)) {
        }
    }

    public final h k() {
        h hVar = (h) f49348b.getAndSet(this, null);
        return hVar == null ? m() : hVar;
    }

    public final h l() {
        return o(true);
    }

    public final long r(int i10, E e10) {
        h hVarM = i10 == 3 ? m() : p(i10);
        if (hVarM == null) {
            return s(i10, e10);
        }
        e10.f48338a = hVarM;
        return -1L;
    }
}
