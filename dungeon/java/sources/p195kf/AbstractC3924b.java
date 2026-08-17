package p195kf;

import androidx.concurrent.futures.b;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: kf.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC3924b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final /* synthetic */ AtomicReferenceFieldUpdater f48138a = AtomicReferenceFieldUpdater.newUpdater(AbstractC3924b.class, Object.class, "_next$volatile");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final /* synthetic */ AtomicReferenceFieldUpdater f48139b = AtomicReferenceFieldUpdater.newUpdater(AbstractC3924b.class, Object.class, "_prev$volatile");
    private volatile /* synthetic */ Object _next$volatile;
    private volatile /* synthetic */ Object _prev$volatile;

    public AbstractC3924b(AbstractC3924b abstractC3924b) {
        this._prev$volatile = abstractC3924b;
    }

    private final AbstractC3924b d() {
        AbstractC3924b abstractC3924bH = h();
        while (abstractC3924bH != null && abstractC3924bH.k()) {
            abstractC3924bH = (AbstractC3924b) f48139b.get(abstractC3924bH);
        }
        return abstractC3924bH;
    }

    private final AbstractC3924b e() {
        AbstractC3924b abstractC3924bF;
        AbstractC3924b abstractC3924bF2 = f();
        Intrinsics.c(abstractC3924bF2);
        while (abstractC3924bF2.k() && (abstractC3924bF = abstractC3924bF2.f()) != null) {
            abstractC3924bF2 = abstractC3924bF;
        }
        return abstractC3924bF2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object g() {
        return f48138a.get(this);
    }

    public final void c() {
        f48139b.set(this, null);
    }

    public final AbstractC3924b f() {
        Object objG = g();
        if (objG == AbstractC3923a.f48137a) {
            return null;
        }
        return (AbstractC3924b) objG;
    }

    public final AbstractC3924b h() {
        return (AbstractC3924b) f48139b.get(this);
    }

    public abstract boolean k();

    public final boolean l() {
        return f() == null;
    }

    public final boolean m() {
        return b.a(f48138a, this, null, AbstractC3923a.f48137a);
    }

    public final void n() {
        Object obj;
        if (l()) {
            return;
        }
        while (true) {
            AbstractC3924b abstractC3924bD = d();
            AbstractC3924b abstractC3924bE = e();
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f48139b;
            do {
                obj = atomicReferenceFieldUpdater.get(abstractC3924bE);
            } while (!b.a(atomicReferenceFieldUpdater, abstractC3924bE, obj, ((AbstractC3924b) obj) == null ? null : abstractC3924bD));
            if (abstractC3924bD != null) {
                f48138a.set(abstractC3924bD, abstractC3924bE);
            }
            if (!abstractC3924bE.k() || abstractC3924bE.l()) {
                if (abstractC3924bD == null || !abstractC3924bD.k()) {
                    return;
                }
            }
        }
    }

    public final boolean o(AbstractC3924b abstractC3924b) {
        return b.a(f48138a, this, null, abstractC3924b);
    }
}
